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
	backtrack = true;
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
	IDENTIFIER;
	EXT_IDENTIFIER;
	ALIAS;
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
/*
OPERATOR:	':=' | '+' | '-' | '*' | '/' | '**' | '||' | '=' | '<>' | '!=' | '~=' |
    		'^=' | '>' | '<' | '<=' | '>=' | '..' | '(+)' | '(' | ')' | '<<' | '>>'
;		
*/
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
NOT_NULL_KEYWORD: N O T (' '|'\t'|'\n'|'\r')+ NULL_KEYWORD;
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
IS_NULL_KEYWORD: IS_KEYWORD ' '+ NULL_KEYWORD;
IS_NOT_NULL_KEYWORD: IS_KEYWORD ' '+ N O T ' '+ NULL_KEYWORD;
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

//TOKEN:identifier:( ["a"-"z" "A"-"Z"] ["$" "#" "_" "0"-"9" "a"-"z" "A"-"Z" "%"]* )
IDENTIFIER
	:	CHARS ('$' | '#' | '_' | DIGIT | CHARS | '%')*
;


EXT_IDENTIFIER
	:	':'? '"'? IDENTIFIER '"'? ('.' | '@') '"'? IDENTIFIER '"'? (('.' | '@')? IDENTIFIER )?
;

ALIAS	:	'"' (~'"')+ '"'
;

SEPARATOR
	:	';';

/*TERMINATOR
	:	'/';
*/
fragment COMMA
	:	',';

fragment PARAM_VALUE
	:	'=>';
	
fragment QUOTATION_MARK
	:	'"';

fragment CHARS
	: 'a' .. 'z' | 'A' .. 'Z'
;

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
	:	source_element  EOF!
;

source_element : anonymous_block | 
                 (create_replace_part?
                  (function_declaration | procedure_declaration | package_spec | package_body |
                   trigger_declaration | type_spec_declaration | type_body_declaration));
identifier : IDENTIFIER | RESULT_KEYWORD | INTERVAL_KEYWORD;
universal_identifier : identifier | EXT_IDENTIFIER;
label : '<<' identifier '>>';
create_replace_part : CREATE_KEYWORD (OR_OPERATOR REPLACE_KEYWORD)?;
as_is_part : IS_KEYWORD | AS_KEYWORD;
parameter_type : IN_KEYWORD | (OUT_KEYWORD NOCOPY_KEYWORD?) | (IN_KEYWORD OUT_KEYWORD NOCOPY_KEYWORD?);
parameter_declaration : '(' identifier parameter_type? data_type variable_def_part expression?
                        (',' identifier parameter_type? data_type (variable_def_part expression)?)* ')';
function_spec : FUNCTION_KEYWORD
                function_name parameter_declaration?
                RETURN_KEYWORD data_type invoker_clause? (function_spec_add2)*;
function_name : universal_identifier | ALIAS;
invoker_clause : AUTHID_KEYWORD (CURRENT_USER_KEYWORD | DEFINER_KEYWORD);
function_spec_add2 : DETERMINISTIC_KEYWORD | PARALLEL_ENABLED_KEYWORD | PIPELINED_KEYWORD | RESULT_CACHE_KEYWORD;
function_declaration : function_spec function_procedure_body;
procedure_spec : PROCEDURE_KEYWORD procedure_name parameter_declaration?
                 invoker_clause?;
procedure_name : universal_identifier | ALIAS;
procedure_declaration : procedure_spec function_procedure_body;
function_procedure_body : as_is_part (variable_declaration)* (function_declaration | procedure_declaration)* block;
package_spec : PACKAGE_KEYWORD package_spec_name invoker_clause? as_is_part
               (variable_declaration | ((function_spec | procedure_spec) ';'))* 
               END_KEYWORD universal_identifier? SEPARATOR? '/'?;
package_spec_name : universal_identifier | ALIAS;
package_body : PACKAGE_KEYWORD BODY_KEYWORD package_body_name as_is_part
               (variable_declaration | function_declaration | procedure_declaration)*
               (BEGIN_KEYWORD (executable_section)+)?
               END_KEYWORD universal_identifier? SEPARATOR? '/'?;
package_body_name : universal_identifier | ALIAS;
trigger_declaration : TRIGGER_KEYWORD trigger_name trigger_type follows_part? trigger_part
                      anonymous_block;
