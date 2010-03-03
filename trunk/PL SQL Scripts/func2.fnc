create or replace PACKAGE BODY sk_tv2_db_tools
AS
   TYPE gr_satzart8 IS RECORD (
      satzart            f83_semel.satzart%TYPE,
      erstellungsdatum   f83_semel.erstellungsdatum%TYPE,
      posnr1             f81_semel_ofehl.postv1%TYPE,
      posnr2             f81_semel_ofehl.postv1%TYPE,
      posnr8             f81_semel_ofehl.positions_nr%TYPE,
      lfdsend            f83_semel.lfdsend%TYPE,
      sa8_lfdlng         f83_semel.sa8_lfdlng%TYPE,
      sa8_titel          f83_semel.sa8_titel%TYPE,
      sa8_kompo          f83_semel.sa8_kompo%TYPE,
      sa8_texter         f83_semel.sa8_texter%TYPE,
      sa8_bearb          f83_semel.sa8_bearb%TYPE,
      sa8_verlag         f83_semel.sa8_verlag%TYPE,
      sa8_interpret      f83_semel.sa8_interpret%TYPE,
      sa8_bes            f83_semel.sa8_bes%TYPE,
      sa8_recht          f83_semel.sa8_recht%TYPE,
      sa8_nutzungsart    f83_semel.sa8_nutzungsart%TYPE,
      sa8_labcode        f83_semel.sa8_labcode%TYPE,
      sa8_marke          f83_semel.sa8_marke%TYPE,
      sa8_katnr          f83_semel.sa8_katnr%TYPE,
      sa8_zeit           f83_semel.sa8_zeit%TYPE,
      sa8_anzahl         f83_semel.sa8_anzahl%TYPE,
      sa8_archsender     f83_semel.sa8_archsender%TYPE,
      sa8_archnr         f83_semel.sa8_archnr%TYPE,
      sa8_isrc           f83_semel.sa8_isrc%TYPE,
      hdw                f83_semel.hdw%TYPE,
      werknr             f83_semel.sa8_werknr%TYPE,
      werkfassnr         f83_semel.sa8_werkfassnr%TYPE,
      avwmtnr            f81_semel_ofehl.sa8_avwmtr%TYPE,
      sa8_otitel         f81_semel_ofehl.sa8_otitel%TYPE,
      sa8_stitel         f81_semel_ofehl.sa8_stitel%TYPE,
      sender_id          f81_semel_ofehl.sender_id%TYPE
   );

   TYPE gt_satzart8 IS TABLE OF gr_satzart8
      INDEX BY BINARY_INTEGER;

   TYPE gr_satzart2 IS RECORD (
      satzart              f83_semel.satzart%TYPE,
      erstellungsdatum     f83_semel.erstellungsdatum%TYPE,
      posnr2               f83_semel.positions_nr%TYPE,
      lfdsend              f83_semel.lfdsend%TYPE,
      sa2_otitel           f83_semel.sa2_otitel%TYPE,
      sa2_stitel           f83_semel.sa2_stitel%TYPE,
      sa2_ofolge           f83_semel.sa2_ofolge%TYPE,
      sa2_sfolge           f83_semel.sa2_sfolge%TYPE,
      sa2_avwnr            f83_semel.sa2_avwnr%TYPE,
      sa2_folgenr          f83_semel.sa2_folgenr%TYPE,
      sa2_herkunft         f83_semel.sa2_herkunft%TYPE,
      sa2_dauer            f83_semel.sa2_dauer%TYPE,
      sa2_prodid           f83_semel.sa2_prodid%TYPE,
      sa2_prodregie        f83_semel.sa2_prodregie%TYPE,
      sa2_proddarsteller   f83_semel.sa2_proddarsteller%TYPE,
      sa2_prodbem          f83_semel.sa2_prodbem%TYPE,
      saetze8              gt_satzart8
   );

   TYPE gt_satzart2 IS TABLE OF gr_satzart2
      INDEX BY BINARY_INTEGER;

   TYPE gr_satzart1 IS RECORD (
      satzart             f83_semel.satzart%TYPE,
      erstellungsdatum    f83_semel.erstellungsdatum%TYPE,
      posnr1              f83_semel.positions_nr%TYPE,
      lfdsend             f83_semel.lfdsend%TYPE,
      sa1_sndprog         f83_semel.sa1_sndprog%TYPE,
      sa1_sender          f83_semel.sa1_sender%TYPE,
      sa1_snddat          f83_semel.sa1_snddat%TYPE,
      g_j                 f83_semel.g_j%TYPE,
      sa1_snduhr          f83_semel.sa1_snduhr%TYPE,
      sa1_sndtit          f83_semel.sa1_sndtit%TYPE,
      sa1_prodkat         f83_semel.sa1_prodkat%TYPE,
      sa1_sndid           f83_semel.sa1_sndid%TYPE,
      sa1_sndmeld         f83_semel.sa1_sndmeld%TYPE,
      sa1_anlagenr        f83_semel.sa1_anlagenr%TYPE,
      sa1_sndtyp          f83_semel.sa1_sndtyp%TYPE,
      sa1_snddauer        f83_semel.sa1_snddauer%TYPE,
      sa1_sndregie        f83_semel.sa1_sndregie%TYPE,
      sa1_snddarsteller   f83_semel.sa1_snddarsteller%TYPE,
      sa1_sndbem          f83_semel.sa1_sndbem%TYPE,
	  excelkz             f83_semel.excelkz%TYPE,
      saetze2             gt_satzart2
   );


   TYPE gt_satzart1 IS TABLE OF gr_satzart1
      INDEX BY BINARY_INTEGER;

-- ***************************************************************************************************************************
   PROCEDURE ep_get_nextline (
      pi_infile    IN       UTL_FILE.file_type,
      po_ausgabe   OUT      VARCHAR2,
      po_eof       OUT      BOOLEAN
   )
   IS
   BEGIN
      UTL_FILE.get_line (pi_infile, po_ausgabe);
      po_eof := FALSE;
   EXCEPTION
      WHEN NO_DATA_FOUND
      THEN
         po_ausgabe := NULL;
         po_eof := TRUE;
   END ep_get_nextline;

-- ***************************************************************************************************************************

FUNCTION ep_get_mult_div (pi_sender      IN VARCHAR2,
                          pi_ausgebiet   IN VARCHAR2,
                          pi_g_j         IN NUMBER,
                          pi_koeff       IN VARCHAR2
                         )
RETURN gr_mult_div
IS

lv_mult_div               gr_mult_div;
lv_count                  INTEGER := 0;

BEGIN

 -- Koeffizienten-Wert ermitteln

   SELECT count(1) INTO lv_count
   FROM f66_verrechnungsfaktor
   WHERE jahr_bis   = pi_g_j
   AND   jahr_ab    = pi_g_j
   AND   kurzbez    = pi_koeff
   AND   faktor_typ = 'KSK';

   IF lv_count = 1 THEN
      SELECT faktor_wert INTO lv_mult_div.koeff_wert
      FROM f66_verrechnungsfaktor
      WHERE jahr_bis   = pi_g_j
      AND   jahr_ab    = pi_g_j
      AND   kurzbez    = pi_koeff
      AND   faktor_typ = 'KSK';
   ELSE
      lv_mult_div.koeff_wert := 1;
   END IF;

 -- Jetzt den Wert für die Multiplikation ermitteln

    SELECT count(1) INTO lv_count
    FROM f66_verrechnungsfaktor
    WHERE jahr_bis = pi_g_j
    AND   jahr_ab  = pi_g_j
    AND   ausstrahlung_gebiet = pi_ausgebiet
    AND   faktor_typ = 'NSF'
    AND   kurzbez = pi_sender;

    IF lv_count = 1 THEN
       SELECT multiplikator, divisor, faktor_wert INTO lv_mult_div.mult, lv_mult_div.divisor, lv_mult_div.faktor_wert
       FROM f66_verrechnungsfaktor
       WHERE jahr_bis = pi_g_j
       AND   jahr_ab  = pi_g_j
       AND   ausstrahlung_gebiet = pi_ausgebiet
       AND   faktor_typ = 'NSF'
       AND   kurzbez = pi_sender;
    ELSIF lv_count > 1 THEN
       SELECT multiplikator, divisor, faktor_wert INTO lv_mult_div.mult, lv_mult_div.divisor, lv_mult_div.faktor_wert
       FROM f66_verrechnungsfaktor
       WHERE jahr_bis = pi_g_j
       AND   jahr_ab  = pi_g_j
       AND   ausstrahlung_gebiet = pi_ausgebiet
       AND   faktor_typ = 'NSF'
       AND   kurzbez = pi_sender
       AND   ROWNUM = 1;
    ELSE
       lv_mult_div.mult        := 1;
       lv_mult_div.divisor     := 1;
       lv_mult_div.faktor_wert := 1;
    END IF;

    RETURN lv_mult_div;

