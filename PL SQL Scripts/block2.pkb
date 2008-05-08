DECLARE
   boolean_true BOOLEAN := TRUE;
   boolean_false BOOLEAN := FALSE;
   boolean_null BOOLEAN;
   FUNCTION boolean_to_varchar2 (flag IN BOOLEAN) RETURN VARCHAR2 IS
   BEGIN
      RETURN
      CASE flag
      WHEN TRUE THEN 'True'
      WHEN FALSE THEN 'False'
      ELSE 'NULL' END;
pragma inline ('demo', 'YES');
      abc := CASE flag
      WHEN TRUE THEN 'True'
      WHEN FALSE THEN 'False'
      ELSE 'NULL' END;
   END;
BEGIN
insert into abc (a,b,c)
values 1,2,3;
   DBMS_OUTPUT.PUT_LINE(boolean_to_varchar2(boolean_true));
   DBMS_OUTPUT.PUT_LINE(boolean_to_varchar2(boolean_false));
   DBMS_OUTPUT.PUT_LINE(boolean_to_varchar2(boolean_null));
exit de when true;
END;

DECLARE
   salary NUMBER := 20000;
   employee_id NUMBER := 36325;
   bonus_amount NUMBER;
BEGIN
   bonus_amount :=
      CASE
      WHEN salary >= 10000 AND salary <=20000 THEN 1500
      WHEN salary > 20000 AND salary <= 40000 THEN 1000
      WHEN salary > 40000 THEN 500
      ELSE 0
      END * 10;
   DBMS_OUTPUT.PUT_LINE(bonus_amount);
END;