trigger_name : universal_identifier | ALIAS;
follows_part : FOLLOWS_KEYWORD universal_identifier;
trigger_part : (ENABLE_KEYWORD | DISABLE_KEYWORD)? (WHEN_KEYWORD universal_expression)?;
trigger_type : (BEFORE_KEYWORD (dml_event_clause | non_dml_trigger)) |
               (AFTER_KEYWORD (dml_event_clause | non_dml_trigger)) |
               (INSTEAD_KEYWORD OF_KEYWORD dml_event_clause) |
               compound_dml_trigger;
compound_dml_trigger : FOR_KEYWORD dml_event_clause referencing_clause?;
non_dml_trigger : (identifier OR_OPERATOR?)+ ON_KEYWORD universal_identifier;
dml_event_clause : ((INSERT_KEYWORD | DELETE_KEYWORD | 
                    (UPDATE_KEYWORD dml_event_clause_factor?))
                    OR_OPERATOR? dml_event_clause_factor?)+
                    dml_event_clause_part referencing_clause?
                    (FOR_KEYWORD EACH_KEYWORD ROW_KEYWORD)?;
dml_event_clause_factor : OF_KEYWORD (universal_identifier COMMA?)+;
dml_event_clause_part : ON_KEYWORD ((NESTED_KEYWORD TABLE_KEYWORD identifier OF_KEYWORD)? universal_identifier);
referencing_clause : REFERENCING_KEYWORD ( (OLD_KEYWORD | NEW_KEYWORD | PARENT_KEYWORD)
                     AS_KEYWORD? (OLD_KEYWORD | NEW_KEYWORD | identifier) )+;
type_spec_declaration : TYPE_KEYWORD type_spec_name type_oid_part? invoker_clause? type_spec_types
                        SEPARATOR? '/'?;
type_spec_name : universal_identifier | ALIAS;
type_oid_part : OID_KEYWORD '\'' universal_identifier '\'' ;
type_spec_types : object_type | varray_type | nested_table_type;
object_type : ((as_is_part OBJECT_KEYWORD) | (UNDER_KEYWORD universal_identifier))
              object_type_part?
               (NOT_OPERATOR? FINAL_KEYWORD)? (NOT_OPERATOR? INSTANTIABLE_KEYWORD)?;
object_type_part : '(' (identifier data_type ','?)+ (element_spec ','?)* ')';
element_spec : inheritance_clauses? ((subprogram_spec | constructor_spec | map_order_function_spec) ','?)+
               pragma_clause?;
pragma_clause : PRAGMA_KEYWORD RESTRICT_REFERENCES_KEYWORD '(' expression (',' expression)+ ')';
map_order_function_spec : (MAP_KEYWORD | ORDER_KEYWORD) MEMBER_KEYWORD function_spec;
constructor_spec : FINAL_KEYWORD? INSTANTIABLE_KEYWORD? CONSTRUCTOR_KEYWORD FUNCTION_KEYWORD
                   data_type constructor_spec_part?;
constructor_spec_part : '(' (SELF_KEYWORD IN_KEYWORD OUT_KEYWORD ',')?
                        (identifier data_type ','?)+ ')'
                        RETURN_KEYWORD SELF_KEYWORD AS_KEYWORD RESULT_KEYWORD;
subprogram_spec : (MEMBER_KEYWORD | STATIC_KEYWORD) (function_spec | procedure_spec);
inheritance_clauses : NOT_OPERATOR? (FINAL_KEYWORD | INSTANTIABLE_KEYWORD | OVERRIDING_KEYWORD);
varray_type : as_is_part collection_varray_datatype;
nested_table_type : as_is_part TABLE_KEYWORD OF_KEYWORD data_type;
type_body_declaration : TYPE_KEYWORD BODY_KEYWORD type_body_name as_is_part
                        ((subprogram_declaration | map_order_func_declaration) ','? )+ END_KEYWORD
                        SEPARATOR? '/'?;
type_body_name : universal_identifier | ALIAS;
subprogram_declaration : (MEMBER_KEYWORD | STATIC_KEYWORD)?
                         (function_declaration | procedure_declaration | constructor_declaration);
constructor_declaration : FINAL_KEYWORD? INSTANTIABLE_KEYWORD? CONSTRUCTOR_KEYWORD FUNCTION_KEYWORD
                          data_type constructor_spec_part? function_procedure_body;