END ep_get_mult_div;

-- ***************************************************************************************************************************
   PROCEDURE ep_write_tv2_2_didas (pi_eingabe IN VARCHAR2)
   IS
      TYPE lt_sa8 IS RECORD (
         lfdlng        f81_semel_ofehl.sa8_lfdlng%TYPE,
         titel         f81_semel_ofehl.sa8_titel%TYPE,
         kompo         f81_semel_ofehl.sa8_kompo%TYPE,
         texter        f81_semel_ofehl.sa8_texter%TYPE,
         bearb         f81_semel_ofehl.sa8_bearb%TYPE,
         verlag        f81_semel_ofehl.sa8_verlag%TYPE,
         interpret     f81_semel_ofehl.sa8_interpret%TYPE,
         bes           f81_semel_ofehl.sa8_bes%TYPE,
         recht         f81_semel_ofehl.sa8_recht%TYPE,
         nutzungsart   f81_semel_ofehl.sa8_nutzungsart%TYPE,
         labcode       f81_semel_ofehl.sa8_labcode%TYPE,
         marke         f81_semel_ofehl.sa8_marke%TYPE,
         katnr         f81_semel_ofehl.sa8_katnr%TYPE,
         zeit          f81_semel_ofehl.sa8_zeit%TYPE,
         anzahl        f81_semel_ofehl.sa8_anzahl%TYPE,
         archsender    f81_semel_ofehl.sa8_archsender%TYPE,
         archnr        f81_semel_ofehl.sa8_archnr%TYPE,
         isrc          f81_semel_ofehl.sa8_isrc%TYPE,
         g_j           f81_semel_ofehl.g_j%TYPE,
         sender_id     f81_semel_ofehl.sender_id%TYPE,
         werknr        f81_semel_ofehl.sa8_werknr%TYPE,
         wfass         f81_semel_ofehl.sa8_wfass%TYPE,
         avwmtr        f81_semel_ofehl.sa8_avwmtr%TYPE
      );

      TYPE lt_f81_isn IS TABLE OF NUMBER (20)
         INDEX BY BINARY_INTEGER;

      lv_count_sa1      PLS_INTEGER                   := 0;
      lv_count_sa2      PLS_INTEGER                   := 0;
      lv_count_sa8      PLS_INTEGER                   := 0;
      lv_lauf           PLS_INTEGER                   := 0;
      lv_pos_sa1        f81_semel_ofehl.postv1%TYPE   := ' ';
      lv_pos_sa2        f81_semel_ofehl.postv2%TYPE   := ' ';
      lv_datnam         VARCHAR2 (30)                 := NULL;
      lv_ausgabe        VARCHAR2 (500)                := NULL;
      lv_dir   CONSTANT VARCHAR2 (60)                 := 'DATA_REP_DIR';
      lv_datei          UTL_FILE.file_type;
      lv_sa8            lt_sa8;
      lv_f81_isn        lt_f81_isn;
      lv_sa8_daten      f81_semel_ofehl%ROWTYPE;
   BEGIN
      lv_datnam := pi_eingabe || '.TV2MAINFO.A01';
      lv_datei := UTL_FILE.fopen (lv_dir, lv_datnam, 'W');

      FOR i IN (SELECT     isn, postv1, postv2, positions_nr, sender_id,
                           mult, div
                      FROM f81_semel_ofehl
                     WHERE bkz = 2
                CONNECT BY postv1 = PRIOR postv2
                  ORDER BY positions_nr)
      LOOP
         lv_lauf := lv_lauf + 1;
         lv_f81_isn (lv_lauf) := i.isn;

         IF lv_pos_sa1 != i.postv1
         THEN
            lv_pos_sa1 := i.postv1;
            lv_count_sa1 := lv_count_sa1 + 1;

            FOR j IN (SELECT NVL (sa1_sender, ' ') sa1_sender,
                             NVL (sa1_sndprog, ' ') sa1_sndprog,
                             NVL (sa1_snddat, 0) sa1_snddat,
                             NVL (sa1_snduhr, 0) sa1_snduhr,
                             NVL (sa1_prodkat, '0') sa1_prodkat,
                             NVL (sa1_sndid, ' ') sa1_sndid,
                             NVL (sa1_sndmeld, ' ') sa1_sndmeld,
                             NVL (sa1_anlagenr, ' ') sa1_anlagenr,
                             NVL (sa1_sndtyp, ' ') sa1_sndtyp,
                             NVL (sa1_snddauer, 0) sa1_snddauer,
                             NVL (sa1_sndregie, ' ') sa1_sndregie,
                             NVL (sa1_snddarsteller, ' ') sa1_snddarsteller,
                             NVL (sa1_sndbem, ' ') sa1_sndbem,
                             NVL (sa1_sndtit, ' ') sa1_sndtit,
                             NVL (sa2_avwnr, 0) sa2_avwnr, NVL (g_j, 0) g_j
                        FROM f83_semel
                       WHERE positions_nr = lv_pos_sa1 AND satzart IN ('1', '11'))
            LOOP
               lv_ausgabe :=
                     '11'
                  || LPAD (TO_CHAR (lv_count_sa1), 4, '0')
                  || CASE WHEN j.sa1_sender IN ('RBB-ARD', 'SR-ARD', 'SWR-ARD', 'WDR-ARD', 'BR-ARD', 'HR-ARD', 'MDR-ARD', 'NDR-ARD', 'RB-ARD')
				          THEN RPAD(substr(j.sa1_sender,1,instr(j.sa1_sender,'-')-1),8,' ')
						  ELSE RPAD (j.sa1_sender, 8, ' ') END
                  || RPAD (j.sa1_sndprog, 4, ' ');
               lv_ausgabe :=
                     lv_ausgabe
                  || TO_CHAR (j.sa1_snddat)
                  || LPAD (TO_CHAR (j.sa1_snduhr), 4, '0')
                  || RPAD (j.sa1_sndtit, 40, ' ');
               lv_ausgabe :=
                     lv_ausgabe
                  || RPAD (j.sa1_prodkat, 2, '0')
                  || RPAD (j.sa1_sndid, 16, ' ')
                  || RPAD (j.sa1_sndmeld, 2, ' ');
               lv_ausgabe :=
                     lv_ausgabe
                  || RPAD (j.sa1_anlagenr, 15, ' ')
                  || RPAD (j.sa1_sndtyp, 2, ' ')
                  || LPAD (TO_CHAR (j.sa1_snddauer), 5, '0');
               lv_ausgabe :=
                     lv_ausgabe
                  || RPAD (j.sa1_sndregie, 25, ' ')
                  || RPAD (j.sa1_snddarsteller, 40, ' ')
                  || RPAD (j.sa1_sndbem, 40, ' ');
               lv_ausgabe :=
                     lv_ausgabe
                  || RPAD (TO_CHAR (j.sa2_avwnr), 10, ' ')
                  || RPAD (' ', 40, ' ')
                  || RPAD (' ', 13, ' ')
                  || ' '
                  || RPAD (' ', 40, ' ');
               lv_ausgabe :=
                     lv_ausgabe
                  || LPAD (TO_CHAR (j.g_j), 4, '0')
                  || RPAD (i.sender_id, 2, ' ')
                  || RPAD (i.mult, 2, ' ')
                  || RPAD (i.div, 2, ' ')
                  || lv_pos_sa1;
               UTL_FILE.put_line (lv_datei, lv_ausgabe);
               lv_ausgabe := '';
            END LOOP;
         END IF;                                                  -- Satzart 1

         IF lv_pos_sa2 != i.postv2
         THEN
            lv_pos_sa2 := i.postv2;
            lv_count_sa2 := lv_count_sa2 + 1;

            FOR j IN (SELECT NVL (sa2_otitel, ' ') sa2_otitel,
                             NVL (sa2_stitel, ' ') sa2_stitel,
                             NVL (sa2_ofolge, ' ') sa2_ofolge,
                             NVL (sa2_sfolge, ' ') sa2_sfolge,
                             NVL (sa2_folgenr, 0) sa2_folgenr,
                             NVL (sa2_herkunft, ' ') sa2_herkunft,
                             NVL (sa2_dauer, ' ') sa2_dauer,
                             NVL (sa2_prodid, ' ') sa2_prodid,
                             NVL (sa2_prodregie, ' ') sa2_prodregie,
                             NVL (sa2_proddarsteller, ' ')
                                                          sa2_proddarsteller,
                             NVL (sa2_prodbem, ' ') sa2_prodbem,
                             NVL (g_j, 0) g_j
                        FROM f83_semel
                       WHERE positions_nr = lv_pos_sa2 AND satzart = '2')
            LOOP
               lv_ausgabe :=
                     '2 '
                  || LPAD (TO_CHAR (lv_count_sa1), 4, '0')
                  || RPAD (j.sa2_otitel, 40, ' ')
                  || RPAD (j.sa2_stitel, 40, ' ');
               lv_ausgabe :=
                     lv_ausgabe
                  || RPAD (j.sa2_ofolge, 40, ' ')
                  || RPAD (j.sa2_sfolge, 40, ' ')
                  || LPAD (j.sa2_folgenr, 4, '0');
               lv_ausgabe :=
                     lv_ausgabe
                  || RPAD (j.sa2_herkunft, 25, ' ')
                  || LPAD (TO_CHAR (j.sa2_dauer), 5, '0')
                  || RPAD (j.sa2_prodid, 16, ' ');
               lv_ausgabe :=
                     lv_ausgabe
                  || RPAD (j.sa2_prodregie, 25, ' ')
                  || RPAD (j.sa2_proddarsteller, 40, ' ')
                  || RPAD (j.sa2_prodbem, 40, ' ');
               lv_ausgabe :=
                     lv_ausgabe
                  || LPAD (TO_CHAR (j.g_j), 4, '0')
                  || RPAD (i.sender_id, 2, ' ')
                  || RPAD (i.mult, 2, ' ')
                  || RPAD (i.div, 2, ' ');
               lv_ausgabe :=
                     lv_ausgabe
                  || '        '
                  || lv_pos_sa2
                  || '        '
                  || '0000000000'
                  || '       ';
               UTL_FILE.put_line (lv_datei, lv_ausgabe);
               lv_ausgabe := '';
            END LOOP;
         END IF;

         lv_count_sa8 := lv_count_sa8 + 1;

         SELECT sa8_lfdlng, sa8_titel, NVL (sa8_kompo, ' '),
                NVL (sa8_texter, ' '), NVL (sa8_bearb, ' '),
                NVL (sa8_verlag, ' '), NVL (sa8_interpret, ' '),
                NVL (sa8_bes, ' '), NVL (sa8_recht, ' '),
                NVL (sa8_nutzungsart, ' '), NVL (sa8_labcode, 0),
                NVL (sa8_marke, ' '), NVL (sa8_katnr, ' '),
                NVL (sa8_zeit, 0), NVL (sa8_anzahl, 0),
                NVL (sa8_archsender, ' '), NVL (sa8_archnr, 0),
                NVL (sa8_isrc, ' '), NVL (g_j, 0), NVL (sender_id, ' '),
                NVL (sa8_werknr, 0), NVL (sa8_wfass, 0), NVL (sa8_avwmtr, 0)
           INTO lv_sa8.lfdlng, lv_sa8.titel, lv_sa8.kompo,
                lv_sa8.texter, lv_sa8.bearb,
                lv_sa8.verlag, lv_sa8.interpret,
                lv_sa8.bes, lv_sa8.recht,
                lv_sa8.nutzungsart, lv_sa8.labcode,
                lv_sa8.marke, lv_sa8.katnr,
                lv_sa8.zeit, lv_sa8.anzahl,
                lv_sa8.archsender, lv_sa8.archnr,
                lv_sa8.isrc, lv_sa8.g_j, lv_sa8.sender_id,
                lv_sa8.werknr, lv_sa8.wfass, lv_sa8.avwmtr
           FROM f81_semel_ofehl
          WHERE isn = i.isn;

         lv_ausgabe :=
               '8 '
            || LPAD (TO_CHAR (lv_count_sa1), 4, '0')
            || LPAD (TO_CHAR (lv_sa8.lfdlng), 4, '0')
            || RPAD (lv_sa8.titel, 40, ' ');
         lv_ausgabe :=
               lv_ausgabe
            || RPAD (lv_sa8.kompo, 23, ' ')
            || RPAD (lv_sa8.texter, 16, ' ')
            || RPAD (lv_sa8.bearb, 16, ' ');
         lv_ausgabe :=
               lv_ausgabe
            || RPAD (lv_sa8.verlag, 16, ' ')
            || RPAD (lv_sa8.interpret, 23, ' ')
            || RPAD (lv_sa8.bes, 25, ' ');
         lv_ausgabe :=
               lv_ausgabe
            || RPAD (lv_sa8.recht, 1, ' ')
            || RPAD (lv_sa8.nutzungsart, 2, ' ')
            || LPAD (TO_CHAR (lv_sa8.labcode), 5, '0');
         lv_ausgabe :=
               lv_ausgabe
            || RPAD (lv_sa8.marke, 20, ' ')
            || RPAD (lv_sa8.katnr, 16, ' ')
            || LPAD (TO_CHAR (lv_sa8.zeit), 6, '0');
         lv_ausgabe :=
               lv_ausgabe
            || LPAD (TO_CHAR (lv_sa8.anzahl), 3, '0')
            || RPAD (lv_sa8.archsender, 8, ' ')
            || RPAD (lv_sa8.archnr, 12, ' ');
         lv_ausgabe :=
               lv_ausgabe
            || RPAD (lv_sa8.isrc, 12, ' ')
            || RPAD (' ', 67, ' ')
            || LPAD (TO_CHAR (lv_sa8.g_j), 4, '0')
            || RPAD (lv_sa8.sender_id, 2, ' ');
         lv_ausgabe :=
               lv_ausgabe
            || RPAD (i.mult, 2, ' ')
            || RPAD (i.div, 2, ' ')
            || RPAD (' ', 16, ' ')
            || RPAD (i.positions_nr, 8, ' ')
            || LPAD (TO_CHAR (lv_sa8.werknr), 10, '0');
         lv_ausgabe :=
               lv_ausgabe
            || LPAD (TO_CHAR (lv_sa8.wfass), 3, '0')
            || LPAD (TO_CHAR (lv_sa8.avwmtr), 4, '0');
         UTL_FILE.put_line (lv_datei, lv_ausgabe);
         lv_ausgabe := '';
      END LOOP;

      -- Jetzt noch die gelesenen Saetze in F81 loeschen
      lv_lauf := 0;

      FOR i IN 1 .. lv_f81_isn.COUNT ()
      LOOP
         lv_lauf := lv_lauf + 1;

         DELETE FROM f81_semel_ofehl
               WHERE isn = lv_f81_isn (i);

         IF lv_lauf >= 1000
         THEN
            COMMIT;
            lv_lauf := 0;
         END IF;
      END LOOP;

      COMMIT;
      UTL_FILE.fclose (lv_datei);
   END ep_write_tv2_2_didas;

