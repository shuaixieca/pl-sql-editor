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
	NUMBER_UNSIGNED;
	AND_OPERATOR;
	OR_OPERATOR;
	NOT_OPEARTOR;
	//BLOCK_COMMENT;
	//LINE_COMMENT;
	//WHITESPACE;
	STRING;
	SOME_TYPES;
	SCALE_TYPES;
	SIZE_TYPES;
	CHAR_TYPES;
	CHAR_TYPE;
	BYTE_TYPE;
	RAW_TYPE;
	TIMESTAMP_TYPE;
	YEAR_TYPE;
	DAY_TYPE;
	SECOND_TYPE;
	KEYWORD;
	//THE_REST;
}

@parser::header {package org.netbeans.modules.languages.pl_sql.antlr;}
@lexer::header {package org.netbeans.modules.languages.pl_sql.antlr;}

@lexer::members {

	/*public List<SyntaxError> syntaxErrors = new ArrayList<SyntaxError>();

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
	}*/
	
	@Override
	public void emitErrorMessage(String msg) {
	}
	
/*@Override	
public void reportError(RecognitionException e) {
  throw e;
}*/	
}
@parser::members {

public class SyntaxError {

    public RecognitionException exception;
    public String message;
    public int line;
    public int charPositionInLine;
}
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

STRING	:	//string: ( "\'" (([^ "\'"])*([ "\'"][ "\'"])*([^ "\'"])* )* "\'" )
		'\'' ( '\'\'' | ~('\'') )* '\''
;

SOME_TYPES
	:	N A T U R A L | P L S '_' I N T E G E R | N A T U R A L N | P O S I T I V E | P O S I T I V E N |
		S I G N T Y P E | S I M P L E '_' I N T E G E R | I N T | I N T E G E R | S M A L L I N T |
		B I N A R Y '_' I N T E G E R | R E A L | B I N A R Y '_' D O U B L E | B I N A R Y '_' F L O A T |
		L O N G | L O N G (' '|'\t'|'\n'|'\r')+ R A W | R O W I D | U R O W I D | B O O L E A N | M L S L A B E L |
		D A T E | B F I L E | B L O B | C L O B | N C L O B
;

SCALE_TYPES
	:	( N U M B E R | D E C | D E C I M A L | N U M E R I C )
		( ('(' '+'? DIGITS ')') |
		('(' '+'? DIGITS ',' ('+' | '-')? DIGITS ')') )?
;

SIZE_TYPES
	:	( D O U B L E (' '|'\t'|'\n'|'\r')+ P R E C I S I O N | F L O A T )
		( '(' '+'? DIGITS ')' )?
;

CHAR_TYPES
	:	V A R C H A R | V A R C H A R '2' | N C H A R | N V A R C H A R '2'
;

CHAR_TYPE
	:	C H A R
;

BYTE_TYPE
	:	B Y T E
;

RAW_TYPE:	R A W '(' '+'? DIGITS ')'
;

TIMESTAMP_TYPE
	:	T I M E S T A M P ( '(' '+'? DIGIT ')' )?
;

YEAR_TYPE
	:	Y E A R ( '(' '+'? '0' .. '4' ')' )?
;

DAY_TYPE:	D A Y ( '(' '+'? DIGIT ')' )?
;

SECOND_TYPE
	:	S E C O N D ( '(' '+'? DIGIT ')' )?
;

// ### SQL keywords ###
KEYWORD	:	'.' | F R O M | W H E R E | G R O U P (' '|'\t'|'\n'|'\r')+ B Y | O R D E R (' '|'\t'|'\n'|'\r')+ B Y | 
    		P R I O R | C O N N E C T '_' B Y '_' R O O T | C O N N E C T | S T A R T |
    		U N I O N | U N I O N (' '|'\t'|'\n'|'\r')+ A L L | I N T E R S E C T | M I N U S | M U L T I S E T (' '|'\t'|'\n'|'\r')+ E X C E P T |
    		M U L T I S E T (' '|'\t'|'\n'|'\r')+ I N T E R S E C T | M U L T I S E T (' '|'\t'|'\n'|'\r')+ U N I O N |
    		A N Y | S O M E | A L L | E S C A P E
;

// ### PL_SQL keywords ###
BEGIN_KEYWORD: B E G I N;
END_KEYWORD: E N D;
DECLARE_KEYWORD: D E C L A R E;
EXCEPTION_KEYWORD: E X C E P T I O N;
WHEN_KEYWORD: W H E N;
THEN_KEYWORD: T H E N;
NOT_NULL_KEYWORD: N O T (' '|'\t'|'\n'|'\r')+ N U L L;
NULL_KEYWORD: N U L L;
DEFAULT_KEYWORD: D E F A U L T;
ROWTYPE_KEYWORD: '%' R O W T Y P E;
LIKE_TYPE_KEYWORD: '%' T Y P E;
TYPE_KEYWORD: T Y P E;
TRUE_KEYWORD: T R U E;
FALSE_KEYWORD: F A L S E;
CONSTANT_KEYWORD: C O N S T A N T;
WITH_KEYWORD: W I T H;
LOCAL_KEYWORD: L O C A L;
TIME_KEYWORD: T I M E;
ZONE_KEYWORD: Z O N E;
INTERVAL_KEYWORD: I N T E R V A L;
TO_KEYWORD: T O;
MONTH_KEYWORD: M O N T H;
SUBTYPE_KEYWORD: S U B T Y P E;
IS_KEYWORD: I S;
RECORD_KEYWORD: R E C O R D;
CREATE_KEYWORD: C R E A T E;
REPLACE_KEYWORD: R E P L A C E;
FUNCTION_KEYWORD: F U N C T I O N;
AS_KEYWORD: A S;
RETURN_KEYWORD: R E T U R N;
IN_KEYWORD: I N;
OUT_KEYWORD: O U T;
NOCOPY_KEYWORD: N O C O P Y;
AUTHID_KEYWORD: A U T H I D;
CURRENT_USER_KEYWORD: C U R R E N T '_' U S E R;
DEFINER_KEYWORD: D E F I N E R;
DETERMINISTIC_KEYWORD: D E T E R M I N I S T I C;
PARALLEL_ENABLED_KEYWORD: P A R A L L E L '_' E N A B L E D;
PIPELINED_KEYWORD: P I P E L I N E D;
RESULT_CACHE_KEYWORD: R E S U L T '_' C A C H E;
PROCEDURE_KEYWORD: P R O C E D U R E;
IF_KEYWORD: I F;
ELSE_KEYWORD: E L S E;
ELSIF_KEYWORD: E L S I F;
ENDIF_KEYWORD:  END_KEYWORD ' '+ IF_KEYWORD;
IS_NULL_KEYWORD: I S (' '|'\t'|'\n'|'\r')+ N U L L;
IS_NOT_NULL_KEYWORD: I S (' '|'\t'|'\n'|'\r')+ N O T (' '|'\t'|'\n'|'\r')+ N U L L;
NOT_IN_KEYWORD: N O T (' '|'\t'|'\n'|'\r')+ I N;
GOTO_KEYWORD: G O T O;
LOOP_KEYWORD: L O O P;
END_LOOP_KEYWORD: END_KEYWORD ' '+ LOOP_KEYWORD;
WHILE_KEYWORD: W H I L E;
FOR_KEYWORD: F O R;
REVERSE_KEYWORD: R E V E R S E;
SELECT_KEYWORD: S E L E C T;
COUNT_KEYWORD: C O U N T;
EXCEPTION_INIT_KEYWORD: E X C E P T I O N '_' I N I T;
LIKE_KEYWORD: L I K E;
RAISE_KEYWORD: R A I S E;
PRAGMA_KEYWORD: P R A G M A;
AUTONOMOUS_TRANSACTION_KEYWORD: A U T O N O M O U S '_' T R A N S A C T I O N;
CASE_KEYWORD: C A S E;
END_CASE_KEYWORD: E N D ' '+ C A S E;
CLOSE_KEYWORD: C L O S E;
TABLE_KEYWORD: T A B L E;
OF_KEYWORD: O F;
INDEX_KEYWORD: I N D E X;
BY_KEYWORD: B Y;
VARRAY_KEYWORD: V A R R A Y;
VARYING_KEYWORD: V A R Y I N G;
ARRAY_KEYWORD: A R R A Y;
COMMIT_KEYWORD: C O M M I T;
REF_KEYWORD: R E F;
CONTINUE_KEYWORD: C O N T I N U E;
CURSOR_KEYWORD: C U R S O R;
DELETE_KEYWORD: D E L E T E;
EXECUTE_KEYWORD: E X E C U T E;
IMMEDIATE_KEYWORD: I M M E D I A T E;
EXIT_KEYWORD: E X I T;
INTO_KEYWORD: I N T O;
USING_KEYWORD: U S I N G;
BULK_KEYWORD: B U L K;
COLLECT_KEYWORD: C O L L E C T;
FETCH_KEYWORD: F E T C H;
LIMIT_KEYWORD: L I M I T;
FORALL_KEYWORD: F O R A L L;
SAVE_KEYWORD: S A V E;
EXCEPTIONS_KEYWORD: E X C E P T I O N S;
INDICES_KEYWORD: I N D I C E S;
VALUES_KEYWORD: V A L U E S;
BETWEEN_KEYWORD: B E T W E E N;
INLINE_KEYWORD: I N L I N E;
INSERT_KEYWORD: I N S E R T;
LOCK_KEYWORD: L O C K;
MERGE_KEYWORD: M E R G E;
OPEN_KEYWORD: O P E N;
PACKAGE_KEYWORD: P A C K A G E;
BODY_KEYWORD: B O D Y;
RESTRICT_REFERENCES_KEYWORD: R E S T R I C T '_' R E F E R E N C E S;
RETURNING_KEYWORD: R E T U R N I N G;
ROLLBACK_KEYWORD: R O L L B A C K;
SAVEPOINT_KEYWORD: S A V E P O I N T;
SERIALLY_REUSABLE_KEYWORD: S E R I A L L Y '_' R E U S A B L E;
SET_KEYWORD: S E T;
TRANSACTION_KEYWORD: T R A N S A C T I O N;
NOTFOUND_KEYWORD: '%' N O T F O U N D;
FOUND_KEYWORD: '%' F O U N D;
ISOPEN_KEYWORD: '%' I S O P E N;
ROWCOUNT_KEYWORD: '%' R O W C O U N T;
SQLCODE_KEYWORD: S Q L C O D E;
SQLERRM_KEYWORD: S Q L E R R M;
UPDATE_KEYWORD: U P D A T E;
EXISTS_KEYWORD: E X I S T S;
TRIGGER_KEYWORD: T R I G G E R;
BEFORE_KEYWORD: B E F O R E;
AFTER_KEYWORD: A F T E R;
INSTEAD_KEYWORD: I N S T E A D;
ON_KEYWORD: O N;
NESTED_KEYWORD: N E S T E D;
REFERENCING_KEYWORD: R E F E R E N C I N G;
OLD_KEYWORD: O L D;
NEW_KEYWORD: N E W;
PARENT_KEYWORD: P A R E N T;
EACH_KEYWORD: E A C H;
ROW_KEYWORD: R O W;
FOLLOWS_KEYWORD: F O L L O W S;
ENABLE_KEYWORD: E N A B L E;
DISABLE_KEYWORD: D I S A B L E;
OID_KEYWORD: O I D;
OBJECT_KEYWORD: O B J E C T;
UNDER_KEYWORD: U N D E R;
FINAL_KEYWORD: F I N A L;
INSTANTIABLE_KEYWORD: I N S T A N T I A B L E;
OVERRIDING_KEYWORD: O V E R R I D I N G;
MEMBER_KEYWORD: M E M B E R;
STATIC_KEYWORD: S T A T I C;
CONSTRUCTOR_KEYWORD: C O N S T R U C T O R;
SELF_KEYWORD: S E L F;
RESULT_KEYWORD: R E S U L T;
MAP_KEYWORD: M A P;
ORDER_KEYWORD: O R D E R;
JOIN_KEYWORD: J O I N;

fragment DIGIT
	: '0' .. '9'
;

fragment DIGITS
	: DIGIT ( DIGIT )*
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

// to avoid having two separate lexer in Netbeans
THE_REST:	.
;

grammar_def
	:	statments  EOF!
;
statments
	:	BEGIN_KEYWORD (NUMBER_UNSIGNED | STRING | SOME_TYPES | SCALE_TYPES | SIZE_TYPES | CHAR_TYPES | CHAR_TYPE | BYTE_TYPE | RAW_TYPE | 
		TIMESTAMP_TYPE | YEAR_TYPE | DAY_TYPE | SECOND_TYPE | KEYWORD | NOT_NULL_KEYWORD | IS_NULL_KEYWORD | IS_NOT_NULL_KEYWORD)+ END_KEYWORD //OPERATOR ( OR_OPERATOR | AND_OPERATOR | NUMBER_UNSIGNED)+ OPERATOR;
;
	