map_order_func_declaration : (MAP_KEYWORD | ORDER_KEYWORD) MEMBER_KEYWORD function_declaration;

block : BEGIN_KEYWORD
            (executable_section)+
            exception_section?
        END_KEYWORD universal_identifier? SEPARATOR?
        '/'?;
anonymous_block : anonymous_block_declare_section? block;
executable_section : statement | anonymous_block;
executable_case_section : ((label)* statements SEPARATOR?) | anonymous_block;
statement : (label)* statements SEPARATOR;
statements : expression | goto_statement | loop_statement |
             while_loop_statement | for_loop_statement | sql_statements |
             return_statement | if_statement | raise_statement | close_statement |
             continue_statement | execute_immediate_statement | exit_statement |
             fetch_statement | forall_statement | pragma_inline_statement |
             open_statement;
sql_statements : select_statement | commit_statement | delete_statement | update_statement |
                 insert_statement | lock_table_statement | merge_statement |
                 rollback_statement | savepoint_statement | set_transaction_statement;
sql_operator : '+' | '-' | '*' | '/' | '**' | '||' | '=' | '<>' | '!=' | '~=' |
               '^=' | '>' | '<' | '<=' | '>=' | '(+)' | ',';
sql_not_parsed : THE_REST;               
//sql_not_parsed : sql_not_parsed1 | sql_not_parsed2 | THE_REST;
/*sql_not_parsed1 : ALIAS | KEYWORD | sql_operator | INTO_KEYWORD | IN_KEYWORD | NOT_IN_KEYWORD |
               AS_KEYWORD | VALUES_KEYWORD | BETWEEN_KEYWORD | SOME_TYPES |
               BULK_KEYWORD | COLLECT_KEYWORD | RETURNING_KEYWORD | ROW_KEYWORD |
               SET_KEYWORD | BY_KEYWORD | WITH_KEYWORD | TABLE_KEYWORD | JOIN_KEYWORD; 
sql_not_parsed2 : EXISTS_KEYWORD | REPLACE_KEYWORD |
               NUMBER_UNSIGNED | COUNT_KEYWORD | universal_identifier | case_statement_expression |
               STRING | COMMA | AND_OPERATOR | OR_OPERATOR | NOT_OPERATOR |
               IS_NOT_NULL_KEYWORD | IS_NULL_KEYWORD | NULL_KEYWORD | LIKE_KEYWORD | 
               sql_statements | sql_not_parsed | ('(' (sql_not_parsed)* ')');
*/

// ### SQL Statements ###
select_statement : SELECT_KEYWORD ((sql_not_parsed | ON_KEYWORD) | (FOR_KEYWORD UPDATE_KEYWORD))+;
commit_statement : COMMIT_KEYWORD sql_not_parsed?;
delete_statement : DELETE_KEYWORD (sql_not_parsed)+;
insert_statement : INSERT_KEYWORD (sql_not_parsed)+;
lock_table_statement : LOCK_KEYWORD TABLE_KEYWORD (sql_not_parsed)+;
merge_statement : MERGE_KEYWORD (sql_not_parsed | ON_KEYWORD |
                  USING_KEYWORD | WHEN_KEYWORD | THEN_KEYWORD | INSERT_KEYWORD |
                  UPDATE_KEYWORD)+;
rollback_statement : ROLLBACK_KEYWORD sql_not_parsed?;
savepoint_statement : SAVEPOINT_KEYWORD identifier;
set_transaction_statement : SET_KEYWORD TRANSACTION_KEYWORD (sql_not_parsed)+;
update_statement : UPDATE_KEYWORD (sql_not_parsed)+;

// ### PL/SQL Statements ###
goto_statement : GOTO_KEYWORD identifier;
return_statement : RETURN_KEYWORD expression?;
if_statement : IF_KEYWORD expression THEN_KEYWORD (executable_section)+
               (ELSIF_KEYWORD expression THEN_KEYWORD (executable_section)+)*
               (ELSE_KEYWORD (executable_section)+)?
               ENDIF_KEYWORD;
loop_statement : LOOP_KEYWORD (executable_section)+ END_LOOP_KEYWORD identifier?;
while_loop_statement : WHILE_KEYWORD expression loop_statement;
for_loop_statement : FOR_KEYWORD identifier IN_KEYWORD REVERSE_KEYWORD? 
                     ((expression (for_loop_statement_part | cursor_for_loop_statement1)) |
                       cursor_for_loop_statement2);
