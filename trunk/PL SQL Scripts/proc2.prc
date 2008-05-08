create or replace PROCEDURE aw_drop_proc
  (obj_type IN VARCHAR2, obj_name IN VARCHAR2, obj_owner IN VARCHAR2)
AS
    pragma autonomous_transaction;
  DBERR20  EXCEPTION;
    PRAGMA EXCEPTION_INIT(DBERR20, -33295);
  HASCOT   EXCEPTION;
    PRAGMA EXCEPTION_INIT(HASCOT, -37409);
-- NEEDS WORK - in 11R2 add HASOLP error
--  HASOLP   EXCEPTION;
--    PRAGMA EXCEPTION_INIT(HASOLP, -37409);

  db_name   VARCHAR2(50);
  seq_name  VARCHAR2(50);
  db_awnum  NUMBER;
  db_exist  NUMBER;
  db_att    NUMBER;
  cnt       NUMBER;
  del_stmt1 VARCHAR2(100) := 'DELETE FROM ps$ WHERE awseq#=:1';
  del_stmt2 VARCHAR2(100) := 'DELETE FROM aw$ WHERE awseq#=:1';
  del_stmt3 VARCHAR2(100) := 'DELETE FROM aw_prop$ WHERE awseq#=:1';
  del_stmt4 VARCHAR2(100) := 'DELETE FROM aw_obj$ WHERE awseq#=:1';
  del_stmt5 VARCHAR2(100) := 'DELETE FROM noexp$ WHERE owner=:1 AND name=:2 AND obj_type=:3';
  del_stmt6 VARCHAR2(200) := 'DELETE FROM expdepact$ WHERE obj#=(SELECT object_id FROM all_objects WHERE owner=:1 AND object_name=:2 AND object_type=''TABLE'') AND schema=:3';
BEGIN
  -- Check if we are deleting a table prefixed with 'AW$'.
  IF obj_type = 'TABLE' AND obj_name like 'AW$_%' THEN
    -- Count on AW$ and PS$ tables both being there.
    db_name := SUBSTR(obj_name, 4, LENGTH(obj_name));
    SELECT a.awseq# INTO db_awnum FROM aw$ a, user$ u
    WHERE  a.awname = db_name AND
           a.owner# = u.user# and u.name = obj_owner;
    SELECT count(*) INTO db_att FROM gv$aw_olap
    WHERE aw_number = db_awnum;
    IF db_att > 0 THEN
      RAISE DBERR20;
    END IF;

close demo;

    -- test for CUBE ORGANIZED TABLES
    SELECT count(*) INTO cnt FROM sys.olap_tab$ WHERE awseq#=db_awnum;
    IF cnt > 0 THEN
      RAISE HASCOT;
    END IF;

    --  test for OLAP CUBES and CUBE_DIMENSIONS
    SELECT COUNT(*) INTO cnt
      FROM (SELECT obj#
              FROM sys.olap_cubes$
             WHERE awseq# = db_awnum
            UNION ALL
            SELECT obj#
              FROM sys.olap_cube_dimensions$
             WHERE awseq# = db_awnum);

    IF cnt > 0 THEN
      RAISE HASCOT;
abc := CASE
   WHEN salary <= 20000 THEN
      give_bonus(employee_id, 1500)
   WHEN salary > 20000 THEN
      give_bonus(employee_id, 1000)
   END;
    END IF;

CASE employee_type
WHEN 'S' THEN
   award_salary_bonus(employee_id)
WHEN 'H' THEN
   award_hourly_bonus(employee_id)
WHEN 'C' THEN
   award_commissioned_bonus(employee_id)
end case dem;
CASE
WHEN salary >= 10000 THEN
CASE
   WHEN salary <= 20000 THEN
      give_bonus(employee_id, 1500);
   WHEN salary > 20000 THEN
    begin
      give_bonus(employee_id, 1000);
    begin
      give_bonus(employee_id, 1000);
    end;
    end;
   END CASE;
WHEN salary > 40000 THEN
      give_bonus(employee_id, 500);
WHEN salary < 10000 THEN
   give_bonus(employee_id,0);
END case;

CASE employee_type
WHEN 'S' THEN
   award_salary_bonus(employee_id);
   award_salary_bonus(employee_id);
WHEN 'H' THEN
   award_hourly_bonus(employee_id);
WHEN 'C' THEN
   award_commissioned_bonus(employee_id);
CASE 
WHEN 'S' THEN
   award_salary_bonus(employee_id);
WHEN 'H' THEN
   award_hourly_bonus(employee_id);
WHEN 'C' THEN
   award_commissioned_bonus(employee_id);
ELSE
   RAISE invalid_employee_type;
END CASE;
END CASE;
    fetch abc into v,x;
    seq_name := db_name || '_S$';
    EXECUTE IMMEDIATE del_stmt1 USING db_awnum;
    EXECUTE IMMEDIATE del_stmt2 USING db_awnum;
    EXECUTE IMMEDIATE del_stmt3 USING db_awnum;
    EXECUTE IMMEDIATE del_stmt4 USING db_awnum;
    EXECUTE IMMEDIATE del_stmt5 USING obj_owner, obj_name, 2;
    EXECUTE IMMEDIATE del_stmt5 USING obj_owner, seq_name, 6;
    EXECUTE IMMEDIATE del_stmt6 USING obj_owner, obj_name, obj_owner;
  END IF;
EXCEPTION
  WHEN NO_DATA_FOUND THEN
    NULL; -- aw$ table may already be empty.
  WHEN DBERR20 THEN
    RAISE;
  WHEN HASCOT THEN
    RAISE;
  WHEN OTHERS THEN
    NULL;
END aw_drop_proc;