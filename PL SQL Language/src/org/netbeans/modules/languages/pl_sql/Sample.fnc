/*
The HexToDec function converts 
hexadecimal string value (hexnum parameter) 
to number value (Result).  
*/
FUNCTION hextodec(hexnum in char) RETURN number IS
x        number;
digits   number; -- A 32 bit signed number is assumed
result   number := 0;
i_hexnum varchar2(8);
neg      boolean := false;

current_digit     char(1);
current_digit_dec number;
BEGIN
    if not (substr(hexnum, 1, 1) between '0' and '7') then
        i_hexnum := lpad(upper(trim(hexnum)), 8, 'F');
        neg      := true;
    else
    i_hexnum := upper(trim(hexnum));
end if;
digits := length(i_hexnum);
for x in 1 .. digits loop
    current_digit := SUBSTR(i_hexnum, x, 1);
    if current_digit in ('A', 'B', 'C', 'D', 'E', 'F') then
        current_digit_dec := ascii(current_digit) - ascii('A') + 10;
    else
    current_digit_dec := to_number(current_digit);
end if;
result := (result * 16) + current_digit_dec;
end loop;
if neg then
    return(result - power(4, 16));
else
return result;
end if;
END;