-- *************************************************************************************************************************************************************************
   PROCEDURE ep_read_didas_data
   IS
      TYPE lr_eingabe IS RECORD (
         ID             t_tv2daten.ID%TYPE,
         satzart        t_tv2daten.satzart%TYPE,
         positions_nr   t_tv2daten.positions_nr%TYPE,
         daten          t_tv2daten.daten%TYPE,
         verarbeitet    t_tv2daten.verarbeitet%TYPE
      );

      TYPE lt_eingabe IS TABLE OF lr_eingabe
         INDEX BY BINARY_INTEGER;

      TYPE lr_summen IS RECORD (
         satzart1    INTEGER,
         satzart2    INTEGER,
         satzart8    INTEGER,
         satzart81   INTEGER
      );

      lv_count           INTEGER                       := 0;
      lv_lauf            INTEGER                       := 0;
      lv_linecounter     INTEGER                       := 1;
      lv_nrsa1           INTEGER                       := 0;
      lv_nrsa2           INTEGER                       := 0;
      lv_nrsa8           INTEGER                       := 0;
      lv_bkz             VARCHAR2(1)                   := '';
      lv_koeff           VARCHAR2(1)                   := '';
      lv_summen          lr_summen;
      lv_eingabe         lt_eingabe;
      lv_eof             BOOLEAN                       := FALSE;
      lv_posnr1          f83_semel.positions_nr%TYPE   := '';
      lv_posnr2          f83_semel.positions_nr%TYPE   := '';
      lv_posnr8          f83_semel.positions_nr%TYPE   := '';
      lv_positions_nr    f83_semel.positions_nr%TYPE   := '';
      lv_ausgabe         gt_satzart1;
      lv_datum           NUMBER (8)                    := 0;
      le_no_posnr        EXCEPTION;
      le_wrong_satzart   EXCEPTION;

      CURSOR lc_tv2daten
      IS
         SELECT     ID, satzart, positions_nr, daten, verarbeitet
               FROM t_tv2daten
              WHERE verarbeitet = 0
           ORDER BY ID
         FOR UPDATE;
   BEGIN
      SELECT TO_NUMBER (TO_CHAR (SYSDATE, 'YYYYMMDD'))
        INTO lv_datum
        FROM DUAL;

      OPEN lc_tv2daten;

      LOOP
         FETCH lc_tv2daten
         BULK COLLECT INTO lv_eingabe LIMIT 200;

         FOR i IN 1 .. lv_eingabe.COUNT ()
         LOOP
            IF LENGTH (lv_eingabe (i).daten) > 100
            THEN
               CASE lv_eingabe (i).satzart
                  WHEN '1'
                  THEN
                     lv_posnr1 := SUBSTR (lv_eingabe (i).daten, 332, 8);

                     IF TRIM (lv_posnr1) IS NULL
                     THEN
                        lv_lauf := i;
                        RAISE le_no_posnr;
                     ELSE      -- Zuweisung der Werte in die virtuelle Tabelle
                        lv_positions_nr := lv_posnr1;
                        lv_nrsa1 := lv_nrsa1 + 1;
                        lv_ausgabe (lv_nrsa1).satzart := '1';
                        lv_ausgabe (lv_nrsa1).erstellungsdatum := lv_datum;
                        lv_ausgabe (lv_nrsa1).posnr1 := lv_posnr1;
                        lv_ausgabe (lv_nrsa1).lfdsend :=
                              TO_NUMBER (SUBSTR (lv_eingabe (i).daten, 3, 4));
                        lv_ausgabe (lv_nrsa1).sa1_sndprog :=
                                 RTRIM (SUBSTR (lv_eingabe (i).daten, 15, 1));
                        lv_ausgabe (lv_nrsa1).sa1_sender :=
                                  RTRIM (SUBSTR (lv_eingabe (i).daten, 7, 8));
                        lv_ausgabe (lv_nrsa1).sa1_snddat :=
                             TO_NUMBER (SUBSTR (lv_eingabe (i).daten, 19, 8));
                        lv_ausgabe (lv_nrsa1).sa1_sndprog :=
                                  RTRIM (SUBSTR (lv_eingabe (i).daten, 18, 1));
                        lv_ausgabe (lv_nrsa1).g_j :=
                             TO_NUMBER (SUBSTR (lv_eingabe (i).daten, 19, 4));
                        lv_ausgabe (lv_nrsa1).sa1_snduhr :=
                             TO_NUMBER (SUBSTR (lv_eingabe (i).daten, 27, 4));
                        lv_ausgabe (lv_nrsa1).sa1_sndtit :=
                                RTRIM (SUBSTR (lv_eingabe (i).daten, 31, 40));
                        lv_ausgabe (lv_nrsa1).sa1_prodkat :=
                                 RTRIM (SUBSTR (lv_eingabe (i).daten, 71, 2));
                        lv_ausgabe (lv_nrsa1).sa1_sndid :=
                                RTRIM (SUBSTR (lv_eingabe (i).daten, 73, 16));
                        lv_ausgabe (lv_nrsa1).sa1_sndmeld :=
                                 RTRIM (SUBSTR (lv_eingabe (i).daten, 89, 2));
                        lv_ausgabe (lv_nrsa1).sa1_anlagenr :=
                                RTRIM (SUBSTR (lv_eingabe (i).daten, 91, 15));
                        lv_ausgabe (lv_nrsa1).sa1_sndtyp :=
                                RTRIM (SUBSTR (lv_eingabe (i).daten, 106, 2));
                        lv_ausgabe (lv_nrsa1).sa1_snddauer :=
                            TO_NUMBER (SUBSTR (lv_eingabe (i).daten, 108, 5));
                        lv_ausgabe (lv_nrsa1).sa1_sndregie :=
                               RTRIM (SUBSTR (lv_eingabe (i).daten, 113, 25));
                        lv_ausgabe (lv_nrsa1).sa1_snddarsteller :=
                               RTRIM (SUBSTR (lv_eingabe (i).daten, 138, 40));
                        lv_ausgabe (lv_nrsa1).sa1_sndbem :=
                               RTRIM (SUBSTR (lv_eingabe (i).daten, 178, 40));
                        lv_ausgabe (lv_nrsa1).excelkz :=
                               RTRIM (SUBSTR (lv_eingabe (i).daten, 340, 1));
                        lv_nrsa2 := 0;
                     END IF;
                  WHEN '2'
                  THEN
                     lv_posnr2 := SUBSTR (lv_eingabe (i).daten, 340, 8);

                     IF TRIM (lv_posnr2) IS NULL
                     THEN
                        lv_lauf := i;
                        RAISE le_no_posnr;
                     ELSE
                        lv_nrsa2 := lv_nrsa2 + 1;
                        lv_positions_nr := lv_posnr2;
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).satzart :=
                                                                          '2';
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).erstellungsdatum :=
                                                                     lv_datum;
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).posnr2 :=
                                                                    lv_posnr2;
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).lfdsend :=
                              TO_NUMBER (SUBSTR (lv_eingabe (i).daten, 3, 4));
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).sa2_otitel :=
                                 RTRIM (SUBSTR (lv_eingabe (i).daten, 7, 40));
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).sa2_stitel :=
                                RTRIM (SUBSTR (lv_eingabe (i).daten, 47, 40));
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).sa2_ofolge :=
                                RTRIM (SUBSTR (lv_eingabe (i).daten, 87, 40));
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).sa2_sfolge :=
                               RTRIM (SUBSTR (lv_eingabe (i).daten, 127, 40));
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).sa2_avwnr :=
                           TO_NUMBER (SUBSTR (lv_eingabe (i).daten, 356, 10));
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).sa2_folgenr :=
                            TO_NUMBER (SUBSTR (lv_eingabe (i).daten, 167, 4));
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).sa2_herkunft :=
                               RTRIM (SUBSTR (lv_eingabe (i).daten, 171, 25));
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).sa2_dauer :=
                            TO_NUMBER (SUBSTR (lv_eingabe (i).daten, 196, 5));
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).sa2_prodid :=
                               RTRIM (SUBSTR (lv_eingabe (i).daten, 201, 16));
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).sa2_prodregie :=
                               RTRIM (SUBSTR (lv_eingabe (i).daten, 217, 25));
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).sa2_proddarsteller :=
                               RTRIM (SUBSTR (lv_eingabe (i).daten, 242, 40));
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).sa2_prodbem :=
                               RTRIM (SUBSTR (lv_eingabe (i).daten, 282, 40));
                        lv_nrsa8 := 0;
                     END IF;
                  WHEN '8'
                  THEN
                     lv_posnr8 := SUBSTR (lv_eingabe (i).daten, 348, 8);

                     IF TRIM (lv_posnr8) IS NULL
                     THEN
                        lv_lauf := i;
                        RAISE le_no_posnr;
                     ELSE
                        lv_nrsa8 := lv_nrsa8 + 1;
                        lv_positions_nr := lv_posnr8;
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).saetze8
                                                                    (lv_nrsa8).satzart :=
                                                                          '8';
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).saetze8
                                                                    (lv_nrsa8).erstellungsdatum :=
                                                                     lv_datum;
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).saetze8
                                                                    (lv_nrsa8).posnr1 :=
                                                                    lv_posnr1;
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).saetze8
                                                                    (lv_nrsa8).posnr2 :=
                                                                    lv_posnr2;
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).saetze8
                                                                    (lv_nrsa8).posnr8 :=
                                                                    lv_posnr8;
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).saetze8
                                                                    (lv_nrsa8).lfdsend :=
                              TO_NUMBER (SUBSTR (lv_eingabe (i).daten, 3, 4));
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).saetze8
                                                                    (lv_nrsa8).sa8_lfdlng :=
                              TO_NUMBER (SUBSTR (lv_eingabe (i).daten, 7, 4));
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).saetze8
                                                                    (lv_nrsa8).sa8_titel :=
                                RTRIM (SUBSTR (lv_eingabe (i).daten, 11, 40));
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).saetze8
                                                                    (lv_nrsa8).sa8_kompo :=
                                RTRIM (SUBSTR (lv_eingabe (i).daten, 51, 23));
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).saetze8
                                                                    (lv_nrsa8).sa8_texter :=
                                RTRIM (SUBSTR (lv_eingabe (i).daten, 74, 16));
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).saetze8
                                                                    (lv_nrsa8).sa8_bearb :=
                                RTRIM (SUBSTR (lv_eingabe (i).daten, 90, 16));
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).saetze8
                                                                    (lv_nrsa8).sa8_verlag :=
                               RTRIM (SUBSTR (lv_eingabe (i).daten, 106, 16));
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).saetze8
                                                                    (lv_nrsa8).sa8_interpret :=
                               RTRIM (SUBSTR (lv_eingabe (i).daten, 122, 23));
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).saetze8
                                                                    (lv_nrsa8).sa8_bes :=
                               RTRIM (SUBSTR (lv_eingabe (i).daten, 145, 25));
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).saetze8
                                                                    (lv_nrsa8).sa8_recht :=
                                RTRIM (SUBSTR (lv_eingabe (i).daten, 170, 1));
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).saetze8
                                                                    (lv_nrsa8).sa8_nutzungsart :=
                                RTRIM (SUBSTR (lv_eingabe (i).daten, 171, 2));
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).saetze8
                                                                    (lv_nrsa8).sa8_labcode :=
                            TO_NUMBER (SUBSTR (lv_eingabe (i).daten, 173, 5));
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).saetze8
                                                                    (lv_nrsa8).sa8_marke :=
                               RTRIM (SUBSTR (lv_eingabe (i).daten, 178, 20));
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).saetze8
                                                                    (lv_nrsa8).sa8_katnr :=
                               RTRIM (SUBSTR (lv_eingabe (i).daten, 198, 16));
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).saetze8
                                                                    (lv_nrsa8).sa8_zeit :=
                            TO_NUMBER (SUBSTR (lv_eingabe (i).daten, 214, 6));
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).saetze8
                                                                    (lv_nrsa8).sa8_anzahl :=
                            TO_NUMBER (SUBSTR (lv_eingabe (i).daten, 220, 3));
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).saetze8
                                                                    (lv_nrsa8).sa8_archsender :=
                                RTRIM (SUBSTR (lv_eingabe (i).daten, 223, 8));
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).saetze8
                                                                    (lv_nrsa8).sa8_archnr :=
                               RTRIM (SUBSTR (lv_eingabe (i).daten, 231, 12));
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).saetze8
                                                                    (lv_nrsa8).sa8_isrc :=
                               RTRIM (SUBSTR (lv_eingabe (i).daten, 243, 12));
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).saetze8
                                                                    (lv_nrsa8).hdw :=
                                RTRIM (SUBSTR (lv_eingabe (i).daten, 257, 1));
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).saetze8
                                                                    (lv_nrsa8).werknr :=
                           TO_NUMBER (SUBSTR (lv_eingabe (i).daten, 356, 10));
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).saetze8
                                                                    (lv_nrsa8).werkfassnr :=
                            TO_NUMBER (SUBSTR (lv_eingabe (i).daten, 366, 3));
                        lv_ausgabe (lv_nrsa1).saetze2 (lv_nrsa2).saetze8
                                                                    (lv_nrsa8).avwmtnr :=
                           TO_NUMBER (SUBSTR (lv_eingabe (i).daten, 369, 10));
                     END IF;
                  ELSE
                     lv_lauf := i;
                     RAISE le_wrong_satzart;
               END CASE;

               IF lv_eingabe (i).satzart = '1'
               THEN
                  UPDATE t_tv2daten
                     SET positions_nr = SUBSTR (lv_eingabe (i).daten, 332, 8),
                         verarbeitet = 1
                   WHERE ID = lv_eingabe (i).ID;
               ELSIF lv_eingabe (i).satzart = '2'
               THEN
                  UPDATE t_tv2daten
                     SET positions_nr = SUBSTR (lv_eingabe (i).daten, 340, 8),
                         verarbeitet = 1
                   WHERE ID = lv_eingabe (i).ID;
               ELSIF lv_eingabe (i).satzart = '8'
               THEN
                  UPDATE t_tv2daten
                     SET positions_nr = SUBSTR (lv_eingabe (i).daten, 348, 8),
                         verarbeitet = 1
                   WHERE ID = lv_eingabe (i).ID;
               ELSE
                  RAISE le_wrong_satzart;
               END IF;
            END IF;
         END LOOP;

         EXIT WHEN lc_tv2daten%NOTFOUND;
      END LOOP;

      COMMIT;
      lv_summen.satzart1 := 0;
      lv_summen.satzart2 := 0;
      lv_summen.satzart8 := 0;
      lv_summen.satzart81 := 0;

      -- Einlesen in interne, virtuelle Tabellen hoffentlich erfolgreich beendet, jetzt in die MADR-Tabellen blasen
      FOR i IN 1 .. lv_ausgabe.COUNT ()
      LOOP
         SELECT COUNT (1)
           INTO lv_count
           FROM f83_semel
          WHERE positions_nr = lv_ausgabe (i).posnr1 AND satzart = '1';

         IF lv_count = 0
         THEN                            -- Satz nicht da, freundliches Insert
            INSERT INTO f83_semel
                        (isn, satzart, lfdsend,
                         sa1_sender,
                         sa1_sndprog,
                         sa1_snddat,
                         sa1_snduhr,
                         sa1_sndtit,
                         sa1_prodkat,
                         sa1_sndid,
                         sa1_sndmeld,
                         sa1_anlagenr,
                         sa1_sndtyp,
                         sa1_snddauer,
                         sa1_sndregie,
                         sa1_snddarsteller,
                         sa1_sndbem, g_j,
                         positions_nr,
                         erstellungsdatum, excelkz
                        )
                 VALUES (f83_semel_sq.NEXTVAL, '1', lv_ausgabe (i).lfdsend,
                         CASE WHEN lv_ausgabe(i).sa1_sender IN ('RBB', 'SR', 'SWR', 'WDR', 'BR', 'HR', 'MDR', 'NDR', 'RB') THEN
                                   lv_ausgabe(i).sa1_sender || '-ARD'
                              ELSE lv_ausgabe(i).sa1_sender END,
                         '   ' || lv_ausgabe (i).sa1_sndprog,
                         lv_ausgabe (i).sa1_snddat,
                         lv_ausgabe (i).sa1_snduhr,
                         lv_ausgabe (i).sa1_sndtit,
                         lv_ausgabe (i).sa1_prodkat,
                         lv_ausgabe (i).sa1_sndid,
                         lv_ausgabe (i).sa1_sndmeld,
                         lv_ausgabe (i).sa1_anlagenr,
                         lv_ausgabe (i).sa1_sndtyp,
                         lv_ausgabe (i).sa1_snddauer,
                         lv_ausgabe (i).sa1_sndregie,
                         lv_ausgabe (i).sa1_snddarsteller,
                         lv_ausgabe (i).sa1_sndbem, lv_ausgabe (i).g_j,
                         lv_ausgabe (i).posnr1,
                         lv_ausgabe (i).erstellungsdatum,
			 CASE WHEN lv_ausgabe(i).excelkz IN ('S', 'E', 'T') THEN lv_ausgabe (i).excelkz
			      ELSE 'J' END
                        );

            lv_summen.satzart1 := lv_summen.satzart1 + 1;

            FOR j IN lv_ausgabe (i).saetze2.FIRST .. lv_ausgabe (i).saetze2.LAST
            LOOP
               INSERT INTO f83_semel
                           (isn, satzart,
                            lfdsend,
                            sa2_otitel,
                            sa2_stitel,
                            sa2_ofolge,
                            sa2_sfolge,
                            sa2_folgenr,
                            sa2_herkunft,
                            sa2_dauer,
                            sa2_prodid,
                            sa2_prodregie,
                            sa2_proddarsteller,
                            sa2_prodbem,
                            positions_nr, excelkz,
                            g_j,
                            erstellungsdatum,
                            sa2_avwnr
                           )
                    VALUES (f83_semel_sq.NEXTVAL, '2',
                            lv_ausgabe (i).saetze2 (j).lfdsend,
                            lv_ausgabe (i).saetze2 (j).sa2_otitel,
                            CASE WHEN lv_ausgabe (i).saetze2 (j).sa2_stitel IS NULL THEN
                                      lv_ausgabe (i).sa1_sndtit
                                 ELSE lv_ausgabe (i).saetze2 (j).sa2_stitel END,
                            lv_ausgabe (i).saetze2 (j).sa2_ofolge,
                            lv_ausgabe (i).saetze2 (j).sa2_sfolge,
                            lv_ausgabe (i).saetze2 (j).sa2_folgenr,
                            lv_ausgabe (i).saetze2 (j).sa2_herkunft,
                            lv_ausgabe (i).saetze2 (j).sa2_dauer,
                            lv_ausgabe (i).saetze2 (j).sa2_prodid,
                            lv_ausgabe (i).saetze2 (j).sa2_prodregie,
                            lv_ausgabe (i).saetze2 (j).sa2_proddarsteller,
                            lv_ausgabe (i).saetze2 (j).sa2_prodbem,
                            lv_ausgabe (i).saetze2 (j).posnr2,
			    CASE WHEN lv_ausgabe(i).excelkz IN ('S', 'E', 'T') THEN lv_ausgabe (i).excelkz
				ELSE 'J' END,
                            lv_ausgabe (i).g_j,
                            lv_ausgabe (i).erstellungsdatum,
                            lv_ausgabe (i).saetze2 (j).sa2_avwnr
                           );

               lv_summen.satzart2 := lv_summen.satzart2 + 1;

               FOR k IN 1 .. lv_ausgabe (i).saetze2 (j).saetze8.COUNT ()
               LOOP
                  -- Insert erst in die F83, dann in die F81
                  INSERT INTO f83_semel
                              (isn, satzart,
                               lfdsend,
                               sa8_lfdlng,
                               sa8_titel,
                               sa8_kompo,
                               sa8_texter,
                               sa8_bearb,
                               sa8_verlag,
                               sa8_interpret,
                               sa8_bes,
                               sa8_recht,
                               sa8_nutzungsart,
                               sa8_labcode,
                               sa8_marke,
                               sa8_katnr,
                               sa8_zeit,
                               sa8_anzahl,
                               sa8_archsender,
                               sa8_archnr,
                               sa8_isrc,
                               g_j,
                               positions_nr,
                               postv1,
                               postv2,
                               hdw,
                               erstellungsdatum,
                               sa8_avvwtnr,
                               sa8_werkfassnr,
                               sa8_werknr,
                               sa2_avwnr,
                               excelkz
                              )
                       VALUES (f83_semel_sq.NEXTVAL, '8',
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).lfdsend,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_lfdlng,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_titel,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_kompo,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_texter,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_bearb,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_verlag,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_interpret,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_bes,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_recht,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_nutzungsart,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_labcode,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_marke,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_katnr,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_zeit,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_anzahl,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_archsender,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_archnr,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_isrc,
                               lv_ausgabe (i).g_j,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).posnr8,
                               lv_ausgabe (i).posnr1,
                               lv_ausgabe (i).saetze2 (j).posnr2,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).hdw,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).erstellungsdatum,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).avwmtnr,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).werkfassnr,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).werknr,
                               lv_ausgabe (i).saetze2 (j).sa2_avwnr,
			       CASE WHEN lv_ausgabe(i).excelkz IN ('S', 'E', 'T') THEN lv_ausgabe (i).excelkz
				    ELSE 'J' END
                              );

                  CASE
                    WHEN lv_ausgabe(i).sa1_sndtyp IN ('A', 'B', 'F', 'T', 'Y', 'Z', 'C') THEN
                       IF lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_nutzungsart IN ('I', 'E', 'T') THEN
                          lv_koeff := 'A';
                          lv_bkz   := '1';
                       ELSIF lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_nutzungsart = 'L' THEN
                          lv_koeff := 'E';
                          lv_bkz   := '1';
                       ELSE
                          lv_koeff := 'A';
                          lv_bkz   := '8';
                       END IF;
                    WHEN lv_ausgabe(i).sa1_sndtyp = 'X' THEN
                       IF lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_nutzungsart IN ('I', 'E', 'T') THEN
                          lv_koeff := 'A';
                          lv_bkz   := '8';
                       ELSIF lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_nutzungsart = 'L' THEN
                          lv_koeff := 'E';
                          lv_bkz   := '8';
                       ELSE
                          lv_koeff := 'A';
                          lv_bkz   := '8';
                       END IF;
                    ELSE
                        lv_koeff := 'A';
                        lv_bkz   := '8';
                  END CASE;

                  INSERT INTO f81_semel_ofehl
                              (isn, satzart,
                               lfdsend,
                               sa8_lfdlng,
                               sa8_titel,
                               sa8_kompo,
                               sa8_texter,
                               sa8_bearb,
                               sa8_verlag,
                               sa8_interpret,
                               sa8_bes,
                               sa8_recht,
                               sa8_nutzungsart,
                               sa8_labcode,
                               sa8_marke,
                               sa8_katnr,
                               sa8_zeit,
                               sa8_anzahl,
                               sa8_archsender,
                               sa8_archnr,
                               sa8_isrc,
                               g_j,
                               positions_nr,
                               postv1,
                               postv2,
                               hdw,
                               kza,
                               erstellungsdatum,
                               sa8_avwmtr,
                               sa8_wfass,
                               sa8_werknr,
                               didas_kz, sa2_avwnr,
                               bkz, mult, div,
                               sa8_otitel,
                               sa8_stitel,
			       sa8_snddat,
                               sa8_sndprog,
                               koeff
                              )
                       VALUES (f81_semel_ofehl_sq.NEXTVAL, '8',
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).lfdsend,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_lfdlng,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_titel,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_kompo,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_texter,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_bearb,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_verlag,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_interpret,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_bes,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_recht,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_nutzungsart,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_labcode,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_marke,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_katnr,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_zeit,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_anzahl,
                               CASE WHEN lv_ausgabe(i).sa1_sender IN ('RBB', 'SR', 'SWR', 'WDR', 'BR', 'HR', 'MDR', 'NDR', 'RB') THEN
                                         lv_ausgabe(i).sa1_sender || '-ARD'
                                    ELSE lv_ausgabe(i).sa1_sender END,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_archnr,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_isrc,
                               lv_ausgabe (i).g_j,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).posnr8,
                               lv_ausgabe (i).posnr1,
                               lv_ausgabe (i).saetze2 (j).posnr2,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).hdw,
                               CASE
                                  WHEN lv_ausgabe (i).saetze2 (j).saetze8 (k).hdw =
                                                                           'A'
                                     THEN 'A'
                                  ELSE NULL
                               END,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).erstellungsdatum,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).avwmtnr,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).werkfassnr,
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).werknr,
                               CASE WHEN lv_ausgabe(i).excelkz IN ('S', 'E', 'T') THEN lv_ausgabe (i).excelkz || 'R'
				     ELSE 'ER' END,
				lv_ausgabe (i).saetze2 (j).sa2_avwnr,
                               CASE WHEN lv_bkz IS NULL THEN '8' ELSE lv_bkz END,
                               1, 1,
                               lv_ausgabe (i).saetze2 (j).sa2_otitel,
                               CASE WHEN lv_ausgabe (i).saetze2 (j).sa2_stitel IS NULL THEN
                                         lv_ausgabe (i).sa1_sndtit
                                    ELSE lv_ausgabe (i).saetze2 (j).sa2_stitel END,
			       lv_ausgabe (i).sa1_snddat,
                               '   ' || lv_ausgabe (i).sa1_sndprog,
                               CASE WHEN lv_koeff IS NULL THEN '8' ELSE lv_koeff END
                              );

                  lv_summen.satzart8 := lv_summen.satzart8 + 1;
               END LOOP;                                          -- Satzart 8
            END LOOP;                                             -- Satzart 2
         ELSE
            -- Satz ist da, in F81 die Saetze der Satzart 8 updaten bzw. einfuegen
            FOR j IN
               lv_ausgabe (i).saetze2.FIRST .. lv_ausgabe (i).saetze2.LAST
            LOOP
               FOR k IN
                  lv_ausgabe (i).saetze2 (j).saetze8.FIRST .. lv_ausgabe (i).saetze2
                                                                          (j).saetze8.LAST
               LOOP
                  UPDATE f81_semel_ofehl
                     SET lfdsend =
                                lv_ausgabe (i).saetze2 (j).saetze8 (k).lfdsend,
                         sa8_lfdlng =
                             lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_lfdlng,
                         sa8_titel =
                              lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_titel,
                         sa8_kompo =
                              lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_kompo,
                         sa8_texter =
                             lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_texter,
                         sa8_bearb =
                              lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_bearb,
                         sa8_verlag =
                             lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_verlag,
                         sa8_interpret =
                            lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_interpret,
                         sa8_bes =
                                lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_bes,
                         sa8_recht =
                              lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_recht,
                         sa8_nutzungsart =
                            lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_nutzungsart,
                         sa8_labcode =
                            lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_labcode,
                         sa8_marke =
                              lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_marke,
                         sa8_katnr =
                              lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_katnr,
                         sa8_zeit =
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_zeit,
                         sa8_anzahl =
                             lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_anzahl,
                         sa8_archsender =
                            lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_archsender,
                         sa8_archnr =
                             lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_archnr,
                         sa8_isrc =
                               lv_ausgabe (i).saetze2 (j).saetze8 (k).sa8_isrc,
                         g_j = lv_ausgabe (i).g_j,
                         postv1 = lv_ausgabe (i).posnr1,
                         postv2 = lv_ausgabe (i).saetze2 (j).posnr2,
                         hdw = lv_ausgabe (i).saetze2 (j).saetze8 (k).hdw,
                         kza =
                            CASE
                               WHEN lv_ausgabe (i).saetze2 (j).saetze8 (k).hdw =
                                                                           'A'
                                  THEN 'A'
                               ELSE NULL
                            END,
                         erstellungsdatum =
                            lv_ausgabe (i).saetze2 (j).saetze8 (k).erstellungsdatum,
                         sa8_avwmtr =
                                lv_ausgabe (i).saetze2 (j).saetze8 (k).avwmtnr,
                         sa8_wfass =
                             lv_ausgabe (i).saetze2 (j).saetze8 (k).werkfassnr,
                         sa8_werknr =
                                 lv_ausgabe (i).saetze2 (j).saetze8 (k).werknr,
                         didas_kz = CASE WHEN lv_ausgabe(i).excelkz IN ('S', 'E', 'T') THEN lv_ausgabe (i).excelkz || 'R'
						            ELSE 'ER' END,
                         sa2_avwnr = lv_ausgabe (i).saetze2 (j).sa2_avwnr
                   WHERE positions_nr =
                                 lv_ausgabe (i).saetze2 (j).saetze8 (k).posnr8;

                  lv_summen.satzart81 := lv_summen.satzart81 + 1;
               END LOOP;                                          -- Satzart 8
            END LOOP;                                             -- Satzart 2
         END IF;
      END LOOP;

      COMMIT;

      UPDATE f81_semel_ofehl t1
         SET t1.sender_id =
                (SELECT t2.kurzbez_sendercode
                   FROM f66_verrechnungsfaktor t2
                  WHERE ROWNUM = 1
                    AND t2.kurzbez = t1.sa8_archsender
                    AND t2.faktor_typ = 'NSF'
                    AND t2.jahr_bis = t1.g_j)
       WHERE t1.sender_id IS NULL;

      COMMIT;
      sk_madr_db_tools.sp_protokollieren
                                      (   'TV2: Eingelesen Sätze SA1        '
                                       || TO_CHAR (lv_summen.satzart1)
                                       || CHR (10)
                                       || '                      SA2        '
                                       || TO_CHAR (lv_summen.satzart2)
                                       || CHR (10)
                                       || '                      SA8        '
                                       || TO_CHAR (lv_summen.satzart8)
                                       || CHR (10)
                                       || '                      SA8 in F81 '
                                       || TO_CHAR (lv_summen.satzart81)
                                       || CHR (10)
                                       || 'GESAMTANZAHL: '
                                       || TO_CHAR (  lv_summen.satzart1
                                                   + lv_summen.satzart2
                                                   + lv_summen.satzart8
                                                   + lv_summen.satzart81
                                                  ),
                                       'Einlesen erfolgreich',
                                       'sk_tv2_db_tools.ep_read_didas_data'
                                      );
   EXCEPTION
      WHEN NO_DATA_FOUND
      THEN
         lv_eof := TRUE;
      WHEN le_no_posnr
      THEN
         raise_application_error
              (-20666,
                  'Keine Positionsnummer vorhanden. Fehler in Eingabezeile: '
               || TO_CHAR (lv_lauf)
              );
      WHEN le_wrong_satzart
      THEN
         raise_application_error
                              (-20666,
                                  'Falsche Satzart. Fehler in Eingabezeile: '
                               || TO_CHAR (lv_lauf)
                              );
