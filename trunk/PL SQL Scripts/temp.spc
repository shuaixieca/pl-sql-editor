create or replace package body pck_aus_dokument is

  -------------------------------getloeschenlink------------------------------
  function getloeschenlink(p_dok_id     number
                          ,p_dok_typ    number
                          ,p_status     varchar2
                          ,p_rechtesatz number
                          ,p_aktiv      varchar2 default 'J')
    return tp_command is
    v_dok_id       tp_commandparam;
    v_com_loeschen tp_command;
  begin
    v_com_loeschen           := tp_command(typ => pck_framework_utils.c_command_type_link);
    v_com_loeschen.nam       := pck_framework_utils.c_link_name_loeschen;
    v_com_loeschen.msgid     := 1076;
    v_com_loeschen.tooltipid := 1076;
  
    if pck_rechte_utils.Check_Recht(p_rechtesatz     => p_rechtesatz
                                   ,p_obj_typ_id     => p_dok_typ
                                   ,p_obj_status_old => p_status
                                   ,p_operation      => pck_framework_utils.c_recht_loesch) is not null then
      -- an dieser Stelle kann Status nur 'AJ' sein, 
      -- weil die publizierte Dokumente (mit dem Status 'PN') nicht gelöscht werden dürfen
      -- soll das Statement einmal nicht mehr gültig werden - Eingriff nötig!!!
      v_dok_id     := tp_commandparam(typ => pck_framework_utils.c_param_type_hidden);
      v_dok_id.nam := 'p_dok_id';
      v_dok_id.val := p_dok_id;
    
      v_com_loeschen.params    := tp_commandparamtab(v_dok_id);
      v_com_loeschen.autostore := 'J';
    
      -- vbel: beim löschen eines dokus wird nun evtl. eine sicherheits-abfrage eingebaut
      if pck_user_info.willUser_Sifra(pck_user_info.c_bestaet_Loeschen) then
        v_com_loeschen.target := pck_framework_utils.c_frame_contentmain;
        if p_aktiv = 'J' then
          v_com_loeschen.action := pck_aus_dokument.c_package_name || '.' ||
                                   pck_aus_dokument.c_proc_aus_dok_delete_ask;
          v_com_loeschen.msgid  := 249;
        else
          v_com_loeschen.msgid := 1076;
        end if;
      else
        v_com_loeschen.target := pck_framework_utils.c_frame_f_contentmain;
        if p_aktiv = 'J' then
          v_com_loeschen.action := pck_aus_dokument.c_package_name || '.' ||
                                   pck_aus_dokument.c_proc_aus_dok_delete;
          v_com_loeschen.msgid  := 249;
        else
          v_com_loeschen.msgid := 1076;
        end if;
      end if;
    
    end if;
    return v_com_loeschen;
  end;

  -------------------------------geteditlink------------------------------
  function geteditlink(p_dok_id  number
                      ,p_dok_typ number
                      ,p_status  varchar2
                       --,p_aus_id     number default null
                      ,p_rechtesatz number
                      ,p_aktiv      varchar2 default 'J') return tp_command is
    v_dok_id   tp_commandparam;
    v_neu      tp_commandparam;
    v_com_edit tp_command;
    --v_aus_id   tp_commandparam;
  begin
    v_com_edit           := tp_command(typ => pck_framework_utils.c_command_type_link);
    v_com_edit.nam       := pck_framework_utils.c_link_name_bearbeiten;
    v_com_edit.msgid     := 15778;
    v_com_edit.tooltipid := 15778;
  
    --Ab jetzt haben wir mehrere Applikationen, die dieses Paket aufrufen
    -- SL: ja, das ist richtig, beim Aufruf aus dem Projektbrowser muß im ContextMenü VU-Zusammenstellung
    -- dranhängen, da es ein CrossApplicationLink ist.
    if blockbasta.pkg_dispatcher.g_applid !=
       pck_framework_utils.c_appl_angeb_abgabe then
      v_com_edit.applid := pck_framework_utils.c_appl_vu_zusammen;
    else
      v_com_edit.applid := blockbasta.pkg_dispatcher.g_applid;
    end if;
    v_com_edit.appl_obj := p_dok_id;
    if pck_rechte_utils.Check_Recht(p_rechtesatz     => p_rechtesatz
                                   ,p_obj_typ_id     => p_dok_typ
                                   ,p_obj_status_old => p_status
                                   ,p_operation      => pck_framework_utils.c_recht_umbenennen) is not null then
      -- c_recht_bearb
      v_dok_id     := tp_commandparam(typ => pck_framework_utils.c_param_type_hidden);
      v_dok_id.nam := 'p_dok_id';
      v_dok_id.val := p_dok_id;
    
      v_neu     := tp_commandparam(typ => pck_framework_utils.c_param_type_hidden);
      v_neu.nam := 'p_neu';
      v_neu.val := 'N';
    
      v_com_edit.target := pck_framework_utils.c_frame_f_contentmain;
      v_com_edit.params := tp_commandparamtab(v_dok_id, v_neu);
      --v_com_edit.autostore := 'J';
    
      --      if p_bool = 1 then
      if p_aktiv = 'J' then
        v_com_edit.msgid     := pck_proj_utils.getAktionMsgID(pck_framework_utils.c_recht_umbenennen);
        v_com_edit.tooltipid := v_com_edit.msgid;
        v_com_edit.action    := c_package_name || '.' ||
                                c_proc_f_aus_dok_zuord;
      end if;
    end if;
    return v_com_edit;
  end;

  -------------------------------------------------------------------------------
  --LBe 19_04_06
  procedure f_aus_dok_zuord(p_neu        varchar2 default 'J'
                           ,p_dok_id     number default null
                           ,p_obj_id     number default null --entweder Aus_id, oder kontaktid, oder Angebot                        
                           ,p_rechtesatz number default 0
                           ,p_error      tp_error default null
                           ,p_clob       out clob
                           ,p_long       out long) is
    -- jmi 17072005 
    -- Rechtesatz  = 0 meint: default - Rechte
    -- Rechtesatz != 0 meint: Rechtesatz kommt aus dem Baum (Projektbezogen)
    -- ausgewertet werden die Rechte erst an der Erzeugung der Links für edit und loeschen
    v_par_dok_id     tp_commandparam := tp_commandparam(typ => pck_framework_utils.c_param_type_hidden);
    v_par_obj_id     tp_commandparam := tp_commandparam(typ => pck_framework_utils.c_param_type_hidden);
    v_par_rechtesatz tp_commandparam := tp_commandparam(typ => pck_framework_utils.c_param_type_hidden);
    v_com_main       tp_command;
    v_com_right      tp_command;
    v_errtab         tp_errortab;
  
    v_comtab     tp_commandtab;
    v_obj_id     number := nvl(p_obj_id
                              ,blockbasta.pkg_dispatcher.g_appl_obj);
    v_ang_status t_aus_angebot.status%type;
  begin
  
    if p_dok_id is not null then
      select h.vu_aus_id
        into v_obj_id
        from t_vu_header h
       where h.vu_id = p_dok_id;
      blockbasta.pkg_dispatcher.g_appl_obj := v_obj_id;
    end if;
  
    if blockbasta.pkg_dispatcher.g_applid in
       (pck_framework_utils.c_appl_vu_zusammen,
        pck_framework_utils.c_appl_ausschreibung_light) then
      if v_obj_id = 0
         or
         (v_obj_id is not null and not
          pck_utils.existObject(p_obj_id   => v_obj_id
                                                         ,p_obj_type => pck_framework_utils.c_objTyp_Ausschreibung)) then
        -- SL 28062006: Bei Ausschreibung-Light muß eine andere Hinweismeldung kommen, da man das jetzt
        -- über das Cockpit starten kann.
        if blockbasta.pkg_dispatcher.g_applid =
           pck_framework_utils.c_appl_ausschreibung_light then
          pck_aus_light.f_proj_info(p_clob => p_clob, p_long => p_long);
        else
          --Zum Bearbeiten wählen Sie zuerst eine Ausschreibung aus.
          v_errtab := tp_errortab(tp_error(Num  => pck_framework_utils.c_err_info
                                          ,Text => pck_messagetext.getMessageText(p_msgid => 11868)));
          pck_proj_manag.dvn_f_mein_ordner(p_which_left => pck_proj_manag.c_Bauvorhaben --'projekt'
                                          ,p_errTab     => v_errtab
                                          ,p_clob       => p_clob
                                          ,p_long       => p_long);
        end if;
        blockbasta.pkg_dispatcher.g_condition := 'Error';
        return;
      end if;
    end if;
    if blockbasta.pkg_dispatcher.g_applid =
       pck_framework_utils.c_appl_angeb_abgabe then
      begin
        select pck_obj_status.getStatusCode(v_obj_id
                                           ,pck_framework_utils.c_objTyp_Angebot
                                           ,'J')
          into v_ang_status
          from t_aus_angebot t
         where t.ang_id = v_obj_id;
        if v_ang_status != pck_framework_utils.c_status_inArbeit then
          --Das Angebot kann nicht bearbeitet werden: Sie haben dafür keine Berechtigung oder der derzeitige Status erlaubt das nicht. 
          v_errtab := tp_errortab(tp_error(Num  => pck_framework_utils.c_err_info
                                          ,Text => pck_messagetext.getMessageText(p_msgid => 16614)));
        
          pck_proj_manag.dvn_f_mein_ordner(p_errTab => v_errtab
                                          ,p_clob   => p_clob
                                          ,p_long   => p_long);
          blockbasta.pkg_dispatcher.g_condition := 'Error';
          return;
        end if;
      exception
        when no_data_found then
          null;
      end;
    end if;
  
    v_par_dok_id.nam := 'p_dok_id';
    if p_neu = 'N' then
      v_par_dok_id.val := p_dok_id; -- ID des zu bearbeitenden Dokument, sonst NULL
    end if;
  
    v_par_obj_id.nam := 'p_obj_id';
    v_par_obj_id.val := v_obj_id; -- zu bearbeitende Ausschreibung oder Angebot oder weiterer Objekt
  
    v_par_rechtesatz.nam := 'p_rechtesatz';
    v_par_rechtesatz.val := p_rechtesatz;
  
    v_com_main        := tp_command(typ => pck_framework_utils.c_command_type_frame);
    v_com_main.target := pck_framework_utils.c_frame_contentmain;
    v_com_main.action := c_package_name || '.' || c_proc_aus_dok_mask;
    v_com_main.params := tp_commandparamtab(v_par_dok_id, v_par_obj_id);
  
    v_com_right        := tp_command(typ => pck_framework_utils.c_command_type_frame);
    v_com_right.target := pck_framework_utils.c_frame_contentright;
    v_com_right.action := c_package_name || '.' || c_proc_aus_dok_liste;
    v_com_right.params := tp_commandparamtab(v_par_dok_id
                                            ,v_par_obj_id
                                            ,v_par_rechtesatz);
  
    if blockbasta.pkg_dispatcher.g_applid in
       (pck_framework_utils.c_appl_stammdaten,
        pck_framework_utils.c_appl_adm_userdaten) then
      v_comtab := tp_commandtab(v_com_main);
    else
      v_comtab := tp_commandtab(v_com_main, v_com_right);
    end if;
  
    pck_framework_utils.getReturnHeadXML(p_err  => tp_errortab(p_error)
                                        ,p_cmd  => v_comtab
                                        ,p_tab  => null
                                        ,p_txt  => null
                                        ,p_pack => c_package_name
                                        ,p_proc => c_proc_f_aus_dok_zuord
                                        ,p_clob => p_clob
                                        ,p_long => p_long);
  end;
  ----------------------------------------------------------------------------------
  --LBe: obsolate
  -------------------------------f_aus_dok_zuord------------------------------
  /*procedure f_aus_dok_zuord(p_neu varchar2 default 'J'
                            -- den Parameter brauchen wir, um zu entscheiden, ob nach der Speicherung 
                            -- leere Maske für Dokument kommen soll oder mit den Doku-Daten
                           ,p_dok_id number default null
                           ,p_aus_id number default null
                            -- wenn aufruf aus Stammdatenn, dann p_aus_id wird als kontakt ID benutzt                           
                           ,p_rechtesatz number default 0
                           ,p_error      tp_error default null
                           ,p_clob       out clob
                           ,p_long       out long) is
    -- jmi 17072005 
    -- Rechtesatz  = 0 meint: default - Rechte
    -- Rechtesatz != 0 meint: Rechtesatz kommt aus dem Baum (Projektbezogen)
    -- ausgewertet werden die Rechte erst an der Erzeugung der Links für edit und loeschen
    v_par_dok_id tp_commandparam;
    v_par_aus_id tp_commandparam;
    v_cp_recht   tp_commandparam;
    v_com_main   tp_command;
    v_com_right  tp_command;
    v_errtab     tp_errortab;
  
    -- für den Zugriff aus der Application Stammdaten
    v_comtab tp_commandtab;
    v_aus_id number := nvl(p_aus_id, blockbasta.pkg_dispatcher.g_appl_obj);
  begin
    -- added by SL 20060123
    if p_dok_id is not null then
      select h.vu_aus_id
        into v_aus_id
        from t_vu_header h
       where h.vu_id = p_dok_id;
      blockbasta.pkg_dispatcher.g_appl_obj := v_aus_id;
    end if;
  
    -- dies wird die standardüberprüfung ab 07.07.05
    if v_aus_id = 0 then
      v_errtab := tp_errortab(tp_error(Num  => pck_framework_utils.c_err_info
                                      ,Text => pck_messagetext.getMessageText(p_msgid => 11868)));
      pck_proj_manag.dvn_f_mein_ordner(p_which_left => pck_proj_manag.c_Bauvorhaben --'projekt'
                                      ,p_errTab     => v_errtab
                                      ,p_clob       => p_clob
                                      ,p_long       => p_long);
    
      blockbasta.pkg_dispatcher.g_condition := 'Error';
      return;
    elsif not
           pck_utils.existObject(p_obj_id   => v_aus_id
                                ,p_obj_type => pck_framework_utils.c_objTyp_Ausschreibung)
          and v_aus_id is not null
          and blockbasta.pkg_dispatcher.g_applid in
          (pck_framework_utils.c_appl_vu_zusammen,
           pck_framework_utils.c_appl_ausschreibung_light) then
      v_errtab := tp_errortab(tp_error(Num  => pck_framework_utils.c_err_info
                                      ,Text => pck_messagetext.getMessageText(p_msgid => 11868)));
      pck_proj_manag.dvn_f_mein_ordner(p_which_left => pck_proj_manag.c_Bauvorhaben --'projekt'
                                      ,p_errTab     => v_errtab
                                      ,p_clob       => p_clob
                                      ,p_long       => p_long);
    
      blockbasta.pkg_dispatcher.g_condition := 'Error';
      return;
    end if;
  
    v_par_dok_id     := tp_commandparam(typ => pck_framework_utils.c_param_type_hidden);
    v_par_dok_id.nam := 'p_dok_id';
    if p_neu = 'N' then
      v_par_dok_id.val := p_dok_id; -- ID des zu bearbeitenden Dokument, sonst NULL
    end if;
  
    v_par_aus_id     := tp_commandparam(typ => pck_framework_utils.c_param_type_hidden);
    v_par_aus_id.nam := 'p_aus_id';
    v_par_aus_id.val := v_aus_id; -- zu bearbeitende Ausschreibung 
  
    v_cp_recht     := tp_commandparam(typ => pck_framework_utils.c_param_type_hidden);
    v_cp_recht.nam := 'p_rechtesatz';
    v_cp_recht.val := p_rechtesatz;
  
    v_com_main        := tp_command(typ => pck_framework_utils.c_command_type_frame);
    v_com_main.target := pck_framework_utils.c_frame_contentmain;
    v_com_main.action := c_package_name || '.' || c_proc_aus_dok_mask;
    v_com_main.params := tp_commandparamtab(v_par_dok_id, v_par_aus_id);
  
    v_com_right        := tp_command(typ => pck_framework_utils.c_command_type_frame);
    v_com_right.target := pck_framework_utils.c_frame_contentright;
    v_com_right.action := c_package_name || '.' || c_proc_aus_dok_liste;
    v_com_right.params := tp_commandparamtab(v_par_dok_id
                                            ,v_par_aus_id
                                            ,v_cp_recht);
  
    if blockbasta.pkg_dispatcher.g_applid in
       (pck_framework_utils.c_appl_stammdaten,
        pck_framework_utils.c_appl_adm_userdaten) then
      v_comtab := tp_commandtab(v_com_main);
    else
      v_comtab := tp_commandtab(v_com_main, v_com_right);
    end if;
  
    pck_framework_utils.getReturnHeadXML(p_err  => tp_errortab(p_error)
                                        ,p_cmd  => v_comtab
                                        ,p_tab  => null
                                        ,p_txt  => null
                                        ,p_pack => c_package_name
                                        ,p_proc => c_proc_f_aus_dok_zuord
                                        ,p_clob => p_clob
                                        ,p_long => p_long);
  end;*/
  ----------------------------------------------------------------------------
  --LBe
  procedure aus_dok_mask(p_dok_id number default null
                        ,p_obj_id number
                        ,p_clob   out clob
                        ,p_long   out long) is
    -- ID des Dokuments, NULL wenn neu, sonst mit Wert                   
    v_par_dok_id   tp_commandparam := tp_commandparam(typ => pck_framework_utils.c_param_type_hidden);
    v_par_obj_id   tp_commandparam := tp_commandparam(typ => pck_framework_utils.c_param_type_hidden);
    v_par_titel    tp_commandparam;
    v_par_doku_art tp_commandparam;
    v_par_register tp_commandparam;
    v_par_seiten   tp_commandparam;
    v_par_format   tp_commandparam;
    v_par_farbe    tp_commandparam;
    v_par_dokument tp_commandparam;
    v_par_filename tp_commandparam;
  
    v_com_speichern tp_commandparam := tp_commandparam(typ => pck_framework_utils.c_param_type_submit);
    v_com_abbrechen tp_command := tp_command(typ => pck_framework_utils.c_command_type_link);
    v_com_form      tp_command;
  
    v_txttab tp_texttab;
  
    v_obj_name   t_objekt_baum.obj_titel%type;
    v_sd_name    t_sd_kontakt.bezeichnung%type;
    v_file_name  t_vu_header.vu_file_name%type;
    v_file_type  t_vu_header.vu_file_type%type;
    v_user       t_vu_header.vu_sysuser_id%type;
    v_lastchange t_vu_header.vu_lastchange%type;
    v_obj_typ    number;
  
    v_paramstab tp_commandparamtab;
  
  begin
    case
      when blockbasta.pkg_dispatcher.g_applid in
           (pck_framework_utils.c_appl_stammdaten,
            pck_framework_utils.c_appl_adm_userdaten) then
        v_obj_typ := pck_framework_utils.c_objTyp_Kontakt;
        select t.bezeichnung
          into v_obj_name
          from t_sd_kontakt t
         where t.kontaktid = p_obj_id;
      when blockbasta.pkg_dispatcher.g_applid in
           (pck_framework_utils.c_appl_vu_zusammen,
            pck_framework_utils.c_appl_ausschreibung_light) then
        v_obj_typ := pck_framework_utils.c_objTyp_Ausschreibung;
        select h.aus_name
          into v_obj_name
          from t_aus_header h
         where h.aus_id = p_obj_id
           and h.aus_version = (select max(aus_version)
                                  from t_aus_header h
                                 where h.aus_id = p_obj_id);
      when blockbasta.pkg_dispatcher.g_applid =
           pck_framework_utils.c_appl_angeb_abgabe then
        v_obj_typ := pck_framework_utils.c_objTyp_Angebot;
        select h.aus_nummer || ' - ' || h.aus_name
          into v_obj_name
          from t_aus_header h, t_aus_angebot a
         where h.aus_id = a.ang_aus_id
           and a.ang_id = p_obj_id
           and h.aus_status in
               (pck_framework_utils.c_status_publiziert, --'PN'
                pck_framework_utils.c_status_v_veroeffentlicht, --'VN'
                pck_framework_utils.c_aus_status_zu, --'PG'
                pck_framework_utils.c_status_link_aus_abgelaufen); --'GN'
    --Gemini Issue 2378 AusschreibungsTitel anstatt Angebot-Titel
    --select t.adr_anschrift1
    --             into v_obj_name
    --             from t_aus_angebot t
    --            where t.ang_id = p_obj_id;
    end case;
  
    --gemeinsame Formelemente für alle Applikationen
    v_par_titel        := tp_commandparam(typ => pck_framework_utils.c_param_type_input);
    v_par_titel.nam    := 'p_titel';
    v_par_titel.valopt := 60;
  
    v_par_register     := tp_commandparam(typ => pck_framework_utils.c_param_type_select);
    v_par_register.nam := 'p_register_id';
    /*v_par_register.sourc := 'select 0, '''' name from dual
       union
       select reg_id, pck_messagetext.getMessageText(vur_kurz_msg_id) name 
         from t_vu_register
        where pck_aus_dokument.doc_recht(''' ||
    p_dok_id || ''',' || p_obj_id ||
    ',reg_id) is not null and obj_typ = ' ||
    v_obj_typ;*/
    v_par_register.sourc := 'select reg_id, pck_messagetext.getMessageText(vur_kurz_msg_id) name 
                                 from t_vu_register
                                where pck_aus_dokument.doc_recht(''' ||
                            p_dok_id || ''',' || p_obj_id ||
                            ',reg_id) is not null and obj_typ = ' ||
                            v_obj_typ || 'order by reg_li_sort';
  
    v_par_doku_art       := tp_commandparam(typ => pck_framework_utils.c_param_type_select);
    v_par_doku_art.nam   := 'p_art_id';
    v_par_doku_art.sourc := 'select 0, ''''   name from dual
                               union
                             select verg_art_id, pck_messagetext.getMessageText(vua_kurz_msg_id) name 
                               from t_vu_art where verg_art_id < 5';
    -- SL 12092005: die letzten beiden Typen sollen nicht mehr auswählbar sein; where-Bedingung eingeführt,
    -- damit vorhandene Ausschreibungen noch konsistent sind
    v_par_seiten        := tp_commandparam(typ => pck_framework_utils.c_param_type_input);
    v_par_seiten.nam    := 'p_seiten';
    v_par_seiten.valopt := 5;
  
    v_par_format       := tp_commandparam(typ => pck_framework_utils.c_param_type_select);
    v_par_format.nam   := 'p_format';
    v_par_format.sourc := 'select ''A4'', ''DIN A4'' name from dual
                                union 
                               select ''A0'', ''DIN A0'' name from dual
                                union 
                               select ''A1'', ''DIN A1'' name from dual
                                union 
                               select ''A2'', ''DIN A2'' name from dual
                                union 
                               select ''A3'', ''DIN A3'' name from dual
                                union 
                               select ''AufklA4'', pck_messagetext.getMessageText(11321) 
                                                       || '' (DIN A4)'' name from dual';
  
    v_par_farbe       := tp_commandparam(typ => pck_framework_utils.c_param_type_radio);
    v_par_farbe.nam   := 'p_farbe';
    v_par_farbe.sourc := 'select ''sw'', pck_messagetext.getMessageText(11329) name from dual
                          union
                          select ''fa'', pck_messagetext.getMessageText(11253) name from dual';
  
    v_par_dokument     := tp_commandparam(typ => pck_framework_utils.c_param_type_file);
    v_par_dokument.nam := 'p_blob_rowid';
  
    v_par_filename     := tp_commandparam(typ => pck_framework_utils.c_param_type_hidden);
    v_par_filename.nam := 'p_file_name';
    begin
      select vu_titel
            ,vu_register_id
            ,vu_art_id
            ,vu_farbe
            ,vu_seiten
            ,vu_papier_format
            ,vu_file_name
            ,vu_file_type
            ,vu_sysuser_id
            ,vu_lastchange
        into v_par_titel.val
            ,v_par_register.val
            ,v_par_doku_art.val
            ,v_par_farbe.val
            ,v_par_seiten.val
            ,v_par_format.val
            ,v_file_name
            ,v_file_type
            ,v_user
            ,v_lastchange
        from t_vu_header
       where vu_id = p_dok_id;
    exception
      when no_data_found then
        v_par_titel.val    := null;
        v_par_register.val := null;
        v_par_doku_art.val := null;
        v_par_farbe.val    := 'sw';
        v_par_seiten.val   := 1;
        v_par_format.val   := 'A4';
        v_file_name        := null;
        v_file_type        := null;
    end;
  
    v_par_obj_id.nam := 'p_obj_id';
    v_par_obj_id.val := p_obj_id;
  
    v_par_dok_id.nam := 'p_dok_id';
    v_par_dok_id.val := p_dok_id;
  
    v_com_speichern.nam   := 'speichern';
    v_com_speichern.msgid := 103;
  
    v_com_abbrechen.nam   := 'abbrechen';
    v_com_abbrechen.msgid := 217;
  
    v_com_form := tp_command(typ => pck_framework_utils.c_command_type_form);
  
    --shift parameters into table 
    v_paramstab := tp_commandparamtab(v_com_speichern
                                     ,v_par_dok_id
                                     ,v_par_titel
                                     ,v_par_doku_art
                                     ,v_par_register
                                     ,v_par_seiten
                                     ,v_par_format
                                     ,v_par_farbe
                                     ,v_par_dokument
                                     ,v_par_filename);
  
    if v_obj_typ = pck_framework_utils.c_objTyp_Kontakt then
      v_com_abbrechen.target := pck_framework_utils.c_frame_f_contentmain;
      v_par_obj_id.nam       := 'p_kontaktid'; --23.08.05 LBe
      v_com_abbrechen.params := tp_commandparamtab(v_par_obj_id);
      v_com_abbrechen.action := pck_sd_l.c_package_name || '.' ||
                                pck_sd_l.c_proc_f_bearb_mask;
    
      v_com_form.target := pck_framework_utils.c_frame_f_contentmain;
      v_par_obj_id.nam  := 'p_obj_id';
    
      v_com_form.params := v_paramstab;
      pck_utils.add_cmd_param(p_tab => v_com_form.params
                             ,p_par => v_par_obj_id);
    
      v_com_form.action := pck_sd_l.c_package_name || '.' ||
                           pck_sd_l.c_proc_dok_save;
    elsif v_obj_typ = pck_framework_utils.c_objTyp_Angebot then
      v_com_abbrechen.target := pck_framework_utils.c_frame_f_contentmain;
      v_par_obj_id.nam       := 'p_ang_id';
      v_com_abbrechen.params := tp_commandparamtab(v_par_obj_id);
      v_com_abbrechen.action := pck_angebot_an.c_package_name || '.' ||
                                pck_angebot_an.c_proc_f_an_angebot_mask;
    
      v_par_obj_id.nam  := 'p_aus_id';
      v_com_form.target := pck_framework_utils.c_frame_f_contentmain;
      v_com_form.params := v_paramstab;
      pck_utils.add_cmd_param(p_tab => v_com_form.params
                             ,p_par => v_par_obj_id);
      v_com_form.action := c_package_name || '.' || c_proc_aus_dok_save;
    else
      v_par_obj_id.nam       := 'p_aus_id';
      v_com_abbrechen.params := tp_commandparamtab(v_par_obj_id);
      v_com_abbrechen.target := pck_framework_utils.c_frame_f_contentmain;
      v_com_abbrechen.action := pck_ausschreibung.c_package_name || '.' ||
                                pck_ausschreibung.c_proc_f_aus_bearb_mask;
    
      v_com_form.target := pck_framework_utils.c_frame_f_contentmain;
      v_com_form.params := v_paramstab;
      pck_utils.add_cmd_param(p_tab => v_com_form.params
                             ,p_par => v_par_obj_id);
      v_com_form.action := c_package_name || '.' || c_proc_aus_dok_save;
    end if;
    pck_utils.add_text_tab(p_tab => v_txtTab
                          ,p_par => tp_text(Num  => 1
                                           ,Text => v_obj_name
                                           ,Nam  => 'titel'
                                           ,Enc  => 'J'));
  
    if p_dok_id is null then
      pck_utils.add_text_tab(p_tab => v_txtTab
                            ,p_par => tp_text(Num  => 2
                                             ,Text => pck_messagetext.getMessageText(11442) -- 11442 => "Dokument hinzufügen"
                                             ,Nam  => 'appl'));
    else
      pck_utils.add_text_tab(p_tab => v_txtTab
                            ,p_par => tp_text(Num  => 2
                                             ,Text => pck_messagetext.getMessageText(11870) -- 11870 => "Dokumenten-Information bearbeiten"
                                             ,Nam  => 'appl'));
      -- oder 11415 => "Dokument bearbeiten"
      if v_file_name is not null then
        v_file_name := v_file_name || '.' || v_file_type;
      end if;
      pck_utils.add_text_tab(p_tab => v_txtTab
                            ,p_par => tp_text(Num  => 3
                                             ,Text => v_file_name
                                             ,Nam  => 'dokument'
                                             ,Enc  => 'J'));
      pck_utils.add_text_tab(p_tab => v_txtTab
                            ,p_par => tp_text(Num  => 4
                                             ,Text => pck_user_info.getLastChangeUserTXT(p_sysuserid  => v_user
                                                                                        ,p_lastchange => v_lastchange)
                                             ,Nam  => 'info'
                                             ,Enc  => 'J'));
    end if;
  
    pck_framework_utils.getReturnHeadXML(p_err  => null
                                        ,p_cmd  => tp_commandtab(v_com_form
                                                                ,v_com_abbrechen)
                                        ,p_tab  => null
                                        ,p_txt  => v_txttab
                                        ,p_pack => c_package_name
                                        ,p_proc => c_proc_aus_dok_mask
                                        ,p_clob => p_clob
                                        ,p_long => p_long);
  end;
  --------------------------------aus_dok_mask--------------------------------
  --LBe: 26_04_06 obsolated
  -- SL 2005-06-02 fertig implementiert
  ----------------------------------------------------------------------------
  /*procedure aus_dok_mask(p_dok_id number default null
                        ,p_aus_id number
                        ,p_clob   out clob
                        ,p_long   out long) is
    v_par_dok_id   tp_commandparam; -- ID des Dokuments, NULL wenn neu, sonst mit Wert
    v_par_aus_id   tp_commandparam;
    v_par_titel    tp_commandparam;
    v_par_doku_art tp_commandparam;
    v_par_register tp_commandparam;
    v_par_seiten   tp_commandparam;
    v_par_format   tp_commandparam;
    v_par_farbe    tp_commandparam;
    v_par_dokument tp_commandparam;
    v_par_filename tp_commandparam;
  
    v_com_speichern tp_commandparam;
  
    v_com_form      tp_command;
    v_com_abbrechen tp_command;
  
    --    v_errtab tp_errortab;
  
    v_txttab tp_texttab;
  
    v_titel         t_vu_header.vu_titel%type;
    v_register_id   number;
    v_art_id        number;
    v_farbe         t_vu_header.vu_farbe%type;
    v_seiten        number;
    v_papier_format t_vu_header.vu_papier_format%type;
    v_aus_name      t_objekt_baum.obj_titel%type;
    v_sd_name       t_sd_kontakt.bezeichnung%type;
    v_file_name     t_vu_header.vu_file_name%type;
    v_file_type     t_vu_header.vu_file_type%type;
    v_dokname       varchar2(200);
    v_user          t_vu_header.vu_sysuser_id%type;
    v_lastchange    t_vu_header.vu_lastchange%type;
  
  begin
    \*if not p_aus_id > 0 then
      v_errtab := tp_errortab(tp_error(Num  => pck_framework_utils.c_err_info
                                      ,Text => pck_messagetext.getMessageText(p_msgid => 11868)));
    
      pck_framework_utils.getReturnHeadXML(p_err  => v_errtab
                                          ,p_cmd  => null
                                          ,p_tab  => null
                                          ,p_txt  => null
                                          ,p_pack => c_package_name
                                          ,p_proc => c_proc_aus_dok_mask
                                          ,p_clob => p_clob
                                          ,p_long => p_long);
      return;
    end if;*\ -- diese prüfung ist jetzt nach f_aus_dok_zuord umgezogen - später hier löschen
  
    begin
      select vu_titel
            ,vu_register_id
            ,vu_art_id
            ,vu_farbe
            ,vu_seiten
            ,vu_papier_format
            ,vu_file_name
            ,vu_file_type
            ,vu_sysuser_id
            ,vu_lastchange
        into v_titel
            ,v_register_id
            ,v_art_id
            ,v_farbe
            ,v_seiten
            ,v_papier_format
            ,v_file_name
            ,v_file_type
            ,v_user
            ,v_lastchange
        from t_vu_header
       where vu_id = p_dok_id;
    exception
      when no_data_found then
        v_titel         := null;
        v_register_id   := null;
        v_art_id        := null;
        v_file_name     := null;
        v_file_type     := null;
        v_farbe         := 'sw';
        v_seiten        := 1;
        v_papier_format := 'A4';
    end;
  
    v_par_aus_id     := tp_commandparam(typ => pck_framework_utils.c_param_type_hidden);
    v_par_aus_id.nam := 'p_aus_id';
    v_par_aus_id.val := p_aus_id;
  
    v_par_dok_id     := tp_commandparam(typ => pck_framework_utils.c_param_type_hidden);
    v_par_dok_id.nam := 'p_dok_id';
    v_par_dok_id.val := p_dok_id;
  
    v_par_titel        := tp_commandparam(typ => pck_framework_utils.c_param_type_input);
    v_par_titel.nam    := 'p_titel';
    v_par_titel.val    := v_titel;
    v_par_titel.valopt := 60;
  
    v_par_register       := tp_commandparam(typ => pck_framework_utils.c_param_type_select);
    v_par_register.nam   := 'p_register_id';
    v_par_register.val   := v_register_id;
    v_par_register.sourc := 'select 0, '''' name from dual
                               union
                               select reg_id, pck_messagetext.getMessageText(vur_kurz_msg_id) name 
                                 from t_vu_register
                                where pck_aus_dokument.doc_recht(''' ||
                            p_dok_id || ''',' || p_aus_id ||
                            ',reg_id) is not null and reg_id not in
                            (''' ||
                            pck_framework_utils.c_objTyp_aus_AenderMittlg || ''',
                             ''' ||
                            pck_framework_utils.c_objTyp_aus_AbrufbMittlg || ''',
                             ''' ||
                            pck_framework_utils.c_objTyp_aus_AblehnMittlg ||
                            ''') ';
  
    v_par_doku_art       := tp_commandparam(typ => pck_framework_utils.c_param_type_select);
    v_par_doku_art.nam   := 'p_art_id';
    v_par_doku_art.val   := v_art_id;
    v_par_doku_art.sourc := 'select 0, ''''   name from dual
                               union
                             select verg_art_id, pck_messagetext.getMessageText(vua_kurz_msg_id) name 
                               from t_vu_art where verg_art_id < 5';
    -- SL 12092005: die letzten beiden Typen sollen nicht mehr auswählbar sein; where-Bedingung eingeführt,
    -- damit vorhandene Ausschreibungen noch konsistent sind
  
    v_par_seiten        := tp_commandparam(typ => pck_framework_utils.c_param_type_input);
    v_par_seiten.nam    := 'p_seiten';
    v_par_seiten.val    := v_seiten;
    v_par_seiten.valopt := 5;
  
    v_par_format       := tp_commandparam(typ => pck_framework_utils.c_param_type_select);
    v_par_format.nam   := 'p_format';
    v_par_format.val   := v_papier_format;
    v_par_format.sourc := 'select ''A4'', ''DIN A4'' name from dual
                                union 
                               select ''A0'', ''DIN A0'' name from dual
                                union 
                               select ''A1'', ''DIN A1'' name from dual
                                union 
                               select ''A2'', ''DIN A2'' name from dual
                                union 
                               select ''A3'', ''DIN A3'' name from dual
                                union 
                               select ''AufklA4'', pck_messagetext.getMessageText(11321) 
                                                       || '' (DIN A4)'' name from dual';
  
    v_par_farbe       := tp_commandparam(typ => pck_framework_utils.c_param_type_radio);
    v_par_farbe.nam   := 'p_farbe';
    v_par_farbe.val   := v_farbe;
    v_par_farbe.sourc := 'select ''sw'', pck_messagetext.getMessageText(11329) name from dual
                                union
                               select ''fa'', pck_messagetext.getMessageText(11253) name from dual';
  
    v_par_dokument     := tp_commandparam(typ => pck_framework_utils.c_param_type_file);
    v_par_dokument.nam := 'p_blob_rowid';
  
    v_par_filename     := tp_commandparam(typ => pck_framework_utils.c_param_type_hidden);
    v_par_filename.nam := 'p_file_name';
  
    v_com_speichern       := tp_commandparam(typ => pck_framework_utils.c_param_type_submit);
    v_com_speichern.nam   := 'speichern';
    v_com_speichern.msgid := '103';
  
    v_com_abbrechen       := tp_command(typ => pck_framework_utils.c_command_type_link);
    v_com_abbrechen.nam   := 'abbrechen';
    v_com_abbrechen.msgid := 217;
  
    v_com_form := tp_command(typ => pck_framework_utils.c_command_type_form);
  
    if blockbasta.pkg_dispatcher.g_applid in
       (pck_framework_utils.c_appl_stammdaten,
        pck_framework_utils.c_appl_adm_userdaten) then
      -- für Larissa 
    
      v_com_form.target := pck_framework_utils.c_frame_f_contentmain;
      v_com_form.action := pck_sd_l.c_package_name || '.' ||
                           pck_sd_l.c_proc_dok_save;
    
      v_com_form.params := tp_commandparamtab(v_com_speichern
                                             ,v_par_aus_id
                                             ,v_par_dok_id
                                             ,v_par_titel
                                             ,v_par_doku_art
                                             ,v_par_register
                                             ,v_par_seiten
                                             ,v_par_format
                                             ,v_par_farbe
                                             ,v_par_dokument
                                             ,v_par_filename);
    
      v_par_aus_id.nam       := 'p_kontaktid'; --23.08.05 LBe
      v_com_abbrechen.params := tp_commandparamtab(v_par_aus_id);
      v_com_abbrechen.action := pck_sd_l.c_package_name || '.' ||
                                pck_sd_l.c_proc_f_bearb_mask;
      v_com_abbrechen.target := pck_framework_utils.c_frame_f_contentmain;
    
      select t.bezeichnung
        into v_sd_name
        from t_sd_kontakt t
       where t.kontaktid = p_aus_id;
    
      v_txtTab := tp_texttab(tp_text(Num  => 1
                                    ,Text => v_sd_name
                                    ,Nam  => 'titel'
                                    ,Enc  => 'J'));
    
    else
      v_com_abbrechen.action := pck_ausschreibung.c_package_name || '.' ||
                                pck_ausschreibung.c_proc_f_aus_bearb_mask;
      v_com_abbrechen.target := pck_framework_utils.c_frame_f_contentmain;
      v_com_abbrechen.params := tp_commandparamtab(v_par_aus_id);
    
      v_com_form.target := pck_framework_utils.c_frame_f_contentmain;
      v_com_form.action := c_package_name || '.' || c_proc_aus_dok_save;
      --    v_com_form.autostore   := 'J';
      v_com_form.params := tp_commandparamtab(v_com_speichern
                                             ,v_par_aus_id
                                             ,v_par_dok_id
                                             ,v_par_titel
                                             ,v_par_doku_art
                                             ,v_par_register
                                             ,v_par_seiten
                                             ,v_par_format
                                             ,v_par_farbe
                                             ,v_par_dokument
                                             ,v_par_filename);
    
      -- SL 12012006: nach neuesten Feststellungen soll der Ausschreibungstitel angezeigt werden
      -- und nicht mehr der Projekttitel
      select h.aus_name
        into v_aus_name
        from t_aus_header h
       where h.aus_id = p_aus_id
         and h.aus_version = (select max(aus_version)
                                from t_aus_header h
                               where h.aus_id = p_aus_id);
      \*select b.obj_titel
        into v_aus_name
        from t_objekt_baum b
       where b.ob_produser_id = blockbasta.pkg_dispatcher.g_produserid
         and b.obj_type_id = pck_framework_utils.c_objTyp_Projekt
       start with b.obj_id = p_aus_id
      connect by b.obj_id = prior b.obj_par_id;*\
    
      v_txtTab := tp_texttab(tp_text(Num  => 1
                                    ,Text => nvl(v_aus_name
                                                ,pck_messagetext.getMessageText(1023))
                                    ,Nam  => 'titel'
                                    ,Enc  => 'J'));
    
    end if;
  
    v_txttab.extend;
  
    if p_dok_id is null then
      v_txttab(v_txttab.last) := tp_text(Num  => 2
                                        ,Text => pck_messagetext.getMessageText(11442) -- 11442 => "Dokument hinzufügen"
                                        ,Nam  => 'appl');
    else
      v_txttab(v_txttab.last) := tp_text(Num  => 2
                                        ,Text => pck_messagetext.getMessageText(11870) -- 11870 => "Dokumenten-Information bearbeiten"
                                        ,Nam  => 'appl');
      -- oder 11415 => "Dokument bearbeiten"
      if v_file_name is not null then
        v_dokname := v_file_name || '.' || v_file_type;
      end if;
      v_txttab.extend;
      v_txttab(v_txttab.last) := tp_text(Num  => 3
                                        ,Text => v_dokname
                                        ,Nam  => 'dokument'
                                        ,Enc  => 'J');
      v_txttab.extend;
      v_txttab(v_txttab.last) := tp_text(Num  => 4
                                        ,Text => pck_user_info.getLastChangeUserTXT(p_sysuserid  => v_user
                                                                                   ,p_lastchange => v_lastchange)
                                        ,Nam  => 'info');
    end if;
  
    pck_framework_utils.getReturnHeadXML(p_err  => null
                                        ,p_cmd  => tp_commandtab(v_com_form
                                                                ,v_com_abbrechen)
                                        ,p_tab  => null
                                        ,p_txt  => v_txttab
                                        ,p_pack => c_package_name
                                        ,p_proc => c_proc_aus_dok_mask
                                        ,p_clob => p_clob
                                        ,p_long => p_long);
  end;*/
  ---------------------------------------------------------------------------
  --LBe 19_04_06
  procedure aus_dok_liste(p_obj_id     number
                         ,p_dok_id     number default null
                         ,p_rechtesatz number
                         ,p_clob       out clob
                         ,p_long       out long) is
    v_par_string tp_commandparam := tp_commandparam(typ => pck_framework_utils.c_param_type_hidden);
    v_par_wleft  tp_commandparam := tp_commandparam(typ => pck_framework_utils.c_param_type_hidden);
    v_par_obj_id tp_commandparam := tp_commandparam(typ => pck_framework_utils.c_param_type_hidden);
  
    v_com_weiter  tp_command := tp_command(typ => pck_framework_utils.c_command_type_link);
    v_com_zurueck tp_command := tp_command(typ => pck_framework_utils.c_command_type_link);
    v_com_ok      tp_command := tp_command(typ => pck_framework_utils.c_command_type_link);
    v_com_form    tp_command;
  
    v_txtTab    tp_texttab;
    v_query_tab tp_querytab;
  
    v_q_str varchar2(4000);
  
    v_typen   varchar2(100);
    v_aktiv   varchar2(1);
    v_obj_typ number;
  
  begin
    if p_obj_id <= 0 then
      return;
    end if;
    --Stammdaten bekommen den rechten Frame nicht
    --Angebot wahrscheinlich ja
    case
      when blockbasta.pkg_dispatcher.g_applid in
           (pck_framework_utils.c_appl_vu_zusammen,
            pck_framework_utils.c_appl_ausschreibung_light) then
        v_obj_typ := pck_framework_utils.c_objTyp_Ausschreibung;
      when blockbasta.pkg_dispatcher.g_applid =
           pck_framework_utils.c_appl_angeb_abgabe then
        v_obj_typ := pck_framework_utils.c_objTyp_Angebot;
    end case;
    v_par_obj_id.nam := 'p_aus_id';
    v_par_obj_id.val := p_obj_id;
  
    v_par_string.nam := 'p_reg_pos_string';
    v_par_wleft.nam  := 'p_which_left';
  
    v_com_weiter.nam       := 'weiter';
    v_com_weiter.msgid     := '183';
    v_com_weiter.target    := pck_framework_utils.c_frame_f_contentmain;
    v_com_weiter.params    := tp_commandparamtab(v_par_obj_id);
    v_com_weiter.autostore := 'J';
  
    v_com_zurueck.nam    := 'zurueck';
    v_com_zurueck.msgid  := '1403';
    v_com_zurueck.target := pck_framework_utils.c_frame_f_contentmain;
    v_com_zurueck.params := tp_commandparamtab(v_par_obj_id);
  
    v_com_ok.nam       := 'ok';
    v_com_ok.msgid     := '698';
    v_com_ok.target    := pck_framework_utils.c_frame_f_contentmain;
    v_com_ok.autostore := 'J';
    v_com_ok.params    := tp_commandparamtab(v_par_wleft);
    pck_utils.add_text_tab(p_tab => v_txtTab
                          ,p_par => tp_text(Num  => -3
                                           ,Text => pck_messagetext.getMessageText(903)
                                           ,Nam  => 'titel'
                                           ,Enc  => 'J'));
    pck_utils.add_text_tab(p_tab => v_txtTab
                          ,p_par => tp_text(Num  => -2
                                           ,Text => pck_messagetext.getMessageText(11254)
                                           ,Nam  => 'format'));
    pck_utils.add_text_tab(p_tab => v_txtTab
                          ,p_par => tp_text(Num  => 0
                                           ,Text => pck_messagetext.getMessageText(11255)
                                           ,Nam  => 'position'));
  
    -- gibt an, ob die Links aktiv sind oder nicht
    if p_dok_id is null then
      v_aktiv := 'J';
    else
      v_aktiv := 'N';
    end if;
  
    for c_qt in (select r.reg_id id
                       ,pck_messagetext.getMessageText(r.vur_kurz_msg_id) register
                   from t_vu_register r
                  where obj_typ = v_obj_typ
                  order by reg_li_sort) loop
    
      if not (blockbasta.pkg_dispatcher.g_applid =
          pck_framework_utils.c_appl_angeb_abgabe and
          pck_angebot_an.checkNebenangebot(p_obj_id) = 'N' and
          c_qt.id = pck_framework_utils.c_objTyp_ang_NebenAngebot) then
      
        pck_utils.add_text_tab(p_tab => v_txtTab
                              ,p_par => tp_text(Num  => c_qt.id
                                               ,Text => c_qt.register
                                               ,Nam  => c_qt.id));
      
        if c_qt.id = pck_framework_utils.c_objTyp_aus_LV THEN
          v_typen := c_qt.id || ',' ||
                     pck_framework_utils.c_objTyp_aus_LV_ss_pdf_83 || ',' ||
                     pck_framework_utils.c_objTyp_aus_LV_ss_gaeb_83 || ',' ||
                     pck_framework_utils.c_objTyp_VergabeUL_LV; -- SL 05022007: für unser LV
        elsif c_qt.id = pck_framework_utils.c_objTyp_ang_PreisAngebot then
          v_typen := c_qt.id || ',' ||
                     pck_framework_utils.c_objTyp_angebotsUL_LV; -- SL 06022007: für unser Preisangebot
        else
          v_typen := c_qt.id;
        end if;
      
        v_q_str := 'select h.vu_position position, pck_obj_status.getStatusCode(h.vu_id, h.vu_register_id,''J'') status, h.vu_titel titel,  ' ||
                   '       decode( vu_file_name, null, '''',  vu_file_name || ''.'' || vu_file_type)  format, ' ||
                   ' pck_framework_utils.getLink_a_TXT(pck_aus_dokument.geteditlink(h.vu_id, h.vu_register_id, pck_obj_status.getStatusCode(h.vu_id, h.vu_register_id),' ||
                   p_rechtesatz || ', ''' || v_aktiv || ''')) edit_link,  ' ||
                   '      pck_framework_utils.getLink_a_TXT(pck_aus_dokument.getloeschenlink(h.vu_id, h.vu_register_id, pck_obj_status.getStatusCode(h.vu_id, h.vu_register_id),' ||
                   p_rechtesatz || ', ''' || v_aktiv ||
                   ''')) del_link from t_vu_header h, t_vu_art a ' ||
                   '     where h.vu_art_id = a.verg_art_id ' ||
                   '       and h.vu_register_id in ( ' || v_typen ||
                   ' ) and h.vu_aus_id = ' || p_obj_id ||
                   '       and substr(pck_obj_status.getStatusCode(h.vu_id, h.vu_register_id,''J''), 2, 1) != ''J'' ' ||
                   '     order by h.vu_position';
      
        if v_query_tab is null then
          v_query_tab := tp_querytab(tp_text(Text => v_q_str
                                            ,Nam  => c_qt.id));
        else
          v_query_tab.extend;
          v_query_tab(v_query_tab.last) := tp_text(Text => v_q_str
                                                  ,Nam  => c_qt.id);
        end if;
      
        v_par_string.val := v_par_string.val || c_qt.id ||
                            pck_framework_utils.c_ListTrenn2;
      
        for c_str in (select h.vu_id id
                        from t_vu_header h, t_vu_art a
                       where h.vu_art_id = a.verg_art_id
                         and h.vu_register_id = c_qt.id
                         and substr(h.vu_status, 2, 1) != 'J'
                         and h.vu_aus_id = p_obj_id
                       order by h.vu_position) loop
          v_par_string.val := v_par_string.val || c_str.id ||
                              pck_framework_utils.c_ListTrenn2;
        end loop;
        -- Trennzeichen2 am rechten Rand entfernen, da keine weitere vu_id angehangen wurde
        v_par_string.val := rtrim(v_par_string.val
                                 ,pck_framework_utils.c_ListTrenn2);
        v_par_string.val := v_par_string.val ||
                            pck_framework_utils.c_ListTrenn;
      end if;
    end loop;
    -- Trennzeichen am rechten Rand entfernen, da kein weiteres Register (vu_reg_id) angehangen wurde
    v_par_string.val := rtrim(v_par_string.val
                             ,pck_framework_utils.c_ListTrenn);
  
    v_com_form        := tp_command(typ => pck_framework_utils.c_command_type_form);
    v_com_form.target := pck_framework_utils.c_frame_f_contentmain;
    v_com_form.params := tp_commandparamtab(v_par_obj_id, v_par_string);
  
    if p_dok_id is null then
      -- neu Anlegen eines Dokumentes => Buttons auf der rechten Seite aktiv
      v_com_form.autostore := 'J';
      if v_obj_typ = pck_framework_utils.c_objTyp_Ausschreibung then
        v_com_weiter.action  := pck_ausschreibung.c_package_name || '.' ||
                                pck_ausschreibung.c_proc_f_aus_show_all;
        v_com_zurueck.action := pck_ausschreibung.c_package_name || '.' ||
                                pck_ausschreibung.c_proc_f_aus_bearb_mask;
      elsif v_obj_typ = pck_framework_utils.c_objTyp_Angebot then
        --angebot abgeben
        v_par_obj_id.nam    := 'p_ang_id';
        v_par_obj_id.val    := p_obj_id;
        v_com_weiter.params := tp_commandparamtab(v_par_obj_id);
        v_com_weiter.target := pck_framework_utils.c_frame_contentmain;
        v_com_weiter.action := pck_angebot_an.c_package_name || '.' ||
                               pck_angebot_an.c_proc_an_detail;
        --angebot bearbeiten
        v_com_zurueck.target := pck_framework_utils.c_frame_f_contentmain;
        v_com_zurueck.params := tp_commandparamtab(v_par_obj_id);
        v_com_zurueck.action := pck_angebot_an.c_package_name || '.' ||
                                pck_angebot_an.c_proc_f_an_angebot_mask;
      end if;
      v_com_ok.action   := pck_proj_manag.c_package_name || '.' ||
                           pck_proj_manag.c_proc_dvn_f_mein_ordner;
      v_com_form.action := c_package_name || '.' || c_proc_aus_pos_save;
    end if;
  
    pck_framework_utils.getReturnHeadXML(p_err  => null
                                        ,p_cmd  => tp_commandtab(v_com_form
                                                                ,v_com_weiter
                                                                ,v_com_zurueck
                                                                ,v_com_ok)
                                        ,p_tab  => v_query_tab
                                        ,p_txt  => v_txtTab
                                        ,p_pack => c_package_name
                                        ,p_proc => c_proc_aus_dok_liste
                                        ,p_clob => p_clob
                                        ,p_long => p_long);
  end;
  -------------------------------aus_dok_liste--------------------------------   
  --LBe: obsolate                                        
  /*procedure aus_dok_liste(p_aus_id     number
                         ,p_dok_id     number default null
                         ,p_rechtesatz number
                         ,p_clob       out clob
                         ,p_long       out long) is
    v_par_string tp_commandparam;
    v_par_wleft  tp_commandparam;
    v_par_aus_id tp_commandparam;
  
    v_com_weiter  tp_command;
    v_com_zurueck tp_command;
    v_com_ok      tp_command;
    v_com_form    tp_command;
  
    v_txtTab    tp_texttab;
    v_query_tab tp_querytab;
  
    v_q_str varchar2(4000);
    --v_regname varchar2(60);
    v_typen varchar2(100);
    v_aktiv varchar2(1);
    --    v_bool    char(1);
  
  begin
    if not p_aus_id > 0 then
      return;
    end if;
  
    -- vbel: diese prüfung passiert jetzt zentral on user_info
    \*if p_dok_id is null then
      v_bool := 1; -- Link-Action anzeigen
    else
      v_bool := 0; -- keine Link-Action anzeigen
    end if;*\
  
    v_par_aus_id     := tp_commandparam(typ => pck_framework_utils.c_param_type_hidden);
    v_par_aus_id.nam := 'p_aus_id';
    v_par_aus_id.val := p_aus_id;
  
    v_par_string     := tp_commandparam(typ => pck_framework_utils.c_param_type_hidden);
    v_par_string.nam := 'p_reg_pos_string';
  
    v_par_wleft     := tp_commandparam(typ => pck_framework_utils.c_param_type_hidden);
    v_par_wleft.nam := 'p_which_left';
    --v_par_wleft.val := 'projekt';
  
    v_com_weiter           := tp_command(typ => pck_framework_utils.c_command_type_link);
    v_com_weiter.nam       := 'weiter';
    v_com_weiter.msgid     := '183';
    v_com_weiter.target    := pck_framework_utils.c_frame_f_contentmain;
    v_com_weiter.params    := tp_commandparamtab(v_par_aus_id);
    v_com_weiter.autostore := 'J';
  
    v_com_zurueck        := tp_command(typ => pck_framework_utils.c_command_type_link);
    v_com_zurueck.nam    := 'zurueck';
    v_com_zurueck.msgid  := '1403';
    v_com_zurueck.target := pck_framework_utils.c_frame_f_contentmain;
    v_com_zurueck.params := tp_commandparamtab(v_par_aus_id);
    --    v_com_zurueck.autostore          := 'J';
  
    v_com_ok           := tp_command(typ => pck_framework_utils.c_command_type_link);
    v_com_ok.nam       := 'ok';
    v_com_ok.msgid     := '698';
    v_com_ok.target    := pck_framework_utils.c_frame_f_contentmain;
    v_com_ok.autostore := 'J';
    v_com_ok.params    := tp_commandparamtab(v_par_wleft);
  
    v_txtTab := tp_texttab(tp_text(Num  => -3
                                  ,Text => pck_messagetext.getMessageText(903)
                                  ,Nam  => 'titel'
                                  ,Enc  => 'J'));
  
    v_txtTab.Extend;
    v_txtTab(v_txtTab.Last) := tp_text(Num  => -2
                                      ,Text => pck_messagetext.getMessageText(11254)
                                      ,Nam  => 'format');
    v_txtTab.Extend;
    v_txtTab(v_txtTab.Last) := tp_text(Num  => 0
                                      ,Text => pck_messagetext.getMessageText(11255)
                                      ,Nam  => 'position');
  
    -- gibt an, ob die Links aktiv sind oder nicht
    if p_dok_id is null then
      v_aktiv := 'J';
    else
      v_aktiv := 'N';
    end if;
  
    for c_qt in (select r.reg_id id
                       ,pck_messagetext.getMessageText(r.vur_kurz_msg_id) register
                   from t_vu_register r
                  where r.reg_id not in
                        (pck_framework_utils.c_objTyp_aus_AenderMittlg,
                         pck_framework_utils.c_objTyp_aus_AbrufbMittlg,
                         pck_framework_utils.c_objTyp_aus_AblehnMittlg)) loop
      --v_regname := c_qt.id;
      v_txtTab.Extend;
      v_txtTab(v_txtTab.Last) := tp_text(Num  => c_qt.id
                                        ,Text => c_qt.register
                                        ,Nam  => c_qt.id);
    
      if c_qt.id = pck_framework_utils.c_objTyp_aus_LV THEN
        v_typen := c_qt.id || ',' ||
                   pck_framework_utils.c_objTyp_aus_LV_ss_pdf_83 || ',' ||
                   pck_framework_utils.c_objTyp_aus_LV_ss_gaeb_83;
      else
        v_typen := c_qt.id;
      end if;
    
      -- SL 03022006: Da einige Eingabelemente ausgebaut wurden, wird diese Abfrage erstmal ausgebaut, stattdesssen
      -- wird der Dateiname angezeigt
      v_q_str := 'select rownum position, t.status, t.titel, t.format, 
                t.edit_link, t.del_link
                from ( select h.vu_status status, 
                h.vu_titel titel, 
                pck_messagetext.getMessageText(a.vua_kurz_msg_id) || '', '' 
         || decode(h.vu_papier_format, ''AufklA4'', pck_messagetext.getMessageText(11321) || '' (DIN A4)'',''DIN '' || h.vu_papier_format) || '', '' 
         || decode(h.vu_farbe, ''sw'',pck_messagetext.getMessageText(11329), ''fa'', pck_messagetext.getMessageText(11253), 0 ) format, ' ||
                 ' pck_framework_utils.getLink_a_TXT(pck_aus_dokument.geteditlink(h.vu_id, h.vu_register_id, h.vu_status,' ||
                 p_rechtesatz || ', ''' || v_aktiv ||
                 ''')) edit_link, 
        pck_framework_utils.getLink_a_TXT(pck_aus_dokument.getloeschenlink(h.vu_id, h.vu_register_id, h.vu_status,' ||
                 p_rechtesatz || ', ''' || v_aktiv ||
                 ''')) del_link from t_vu_header h, t_vu_art a
        where
        h.vu_art_id = a.verg_art_id and
        h.vu_register_id in ( ' || v_typen || --c_qt.id ||
                 ' ) and h.vu_aus_id = ' || p_aus_id ||
                 ' and substr(h.vu_status, 2, 1) != ''J''
        order by h.vu_position ) t';
    
      v_q_str := 'select rownum position, t.status, t.titel, t.format, t.edit_link, t.del_link ' ||
                 '  from ( select pck_obj_status.getStatusCode(h.vu_id, h.vu_register_id,''J'') status, h.vu_titel titel,  ' ||
                 '         vu_file_name || ''.'' || vu_file_type  format, ' ||
                 ' pck_framework_utils.getLink_a_TXT(pck_aus_dokument.geteditlink(h.vu_id, h.vu_register_id, pck_obj_status.getStatusCode(h.vu_id, h.vu_register_id),' ||
                 p_rechtesatz || ', ''' || v_aktiv || ''')) edit_link,  ' ||
                 '      pck_framework_utils.getLink_a_TXT(pck_aus_dokument.getloeschenlink(h.vu_id, h.vu_register_id, pck_obj_status.getStatusCode(h.vu_id, h.vu_register_id),' ||
                 p_rechtesatz || ', ''' || v_aktiv ||
                 ''')) del_link from t_vu_header h, t_vu_art a ' ||
                 '     where h.vu_art_id = a.verg_art_id ' ||
                 '       and h.vu_register_id in ( ' || v_typen ||
                 ' ) and h.vu_aus_id = ' || p_aus_id ||
                 '       and substr(pck_obj_status.getStatusCode(h.vu_id, h.vu_register_id,''J''), 2, 1) != ''J'' ' ||
                 '     order by h.vu_position ) t ';
    
      if v_query_tab is null then
        v_query_tab := tp_querytab(tp_text(Text => v_q_str, Nam => c_qt.id));
      else
        v_query_tab.extend;
        v_query_tab(v_query_tab.last) := tp_text(Text => v_q_str
                                                ,Nam  => c_qt.id);
      end if;
    
      -- vu_reg_id in String einfügen, danach die vu_id' s 
      v_par_string.val := v_par_string.val || c_qt.id ||
                          pck_framework_utils.c_ListTrenn2;
    
      for c_str in (select h.vu_id id
                      from t_vu_header h, t_vu_art a
                     where h.vu_art_id = a.verg_art_id
                       and h.vu_register_id = c_qt.id
                       and substr(h.vu_status, 2, 1) != 'J'
                       and h.vu_aus_id = p_aus_id
                     order by h.vu_position) loop
        v_par_string.val := v_par_string.val || c_str.id ||
                            pck_framework_utils.c_ListTrenn2;
      end loop;
      -- Trennzeichen2 am rechten Rand entfernen, da keine weitere vu_id angehangen wurde
      v_par_string.val := rtrim(v_par_string.val
                               ,pck_framework_utils.c_ListTrenn2);
    
      v_par_string.val := v_par_string.val ||
                          pck_framework_utils.c_ListTrenn;
    
    end loop;
    -- Trennzeichen am rechten Rand entfernen, da kein weiteres Register (vu_reg_id) angehangen wurde
    v_par_string.val := rtrim(v_par_string.val
                             ,pck_framework_utils.c_ListTrenn);
  
    v_com_form        := tp_command(typ => pck_framework_utils.c_command_type_form);
    v_com_form.target := pck_framework_utils.c_frame_f_contentmain;
    v_com_form.params := tp_commandparamtab(v_par_aus_id, v_par_string);
  
    if p_dok_id is null then
      -- neu Anlegen eines Dokumentes => Buttons auf der rechten Seite aktiv
      v_com_form.autostore := 'J';
      v_com_weiter.action  := pck_ausschreibung.c_package_name || '.' ||
                              pck_ausschreibung.c_proc_f_aus_show_all;
      v_com_zurueck.action := pck_ausschreibung.c_package_name || '.' ||
                              pck_ausschreibung.c_proc_f_aus_bearb_mask;
      v_com_ok.action      := pck_proj_manag.c_package_name || '.' ||
                              pck_proj_manag.c_proc_dvn_f_mein_ordner;
      v_com_form.action    := c_package_name || '.' || c_proc_aus_pos_save;
    end if;
  
    pck_framework_utils.getReturnHeadXML(p_err  => null
                                        ,p_cmd  => tp_commandtab(v_com_form
                                                                ,v_com_weiter
                                                                ,v_com_zurueck
                                                                ,v_com_ok)
                                        ,p_tab  => v_query_tab
                                        ,p_txt  => v_txtTab
                                        ,p_pack => c_package_name
                                        ,p_proc => c_proc_aus_dok_liste
                                        ,p_clob => p_clob
                                        ,p_long => p_long);
  end;*/

  ---------------------------------aus_pos_save-------------------------------
  -- SL 2005-06-01 erstellt
  ----------------------------------------------------------------------------
  procedure aus_pos_save(p_aus_id         number
                        ,p_reg_pos_string varchar2
                        ,p_clob           out clob
                        ,p_long           out long) is
    v_pos1    number;
    v_pos2    number;
    v_txt1    varchar2(2000);
    v_txt2    varchar2(2000);
    v_akt_pos number;
    v_startnr number;
  
  begin
    -- Aufbau von p_reg_pos_string
    -- vu_reg_id:=:vu_id:=:vu_id:x:vu_reg_id:=:vu_id:=:vu_id:=:vu_id:x: ...
    -- Position einer vu_id ergibt sich aus der Stelle im p_reg_pos_string
  
    if p_reg_pos_string is null then
      return;
    end if;
  
    v_pos1 := 1; -- Startposition setzen
    v_txt1 := pck_framework_utils.getListElement(p_reg_pos_string, v_pos1);
    -- Ergebnis bspw. vu_reg_id:=:vu_id:=:vu_id
  
    while v_txt1 is not null loop
      -- Schleife über die Register
      v_pos2 := 1; -- Startposition setzen
      v_txt2 := pck_framework_utils.getListElement(v_txt1
                                                  ,v_pos2
                                                  ,pck_framework_utils.c_ListTrenn2);
    
      -- höchste Positionsnummer von Einträgen in einem Register holen, wo Status publiziert = 'PN' ist
      -- Positionen bis diesem Eintrag werden nicht geändert
      select nvl(max(h.vu_position), 0)
        into v_startnr
        from t_vu_header h
       where h.vu_register_id = v_txt2 -- 1. Element im Vektor v_txt1 entspricht vu_reg_id
         and h.vu_status = 'PN'
         and h.vu_aus_id = p_aus_id;
    
      -- bis mit den Rechten geklärt ist fangen wir immer mit dem ersten Dokument an:
      v_startnr := 0;
    
      while v_txt2 is not null loop
        -- Schleife über die Elemente eines Registers
        -- reg_id steht an Position 1, danach folgen vu_id's
        if v_pos2 > 1 then
          v_akt_pos := v_startnr + v_pos2 - 1; -- 1 subtrahieren, da eine Position von vu_reg_id belegt
          update t_vu_header h
             set h.vu_position = v_akt_pos
           where h.vu_id = v_txt2
          --             and h.vu_aus_id = p_aus_id
          ;
        end if;
      
        v_pos2 := v_pos2 + 1;
        v_txt2 := pck_framework_utils.getListElement(v_txt1
                                                    ,v_pos2
                                                    ,pck_framework_utils.c_ListTrenn2);
      end loop;
    
      v_pos1 := v_pos1 + 1;
      v_txt1 := pck_framework_utils.getListElement(p_reg_pos_string, v_pos1);
    end loop;
  
    commit;
  
  end;
  -------------------------------------------------------------------------------------
  procedure aus_output(p_dok_id number
                      ,p_state  varchar2
                      ,p_error  varchar2 default null
                      ,p_long   out long) is
  
    v_text varchar2(200);
  
  begin
  
    v_text := pck_framework_utils.c_xml_version || '<response';
    v_text := v_text || ' state="' || p_state || '">';
  
    if p_error is not null then
      v_text := v_text || '<error errnr="-40" description="' || p_error ||
                '"/>';
    end if;
  
    v_text := v_text || '<object id="' || p_dok_id || '"/></response>';
  
    p_long := v_text;
  end;

  ----------------------------------------------------------------------------
  function getAktAusVersion(p_aus_id number) return number is
    v_aus_version number;
  begin
    -- SL 22022006: gibt es keine Version der Ausschreibung, die bearbeitet werden kann, dann
    -- kümmert sich diese Prozedur um alles
    select max(h.aus_version)
      into v_aus_version
      from t_aus_header h
     where h.aus_id = p_aus_id;
  
    pck_ausschreibung.check_aus_version(p_aus_id   => p_aus_id
                                       ,p_vers_id  => v_aus_version
                                       ,p_new_vers => v_aus_version);
    return v_aus_version;
  end;
  ----------------------------------------------------------------------------
  procedure CheckDokPosition(p_aus_id  number
                            ,p_reg_alt number
                            ,p_reg_neu number) is
    v_i number;
  begin
    for c_register in (select h.vu_register_id
                         from t_vu_header h
                        where h.vu_aus_id = p_aus_id
                          and h.vu_register_id in (p_reg_alt, p_reg_neu)) loop
      v_i := 1;
      for c_position in (select h.vu_id
                           from t_vu_header h
                          where h.vu_aus_id = p_aus_id
                            and h.vu_register_id = c_register.vu_register_id
                          order by h.vu_position) loop
        update t_vu_header t
           set t.vu_position = v_i
         where t.vu_id = c_position.vu_id;
        v_i := v_i + 1;
      end loop;
    end loop;
    commit;
  end;
  ---------------------------------aus_dok_save-------------------------------
  -- SL 2005-06-02 erstellt
  -- SL 18082005: Anpassung an SchweigertService, der unterschiedliche Objekttypen liefern kann
  -- SL 15032006: Wenn ein 83er PDF/GAEB mit einer Ausschreibung zusammen publiziert wurde und das
  -- LV erneut bearbeitet wird, dann soll ein neues Dokument in vu_header angelegt werden. Der Vorteil ist,
  -- daß ein Bewerber die Unterschiede zwischen diesen Dokumenten erkennen kann.
  ----------------------------------------------------------------------------
  procedure aus_dok_save(p_aus_id      number
                        ,p_dok_id      number
                        ,p_sservice_ID number default null
                        ,p_file_name   varchar2 default null
                        ,p_titel       varchar2
                        ,p_art_id      number default 1
                        ,p_register_id number -- Schweigert schickt hier ObjektTypID
                        ,p_seiten      number
                        ,p_format      varchar2
                        ,p_farbe       varchar2
                        ,p_blob_rowid  rowid default null
                        ,p_mimetype    varchar2 default null
                        ,p_state       varchar2 default null
                        ,p_clob        out clob
                        ,p_long        out long) is
    v_position   number;
    v_lob_id     number;
    v_pos_id     number;
    v_par_id     number; -- vbel: das ist nicht zufällig genau unsere p_aus_id ??
    v_dok_id     number := p_dok_id;
    v_dok_id_neu number;
    --    v_sservice_id   number := p_sservice_ID;
    --    v_sservice_link number;
    v_type_vorh char(1) := 'N';
    v_cnt       number;
  
    v_state       varchar2(5) := 'ok';
    v_error       varchar2(100);
    v_file_name   t_vu_header.vu_file_name%type;
    v_file_type   t_vu_header.vu_file_type%type;
    v_status      varchar2(2);
    v_aus_version number;
  
    v_83_status varchar2(2);
    v_83_titel  boolean := false; -- gibt an, ob an den VU-Titel eine Versionsnummer gehangen werden soll
    --LBe für das Angebot:
    v_register_id number;
    -- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
    procedure doInsert is
      v_titel t_vu_header.vu_titel%type;
    begin
      if v_83_titel then
        -- wenn wir die AusschreibungsVersionsNummer dranhängen wollen, müssen wir aufpassen, daß der Platz reicht ....
        -- weil wir großzügig sind, erlauben wir auch noch 2stellige Versionsnummern .....
        if length(p_titel) < 58 then
          v_titel := p_titel || '-' || v_aus_version;
        else
          v_titel := substr(p_titel, 1, 57) || '-' || v_aus_version;
        end if;
      else
        v_titel := p_titel;
      end if;
      -- hochgeladenes Dokument
      if p_blob_rowid is not null then
        select SQ_LARGE_OBJECTS_ID.nextVal into v_lob_id from dual;
        insert into t_large_objects
          (lob_id, lob_objekt, lob_lastchange, lob_userid, lob_produserid)
          (select v_lob_id
                 ,lob
                 ,sysdate
                 ,blockbasta.pkg_dispatcher.g_sysuserid
                 ,blockbasta.pkg_dispatcher.g_produserid
             from t_tmp_blob
            where rowid = p_blob_rowid);
        delete t_tmp_blob where rowid = p_blob_rowid; -- temporären Eintrag löschen
      end if;
    
      -- Neues Dokument wird angelegt
      -- größte Positionsnummer für dieses Register abfragen
      -- und die Positionsnummer für das neue Dokument setzen       
      select nvl(max(h.vu_position), 0) + 1
        into v_position
        from t_vu_header h
       where h.vu_register_id = p_register_id
         and h.vu_aus_id = p_aus_id;
    
      -- Das Dokument an sich wird vom Framework direkt in der DB gespeichert (T_TMP_BLOB), da solche
      -- u.U. sehr großen Dateien nicht als Parameter übergeben werden können. Man erhält nur die
      -- rowid des Objektes, mit der dann gearbeitet werden kann.
      insert into t_vu_header
        (vu_id
        ,vu_titel
        ,vu_register_id
        ,vu_art_id
        ,vu_farbe
        ,vu_lob_id
        ,vu_seiten
        ,vu_papier_format
        ,vu_position
        ,vu_aus_id
        ,vu_status
        ,vu_file_name
        ,vu_file_type
        ,vu_mimetype
         --,vu_sservice_id
        ,vu_sysuser_id
        ,vu_lastchange
        ,vu_add_sysuserid
        ,vu_add_datum
         --,vu_sservice_link
         )
      values
        (sq_dok_id.nextval -- 
        ,v_titel
        ,p_register_id
        ,p_art_id
        ,p_farbe
        ,v_lob_id -- verweist auf Eintrag in t_large_objects
        ,p_seiten
        ,p_format
        ,v_position
        ,p_aus_id
         --LBe Dokumente für das Angebot 'BN'
        ,decode(blockbasta.pkg_dispatcher.g_applid
               ,pck_framework_utils.c_appl_angeb_abgabe
               ,pck_framework_utils.c_dok_status_zu_veroeff
               ,pck_framework_utils.c_status_inArbeit)
        ,v_file_name
        ,v_file_type
        ,p_mimetype
         --,v_sservice_id
        ,blockbasta.pkg_dispatcher.g_sysuserid -- Spalte wird bei jeder Änderung des Dokuments neu gesetzt (auf ID des Bearbeiters)
        ,sysdate -- Spalte wird bei jeder Änderung des Dokuments neu gesetzt
        ,blockbasta.pkg_dispatcher.g_sysuserid -- User, der Dokument hinzugefügt hat
        ,sysdate -- Datum, an dem Dokument hinzugefügt wurde
         --,v_sservice_link
         )
      returning vu_id into v_dok_id_neu;
    
      if blockbasta.pkg_dispatcher.g_applid in
         (pck_framework_utils.c_appl_stammdaten,
          pck_framework_utils.c_appl_adm_userdaten) then
        -- wenn wir aus Stammdaten kommen, dann erfolgt der Eintrag in t_sd_kontakt_doks
        insert into t_sd_kontakt_doks
          (kontaktid, vu_id)
        values
          (p_aus_id, sq_dok_id.currval); -- nextval
      else
        insert into t_objekt_baum
          (obj_id
          ,obj_type_id
          ,obj_par_id
          ,ob_produser_id
          ,ob_sysuser_id
          ,obj_titel
          ,obj_lastchange
          ,obj_status) -- added by SL 25082005
        values
          (sq_dok_id.currval -- nextval
           --  jmi:      ,pck_framework_utils.c_objTyp_VerdingungsUL
           -- Register-ID entspricht dem Objekttype, siehe pck_frameworkUtils.c_objTyp_aus_...
           -- und siehe t_vu_register
          ,p_register_id
          ,v_par_id
          ,blockbasta.pkg_dispatcher.g_produserid
          ,blockbasta.pkg_dispatcher.g_sysuserid
          ,v_titel
          ,sysdate
           --LBe Dokumente für das Angebot 'BN'
          ,decode(blockbasta.pkg_dispatcher.g_applid
                 ,pck_framework_utils.c_appl_angeb_abgabe
                 ,pck_framework_utils.c_dok_status_zu_veroeff
                 ,pck_framework_utils.c_status_inArbeit));
      end if;
    
    end;
    -- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
    procedure doUpdate is
      v_status        varchar2(2);
      v_titel         t_vu_header.vu_titel%type;
      v_reg_alt       number;
      v_newparent_id  number;
      v_register_type t_objekt_baum.obj_type_id%type;
    begin
      if v_83_titel then
        -- wenn wir die AusschreibungsVersionsNummer dranhängen wollen, müssen wir aufpassen, daß der Platz reicht ....
        -- weil wir großzügig sind, erlauben wir auch noch 2stellige Versionsnummern .....
        if length(p_titel) < 58 then
          v_titel := p_titel || '-' || v_aus_version;
        else
          v_titel := substr(p_titel, 1, 57) || '-' || v_aus_version;
        end if;
      else
        v_titel := p_titel;
      end if;
    
      select h.vu_register_id
        into v_reg_alt
        from t_vu_header h
       where h.vu_id = v_dok_id_neu;
    
      update t_vu_header h
         set h.vu_titel         = v_titel
            ,h.vu_register_id   = p_register_id
            ,h.vu_art_id        = p_art_id
            ,h.vu_farbe         = p_farbe
            ,h.vu_seiten        = p_seiten
            ,h.vu_papier_format = p_format
             --,h.vu_lob_id        = nvl(v_lob_id, h.vu_lob_id)
            ,h.vu_file_name  = nvl(v_file_name, vu_file_name)
            ,h.vu_file_type  = nvl(v_file_type, vu_file_type)
            ,h.vu_status     = nvl(p_state, h.vu_status)
            ,h.vu_sysuser_id = blockbasta.pkg_dispatcher.g_sysuserid
            ,h.vu_lastchange = sysdate
       where h.vu_id = v_dok_id_neu returning h.vu_lob_id, h.vu_status into
       v_lob_id, v_status;
    
      if blockbasta.pkg_dispatcher.g_applid not in
         (pck_framework_utils.c_appl_stammdaten,
          pck_framework_utils.c_appl_adm_userdaten) then
      
        if v_reg_alt != p_register_id then
          -- SL: 24052006: Wenn sich die Register geändert haben, dann muß der Eintrag im Baum auch an eine
          -- andere Stelle gehangen werden.
          --LBe 7_06_06 Exception eingefügt, da ohne Exception es nie zu nvl(v_newparent_id, b.obj_par_id) kommt
          --LBe: 7_06_06 die beide IF- added (für das Angebot angepasst)
          if blockbasta.pkg_dispatcher.g_applid =
             pck_framework_utils.c_appl_angeb_abgabe then
            v_register_type := pck_framework_utils.c_objTyp_Angebot;
          else
            v_register_type := pck_framework_utils.c_objTyp_VerdingungsUL_O;
          end if;
          if p_register_id = pck_framework_utils.c_objTyp_ang_NebenAngebot -- 26
           then
            v_register_id := pck_framework_utils.c_objTyp_ang_Angebot_Reg; -- -21;
          else
            v_register_id := -1 * p_register_id;
          end if;
          begin
            select o.obj_id
              into v_newparent_id
              from t_objekt_baum o
             where o.obj_par_id =
                   (select b.obj_id
                      from t_objekt_baum b
                     where b.ob_produser_id =
                           blockbasta.pkg_dispatcher.g_produserid
                       and b.obj_type_id = v_register_type
                    --pck_framework_utils.c_objTyp_VerdingungsUL_O
                     start with b.obj_id = v_dok_id_neu
                    connect by b.obj_id = prior b.obj_par_id)
               and o.obj_type_id = v_register_id; -- - (p_register_id);
          exception
            when no_data_found then
              v_newparent_id := null;
          end;
        
          CheckDokPosition(p_aus_id, v_reg_alt, p_register_id);
        end if;
      
        update t_objekt_baum b
           set b.obj_type_id   = p_register_id
              ,b.obj_titel     = v_titel
              ,b.obj_status    = v_status
              ,b.ob_sysuser_id = blockbasta.pkg_dispatcher.g_sysuserid
              ,b.obj_par_id    = nvl(v_newparent_id, b.obj_par_id)
         where b.obj_id = v_dok_id_neu;
      
        if sql%rowcount = 0 then
          v_state := 'error';
          v_error := 'ID des Dokuments unbekannt.';
        end if;
      end if;
    
      -- bei Bearbeitung: ganzes Dokument hochgeladen => Blob ersetzen
      if p_blob_rowid is not null then
        update t_large_objects t
           set t.lob_objekt = (select b.lob
                                 from t_tmp_blob b
                                where rowid = p_blob_rowid)
         where t.lob_id = v_lob_id;
        delete t_tmp_blob where rowid = p_blob_rowid; -- temporären Eintrag löschen
      end if;
    end;
    -- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
    -- ID eines Ordners abfragen, ausgehend von der Ausschreibung bis zum gesuchten Ordnertyp
    procedure getOrdnerID(p_ordner_type number, p_ordner_id out number) is
    begin
      -- wir suchen von der Ausschreibung her nach unten
      select b.obj_id
        into p_ordner_id
        from t_objekt_baum b
       where b.ob_produser_id = blockbasta.pkg_dispatcher.g_produserid
         and b.obj_type_id = p_ordner_type
       start with b.obj_id = p_aus_id
      connect by prior b.obj_id = b.obj_par_id;
    end;
    -- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
    -- versucht ID zu dem von Schweigert gelieferten Typ abzufragen
    -- geht das schief, dann den zugehörigen Oberordner zu diesem Typ liefern
    procedure getParentID(p_ordner_ab   number
                         ,p_type        number
                         ,p_type_ordner number
                         ,p_type_id     out number
                         ,p_type_vorh   out char) is
    begin
      begin
        -- ID des gewünschten Typen abfragen, ist dieser vorhanden: update, sonst insert
        select b.obj_id
          into p_type_id
          from t_objekt_baum b
         where b.ob_produser_id = blockbasta.pkg_dispatcher.g_produserid
           and b.obj_type_id = p_type -- Typ, der von Schweigert kommt
         start with b.obj_id = p_ordner_ab -- ausgehend von übergebener OrdnerID, ID zu Typ abfragen
        connect by prior b.obj_id = b.obj_par_id; -- nach unten suchen
        p_type_vorh := 'J';
      exception
        when no_data_found then
          -- Typ wurde nicht gefunden, erstmal ID vom übergeordneten VU-Ordner abfragen
          select b.obj_id
            into p_type_id
            from t_objekt_baum b
           where b.ob_produser_id = blockbasta.pkg_dispatcher.g_produserid
             and b.obj_type_id = -p_type_ordner -- minus ist wichtig, da es Ordner ist
          -- Ordner, unter dem der von Schweigert gelieferte Typ liegen soll
           start with b.obj_id = p_ordner_ab
          connect by prior b.obj_id = b.obj_par_id;
          p_type_vorh := 'N';
      end;
    end;
    -- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
  
  begin
    -- SL 14072005 geändert: redundante Information, da wir jetzt einen mimetype haben
    -- Spalte in Tabelle kann dann eigentlich gelöscht werden ...
  
    v_pos_id    := instr(p_file_name, '/', -1);
    v_file_name := substr(p_file_name
                         ,v_pos_id + 1
                         ,length(p_file_name) - v_pos_id);
    v_pos_id    := instr(v_file_name, '.', -1);
  
    if v_pos_id = 0 then
      v_pos_id := length(v_file_name) + 1;
    end if;
  
    v_file_type := substr(v_file_name
                         ,v_pos_id + 1
                         ,length(v_file_name) - v_pos_id);
    v_file_name := substr(v_file_name, 1, v_pos_id - 1);
  
    if p_sservice_ID is null then
      -- unsere Services
      if p_dok_id is null then
        -- jmi 22072005
        -- mit dieser Query bekommt man die Übergeordnete Ordner(Register)-ID in 
        -- Abhängigkeit von der RegisterID(Dem Dok-Typ)
        -- vbel: Unterscheidung für Kontakte und Ausschreibungen eingeführt
        --LBe: die erste Bedingung paßt auch für Angebote
        if blockbasta.pkg_dispatcher.g_applid not in
           (pck_framework_utils.c_appl_stammdaten,
            pck_framework_utils.c_appl_adm_userdaten) then
        
          if p_register_id = pck_framework_utils.c_objTyp_ang_NebenAngebot -- 26
           then
            v_register_id := pck_framework_utils.c_objTyp_ang_Angebot_Reg; -- -21;
          else
            v_register_id := -1 * p_register_id;
          end if;
          select b.obj_id
            into v_par_id
            from t_objekt_baum b
           where b.ob_produser_id = blockbasta.pkg_dispatcher.g_produserid
             and b.obj_type_id = v_register_id
           start with b.obj_id = p_aus_id
          connect by prior b.obj_id = b.obj_par_id;
          -- hier ist nicht ganz klar wozu so kompliziert vorgehen - geht doch einfacher - siehe unten.
          -- jmi 10102005: Hallo Vladimir ,
          -- ich habe eine Aus_ID in der Hand, darunter liegt ein Ordner vom Typ VU- Unterlagen, darunter
          -- liegen Ordner vom Typ Anschreiben, Plaene/Bilder etc., darunter soll das neue Objekt
          -- eingestellt werden 
          -- der Parent der Aus_id ist das DARÜBER liegende Los / Projekt ...,
          -- dort soll das Dokument bestimmt nicht landen 
          if blockbasta.pkg_dispatcher.g_applid !=
             pck_framework_utils.c_appl_angeb_abgabe then
            v_aus_version := getAktAusVersion(p_aus_id);
          end if;
        else
          -- vbel: diese query evtl. noch korrigieren
          -- ist für den Fall, dass es um einen Kontakt handelt und nicht eine Ausschreibung
          select b.parentid
            into v_par_id
            from t_sd_kontakt b
           where b.kontaktid = p_aus_id;
        end if;
        doInsert;
      else
        -- 2. Variable für ID, da bei SchweigertService 2 benötigt werden
        v_dok_id_neu := p_dok_id;
        doUpdate;
      end if;
    else
      -- - - - - - - - 
      -- jmi 18082005
      -- im Register 63 (LV) kommt es durch Schweigert zu Abweichungen
      -- wird die Proc als Webservice aufgerufen, ist die Dok-ID immer
      -- das Objekt in der Schweigert-Applikation, welches bearbeitet werden kann
      -- aus diesem Objekt, werden aber verschiedene in unserem Baum erzeugt
      --  c_objTyp_aus_Anschreiben_ss constant number := 611; (Siehe pck_framework_utils.spc)
      --  c_objTyp_aus_VertragsULAG_ss constant number := 621;
      --  c_objTyp_aus_LV_ss         constant number := 630;
      --  c_objTyp_aus_LV_ss_pdf_01  constant number := 631;
      --  c_objTyp_aus_LV_ss_pdf_02  constant number := 632;
      --  c_objTyp_aus_LV_ss_pdf_03  constant number := 633;
      --  c_objTyp_aus_LV_ss_gaeb_01  constant number := 634;
      --  c_objTyp_aus_LV_ss_gaeb_02  constant number := 635;
      --  c_objTyp_aus_LV_ss_gaeb_03  constant number := 636;
      -- Schweigert kennt nur die obj_id des Types 630, aber alle hier aufgeführten ObjTypes !
      -- von jedem Type kann es genau 1 Objekt geben, kommt von Schweigert ein
      -- Call für einen bereits existierenden Typ, heisst das update, sonst insert
      -- (mit eigener Objekt-ID in unserem Baum !! und in t_vu_haeder)
    
      case
      -- Die ersten beiden Fälle sind in der Handhabung gleich: Schweigert liefert als dok_id die ID zum Typ 630
      -- ID vom OberOrdner abfragen und ausgehend von dieser ID, die ID zum gelieferten Typen abfragen. Geht letzteres
      -- schief, dann ist der Typ noch nicht vorhanden und muß neu angelegt werden.
        when p_register_id =
             pck_framework_utils.c_objTyp_aus_Anschreiben_ss then
        
          getOrdnerID(p_ordner_type => pck_framework_utils.c_objTyp_aus_Anschreiben_Reg
                     ,p_ordner_id   => v_par_id);
        
          -- Schweigert schickt 0 mit, wenn ein neues Dok angelegt werden soll, sonst eine vorhandene ID
          if v_dok_id != 0 then
            getParentID(p_ordner_ab   => v_par_id
                       ,p_type        => pck_framework_utils.c_objTyp_aus_Anschreiben_ss
                       ,p_type_ordner => pck_framework_utils.c_objTyp_aus_Anschreiben
                       ,p_type_id     => v_par_id
                       ,p_type_vorh   => v_type_vorh);
          end if;
          if v_type_vorh = 'J' then
            -- ist der von Schweigert gelieferte Objekttyp bereits vorhanden, dann handelt es sich um ein Update
            v_dok_id_neu := v_par_id;
            doUpdate;
          else
            -- ansonsten wird dieser Typ neu angelegt
            -- die benötigte ParentID steht schon in v_par_id
            doInsert;
          end if;
        when p_register_id =
             pck_framework_utils.c_objTyp_aus_VertragsULAG_ss then
        
          getOrdnerID(p_ordner_type => pck_framework_utils.c_objTyp_aus_vertragsbed_Reg
                     ,p_ordner_id   => v_par_id);
        
          if v_dok_id != 0 then
            getParentID(p_ordner_ab   => v_par_id
                       ,p_type        => pck_framework_utils.c_objTyp_aus_VertragsULAG_ss
                       ,p_type_ordner => pck_framework_utils.c_objTyp_aus_VertragsUL_AG
                       ,p_type_id     => v_par_id
                       ,p_type_vorh   => v_type_vorh);
          end if;
          if v_type_vorh = 'J' then
            v_dok_id_neu := v_par_id;
            doUpdate;
          else
            doInsert;
          end if;
        when p_register_id in
             (pck_framework_utils.c_objTyp_aus_LV_ss,
              pck_framework_utils.c_objTyp_aus_LV_ss_pdf_81,
              pck_framework_utils.c_objTyp_aus_LV_ss_pdf_82,
              pck_framework_utils.c_objTyp_aus_LV_ss_pdf_83,
              pck_framework_utils.c_objTyp_aus_LV_ss_gaeb_81,
              pck_framework_utils.c_objTyp_aus_LV_ss_gaeb_82,
              pck_framework_utils.c_objTyp_aus_LV_ss_gaeb_83) then
        
          if p_register_id in
             (pck_framework_utils.c_objTyp_aus_LV_ss_pdf_83,
              pck_framework_utils.c_objTyp_aus_LV_ss_gaeb_83) then
            -- liefert ID des Ordners für Leistungsverzeichnisse   
            getOrdnerID(p_ordner_type => pck_framework_utils.c_objTyp_aus_LV_Reg
                       ,p_ordner_id   => v_par_id);
          else
            -- liefert ID des Ordners für Planungsunterlagen
            getOrdnerID(p_ordner_type => pck_framework_utils.c_objTyp_PlanungsU_O
                       ,p_ordner_id   => v_par_id);
          end if;
        
          if v_dok_id != 0 then
            if p_register_id = pck_framework_utils.c_objTyp_aus_LV_ss then
              -- versuchen, die ID des Elements mit dem übergebenen Typ abzufragen, erfolgreich update, sonst insert
              select count(*)
                into v_cnt
                from t_objekt_baum b
               where b.ob_produser_id =
                     blockbasta.pkg_dispatcher.g_produserid
                 and b.obj_type_id = p_register_id
                 and b.obj_id = p_dok_id;
            
              if v_cnt > 0 then
                v_type_vorh  := 'J';
                v_dok_id_neu := p_dok_id;
              else
                v_type_vorh := 'N';
              end if;
            else
              -- added by SL 31082205
              -- Zu jedem Typ 630 kann es die Elemente vom Typ 631-636 geben, d.h. es kann mehrere Elemente vom Typ 630 geben
              -- und dazu existieren dann die anderen Elemente. Diese müssen im Baum aber in der gleichen Ebene dargestellt
              -- werden (unter Ordner -63). Elemente mit Typ 631-636 erhalten in t_vu_header einen Verweis, zu welcher Datei
              -- vom Typ 630 sie gehören.
            
              v_type_vorh := 'J';
              begin
                select h.vu_id, h.vu_status
                  into v_dok_id_neu, v_83_status
                  from t_vu_header h
                 where h.vu_sservice_link = p_dok_id
                   and h.vu_register_id = p_register_id;
              
                -- doppelt vorhandene VU's können nur bei folgenden Typen auftreten
                if p_register_id in
                   (Pck_Framework_Utils.c_objTyp_aus_LV_ss_pdf_83,
                    pck_framework_utils.c_objTyp_aus_LV_ss_gaeb_83) then
                  v_83_titel    := true;
                  v_aus_version := getAktAusVersion(p_aus_id); -- ggf. neue AusVersion anlegen
                  -- damit haben wir in der Variablen v_aus_version auch die Erweiterung für den Titel
                  -- des Dokumentes stehen
                
                  -- wurde ein solches Dokument nur EINMAL gefunden, dann müssen wir uns den Status ansehen
                  if v_83_status != pck_framework_utils.c_status_inArbeit then
                    -- bei allen anderen Varianten als in Arbeit soll ein neues Dokument angelegt werden, also insert
                    v_type_vorh := 'N';
                  end if;
                  -- für in Arbeit befindliche Objekte wird ein Update gemacht, dafür hat die Variable
                  -- v_type_vorh schon den richtigen Wert
                end if;
              exception
                when no_data_found then
                  v_type_vorh := 'N';
                when too_many_rows then
                  -- von den 83er PDF/GAEB-Dateien kann es mehrere geben
                  -- Passiert, wenn eine Ausschreibung veröffentlicht wird und dann das LV erneut bearbeitet wird
                
                  v_83_titel    := true;
                  v_aus_version := getAktAusVersion(p_aus_id); -- ggf. neue AusVersion anlegen
                
                  begin
                    select h.vu_id, h.vu_status
                      into v_dok_id_neu, v_83_status
                      from t_vu_header h
                     where h.vu_sservice_link = p_dok_id
                       and h.vu_register_id = p_register_id
                       and h.vu_aus_version is null;
                    -- gibt es ein Dokument mit keiner VersionsID dann sind wir schon fertig, weil dieses
                    -- dann aktualisiert werden soll; v_type_vorh hat den passenden Wert
                  exception
                    when no_data_found then
                      -- wenn ein Dokument mit leerer VersionsID nicht gefunden wurde, sind wir auch
                      -- schon fertig, weil das Dokument dann als neues angelegt werden soll
                      -- (die VersionsID wird immer beim Publizieren in diese Spalte geschrieben)
                      v_type_vorh := 'N';
                  end;
              end;
            end if;
          end if;
        
          if v_type_vorh = 'J' then
            doUpdate;
          else
            if p_register_id != pck_framework_utils.c_objTyp_aus_LV_ss then
              --v_sservice_link := v_dok_id;
              null;
            end if;
            doInsert;
          end if;
        else
          v_state := 'error';
          v_error := 'Dieser Typ ist noch nicht implementiert.';
      end case; end if;
  
    commit;
  
    if blockbasta.pkg_dispatcher.g_applid in
       (pck_framework_utils.c_appl_stammdaten,
        pck_framework_utils.c_appl_adm_userdaten) then
      -- für Larissa 
      pck_sd_l.f_bearb_mask(p_kontaktid => p_aus_id
                           ,p_clob      => p_clob
                           ,p_long      => p_long);
    
    elsif p_sservice_ID is null then
      --LBe: Dieser Aufruf soll auch für das Angebot gelten
      f_aus_dok_zuord(p_dok_id => v_dok_id_neu
                     ,p_obj_id => p_aus_id
                     ,p_neu    => 'J'
                     ,p_clob   => p_clob
                     ,p_long   => p_long);
    else
      if p_register_id = pck_framework_utils.c_objTyp_aus_LV_ss
         and p_dok_id = 0 then
        -- wurde Element mit Typ 630 das erste Mal angelegt, dann diese ID zurückliefern
        aus_output(p_dok_id => v_dok_id_neu
                  ,p_state  => v_state
                  ,p_error  => v_error
                  ,p_long   => p_long);
      else
        -- ansonsten liefern wir immer die übergebene DokID zurück
        aus_output(p_dok_id => v_dok_id
                  ,p_state  => v_state
                  ,p_error  => v_error
                  ,p_long   => p_long);
      end if;
    end if;
  end;

  ---------------------aus_dok_delete_ask--------------------------------------  
  procedure aus_dok_delete_ask(p_sservice_id number default null
                              ,p_dok_id      number
                              ,p_clob        out clob
                              ,p_long        out long) is
  
    v_par_dok_id      tp_commandparam := tp_commandparam(typ => pck_framework_utils.c_param_type_hidden);
    v_par_sservice_id tp_commandparam := tp_commandparam(typ => pck_framework_utils.c_param_type_hidden);
  
    v_cmd_ok     tp_command := tp_command(typ => pck_framework_utils.c_command_type_link);
    v_cmd_cancel tp_command := tp_command(typ => pck_framework_utils.c_command_type_link);
  
    v_obj_titel t_objekt_baum.obj_titel%type;
  
    v_txtTab tp_texttab;
  
  begin
    v_par_dok_id.nam      := 'p_dok_id';
    v_par_dok_id.val      := p_dok_id;
    v_par_sservice_id.nam := 'p_sservice_id';
    v_par_sservice_id.val := p_sservice_id;
  
    v_cmd_ok.nam    := 'ok';
    v_cmd_ok.msgid  := 698;
    v_cmd_ok.target := pck_framework_utils.c_frame_f_contentmain;
    v_cmd_ok.action := c_package_name || '.' || c_proc_aus_dok_delete;
    v_cmd_ok.params := tp_commandparamtab(v_par_dok_id, v_par_sservice_id);
  
    v_cmd_cancel.nam    := 'cancel';
    v_cmd_cancel.msgid  := 108;
    v_cmd_cancel.target := pck_framework_utils.c_frame_f_contentmain;
    v_cmd_cancel.action := c_package_name || '.' || c_proc_f_aus_dok_zuord;
    v_cmd_cancel.params := tp_commandparamtab(v_par_dok_id);
  
    select b.obj_titel
      into v_obj_titel
      from t_objekt_baum b
     where b.obj_id = p_dok_id;
  
    v_txtTab := tp_texttab(tp_text(Num  => 1
                                  ,Text => pck_messagetext.getMessageText(989)
                                  ,Nam  => 'wirklich_frage')
                          ,tp_text(Num  => 2
                                  ,Text => v_obj_titel
                                  ,Nam  => 'titel')
                          ,tp_text(Num  => 3
                                  ,Text => pck_messagetext.getMessageText(14139)
                                  ,Nam  => 'grau_text_1')
                          ,tp_text(Num  => 4
                                  ,Text => pck_messagetext.getMessageText(411)
                                  ,Nam  => 'grau_text_2'));
  
    pck_framework_utils.getReturnHeadXML(p_err  => null
                                        ,p_cmd  => tp_commandtab(v_cmd_ok
                                                                ,v_cmd_cancel)
                                        ,p_tab  => null
                                        ,p_txt  => v_txtTab
                                        ,p_pack => c_package_name
                                        ,p_proc => c_proc_aus_dok_delete_ask
                                        ,p_clob => p_clob
                                        ,p_long => p_long);
  end aus_dok_delete_ask;

  ----------------------------------aus_dok_delete-----------------------------
  procedure aus_dok_delete(p_sservice_id number default null
                          ,p_dok_id      number
                          ,p_clob        out clob
                          ,p_long        out long) is
    v_reg_id      number;
    v_pos_id      number;
    v_aus_id      number;
    v_state_rueck varchar2(5) := 'ok';
    v_error       tp_error;
    v_errtext     varchar2(100);
    v_papierkorb  number;
    v_obj_titel   t_objekt_baum.obj_titel%type;
  
  begin
  
    -- changed by SL 01022006
    -- das Objekt wird in den Papierkorb verschoben
    -- später kann es dann aus dem Papierkorb richtig gelöscht werden
    --begin
    select h.vu_register_id, h.vu_position, h.vu_aus_id
      into v_reg_id, v_pos_id, v_aus_id
      from t_vu_header h
     where h.vu_id = p_dok_id;
  
    /* pck_proj_manag.delete_object(p_which_left => pck_proj_manag.c_MeineDaten
    ,p_obj_id     => p_dok_id
    ,p_obj_typ    => v_reg_id
    ,p_tp_error   => v_error);*/
  
    pck_proj_manag.delete_object(p_obj_id   => p_dok_id
                                ,p_obj_typ  => v_reg_id
                                ,p_tp_error => v_error);
  
    /*      update t_vu_header h
           set h.vu_status   = substr(h.vu_status, 1, 1) || 'J'
              ,h.vu_position = 0
         where h.vu_id = p_dok_id;
      
        select t.obj_id
          into v_papierkorb
          from t_objekt_baum t
         where t.obj_type_id =
               pck_framework_utils.c_objTyp_Papierkorb_Projekt_O
           and t.ob_produser_id = blockbasta.pkg_dispatcher.g_produserid;
      
        update t_objekt_baum t
           set t.obj_status     = substr(t.obj_status, 1, 1) || 'J'
              ,t.obj_par_id     = v_papierkorb
              ,t.obj_alt_par_id = blockbasta.pkg_dispatcher.g_appl_obj
              ,t.obj_lastchange = sysdate
         where t.obj_id = p_dok_id returning t.obj_titel into v_obj_titel;
      
        v_error := tp_error(Num  => pck_framework_utils.c_err_info
                           ,Text => pck_messagetext.getMessageText(14137
                                                                  ,TP_TextTab(TP_Text(Num  => 1
                                                                                     ,Text => v_obj_titel))));
        commit;
      
      exception
        when no_data_found then
          v_state_rueck := 'error';
          v_errtext     := 'ID des Dokuments unbekannt.';
      end;
    */
  
    -- SL 10042006: Da das delete_object die ObjektID aus dem StateVektor löscht, sollte sie hier wieder
    -- in den StateVektor geschrieben werden.
    blockbasta.pkg_dispatcher.g_appl_obj := v_aus_id;
  
    if p_sservice_id is null then
      f_aus_dok_zuord(p_dok_id => null
                      --,p_aus_id => v_aus_id
                     ,p_obj_id => v_aus_id
                     ,p_neu    => 'J'
                     ,p_error  => v_error
                     ,p_clob   => p_clob
                     ,p_long   => p_long);
    else
      aus_output(p_dok_id => p_dok_id
                ,p_state  => v_state_rueck
                ,p_error  => v_errtext
                ,p_long   => p_long);
    end if;
  end;
  -------------------------------------------------------------------------------------                        
  -- SL 14072005
  -- Service, der nur vom WebFrontend genutzt wird: setzt das Flag bei Schweigert-Lock
  procedure web_dok_lock(p_dok_id number
                        ,p_lock   varchar2
                        ,p_clob   out clob
                        ,p_long   out long) is
  
    v_state varchar2(5) := 'ok';
    v_error varchar2(100);
  
  begin
    --update t_vu_header h
    --   set h.vu_lock_schw = p_lock
    -- where h.vu_id = p_dok_id;
  
    if sql%rowcount = 0 then
      v_state := 'error';
      v_error := 'ID des Dokuments unbekannt.';
    end if;
  
    commit;
  
    aus_output(p_dok_id => p_dok_id
              ,p_state  => v_state
              ,p_error  => v_error
              ,p_long   => p_long);
  end;
  -------------------------------------------------------------------------------------                        
  function doc_recht(p_dok_id number default null
                    ,p_aus_id number
                    ,p_reg_id number) return t_objekt_status.obj_stat_id%type is
    v_ret         t_objekt_status.obj_stat_id%type;
    v_obj_type_id t_objekt_baum.obj_type_id%type;
    v_obj_status  t_objekt_baum.obj_status%type;
  begin
    if blockbasta.pkg_dispatcher.g_applid in
       (pck_framework_utils.c_appl_stammdaten,
        pck_framework_utils.c_appl_adm_userdaten) then
      return 'J';
    end if;
    --LBe - Überprüfung, ob Register Nebenangebot angezeigt werden darf für das Hinzufügen
    -- laut Peter Schroffner 16_06_06
    if blockbasta.pkg_dispatcher.g_applid =
       pck_framework_utils.c_appl_angeb_abgabe
       and pck_angebot_an.checkNebenangebot(p_aus_id) = 'N'
       and p_reg_id = pck_framework_utils.c_objTyp_ang_NebenAngebot then
      return null;
    end if;
  
    if p_dok_id is null then
      v_ret := pck_rechte_utils.Check_Recht(p_rechtesatz     => pck_rechte_utils.getRechtSatz4Obj(p_aus_id)
                                           ,p_obj_typ_id     => p_reg_id
                                           ,p_obj_status_old => pck_framework_utils.c_status_neu
                                           ,p_operation      => pck_framework_utils.c_recht_stell);
    else
      select b.obj_type_id, b.obj_status
        into v_obj_type_id, v_obj_status
        from t_objekt_baum b
       where b.obj_id = p_dok_id;
      v_ret := pck_rechte_utils.Check_Recht(p_rechtesatz     => pck_rechte_utils.getRechtSatz4Obj(p_dok_id)
                                           ,p_obj_typ_id     => p_reg_id
                                           ,p_obj_status_old => pck_obj_status.getStatusCode(p_obj_id      => p_dok_id
                                                                                            ,p_obj_status  => v_obj_status
                                                                                            ,p_obj_type_id => v_obj_type_id)
                                           ,p_operation      => pck_framework_utils.c_recht_umbenennen);
    end if;
    return v_ret;
  end doc_recht;
  -------------------------------------------------------------------------------------                          
end pck_aus_dokument;
