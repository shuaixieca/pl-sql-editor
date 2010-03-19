/* 
 PL/SQL Language definition based on Oracle 11g syntax for ANTLR v3
 Author:	Alexandre Soumbatov
 Homepage:	http://code.google.com/p/pl-sql-editor/
 History:	16-Mar-2010	the work began
*/   

grammar PL_SQL;

options
{
	output = AST;
}

tokens {
	BLOCK_COMMENT;
	LINE_COMMENT;
	NUMBER_UNSIGNED;
}

@parser::header {package org.netbeans.modules.languages.pl_sql.antlr;}
@lexer::header {package org.netbeans.modules.languages.pl_sql.antlr;}

@lexer::members {

	public List<SyntaxError> syntaxErrors = new ArrayList<SyntaxError>();

	@Override
	public String getErrorMessage(RecognitionException e, String[] tokenNames) {
		String message = super.getErrorMessage(e, tokenNames);
		SyntaxError syntaxError = new SyntaxError();
		syntaxError.exception = e;
		syntaxError.message = message;
		syntaxError.line = e.line;
		syntaxError.charPositionInLine = e.charPositionInLine;
		syntaxErrors.add(syntaxError);
		return message;
	}
	
	@Override
	public void emitErrorMessage(String msg) {
	}
	
/*@Override	
public void reportError(RecognitionException e) {
  throw e;
}*/	
}
@parser::members {
	public List<SyntaxError> syntaxErrors = new ArrayList<SyntaxError>();

	@Override
	public String getErrorMessage(RecognitionException e, String[] tokenNames) {
		String message = super.getErrorMessage(e, tokenNames);
		SyntaxError syntaxError = new SyntaxError();
		syntaxError.exception = e;
		syntaxError.message = message;
		syntaxError.line = e.line;
		syntaxError.charPositionInLine = e.charPositionInLine;
		syntaxErrors.add(syntaxError);
		return message;
	}

	@Override
	public void emitErrorMessage(String msg) {
	}
	
/*protected void mismatch(IntStream input, int ttype, BitSet follow)
throws RecognitionException
{
throw new MismatchedTokenException(ttype, input);
}

@Override
public Object recoverFromMismatchedSet(IntStream input,
RecognitionException e,
BitSet follow)
throws RecognitionException
{
throw e;
}
}
// Alter code generation so catch-clauses get replace with
// this action.
@rulecatch {
catch (RecognitionException e) {
throw e;
}*/
}

// LEXER RULES

BLOCK_COMMENT
	:	'/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
;

LINE_COMMENT
	:	'--' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
;

WHITESPACE
	:	(' '|'\t'|'\n'|'\r')+ {$channel=HIDDEN;}
;

OPERATOR:	':=' | '+' | '-' | '*' | '/' | '**' | '||' | '=' | '<>' | '!=' | '~=' |
    		'^=' | '>' | '<' | '<=' | '>=' | '..' | '(+)' | '(' | ')' | '<<' | '>>'
;		

OR_OPERATOR
	:	O R;

AND_OPERATOR
	:	A N D;

NOT_OPERATOR
	:	N O T;

NUMBER_UNSIGNED	//(('0'..'9')* '.'?)? ('0'..'9')+ (E('+'|'-')?('0'..'9')+)?		
	:	(DIGITS '.'? DIGITS?
		| '.' DIGITS
		)
		(EXP_DIGITS)?
;

fragment DIGITS
	: '0' .. '9' ( '0' .. '9' )*
;

fragment EXP_DIGITS
	: E ('+'|'-')? DIGITS
;

fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');

grammar_def
	:	statments+ EOF!;
statments
	:	NUMBER_UNSIGNED;//OPERATOR ( OR_OPERATOR | AND_OPERATOR | NUMBER_UNSIGNED)+ OPERATOR;
		
	