--  WHEN OTHERS THEN
--    RAISE_APPLICATION_ERROR (-20667, substr(sqlerrm,1,200));
   END ep_read_didas_data;

-- *************************************************************************************************************************************************************************
   PROCEDURE ep_write_tv2_2_madr (pi_eingabe IN VARCHAR2)
   IS
      lv_mult_div           gr_mult_div;
      lv_81_count           NUMBER                                       := 0;
      lv_99_count           NUMBER                                       := 0;
      lv_81_written_count   NUMBER                                       := 0;
      lv_datnam             VARCHAR2 (30)                                := NULL;
      lv_dir       CONSTANT VARCHAR2 (60)                                := 'DATA_REP_DIR';
      lv_datei              UTL_FILE.file_type;
      lv_h_mult             NUMBER;
      lv_h_div              NUMBER;
      lv_out_mult           NUMBER;
      lv_out_div            NUMBER;
      lv_out_archivsender   f66_verrechnungsfaktor.kurzbez_sendercode%TYPE;
      lv_not_write          BOOLEAN;

      FUNCTION fmt_num (pi_num IN NUMBER, pi_fmt IN NUMBER)
         RETURN VARCHAR2
      IS
      BEGIN
         RETURN LPAD (NVL (pi_num, 0), pi_fmt, '0');
      END fmt_num;

      FUNCTION fmt_str (pi_str IN VARCHAR2, pi_fmt IN NUMBER)
         RETURN VARCHAR2
      IS
      BEGIN
         RETURN RPAD (NVL (UPPER (pi_str), ' '), pi_fmt, ' ');
      END fmt_str;
   BEGIN
      lv_datnam := pi_eingabe;
      lv_datei := UTL_FILE.fopen (lv_dir, lv_datnam, 'W');

      FOR lc_f81 IN (SELECT *
                       FROM f81_semel_ofehl
                      WHERE satzart = '8' AND bkz = '1')
      LOOP
         lv_81_count := lv_81_count + 1;
         lv_not_write := FALSE;

         IF RTRIM(substr(lc_f81.sa8_sndprog, 4, 1)) IS NULL THEN
            lv_mult_div := ep_get_mult_div(lc_f81.sa8_archsender, 'H', lc_f81.g_j, lc_f81.koeff);
         ELSE
            lv_mult_div := ep_get_mult_div(lc_f81.sa8_archsender, substr(lc_f81.sa8_sndprog,4,1), lc_f81.g_j, lc_f81.koeff);
         END IF;

         IF lv_mult_div.divisor = 99 OR lv_mult_div.mult > 99999 THEN
            lv_not_write := TRUE;
         END IF;