for_loop_statement_part :  '..' expression loop_statement;
cursor_for_loop_statement1 : loop_statement;
cursor_for_loop_statement2 : '(' select_statement ')' loop_statement;
raise_statement : RAISE_KEYWORD universal_identifier?;
case_statement_expression : simple_case_statement_expression | searched_case_statement_expression;
simple_case_statement_expression : CASE_KEYWORD expression 
                        (WHEN_KEYWORD expression THEN_KEYWORD (executable_case_section)+)+
                        (ELSE_KEYWORD (executable_case_section)+)?
                        (END_KEYWORD | (END_CASE_KEYWORD identifier?));
searched_case_statement_expression : CASE_KEYWORD
                        (WHEN_KEYWORD expression THEN_KEYWORD (executable_case_section)+)+
                        (ELSE_KEYWORD (executable_case_section)+)?
                        (END_KEYWORD | (END_CASE_KEYWORD identifier?));
close_statement : CLOSE_KEYWORD universal_identifier;
continue_statement : CONTINUE_KEYWORD identifier? (WHEN_KEYWORD expression)?;
execute_immediate_statement : EXECUTE_KEYWORD IMMEDIATE_KEYWORD expression
                              (RETURN_KEYWORD | RETURNING_KEYWORD)?
                              (into_clause | bulk_collect_into_clause)?
                              using_clause? ;
into_clause : INTO_KEYWORD universal_identifier (',' universal_identifier)*;
bulk_collect_into_clause : BULK_KEYWORD COLLECT_KEYWORD INTO_KEYWORD 
                           universal_identifier (',' universal_identifier)*;
using_clause : USING_KEYWORD (IN_KEYWORD | OUT_KEYWORD | (IN_KEYWORD OUT_KEYWORD))? expression
               (',' (IN_KEYWORD | OUT_KEYWORD | (IN_KEYWORD OUT_KEYWORD))? expression)*;
exit_statement : EXIT_KEYWORD identifier? (WHEN_KEYWORD expression)?;
fetch_statement : FETCH_KEYWORD expression 
                  ((bulk_collect_into_clause (LIMIT_KEYWORD expression)? ) | into_clause);
forall_statement : FORALL_KEYWORD identifier IN_KEYWORD bounds_clause
                   (SAVE_KEYWORD EXCEPTIONS_KEYWORD)? sql_statements;
bounds_clause : (expression '..' expression) |
                (INDICES_KEYWORD OF_KEYWORD universal_identifier 
                (BETWEEN_KEYWORD expression AND_OPERATOR expression )?) |
                (VALUES_KEYWORD OF_KEYWORD universal_identifier) ;
pragma_inline_statement : PRAGMA_KEYWORD INLINE_KEYWORD
                          '(' STRING ',' STRING ')';
open_statement : OPEN_KEYWORD universal_identifier open_params?
                 (FOR_KEYWORD (select_statement | STRING | universal_identifier) using_clause?)?;
open_params : '(' expression (',' expression)* ')';
sqlcode_function : SQLCODE_KEYWORD;
sqlerrm_function : SQLERRM_KEYWORD ('(' ('+'|'-')? NUMBER_UNSIGNED ')')?;
anonymous_block_declare_section : DECLARE_KEYWORD 
                                  (variable_declaration)* 
                                  (function_declaration | procedure_declaration)*;
variable_declaration : ((identifier data_type 
                       variable_declaration_part?)
			|
					   (identifier CONSTANT_KEYWORD data_type 
                       variable_declaration_part)
					   | subtype_datatype
					   | record_collection_datatype
					   | (identifier EXCEPTION_KEYWORD)
					   | 
					   (PRAGMA_KEYWORD (AUTONOMOUS_TRANSACTION_KEYWORD | SERIALLY_REUSABLE_KEYWORD |
						(EXCEPTION_INIT_KEYWORD '(' expression ',' expression ')') |
						(RESTRICT_REFERENCES_KEYWORD '(' expression (',' expression)+ ')' ) ))
					   | cursor_datatype)
					   SEPARATOR;
variable_declaration_part : NOT_NULL_KEYWORD? variable_def_part expression;
variable_def_part : ':=' | DEFAULT_KEYWORD;
data_type : SOME_TYPES | SCALE_TYPES | SIZE_TYPES | char_types | RAW_TYPE |
            timestamp_type | interval_year_type | interval_day_type | 
            (REF_KEYWORD? universal_identifier)| special_datatype;
