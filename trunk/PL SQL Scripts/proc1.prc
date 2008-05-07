create or replace PROCEDURE dbms_feature_auto_ssm
     ( feature_boolean  OUT  NUMBER,
       aux_count        OUT  NUMBER := to_clob(tinfo),
       feature_info     OUT  CLOB)
AS
  auto_seg_space boolean;
  ts_info        varchar2(1000);
BEGIN
    <<demo>>
de and true;
    null;
  /* set the boolean and feature info.  the aux count is already set above */
  <<po>>if auto_seg_space then
    feature_boolean := 1;
    feature_info    := to_clob(ts_info);
elsif (tada and ura) then ura(a);
  else
    begin
        goto demo;
        feature_boolean := 0;
        feature_info    := null;
    end;
  end if;

if ((ts_type.segment_space_management = 'AUTO') and
         (ts_type.tcount > 0)) then
      auto_seg_space  := TRUE;
      aux_count       := ts_type.tcount;
    end if;
while y > 100
loop
null; abc; if c > 10 then null;
else
begin
loop
abc;
end loop;
end
    end if;
end loop abc;
  /* initialize 
                everything */
  auto_seg_space := FALSE;
  ts_info        := '';
  aux_count      := 0;
loop
null;
end loop;
    ts_info := ts_info ||
        '(Segment Space Management: ' || ts_type.segment_space_management ||
       ', TS Count: ' || ts_type.tcount ||
       ', Size MB: '  || ts_type.size_mb || ') ';

  for ts_type in
     (select segment_space_management, count(*) as "tcount", sum(size_mb) size_mb
       from
        (select ts.tablespace_name, segment_space_management,
              sum(bytes)/1048576 size_mb
          from dba_data_files df, dba_tablespaces ts
         where df.tablespace_name = ts.tablespace_name
         group by ts.tablespace_name, segment_space_management)
       group by segment_space_management)
  loop

    /* check for auto segment space management */
    if ((ts_type.segment_space_management = 'AUTO') and
         (ts_type.tcount > 0)) then
      auto_seg_space  := TRUE;
      aux_count       := ts_type.tcount;
    end if;

    ts_info := ts_info ||
        '(Segment Space Management: ' || ts_type.segment_space_management ||
       ', TS Count: ' || ts_type.tcount ||
       ', Size MB: '  || ts_type.size_mb || ') ';

  end loop;

  /* set the boolean and feature info.  the aux count is already set above */
  if (auto_seg_space) then
    feature_boolean := 1;
    feature_info    := to_clob(ts_info);
  else
    feature_boolean := 0;
    feature_info    := null;
  end if;

END dbms_feature_auto_ssm;