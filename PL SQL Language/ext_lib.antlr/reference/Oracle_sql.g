grammar Oracle_sql;

@header{package com.sqlraider.editor.parser;}
@lexer::header{package com.sqlraider.editor.lexer;}

@members {
	public List<SyntaxError> syntaxErrors = new ArrayList<SyntaxError>();

	@Override
	public String getErrorMessage(RecognitionException e, String[] tokenNames) {
		String message = super.getErrorMessage(e, tokenNames);
		SyntaxError syntaxError = new SyntaxError();
		syntaxError.exception = e;
		syntaxError.message = message;
		syntaxErrors.add(syntaxError);
		return message;
	}

	public static class SyntaxError {
		public RecognitionException exception;
		public String message;
		public int line;
		public int charPositionInLine;
	}
}

prog: selectStatment;

selectStatment: SELECT columns FROM tables (WHERE equalsStatment)? (ORDER_BY orderByClause)?;

columns: columnName (COMMA columnName)*;

/* 
Defines one of the following: 
- name and alias
- asterisk
- alias followed by an asterisk
- inner select and alias
*/
columnName: (NAME NAME?|ASTERISK|NAME_ASTERISK|innerSelect NAME?);

tables: tableName joinTables*;

tableName: (NAME|innerSelect) NAME?;

joinTables: JOIN tableName joinCondition;

joinCondition: ON equalsStatment;

innerSelect: LPAREN selectStatment RPAREN;

equalsStatment: equals (AND equals)*;

equals: leftOfEquals OPERATORS rightOfEquals|NULL;

leftOfEquals: NAME;

/*rightOfEquals: QUOTED_STATEMENT
           | innerSelect
           | LPAREN (QUOTED_STATEMENT|NAME) RPAREN
           | NAME
           ;*/
rightOfEquals: NAME
           ;           

orderByClause: NAME (COMMA NAME)*; 

/* select */
SELECT: ('S'|'s')('E'|'e')('L'|'l')('E'|'e')('C'|'c')('T'|'t');

/* from */
FROM: ('F'|'f')('R'|'r')('O'|'o')('M'|'m');

/* where */
WHERE: ('W'|'w')('H'|'h')('E'|'e')('R'|'r')('E'|'e');

/* order by */
ORDER_BY: ('O'|'o')('R'|'r')('D'|'d')('E'|'e')('R'|'r')(' '*)('B'|'b')('Y'|'y');

/* and */
AND: ('A'|'a')('N'|'n')('D'|'d');

/* join, inner join, left join, right join, outer join*/
JOIN: ((('J'|'j')('O'|'o')('I'|'i')('N'|'n'))
       |(('I'|'i')('N'|'n')('N'|'n')('E'|'e')('R'|'r')(' '*)('J'|'j')('O'|'o')('I'|'i')('N'|'n'))
       |(('L'|'l')('E'|'e')('F'|'f')('T'|'t')(' '*)('J'|'j')('O'|'o')('I'|'i')('N'|'n'))
       |(('R'|'r')('I'|'i')('G'|'g')('H'|'h')('T'|'t')(' '*)('J'|'j')('O'|'o')('I'|'i')('N'|'n'))
       |(('O'|'o')('U'|'u')('T'|'t')('E'|'e')('R'|'r')(' '*)('J'|'j')('O'|'o')('I'|'i')('N'|'n'))
       );

/* is null, is not null */
NULL: ((('I'|'i')('S'|'s')(' '*)('N'|'n')('U'|'u')('L'|'l')('L'|'l'))
          |(('I'|'i')('S'|'s')(' '*)('N'|'n')('O'|'o')('T'|'t')(' '*)('N'|'n')('U'|'u')('L'|'l')('L'|'l'))
         );

/* on */
ON: ('O'|'o')('N'|'n');

IN: (('I'|'i')('N'|'n')|('N'|'n')('O'|'o')('T'|'t')(' '+)('I'|'i')('N'|'n'));

OPERATORS: ('<'|'>'|'='|'!='|IN);

NAME: (LETTER|NUMBER) (LETTER|NUMBER|'_'|'.')*;

fragment LETTER: ('a'..'z'|'A'..'Z');

fragment NUMBER: '0'..'9';

ASTERISK: '*';

NAME_ASTERISK: NAME ASTERISK;

COMMA: ',';

LPAREN: '(';

RPAREN: ')';

QUOTED_STATEMENT: '\'' .* '\'';

WS: (' '|'\n'|'\r')+ {skip();};
//WS: (' '|'\n'|'\r')+;

SL_COMMENT: '--' .* '\n' {$channel=HIDDEN;};

ML_COMMENT: '/*' .* '*/' {$channel=HIDDEN;};