char_types : (CHAR_TYPES | CHAR_TYPE) ('(' '+'? NUMBER_UNSIGNED (CHAR_TYPE | BYTE_TYPE)? ')')?;
timestamp_type : TIMESTAMP_TYPE | 
    ( TIMESTAMP_TYPE WITH_KEYWORD LOCAL_KEYWORD? TIME_KEYWORD ZONE_KEYWORD);
interval_year_type : INTERVAL_KEYWORD YEAR_TYPE TO_KEYWORD MONTH_KEYWORD;
interval_day_type : INTERVAL_KEYWORD DAY_TYPE TO_KEYWORD SECOND_TYPE;
subtype_datatype : SUBTYPE_KEYWORD identifier IS_KEYWORD data_type NOT_NULL_KEYWORD?;

record_collection_datatype : TYPE_KEYWORD identifier IS_KEYWORD 
                            (record_datatype | collection_table_datatype | collection_varray_datatype |
                            ref_cursor_datatype);
record_datatype : RECORD_KEYWORD '(' record_field_declaration (',' record_field_declaration)* ')' ;
record_field_declaration : identifier data_type variable_declaration_part?;
collection_table_datatype : TABLE_KEYWORD OF_KEYWORD data_type NOT_NULL_KEYWORD?
                      (INDEX_KEYWORD BY_KEYWORD data_type)?;
collection_varray_datatype : (VARRAY_KEYWORD | (VARYING_KEYWORD ARRAY_KEYWORD))
                             '(' '+'? NUMBER_UNSIGNED ')' OF_KEYWORD data_type NOT_NULL_KEYWORD?;
ref_cursor_datatype : REF_KEYWORD CURSOR_KEYWORD (RETURN_KEYWORD data_type)?;
cursor_datatype : CURSOR_KEYWORD identifier cursor_parameter_declaration?
                  (RETURN_KEYWORD data_type)? (IS_KEYWORD select_statement)?;
cursor_parameter_declaration : '(' cursor_parameter (',' cursor_parameter)* ')' ;
cursor_parameter : identifier IN_KEYWORD? data_type (variable_def_part expression)?;

special_datatype : (identifier | EXT_IDENTIFIER) (LIKE_TYPE_KEYWORD | ROWTYPE_KEYWORD);


// ### expression ###
expression : universal_expression;
in_notin_expression : (IN_KEYWORD | NOT_IN_KEYWORD) 
                      ( universal_expression | ( '(' select_statement ')'));
operator : '+' | '-' | '*' | '/' | '**' | '||' | ':=' | '.' |
           '^=' | '>' | '<' | '<=' | '>=' | '=' | '<>' | '!=' | '~=' |
           AND_OPERATOR | OR_OPERATOR |
           LIKE_KEYWORD | ((NOT_OPERATOR)? BETWEEN_KEYWORD);
unary_op : NOT_OPERATOR | '+' | '-';
postfix_op : IS_NULL_KEYWORD | IS_NOT_NULL_KEYWORD | '(+)' ;
universal_expression : unary_op? universal_factor postfix_op? (operator (universal_expression | ('(' select_statement ')') ))*;
universal_factor : TRUE_KEYWORD | FALSE_KEYWORD | NUMBER_UNSIGNED |
                   in_notin_expression |
                   STRING | NULL_KEYWORD | case_statement_expression |
                   sub_identifier (call_statement_param (in_notin_expression)?)? |
                   ('(' universal_expression (',' universal_expression )* ')');
sub_identifier : sub_identifier_factor | REPLACE_KEYWORD | sqlcode_function | sqlerrm_function;
sub_identifier_factor : universal_identifier (NOTFOUND_KEYWORD | FOUND_KEYWORD |
                        ISOPEN_KEYWORD | ROWCOUNT_KEYWORD | in_notin_expression)?;
call_statement_param : ('(' (universal_expression (',' universal_expression )*)? ')') |
                       ('(' identifier '=>' universal_expression (',' identifier '=>' universal_expression )* ')' );
exception_section : EXCEPTION_KEYWORD (exception_handler)+;
exception_handler : WHEN_KEYWORD universal_identifier (OR_OPERATOR universal_identifier)*
                    THEN_KEYWORD (executable_section)+;
	