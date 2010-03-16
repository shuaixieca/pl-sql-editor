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

@header{package org.netbeans.modules.languages.pl_sql.antlr;}
@lexer::header{package org.netbeans.modules.languages.pl_sql.antlr;}

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


BLOCK_COMMENT
	:	'/*' .* '*/' {$channel=HIDDEN;}
;

grammar_def
	:	BLOCK_COMMENT* EOF!;