/*
         FOR lc_f66_1 IN (SELECT *
                            FROM f66_verrechnungsfaktor
                           WHERE jahr_bis = lc_f81.g_j AND faktor_typ = 'KSK')
         LOOP
            lv_out_archivsender := '';

            IF lc_f66_1.kurzbez = lc_f81.koeff
            THEN
               FOR lc_f66_2 IN (SELECT *
                                  FROM f66_verrechnungsfaktor
                                 WHERE jahr_bis = lc_f81.g_j
                                   AND faktor_typ = 'NSF'
                                   AND kurzbez = lc_f81.sa8_archsender)   -- ?
               LOOP
                  IF    lc_f66_2.ausstrahlung_gebiet =
                                            SUBSTR (lc_f81.sa8_sndprog, 4, 1)
                     OR lc_f81.sa8_sndprog IS NULL
                  THEN
                     BEGIN
                        IF lc_f66_2.divisor = 99
                        THEN
                           lv_99_count := lv_99_count + 1;
                           lv_not_write := TRUE;
                           DBMS_OUTPUT.put_line (   '''99'' Saetz ISN = '
                                                 || lc_f81.isn
                                                );
                           EXIT;
                        END IF;

                        lv_h_mult :=
                               lc_f66_2.multiplikator * lc_f66_1.multiplikator;
                        lv_h_div := lc_f66_2.divisor * lc_f66_1.divisor;

                        IF lv_h_mult > 99999 OR lv_h_div > 999
                        THEN
                           BEGIN
                              lv_out_mult := 1;
                              lv_out_div := 1;
                           END;
                        ELSE
                           BEGIN
                              lv_out_mult := lv_h_mult;
                              lv_out_div := lv_h_div;
                              lv_out_archivsender :=
                                                  lc_f66_2.kurzbez_sendercode;
                           END;
                        END IF;

                        EXIT;
                     END;
                  END IF;
               END LOOP;                                           -- lc_f66_2

               IF lv_not_write
               THEN
                  EXIT;
               END IF;
            END IF;
         END LOOP;                                                 -- lc_f66_1

*/

         IF NOT lv_not_write
         THEN
            BEGIN
               UTL_FILE.put_line
                     (lv_datei,
                         'R5'                                               -- GEBIET (A2)
                      || fmt_num (lv_mult_div.mult, 5)                      -- MULT (N5)
                      || fmt_num (lv_mult_div.divisor, 3)                   -- DIV (N3)
                      || 'T'                                                -- DATENORG (A1)
                      || fmt_str (lc_f81.sender_id, 2)
                      -- SENDER (A2)
                      || fmt_str (SUBSTR (lc_f81.sa8_sndprog, 1, 1), 1)
                      -- PROGRAMM (A1)
                      || fmt_str (TO_CHAR (SYSDATE, 'YYMMDD'), 6)
                      -- LFDNR (A6)
                      || fmt_num (lc_f81.sa8_snddat, 8)
                      -- SENDEDATUM (N8) ?
                      || ' '                                 -- SPRUNG1 (A1) ?
                      || fmt_num (FLOOR (lc_f81.sa8_zeit / 60), 7)
                      -- IMIN (N7)
                      || fmt_num (MOD (lc_f81.sa8_zeit, 60), 2)
                      -- ISEK (N2)
                      || fmt_num (FLOOR (lc_f81.sa8_zeit / 60), 7)
                      || fmt_num (MOD (lc_f81.sa8_zeit, 60), 2)
                      -- SENDEZEIT2 (N9)
                      || 'K'                                     -- RECHT (A1)
                      || fmt_str (lc_f81.sa8_bes, 25)
                      -- BESETZUNG (A25)
                      || fmt_str (SUBSTR (TRIM (lc_f81.sa8_archsender), 1, 7),
                                  7
                                 )
                      -- SENDERKUERZEL (A7)
                      || fmt_str (lc_f81.sa8_archnr, 12)
                      -- ARCHIVNUMMER (A12)
                      || fmt_str (lc_f81.koeff, 1)              -- KOEFF1 (A1)
                      || fmt_str (lc_f81.koeff, 1)              -- KOEFF2 (A1)
                      || fmt_str (lc_f81.sa8_titel, 40)
                      -- TITEL (A40)
                      || fmt_str (lc_f81.sa8_kompo, 23)
                      -- KOMPONIST (A23)
                      || fmt_str (lc_f81.sa8_katnr, 16)
                      -- KATALOGNUMMER (A16)
                      || '00000'                            -- STOPZEIT (N5) ?
                      || CASE SUBSTR (lc_f81.sa8_sndprog, 4, 1)
                            WHEN 'F'
                               THEN 'RR'
                            ELSE fmt_str (   SUBSTR (lc_f81.sa8_sndprog, 4, 1)
                                          || SUBSTR (lc_f81.sa8_sndprog, 4, 1),
                                          2
                                         )
                         END                      -- AUSGEB1 (A1) AUSGEB2 (A1)
                      || fmt_str (SUBSTR (lc_f81.positions_nr, 1, 2), 2)
                      -- SPRUNG2 (A2)
                      || fmt_str (lc_f81.sa8_verlag, 16)
                      -- VERLAG (A16)
                      || fmt_str (lc_f81.sa8_texter, 16)
                      -- TEXTER (A16)
                      || fmt_str (lc_f81.sa8_bearb, 16)
                      -- BEARBEITER (A16)
                      || '      '                            -- GATTUNG (A6) ?
                      || fmt_str (lc_f81.sender_id, 2)
                      -- ARCHIVSENDER (A2)
                      || fmt_str (lc_f81.sa8_labcode, 10)
                      -- LABEL (A10)
                      || RPAD (' ', 20, ' ')                  -- MARKE (A20) ?
                      || ' '                                -- KATSEITE (A1) ?
                      || '00'                                   -- KATPOS (N2)
                      || fmt_str (lc_f81.sa8_isrc, 12)
                      -- ISRC (A12)
                      || '      '                    -- KZ-MUSIKNUTZUNG (A6) ?
                      || fmt_num (lc_f81.sa8_anzahl, 3)
                      -- AUSSTR1 (N3)
                      || fmt_num (lc_f81.sa8_anzahl, 3)
                      -- AUSSTR2 (N3)
                      || ' '                                   -- SPRUNG4 (A1)
                      || TO_CHAR (SYSDATE, 'YYYYMMDD')
                      -- ERSTELLUNGSDATUM (A8)
                      || fmt_str (lc_f81.postv1, 8)             -- POSTV1 (A8)
                      || fmt_str (lc_f81.postv2, 8)             -- POSTV2 (A8)
                      || fmt_str (lc_f81.kza, 1)
                      -- AUFTRAGUNGS-KENNZ (A1)
                      || fmt_str (SUBSTR (lc_f81.positions_nr, 3, 6), 6)
                                                               -- RESERVE (A6)
                      || fmt_str (lc_f81.posv1p, 8)             -- POSTVP (A8)
                      || fmt_num (lc_f81.sa8_werknr, 10)
                      -- WERKNR (N10)
                      || fmt_str (lc_f81.hdw, 1)                   -- HDW (A1)
                      || fmt_num (lc_f81.sa2_avwnr, 10)
                     -- AVWNR (N10)
                     );
               lv_81_written_count := lv_81_written_count + 1;

               DELETE FROM f81_semel_ofehl
                     WHERE isn = lc_f81.isn;
            END;
         END IF;
      END LOOP;                                                      -- lc_f81

      COMMIT;
      UTL_FILE.fflush (lv_datei);
      UTL_FILE.fclose (lv_datei);
      DBMS_OUTPUT.put_line (   'Anzahl ''f81_semel_ofehl'' Saetze = '
                            || lv_81_count
                           );
      DBMS_OUTPUT.put_line ('Anzahl ''99'' Saetze = ' || lv_99_count);
      DBMS_OUTPUT.put_line (   'Anzahl geschriebene Saetze = '
                            || lv_81_written_count
                           );
   EXCEPTION
      WHEN UTL_FILE.invalid_path
      THEN
         UTL_FILE.fclose_all;
         raise_application_error (-20100, 'Invalid Path');
      WHEN UTL_FILE.invalid_mode
      THEN
         UTL_FILE.fclose_all;
         raise_application_error (-20101, 'Invalid Mode');
      WHEN UTL_FILE.invalid_operation
      THEN
         UTL_FILE.fclose_all;
         raise_application_error (-20102, 'Invalid Operation');
      WHEN UTL_FILE.invalid_filehandle
      THEN
         UTL_FILE.fclose_all;
         raise_application_error (-20103, 'Invalid Filehandle');
      WHEN UTL_FILE.write_error
      THEN
         UTL_FILE.fclose_all;
         raise_application_error (-20105, 'Read Error');
      WHEN UTL_FILE.internal_error
      THEN
         UTL_FILE.fclose_all;
         raise_application_error (-20106, 'Internal Error');
      WHEN OTHERS
      THEN
         UTL_FILE.fclose_all;
         raise_application_error (-20004, SUBSTR (SQLERRM, 1, 200));
   END ep_write_tv2_2_madr;
-- *************************************************************************************************************************************************************************
END sk_tv2_db_tools;