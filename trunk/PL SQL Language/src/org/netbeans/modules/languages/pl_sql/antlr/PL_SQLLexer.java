// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g 2010-04-06 16:52:54
package org.netbeans.modules.languages.pl_sql.antlr;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class PL_SQLLexer extends Lexer {
    public static final int VARRAY_KEYWORD=117;
    public static final int TRIGGER_KEYWORD=163;
    public static final int RESULT_KEYWORD=189;
    public static final int EXIT_KEYWORD=127;
    public static final int V=43;
    public static final int DISABLE_KEYWORD=177;
    public static final int RESTRICT_REFERENCES_KEYWORD=147;
    public static final int AUTONOMOUS_TRANSACTION_KEYWORD=110;
    public static final int WHILE_KEYWORD=100;
    public static final int ALIAS=23;
    public static final int U=36;
    public static final int BEGIN_KEYWORD=54;
    public static final int ELSE_KEYWORD=96;
    public static final int SOME_TYPES=9;
    public static final int COLLECT_KEYWORD=131;
    public static final int T__214=214;
    public static final int CONSTANT_KEYWORD=67;
    public static final int INTERVAL_KEYWORD=73;
    public static final int VALUES_KEYWORD=138;
    public static final int PRAGMA_KEYWORD=109;
    public static final int R=28;
    public static final int MEMBER_KEYWORD=185;
    public static final int ZONE_KEYWORD=72;
    public static final int CHARS=193;
    public static final int CREATE_KEYWORD=79;
    public static final int ROLLBACK_KEYWORD=149;
    public static final int Q=158;
    public static final int CLOSE_KEYWORD=112;
    public static final int T__220=220;
    public static final int TRUE_KEYWORD=65;
    public static final int T__198=198;
    public static final int DEFINER_KEYWORD=89;
    public static final int CONTINUE_KEYWORD=122;
    public static final int CURRENT_USER_KEYWORD=88;
    public static final int LOOP_KEYWORD=99;
    public static final int EXECUTE_KEYWORD=125;
    public static final int W=48;
    public static final int T__218=218;
    public static final int DELETE_KEYWORD=124;
    public static final int INDEX_KEYWORD=115;
    public static final int STRING=8;
    public static final int RESULT_CACHE_KEYWORD=93;
    public static final int BEFORE_KEYWORD=164;
    public static final int EACH_KEYWORD=173;
    public static final int FOLLOWS_KEYWORD=175;
    public static final int T__215=215;
    public static final int X=53;
    public static final int T__201=201;
    public static final int UNDER_KEYWORD=181;
    public static final int UPDATE_KEYWORD=161;
    public static final int AND_OPERATOR=5;
    public static final int CHAR_TYPE=13;
    public static final int OPEN_KEYWORD=144;
    public static final int J=179;
    public static final int OR_OPERATOR=6;
    public static final int T__219=219;
    public static final int OID_KEYWORD=178;
    public static final int USING_KEYWORD=129;
    public static final int O=27;
    public static final int PARAM_VALUE=195;
    public static final int CURSOR_KEYWORD=123;
    public static final int ARRAY_KEYWORD=119;
    public static final int P=38;
    public static final int REFERENCING_KEYWORD=169;
    public static final int ISOPEN_KEYWORD=156;
    public static final int OF_KEYWORD=114;
    public static final int S=39;
    public static final int SELF_KEYWORD=188;
    public static final int T__202=202;
    public static final int DECLARE_KEYWORD=56;
    public static final int OVERRIDING_KEYWORD=184;
    public static final int VARYING_KEYWORD=118;
    public static final int THE_REST=197;
    public static final int BETWEEN_KEYWORD=139;
    public static final int EXCEPTION_INIT_KEYWORD=105;
    public static final int M=45;
    public static final int T__210=210;
    public static final int T=32;
    public static final int FALSE_KEYWORD=66;
    public static final int NOT_OPERATOR=33;
    public static final int REF_KEYWORD=121;
    public static final int EXP_DIGITS=35;
    public static final int SIZE_TYPES=11;
    public static final int SQLCODE_KEYWORD=159;
    public static final int DETERMINISTIC_KEYWORD=90;
    public static final int KEYWORD=20;
    public static final int EXCEPTION_KEYWORD=57;
    public static final int T__216=216;
    public static final int T__199=199;
    public static final int SCALE_TYPES=10;
    public static final int INSERT_KEYWORD=141;
    public static final int MONTH_KEYWORD=75;
    public static final int FORALL_KEYWORD=134;
    public static final int N=30;
    public static final int SQLERRM_KEYWORD=160;
    public static final int CASE_KEYWORD=111;
    public static final int PACKAGE_KEYWORD=145;
    public static final int INLINE_KEYWORD=140;
    public static final int AS_KEYWORD=82;
    public static final int DAY_TYPE=18;
    public static final int T__217=217;
    public static final int ROWCOUNT_KEYWORD=157;
    public static final int JOIN_KEYWORD=192;
    public static final int ELSIF_KEYWORD=97;
    public static final int COUNT_KEYWORD=104;
    public static final int PARENT_KEYWORD=172;
    public static final int FINAL_KEYWORD=182;
    public static final int SUBTYPE_KEYWORD=76;
    public static final int COMMA=50;
    public static final int FETCH_KEYWORD=132;
    public static final int FUNCTION_KEYWORD=81;
    public static final int STATIC_KEYWORD=186;
    public static final int EXISTS_KEYWORD=162;
    public static final int TABLE_KEYWORD=113;
    public static final int COMMIT_KEYWORD=120;
    public static final int NESTED_KEYWORD=168;
    public static final int T__208=208;
    public static final int IS_KEYWORD=77;
    public static final int BULK_KEYWORD=130;
    public static final int D=31;
    public static final int T__211=211;
    public static final int PROCEDURE_KEYWORD=94;
    public static final int IF_KEYWORD=95;
    public static final int YEAR_TYPE=17;
    public static final int LIKE_TYPE_KEYWORD=63;
    public static final int RAISE_KEYWORD=108;
    public static final int CHAR_TYPES=12;
    public static final int TIME_KEYWORD=70;
    public static final int ORDER_KEYWORD=191;
    public static final int CONSTRUCTOR_KEYWORD=187;
    public static final int SAVEPOINT_KEYWORD=150;
    public static final int ROWTYPE_KEYWORD=62;
    public static final int T__209=209;
    public static final int RETURN_KEYWORD=83;
    public static final int T__203=203;
    public static final int PIPELINED_KEYWORD=92;
    public static final int MAP_KEYWORD=190;
    public static final int TIMESTAMP_TYPE=16;
    public static final int NOT_OPEARTOR=7;
    public static final int NOTFOUND_KEYWORD=154;
    public static final int T__205=205;
    public static final int AUTHID_KEYWORD=87;
    public static final int A=29;
    public static final int IN_KEYWORD=84;
    public static final int LINE_COMMENT=25;
    public static final int WITH_KEYWORD=68;
    public static final int INSTEAD_KEYWORD=166;
    public static final int PARALLEL_ENABLED_KEYWORD=91;
    public static final int ENABLE_KEYWORD=176;
    public static final int BYTE_TYPE=14;
    public static final int WHEN_KEYWORD=58;
    public static final int T__207=207;
    public static final int C=49;
    public static final int T__212=212;
    public static final int T__206=206;
    public static final int L=37;
    public static final int ROW_KEYWORD=174;
    public static final int SECOND_TYPE=19;
    public static final int LOCAL_KEYWORD=69;
    public static final int END_KEYWORD=55;
    public static final int AFTER_KEYWORD=165;
    public static final int LIMIT_KEYWORD=133;
    public static final int SET_KEYWORD=152;
    public static final int SERIALLY_REUSABLE_KEYWORD=151;
    public static final int IDENTIFIER=21;
    public static final int TYPE_KEYWORD=64;
    public static final int T__204=204;
    public static final int LOCK_KEYWORD=142;
    public static final int ON_KEYWORD=167;
    public static final int BODY_KEYWORD=146;
    public static final int FOUND_KEYWORD=155;
    public static final int MERGE_KEYWORD=143;
    public static final int I=40;
    public static final int OBJECT_KEYWORD=180;
    public static final int F=47;
    public static final int T__200=200;
    public static final int TRANSACTION_KEYWORD=153;
    public static final int INSTANTIABLE_KEYWORD=183;
    public static final int SAVE_KEYWORD=135;
    public static final int RAW_TYPE=15;
    public static final int EXCEPTIONS_KEYWORD=136;
    public static final int QUOTATION_MARK=196;
    public static final int LIKE_KEYWORD=107;
    public static final int RETURNING_KEYWORD=148;
    public static final int K=106;
    public static final int NEW_KEYWORD=171;
    public static final int RECORD_KEYWORD=78;
    public static final int OUT_KEYWORD=85;
    public static final int B=46;
    public static final int NULL_KEYWORD=60;
    public static final int INTO_KEYWORD=128;
    public static final int DIGIT=52;
    public static final int DEFAULT_KEYWORD=61;
    public static final int OLD_KEYWORD=170;
    public static final int DIGITS=34;
    public static final int H=51;
    public static final int IMMEDIATE_KEYWORD=126;
    public static final int NUMBER_UNSIGNED=4;
    public static final int G=42;
    public static final int BLOCK_COMMENT=24;
    public static final int FOR_KEYWORD=101;
    public static final int EXT_IDENTIFIER=22;
    public static final int TO_KEYWORD=74;
    public static final int WHITESPACE=26;
    public static final int Z=71;
    public static final int BY_KEYWORD=116;
    public static final int REVERSE_KEYWORD=102;
    public static final int THEN_KEYWORD=59;
    public static final int SEPARATOR=194;
    public static final int EOF=-1;
    public static final int SELECT_KEYWORD=103;
    public static final int INDICES_KEYWORD=137;
    public static final int GOTO_KEYWORD=98;
    public static final int REPLACE_KEYWORD=80;
    public static final int NOCOPY_KEYWORD=86;
    public static final int T__213=213;
    public static final int Y=44;
    public static final int T__221=221;
    public static final int E=41;


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


    // delegates
    // delegators

    public PL_SQLLexer() {;} 
    public PL_SQLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public PL_SQLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g"; }

    // $ANTLR start "T__198"
    public final void mT__198() throws RecognitionException {
        try {
            int _type = T__198;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:30:8: ( '<<' )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:30:10: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__198"

    // $ANTLR start "T__199"
    public final void mT__199() throws RecognitionException {
        try {
            int _type = T__199;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:31:8: ( '>>' )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:31:10: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__199"

    // $ANTLR start "T__200"
    public final void mT__200() throws RecognitionException {
        try {
            int _type = T__200;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:32:8: ( '(' )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:32:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__200"

    // $ANTLR start "T__201"
    public final void mT__201() throws RecognitionException {
        try {
            int _type = T__201;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:33:8: ( ')' )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:33:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__201"

    // $ANTLR start "T__202"
    public final void mT__202() throws RecognitionException {
        try {
            int _type = T__202;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:34:8: ( '/' )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:34:10: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__202"

    // $ANTLR start "T__203"
    public final void mT__203() throws RecognitionException {
        try {
            int _type = T__203;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:35:8: ( '\\'' )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:35:10: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__203"

    // $ANTLR start "T__204"
    public final void mT__204() throws RecognitionException {
        try {
            int _type = T__204;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:36:8: ( '+' )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:36:10: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__204"

    // $ANTLR start "T__205"
    public final void mT__205() throws RecognitionException {
        try {
            int _type = T__205;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:37:8: ( '-' )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:37:10: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__205"

    // $ANTLR start "T__206"
    public final void mT__206() throws RecognitionException {
        try {
            int _type = T__206;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:38:8: ( '*' )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:38:10: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__206"

    // $ANTLR start "T__207"
    public final void mT__207() throws RecognitionException {
        try {
            int _type = T__207;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:39:8: ( '**' )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:39:10: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__207"

    // $ANTLR start "T__208"
    public final void mT__208() throws RecognitionException {
        try {
            int _type = T__208;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:40:8: ( '||' )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:40:10: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__208"

    // $ANTLR start "T__209"
    public final void mT__209() throws RecognitionException {
        try {
            int _type = T__209;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:41:8: ( '=' )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:41:10: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__209"

    // $ANTLR start "T__210"
    public final void mT__210() throws RecognitionException {
        try {
            int _type = T__210;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:42:8: ( '<>' )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:42:10: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__210"

    // $ANTLR start "T__211"
    public final void mT__211() throws RecognitionException {
        try {
            int _type = T__211;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:43:8: ( '!=' )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:43:10: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__211"

    // $ANTLR start "T__212"
    public final void mT__212() throws RecognitionException {
        try {
            int _type = T__212;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:44:8: ( '~=' )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:44:10: '~='
            {
            match("~="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__212"

    // $ANTLR start "T__213"
    public final void mT__213() throws RecognitionException {
        try {
            int _type = T__213;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:45:8: ( '^=' )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:45:10: '^='
            {
            match("^="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__213"

    // $ANTLR start "T__214"
    public final void mT__214() throws RecognitionException {
        try {
            int _type = T__214;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:46:8: ( '>' )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:46:10: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__214"

    // $ANTLR start "T__215"
    public final void mT__215() throws RecognitionException {
        try {
            int _type = T__215;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:47:8: ( '<' )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:47:10: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__215"

    // $ANTLR start "T__216"
    public final void mT__216() throws RecognitionException {
        try {
            int _type = T__216;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:48:8: ( '<=' )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:48:10: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__216"

    // $ANTLR start "T__217"
    public final void mT__217() throws RecognitionException {
        try {
            int _type = T__217;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:49:8: ( '>=' )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:49:10: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__217"

    // $ANTLR start "T__218"
    public final void mT__218() throws RecognitionException {
        try {
            int _type = T__218;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:50:8: ( '(+)' )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:50:10: '(+)'
            {
            match("(+)"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__218"

    // $ANTLR start "T__219"
    public final void mT__219() throws RecognitionException {
        try {
            int _type = T__219;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:51:8: ( '..' )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:51:10: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__219"

    // $ANTLR start "T__220"
    public final void mT__220() throws RecognitionException {
        try {
            int _type = T__220;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:52:8: ( ':=' )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:52:10: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__220"

    // $ANTLR start "T__221"
    public final void mT__221() throws RecognitionException {
        try {
            int _type = T__221;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:53:8: ( '.' )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:53:10: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__221"

    // $ANTLR start "BLOCK_COMMENT"
    public final void mBLOCK_COMMENT() throws RecognitionException {
        try {
            int _type = BLOCK_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:126:2: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:126:4: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:126:9: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='*') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='/') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='.')||(LA1_1>='0' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<=')')||(LA1_0>='+' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:126:37: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match("*/"); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BLOCK_COMMENT"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:130:2: ( '--' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:130:4: '--' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("--"); 

            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:130:9: (~ ( '\\n' | '\\r' ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:130:9: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:130:23: ( '\\r' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:130:23: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LINE_COMMENT"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:134:2: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:134:4: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:134:4: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\t' && LA4_0<='\n')||LA4_0=='\r'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "OR_OPERATOR"
    public final void mOR_OPERATOR() throws RecognitionException {
        try {
            int _type = OR_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:142:2: ( O R )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:142:4: O R
            {
            mO(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR_OPERATOR"

    // $ANTLR start "AND_OPERATOR"
    public final void mAND_OPERATOR() throws RecognitionException {
        try {
            int _type = AND_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:145:2: ( A N D )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:145:4: A N D
            {
            mA(); 
            mN(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND_OPERATOR"

    // $ANTLR start "NOT_OPERATOR"
    public final void mNOT_OPERATOR() throws RecognitionException {
        try {
            int _type = NOT_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:148:2: ( N O T )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:148:4: N O T
            {
            mN(); 
            mO(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT_OPERATOR"

    // $ANTLR start "NUMBER_UNSIGNED"
    public final void mNUMBER_UNSIGNED() throws RecognitionException {
        try {
            int _type = NUMBER_UNSIGNED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:151:2: ( ( DIGITS ( '.' )? ( DIGITS )? | '.' DIGITS ) ( EXP_DIGITS )? )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:151:4: ( DIGITS ( '.' )? ( DIGITS )? | '.' DIGITS ) ( EXP_DIGITS )?
            {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:151:4: ( DIGITS ( '.' )? ( DIGITS )? | '.' DIGITS )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                alt7=1;
            }
            else if ( (LA7_0=='.') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:151:5: DIGITS ( '.' )? ( DIGITS )?
                    {
                    mDIGITS(); 
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:151:12: ( '.' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='.') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:151:12: '.'
                            {
                            match('.'); 

                            }
                            break;

                    }

                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:151:17: ( DIGITS )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:151:17: DIGITS
                            {
                            mDIGITS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:152:5: '.' DIGITS
                    {
                    match('.'); 
                    mDIGITS(); 

                    }
                    break;

            }

            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:154:3: ( EXP_DIGITS )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='E'||LA8_0=='e') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:154:4: EXP_DIGITS
                    {
                    mEXP_DIGITS(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER_UNSIGNED"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:157:8: ( '\\'' ( '\\'\\'' | ~ ( '\\'' ) )* '\\'' )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:158:3: '\\'' ( '\\'\\'' | ~ ( '\\'' ) )* '\\''
            {
            match('\''); 
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:158:8: ( '\\'\\'' | ~ ( '\\'' ) )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\'') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='\'') ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='\uFFFF')) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:158:10: '\\'\\''
            	    {
            	    match("''"); 


            	    }
            	    break;
            	case 2 :
            	    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:158:19: ~ ( '\\'' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "SOME_TYPES"
    public final void mSOME_TYPES() throws RecognitionException {
        try {
            int _type = SOME_TYPES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:162:2: ( N A T U R A L | P L S '_' I N T E G E R | N A T U R A L N | P O S I T I V E | P O S I T I V E N | S I G N T Y P E | S I M P L E '_' I N T E G E R | I N T | I N T E G E R | S M A L L I N T | B I N A R Y '_' I N T E G E R | R E A L | B I N A R Y '_' D O U B L E | B I N A R Y '_' F L O A T | L O N G | L O N G ( ' ' | '\\t' | '\\n' | '\\r' )+ R A W | R O W I D | U R O W I D | B O O L E A N | M L S L A B E L | D A T E | B F I L E | B L O B | C L O B | N C L O B )
            int alt11=25;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:162:4: N A T U R A L
                    {
                    mN(); 
                    mA(); 
                    mT(); 
                    mU(); 
                    mR(); 
                    mA(); 
                    mL(); 

                    }
                    break;
                case 2 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:162:20: P L S '_' I N T E G E R
                    {
                    mP(); 
                    mL(); 
                    mS(); 
                    match('_'); 
                    mI(); 
                    mN(); 
                    mT(); 
                    mE(); 
                    mG(); 
                    mE(); 
                    mR(); 

                    }
                    break;
                case 3 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:162:46: N A T U R A L N
                    {
                    mN(); 
                    mA(); 
                    mT(); 
                    mU(); 
                    mR(); 
                    mA(); 
                    mL(); 
                    mN(); 

                    }
                    break;
                case 4 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:162:64: P O S I T I V E
                    {
                    mP(); 
                    mO(); 
                    mS(); 
                    mI(); 
                    mT(); 
                    mI(); 
                    mV(); 
                    mE(); 

                    }
                    break;
                case 5 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:162:82: P O S I T I V E N
                    {
                    mP(); 
                    mO(); 
                    mS(); 
                    mI(); 
                    mT(); 
                    mI(); 
                    mV(); 
                    mE(); 
                    mN(); 

                    }
                    break;
                case 6 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:163:3: S I G N T Y P E
                    {
                    mS(); 
                    mI(); 
                    mG(); 
                    mN(); 
                    mT(); 
                    mY(); 
                    mP(); 
                    mE(); 

                    }
                    break;
                case 7 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:163:21: S I M P L E '_' I N T E G E R
                    {
                    mS(); 
                    mI(); 
                    mM(); 
                    mP(); 
                    mL(); 
                    mE(); 
                    match('_'); 
                    mI(); 
                    mN(); 
                    mT(); 
                    mE(); 
                    mG(); 
                    mE(); 
                    mR(); 

                    }
                    break;
                case 8 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:163:53: I N T
                    {
                    mI(); 
                    mN(); 
                    mT(); 

                    }
                    break;
                case 9 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:163:61: I N T E G E R
                    {
                    mI(); 
                    mN(); 
                    mT(); 
                    mE(); 
                    mG(); 
                    mE(); 
                    mR(); 

                    }
                    break;
                case 10 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:163:77: S M A L L I N T
                    {
                    mS(); 
                    mM(); 
                    mA(); 
                    mL(); 
                    mL(); 
                    mI(); 
                    mN(); 
                    mT(); 

                    }
                    break;
                case 11 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:164:3: B I N A R Y '_' I N T E G E R
                    {
                    mB(); 
                    mI(); 
                    mN(); 
                    mA(); 
                    mR(); 
                    mY(); 
                    match('_'); 
                    mI(); 
                    mN(); 
                    mT(); 
                    mE(); 
                    mG(); 
                    mE(); 
                    mR(); 

                    }
                    break;
                case 12 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:164:35: R E A L
                    {
                    mR(); 
                    mE(); 
                    mA(); 
                    mL(); 

                    }
                    break;
                case 13 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:164:45: B I N A R Y '_' D O U B L E
                    {
                    mB(); 
                    mI(); 
                    mN(); 
                    mA(); 
                    mR(); 
                    mY(); 
                    match('_'); 
                    mD(); 
                    mO(); 
                    mU(); 
                    mB(); 
                    mL(); 
                    mE(); 

                    }
                    break;
                case 14 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:164:75: B I N A R Y '_' F L O A T
                    {
                    mB(); 
                    mI(); 
                    mN(); 
                    mA(); 
                    mR(); 
                    mY(); 
                    match('_'); 
                    mF(); 
                    mL(); 
                    mO(); 
                    mA(); 
                    mT(); 

                    }
                    break;
                case 15 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:165:3: L O N G
                    {
                    mL(); 
                    mO(); 
                    mN(); 
                    mG(); 

                    }
                    break;
                case 16 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:165:13: L O N G ( ' ' | '\\t' | '\\n' | '\\r' )+ R A W
                    {
                    mL(); 
                    mO(); 
                    mN(); 
                    mG(); 
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:165:21: ( ' ' | '\\t' | '\\n' | '\\r' )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:
                    	    {
                    	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);

                    mR(); 
                    mA(); 
                    mW(); 

                    }
                    break;
                case 17 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:165:51: R O W I D
                    {
                    mR(); 
                    mO(); 
                    mW(); 
                    mI(); 
                    mD(); 

                    }
                    break;
                case 18 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:165:63: U R O W I D
                    {
                    mU(); 
                    mR(); 
                    mO(); 
                    mW(); 
                    mI(); 
                    mD(); 

                    }
                    break;
                case 19 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:165:77: B O O L E A N
                    {
                    mB(); 
                    mO(); 
                    mO(); 
                    mL(); 
                    mE(); 
                    mA(); 
                    mN(); 

                    }
                    break;
                case 20 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:165:93: M L S L A B E L
                    {
                    mM(); 
                    mL(); 
                    mS(); 
                    mL(); 
                    mA(); 
                    mB(); 
                    mE(); 
                    mL(); 

                    }
                    break;
                case 21 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:166:3: D A T E
                    {
                    mD(); 
                    mA(); 
                    mT(); 
                    mE(); 

                    }
                    break;
                case 22 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:166:13: B F I L E
                    {
                    mB(); 
                    mF(); 
                    mI(); 
                    mL(); 
                    mE(); 

                    }
                    break;
                case 23 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:166:25: B L O B
                    {
                    mB(); 
                    mL(); 
                    mO(); 
                    mB(); 

                    }
                    break;
                case 24 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:166:35: C L O B
                    {
                    mC(); 
                    mL(); 
                    mO(); 
                    mB(); 

                    }
                    break;
                case 25 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:166:45: N C L O B
                    {
                    mN(); 
                    mC(); 
                    mL(); 
                    mO(); 
                    mB(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SOME_TYPES"

    // $ANTLR start "SCALE_TYPES"
    public final void mSCALE_TYPES() throws RecognitionException {
        try {
            int _type = SCALE_TYPES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:170:2: ( ( N U M B E R | D E C | D E C I M A L | N U M E R I C ) ( ( '(' ( '+' )? DIGITS ')' ) | ( '(' ( '+' )? DIGITS COMMA ( '+' | '-' )? DIGITS ')' ) )? )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:170:4: ( N U M B E R | D E C | D E C I M A L | N U M E R I C ) ( ( '(' ( '+' )? DIGITS ')' ) | ( '(' ( '+' )? DIGITS COMMA ( '+' | '-' )? DIGITS ')' ) )?
            {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:170:4: ( N U M B E R | D E C | D E C I M A L | N U M E R I C )
            int alt12=4;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:170:6: N U M B E R
                    {
                    mN(); 
                    mU(); 
                    mM(); 
                    mB(); 
                    mE(); 
                    mR(); 

                    }
                    break;
                case 2 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:170:20: D E C
                    {
                    mD(); 
                    mE(); 
                    mC(); 

                    }
                    break;
                case 3 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:170:28: D E C I M A L
                    {
                    mD(); 
                    mE(); 
                    mC(); 
                    mI(); 
                    mM(); 
                    mA(); 
                    mL(); 

                    }
                    break;
                case 4 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:170:44: N U M E R I C
                    {
                    mN(); 
                    mU(); 
                    mM(); 
                    mE(); 
                    mR(); 
                    mI(); 
                    mC(); 

                    }
                    break;

            }

            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:171:3: ( ( '(' ( '+' )? DIGITS ')' ) | ( '(' ( '+' )? DIGITS COMMA ( '+' | '-' )? DIGITS ')' ) )?
            int alt16=3;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:171:5: ( '(' ( '+' )? DIGITS ')' )
                    {
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:171:5: ( '(' ( '+' )? DIGITS ')' )
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:171:6: '(' ( '+' )? DIGITS ')'
                    {
                    match('('); 
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:171:10: ( '+' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='+') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:171:10: '+'
                            {
                            match('+'); 

                            }
                            break;

                    }

                    mDIGITS(); 
                    match(')'); 

                    }


                    }
                    break;
                case 2 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:172:3: ( '(' ( '+' )? DIGITS COMMA ( '+' | '-' )? DIGITS ')' )
                    {
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:172:3: ( '(' ( '+' )? DIGITS COMMA ( '+' | '-' )? DIGITS ')' )
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:172:4: '(' ( '+' )? DIGITS COMMA ( '+' | '-' )? DIGITS ')'
                    {
                    match('('); 
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:172:8: ( '+' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='+') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:172:8: '+'
                            {
                            match('+'); 

                            }
                            break;

                    }

                    mDIGITS(); 
                    mCOMMA(); 
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:172:26: ( '+' | '-' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='+'||LA15_0=='-') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mDIGITS(); 
                    match(')'); 

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SCALE_TYPES"

    // $ANTLR start "SIZE_TYPES"
    public final void mSIZE_TYPES() throws RecognitionException {
        try {
            int _type = SIZE_TYPES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:176:2: ( ( D O U B L E ( ' ' | '\\t' | '\\n' | '\\r' )+ P R E C I S I O N | F L O A T ) ( '(' ( '+' )? DIGITS ')' )? )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:176:4: ( D O U B L E ( ' ' | '\\t' | '\\n' | '\\r' )+ P R E C I S I O N | F L O A T ) ( '(' ( '+' )? DIGITS ')' )?
            {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:176:4: ( D O U B L E ( ' ' | '\\t' | '\\n' | '\\r' )+ P R E C I S I O N | F L O A T )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='D'||LA18_0=='d') ) {
                alt18=1;
            }
            else if ( (LA18_0=='F'||LA18_0=='f') ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:176:6: D O U B L E ( ' ' | '\\t' | '\\n' | '\\r' )+ P R E C I S I O N
                    {
                    mD(); 
                    mO(); 
                    mU(); 
                    mB(); 
                    mL(); 
                    mE(); 
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:176:18: ( ' ' | '\\t' | '\\n' | '\\r' )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:
                    	    {
                    	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);

                    mP(); 
                    mR(); 
                    mE(); 
                    mC(); 
                    mI(); 
                    mS(); 
                    mI(); 
                    mO(); 
                    mN(); 

                    }
                    break;
                case 2 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:176:60: F L O A T
                    {
                    mF(); 
                    mL(); 
                    mO(); 
                    mA(); 
                    mT(); 

                    }
                    break;

            }

            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:177:3: ( '(' ( '+' )? DIGITS ')' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='(') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:177:5: '(' ( '+' )? DIGITS ')'
                    {
                    match('('); 
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:177:9: ( '+' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='+') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:177:9: '+'
                            {
                            match('+'); 

                            }
                            break;

                    }

                    mDIGITS(); 
                    match(')'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SIZE_TYPES"

    // $ANTLR start "CHAR_TYPES"
    public final void mCHAR_TYPES() throws RecognitionException {
        try {
            int _type = CHAR_TYPES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:181:2: ( V A R C H A R | V A R C H A R '2' | N C H A R | N V A R C H A R '2' )
            int alt21=4;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:181:4: V A R C H A R
                    {
                    mV(); 
                    mA(); 
                    mR(); 
                    mC(); 
                    mH(); 
                    mA(); 
                    mR(); 

                    }
                    break;
                case 2 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:181:20: V A R C H A R '2'
                    {
                    mV(); 
                    mA(); 
                    mR(); 
                    mC(); 
                    mH(); 
                    mA(); 
                    mR(); 
                    match('2'); 

                    }
                    break;
                case 3 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:181:40: N C H A R
                    {
                    mN(); 
                    mC(); 
                    mH(); 
                    mA(); 
                    mR(); 

                    }
                    break;
                case 4 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:181:52: N V A R C H A R '2'
                    {
                    mN(); 
                    mV(); 
                    mA(); 
                    mR(); 
                    mC(); 
                    mH(); 
                    mA(); 
                    mR(); 
                    match('2'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHAR_TYPES"

    // $ANTLR start "CHAR_TYPE"
    public final void mCHAR_TYPE() throws RecognitionException {
        try {
            int _type = CHAR_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:185:2: ( C H A R )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:185:4: C H A R
            {
            mC(); 
            mH(); 
            mA(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHAR_TYPE"

    // $ANTLR start "BYTE_TYPE"
    public final void mBYTE_TYPE() throws RecognitionException {
        try {
            int _type = BYTE_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:189:2: ( B Y T E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:189:4: B Y T E
            {
            mB(); 
            mY(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BYTE_TYPE"

    // $ANTLR start "RAW_TYPE"
    public final void mRAW_TYPE() throws RecognitionException {
        try {
            int _type = RAW_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:192:9: ( R A W '(' ( '+' )? DIGITS ')' )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:192:11: R A W '(' ( '+' )? DIGITS ')'
            {
            mR(); 
            mA(); 
            mW(); 
            match('('); 
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:192:21: ( '+' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='+') ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:192:21: '+'
                    {
                    match('+'); 

                    }
                    break;

            }

            mDIGITS(); 
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RAW_TYPE"

    // $ANTLR start "TIMESTAMP_TYPE"
    public final void mTIMESTAMP_TYPE() throws RecognitionException {
        try {
            int _type = TIMESTAMP_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:196:2: ( T I M E S T A M P ( '(' ( '+' )? DIGIT ')' )? )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:196:4: T I M E S T A M P ( '(' ( '+' )? DIGIT ')' )?
            {
            mT(); 
            mI(); 
            mM(); 
            mE(); 
            mS(); 
            mT(); 
            mA(); 
            mM(); 
            mP(); 
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:196:22: ( '(' ( '+' )? DIGIT ')' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='(') ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:196:24: '(' ( '+' )? DIGIT ')'
                    {
                    match('('); 
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:196:28: ( '+' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0=='+') ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:196:28: '+'
                            {
                            match('+'); 

                            }
                            break;

                    }

                    mDIGIT(); 
                    match(')'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIMESTAMP_TYPE"

    // $ANTLR start "YEAR_TYPE"
    public final void mYEAR_TYPE() throws RecognitionException {
        try {
            int _type = YEAR_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:200:2: ( Y E A R ( '(' ( '+' )? '0' .. '4' ')' )? )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:200:4: Y E A R ( '(' ( '+' )? '0' .. '4' ')' )?
            {
            mY(); 
            mE(); 
            mA(); 
            mR(); 
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:200:12: ( '(' ( '+' )? '0' .. '4' ')' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='(') ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:200:14: '(' ( '+' )? '0' .. '4' ')'
                    {
                    match('('); 
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:200:18: ( '+' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0=='+') ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:200:18: '+'
                            {
                            match('+'); 

                            }
                            break;

                    }

                    matchRange('0','4'); 
                    match(')'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "YEAR_TYPE"

    // $ANTLR start "DAY_TYPE"
    public final void mDAY_TYPE() throws RecognitionException {
        try {
            int _type = DAY_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:203:9: ( D A Y ( '(' ( '+' )? DIGIT ')' )? )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:203:11: D A Y ( '(' ( '+' )? DIGIT ')' )?
            {
            mD(); 
            mA(); 
            mY(); 
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:203:17: ( '(' ( '+' )? DIGIT ')' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='(') ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:203:19: '(' ( '+' )? DIGIT ')'
                    {
                    match('('); 
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:203:23: ( '+' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0=='+') ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:203:23: '+'
                            {
                            match('+'); 

                            }
                            break;

                    }

                    mDIGIT(); 
                    match(')'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DAY_TYPE"

    // $ANTLR start "SECOND_TYPE"
    public final void mSECOND_TYPE() throws RecognitionException {
        try {
            int _type = SECOND_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:207:2: ( S E C O N D ( '(' ( '+' )? DIGIT ')' )? )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:207:4: S E C O N D ( '(' ( '+' )? DIGIT ')' )?
            {
            mS(); 
            mE(); 
            mC(); 
            mO(); 
            mN(); 
            mD(); 
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:207:16: ( '(' ( '+' )? DIGIT ')' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='(') ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:207:18: '(' ( '+' )? DIGIT ')'
                    {
                    match('('); 
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:207:22: ( '+' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0=='+') ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:207:22: '+'
                            {
                            match('+'); 

                            }
                            break;

                    }

                    mDIGIT(); 
                    match(')'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SECOND_TYPE"

    // $ANTLR start "KEYWORD"
    public final void mKEYWORD() throws RecognitionException {
        try {
            int _type = KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:211:9: ( '.' | F R O M | W H E R E | G R O U P ( ' ' | '\\t' | '\\n' | '\\r' )+ B Y | O R D E R ( ' ' | '\\t' | '\\n' | '\\r' )+ B Y | P R I O R | C O N N E C T '_' B Y '_' R O O T | C O N N E C T | S T A R T | U N I O N | U N I O N ( ' ' | '\\t' | '\\n' | '\\r' )+ A L L | I N T E R S E C T | M I N U S | M U L T I S E T ( ' ' | '\\t' | '\\n' | '\\r' )+ E X C E P T | M U L T I S E T ( ' ' | '\\t' | '\\n' | '\\r' )+ I N T E R S E C T | M U L T I S E T ( ' ' | '\\t' | '\\n' | '\\r' )+ U N I O N | A N Y | S O M E | A L L | E S C A P E )
            int alt37=20;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:211:11: '.'
                    {
                    match('.'); 

                    }
                    break;
                case 2 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:211:17: F R O M
                    {
                    mF(); 
                    mR(); 
                    mO(); 
                    mM(); 

                    }
                    break;
                case 3 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:211:27: W H E R E
                    {
                    mW(); 
                    mH(); 
                    mE(); 
                    mR(); 
                    mE(); 

                    }
                    break;
                case 4 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:211:39: G R O U P ( ' ' | '\\t' | '\\n' | '\\r' )+ B Y
                    {
                    mG(); 
                    mR(); 
                    mO(); 
                    mU(); 
                    mP(); 
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:211:49: ( ' ' | '\\t' | '\\n' | '\\r' )+
                    int cnt31=0;
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( ((LA31_0>='\t' && LA31_0<='\n')||LA31_0=='\r'||LA31_0==' ') ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:
                    	    {
                    	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt31 >= 1 ) break loop31;
                                EarlyExitException eee =
                                    new EarlyExitException(31, input);
                                throw eee;
                        }
                        cnt31++;
                    } while (true);

                    mB(); 
                    mY(); 

                    }
                    break;
                case 5 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:211:77: O R D E R ( ' ' | '\\t' | '\\n' | '\\r' )+ B Y
                    {
                    mO(); 
                    mR(); 
                    mD(); 
                    mE(); 
                    mR(); 
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:211:87: ( ' ' | '\\t' | '\\n' | '\\r' )+
                    int cnt32=0;
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( ((LA32_0>='\t' && LA32_0<='\n')||LA32_0=='\r'||LA32_0==' ') ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:
                    	    {
                    	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt32 >= 1 ) break loop32;
                                EarlyExitException eee =
                                    new EarlyExitException(32, input);
                                throw eee;
                        }
                        cnt32++;
                    } while (true);

                    mB(); 
                    mY(); 

                    }
                    break;
                case 6 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:212:7: P R I O R
                    {
                    mP(); 
                    mR(); 
                    mI(); 
                    mO(); 
                    mR(); 

                    }
                    break;
                case 7 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:212:19: C O N N E C T '_' B Y '_' R O O T
                    {
                    mC(); 
                    mO(); 
                    mN(); 
                    mN(); 
                    mE(); 
                    mC(); 
                    mT(); 
                    match('_'); 
                    mB(); 
                    mY(); 
                    match('_'); 
                    mR(); 
                    mO(); 
                    mO(); 
                    mT(); 

                    }
                    break;
                case 8 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:212:55: C O N N E C T
                    {
                    mC(); 
                    mO(); 
                    mN(); 
                    mN(); 
                    mE(); 
                    mC(); 
                    mT(); 

                    }
                    break;
                case 9 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:212:71: S T A R T
                    {
                    mS(); 
                    mT(); 
                    mA(); 
                    mR(); 
                    mT(); 

                    }
                    break;
                case 10 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:213:7: U N I O N
                    {
                    mU(); 
                    mN(); 
                    mI(); 
                    mO(); 
                    mN(); 

                    }
                    break;
                case 11 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:213:19: U N I O N ( ' ' | '\\t' | '\\n' | '\\r' )+ A L L
                    {
                    mU(); 
                    mN(); 
                    mI(); 
                    mO(); 
                    mN(); 
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:213:29: ( ' ' | '\\t' | '\\n' | '\\r' )+
                    int cnt33=0;
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( ((LA33_0>='\t' && LA33_0<='\n')||LA33_0=='\r'||LA33_0==' ') ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:
                    	    {
                    	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt33 >= 1 ) break loop33;
                                EarlyExitException eee =
                                    new EarlyExitException(33, input);
                                throw eee;
                        }
                        cnt33++;
                    } while (true);

                    mA(); 
                    mL(); 
                    mL(); 

                    }
                    break;
                case 12 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:213:59: I N T E R S E C T
                    {
                    mI(); 
                    mN(); 
                    mT(); 
                    mE(); 
                    mR(); 
                    mS(); 
                    mE(); 
                    mC(); 
                    mT(); 

                    }
                    break;
                case 13 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:213:79: M I N U S
                    {
                    mM(); 
                    mI(); 
                    mN(); 
                    mU(); 
                    mS(); 

                    }
                    break;
                case 14 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:213:91: M U L T I S E T ( ' ' | '\\t' | '\\n' | '\\r' )+ E X C E P T
                    {
                    mM(); 
                    mU(); 
                    mL(); 
                    mT(); 
                    mI(); 
                    mS(); 
                    mE(); 
                    mT(); 
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:213:107: ( ' ' | '\\t' | '\\n' | '\\r' )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( ((LA34_0>='\t' && LA34_0<='\n')||LA34_0=='\r'||LA34_0==' ') ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:
                    	    {
                    	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt34 >= 1 ) break loop34;
                                EarlyExitException eee =
                                    new EarlyExitException(34, input);
                                throw eee;
                        }
                        cnt34++;
                    } while (true);

                    mE(); 
                    mX(); 
                    mC(); 
                    mE(); 
                    mP(); 
                    mT(); 

                    }
                    break;
                case 15 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:214:7: M U L T I S E T ( ' ' | '\\t' | '\\n' | '\\r' )+ I N T E R S E C T
                    {
                    mM(); 
                    mU(); 
                    mL(); 
                    mT(); 
                    mI(); 
                    mS(); 
                    mE(); 
                    mT(); 
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:214:23: ( ' ' | '\\t' | '\\n' | '\\r' )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( ((LA35_0>='\t' && LA35_0<='\n')||LA35_0=='\r'||LA35_0==' ') ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:
                    	    {
                    	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt35 >= 1 ) break loop35;
                                EarlyExitException eee =
                                    new EarlyExitException(35, input);
                                throw eee;
                        }
                        cnt35++;
                    } while (true);

                    mI(); 
                    mN(); 
                    mT(); 
                    mE(); 
                    mR(); 
                    mS(); 
                    mE(); 
                    mC(); 
                    mT(); 

                    }
                    break;
                case 16 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:214:65: M U L T I S E T ( ' ' | '\\t' | '\\n' | '\\r' )+ U N I O N
                    {
                    mM(); 
                    mU(); 
                    mL(); 
                    mT(); 
                    mI(); 
                    mS(); 
                    mE(); 
                    mT(); 
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:214:81: ( ' ' | '\\t' | '\\n' | '\\r' )+
                    int cnt36=0;
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( ((LA36_0>='\t' && LA36_0<='\n')||LA36_0=='\r'||LA36_0==' ') ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:
                    	    {
                    	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt36 >= 1 ) break loop36;
                                EarlyExitException eee =
                                    new EarlyExitException(36, input);
                                throw eee;
                        }
                        cnt36++;
                    } while (true);

                    mU(); 
                    mN(); 
                    mI(); 
                    mO(); 
                    mN(); 

                    }
                    break;
                case 17 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:215:7: A N Y
                    {
                    mA(); 
                    mN(); 
                    mY(); 

                    }
                    break;
                case 18 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:215:15: S O M E
                    {
                    mS(); 
                    mO(); 
                    mM(); 
                    mE(); 

                    }
                    break;
                case 19 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:215:25: A L L
                    {
                    mA(); 
                    mL(); 
                    mL(); 

                    }
                    break;
                case 20 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:215:33: E S C A P E
                    {
                    mE(); 
                    mS(); 
                    mC(); 
                    mA(); 
                    mP(); 
                    mE(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD"

    // $ANTLR start "BEGIN_KEYWORD"
    public final void mBEGIN_KEYWORD() throws RecognitionException {
        try {
            int _type = BEGIN_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:219:14: ( B E G I N )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:219:16: B E G I N
            {
            mB(); 
            mE(); 
            mG(); 
            mI(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BEGIN_KEYWORD"

    // $ANTLR start "END_KEYWORD"
    public final void mEND_KEYWORD() throws RecognitionException {
        try {
            int _type = END_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:220:12: ( E N D )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:220:14: E N D
            {
            mE(); 
            mN(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "END_KEYWORD"

    // $ANTLR start "DECLARE_KEYWORD"
    public final void mDECLARE_KEYWORD() throws RecognitionException {
        try {
            int _type = DECLARE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:221:16: ( D E C L A R E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:221:18: D E C L A R E
            {
            mD(); 
            mE(); 
            mC(); 
            mL(); 
            mA(); 
            mR(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DECLARE_KEYWORD"

    // $ANTLR start "EXCEPTION_KEYWORD"
    public final void mEXCEPTION_KEYWORD() throws RecognitionException {
        try {
            int _type = EXCEPTION_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:222:18: ( E X C E P T I O N )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:222:20: E X C E P T I O N
            {
            mE(); 
            mX(); 
            mC(); 
            mE(); 
            mP(); 
            mT(); 
            mI(); 
            mO(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXCEPTION_KEYWORD"

    // $ANTLR start "WHEN_KEYWORD"
    public final void mWHEN_KEYWORD() throws RecognitionException {
        try {
            int _type = WHEN_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:223:13: ( W H E N )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:223:15: W H E N
            {
            mW(); 
            mH(); 
            mE(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHEN_KEYWORD"

    // $ANTLR start "THEN_KEYWORD"
    public final void mTHEN_KEYWORD() throws RecognitionException {
        try {
            int _type = THEN_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:224:13: ( T H E N )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:224:15: T H E N
            {
            mT(); 
            mH(); 
            mE(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THEN_KEYWORD"

    // $ANTLR start "NULL_KEYWORD"
    public final void mNULL_KEYWORD() throws RecognitionException {
        try {
            int _type = NULL_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:226:13: ( N U L L )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:226:15: N U L L
            {
            mN(); 
            mU(); 
            mL(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NULL_KEYWORD"

    // $ANTLR start "DEFAULT_KEYWORD"
    public final void mDEFAULT_KEYWORD() throws RecognitionException {
        try {
            int _type = DEFAULT_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:227:16: ( D E F A U L T )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:227:18: D E F A U L T
            {
            mD(); 
            mE(); 
            mF(); 
            mA(); 
            mU(); 
            mL(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEFAULT_KEYWORD"

    // $ANTLR start "ROWTYPE_KEYWORD"
    public final void mROWTYPE_KEYWORD() throws RecognitionException {
        try {
            int _type = ROWTYPE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:228:16: ( '%' R O W T Y P E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:228:18: '%' R O W T Y P E
            {
            match('%'); 
            mR(); 
            mO(); 
            mW(); 
            mT(); 
            mY(); 
            mP(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ROWTYPE_KEYWORD"

    // $ANTLR start "LIKE_TYPE_KEYWORD"
    public final void mLIKE_TYPE_KEYWORD() throws RecognitionException {
        try {
            int _type = LIKE_TYPE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:229:18: ( '%' T Y P E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:229:20: '%' T Y P E
            {
            match('%'); 
            mT(); 
            mY(); 
            mP(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LIKE_TYPE_KEYWORD"

    // $ANTLR start "TYPE_KEYWORD"
    public final void mTYPE_KEYWORD() throws RecognitionException {
        try {
            int _type = TYPE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:230:13: ( T Y P E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:230:15: T Y P E
            {
            mT(); 
            mY(); 
            mP(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPE_KEYWORD"

    // $ANTLR start "TRUE_KEYWORD"
    public final void mTRUE_KEYWORD() throws RecognitionException {
        try {
            int _type = TRUE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:231:13: ( T R U E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:231:15: T R U E
            {
            mT(); 
            mR(); 
            mU(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE_KEYWORD"

    // $ANTLR start "FALSE_KEYWORD"
    public final void mFALSE_KEYWORD() throws RecognitionException {
        try {
            int _type = FALSE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:232:14: ( F A L S E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:232:16: F A L S E
            {
            mF(); 
            mA(); 
            mL(); 
            mS(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE_KEYWORD"

    // $ANTLR start "CONSTANT_KEYWORD"
    public final void mCONSTANT_KEYWORD() throws RecognitionException {
        try {
            int _type = CONSTANT_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:233:17: ( C O N S T A N T )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:233:19: C O N S T A N T
            {
            mC(); 
            mO(); 
            mN(); 
            mS(); 
            mT(); 
            mA(); 
            mN(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONSTANT_KEYWORD"

    // $ANTLR start "WITH_KEYWORD"
    public final void mWITH_KEYWORD() throws RecognitionException {
        try {
            int _type = WITH_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:234:13: ( W I T H )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:234:15: W I T H
            {
            mW(); 
            mI(); 
            mT(); 
            mH(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WITH_KEYWORD"

    // $ANTLR start "LOCAL_KEYWORD"
    public final void mLOCAL_KEYWORD() throws RecognitionException {
        try {
            int _type = LOCAL_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:235:14: ( L O C A L )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:235:16: L O C A L
            {
            mL(); 
            mO(); 
            mC(); 
            mA(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOCAL_KEYWORD"

    // $ANTLR start "TIME_KEYWORD"
    public final void mTIME_KEYWORD() throws RecognitionException {
        try {
            int _type = TIME_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:236:13: ( T I M E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:236:15: T I M E
            {
            mT(); 
            mI(); 
            mM(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIME_KEYWORD"

    // $ANTLR start "ZONE_KEYWORD"
    public final void mZONE_KEYWORD() throws RecognitionException {
        try {
            int _type = ZONE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:237:13: ( Z O N E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:237:15: Z O N E
            {
            mZ(); 
            mO(); 
            mN(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ZONE_KEYWORD"

    // $ANTLR start "INTERVAL_KEYWORD"
    public final void mINTERVAL_KEYWORD() throws RecognitionException {
        try {
            int _type = INTERVAL_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:238:17: ( I N T E R V A L )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:238:19: I N T E R V A L
            {
            mI(); 
            mN(); 
            mT(); 
            mE(); 
            mR(); 
            mV(); 
            mA(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTERVAL_KEYWORD"

    // $ANTLR start "TO_KEYWORD"
    public final void mTO_KEYWORD() throws RecognitionException {
        try {
            int _type = TO_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:239:11: ( T O )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:239:13: T O
            {
            mT(); 
            mO(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TO_KEYWORD"

    // $ANTLR start "MONTH_KEYWORD"
    public final void mMONTH_KEYWORD() throws RecognitionException {
        try {
            int _type = MONTH_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:240:14: ( M O N T H )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:240:16: M O N T H
            {
            mM(); 
            mO(); 
            mN(); 
            mT(); 
            mH(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MONTH_KEYWORD"

    // $ANTLR start "SUBTYPE_KEYWORD"
    public final void mSUBTYPE_KEYWORD() throws RecognitionException {
        try {
            int _type = SUBTYPE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:241:16: ( S U B T Y P E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:241:18: S U B T Y P E
            {
            mS(); 
            mU(); 
            mB(); 
            mT(); 
            mY(); 
            mP(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUBTYPE_KEYWORD"

    // $ANTLR start "IS_KEYWORD"
    public final void mIS_KEYWORD() throws RecognitionException {
        try {
            int _type = IS_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:242:11: ( I S )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:242:13: I S
            {
            mI(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IS_KEYWORD"

    // $ANTLR start "RECORD_KEYWORD"
    public final void mRECORD_KEYWORD() throws RecognitionException {
        try {
            int _type = RECORD_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:243:15: ( R E C O R D )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:243:17: R E C O R D
            {
            mR(); 
            mE(); 
            mC(); 
            mO(); 
            mR(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RECORD_KEYWORD"

    // $ANTLR start "CREATE_KEYWORD"
    public final void mCREATE_KEYWORD() throws RecognitionException {
        try {
            int _type = CREATE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:244:15: ( C R E A T E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:244:17: C R E A T E
            {
            mC(); 
            mR(); 
            mE(); 
            mA(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CREATE_KEYWORD"

    // $ANTLR start "REPLACE_KEYWORD"
    public final void mREPLACE_KEYWORD() throws RecognitionException {
        try {
            int _type = REPLACE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:245:16: ( R E P L A C E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:245:18: R E P L A C E
            {
            mR(); 
            mE(); 
            mP(); 
            mL(); 
            mA(); 
            mC(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REPLACE_KEYWORD"

    // $ANTLR start "FUNCTION_KEYWORD"
    public final void mFUNCTION_KEYWORD() throws RecognitionException {
        try {
            int _type = FUNCTION_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:246:17: ( F U N C T I O N )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:246:19: F U N C T I O N
            {
            mF(); 
            mU(); 
            mN(); 
            mC(); 
            mT(); 
            mI(); 
            mO(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION_KEYWORD"

    // $ANTLR start "AS_KEYWORD"
    public final void mAS_KEYWORD() throws RecognitionException {
        try {
            int _type = AS_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:247:11: ( A S )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:247:13: A S
            {
            mA(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AS_KEYWORD"

    // $ANTLR start "RETURN_KEYWORD"
    public final void mRETURN_KEYWORD() throws RecognitionException {
        try {
            int _type = RETURN_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:248:15: ( R E T U R N )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:248:17: R E T U R N
            {
            mR(); 
            mE(); 
            mT(); 
            mU(); 
            mR(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETURN_KEYWORD"

    // $ANTLR start "IN_KEYWORD"
    public final void mIN_KEYWORD() throws RecognitionException {
        try {
            int _type = IN_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:249:11: ( I N )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:249:13: I N
            {
            mI(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IN_KEYWORD"

    // $ANTLR start "OUT_KEYWORD"
    public final void mOUT_KEYWORD() throws RecognitionException {
        try {
            int _type = OUT_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:250:12: ( O U T )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:250:14: O U T
            {
            mO(); 
            mU(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OUT_KEYWORD"

    // $ANTLR start "NOCOPY_KEYWORD"
    public final void mNOCOPY_KEYWORD() throws RecognitionException {
        try {
            int _type = NOCOPY_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:251:15: ( N O C O P Y )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:251:17: N O C O P Y
            {
            mN(); 
            mO(); 
            mC(); 
            mO(); 
            mP(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOCOPY_KEYWORD"

    // $ANTLR start "AUTHID_KEYWORD"
    public final void mAUTHID_KEYWORD() throws RecognitionException {
        try {
            int _type = AUTHID_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:252:15: ( A U T H I D )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:252:17: A U T H I D
            {
            mA(); 
            mU(); 
            mT(); 
            mH(); 
            mI(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AUTHID_KEYWORD"

    // $ANTLR start "CURRENT_USER_KEYWORD"
    public final void mCURRENT_USER_KEYWORD() throws RecognitionException {
        try {
            int _type = CURRENT_USER_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:253:21: ( C U R R E N T '_' U S E R )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:253:23: C U R R E N T '_' U S E R
            {
            mC(); 
            mU(); 
            mR(); 
            mR(); 
            mE(); 
            mN(); 
            mT(); 
            match('_'); 
            mU(); 
            mS(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CURRENT_USER_KEYWORD"

    // $ANTLR start "DEFINER_KEYWORD"
    public final void mDEFINER_KEYWORD() throws RecognitionException {
        try {
            int _type = DEFINER_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:254:16: ( D E F I N E R )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:254:18: D E F I N E R
            {
            mD(); 
            mE(); 
            mF(); 
            mI(); 
            mN(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEFINER_KEYWORD"

    // $ANTLR start "DETERMINISTIC_KEYWORD"
    public final void mDETERMINISTIC_KEYWORD() throws RecognitionException {
        try {
            int _type = DETERMINISTIC_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:255:22: ( D E T E R M I N I S T I C )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:255:24: D E T E R M I N I S T I C
            {
            mD(); 
            mE(); 
            mT(); 
            mE(); 
            mR(); 
            mM(); 
            mI(); 
            mN(); 
            mI(); 
            mS(); 
            mT(); 
            mI(); 
            mC(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DETERMINISTIC_KEYWORD"

    // $ANTLR start "PARALLEL_ENABLED_KEYWORD"
    public final void mPARALLEL_ENABLED_KEYWORD() throws RecognitionException {
        try {
            int _type = PARALLEL_ENABLED_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:256:25: ( P A R A L L E L '_' E N A B L E D )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:256:27: P A R A L L E L '_' E N A B L E D
            {
            mP(); 
            mA(); 
            mR(); 
            mA(); 
            mL(); 
            mL(); 
            mE(); 
            mL(); 
            match('_'); 
            mE(); 
            mN(); 
            mA(); 
            mB(); 
            mL(); 
            mE(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PARALLEL_ENABLED_KEYWORD"

    // $ANTLR start "PIPELINED_KEYWORD"
    public final void mPIPELINED_KEYWORD() throws RecognitionException {
        try {
            int _type = PIPELINED_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:257:18: ( P I P E L I N E D )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:257:20: P I P E L I N E D
            {
            mP(); 
            mI(); 
            mP(); 
            mE(); 
            mL(); 
            mI(); 
            mN(); 
            mE(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PIPELINED_KEYWORD"

    // $ANTLR start "RESULT_CACHE_KEYWORD"
    public final void mRESULT_CACHE_KEYWORD() throws RecognitionException {
        try {
            int _type = RESULT_CACHE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:258:21: ( R E S U L T '_' C A C H E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:258:23: R E S U L T '_' C A C H E
            {
            mR(); 
            mE(); 
            mS(); 
            mU(); 
            mL(); 
            mT(); 
            match('_'); 
            mC(); 
            mA(); 
            mC(); 
            mH(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RESULT_CACHE_KEYWORD"

    // $ANTLR start "PROCEDURE_KEYWORD"
    public final void mPROCEDURE_KEYWORD() throws RecognitionException {
        try {
            int _type = PROCEDURE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:259:18: ( P R O C E D U R E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:259:20: P R O C E D U R E
            {
            mP(); 
            mR(); 
            mO(); 
            mC(); 
            mE(); 
            mD(); 
            mU(); 
            mR(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PROCEDURE_KEYWORD"

    // $ANTLR start "IF_KEYWORD"
    public final void mIF_KEYWORD() throws RecognitionException {
        try {
            int _type = IF_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:260:11: ( I F )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:260:13: I F
            {
            mI(); 
            mF(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF_KEYWORD"

    // $ANTLR start "ELSE_KEYWORD"
    public final void mELSE_KEYWORD() throws RecognitionException {
        try {
            int _type = ELSE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:261:13: ( E L S E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:261:15: E L S E
            {
            mE(); 
            mL(); 
            mS(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE_KEYWORD"

    // $ANTLR start "ELSIF_KEYWORD"
    public final void mELSIF_KEYWORD() throws RecognitionException {
        try {
            int _type = ELSIF_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:262:14: ( E L S I F )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:262:16: E L S I F
            {
            mE(); 
            mL(); 
            mS(); 
            mI(); 
            mF(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSIF_KEYWORD"

    // $ANTLR start "GOTO_KEYWORD"
    public final void mGOTO_KEYWORD() throws RecognitionException {
        try {
            int _type = GOTO_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:267:13: ( G O T O )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:267:15: G O T O
            {
            mG(); 
            mO(); 
            mT(); 
            mO(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GOTO_KEYWORD"

    // $ANTLR start "LOOP_KEYWORD"
    public final void mLOOP_KEYWORD() throws RecognitionException {
        try {
            int _type = LOOP_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:268:13: ( L O O P )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:268:15: L O O P
            {
            mL(); 
            mO(); 
            mO(); 
            mP(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOOP_KEYWORD"

    // $ANTLR start "WHILE_KEYWORD"
    public final void mWHILE_KEYWORD() throws RecognitionException {
        try {
            int _type = WHILE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:270:14: ( W H I L E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:270:16: W H I L E
            {
            mW(); 
            mH(); 
            mI(); 
            mL(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE_KEYWORD"

    // $ANTLR start "FOR_KEYWORD"
    public final void mFOR_KEYWORD() throws RecognitionException {
        try {
            int _type = FOR_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:271:12: ( F O R )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:271:14: F O R
            {
            mF(); 
            mO(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOR_KEYWORD"

    // $ANTLR start "REVERSE_KEYWORD"
    public final void mREVERSE_KEYWORD() throws RecognitionException {
        try {
            int _type = REVERSE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:272:16: ( R E V E R S E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:272:18: R E V E R S E
            {
            mR(); 
            mE(); 
            mV(); 
            mE(); 
            mR(); 
            mS(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REVERSE_KEYWORD"

    // $ANTLR start "SELECT_KEYWORD"
    public final void mSELECT_KEYWORD() throws RecognitionException {
        try {
            int _type = SELECT_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:273:15: ( S E L E C T )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:273:17: S E L E C T
            {
            mS(); 
            mE(); 
            mL(); 
            mE(); 
            mC(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SELECT_KEYWORD"

    // $ANTLR start "COUNT_KEYWORD"
    public final void mCOUNT_KEYWORD() throws RecognitionException {
        try {
            int _type = COUNT_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:274:14: ( C O U N T )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:274:16: C O U N T
            {
            mC(); 
            mO(); 
            mU(); 
            mN(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COUNT_KEYWORD"

    // $ANTLR start "EXCEPTION_INIT_KEYWORD"
    public final void mEXCEPTION_INIT_KEYWORD() throws RecognitionException {
        try {
            int _type = EXCEPTION_INIT_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:275:23: ( E X C E P T I O N '_' I N I T )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:275:25: E X C E P T I O N '_' I N I T
            {
            mE(); 
            mX(); 
            mC(); 
            mE(); 
            mP(); 
            mT(); 
            mI(); 
            mO(); 
            mN(); 
            match('_'); 
            mI(); 
            mN(); 
            mI(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXCEPTION_INIT_KEYWORD"

    // $ANTLR start "LIKE_KEYWORD"
    public final void mLIKE_KEYWORD() throws RecognitionException {
        try {
            int _type = LIKE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:276:13: ( L I K E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:276:15: L I K E
            {
            mL(); 
            mI(); 
            mK(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LIKE_KEYWORD"

    // $ANTLR start "RAISE_KEYWORD"
    public final void mRAISE_KEYWORD() throws RecognitionException {
        try {
            int _type = RAISE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:277:14: ( R A I S E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:277:16: R A I S E
            {
            mR(); 
            mA(); 
            mI(); 
            mS(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RAISE_KEYWORD"

    // $ANTLR start "PRAGMA_KEYWORD"
    public final void mPRAGMA_KEYWORD() throws RecognitionException {
        try {
            int _type = PRAGMA_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:278:15: ( P R A G M A )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:278:17: P R A G M A
            {
            mP(); 
            mR(); 
            mA(); 
            mG(); 
            mM(); 
            mA(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRAGMA_KEYWORD"

    // $ANTLR start "AUTONOMOUS_TRANSACTION_KEYWORD"
    public final void mAUTONOMOUS_TRANSACTION_KEYWORD() throws RecognitionException {
        try {
            int _type = AUTONOMOUS_TRANSACTION_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:279:31: ( A U T O N O M O U S '_' T R A N S A C T I O N )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:279:33: A U T O N O M O U S '_' T R A N S A C T I O N
            {
            mA(); 
            mU(); 
            mT(); 
            mO(); 
            mN(); 
            mO(); 
            mM(); 
            mO(); 
            mU(); 
            mS(); 
            match('_'); 
            mT(); 
            mR(); 
            mA(); 
            mN(); 
            mS(); 
            mA(); 
            mC(); 
            mT(); 
            mI(); 
            mO(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AUTONOMOUS_TRANSACTION_KEYWORD"

    // $ANTLR start "CASE_KEYWORD"
    public final void mCASE_KEYWORD() throws RecognitionException {
        try {
            int _type = CASE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:280:13: ( C A S E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:280:15: C A S E
            {
            mC(); 
            mA(); 
            mS(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CASE_KEYWORD"

    // $ANTLR start "CLOSE_KEYWORD"
    public final void mCLOSE_KEYWORD() throws RecognitionException {
        try {
            int _type = CLOSE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:282:14: ( C L O S E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:282:16: C L O S E
            {
            mC(); 
            mL(); 
            mO(); 
            mS(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLOSE_KEYWORD"

    // $ANTLR start "TABLE_KEYWORD"
    public final void mTABLE_KEYWORD() throws RecognitionException {
        try {
            int _type = TABLE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:283:14: ( T A B L E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:283:16: T A B L E
            {
            mT(); 
            mA(); 
            mB(); 
            mL(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TABLE_KEYWORD"

    // $ANTLR start "OF_KEYWORD"
    public final void mOF_KEYWORD() throws RecognitionException {
        try {
            int _type = OF_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:284:11: ( O F )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:284:13: O F
            {
            mO(); 
            mF(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OF_KEYWORD"

    // $ANTLR start "INDEX_KEYWORD"
    public final void mINDEX_KEYWORD() throws RecognitionException {
        try {
            int _type = INDEX_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:285:14: ( I N D E X )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:285:16: I N D E X
            {
            mI(); 
            mN(); 
            mD(); 
            mE(); 
            mX(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INDEX_KEYWORD"

    // $ANTLR start "BY_KEYWORD"
    public final void mBY_KEYWORD() throws RecognitionException {
        try {
            int _type = BY_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:286:11: ( B Y )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:286:13: B Y
            {
            mB(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BY_KEYWORD"

    // $ANTLR start "VARRAY_KEYWORD"
    public final void mVARRAY_KEYWORD() throws RecognitionException {
        try {
            int _type = VARRAY_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:287:15: ( V A R R A Y )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:287:17: V A R R A Y
            {
            mV(); 
            mA(); 
            mR(); 
            mR(); 
            mA(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARRAY_KEYWORD"

    // $ANTLR start "VARYING_KEYWORD"
    public final void mVARYING_KEYWORD() throws RecognitionException {
        try {
            int _type = VARYING_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:288:16: ( V A R Y I N G )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:288:18: V A R Y I N G
            {
            mV(); 
            mA(); 
            mR(); 
            mY(); 
            mI(); 
            mN(); 
            mG(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARYING_KEYWORD"

    // $ANTLR start "ARRAY_KEYWORD"
    public final void mARRAY_KEYWORD() throws RecognitionException {
        try {
            int _type = ARRAY_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:289:14: ( A R R A Y )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:289:16: A R R A Y
            {
            mA(); 
            mR(); 
            mR(); 
            mA(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ARRAY_KEYWORD"

    // $ANTLR start "COMMIT_KEYWORD"
    public final void mCOMMIT_KEYWORD() throws RecognitionException {
        try {
            int _type = COMMIT_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:290:15: ( C O M M I T )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:290:17: C O M M I T
            {
            mC(); 
            mO(); 
            mM(); 
            mM(); 
            mI(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMIT_KEYWORD"

    // $ANTLR start "REF_KEYWORD"
    public final void mREF_KEYWORD() throws RecognitionException {
        try {
            int _type = REF_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:291:12: ( R E F )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:291:14: R E F
            {
            mR(); 
            mE(); 
            mF(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REF_KEYWORD"

    // $ANTLR start "CONTINUE_KEYWORD"
    public final void mCONTINUE_KEYWORD() throws RecognitionException {
        try {
            int _type = CONTINUE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:292:17: ( C O N T I N U E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:292:19: C O N T I N U E
            {
            mC(); 
            mO(); 
            mN(); 
            mT(); 
            mI(); 
            mN(); 
            mU(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONTINUE_KEYWORD"

    // $ANTLR start "CURSOR_KEYWORD"
    public final void mCURSOR_KEYWORD() throws RecognitionException {
        try {
            int _type = CURSOR_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:293:15: ( C U R S O R )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:293:17: C U R S O R
            {
            mC(); 
            mU(); 
            mR(); 
            mS(); 
            mO(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CURSOR_KEYWORD"

    // $ANTLR start "DELETE_KEYWORD"
    public final void mDELETE_KEYWORD() throws RecognitionException {
        try {
            int _type = DELETE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:294:15: ( D E L E T E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:294:17: D E L E T E
            {
            mD(); 
            mE(); 
            mL(); 
            mE(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DELETE_KEYWORD"

    // $ANTLR start "EXECUTE_KEYWORD"
    public final void mEXECUTE_KEYWORD() throws RecognitionException {
        try {
            int _type = EXECUTE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:295:16: ( E X E C U T E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:295:18: E X E C U T E
            {
            mE(); 
            mX(); 
            mE(); 
            mC(); 
            mU(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXECUTE_KEYWORD"

    // $ANTLR start "IMMEDIATE_KEYWORD"
    public final void mIMMEDIATE_KEYWORD() throws RecognitionException {
        try {
            int _type = IMMEDIATE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:296:18: ( I M M E D I A T E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:296:20: I M M E D I A T E
            {
            mI(); 
            mM(); 
            mM(); 
            mE(); 
            mD(); 
            mI(); 
            mA(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IMMEDIATE_KEYWORD"

    // $ANTLR start "EXIT_KEYWORD"
    public final void mEXIT_KEYWORD() throws RecognitionException {
        try {
            int _type = EXIT_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:297:13: ( E X I T )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:297:15: E X I T
            {
            mE(); 
            mX(); 
            mI(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXIT_KEYWORD"

    // $ANTLR start "INTO_KEYWORD"
    public final void mINTO_KEYWORD() throws RecognitionException {
        try {
            int _type = INTO_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:298:13: ( I N T O )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:298:15: I N T O
            {
            mI(); 
            mN(); 
            mT(); 
            mO(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTO_KEYWORD"

    // $ANTLR start "USING_KEYWORD"
    public final void mUSING_KEYWORD() throws RecognitionException {
        try {
            int _type = USING_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:299:14: ( U S I N G )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:299:16: U S I N G
            {
            mU(); 
            mS(); 
            mI(); 
            mN(); 
            mG(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "USING_KEYWORD"

    // $ANTLR start "BULK_KEYWORD"
    public final void mBULK_KEYWORD() throws RecognitionException {
        try {
            int _type = BULK_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:300:13: ( B U L K )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:300:15: B U L K
            {
            mB(); 
            mU(); 
            mL(); 
            mK(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BULK_KEYWORD"

    // $ANTLR start "COLLECT_KEYWORD"
    public final void mCOLLECT_KEYWORD() throws RecognitionException {
        try {
            int _type = COLLECT_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:301:16: ( C O L L E C T )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:301:18: C O L L E C T
            {
            mC(); 
            mO(); 
            mL(); 
            mL(); 
            mE(); 
            mC(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLLECT_KEYWORD"

    // $ANTLR start "FETCH_KEYWORD"
    public final void mFETCH_KEYWORD() throws RecognitionException {
        try {
            int _type = FETCH_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:302:14: ( F E T C H )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:302:16: F E T C H
            {
            mF(); 
            mE(); 
            mT(); 
            mC(); 
            mH(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FETCH_KEYWORD"

    // $ANTLR start "LIMIT_KEYWORD"
    public final void mLIMIT_KEYWORD() throws RecognitionException {
        try {
            int _type = LIMIT_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:303:14: ( L I M I T )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:303:16: L I M I T
            {
            mL(); 
            mI(); 
            mM(); 
            mI(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LIMIT_KEYWORD"

    // $ANTLR start "FORALL_KEYWORD"
    public final void mFORALL_KEYWORD() throws RecognitionException {
        try {
            int _type = FORALL_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:304:15: ( F O R A L L )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:304:17: F O R A L L
            {
            mF(); 
            mO(); 
            mR(); 
            mA(); 
            mL(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FORALL_KEYWORD"

    // $ANTLR start "SAVE_KEYWORD"
    public final void mSAVE_KEYWORD() throws RecognitionException {
        try {
            int _type = SAVE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:305:13: ( S A V E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:305:15: S A V E
            {
            mS(); 
            mA(); 
            mV(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SAVE_KEYWORD"

    // $ANTLR start "EXCEPTIONS_KEYWORD"
    public final void mEXCEPTIONS_KEYWORD() throws RecognitionException {
        try {
            int _type = EXCEPTIONS_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:306:19: ( E X C E P T I O N S )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:306:21: E X C E P T I O N S
            {
            mE(); 
            mX(); 
            mC(); 
            mE(); 
            mP(); 
            mT(); 
            mI(); 
            mO(); 
            mN(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXCEPTIONS_KEYWORD"

    // $ANTLR start "INDICES_KEYWORD"
    public final void mINDICES_KEYWORD() throws RecognitionException {
        try {
            int _type = INDICES_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:307:16: ( I N D I C E S )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:307:18: I N D I C E S
            {
            mI(); 
            mN(); 
            mD(); 
            mI(); 
            mC(); 
            mE(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INDICES_KEYWORD"

    // $ANTLR start "VALUES_KEYWORD"
    public final void mVALUES_KEYWORD() throws RecognitionException {
        try {
            int _type = VALUES_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:308:15: ( V A L U E S )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:308:17: V A L U E S
            {
            mV(); 
            mA(); 
            mL(); 
            mU(); 
            mE(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VALUES_KEYWORD"

    // $ANTLR start "BETWEEN_KEYWORD"
    public final void mBETWEEN_KEYWORD() throws RecognitionException {
        try {
            int _type = BETWEEN_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:309:16: ( B E T W E E N )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:309:18: B E T W E E N
            {
            mB(); 
            mE(); 
            mT(); 
            mW(); 
            mE(); 
            mE(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BETWEEN_KEYWORD"

    // $ANTLR start "INLINE_KEYWORD"
    public final void mINLINE_KEYWORD() throws RecognitionException {
        try {
            int _type = INLINE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:310:15: ( I N L I N E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:310:17: I N L I N E
            {
            mI(); 
            mN(); 
            mL(); 
            mI(); 
            mN(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INLINE_KEYWORD"

    // $ANTLR start "INSERT_KEYWORD"
    public final void mINSERT_KEYWORD() throws RecognitionException {
        try {
            int _type = INSERT_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:311:15: ( I N S E R T )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:311:17: I N S E R T
            {
            mI(); 
            mN(); 
            mS(); 
            mE(); 
            mR(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INSERT_KEYWORD"

    // $ANTLR start "LOCK_KEYWORD"
    public final void mLOCK_KEYWORD() throws RecognitionException {
        try {
            int _type = LOCK_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:312:13: ( L O C K )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:312:15: L O C K
            {
            mL(); 
            mO(); 
            mC(); 
            mK(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOCK_KEYWORD"

    // $ANTLR start "MERGE_KEYWORD"
    public final void mMERGE_KEYWORD() throws RecognitionException {
        try {
            int _type = MERGE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:313:14: ( M E R G E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:313:16: M E R G E
            {
            mM(); 
            mE(); 
            mR(); 
            mG(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MERGE_KEYWORD"

    // $ANTLR start "OPEN_KEYWORD"
    public final void mOPEN_KEYWORD() throws RecognitionException {
        try {
            int _type = OPEN_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:314:13: ( O P E N )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:314:15: O P E N
            {
            mO(); 
            mP(); 
            mE(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPEN_KEYWORD"

    // $ANTLR start "PACKAGE_KEYWORD"
    public final void mPACKAGE_KEYWORD() throws RecognitionException {
        try {
            int _type = PACKAGE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:315:16: ( P A C K A G E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:315:18: P A C K A G E
            {
            mP(); 
            mA(); 
            mC(); 
            mK(); 
            mA(); 
            mG(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PACKAGE_KEYWORD"

    // $ANTLR start "BODY_KEYWORD"
    public final void mBODY_KEYWORD() throws RecognitionException {
        try {
            int _type = BODY_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:316:13: ( B O D Y )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:316:15: B O D Y
            {
            mB(); 
            mO(); 
            mD(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BODY_KEYWORD"

    // $ANTLR start "RESTRICT_REFERENCES_KEYWORD"
    public final void mRESTRICT_REFERENCES_KEYWORD() throws RecognitionException {
        try {
            int _type = RESTRICT_REFERENCES_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:317:28: ( R E S T R I C T '_' R E F E R E N C E S )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:317:30: R E S T R I C T '_' R E F E R E N C E S
            {
            mR(); 
            mE(); 
            mS(); 
            mT(); 
            mR(); 
            mI(); 
            mC(); 
            mT(); 
            match('_'); 
            mR(); 
            mE(); 
            mF(); 
            mE(); 
            mR(); 
            mE(); 
            mN(); 
            mC(); 
            mE(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RESTRICT_REFERENCES_KEYWORD"

    // $ANTLR start "RETURNING_KEYWORD"
    public final void mRETURNING_KEYWORD() throws RecognitionException {
        try {
            int _type = RETURNING_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:318:18: ( R E T U R N I N G )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:318:20: R E T U R N I N G
            {
            mR(); 
            mE(); 
            mT(); 
            mU(); 
            mR(); 
            mN(); 
            mI(); 
            mN(); 
            mG(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETURNING_KEYWORD"

    // $ANTLR start "ROLLBACK_KEYWORD"
    public final void mROLLBACK_KEYWORD() throws RecognitionException {
        try {
            int _type = ROLLBACK_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:319:17: ( R O L L B A C K )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:319:19: R O L L B A C K
            {
            mR(); 
            mO(); 
            mL(); 
            mL(); 
            mB(); 
            mA(); 
            mC(); 
            mK(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ROLLBACK_KEYWORD"

    // $ANTLR start "SAVEPOINT_KEYWORD"
    public final void mSAVEPOINT_KEYWORD() throws RecognitionException {
        try {
            int _type = SAVEPOINT_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:320:18: ( S A V E P O I N T )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:320:20: S A V E P O I N T
            {
            mS(); 
            mA(); 
            mV(); 
            mE(); 
            mP(); 
            mO(); 
            mI(); 
            mN(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SAVEPOINT_KEYWORD"

    // $ANTLR start "SERIALLY_REUSABLE_KEYWORD"
    public final void mSERIALLY_REUSABLE_KEYWORD() throws RecognitionException {
        try {
            int _type = SERIALLY_REUSABLE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:321:26: ( S E R I A L L Y '_' R E U S A B L E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:321:28: S E R I A L L Y '_' R E U S A B L E
            {
            mS(); 
            mE(); 
            mR(); 
            mI(); 
            mA(); 
            mL(); 
            mL(); 
            mY(); 
            match('_'); 
            mR(); 
            mE(); 
            mU(); 
            mS(); 
            mA(); 
            mB(); 
            mL(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SERIALLY_REUSABLE_KEYWORD"

    // $ANTLR start "SET_KEYWORD"
    public final void mSET_KEYWORD() throws RecognitionException {
        try {
            int _type = SET_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:322:12: ( S E T )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:322:14: S E T
            {
            mS(); 
            mE(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SET_KEYWORD"

    // $ANTLR start "TRANSACTION_KEYWORD"
    public final void mTRANSACTION_KEYWORD() throws RecognitionException {
        try {
            int _type = TRANSACTION_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:323:20: ( T R A N S A C T I O N )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:323:22: T R A N S A C T I O N
            {
            mT(); 
            mR(); 
            mA(); 
            mN(); 
            mS(); 
            mA(); 
            mC(); 
            mT(); 
            mI(); 
            mO(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRANSACTION_KEYWORD"

    // $ANTLR start "NOTFOUND_KEYWORD"
    public final void mNOTFOUND_KEYWORD() throws RecognitionException {
        try {
            int _type = NOTFOUND_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:324:17: ( '%' N O T F O U N D )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:324:19: '%' N O T F O U N D
            {
            match('%'); 
            mN(); 
            mO(); 
            mT(); 
            mF(); 
            mO(); 
            mU(); 
            mN(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOTFOUND_KEYWORD"

    // $ANTLR start "FOUND_KEYWORD"
    public final void mFOUND_KEYWORD() throws RecognitionException {
        try {
            int _type = FOUND_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:325:14: ( '%' F O U N D )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:325:16: '%' F O U N D
            {
            match('%'); 
            mF(); 
            mO(); 
            mU(); 
            mN(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOUND_KEYWORD"

    // $ANTLR start "ISOPEN_KEYWORD"
    public final void mISOPEN_KEYWORD() throws RecognitionException {
        try {
            int _type = ISOPEN_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:326:15: ( '%' I S O P E N )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:326:17: '%' I S O P E N
            {
            match('%'); 
            mI(); 
            mS(); 
            mO(); 
            mP(); 
            mE(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ISOPEN_KEYWORD"

    // $ANTLR start "ROWCOUNT_KEYWORD"
    public final void mROWCOUNT_KEYWORD() throws RecognitionException {
        try {
            int _type = ROWCOUNT_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:327:17: ( '%' R O W C O U N T )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:327:19: '%' R O W C O U N T
            {
            match('%'); 
            mR(); 
            mO(); 
            mW(); 
            mC(); 
            mO(); 
            mU(); 
            mN(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ROWCOUNT_KEYWORD"

    // $ANTLR start "SQLCODE_KEYWORD"
    public final void mSQLCODE_KEYWORD() throws RecognitionException {
        try {
            int _type = SQLCODE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:328:16: ( S Q L C O D E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:328:18: S Q L C O D E
            {
            mS(); 
            mQ(); 
            mL(); 
            mC(); 
            mO(); 
            mD(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SQLCODE_KEYWORD"

    // $ANTLR start "SQLERRM_KEYWORD"
    public final void mSQLERRM_KEYWORD() throws RecognitionException {
        try {
            int _type = SQLERRM_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:329:16: ( S Q L E R R M )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:329:18: S Q L E R R M
            {
            mS(); 
            mQ(); 
            mL(); 
            mE(); 
            mR(); 
            mR(); 
            mM(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SQLERRM_KEYWORD"

    // $ANTLR start "UPDATE_KEYWORD"
    public final void mUPDATE_KEYWORD() throws RecognitionException {
        try {
            int _type = UPDATE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:330:15: ( U P D A T E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:330:17: U P D A T E
            {
            mU(); 
            mP(); 
            mD(); 
            mA(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UPDATE_KEYWORD"

    // $ANTLR start "EXISTS_KEYWORD"
    public final void mEXISTS_KEYWORD() throws RecognitionException {
        try {
            int _type = EXISTS_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:331:15: ( E X I S T S )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:331:17: E X I S T S
            {
            mE(); 
            mX(); 
            mI(); 
            mS(); 
            mT(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXISTS_KEYWORD"

    // $ANTLR start "TRIGGER_KEYWORD"
    public final void mTRIGGER_KEYWORD() throws RecognitionException {
        try {
            int _type = TRIGGER_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:332:16: ( T R I G G E R )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:332:18: T R I G G E R
            {
            mT(); 
            mR(); 
            mI(); 
            mG(); 
            mG(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRIGGER_KEYWORD"

    // $ANTLR start "BEFORE_KEYWORD"
    public final void mBEFORE_KEYWORD() throws RecognitionException {
        try {
            int _type = BEFORE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:333:15: ( B E F O R E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:333:17: B E F O R E
            {
            mB(); 
            mE(); 
            mF(); 
            mO(); 
            mR(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BEFORE_KEYWORD"

    // $ANTLR start "AFTER_KEYWORD"
    public final void mAFTER_KEYWORD() throws RecognitionException {
        try {
            int _type = AFTER_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:334:14: ( A F T E R )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:334:16: A F T E R
            {
            mA(); 
            mF(); 
            mT(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AFTER_KEYWORD"

    // $ANTLR start "INSTEAD_KEYWORD"
    public final void mINSTEAD_KEYWORD() throws RecognitionException {
        try {
            int _type = INSTEAD_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:335:16: ( I N S T E A D )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:335:18: I N S T E A D
            {
            mI(); 
            mN(); 
            mS(); 
            mT(); 
            mE(); 
            mA(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INSTEAD_KEYWORD"

    // $ANTLR start "ON_KEYWORD"
    public final void mON_KEYWORD() throws RecognitionException {
        try {
            int _type = ON_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:336:11: ( O N )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:336:13: O N
            {
            mO(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ON_KEYWORD"

    // $ANTLR start "NESTED_KEYWORD"
    public final void mNESTED_KEYWORD() throws RecognitionException {
        try {
            int _type = NESTED_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:337:15: ( N E S T E D )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:337:17: N E S T E D
            {
            mN(); 
            mE(); 
            mS(); 
            mT(); 
            mE(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NESTED_KEYWORD"

    // $ANTLR start "REFERENCING_KEYWORD"
    public final void mREFERENCING_KEYWORD() throws RecognitionException {
        try {
            int _type = REFERENCING_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:338:20: ( R E F E R E N C I N G )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:338:22: R E F E R E N C I N G
            {
            mR(); 
            mE(); 
            mF(); 
            mE(); 
            mR(); 
            mE(); 
            mN(); 
            mC(); 
            mI(); 
            mN(); 
            mG(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REFERENCING_KEYWORD"

    // $ANTLR start "OLD_KEYWORD"
    public final void mOLD_KEYWORD() throws RecognitionException {
        try {
            int _type = OLD_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:339:12: ( O L D )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:339:14: O L D
            {
            mO(); 
            mL(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OLD_KEYWORD"

    // $ANTLR start "NEW_KEYWORD"
    public final void mNEW_KEYWORD() throws RecognitionException {
        try {
            int _type = NEW_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:340:12: ( N E W )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:340:14: N E W
            {
            mN(); 
            mE(); 
            mW(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEW_KEYWORD"

    // $ANTLR start "PARENT_KEYWORD"
    public final void mPARENT_KEYWORD() throws RecognitionException {
        try {
            int _type = PARENT_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:341:15: ( P A R E N T )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:341:17: P A R E N T
            {
            mP(); 
            mA(); 
            mR(); 
            mE(); 
            mN(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PARENT_KEYWORD"

    // $ANTLR start "EACH_KEYWORD"
    public final void mEACH_KEYWORD() throws RecognitionException {
        try {
            int _type = EACH_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:342:13: ( E A C H )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:342:15: E A C H
            {
            mE(); 
            mA(); 
            mC(); 
            mH(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EACH_KEYWORD"

    // $ANTLR start "ROW_KEYWORD"
    public final void mROW_KEYWORD() throws RecognitionException {
        try {
            int _type = ROW_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:343:12: ( R O W )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:343:14: R O W
            {
            mR(); 
            mO(); 
            mW(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ROW_KEYWORD"

    // $ANTLR start "FOLLOWS_KEYWORD"
    public final void mFOLLOWS_KEYWORD() throws RecognitionException {
        try {
            int _type = FOLLOWS_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:344:16: ( F O L L O W S )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:344:18: F O L L O W S
            {
            mF(); 
            mO(); 
            mL(); 
            mL(); 
            mO(); 
            mW(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOLLOWS_KEYWORD"

    // $ANTLR start "ENABLE_KEYWORD"
    public final void mENABLE_KEYWORD() throws RecognitionException {
        try {
            int _type = ENABLE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:345:15: ( E N A B L E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:345:17: E N A B L E
            {
            mE(); 
            mN(); 
            mA(); 
            mB(); 
            mL(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENABLE_KEYWORD"

    // $ANTLR start "DISABLE_KEYWORD"
    public final void mDISABLE_KEYWORD() throws RecognitionException {
        try {
            int _type = DISABLE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:346:16: ( D I S A B L E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:346:18: D I S A B L E
            {
            mD(); 
            mI(); 
            mS(); 
            mA(); 
            mB(); 
            mL(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DISABLE_KEYWORD"

    // $ANTLR start "OID_KEYWORD"
    public final void mOID_KEYWORD() throws RecognitionException {
        try {
            int _type = OID_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:347:12: ( O I D )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:347:14: O I D
            {
            mO(); 
            mI(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OID_KEYWORD"

    // $ANTLR start "OBJECT_KEYWORD"
    public final void mOBJECT_KEYWORD() throws RecognitionException {
        try {
            int _type = OBJECT_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:348:15: ( O B J E C T )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:348:17: O B J E C T
            {
            mO(); 
            mB(); 
            mJ(); 
            mE(); 
            mC(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OBJECT_KEYWORD"

    // $ANTLR start "UNDER_KEYWORD"
    public final void mUNDER_KEYWORD() throws RecognitionException {
        try {
            int _type = UNDER_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:349:14: ( U N D E R )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:349:16: U N D E R
            {
            mU(); 
            mN(); 
            mD(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNDER_KEYWORD"

    // $ANTLR start "FINAL_KEYWORD"
    public final void mFINAL_KEYWORD() throws RecognitionException {
        try {
            int _type = FINAL_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:350:14: ( F I N A L )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:350:16: F I N A L
            {
            mF(); 
            mI(); 
            mN(); 
            mA(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FINAL_KEYWORD"

    // $ANTLR start "INSTANTIABLE_KEYWORD"
    public final void mINSTANTIABLE_KEYWORD() throws RecognitionException {
        try {
            int _type = INSTANTIABLE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:351:21: ( I N S T A N T I A B L E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:351:23: I N S T A N T I A B L E
            {
            mI(); 
            mN(); 
            mS(); 
            mT(); 
            mA(); 
            mN(); 
            mT(); 
            mI(); 
            mA(); 
            mB(); 
            mL(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INSTANTIABLE_KEYWORD"

    // $ANTLR start "OVERRIDING_KEYWORD"
    public final void mOVERRIDING_KEYWORD() throws RecognitionException {
        try {
            int _type = OVERRIDING_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:352:19: ( O V E R R I D I N G )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:352:21: O V E R R I D I N G
            {
            mO(); 
            mV(); 
            mE(); 
            mR(); 
            mR(); 
            mI(); 
            mD(); 
            mI(); 
            mN(); 
            mG(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OVERRIDING_KEYWORD"

    // $ANTLR start "MEMBER_KEYWORD"
    public final void mMEMBER_KEYWORD() throws RecognitionException {
        try {
            int _type = MEMBER_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:353:15: ( M E M B E R )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:353:17: M E M B E R
            {
            mM(); 
            mE(); 
            mM(); 
            mB(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MEMBER_KEYWORD"

    // $ANTLR start "STATIC_KEYWORD"
    public final void mSTATIC_KEYWORD() throws RecognitionException {
        try {
            int _type = STATIC_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:354:15: ( S T A T I C )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:354:17: S T A T I C
            {
            mS(); 
            mT(); 
            mA(); 
            mT(); 
            mI(); 
            mC(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STATIC_KEYWORD"

    // $ANTLR start "CONSTRUCTOR_KEYWORD"
    public final void mCONSTRUCTOR_KEYWORD() throws RecognitionException {
        try {
            int _type = CONSTRUCTOR_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:355:20: ( C O N S T R U C T O R )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:355:22: C O N S T R U C T O R
            {
            mC(); 
            mO(); 
            mN(); 
            mS(); 
            mT(); 
            mR(); 
            mU(); 
            mC(); 
            mT(); 
            mO(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONSTRUCTOR_KEYWORD"

    // $ANTLR start "SELF_KEYWORD"
    public final void mSELF_KEYWORD() throws RecognitionException {
        try {
            int _type = SELF_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:356:13: ( S E L F )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:356:15: S E L F
            {
            mS(); 
            mE(); 
            mL(); 
            mF(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SELF_KEYWORD"

    // $ANTLR start "RESULT_KEYWORD"
    public final void mRESULT_KEYWORD() throws RecognitionException {
        try {
            int _type = RESULT_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:357:15: ( R E S U L T )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:357:17: R E S U L T
            {
            mR(); 
            mE(); 
            mS(); 
            mU(); 
            mL(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RESULT_KEYWORD"

    // $ANTLR start "MAP_KEYWORD"
    public final void mMAP_KEYWORD() throws RecognitionException {
        try {
            int _type = MAP_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:358:12: ( M A P )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:358:14: M A P
            {
            mM(); 
            mA(); 
            mP(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MAP_KEYWORD"

    // $ANTLR start "ORDER_KEYWORD"
    public final void mORDER_KEYWORD() throws RecognitionException {
        try {
            int _type = ORDER_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:359:14: ( O R D E R )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:359:16: O R D E R
            {
            mO(); 
            mR(); 
            mD(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ORDER_KEYWORD"

    // $ANTLR start "JOIN_KEYWORD"
    public final void mJOIN_KEYWORD() throws RecognitionException {
        try {
            int _type = JOIN_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:360:13: ( J O I N )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:360:15: J O I N
            {
            mJ(); 
            mO(); 
            mI(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JOIN_KEYWORD"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:364:2: ( CHARS ( '$' | '#' | '_' | DIGIT | CHARS | '%' )* )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:364:4: CHARS ( '$' | '#' | '_' | DIGIT | CHARS | '%' )*
            {
            mCHARS(); 
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:364:10: ( '$' | '#' | '_' | DIGIT | CHARS | '%' )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>='#' && LA38_0<='%')||(LA38_0>='0' && LA38_0<='9')||(LA38_0>='A' && LA38_0<='Z')||LA38_0=='_'||(LA38_0>='a' && LA38_0<='z')) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:
            	    {
            	    if ( (input.LA(1)>='#' && input.LA(1)<='%')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "EXT_IDENTIFIER"
    public final void mEXT_IDENTIFIER() throws RecognitionException {
        try {
            int _type = EXT_IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:369:2: ( ( ':' )? ( '\"' )? IDENTIFIER ( '\"' )? ( '.' | '@' ) ( '\"' )? IDENTIFIER ( '\"' )? ( ( '.' | '@' )? IDENTIFIER )? )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:369:4: ( ':' )? ( '\"' )? IDENTIFIER ( '\"' )? ( '.' | '@' ) ( '\"' )? IDENTIFIER ( '\"' )? ( ( '.' | '@' )? IDENTIFIER )?
            {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:369:4: ( ':' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==':') ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:369:4: ':'
                    {
                    match(':'); 

                    }
                    break;

            }

            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:369:9: ( '\"' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0=='\"') ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:369:9: '\"'
                    {
                    match('\"'); 

                    }
                    break;

            }

            mIDENTIFIER(); 
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:369:25: ( '\"' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0=='\"') ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:369:25: '\"'
                    {
                    match('\"'); 

                    }
                    break;

            }

            if ( input.LA(1)=='.'||input.LA(1)=='@' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:369:42: ( '\"' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0=='\"') ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:369:42: '\"'
                    {
                    match('\"'); 

                    }
                    break;

            }

            mIDENTIFIER(); 
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:369:58: ( '\"' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0=='\"') ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:369:58: '\"'
                    {
                    match('\"'); 

                    }
                    break;

            }

            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:369:63: ( ( '.' | '@' )? IDENTIFIER )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0=='.'||(LA45_0>='@' && LA45_0<='Z')||(LA45_0>='a' && LA45_0<='z')) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:369:64: ( '.' | '@' )? IDENTIFIER
                    {
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:369:64: ( '.' | '@' )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0=='.'||LA44_0=='@') ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:
                            {
                            if ( input.LA(1)=='.'||input.LA(1)=='@' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mIDENTIFIER(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXT_IDENTIFIER"

    // $ANTLR start "ALIAS"
    public final void mALIAS() throws RecognitionException {
        try {
            int _type = ALIAS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:372:7: ( '\"' (~ '\"' )+ '\"' )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:372:9: '\"' (~ '\"' )+ '\"'
            {
            match('\"'); 
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:372:13: (~ '\"' )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>='\u0000' && LA46_0<='!')||(LA46_0>='#' && LA46_0<='\uFFFF')) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:372:14: ~ '\"'
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ALIAS"

    // $ANTLR start "SEPARATOR"
    public final void mSEPARATOR() throws RecognitionException {
        try {
            int _type = SEPARATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:376:2: ( ';' )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:376:4: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEPARATOR"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:382:2: ( ',' )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:382:4: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "PARAM_VALUE"
    public final void mPARAM_VALUE() throws RecognitionException {
        try {
            int _type = PARAM_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:385:2: ( '=>' )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:385:4: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PARAM_VALUE"

    // $ANTLR start "QUOTATION_MARK"
    public final void mQUOTATION_MARK() throws RecognitionException {
        try {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:388:2: ( '\"' )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:388:4: '\"'
            {
            match('\"'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "QUOTATION_MARK"

    // $ANTLR start "CHARS"
    public final void mCHARS() throws RecognitionException {
        try {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:391:2: ( 'a' .. 'z' | 'A' .. 'Z' )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "CHARS"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:395:2: ( '0' .. '9' )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:395:4: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "DIGITS"
    public final void mDIGITS() throws RecognitionException {
        try {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:399:2: ( DIGIT ( DIGIT )* )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:399:4: DIGIT ( DIGIT )*
            {
            mDIGIT(); 
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:399:10: ( DIGIT )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>='0' && LA47_0<='9')) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:399:12: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGITS"

    // $ANTLR start "EXP_DIGITS"
    public final void mEXP_DIGITS() throws RecognitionException {
        try {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:403:2: ( E ( '+' | '-' )? DIGITS )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:403:4: E ( '+' | '-' )? DIGITS
            {
            mE(); 
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:403:6: ( '+' | '-' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0=='+'||LA48_0=='-') ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            mDIGITS(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "EXP_DIGITS"

    // $ANTLR start "A"
    public final void mA() throws RecognitionException {
        try {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:406:11: ( ( 'a' | 'A' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:406:12: ( 'a' | 'A' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "A"

    // $ANTLR start "B"
    public final void mB() throws RecognitionException {
        try {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:407:11: ( ( 'b' | 'B' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:407:12: ( 'b' | 'B' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "B"

    // $ANTLR start "C"
    public final void mC() throws RecognitionException {
        try {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:408:11: ( ( 'c' | 'C' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:408:12: ( 'c' | 'C' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "C"

    // $ANTLR start "D"
    public final void mD() throws RecognitionException {
        try {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:409:11: ( ( 'd' | 'D' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:409:12: ( 'd' | 'D' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "D"

    // $ANTLR start "E"
    public final void mE() throws RecognitionException {
        try {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:410:11: ( ( 'e' | 'E' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:410:12: ( 'e' | 'E' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "E"

    // $ANTLR start "F"
    public final void mF() throws RecognitionException {
        try {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:411:11: ( ( 'f' | 'F' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:411:12: ( 'f' | 'F' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "F"

    // $ANTLR start "G"
    public final void mG() throws RecognitionException {
        try {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:412:11: ( ( 'g' | 'G' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:412:12: ( 'g' | 'G' )
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "G"

    // $ANTLR start "H"
    public final void mH() throws RecognitionException {
        try {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:413:11: ( ( 'h' | 'H' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:413:12: ( 'h' | 'H' )
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "H"

    // $ANTLR start "I"
    public final void mI() throws RecognitionException {
        try {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:414:11: ( ( 'i' | 'I' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:414:12: ( 'i' | 'I' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "I"

    // $ANTLR start "J"
    public final void mJ() throws RecognitionException {
        try {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:415:11: ( ( 'j' | 'J' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:415:12: ( 'j' | 'J' )
            {
            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "J"

    // $ANTLR start "K"
    public final void mK() throws RecognitionException {
        try {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:416:11: ( ( 'k' | 'K' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:416:12: ( 'k' | 'K' )
            {
            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "K"

    // $ANTLR start "L"
    public final void mL() throws RecognitionException {
        try {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:417:11: ( ( 'l' | 'L' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:417:12: ( 'l' | 'L' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "L"

    // $ANTLR start "M"
    public final void mM() throws RecognitionException {
        try {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:418:11: ( ( 'm' | 'M' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:418:12: ( 'm' | 'M' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "M"

    // $ANTLR start "N"
    public final void mN() throws RecognitionException {
        try {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:419:11: ( ( 'n' | 'N' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:419:12: ( 'n' | 'N' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "N"

    // $ANTLR start "O"
    public final void mO() throws RecognitionException {
        try {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:420:11: ( ( 'o' | 'O' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:420:12: ( 'o' | 'O' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "O"

    // $ANTLR start "P"
    public final void mP() throws RecognitionException {
        try {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:421:11: ( ( 'p' | 'P' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:421:12: ( 'p' | 'P' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "P"

    // $ANTLR start "Q"
    public final void mQ() throws RecognitionException {
        try {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:422:11: ( ( 'q' | 'Q' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:422:12: ( 'q' | 'Q' )
            {
            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Q"

    // $ANTLR start "R"
    public final void mR() throws RecognitionException {
        try {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:423:11: ( ( 'r' | 'R' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:423:12: ( 'r' | 'R' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "R"

    // $ANTLR start "S"
    public final void mS() throws RecognitionException {
        try {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:424:11: ( ( 's' | 'S' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:424:12: ( 's' | 'S' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "S"

    // $ANTLR start "T"
    public final void mT() throws RecognitionException {
        try {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:425:11: ( ( 't' | 'T' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:425:12: ( 't' | 'T' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "T"

    // $ANTLR start "U"
    public final void mU() throws RecognitionException {
        try {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:426:11: ( ( 'u' | 'U' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:426:12: ( 'u' | 'U' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "U"

    // $ANTLR start "V"
    public final void mV() throws RecognitionException {
        try {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:427:11: ( ( 'v' | 'V' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:427:12: ( 'v' | 'V' )
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "V"

    // $ANTLR start "W"
    public final void mW() throws RecognitionException {
        try {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:428:11: ( ( 'w' | 'W' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:428:12: ( 'w' | 'W' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "W"

    // $ANTLR start "X"
    public final void mX() throws RecognitionException {
        try {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:429:11: ( ( 'x' | 'X' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:429:12: ( 'x' | 'X' )
            {
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "X"

    // $ANTLR start "Y"
    public final void mY() throws RecognitionException {
        try {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:430:11: ( ( 'y' | 'Y' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:430:12: ( 'y' | 'Y' )
            {
            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Y"

    // $ANTLR start "Z"
    public final void mZ() throws RecognitionException {
        try {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:431:11: ( ( 'z' | 'Z' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:431:12: ( 'z' | 'Z' )
            {
            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Z"

    // $ANTLR start "THE_REST"
    public final void mTHE_REST() throws RecognitionException {
        try {
            int _type = THE_REST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:434:9: ( . )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:434:11: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THE_REST"

    public void mTokens() throws RecognitionException {
        // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:8: ( T__198 | T__199 | T__200 | T__201 | T__202 | T__203 | T__204 | T__205 | T__206 | T__207 | T__208 | T__209 | T__210 | T__211 | T__212 | T__213 | T__214 | T__215 | T__216 | T__217 | T__218 | T__219 | T__220 | T__221 | BLOCK_COMMENT | LINE_COMMENT | WHITESPACE | OR_OPERATOR | AND_OPERATOR | NOT_OPERATOR | NUMBER_UNSIGNED | STRING | SOME_TYPES | SCALE_TYPES | SIZE_TYPES | CHAR_TYPES | CHAR_TYPE | BYTE_TYPE | RAW_TYPE | TIMESTAMP_TYPE | YEAR_TYPE | DAY_TYPE | SECOND_TYPE | KEYWORD | BEGIN_KEYWORD | END_KEYWORD | DECLARE_KEYWORD | EXCEPTION_KEYWORD | WHEN_KEYWORD | THEN_KEYWORD | NULL_KEYWORD | DEFAULT_KEYWORD | ROWTYPE_KEYWORD | LIKE_TYPE_KEYWORD | TYPE_KEYWORD | TRUE_KEYWORD | FALSE_KEYWORD | CONSTANT_KEYWORD | WITH_KEYWORD | LOCAL_KEYWORD | TIME_KEYWORD | ZONE_KEYWORD | INTERVAL_KEYWORD | TO_KEYWORD | MONTH_KEYWORD | SUBTYPE_KEYWORD | IS_KEYWORD | RECORD_KEYWORD | CREATE_KEYWORD | REPLACE_KEYWORD | FUNCTION_KEYWORD | AS_KEYWORD | RETURN_KEYWORD | IN_KEYWORD | OUT_KEYWORD | NOCOPY_KEYWORD | AUTHID_KEYWORD | CURRENT_USER_KEYWORD | DEFINER_KEYWORD | DETERMINISTIC_KEYWORD | PARALLEL_ENABLED_KEYWORD | PIPELINED_KEYWORD | RESULT_CACHE_KEYWORD | PROCEDURE_KEYWORD | IF_KEYWORD | ELSE_KEYWORD | ELSIF_KEYWORD | GOTO_KEYWORD | LOOP_KEYWORD | WHILE_KEYWORD | FOR_KEYWORD | REVERSE_KEYWORD | SELECT_KEYWORD | COUNT_KEYWORD | EXCEPTION_INIT_KEYWORD | LIKE_KEYWORD | RAISE_KEYWORD | PRAGMA_KEYWORD | AUTONOMOUS_TRANSACTION_KEYWORD | CASE_KEYWORD | CLOSE_KEYWORD | TABLE_KEYWORD | OF_KEYWORD | INDEX_KEYWORD | BY_KEYWORD | VARRAY_KEYWORD | VARYING_KEYWORD | ARRAY_KEYWORD | COMMIT_KEYWORD | REF_KEYWORD | CONTINUE_KEYWORD | CURSOR_KEYWORD | DELETE_KEYWORD | EXECUTE_KEYWORD | IMMEDIATE_KEYWORD | EXIT_KEYWORD | INTO_KEYWORD | USING_KEYWORD | BULK_KEYWORD | COLLECT_KEYWORD | FETCH_KEYWORD | LIMIT_KEYWORD | FORALL_KEYWORD | SAVE_KEYWORD | EXCEPTIONS_KEYWORD | INDICES_KEYWORD | VALUES_KEYWORD | BETWEEN_KEYWORD | INLINE_KEYWORD | INSERT_KEYWORD | LOCK_KEYWORD | MERGE_KEYWORD | OPEN_KEYWORD | PACKAGE_KEYWORD | BODY_KEYWORD | RESTRICT_REFERENCES_KEYWORD | RETURNING_KEYWORD | ROLLBACK_KEYWORD | SAVEPOINT_KEYWORD | SERIALLY_REUSABLE_KEYWORD | SET_KEYWORD | TRANSACTION_KEYWORD | NOTFOUND_KEYWORD | FOUND_KEYWORD | ISOPEN_KEYWORD | ROWCOUNT_KEYWORD | SQLCODE_KEYWORD | SQLERRM_KEYWORD | UPDATE_KEYWORD | EXISTS_KEYWORD | TRIGGER_KEYWORD | BEFORE_KEYWORD | AFTER_KEYWORD | INSTEAD_KEYWORD | ON_KEYWORD | NESTED_KEYWORD | REFERENCING_KEYWORD | OLD_KEYWORD | NEW_KEYWORD | PARENT_KEYWORD | EACH_KEYWORD | ROW_KEYWORD | FOLLOWS_KEYWORD | ENABLE_KEYWORD | DISABLE_KEYWORD | OID_KEYWORD | OBJECT_KEYWORD | UNDER_KEYWORD | FINAL_KEYWORD | INSTANTIABLE_KEYWORD | OVERRIDING_KEYWORD | MEMBER_KEYWORD | STATIC_KEYWORD | CONSTRUCTOR_KEYWORD | SELF_KEYWORD | RESULT_KEYWORD | MAP_KEYWORD | ORDER_KEYWORD | JOIN_KEYWORD | IDENTIFIER | EXT_IDENTIFIER | ALIAS | SEPARATOR | COMMA | PARAM_VALUE | THE_REST )
        int alt49=186;
        alt49 = dfa49.predict(input);
        switch (alt49) {
            case 1 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:10: T__198
                {
                mT__198(); 

                }
                break;
            case 2 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:17: T__199
                {
                mT__199(); 

                }
                break;
            case 3 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:24: T__200
                {
                mT__200(); 

                }
                break;
            case 4 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:31: T__201
                {
                mT__201(); 

                }
                break;
            case 5 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:38: T__202
                {
                mT__202(); 

                }
                break;
            case 6 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:45: T__203
                {
                mT__203(); 

                }
                break;
            case 7 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:52: T__204
                {
                mT__204(); 

                }
                break;
            case 8 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:59: T__205
                {
                mT__205(); 

                }
                break;
            case 9 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:66: T__206
                {
                mT__206(); 

                }
                break;
            case 10 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:73: T__207
                {
                mT__207(); 

                }
                break;
            case 11 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:80: T__208
                {
                mT__208(); 

                }
                break;
            case 12 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:87: T__209
                {
                mT__209(); 

                }
                break;
            case 13 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:94: T__210
                {
                mT__210(); 

                }
                break;
            case 14 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:101: T__211
                {
                mT__211(); 

                }
                break;
            case 15 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:108: T__212
                {
                mT__212(); 

                }
                break;
            case 16 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:115: T__213
                {
                mT__213(); 

                }
                break;
            case 17 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:122: T__214
                {
                mT__214(); 

                }
                break;
            case 18 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:129: T__215
                {
                mT__215(); 

                }
                break;
            case 19 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:136: T__216
                {
                mT__216(); 

                }
                break;
            case 20 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:143: T__217
                {
                mT__217(); 

                }
                break;
            case 21 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:150: T__218
                {
                mT__218(); 

                }
                break;
            case 22 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:157: T__219
                {
                mT__219(); 

                }
                break;
            case 23 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:164: T__220
                {
                mT__220(); 

                }
                break;
            case 24 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:171: T__221
                {
                mT__221(); 

                }
                break;
            case 25 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:178: BLOCK_COMMENT
                {
                mBLOCK_COMMENT(); 

                }
                break;
            case 26 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:192: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;
            case 27 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:205: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 28 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:216: OR_OPERATOR
                {
                mOR_OPERATOR(); 

                }
                break;
            case 29 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:228: AND_OPERATOR
                {
                mAND_OPERATOR(); 

                }
                break;
            case 30 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:241: NOT_OPERATOR
                {
                mNOT_OPERATOR(); 

                }
                break;
            case 31 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:254: NUMBER_UNSIGNED
                {
                mNUMBER_UNSIGNED(); 

                }
                break;
            case 32 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:270: STRING
                {
                mSTRING(); 

                }
                break;
            case 33 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:277: SOME_TYPES
                {
                mSOME_TYPES(); 

                }
                break;
            case 34 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:288: SCALE_TYPES
                {
                mSCALE_TYPES(); 

                }
                break;
            case 35 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:300: SIZE_TYPES
                {
                mSIZE_TYPES(); 

                }
                break;
            case 36 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:311: CHAR_TYPES
                {
                mCHAR_TYPES(); 

                }
                break;
            case 37 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:322: CHAR_TYPE
                {
                mCHAR_TYPE(); 

                }
                break;
            case 38 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:332: BYTE_TYPE
                {
                mBYTE_TYPE(); 

                }
                break;
            case 39 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:342: RAW_TYPE
                {
                mRAW_TYPE(); 

                }
                break;
            case 40 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:351: TIMESTAMP_TYPE
                {
                mTIMESTAMP_TYPE(); 

                }
                break;
            case 41 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:366: YEAR_TYPE
                {
                mYEAR_TYPE(); 

                }
                break;
            case 42 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:376: DAY_TYPE
                {
                mDAY_TYPE(); 

                }
                break;
            case 43 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:385: SECOND_TYPE
                {
                mSECOND_TYPE(); 

                }
                break;
            case 44 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:397: KEYWORD
                {
                mKEYWORD(); 

                }
                break;
            case 45 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:405: BEGIN_KEYWORD
                {
                mBEGIN_KEYWORD(); 

                }
                break;
            case 46 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:419: END_KEYWORD
                {
                mEND_KEYWORD(); 

                }
                break;
            case 47 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:431: DECLARE_KEYWORD
                {
                mDECLARE_KEYWORD(); 

                }
                break;
            case 48 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:447: EXCEPTION_KEYWORD
                {
                mEXCEPTION_KEYWORD(); 

                }
                break;
            case 49 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:465: WHEN_KEYWORD
                {
                mWHEN_KEYWORD(); 

                }
                break;
            case 50 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:478: THEN_KEYWORD
                {
                mTHEN_KEYWORD(); 

                }
                break;
            case 51 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:491: NULL_KEYWORD
                {
                mNULL_KEYWORD(); 

                }
                break;
            case 52 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:504: DEFAULT_KEYWORD
                {
                mDEFAULT_KEYWORD(); 

                }
                break;
            case 53 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:520: ROWTYPE_KEYWORD
                {
                mROWTYPE_KEYWORD(); 

                }
                break;
            case 54 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:536: LIKE_TYPE_KEYWORD
                {
                mLIKE_TYPE_KEYWORD(); 

                }
                break;
            case 55 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:554: TYPE_KEYWORD
                {
                mTYPE_KEYWORD(); 

                }
                break;
            case 56 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:567: TRUE_KEYWORD
                {
                mTRUE_KEYWORD(); 

                }
                break;
            case 57 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:580: FALSE_KEYWORD
                {
                mFALSE_KEYWORD(); 

                }
                break;
            case 58 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:594: CONSTANT_KEYWORD
                {
                mCONSTANT_KEYWORD(); 

                }
                break;
            case 59 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:611: WITH_KEYWORD
                {
                mWITH_KEYWORD(); 

                }
                break;
            case 60 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:624: LOCAL_KEYWORD
                {
                mLOCAL_KEYWORD(); 

                }
                break;
            case 61 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:638: TIME_KEYWORD
                {
                mTIME_KEYWORD(); 

                }
                break;
            case 62 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:651: ZONE_KEYWORD
                {
                mZONE_KEYWORD(); 

                }
                break;
            case 63 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:664: INTERVAL_KEYWORD
                {
                mINTERVAL_KEYWORD(); 

                }
                break;
            case 64 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:681: TO_KEYWORD
                {
                mTO_KEYWORD(); 

                }
                break;
            case 65 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:692: MONTH_KEYWORD
                {
                mMONTH_KEYWORD(); 

                }
                break;
            case 66 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:706: SUBTYPE_KEYWORD
                {
                mSUBTYPE_KEYWORD(); 

                }
                break;
            case 67 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:722: IS_KEYWORD
                {
                mIS_KEYWORD(); 

                }
                break;
            case 68 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:733: RECORD_KEYWORD
                {
                mRECORD_KEYWORD(); 

                }
                break;
            case 69 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:748: CREATE_KEYWORD
                {
                mCREATE_KEYWORD(); 

                }
                break;
            case 70 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:763: REPLACE_KEYWORD
                {
                mREPLACE_KEYWORD(); 

                }
                break;
            case 71 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:779: FUNCTION_KEYWORD
                {
                mFUNCTION_KEYWORD(); 

                }
                break;
            case 72 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:796: AS_KEYWORD
                {
                mAS_KEYWORD(); 

                }
                break;
            case 73 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:807: RETURN_KEYWORD
                {
                mRETURN_KEYWORD(); 

                }
                break;
            case 74 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:822: IN_KEYWORD
                {
                mIN_KEYWORD(); 

                }
                break;
            case 75 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:833: OUT_KEYWORD
                {
                mOUT_KEYWORD(); 

                }
                break;
            case 76 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:845: NOCOPY_KEYWORD
                {
                mNOCOPY_KEYWORD(); 

                }
                break;
            case 77 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:860: AUTHID_KEYWORD
                {
                mAUTHID_KEYWORD(); 

                }
                break;
            case 78 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:875: CURRENT_USER_KEYWORD
                {
                mCURRENT_USER_KEYWORD(); 

                }
                break;
            case 79 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:896: DEFINER_KEYWORD
                {
                mDEFINER_KEYWORD(); 

                }
                break;
            case 80 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:912: DETERMINISTIC_KEYWORD
                {
                mDETERMINISTIC_KEYWORD(); 

                }
                break;
            case 81 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:934: PARALLEL_ENABLED_KEYWORD
                {
                mPARALLEL_ENABLED_KEYWORD(); 

                }
                break;
            case 82 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:959: PIPELINED_KEYWORD
                {
                mPIPELINED_KEYWORD(); 

                }
                break;
            case 83 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:977: RESULT_CACHE_KEYWORD
                {
                mRESULT_CACHE_KEYWORD(); 

                }
                break;
            case 84 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:998: PROCEDURE_KEYWORD
                {
                mPROCEDURE_KEYWORD(); 

                }
                break;
            case 85 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1016: IF_KEYWORD
                {
                mIF_KEYWORD(); 

                }
                break;
            case 86 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1027: ELSE_KEYWORD
                {
                mELSE_KEYWORD(); 

                }
                break;
            case 87 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1040: ELSIF_KEYWORD
                {
                mELSIF_KEYWORD(); 

                }
                break;
            case 88 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1054: GOTO_KEYWORD
                {
                mGOTO_KEYWORD(); 

                }
                break;
            case 89 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1067: LOOP_KEYWORD
                {
                mLOOP_KEYWORD(); 

                }
                break;
            case 90 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1080: WHILE_KEYWORD
                {
                mWHILE_KEYWORD(); 

                }
                break;
            case 91 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1094: FOR_KEYWORD
                {
                mFOR_KEYWORD(); 

                }
                break;
            case 92 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1106: REVERSE_KEYWORD
                {
                mREVERSE_KEYWORD(); 

                }
                break;
            case 93 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1122: SELECT_KEYWORD
                {
                mSELECT_KEYWORD(); 

                }
                break;
            case 94 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1137: COUNT_KEYWORD
                {
                mCOUNT_KEYWORD(); 

                }
                break;
            case 95 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1151: EXCEPTION_INIT_KEYWORD
                {
                mEXCEPTION_INIT_KEYWORD(); 

                }
                break;
            case 96 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1174: LIKE_KEYWORD
                {
                mLIKE_KEYWORD(); 

                }
                break;
            case 97 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1187: RAISE_KEYWORD
                {
                mRAISE_KEYWORD(); 

                }
                break;
            case 98 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1201: PRAGMA_KEYWORD
                {
                mPRAGMA_KEYWORD(); 

                }
                break;
            case 99 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1216: AUTONOMOUS_TRANSACTION_KEYWORD
                {
                mAUTONOMOUS_TRANSACTION_KEYWORD(); 

                }
                break;
            case 100 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1247: CASE_KEYWORD
                {
                mCASE_KEYWORD(); 

                }
                break;
            case 101 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1260: CLOSE_KEYWORD
                {
                mCLOSE_KEYWORD(); 

                }
                break;
            case 102 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1274: TABLE_KEYWORD
                {
                mTABLE_KEYWORD(); 

                }
                break;
            case 103 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1288: OF_KEYWORD
                {
                mOF_KEYWORD(); 

                }
                break;
            case 104 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1299: INDEX_KEYWORD
                {
                mINDEX_KEYWORD(); 

                }
                break;
            case 105 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1313: BY_KEYWORD
                {
                mBY_KEYWORD(); 

                }
                break;
            case 106 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1324: VARRAY_KEYWORD
                {
                mVARRAY_KEYWORD(); 

                }
                break;
            case 107 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1339: VARYING_KEYWORD
                {
                mVARYING_KEYWORD(); 

                }
                break;
            case 108 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1355: ARRAY_KEYWORD
                {
                mARRAY_KEYWORD(); 

                }
                break;
            case 109 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1369: COMMIT_KEYWORD
                {
                mCOMMIT_KEYWORD(); 

                }
                break;
            case 110 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1384: REF_KEYWORD
                {
                mREF_KEYWORD(); 

                }
                break;
            case 111 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1396: CONTINUE_KEYWORD
                {
                mCONTINUE_KEYWORD(); 

                }
                break;
            case 112 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1413: CURSOR_KEYWORD
                {
                mCURSOR_KEYWORD(); 

                }
                break;
            case 113 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1428: DELETE_KEYWORD
                {
                mDELETE_KEYWORD(); 

                }
                break;
            case 114 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1443: EXECUTE_KEYWORD
                {
                mEXECUTE_KEYWORD(); 

                }
                break;
            case 115 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1459: IMMEDIATE_KEYWORD
                {
                mIMMEDIATE_KEYWORD(); 

                }
                break;
            case 116 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1477: EXIT_KEYWORD
                {
                mEXIT_KEYWORD(); 

                }
                break;
            case 117 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1490: INTO_KEYWORD
                {
                mINTO_KEYWORD(); 

                }
                break;
            case 118 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1503: USING_KEYWORD
                {
                mUSING_KEYWORD(); 

                }
                break;
            case 119 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1517: BULK_KEYWORD
                {
                mBULK_KEYWORD(); 

                }
                break;
            case 120 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1530: COLLECT_KEYWORD
                {
                mCOLLECT_KEYWORD(); 

                }
                break;
            case 121 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1546: FETCH_KEYWORD
                {
                mFETCH_KEYWORD(); 

                }
                break;
            case 122 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1560: LIMIT_KEYWORD
                {
                mLIMIT_KEYWORD(); 

                }
                break;
            case 123 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1574: FORALL_KEYWORD
                {
                mFORALL_KEYWORD(); 

                }
                break;
            case 124 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1589: SAVE_KEYWORD
                {
                mSAVE_KEYWORD(); 

                }
                break;
            case 125 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1602: EXCEPTIONS_KEYWORD
                {
                mEXCEPTIONS_KEYWORD(); 

                }
                break;
            case 126 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1621: INDICES_KEYWORD
                {
                mINDICES_KEYWORD(); 

                }
                break;
            case 127 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1637: VALUES_KEYWORD
                {
                mVALUES_KEYWORD(); 

                }
                break;
            case 128 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1652: BETWEEN_KEYWORD
                {
                mBETWEEN_KEYWORD(); 

                }
                break;
            case 129 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1668: INLINE_KEYWORD
                {
                mINLINE_KEYWORD(); 

                }
                break;
            case 130 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1683: INSERT_KEYWORD
                {
                mINSERT_KEYWORD(); 

                }
                break;
            case 131 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1698: LOCK_KEYWORD
                {
                mLOCK_KEYWORD(); 

                }
                break;
            case 132 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1711: MERGE_KEYWORD
                {
                mMERGE_KEYWORD(); 

                }
                break;
            case 133 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1725: OPEN_KEYWORD
                {
                mOPEN_KEYWORD(); 

                }
                break;
            case 134 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1738: PACKAGE_KEYWORD
                {
                mPACKAGE_KEYWORD(); 

                }
                break;
            case 135 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1754: BODY_KEYWORD
                {
                mBODY_KEYWORD(); 

                }
                break;
            case 136 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1767: RESTRICT_REFERENCES_KEYWORD
                {
                mRESTRICT_REFERENCES_KEYWORD(); 

                }
                break;
            case 137 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1795: RETURNING_KEYWORD
                {
                mRETURNING_KEYWORD(); 

                }
                break;
            case 138 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1813: ROLLBACK_KEYWORD
                {
                mROLLBACK_KEYWORD(); 

                }
                break;
            case 139 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1830: SAVEPOINT_KEYWORD
                {
                mSAVEPOINT_KEYWORD(); 

                }
                break;
            case 140 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1848: SERIALLY_REUSABLE_KEYWORD
                {
                mSERIALLY_REUSABLE_KEYWORD(); 

                }
                break;
            case 141 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1874: SET_KEYWORD
                {
                mSET_KEYWORD(); 

                }
                break;
            case 142 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1886: TRANSACTION_KEYWORD
                {
                mTRANSACTION_KEYWORD(); 

                }
                break;
            case 143 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1906: NOTFOUND_KEYWORD
                {
                mNOTFOUND_KEYWORD(); 

                }
                break;
            case 144 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1923: FOUND_KEYWORD
                {
                mFOUND_KEYWORD(); 

                }
                break;
            case 145 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1937: ISOPEN_KEYWORD
                {
                mISOPEN_KEYWORD(); 

                }
                break;
            case 146 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1952: ROWCOUNT_KEYWORD
                {
                mROWCOUNT_KEYWORD(); 

                }
                break;
            case 147 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1969: SQLCODE_KEYWORD
                {
                mSQLCODE_KEYWORD(); 

                }
                break;
            case 148 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1985: SQLERRM_KEYWORD
                {
                mSQLERRM_KEYWORD(); 

                }
                break;
            case 149 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2001: UPDATE_KEYWORD
                {
                mUPDATE_KEYWORD(); 

                }
                break;
            case 150 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2016: EXISTS_KEYWORD
                {
                mEXISTS_KEYWORD(); 

                }
                break;
            case 151 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2031: TRIGGER_KEYWORD
                {
                mTRIGGER_KEYWORD(); 

                }
                break;
            case 152 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2047: BEFORE_KEYWORD
                {
                mBEFORE_KEYWORD(); 

                }
                break;
            case 153 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2062: AFTER_KEYWORD
                {
                mAFTER_KEYWORD(); 

                }
                break;
            case 154 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2076: INSTEAD_KEYWORD
                {
                mINSTEAD_KEYWORD(); 

                }
                break;
            case 155 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2092: ON_KEYWORD
                {
                mON_KEYWORD(); 

                }
                break;
            case 156 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2103: NESTED_KEYWORD
                {
                mNESTED_KEYWORD(); 

                }
                break;
            case 157 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2118: REFERENCING_KEYWORD
                {
                mREFERENCING_KEYWORD(); 

                }
                break;
            case 158 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2138: OLD_KEYWORD
                {
                mOLD_KEYWORD(); 

                }
                break;
            case 159 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2150: NEW_KEYWORD
                {
                mNEW_KEYWORD(); 

                }
                break;
            case 160 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2162: PARENT_KEYWORD
                {
                mPARENT_KEYWORD(); 

                }
                break;
            case 161 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2177: EACH_KEYWORD
                {
                mEACH_KEYWORD(); 

                }
                break;
            case 162 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2190: ROW_KEYWORD
                {
                mROW_KEYWORD(); 

                }
                break;
            case 163 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2202: FOLLOWS_KEYWORD
                {
                mFOLLOWS_KEYWORD(); 

                }
                break;
            case 164 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2218: ENABLE_KEYWORD
                {
                mENABLE_KEYWORD(); 

                }
                break;
            case 165 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2233: DISABLE_KEYWORD
                {
                mDISABLE_KEYWORD(); 

                }
                break;
            case 166 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2249: OID_KEYWORD
                {
                mOID_KEYWORD(); 

                }
                break;
            case 167 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2261: OBJECT_KEYWORD
                {
                mOBJECT_KEYWORD(); 

                }
                break;
            case 168 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2276: UNDER_KEYWORD
                {
                mUNDER_KEYWORD(); 

                }
                break;
            case 169 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2290: FINAL_KEYWORD
                {
                mFINAL_KEYWORD(); 

                }
                break;
            case 170 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2304: INSTANTIABLE_KEYWORD
                {
                mINSTANTIABLE_KEYWORD(); 

                }
                break;
            case 171 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2325: OVERRIDING_KEYWORD
                {
                mOVERRIDING_KEYWORD(); 

                }
                break;
            case 172 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2344: MEMBER_KEYWORD
                {
                mMEMBER_KEYWORD(); 

                }
                break;
            case 173 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2359: STATIC_KEYWORD
                {
                mSTATIC_KEYWORD(); 

                }
                break;
            case 174 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2374: CONSTRUCTOR_KEYWORD
                {
                mCONSTRUCTOR_KEYWORD(); 

                }
                break;
            case 175 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2394: SELF_KEYWORD
                {
                mSELF_KEYWORD(); 

                }
                break;
            case 176 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2407: RESULT_KEYWORD
                {
                mRESULT_KEYWORD(); 

                }
                break;
            case 177 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2422: MAP_KEYWORD
                {
                mMAP_KEYWORD(); 

                }
                break;
            case 178 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2434: ORDER_KEYWORD
                {
                mORDER_KEYWORD(); 

                }
                break;
            case 179 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2448: JOIN_KEYWORD
                {
                mJOIN_KEYWORD(); 

                }
                break;
            case 180 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2461: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 181 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2472: EXT_IDENTIFIER
                {
                mEXT_IDENTIFIER(); 

                }
                break;
            case 182 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2487: ALIAS
                {
                mALIAS(); 

                }
                break;
            case 183 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2493: SEPARATOR
                {
                mSEPARATOR(); 

                }
                break;
            case 184 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2503: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 185 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2509: PARAM_VALUE
                {
                mPARAM_VALUE(); 

                }
                break;
            case 186 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2521: THE_REST
                {
                mTHE_REST(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA49 dfa49 = new DFA49(this);
    static final String DFA11_eotS =
        "\36\uffff\1\43\7\uffff\1\52\10\uffff\1\62\4\uffff\1\70\5\uffff";
    static final String DFA11_eofS =
        "\72\uffff";
    static final String DFA11_minS =
        "\1\102\1\101\1\114\1\111\1\116\1\106\1\105\1\117\4\uffff\1\124"+
        "\2\uffff\1\123\1\uffff\1\107\1\124\1\116\5\uffff\1\116\1\125\1\111"+
        "\2\uffff\1\105\1\101\1\107\1\122\1\124\2\uffff\1\122\1\11\1\101"+
        "\1\111\1\131\2\uffff\1\114\1\126\1\137\1\116\1\105\1\104\2\uffff"+
        "\1\116\5\uffff";
    static final String DFA11_maxS =
        "\1\165\1\143\1\157\1\155\1\156\3\157\4\uffff\1\164\2\uffff\1\163"+
        "\1\uffff\1\155\1\164\1\156\5\uffff\1\156\1\165\1\151\2\uffff\1\145"+
        "\1\141\1\147\1\162\1\164\2\uffff\1\162\1\40\1\141\1\151\1\171\2"+
        "\uffff\1\154\1\166\1\137\1\156\1\145\1\151\2\uffff\1\156\5\uffff";
    static final String DFA11_acceptS =
        "\10\uffff\1\22\1\24\1\25\1\30\1\uffff\1\31\1\2\1\uffff\1\12\3\uffff"+
        "\1\23\1\27\1\26\1\14\1\21\3\uffff\1\6\1\7\5\uffff\1\10\1\11\5\uffff"+
        "\1\17\1\20\6\uffff\1\1\1\3\1\uffff\1\15\1\13\1\16\1\4\1\5";
    static final String DFA11_specialS =
        "\72\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\5\1\13\1\12\4\uffff\1\4\2\uffff\1\7\1\11\1\1\1\uffff\1\2"+
            "\1\uffff\1\6\1\3\1\uffff\1\10\14\uffff\1\5\1\13\1\12\4\uffff"+
            "\1\4\2\uffff\1\7\1\11\1\1\1\uffff\1\2\1\uffff\1\6\1\3\1\uffff"+
            "\1\10",
            "\1\14\1\uffff\1\15\35\uffff\1\14\1\uffff\1\15",
            "\1\16\2\uffff\1\17\34\uffff\1\16\2\uffff\1\17",
            "\1\21\3\uffff\1\20\33\uffff\1\21\3\uffff\1\20",
            "\1\22\37\uffff\1\22",
            "\1\26\2\uffff\1\23\2\uffff\1\25\2\uffff\1\24\26\uffff\1\26"+
            "\2\uffff\1\23\2\uffff\1\25\2\uffff\1\24",
            "\1\27\11\uffff\1\30\25\uffff\1\27\11\uffff\1\30",
            "\1\31\37\uffff\1\31",
            "",
            "",
            "",
            "",
            "\1\32\37\uffff\1\32",
            "",
            "",
            "\1\33\37\uffff\1\33",
            "",
            "\1\34\5\uffff\1\35\31\uffff\1\34\5\uffff\1\35",
            "\1\36\37\uffff\1\36",
            "\1\37\37\uffff\1\37",
            "",
            "",
            "",
            "",
            "",
            "\1\40\37\uffff\1\40",
            "\1\41\37\uffff\1\41",
            "\1\42\37\uffff\1\42",
            "",
            "",
            "\1\44\37\uffff\1\44",
            "\1\45\37\uffff\1\45",
            "\1\46\37\uffff\1\46",
            "\1\47\37\uffff\1\47",
            "\1\50\37\uffff\1\50",
            "",
            "",
            "\1\51\37\uffff\1\51",
            "\2\53\2\uffff\1\53\22\uffff\1\53",
            "\1\54\37\uffff\1\54",
            "\1\55\37\uffff\1\55",
            "\1\56\37\uffff\1\56",
            "",
            "",
            "\1\57\37\uffff\1\57",
            "\1\60\37\uffff\1\60",
            "\1\61",
            "\1\63\37\uffff\1\63",
            "\1\64\37\uffff\1\64",
            "\1\65\1\uffff\1\67\2\uffff\1\66\32\uffff\1\65\1\uffff\1\67"+
            "\2\uffff\1\66",
            "",
            "",
            "\1\71\37\uffff\1\71",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "161:1: SOME_TYPES : ( N A T U R A L | P L S '_' I N T E G E R | N A T U R A L N | P O S I T I V E | P O S I T I V E N | S I G N T Y P E | S I M P L E '_' I N T E G E R | I N T | I N T E G E R | S M A L L I N T | B I N A R Y '_' I N T E G E R | R E A L | B I N A R Y '_' D O U B L E | B I N A R Y '_' F L O A T | L O N G | L O N G ( ' ' | '\\t' | '\\n' | '\\r' )+ R A W | R O W I D | U R O W I D | B O O L E A N | M L S L A B E L | D A T E | B F I L E | B L O B | C L O B | N C L O B );";
        }
    }
    static final String DFA12_eotS =
        "\6\uffff\1\11\4\uffff";
    static final String DFA12_eofS =
        "\13\uffff";
    static final String DFA12_minS =
        "\1\104\1\125\1\105\1\115\1\103\1\102\1\111\4\uffff";
    static final String DFA12_maxS =
        "\1\156\1\165\1\145\1\155\1\143\1\145\1\151\4\uffff";
    static final String DFA12_acceptS =
        "\7\uffff\1\4\1\1\1\2\1\3";
    static final String DFA12_specialS =
        "\13\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\2\11\uffff\1\1\25\uffff\1\2\11\uffff\1\1",
            "\1\3\37\uffff\1\3",
            "\1\4\37\uffff\1\4",
            "\1\5\37\uffff\1\5",
            "\1\6\37\uffff\1\6",
            "\1\10\2\uffff\1\7\34\uffff\1\10\2\uffff\1\7",
            "\1\12\37\uffff\1\12",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "170:4: ( N U M B E R | D E C | D E C I M A L | N U M E R I C )";
        }
    }
    static final String DFA16_eotS =
        "\1\2\7\uffff";
    static final String DFA16_eofS =
        "\10\uffff";
    static final String DFA16_minS =
        "\1\50\1\53\1\uffff\1\60\2\51\2\uffff";
    static final String DFA16_maxS =
        "\1\50\1\71\1\uffff\3\71\2\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\3\3\uffff\1\1\1\2";
    static final String DFA16_specialS =
        "\10\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\1",
            "\1\3\4\uffff\12\4",
            "",
            "\12\4",
            "\1\6\2\uffff\1\7\3\uffff\12\5",
            "\1\6\2\uffff\1\7\3\uffff\12\5",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "171:3: ( ( '(' ( '+' )? DIGITS ')' ) | ( '(' ( '+' )? DIGITS COMMA ( '+' | '-' )? DIGITS ')' ) )?";
        }
    }
    static final String DFA21_eotS =
        "\12\uffff\1\13\2\uffff";
    static final String DFA21_eofS =
        "\15\uffff";
    static final String DFA21_minS =
        "\1\116\1\101\1\103\1\122\2\uffff\1\103\1\110\1\101\1\122\1\62\2"+
        "\uffff";
    static final String DFA21_maxS =
        "\1\166\1\141\1\166\1\162\2\uffff\1\143\1\150\1\141\1\162\1\62\2"+
        "\uffff";
    static final String DFA21_acceptS =
        "\4\uffff\1\3\1\4\5\uffff\1\1\1\2";
    static final String DFA21_specialS =
        "\15\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\2\7\uffff\1\1\27\uffff\1\2\7\uffff\1\1",
            "\1\3\37\uffff\1\3",
            "\1\4\22\uffff\1\5\14\uffff\1\4\22\uffff\1\5",
            "\1\6\37\uffff\1\6",
            "",
            "",
            "\1\7\37\uffff\1\7",
            "\1\10\37\uffff\1\10",
            "\1\11\37\uffff\1\11",
            "\1\12\37\uffff\1\12",
            "\1\14",
            "",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "180:1: CHAR_TYPES : ( V A R C H A R | V A R C H A R '2' | N C H A R | N V A R C H A R '2' );";
        }
    }
    static final String DFA37_eotS =
        "\35\uffff\1\40\5\uffff\1\45\10\uffff";
    static final String DFA37_eofS =
        "\54\uffff";
    static final String DFA37_minS =
        "\1\56\6\uffff\2\117\1\116\1\uffff\1\111\1\114\1\uffff\1\116\2\uffff"+
        "\1\111\1\114\3\uffff\1\116\1\117\1\124\1\105\1\116\1\111\1\103\1"+
        "\11\1\123\1\124\2\uffff\1\105\1\137\1\124\2\uffff\2\11\3\uffff";
    static final String DFA37_maxS =
        "\1\167\6\uffff\1\157\1\164\1\156\1\uffff\1\165\1\156\1\uffff\1"+
        "\156\2\uffff\1\151\1\154\3\uffff\1\156\1\157\1\164\1\145\1\156\1"+
        "\151\1\143\1\40\1\163\1\164\2\uffff\1\145\1\137\1\164\2\uffff\1"+
        "\40\1\165\3\uffff";
    static final String DFA37_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\3\uffff\1\14\2\uffff\1\24\1\uffff"+
        "\1\22\1\11\2\uffff\1\15\1\23\1\21\12\uffff\1\12\1\13\3\uffff\1\10"+
        "\1\7\2\uffff\1\20\1\17\1\16";
    static final String DFA37_specialS =
        "\54\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\1\22\uffff\1\14\1\uffff\1\7\1\uffff\1\15\1\2\1\4\1\uffff"+
            "\1\12\3\uffff\1\13\1\uffff\1\5\1\6\2\uffff\1\10\1\uffff\1\11"+
            "\1\uffff\1\3\11\uffff\1\14\1\uffff\1\7\1\uffff\1\15\1\2\1\4"+
            "\1\uffff\1\12\3\uffff\1\13\1\uffff\1\5\1\6\2\uffff\1\10\1\uffff"+
            "\1\11\1\uffff\1\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\16\37\uffff\1\16",
            "\1\17\4\uffff\1\20\32\uffff\1\17\4\uffff\1\20",
            "\1\21\37\uffff\1\21",
            "",
            "\1\23\13\uffff\1\22\23\uffff\1\23\13\uffff\1\22",
            "\1\24\1\uffff\1\25\35\uffff\1\24\1\uffff\1\25",
            "",
            "\1\26\37\uffff\1\26",
            "",
            "",
            "\1\27\37\uffff\1\27",
            "\1\30\37\uffff\1\30",
            "",
            "",
            "",
            "\1\31\37\uffff\1\31",
            "\1\32\37\uffff\1\32",
            "\1\33\37\uffff\1\33",
            "\1\34\37\uffff\1\34",
            "\1\35\37\uffff\1\35",
            "\1\36\37\uffff\1\36",
            "\1\37\37\uffff\1\37",
            "\2\41\2\uffff\1\41\22\uffff\1\41",
            "\1\42\37\uffff\1\42",
            "\1\43\37\uffff\1\43",
            "",
            "",
            "\1\44\37\uffff\1\44",
            "\1\46",
            "\1\47\37\uffff\1\47",
            "",
            "",
            "\2\50\2\uffff\1\50\22\uffff\1\50",
            "\2\50\2\uffff\1\50\22\uffff\1\50\44\uffff\1\53\3\uffff\1\52"+
            "\13\uffff\1\51\17\uffff\1\53\3\uffff\1\52\13\uffff\1\51",
            "",
            "",
            ""
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "211:1: KEYWORD : ( '.' | F R O M | W H E R E | G R O U P ( ' ' | '\\t' | '\\n' | '\\r' )+ B Y | O R D E R ( ' ' | '\\t' | '\\n' | '\\r' )+ B Y | P R I O R | C O N N E C T '_' B Y '_' R O O T | C O N N E C T | S T A R T | U N I O N | U N I O N ( ' ' | '\\t' | '\\n' | '\\r' )+ A L L | I N T E R S E C T | M I N U S | M U L T I S E T ( ' ' | '\\t' | '\\n' | '\\r' )+ E X C E P T | M U L T I S E T ( ' ' | '\\t' | '\\n' | '\\r' )+ I N T E R S E C T | M U L T I S E T ( ' ' | '\\t' | '\\n' | '\\r' )+ U N I O N | A N Y | S O M E | A L L | E S C A P E );";
        }
    }
    static final String DFA49_eotS =
        "\1\uffff\1\62\1\65\1\67\1\uffff\1\72\1\74\1\uffff\1\77\1\101\1"+
        "\56\1\104\3\56\1\111\1\56\1\uffff\3\116\1\uffff\21\116\1\56\3\116"+
        "\1\56\43\uffff\1\u00b9\4\116\1\u00bf\1\u00c0\5\116\1\u00c6\26\116"+
        "\1\u00e8\1\u00ed\1\116\1\u00ef\1\u00f0\50\116\1\u0133\16\116\5\uffff"+
        "\2\116\5\uffff\1\116\1\u014f\1\116\1\u0151\1\116\2\uffff\1\u0153"+
        "\1\116\1\u0155\1\u0156\1\116\1\uffff\1\116\1\u0155\10\116\1\u0163"+
        "\1\116\1\u0165\16\116\1\u0177\5\116\1\uffff\1\116\1\u0180\2\116"+
        "\1\uffff\1\116\2\uffff\12\116\1\u0191\3\116\1\u0196\22\116\1\u01ac"+
        "\4\116\1\u01b1\2\116\1\u01b4\17\116\1\u01cb\10\116\1\uffff\21\116"+
        "\1\u01eb\2\116\1\uffff\2\116\1\u00b6\2\uffff\1\116\1\uffff\1\116"+
        "\1\uffff\1\116\1\uffff\1\u01f6\2\uffff\11\116\1\u0200\2\116\1\uffff"+
        "\1\116\1\uffff\15\116\1\u0211\3\116\1\uffff\2\116\1\u0218\2\116"+
        "\1\u0155\2\116\1\uffff\1\116\1\u021f\4\116\1\u0225\1\116\1\u0180"+
        "\1\u0227\5\116\1\u022d\1\uffff\3\116\1\u0180\1\uffff\7\116\1\uffff"+
        "\1\116\1\u0239\1\u0180\1\u023a\1\116\1\u023c\7\116\1\uffff\4\116"+
        "\1\uffff\1\u0180\1\116\1\uffff\20\116\1\u0180\1\116\1\u025a\1\u025b"+
        "\1\116\1\u0155\1\uffff\13\116\1\u0268\1\u026a\1\116\1\u026c\1\116"+
        "\1\u026e\1\u026f\1\u0270\2\116\1\u0273\1\u0274\2\116\1\u0277\2\116"+
        "\1\u027a\2\116\1\uffff\1\u027d\1\116\1\uffff\1\u0281\1\u0282\1\u00b6"+
        "\1\114\1\u0287\2\116\1\uffff\2\116\1\u028c\1\u028d\1\u0180\1\u028e"+
        "\3\116\1\uffff\11\116\1\u0155\6\116\1\uffff\1\116\1\u0155\4\116"+
        "\1\uffff\3\116\1\u02a9\2\116\1\uffff\5\116\1\uffff\1\u0180\1\uffff"+
        "\4\116\1\u02b6\1\uffff\1\u0180\10\116\1\u02bf\1\u02c0\2\uffff\1"+
        "\u02c1\1\uffff\1\u02c2\1\u0155\1\u02c3\3\116\1\u0155\1\116\1\u02c8"+
        "\1\116\1\u02ca\15\116\1\u02d9\3\116\1\u02dd\2\uffff\3\116\1\u02e1"+
        "\1\u02e2\1\u02e3\1\u02e4\4\116\1\u02e9\1\uffff\1\116\1\uffff\1\116"+
        "\1\uffff\1\116\3\uffff\1\u0155\1\u02ed\2\uffff\1\116\1\u02ee\1\uffff"+
        "\2\116\1\uffff\2\116\1\uffff\1\116\4\uffff\1\114\2\uffff\1\114\1"+
        "\uffff\1\116\1\u02f8\1\u02f9\1\116\3\uffff\1\116\1\u01b4\2\116\1"+
        "\u02fe\1\u02ff\1\116\1\u0301\4\116\1\u0306\6\116\1\u030d\1\u030e"+
        "\1\116\1\u0310\3\116\1\uffff\3\116\1\u0317\2\116\1\u031a\3\116\1"+
        "\u031e\1\116\1\uffff\1\116\1\u0321\1\116\1\u0324\1\116\1\u0326\2"+
        "\116\5\uffff\1\u032a\1\u0180\2\116\1\uffff\1\u032d\1\uffff\1\u032e"+
        "\14\116\1\u033a\1\uffff\1\u033b\1\u033c\1\116\1\uffff\1\116\1\u033f"+
        "\1\116\4\uffff\1\u0341\2\116\1\u0344\1\uffff\3\116\2\uffff\1\116"+
        "\1\u0349\1\116\1\u034b\1\u0155\3\114\1\116\2\uffff\2\116\1\u01b4"+
        "\1\u0180\2\uffff\1\116\1\uffff\1\u0352\3\116\1\uffff\1\116\1\u0357"+
        "\1\u0358\3\116\2\uffff\1\116\1\uffff\1\u035d\1\116\1\u035f\2\116"+
        "\1\u0180\1\uffff\1\116\1\u0363\1\uffff\1\116\1\u0180\1\116\1\uffff"+
        "\1\u0368\1\116\1\uffff\2\116\1\uffff\1\u036c\1\uffff\2\116\1\u036f"+
        "\1\uffff\2\116\2\uffff\1\u01b4\1\u0372\1\116\1\u0374\1\u0375\1\u0376"+
        "\3\116\1\u0155\1\u037b\3\uffff\2\116\1\uffff\1\u037e\1\uffff\1\u028e"+
        "\1\u0380\1\uffff\1\116\1\u0382\2\116\1\uffff\1\u0385\1\uffff\1\114"+
        "\3\116\1\u0180\1\116\1\uffff\1\u0180\3\116\2\uffff\1\u0180\3\116"+
        "\1\uffff\1\u0180\1\uffff\1\116\1\u0392\1\116\1\uffff\4\116\1\uffff"+
        "\1\u0398\2\116\1\uffff\2\116\1\uffff\1\116\1\u0180\1\uffff\1\116"+
        "\3\uffff\1\u039e\1\116\1\u03a0\1\116\1\uffff\1\116\1\u03a3\1\uffff"+
        "\1\u028e\1\uffff\1\116\1\uffff\2\116\1\uffff\2\116\1\u028e\1\116"+
        "\1\u0180\1\116\1\u03ab\1\u03ac\1\116\1\u03ae\1\116\1\u0155\1\uffff"+
        "\1\116\1\u03b1\3\116\1\uffff\1\u03b5\4\116\1\uffff\1\116\1\uffff"+
        "\2\116\1\uffff\1\u03bd\1\116\1\u03bf\1\u03c2\3\116\2\uffff\1\116"+
        "\1\uffff\2\116\1\uffff\3\116\1\uffff\7\116\1\uffff\1\116\1\uffff"+
        "\1\116\1\u03d5\1\uffff\2\116\1\u0180\6\116\1\u03de\3\116\1\u03e2"+
        "\2\116\1\u03e5\1\116\1\uffff\4\116\1\u03eb\2\116\1\u0180\1\uffff"+
        "\1\u03ee\2\116\1\uffff\1\116\1\u03f2\1\uffff\5\116\1\uffff\1\116"+
        "\1\u0180\1\uffff\1\116\1\u03fa\1\116\1\uffff\3\116\1\u0180\1\116"+
        "\1\u0180\1\116\1\uffff\1\116\1\u0402\4\116\1\u0155\1\uffff\1\116"+
        "\1\u0408\3\116\1\uffff\1\u040c\2\116\1\uffff\2\116\1\u0411\1\116"+
        "\1\uffff\1\116\1\u0414\1\uffff";
    static final String DFA49_eofS =
        "\u0415\uffff";
    static final String DFA49_minS =
        "\1\0\1\74\1\75\1\53\1\uffff\1\52\1\0\1\uffff\1\55\1\52\1\174\1"+
        "\76\3\75\1\56\1\42\1\uffff\3\42\1\uffff\21\42\1\106\3\42\1\0\43"+
        "\uffff\137\42\3\uffff\1\117\1\uffff\2\42\1\0\4\uffff\5\42\2\uffff"+
        "\5\42\1\uffff\41\42\1\uffff\4\42\1\uffff\1\42\2\uffff\102\42\1\uffff"+
        "\24\42\1\127\2\42\1\56\2\0\1\42\1\uffff\1\42\1\uffff\1\42\1\uffff"+
        "\1\42\2\uffff\14\42\1\uffff\1\42\1\uffff\21\42\1\uffff\10\42\1\uffff"+
        "\20\42\1\uffff\4\42\1\uffff\7\42\1\uffff\15\42\1\uffff\4\42\1\uffff"+
        "\2\42\1\uffff\26\42\1\uffff\37\42\1\uffff\2\42\1\103\2\42\1\101"+
        "\1\0\1\11\2\42\1\uffff\11\42\1\uffff\20\42\1\uffff\6\42\1\uffff"+
        "\6\42\1\uffff\5\42\1\uffff\1\42\1\uffff\5\42\1\uffff\13\42\2\uffff"+
        "\1\42\1\uffff\35\42\2\uffff\14\42\1\uffff\1\42\1\uffff\1\42\1\uffff"+
        "\1\42\3\uffff\2\42\2\uffff\1\11\1\42\1\uffff\2\42\1\uffff\2\42\1"+
        "\uffff\1\42\4\uffff\1\0\1\uffff\2\0\1\uffff\4\42\3\uffff\32\42\1"+
        "\uffff\14\42\1\uffff\10\42\5\uffff\4\42\1\uffff\1\42\1\uffff\7\42"+
        "\1\11\6\42\1\uffff\3\42\1\uffff\3\42\4\uffff\4\42\1\uffff\3\42\2"+
        "\uffff\5\42\3\0\1\42\2\uffff\4\42\2\uffff\1\42\1\uffff\4\42\1\uffff"+
        "\6\42\2\uffff\1\42\1\uffff\6\42\1\uffff\2\42\1\uffff\3\42\1\uffff"+
        "\2\42\1\uffff\2\42\1\uffff\1\42\1\uffff\3\42\1\uffff\2\42\2\uffff"+
        "\13\42\3\uffff\2\42\1\uffff\1\42\1\uffff\2\42\1\uffff\4\42\1\uffff"+
        "\1\42\1\uffff\1\0\5\42\1\uffff\4\42\2\uffff\4\42\1\uffff\1\42\1"+
        "\uffff\3\42\1\uffff\4\42\1\uffff\3\42\1\uffff\2\42\1\uffff\1\11"+
        "\1\42\1\uffff\1\42\3\uffff\4\42\1\uffff\2\42\1\uffff\1\42\1\uffff"+
        "\1\42\1\uffff\2\42\1\uffff\14\42\1\uffff\5\42\1\uffff\5\42\1\uffff"+
        "\1\42\1\uffff\2\42\1\uffff\7\42\2\uffff\1\42\1\uffff\2\42\1\uffff"+
        "\3\42\1\uffff\7\42\1\uffff\1\42\1\uffff\2\42\1\uffff\22\42\1\uffff"+
        "\10\42\1\uffff\3\42\1\uffff\2\42\1\uffff\5\42\1\uffff\2\42\1\uffff"+
        "\3\42\1\uffff\7\42\1\uffff\7\42\1\uffff\5\42\1\uffff\3\42\1\uffff"+
        "\4\42\1\uffff\2\42\1\uffff";
    static final String DFA49_maxS =
        "\1\uffff\2\76\1\53\1\uffff\1\52\1\uffff\1\uffff\1\55\1\52\1\174"+
        "\1\76\3\75\1\71\1\172\1\uffff\3\172\1\uffff\21\172\1\164\3\172\1"+
        "\uffff\43\uffff\137\172\3\uffff\1\157\1\uffff\2\172\1\uffff\4\uffff"+
        "\5\172\2\uffff\5\172\1\uffff\41\172\1\uffff\4\172\1\uffff\1\172"+
        "\2\uffff\102\172\1\uffff\24\172\1\167\2\172\1\100\2\uffff\1\172"+
        "\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\2\uffff\14\172\1\uffff"+
        "\1\172\1\uffff\21\172\1\uffff\10\172\1\uffff\20\172\1\uffff\4\172"+
        "\1\uffff\7\172\1\uffff\15\172\1\uffff\4\172\1\uffff\2\172\1\uffff"+
        "\26\172\1\uffff\37\172\1\uffff\2\172\1\164\3\172\1\uffff\3\172\1"+
        "\uffff\11\172\1\uffff\20\172\1\uffff\6\172\1\uffff\6\172\1\uffff"+
        "\5\172\1\uffff\1\172\1\uffff\5\172\1\uffff\13\172\2\uffff\1\172"+
        "\1\uffff\35\172\2\uffff\14\172\1\uffff\1\172\1\uffff\1\172\1\uffff"+
        "\1\172\3\uffff\2\172\2\uffff\2\172\1\uffff\2\172\1\uffff\2\172\1"+
        "\uffff\1\172\4\uffff\1\uffff\1\uffff\2\uffff\1\uffff\4\172\3\uffff"+
        "\32\172\1\uffff\14\172\1\uffff\10\172\5\uffff\4\172\1\uffff\1\172"+
        "\1\uffff\16\172\1\uffff\3\172\1\uffff\3\172\4\uffff\4\172\1\uffff"+
        "\3\172\2\uffff\5\172\3\uffff\1\172\2\uffff\4\172\2\uffff\1\172\1"+
        "\uffff\4\172\1\uffff\6\172\2\uffff\1\172\1\uffff\6\172\1\uffff\2"+
        "\172\1\uffff\3\172\1\uffff\2\172\1\uffff\2\172\1\uffff\1\172\1\uffff"+
        "\3\172\1\uffff\2\172\2\uffff\13\172\3\uffff\2\172\1\uffff\1\172"+
        "\1\uffff\2\172\1\uffff\4\172\1\uffff\1\172\1\uffff\1\uffff\5\172"+
        "\1\uffff\4\172\2\uffff\4\172\1\uffff\1\172\1\uffff\3\172\1\uffff"+
        "\4\172\1\uffff\3\172\1\uffff\2\172\1\uffff\2\172\1\uffff\1\172\3"+
        "\uffff\4\172\1\uffff\2\172\1\uffff\1\172\1\uffff\1\172\1\uffff\2"+
        "\172\1\uffff\14\172\1\uffff\5\172\1\uffff\5\172\1\uffff\1\172\1"+
        "\uffff\2\172\1\uffff\7\172\2\uffff\1\172\1\uffff\2\172\1\uffff\3"+
        "\172\1\uffff\7\172\1\uffff\1\172\1\uffff\2\172\1\uffff\22\172\1"+
        "\uffff\10\172\1\uffff\3\172\1\uffff\2\172\1\uffff\5\172\1\uffff"+
        "\2\172\1\uffff\3\172\1\uffff\7\172\1\uffff\7\172\1\uffff\5\172\1"+
        "\uffff\3\172\1\uffff\4\172\1\uffff\2\172\1\uffff";
    static final String DFA49_acceptS =
        "\4\uffff\1\4\2\uffff\1\7\11\uffff\1\33\3\uffff\1\37\26\uffff\1"+
        "\u00b7\1\u00b8\1\u00ba\1\1\1\15\1\23\1\22\1\2\1\24\1\21\1\25\1\3"+
        "\1\4\1\31\1\5\1\40\1\6\1\7\1\32\1\10\1\12\1\11\1\13\1\u00b9\1\14"+
        "\1\16\1\17\1\20\1\26\1\30\1\37\1\27\1\u00b5\1\33\1\u00b4\137\uffff"+
        "\1\u0090\1\u008f\1\u0091\1\uffff\1\66\3\uffff\1\u00b6\1\u00b7\1"+
        "\u00b8\1\34\5\uffff\1\147\1\u009b\5\uffff\1\110\41\uffff\1\112\4"+
        "\uffff\1\103\1\uffff\1\125\1\151\102\uffff\1\100\33\uffff\1\113"+
        "\1\uffff\1\u00a6\1\uffff\1\u009e\1\uffff\1\54\1\35\14\uffff\1\u009f"+
        "\1\uffff\1\36\21\uffff\1\u008d\10\uffff\1\41\20\uffff\1\u00a2\4"+
        "\uffff\1\156\7\uffff\1\47\15\uffff\1\u00b1\4\uffff\1\52\2\uffff"+
        "\1\42\26\uffff\1\133\37\uffff\1\56\12\uffff\1\u0085\11\uffff\1\63"+
        "\20\uffff\1\174\6\uffff\1\u00af\6\uffff\1\165\5\uffff\1\46\1\uffff"+
        "\1\u0087\5\uffff\1\167\13\uffff\1\u0083\1\131\1\uffff\1\140\35\uffff"+
        "\1\144\1\45\14\uffff\1\75\1\uffff\1\67\1\uffff\1\70\1\uffff\1\62"+
        "\1\51\1\61\2\uffff\1\73\1\130\2\uffff\1\126\2\uffff\1\164\2\uffff"+
        "\1\u00a1\1\uffff\1\u0092\1\65\1\76\1\u00b3\1\uffff\1\u00b5\2\uffff"+
        "\1\u00b2\4\uffff\1\154\1\u0099\1\44\32\uffff\1\150\14\uffff\1\55"+
        "\10\uffff\1\141\1\74\1\172\1\u00a8\1\166\4\uffff\1\u0084\1\uffff"+
        "\1\101\16\uffff\1\136\3\uffff\1\145\3\uffff\1\43\1\171\1\u00a9\1"+
        "\71\4\uffff\1\146\3\uffff\1\132\1\127\11\uffff\1\u00a7\1\115\4\uffff"+
        "\1\u009c\1\114\1\uffff\1\u00a0\4\uffff\1\142\6\uffff\1\u00ad\1\53"+
        "\1\uffff\1\135\6\uffff\1\u0082\2\uffff\1\u0081\3\uffff\1\u0098\2"+
        "\uffff\1\111\2\uffff\1\104\1\uffff\1\u00b0\3\uffff\1\u0095\2\uffff"+
        "\1\u00ac\1\161\13\uffff\1\155\1\105\1\160\2\uffff\1\173\1\uffff"+
        "\1\152\2\uffff\1\177\4\uffff\1\u0096\1\uffff\1\u00a4\6\uffff\1\u0086"+
        "\4\uffff\1\u0093\1\u0094\4\uffff\1\102\1\uffff\1\176\3\uffff\1\u009a"+
        "\4\uffff\1\u0080\3\uffff\1\106\2\uffff\1\134\2\uffff\1\57\1\uffff"+
        "\1\117\1\64\1\u00a5\4\uffff\1\170\2\uffff\1\u00a3\1\uffff\1\153"+
        "\1\uffff\1\u0097\2\uffff\1\162\14\uffff\1\77\5\uffff\1\u008a\5\uffff"+
        "\1\72\1\uffff\1\157\2\uffff\1\107\7\uffff\1\124\1\122\1\uffff\1"+
        "\u008b\2\uffff\1\163\3\uffff\1\u0089\7\uffff\1\50\1\uffff\1\60\2"+
        "\uffff\1\u00ab\22\uffff\1\175\10\uffff\1\u009d\3\uffff\1\u00ae\2"+
        "\uffff\1\u008e\5\uffff\1\u00aa\2\uffff\1\123\3\uffff\1\116\7\uffff"+
        "\1\120\7\uffff\1\137\5\uffff\1\121\3\uffff\1\u008c\4\uffff\1\u0088"+
        "\2\uffff\1\143";
    static final String DFA49_specialS =
        "\1\12\5\uffff\1\4\44\uffff\1\7\u0089\uffff\1\11\u0096\uffff\1\0"+
        "\1\6\u00a4\uffff\1\13\u0090\uffff\1\1\1\uffff\1\10\1\3\155\uffff"+
        "\1\5\1\15\1\14\125\uffff\1\2\u00c8\uffff}>";
    static final String[] DFA49_transitionS = {
            "\11\56\2\21\2\56\1\21\22\56\1\21\1\14\1\53\2\56\1\47\1\56\1"+
            "\6\1\3\1\4\1\11\1\7\1\55\1\10\1\17\1\5\12\25\1\20\1\54\1\1\1"+
            "\13\1\2\2\56\1\23\1\31\1\37\1\36\1\46\1\40\1\45\1\52\1\30\1"+
            "\51\1\52\1\33\1\35\1\24\1\22\1\26\1\52\1\32\1\27\1\42\1\34\1"+
            "\41\1\44\1\52\1\43\1\50\3\56\1\16\2\56\1\23\1\31\1\37\1\36\1"+
            "\46\1\40\1\45\1\52\1\30\1\51\1\52\1\33\1\35\1\24\1\22\1\26\1"+
            "\52\1\32\1\27\1\42\1\34\1\41\1\44\1\52\1\43\1\50\1\56\1\12\1"+
            "\56\1\15\uff81\56",
            "\1\57\1\61\1\60",
            "\1\64\1\63",
            "\1\66",
            "",
            "\1\71",
            "\0\73",
            "",
            "\1\76",
            "\1\100",
            "\1\102",
            "\1\103",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110\1\uffff\12\112",
            "\1\114\32\uffff\1\113\3\uffff\32\114\6\uffff\32\114",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\130\1\123\3\130\1\124\2\130\1\122\2\130\1\126\1\130\1\125\1"+
            "\130\1\127\1\130\1\117\2\130\1\120\1\121\4\130\4\uffff\1\130"+
            "\1\uffff\1\130\1\123\3\130\1\124\2\130\1\122\2\130\1\126\1\130"+
            "\1\125\1\130\1\127\1\130\1\117\2\130\1\120\1\121\4\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\5"+
            "\130\1\136\5\130\1\135\1\130\1\131\3\130\1\134\1\133\1\130\1"+
            "\132\5\130\4\uffff\1\130\1\uffff\5\130\1\136\5\130\1\135\1\130"+
            "\1\131\3\130\1\134\1\133\1\130\1\132\5\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\142\1\130\1\137\1\130\1\143\11\130\1\144\5\130\1\141\1\140"+
            "\4\130\4\uffff\1\130\1\uffff\1\142\1\130\1\137\1\130\1\143\11"+
            "\130\1\144\5\130\1\141\1\140\4\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\145\7\130\1\151\2\130\1\147\2\130\1\146\2\130\1\150\10\130"+
            "\4\uffff\1\130\1\uffff\1\145\7\130\1\151\2\130\1\147\2\130\1"+
            "\146\2\130\1\150\10\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\154\3\130\1\156\3\130\1\153\3\130\1\160\1\130\1\161\1\130\1"+
            "\152\2\130\1\155\1\157\5\130\4\uffff\1\130\1\uffff\1\154\3\130"+
            "\1\156\3\130\1\153\3\130\1\160\1\130\1\161\1\130\1\152\2\130"+
            "\1\155\1\157\5\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\5"+
            "\130\1\165\6\130\1\164\1\162\4\130\1\163\7\130\4\uffff\1\130"+
            "\1\uffff\5\130\1\165\6\130\1\164\1\162\4\130\1\163\7\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\173\1\167\2\130\1\172\2\130\1\170\2\130\1\171\5\130\1"+
            "\174\3\130\1\166\1\130\4\uffff\1\130\1\uffff\4\130\1\173\1\167"+
            "\2\130\1\172\2\130\1\170\2\130\1\171\5\130\1\174\3\130\1\166"+
            "\1\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\177\3\130\1\176\11\130\1\175\13\130\4\uffff\1\130\1\uffff\1"+
            "\177\3\130\1\176\11\130\1\175\13\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\10"+
            "\130\1\u0081\5\130\1\u0080\13\130\4\uffff\1\130\1\uffff\10\130"+
            "\1\u0081\5\130\1\u0080\13\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u0082\1\130\1\u0084\1\130\1\u0085\1\u0083\7\130\4\uffff"+
            "\1\130\1\uffff\15\130\1\u0082\1\130\1\u0084\1\130\1\u0085\1"+
            "\u0083\7\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u0088\3\130\1\u008a\3\130\1\u0087\2\130\1\u0089\2\130\1\u008b"+
            "\5\130\1\u0086\5\130\4\uffff\1\130\1\uffff\1\u0088\3\130\1\u008a"+
            "\3\130\1\u0087\2\130\1\u0089\2\130\1\u008b\5\130\1\u0086\5\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u008c\3\130\1\u008d\3\130\1\u008e\5\130\1\u008f\13\130\4\uffff"+
            "\1\130\1\uffff\1\u008c\3\130\1\u008d\3\130\1\u008e\5\130\1\u008f"+
            "\13\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u0094\6\130\1\u0095\3\130\1\u0093\2\130\1\u0090\2\130\1\u0091"+
            "\2\130\1\u0092\5\130\4\uffff\1\130\1\uffff\1\u0094\6\130\1\u0095"+
            "\3\130\1\u0093\2\130\1\u0090\2\130\1\u0091\2\130\1\u0092\5\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u009c\3\130\1\u009a\3\130\1\u009b\2\130\1\u0099\2\130\1\u0098"+
            "\2\130\1\u0097\2\130\1\u0096\5\130\4\uffff\1\130\1\uffff\1\u009c"+
            "\3\130\1\u009a\3\130\1\u009b\2\130\1\u0099\2\130\1\u0098\2\130"+
            "\1\u0097\2\130\1\u0096\5\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u009d\31\130\4\uffff\1\130\1\uffff\1\u009d\31\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u009e\6\130\1\u00a3\1\u00a0\5\130\1\u009f\2\130\1\u00a2\6\130"+
            "\1\u00a1\1\130\4\uffff\1\130\1\uffff\1\u009e\6\130\1\u00a3\1"+
            "\u00a0\5\130\1\u009f\2\130\1\u00a2\6\130\1\u00a1\1\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u00a4\25\130\4\uffff\1\130\1\uffff\4\130\1\u00a4\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\7"+
            "\130\1\u00a5\1\u00a6\21\130\4\uffff\1\130\1\uffff\7\130\1\u00a5"+
            "\1\u00a6\21\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\16"+
            "\130\1\u00a7\2\130\1\u00a8\10\130\4\uffff\1\130\1\uffff\16\130"+
            "\1\u00a7\2\130\1\u00a8\10\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u00ac\12\130\1\u00a9\1\130\1\u00ab\4\130\1\u00ad\4\130\1\u00aa"+
            "\2\130\4\uffff\1\130\1\uffff\1\u00ac\12\130\1\u00a9\1\130\1"+
            "\u00ab\4\130\1\u00ad\4\130\1\u00aa\2\130",
            "\1\u00ae\2\uffff\1\u00b0\4\uffff\1\u00af\3\uffff\1\u00b1\1"+
            "\uffff\1\u00b2\21\uffff\1\u00ae\2\uffff\1\u00b0\4\uffff\1\u00af"+
            "\3\uffff\1\u00b1\1\uffff\1\u00b2",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\16"+
            "\130\1\u00b3\13\130\4\uffff\1\130\1\uffff\16\130\1\u00b3\13"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\16"+
            "\130\1\u00b4\13\130\4\uffff\1\130\1\uffff\16\130\1\u00b4\13"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\42\u00b6\1\uffff\36\u00b6\32\u00b5\6\u00b6\32\u00b5\uff85"+
            "\u00b6",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\3"+
            "\130\1\u00ba\26\130\4\uffff\1\130\1\uffff\3\130\1\u00ba\26\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u00bb\6\130\4\uffff\1\130\1\uffff\23\130\1\u00bb\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u00bc\25\130\4\uffff\1\130\1\uffff\4\130\1\u00bc\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\3"+
            "\130\1\u00bd\26\130\4\uffff\1\130\1\uffff\3\130\1\u00bd\26\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\11"+
            "\130\1\u00be\20\130\4\uffff\1\130\1\uffff\11\130\1\u00be\20"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\3"+
            "\130\1\u00c1\26\130\4\uffff\1\130\1\uffff\3\130\1\u00c1\26\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u00c2\25\130\4\uffff\1\130\1\uffff\4\130\1\u00c2\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\3"+
            "\130\1\u00c4\24\130\1\u00c3\1\130\4\uffff\1\130\1\uffff\3\130"+
            "\1\u00c4\24\130\1\u00c3\1\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u00c5\6\130\4\uffff\1\130\1\uffff\23\130\1\u00c5\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u00c7\10\130\4\uffff\1\130\1\uffff\21\130\1\u00c7\10"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u00c8\16\130\4\uffff\1\130\1\uffff\13\130\1\u00c8\16"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u00c9\6\130\4\uffff\1\130\1\uffff\23\130\1\u00c9\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\7"+
            "\130\1\u00cb\3\130\1\u00ca\16\130\4\uffff\1\130\1\uffff\7\130"+
            "\1\u00cb\3\130\1\u00ca\16\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u00cc\31\130\4\uffff\1\130\1\uffff\1\u00cc\31\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u00ce\1\u00cd\15\130\4\uffff\1\130\1\uffff\13\130\1\u00ce"+
            "\1\u00cd\15\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u00cf\6\130\4\uffff\1\130\1\uffff\23\130\1\u00cf\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\22"+
            "\130\1\u00d0\3\130\1\u00d1\3\130\4\uffff\1\130\1\uffff\22\130"+
            "\1\u00d0\3\130\1\u00d1\3\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\2"+
            "\130\1\u00d2\20\130\1\u00d3\6\130\4\uffff\1\130\1\uffff\2\130"+
            "\1\u00d2\20\130\1\u00d3\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\2"+
            "\130\1\u00d5\16\130\1\u00d4\10\130\4\uffff\1\130\1\uffff\2\130"+
            "\1\u00d5\16\130\1\u00d4\10\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\22"+
            "\130\1\u00d6\7\130\4\uffff\1\130\1\uffff\22\130\1\u00d6\7\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\22"+
            "\130\1\u00d7\7\130\4\uffff\1\130\1\uffff\22\130\1\u00d7\7\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u00da\7\130\1\u00d9\5\130\1\u00d8\13\130\4\uffff\1\130\1\uffff"+
            "\1\u00da\7\130\1\u00d9\5\130\1\u00d8\13\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\17"+
            "\130\1\u00db\12\130\4\uffff\1\130\1\uffff\17\130\1\u00db\12"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u00dc\16\130\4\uffff\1\130\1\uffff\13\130\1\u00dc\16"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\6"+
            "\130\1\u00dd\5\130\1\u00de\15\130\4\uffff\1\130\1\uffff\6\130"+
            "\1\u00dd\5\130\1\u00de\15\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\25"+
            "\130\1\u00df\4\130\4\uffff\1\130\1\uffff\25\130\1\u00df\4\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u00e0\31\130\4\uffff\1\130\1\uffff\1\u00e0\31\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\2"+
            "\130\1\u00e1\10\130\1\u00e4\5\130\1\u00e3\1\130\1\u00e2\6\130"+
            "\4\uffff\1\130\1\uffff\2\130\1\u00e1\10\130\1\u00e4\5\130\1"+
            "\u00e3\1\130\1\u00e2\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\130\1\u00e5\30\130\4\uffff\1\130\1\uffff\1\130\1\u00e5\30\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u00e6\31\130\4\uffff\1\130\1\uffff\1\u00e6\31\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\14"+
            "\130\1\u00e7\15\130\4\uffff\1\130\1\uffff\14\130\1\u00e7\15"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\3"+
            "\130\1\u00e9\7\130\1\u00ec\6\130\1\u00eb\1\u00ea\6\130\4\uffff"+
            "\1\130\1\uffff\3\130\1\u00e9\7\130\1\u00ec\6\130\1\u00eb\1\u00ea"+
            "\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\14"+
            "\130\1\u00ee\15\130\4\uffff\1\130\1\uffff\14\130\1\u00ee\15"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u00f1\6\130\4\uffff\1\130\1\uffff\23\130\1\u00f1\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\10"+
            "\130\1\u00f2\21\130\4\uffff\1\130\1\uffff\10\130\1\u00f2\21"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\16"+
            "\130\1\u00f3\13\130\4\uffff\1\130\1\uffff\16\130\1\u00f3\13"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\3"+
            "\130\1\u00f4\12\130\1\u00f5\13\130\4\uffff\1\130\1\uffff\3\130"+
            "\1\u00f4\12\130\1\u00f5\13\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u00f6\14\130\4\uffff\1\130\1\uffff\15\130\1\u00f6\14"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\5"+
            "\130\1\u00f7\1\u00f9\14\130\1\u00f8\6\130\4\uffff\1\130\1\uffff"+
            "\5\130\1\u00f7\1\u00f9\14\130\1\u00f8\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u00fa\16\130\4\uffff\1\130\1\uffff\13\130\1\u00fa\16"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u00fc\12\130\1\u00fb\3\130\4\uffff\1\130\1\uffff\13\130"+
            "\1\u00fc\12\130\1\u00fb\3\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u00fe\1\130\1\u0100\2\130\1\u00ff\11\130\1\u0101\2\130\1\u0102"+
            "\1\u00fd\1\130\1\u0103\4\130\4\uffff\1\130\1\uffff\1\u00fe\1"+
            "\130\1\u0100\2\130\1\u00ff\11\130\1\u0101\2\130\1\u0102\1\u00fd"+
            "\1\130\1\u0103\4\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\10"+
            "\130\1\u0104\15\130\1\u0105\3\130\4\uffff\1\130\1\uffff\10\130"+
            "\1\u0104\15\130\1\u0105\3\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\2"+
            "\130\1\u0106\12\130\1\u0107\1\u0108\13\130\4\uffff\1\130\1\uffff"+
            "\2\130\1\u0106\12\130\1\u0107\1\u0108\13\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\12"+
            "\130\1\u010a\1\130\1\u0109\15\130\4\uffff\1\130\1\uffff\12\130"+
            "\1\u010a\1\130\1\u0109\15\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\3"+
            "\130\1\u010b\4\130\1\u010c\21\130\4\uffff\1\130\1\uffff\3\130"+
            "\1\u010b\4\130\1\u010c\21\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\10"+
            "\130\1\u010d\21\130\4\uffff\1\130\1\uffff\10\130\1\u010d\21"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\3"+
            "\130\1\u010e\26\130\4\uffff\1\130\1\uffff\3\130\1\u010e\26\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\16"+
            "\130\1\u010f\13\130\4\uffff\1\130\1\uffff\16\130\1\u010f\13"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u0110\16\130\4\uffff\1\130\1\uffff\13\130\1\u0110\16"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u0111\14\130\4\uffff\1\130\1\uffff\15\130\1\u0111\14"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\17"+
            "\130\1\u0112\12\130\4\uffff\1\130\1\uffff\17\130\1\u0112\12"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\22"+
            "\130\1\u0113\7\130\4\uffff\1\130\1\uffff\22\130\1\u0113\7\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\14"+
            "\130\1\u0115\4\130\1\u0114\10\130\4\uffff\1\130\1\uffff\14\130"+
            "\1\u0115\4\130\1\u0114\10\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u0116\14\130\4\uffff\1\130\1\uffff\15\130\1\u0116\14"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u0118\4\130\1\u0117\1\130\4\uffff\1\130\1\uffff\23\130"+
            "\1\u0118\4\130\1\u0117\1\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\2"+
            "\130\1\u011a\2\130\1\u011c\5\130\1\u0119\7\130\1\u011b\6\130"+
            "\4\uffff\1\130\1\uffff\2\130\1\u011a\2\130\1\u011c\5\130\1\u0119"+
            "\7\130\1\u011b\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\22"+
            "\130\1\u011d\7\130\4\uffff\1\130\1\uffff\22\130\1\u011d\7\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\24"+
            "\130\1\u011e\5\130\4\uffff\1\130\1\uffff\24\130\1\u011e\5\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u0120\1\u0121\1\u011f\6\130\1\u0122\5\130\4\uffff\1\130"+
            "\1\uffff\13\130\1\u0120\1\u0121\1\u011f\6\130\1\u0122\5\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0123\25\130\4\uffff\1\130\1\uffff\4\130\1\u0123\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u0124\10\130\4\uffff\1\130\1\uffff\21\130\1\u0124\10"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\16"+
            "\130\1\u0125\13\130\4\uffff\1\130\1\uffff\16\130\1\u0125\13"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\22"+
            "\130\1\u0126\7\130\4\uffff\1\130\1\uffff\22\130\1\u0126\7\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u0127\31\130\4\uffff\1\130\1\uffff\1\u0127\31\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u0128\14\130\4\uffff\1\130\1\uffff\15\130\1\u0128\14"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\16"+
            "\130\1\u0129\13\130\4\uffff\1\130\1\uffff\16\130\1\u0129\13"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u012b\5\130\1\u012a\10\130\4\uffff\1\130\1\uffff\13\130"+
            "\1\u012b\5\130\1\u012a\10\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\16"+
            "\130\1\u012c\13\130\4\uffff\1\130\1\uffff\16\130\1\u012c\13"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u012d\6\130\4\uffff\1\130\1\uffff\23\130\1\u012d\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u012e\14\130\4\uffff\1\130\1\uffff\15\130\1\u012e\14"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u012f\16\130\4\uffff\1\130\1\uffff\13\130\1\u012f\16"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u0131\5\130\1\u0130\10\130\4\uffff\1\130\1\uffff\13\130"+
            "\1\u0131\5\130\1\u0130\10\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\130\1\u0132\30\130\4\uffff\1\130\1\uffff\1\130\1\u0132\30\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\14"+
            "\130\1\u0134\15\130\4\uffff\1\130\1\uffff\14\130\1\u0134\15"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\17"+
            "\130\1\u0135\12\130\4\uffff\1\130\1\uffff\17\130\1\u0135\12"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u0138\7\130\1\u0136\13\130\1\u0137\5\130\4\uffff\1\130\1\uffff"+
            "\1\u0138\7\130\1\u0136\13\130\1\u0137\5\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0139\25\130\4\uffff\1\130\1\uffff\4\130\1\u0139\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u013a\31\130\4\uffff\1\130\1\uffff\1\u013a\31\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u013b\3\130\1\u013c\21\130\4\uffff\1\130\1\uffff\4\130"+
            "\1\u013b\3\130\1\u013c\21\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u013d\6\130\4\uffff\1\130\1\uffff\23\130\1\u013d\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u013e\6\130\4\uffff\1\130\1\uffff\23\130\1\u013e\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\16"+
            "\130\1\u013f\13\130\4\uffff\1\130\1\uffff\16\130\1\u013f\13"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\22"+
            "\130\1\u0140\7\130\4\uffff\1\130\1\uffff\22\130\1\u0140\7\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\2"+
            "\130\1\u0141\1\130\1\u0143\3\130\1\u0142\21\130\4\uffff\1\130"+
            "\1\uffff\2\130\1\u0141\1\130\1\u0143\3\130\1\u0142\21\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u0144\2\130\1\u0145\26\130\4\uffff\1\130\1\uffff\1\u0144\2"+
            "\130\1\u0145\26\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\2"+
            "\130\1\u0146\27\130\4\uffff\1\130\1\uffff\2\130\1\u0146\27\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\2"+
            "\130\1\u0147\27\130\4\uffff\1\130\1\uffff\2\130\1\u0147\27\130",
            "",
            "",
            "",
            "\1\u0148\37\uffff\1\u0148",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u0149\14\130\4\uffff\1\130\1\uffff\15\130\1\u0149\14"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\10"+
            "\130\1\u014a\21\130\4\uffff\1\130\1\uffff\10\130\1\u014a\21"+
            "\130",
            "\42\u00b6\1\u014b\3\u014c\10\u00b6\1\u014d\1\u00b6\12\u014c"+
            "\6\u00b6\1\u014d\32\u014c\4\u00b6\1\u014c\1\u00b6\32\u014c\uff85"+
            "\u00b6",
            "",
            "",
            "",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u014e\25\130\4\uffff\1\130\1\uffff\4\130\1\u014e\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u0150\10\130\4\uffff\1\130\1\uffff\21\130\1\u0150\10"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0152\25\130\4\uffff\1\130\1\uffff\4\130\1\u0152\25\130",
            "",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u0154\14\130\4\uffff\1\130\1\uffff\15\130\1\u0154\14"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\7"+
            "\130\1\u0157\6\130\1\u0158\13\130\4\uffff\1\130\1\uffff\7\130"+
            "\1\u0157\6\130\1\u0158\13\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u0159\31\130\4\uffff\1\130\1\uffff\1\u0159\31\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u015a\25\130\4\uffff\1\130\1\uffff\4\130\1\u015a\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\16"+
            "\130\1\u015b\13\130\4\uffff\1\130\1\uffff\16\130\1\u015b\13"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u015c\31\130\4\uffff\1\130\1\uffff\1\u015c\31\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u015d\10\130\4\uffff\1\130\1\uffff\21\130\1\u015d\10"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\130\1\u015e\2\130\1\u015f\25\130\4\uffff\1\130\1\uffff\1\130"+
            "\1\u015e\2\130\1\u015f\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u0160\16\130\4\uffff\1\130\1\uffff\13\130\1\u0160\16"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\24"+
            "\130\1\u0161\5\130\4\uffff\1\130\1\uffff\24\130\1\u0161\5\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u0162\6\130\4\uffff\1\130\1\uffff\23\130\1\u0162\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\16"+
            "\130\1\u0164\13\130\4\uffff\1\130\1\uffff\16\130\1\u0164\13"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u0166\3\130\1\u0167\25\130\4\uffff\1\130\1\uffff\1\u0166\3"+
            "\130\1\u0167\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\12"+
            "\130\1\u0168\17\130\4\uffff\1\130\1\uffff\12\130\1\u0168\17"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\10"+
            "\130\1\u0169\21\130\4\uffff\1\130\1\uffff\10\130\1\u0169\21"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\u016a\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\2"+
            "\130\1\u016b\27\130\4\uffff\1\130\1\uffff\2\130\1\u016b\27\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\16"+
            "\130\1\u016c\13\130\4\uffff\1\130\1\uffff\16\130\1\u016c\13"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\6"+
            "\130\1\u016d\23\130\4\uffff\1\130\1\uffff\6\130\1\u016d\23\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u016e\25\130\4\uffff\1\130\1\uffff\4\130\1\u016e\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\2"+
            "\130\1\u016f\1\130\1\u0170\25\130\4\uffff\1\130\1\uffff\2\130"+
            "\1\u016f\1\130\1\u0170\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u0171\14\130\4\uffff\1\130\1\uffff\15\130\1\u0171\14"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\17"+
            "\130\1\u0172\12\130\4\uffff\1\130\1\uffff\17\130\1\u0172\12"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0173\25\130\4\uffff\1\130\1\uffff\4\130\1\u0173\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u0174\1\130\1\u0175\6\130\4\uffff\1\130\1\uffff\21\130"+
            "\1\u0174\1\130\1\u0175\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\16"+
            "\130\1\u0176\13\130\4\uffff\1\130\1\uffff\16\130\1\u0176\13"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\10"+
            "\130\1\u0178\21\130\4\uffff\1\130\1\uffff\10\130\1\u0178\21"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0179\1\u017a\24\130\4\uffff\1\130\1\uffff\4\130\1\u0179"+
            "\1\u017a\24\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u017b\6\130\4\uffff\1\130\1\uffff\23\130\1\u017b\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u017c\16\130\4\uffff\1\130\1\uffff\13\130\1\u017c\16"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u017d\25\130\4\uffff\1\130\1\uffff\4\130\1\u017d\25\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u017f\3\130\1\u017e\21\130\4\uffff\1\130\1\uffff\4\130"+
            "\1\u017f\3\130\1\u017e\21\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0181\11\130\1\u0182\13\130\4\uffff\1\130\1\uffff\4\130"+
            "\1\u0181\11\130\1\u0182\13\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0183\16\130\1\u0184\6\130\4\uffff\1\130\1\uffff\4\130"+
            "\1\u0183\16\130\1\u0184\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\10"+
            "\130\1\u0185\21\130\4\uffff\1\130\1\uffff\10\130\1\u0185\21"+
            "\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0186\25\130\4\uffff\1\130\1\uffff\4\130\1\u0186\25\130",
            "",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0187\25\130\4\uffff\1\130\1\uffff\4\130\1\u0187\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u0188\16\130\4\uffff\1\130\1\uffff\13\130\1\u0188\16"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\130\1\u0189\30\130\4\uffff\1\130\1\uffff\1\130\1\u0189\30\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\30"+
            "\130\1\u018a\1\130\4\uffff\1\130\1\uffff\30\130\1\u018a\1\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u018b\16\130\4\uffff\1\130\1\uffff\13\130\1\u018b\16"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u018c\31\130\4\uffff\1\130\1\uffff\1\u018c\31\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\16"+
            "\130\1\u018d\13\130\4\uffff\1\130\1\uffff\16\130\1\u018d\13"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\26"+
            "\130\1\u018e\3\130\4\uffff\1\130\1\uffff\26\130\1\u018e\3\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\10"+
            "\130\1\u018f\21\130\4\uffff\1\130\1\uffff\10\130\1\u018f\21"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\12"+
            "\130\1\u0190\17\130\4\uffff\1\130\1\uffff\12\130\1\u0190\17"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\10"+
            "\130\1\u0192\21\130\4\uffff\1\130\1\uffff\10\130\1\u0192\21"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u0193\16\130\4\uffff\1\130\1\uffff\13\130\1\u0193\16"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\24"+
            "\130\1\u0194\5\130\4\uffff\1\130\1\uffff\24\130\1\u0194\5\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u0195\16\130\4\uffff\1\130\1\uffff\13\130\1\u0195\16"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0197\25\130\4\uffff\1\130\1\uffff\4\130\1\u0197\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\16"+
            "\130\1\u0198\13\130\4\uffff\1\130\1\uffff\16\130\1\u0198\13"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u0199\16\130\4\uffff\1\130\1\uffff\13\130\1\u0199\16"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u019b\1\u019a\5\130\4\uffff\1\130\1\uffff\23\130\1\u019b"+
            "\1\u019a\5\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u019c\25\130\4\uffff\1\130\1\uffff\4\130\1\u019c\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\22"+
            "\130\1\u019d\7\130\4\uffff\1\130\1\uffff\22\130\1\u019d\7\130",
            "\1\114\3\130\2\uffff\1\u019e\5\uffff\1\114\1\uffff\12\130"+
            "\6\uffff\1\114\32\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u019f\11\130\1\u01a0\17\130\4\uffff\1\130\1\uffff\1\u019f\11"+
            "\130\1\u01a0\17\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\6"+
            "\130\1\u01a1\23\130\4\uffff\1\130\1\uffff\6\130\1\u01a1\23\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\17"+
            "\130\1\u01a2\12\130\4\uffff\1\130\1\uffff\17\130\1\u01a2\12"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\10"+
            "\130\1\u01a3\21\130\4\uffff\1\130\1\uffff\10\130\1\u01a3\21"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u01a4\25\130\4\uffff\1\130\1\uffff\4\130\1\u01a4\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u01a5\25\130\4\uffff\1\130\1\uffff\4\130\1\u01a5\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\16"+
            "\130\1\u01a6\13\130\4\uffff\1\130\1\uffff\16\130\1\u01a6\13"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u01a7\14\130\4\uffff\1\130\1\uffff\15\130\1\u01a7\14"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u01a8\31\130\4\uffff\1\130\1\uffff\1\u01a8\31\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\26"+
            "\130\1\u01a9\3\130\4\uffff\1\130\1\uffff\26\130\1\u01a9\3\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u01aa\6\130\4\uffff\1\130\1\uffff\23\130\1\u01aa\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\24"+
            "\130\1\u01ab\5\130\4\uffff\1\130\1\uffff\24\130\1\u01ab\5\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u01ad\16\130\4\uffff\1\130\1\uffff\13\130\1\u01ad\16"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\6"+
            "\130\1\u01ae\23\130\4\uffff\1\130\1\uffff\6\130\1\u01ae\23\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\130\1\u01af\30\130\4\uffff\1\130\1\uffff\1\130\1\u01af\30\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u01b0\6\130\4\uffff\1\130\1\uffff\23\130\1\u01b0\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u01b2\25\130\4\uffff\1\130\1\uffff\4\130\1\u01b2\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u01b3\25\130\4\uffff\1\130\1\uffff\4\130\1\u01b3\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\10"+
            "\130\1\u01b5\2\130\1\u01b6\16\130\4\uffff\1\130\1\uffff\10\130"+
            "\1\u01b5\2\130\1\u01b6\16\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u01b7\25\130\4\uffff\1\130\1\uffff\4\130\1\u01b7\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u01b9\7\130\1\u01b8\21\130\4\uffff\1\130\1\uffff\1\u01b9\7"+
            "\130\1\u01b8\21\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u01ba\31\130\4\uffff\1\130\1\uffff\1\u01ba\31\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\130\1\u01bb\30\130\4\uffff\1\130\1\uffff\1\130\1\u01bb\30\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u01be\4\130\1\u01bc\1\u01bd\6\130\4\uffff\1\130\1\uffff"+
            "\15\130\1\u01be\4\130\1\u01bc\1\u01bd\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u01bf\16\130\4\uffff\1\130\1\uffff\13\130\1\u01bf\16"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\14"+
            "\130\1\u01c0\15\130\4\uffff\1\130\1\uffff\14\130\1\u01c0\15"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u01c1\14\130\4\uffff\1\130\1\uffff\15\130\1\u01c1\14"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u01c2\31\130\4\uffff\1\130\1\uffff\1\u01c2\31\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u01c4\1\u01c3\7\130\4\uffff\1\130\1\uffff\21\130\1\u01c4"+
            "\1\u01c3\7\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\130\1\u01c5\20\130\1\u01c6\7\130\4\uffff\1\130\1\uffff\1\130"+
            "\1\u01c5\20\130\1\u01c6\7\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u01c7\25\130\4\uffff\1\130\1\uffff\4\130\1\u01c7\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u01c8\10\130\4\uffff\1\130\1\uffff\21\130\1\u01c8\10"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\2"+
            "\130\1\u01c9\27\130\4\uffff\1\130\1\uffff\2\130\1\u01c9\27\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\14"+
            "\130\1\u01ca\15\130\4\uffff\1\130\1\uffff\14\130\1\u01ca\15"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u01cc\31\130\4\uffff\1\130\1\uffff\1\u01cc\31\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u01cd\16\130\4\uffff\1\130\1\uffff\13\130\1\u01cd\16"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u01ce\31\130\4\uffff\1\130\1\uffff\1\u01ce\31\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\2"+
            "\130\1\u01cf\27\130\4\uffff\1\130\1\uffff\2\130\1\u01cf\27\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u01d0\31\130\4\uffff\1\130\1\uffff\1\u01d0\31\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\22"+
            "\130\1\u01d1\7\130\4\uffff\1\130\1\uffff\22\130\1\u01d1\7\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\2"+
            "\130\1\u01d3\16\130\1\u01d2\6\130\1\u01d4\1\130\4\uffff\1\130"+
            "\1\uffff\2\130\1\u01d3\16\130\1\u01d2\6\130\1\u01d4\1\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\24"+
            "\130\1\u01d5\5\130\4\uffff\1\130\1\uffff\24\130\1\u01d5\5\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u01d6\16\130\4\uffff\1\130\1\uffff\13\130\1\u01d6\16"+
            "\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u01d7\25\130\4\uffff\1\130\1\uffff\4\130\1\u01d7\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u01d8\25\130\4\uffff\1\130\1\uffff\4\130\1\u01d8\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\6"+
            "\130\1\u01d9\23\130\4\uffff\1\130\1\uffff\6\130\1\u01d9\23\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u01da\25\130\4\uffff\1\130\1\uffff\4\130\1\u01da\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u01db\14\130\4\uffff\1\130\1\uffff\15\130\1\u01db\14"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u01dc\14\130\4\uffff\1\130\1\uffff\15\130\1\u01dc\14"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u01dd\10\130\4\uffff\1\130\1\uffff\21\130\1\u01dd\10"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u01de\3\130\1\u01df\10\130\4\uffff\1\130\1\uffff\15\130"+
            "\1\u01de\3\130\1\u01df\10\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u01e0\16\130\4\uffff\1\130\1\uffff\13\130\1\u01e0\16"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\7"+
            "\130\1\u01e1\22\130\4\uffff\1\130\1\uffff\7\130\1\u01e1\22\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\16"+
            "\130\1\u01e2\13\130\4\uffff\1\130\1\uffff\16\130\1\u01e2\13"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\24"+
            "\130\1\u01e3\5\130\4\uffff\1\130\1\uffff\24\130\1\u01e3\5\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u01e5\3\130\1\u01e4\21\130\4\uffff\1\130\1\uffff\4\130"+
            "\1\u01e5\3\130\1\u01e4\21\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u01e6\25\130\4\uffff\1\130\1\uffff\4\130\1\u01e6\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\22"+
            "\130\1\u01e7\1\u01e8\6\130\4\uffff\1\130\1\uffff\22\130\1\u01e7"+
            "\1\u01e8\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\2"+
            "\130\1\u01e9\27\130\4\uffff\1\130\1\uffff\2\130\1\u01e9\27\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\130\1\u01ea\30\130\4\uffff\1\130\1\uffff\1\130\1\u01ea\30\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\7"+
            "\130\1\u01ec\22\130\4\uffff\1\130\1\uffff\7\130\1\u01ec\22\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u01ed\31\130\4\uffff\1\130\1\uffff\1\u01ed\31\130",
            "\1\u01ee\37\uffff\1\u01ee",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u01ef\25\130\4\uffff\1\130\1\uffff\4\130\1\u01ef\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u01f0\14\130\4\uffff\1\130\1\uffff\15\130\1\u01f0\14"+
            "\130",
            "\1\114\21\uffff\1\114",
            "\42\u00b6\1\u014b\3\u014c\10\u00b6\1\u014d\1\u00b6\12\u014c"+
            "\6\u00b6\1\u014d\32\u014c\4\u00b6\1\u014c\1\u00b6\32\u014c\uff85"+
            "\u00b6",
            "\42\u00b6\1\u01f1\36\u00b6\32\u01f2\6\u00b6\32\u01f2\uff85"+
            "\u00b6",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u01f3\10\130\4\uffff\1\130\1\uffff\21\130\1\u01f3\10"+
            "\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u01f4\10\130\4\uffff\1\130\1\uffff\21\130\1\u01f4\10"+
            "\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\2"+
            "\130\1\u01f5\27\130\4\uffff\1\130\1\uffff\2\130\1\u01f5\27\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\10"+
            "\130\1\u01f7\21\130\4\uffff\1\130\1\uffff\10\130\1\u01f7\21"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u01f8\14\130\4\uffff\1\130\1\uffff\15\130\1\u01f8\14"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\30"+
            "\130\1\u01f9\1\130\4\uffff\1\130\1\uffff\30\130\1\u01f9\1\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u01fa\10\130\4\uffff\1\130\1\uffff\21\130\1\u01fa\10"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\130\1\u01fb\30\130\4\uffff\1\130\1\uffff\1\130\1\u01fb\30\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u01fc\10\130\4\uffff\1\130\1\uffff\21\130\1\u01fc\10"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\2"+
            "\130\1\u01fd\27\130\4\uffff\1\130\1\uffff\2\130\1\u01fd\27\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u01fe\25\130\4\uffff\1\130\1\uffff\4\130\1\u01fe\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u01ff\10\130\4\uffff\1\130\1\uffff\21\130\1\u01ff\10"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u0201\10\130\4\uffff\1\130\1\uffff\21\130\1\u0201\10"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0202\25\130\4\uffff\1\130\1\uffff\4\130\1\u0202\25\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\17"+
            "\130\1\u0203\12\130\4\uffff\1\130\1\uffff\17\130\1\u0203\12"+
            "\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u0204\16\130\4\uffff\1\130\1\uffff\13\130\1\u0204\16"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u0205\14\130\4\uffff\1\130\1\uffff\15\130\1\u0205\14"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u0206\31\130\4\uffff\1\130\1\uffff\1\u0206\31\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u0207\6\130\4\uffff\1\130\1\uffff\23\130\1\u0207\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\10"+
            "\130\1\u0208\21\130\4\uffff\1\130\1\uffff\10\130\1\u0208\21"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0209\25\130\4\uffff\1\130\1\uffff\4\130\1\u0209\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u020a\10\130\4\uffff\1\130\1\uffff\21\130\1\u020a\10"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\14"+
            "\130\1\u020b\15\130\4\uffff\1\130\1\uffff\14\130\1\u020b\15"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u020c\16\130\4\uffff\1\130\1\uffff\13\130\1\u020c\16"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\16"+
            "\130\1\u020d\13\130\4\uffff\1\130\1\uffff\16\130\1\u020d\13"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u020e\10\130\4\uffff\1\130\1\uffff\21\130\1\u020e\10"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u020f\6\130\4\uffff\1\130\1\uffff\23\130\1\u020f\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u0210\16\130\4\uffff\1\130\1\uffff\13\130\1\u0210\16"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\17"+
            "\130\1\u0212\12\130\4\uffff\1\130\1\uffff\17\130\1\u0212\12"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u0213\6\130\4\uffff\1\130\1\uffff\23\130\1\u0213\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\10"+
            "\130\1\u0214\21\130\4\uffff\1\130\1\uffff\10\130\1\u0214\21"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u0215\14\130\4\uffff\1\130\1\uffff\15\130\1\u0215\14"+
            "\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u0216\31\130\4\uffff\1\130\1\uffff\1\u0216\31\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\2"+
            "\130\1\u0217\27\130\4\uffff\1\130\1\uffff\2\130\1\u0217\27\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\30"+
            "\130\1\u0219\1\130\4\uffff\1\130\1\uffff\30\130\1\u0219\1\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u021a\16\130\4\uffff\1\130\1\uffff\13\130\1\u021a\16"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\2"+
            "\130\1\u021b\27\130\4\uffff\1\130\1\uffff\2\130\1\u021b\27\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\27"+
            "\130\1\u021c\2\130\4\uffff\1\130\1\uffff\27\130\1\u021c\2\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\6"+
            "\130\1\u021e\12\130\1\u021d\10\130\4\uffff\1\130\1\uffff\6\130"+
            "\1\u021e\12\130\1\u021d\10\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u0220\10\130\4\uffff\1\130\1\uffff\21\130\1\u0220\10"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u0221\3\130\1\u0222\25\130\4\uffff\1\130\1\uffff\1\u0221\3"+
            "\130\1\u0222\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u0223\14\130\4\uffff\1\130\1\uffff\15\130\1\u0223\14"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\3"+
            "\130\1\u0224\26\130\4\uffff\1\130\1\uffff\3\130\1\u0224\26\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0226\25\130\4\uffff\1\130\1\uffff\4\130\1\u0226\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0228\25\130\4\uffff\1\130\1\uffff\4\130\1\u0228\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u0229\10\130\4\uffff\1\130\1\uffff\21\130\1\u0229\10"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u022a\10\130\4\uffff\1\130\1\uffff\21\130\1\u022a\10"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u022b\25\130\4\uffff\1\130\1\uffff\4\130\1\u022b\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u022c\14\130\4\uffff\1\130\1\uffff\15\130\1\u022c\14"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\3"+
            "\130\1\u022e\26\130\4\uffff\1\130\1\uffff\3\130\1\u022e\26\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\130\1\u022f\30\130\4\uffff\1\130\1\uffff\1\130\1\u022f\30\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u0230\10\130\4\uffff\1\130\1\uffff\21\130\1\u0230\10"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u0231\10\130\4\uffff\1\130\1\uffff\21\130\1\u0231\10"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u0232\10\130\4\uffff\1\130\1\uffff\21\130\1\u0232\10"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u0233\31\130\4\uffff\1\130\1\uffff\1\u0233\31\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u0234\16\130\4\uffff\1\130\1\uffff\13\130\1\u0234\16"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u0235\10\130\4\uffff\1\130\1\uffff\21\130\1\u0235\10"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u0236\10\130\4\uffff\1\130\1\uffff\21\130\1\u0236\10"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0237\25\130\4\uffff\1\130\1\uffff\4\130\1\u0237\25\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u0238\16\130\4\uffff\1\130\1\uffff\13\130\1\u0238\16"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u023b\6\130\4\uffff\1\130\1\uffff\23\130\1\u023b\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u023d\10\130\4\uffff\1\130\1\uffff\21\130\1\u023d\10"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u023e\14\130\4\uffff\1\130\1\uffff\15\130\1\u023e\14"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\6"+
            "\130\1\u023f\23\130\4\uffff\1\130\1\uffff\6\130\1\u023f\23\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u0240\6\130\4\uffff\1\130\1\uffff\23\130\1\u0240\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\10"+
            "\130\1\u0241\21\130\4\uffff\1\130\1\uffff\10\130\1\u0241\21"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\10"+
            "\130\1\u0242\21\130\4\uffff\1\130\1\uffff\10\130\1\u0242\21"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\22"+
            "\130\1\u0243\7\130\4\uffff\1\130\1\uffff\22\130\1\u0243\7\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u0244\31\130\4\uffff\1\130\1\uffff\1\u0244\31\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0245\25\130\4\uffff\1\130\1\uffff\4\130\1\u0245\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0246\25\130\4\uffff\1\130\1\uffff\4\130\1\u0246\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\7"+
            "\130\1\u0247\22\130\4\uffff\1\130\1\uffff\7\130\1\u0247\22\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u0248\6\130\4\uffff\1\130\1\uffff\23\130\1\u0248\6\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\14"+
            "\130\1\u0249\15\130\4\uffff\1\130\1\uffff\14\130\1\u0249\15"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u024a\31\130\4\uffff\1\130\1\uffff\1\u024a\31\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u024b\10\130\4\uffff\1\130\1\uffff\21\130\1\u024b\10"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u024c\14\130\4\uffff\1\130\1\uffff\15\130\1\u024c\14"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\24"+
            "\130\1\u024d\5\130\4\uffff\1\130\1\uffff\24\130\1\u024d\5\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\130\1\u024e\30\130\4\uffff\1\130\1\uffff\1\130\1\u024e\30\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u024f\16\130\4\uffff\1\130\1\uffff\13\130\1\u024f\16"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u0250\6\130\4\uffff\1\130\1\uffff\23\130\1\u0250\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\10"+
            "\130\1\u0251\21\130\4\uffff\1\130\1\uffff\10\130\1\u0251\21"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0252\25\130\4\uffff\1\130\1\uffff\4\130\1\u0252\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0253\25\130\4\uffff\1\130\1\uffff\4\130\1\u0253\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\10"+
            "\130\1\u0254\21\130\4\uffff\1\130\1\uffff\10\130\1\u0254\21"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u0255\6\130\4\uffff\1\130\1\uffff\23\130\1\u0255\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u0256\6\130\4\uffff\1\130\1\uffff\23\130\1\u0256\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\16"+
            "\130\1\u0257\13\130\4\uffff\1\130\1\uffff\16\130\1\u0257\13"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0258\25\130\4\uffff\1\130\1\uffff\4\130\1\u0258\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0259\25\130\4\uffff\1\130\1\uffff\4\130\1\u0259\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u025c\6\130\4\uffff\1\130\1\uffff\23\130\1\u025c\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u025d\16\130\4\uffff\1\130\1\uffff\13\130\1\u025d\16"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\16"+
            "\130\1\u025e\13\130\4\uffff\1\130\1\uffff\16\130\1\u025e\13"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u025f\6\130\4\uffff\1\130\1\uffff\23\130\1\u025f\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\7"+
            "\130\1\u0260\22\130\4\uffff\1\130\1\uffff\7\130\1\u0260\22\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u0261\16\130\4\uffff\1\130\1\uffff\13\130\1\u0261\16"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0262\25\130\4\uffff\1\130\1\uffff\4\130\1\u0262\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u0263\31\130\4\uffff\1\130\1\uffff\1\u0263\31\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\7"+
            "\130\1\u0264\22\130\4\uffff\1\130\1\uffff\7\130\1\u0264\22\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\10"+
            "\130\1\u0265\21\130\4\uffff\1\130\1\uffff\10\130\1\u0265\21"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0266\25\130\4\uffff\1\130\1\uffff\4\130\1\u0266\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0267\25\130\4\uffff\1\130\1\uffff\4\130\1\u0267\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\22"+
            "\130\1\u0269\7\130\4\uffff\1\130\1\uffff\22\130\1\u0269\7\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\6"+
            "\130\1\u026b\23\130\4\uffff\1\130\1\uffff\6\130\1\u026b\23\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\22"+
            "\130\1\u026d\7\130\4\uffff\1\130\1\uffff\22\130\1\u026d\7\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0271\25\130\4\uffff\1\130\1\uffff\4\130\1\u0271\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0272\25\130\4\uffff\1\130\1\uffff\4\130\1\u0272\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\17"+
            "\130\1\u0275\12\130\4\uffff\1\130\1\uffff\17\130\1\u0275\12"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\5"+
            "\130\1\u0276\24\130\4\uffff\1\130\1\uffff\5\130\1\u0276\24\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\17"+
            "\130\1\u0278\12\130\4\uffff\1\130\1\uffff\17\130\1\u0278\12"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u0279\6\130\4\uffff\1\130\1\uffff\23\130\1\u0279\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\24"+
            "\130\1\u027b\5\130\4\uffff\1\130\1\uffff\24\130\1\u027b\5\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u027c\16\130\4\uffff\1\130\1\uffff\13\130\1\u027c\16"+
            "\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\17"+
            "\130\1\u027e\12\130\4\uffff\1\130\1\uffff\17\130\1\u027e\12"+
            "\130",
            "\1\u027f\20\uffff\1\u0280\16\uffff\1\u027f\20\uffff\1\u0280",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\32\114\6\uffff\32\114",
            "\42\u00b6\1\u0284\3\u0286\10\u00b6\1\u0285\1\u00b6\12\u0286"+
            "\6\u00b6\1\u0285\32\u0283\4\u00b6\1\u0286\1\u00b6\32\u0283\uff85"+
            "\u00b6",
            "\2\u0155\2\uffff\1\u0155\22\uffff\1\u0155\1\uffff\1\114\3"+
            "\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32\130\4\uffff"+
            "\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\10"+
            "\130\1\u0288\21\130\4\uffff\1\130\1\uffff\10\130\1\u0288\21"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u0289\6\130\4\uffff\1\130\1\uffff\23\130\1\u0289\6\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\3"+
            "\130\1\u028a\26\130\4\uffff\1\130\1\uffff\3\130\1\u028a\26\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\16"+
            "\130\1\u028b\13\130\4\uffff\1\130\1\uffff\16\130\1\u028b\13"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\7"+
            "\130\1\u028f\22\130\4\uffff\1\130\1\uffff\7\130\1\u028f\22\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u0290\10\130\4\uffff\1\130\1\uffff\21\130\1\u0290\10"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\10"+
            "\130\1\u0291\21\130\4\uffff\1\130\1\uffff\10\130\1\u0291\21"+
            "\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u0292\31\130\4\uffff\1\130\1\uffff\1\u0292\31\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\3"+
            "\130\1\u0293\26\130\4\uffff\1\130\1\uffff\3\130\1\u0293\26\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\30"+
            "\130\1\u0294\1\130\4\uffff\1\130\1\uffff\30\130\1\u0294\1\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u0295\16\130\4\uffff\1\130\1\uffff\13\130\1\u0295\16"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u0296\6\130\4\uffff\1\130\1\uffff\23\130\1\u0296\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\6"+
            "\130\1\u0297\23\130\4\uffff\1\130\1\uffff\6\130\1\u0297\23\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\10"+
            "\130\1\u0298\21\130\4\uffff\1\130\1\uffff\10\130\1\u0298\21"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u0299\14\130\4\uffff\1\130\1\uffff\15\130\1\u0299\14"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\3"+
            "\130\1\u029a\26\130\4\uffff\1\130\1\uffff\3\130\1\u029a\26\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u029b\31\130\4\uffff\1\130\1\uffff\1\u029b\31\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\10"+
            "\130\1\u029c\21\130\4\uffff\1\130\1\uffff\10\130\1\u029c\21"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\3"+
            "\130\1\u029d\26\130\4\uffff\1\130\1\uffff\3\130\1\u029d\26\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u029e\10\130\4\uffff\1\130\1\uffff\21\130\1\u029e\10"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\30"+
            "\130\1\u029f\1\130\4\uffff\1\130\1\uffff\30\130\1\u029f\1\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u02a0\25\130\4\uffff\1\130\1\uffff\4\130\1\u02a0\25\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\16"+
            "\130\1\u02a1\13\130\4\uffff\1\130\1\uffff\16\130\1\u02a1\13"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\2"+
            "\130\1\u02a2\27\130\4\uffff\1\130\1\uffff\2\130\1\u02a2\27\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\3"+
            "\130\1\u02a3\26\130\4\uffff\1\130\1\uffff\3\130\1\u02a3\26\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u02a4\16\130\4\uffff\1\130\1\uffff\13\130\1\u02a4\16"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u02a5\6\130\4\uffff\1\130\1\uffff\23\130\1\u02a5\6\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\17"+
            "\130\1\u02a6\12\130\4\uffff\1\130\1\uffff\17\130\1\u02a6\12"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\10"+
            "\130\1\u02a7\21\130\4\uffff\1\130\1\uffff\10\130\1\u02a7\21"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u02a8\25\130\4\uffff\1\130\1\uffff\4\130\1\u02a8\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\22"+
            "\130\1\u02aa\2\130\1\u02ab\4\130\4\uffff\1\130\1\uffff\22\130"+
            "\1\u02aa\2\130\1\u02ab\4\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u02ac\25\130\4\uffff\1\130\1\uffff\4\130\1\u02ac\25\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u02ad\6\130\4\uffff\1\130\1\uffff\23\130\1\u02ad\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u02ae\14\130\4\uffff\1\130\1\uffff\15\130\1\u02ae\14"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u02af\31\130\4\uffff\1\130\1\uffff\1\u02af\31\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u02b0\25\130\4\uffff\1\130\1\uffff\4\130\1\u02b0\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\10"+
            "\130\1\u02b1\21\130\4\uffff\1\130\1\uffff\10\130\1\u02b1\21"+
            "\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u02b2\31\130\4\uffff\1\130\1\uffff\1\u02b2\31\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\30"+
            "\130\1\u02b3\1\130\4\uffff\1\130\1\uffff\30\130\1\u02b3\1\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u02b4\25\130\4\uffff\1\130\1\uffff\4\130\1\u02b4\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u02b5\25\130\4\uffff\1\130\1\uffff\4\130\1\u02b5\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u02b7\31\130\4\uffff\1\130\1\uffff\1\u02b7\31\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u02b8\14\130\4\uffff\1\130\1\uffff\15\130\1\u02b8\14"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u02b9\25\130\4\uffff\1\130\1\uffff\4\130\1\u02b9\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\3"+
            "\130\1\u02ba\26\130\4\uffff\1\130\1\uffff\3\130\1\u02ba\26\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\2"+
            "\130\1\u02bb\27\130\4\uffff\1\130\1\uffff\2\130\1\u02bb\27\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u02bc\6\130\4\uffff\1\130\1\uffff\23\130\1\u02bc\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\10"+
            "\130\1\u02bd\21\130\4\uffff\1\130\1\uffff\10\130\1\u02bd\21"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\22"+
            "\130\1\u02be\7\130\4\uffff\1\130\1\uffff\22\130\1\u02be\7\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u02c4\25\130\4\uffff\1\130\1\uffff\4\130\1\u02c4\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\3"+
            "\130\1\u02c5\26\130\4\uffff\1\130\1\uffff\3\130\1\u02c5\26\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\22"+
            "\130\1\u02c6\7\130\4\uffff\1\130\1\uffff\22\130\1\u02c6\7\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\130\1\u02c7\30\130\4\uffff\1\130\1\uffff\1\130\1\u02c7\30\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u02c9\10\130\4\uffff\1\130\1\uffff\21\130\1\u02c9\10"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u02cb\25\130\4\uffff\1\130\1\uffff\4\130\1\u02cb\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u02cc\31\130\4\uffff\1\130\1\uffff\1\u02cc\31\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u02cd\10\130\4\uffff\1\130\1\uffff\21\130\1\u02cd\10"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\14"+
            "\130\1\u02ce\15\130\4\uffff\1\130\1\uffff\14\130\1\u02ce\15"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u02cf\25\130\4\uffff\1\130\1\uffff\4\130\1\u02cf\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u02d0\16\130\4\uffff\1\130\1\uffff\13\130\1\u02d0\16"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u02d1\16\130\4\uffff\1\130\1\uffff\13\130\1\u02d1\16"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u02d2\25\130\4\uffff\1\130\1\uffff\4\130\1\u02d2\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u02d3\20\130\1\u02d4\10\130\4\uffff\1\130\1\uffff\1\u02d3\20"+
            "\130\1\u02d4\10\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u02d5\14\130\4\uffff\1\130\1\uffff\15\130\1\u02d5\14"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\2"+
            "\130\1\u02d6\27\130\4\uffff\1\130\1\uffff\2\130\1\u02d6\27\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\2"+
            "\130\1\u02d7\27\130\4\uffff\1\130\1\uffff\2\130\1\u02d7\27\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u02d8\6\130\4\uffff\1\130\1\uffff\23\130\1\u02d8\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u02da\25\130\4\uffff\1\130\1\uffff\4\130\1\u02da\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u02db\10\130\4\uffff\1\130\1\uffff\21\130\1\u02db\10"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u02dc\14\130\4\uffff\1\130\1\uffff\15\130\1\u02dc\14"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\10"+
            "\130\1\u02de\21\130\4\uffff\1\130\1\uffff\10\130\1\u02de\21"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u02df\16\130\4\uffff\1\130\1\uffff\13\130\1\u02df\16"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\26"+
            "\130\1\u02e0\3\130\4\uffff\1\130\1\uffff\26\130\1\u02e0\3\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\30"+
            "\130\1\u02e5\1\130\4\uffff\1\130\1\uffff\30\130\1\u02e5\1\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u02e6\31\130\4\uffff\1\130\1\uffff\1\u02e6\31\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u02e7\14\130\4\uffff\1\130\1\uffff\15\130\1\u02e7\14"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\22"+
            "\130\1\u02e8\7\130\4\uffff\1\130\1\uffff\22\130\1\u02e8\7\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u02ea\6\130\4\uffff\1\130\1\uffff\23\130\1\u02ea\6\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u02eb\25\130\4\uffff\1\130\1\uffff\4\130\1\u02eb\25\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u02ec\31\130\4\uffff\1\130\1\uffff\1\u02ec\31\130",
            "",
            "",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "",
            "",
            "\2\u0155\2\uffff\1\u0155\22\uffff\1\u0155\1\uffff\1\114\3"+
            "\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32\130\4\uffff"+
            "\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u02ef\6\130\4\uffff\1\130\1\uffff\23\130\1\u02ef\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\22"+
            "\130\1\u02f0\7\130\4\uffff\1\130\1\uffff\22\130\1\u02f0\7\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u02f1\6\130\4\uffff\1\130\1\uffff\23\130\1\u02f1\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u02f2\25\130\4\uffff\1\130\1\uffff\4\130\1\u02f2\25\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u02f3\25\130\4\uffff\1\130\1\uffff\4\130\1\u02f3\25\130",
            "",
            "",
            "",
            "",
            "\42\u00b6\1\u0284\3\u02f5\10\u00b6\1\u0285\1\u00b6\12\u02f5"+
            "\6\u00b6\1\u0285\32\u02f4\4\u00b6\1\u02f5\1\u00b6\32\u02f4\uff85"+
            "\u00b6",
            "",
            "\101\u00b6\32\u02f6\6\u00b6\32\u02f6\uff85\u00b6",
            "\42\u00b6\1\u0284\3\u0286\10\u00b6\1\u0285\1\u00b6\12\u0286"+
            "\6\u00b6\1\u0285\32\u0283\4\u00b6\1\u0286\1\u00b6\32\u0283\uff85"+
            "\u00b6",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\3"+
            "\130\1\u02f7\26\130\4\uffff\1\130\1\uffff\3\130\1\u02f7\26\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\14"+
            "\130\1\u02fa\15\130\4\uffff\1\130\1\uffff\14\130\1\u02fa\15"+
            "\130",
            "",
            "",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u02fb\31\130\4\uffff\1\130\1\uffff\1\u02fb\31\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\2"+
            "\130\1\u02fc\27\130\4\uffff\1\130\1\uffff\2\130\1\u02fc\27\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u02fd\16\130\4\uffff\1\130\1\uffff\13\130\1\u02fd\16"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0300\25\130\4\uffff\1\130\1\uffff\4\130\1\u0300\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0302\25\130\4\uffff\1\130\1\uffff\4\130\1\u0302\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\25"+
            "\130\1\u0303\4\130\4\uffff\1\130\1\uffff\25\130\1\u0303\4\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u0304\6\130\4\uffff\1\130\1\uffff\23\130\1\u0304\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\24"+
            "\130\1\u0305\5\130\4\uffff\1\130\1\uffff\24\130\1\u0305\5\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u0307\14\130\4\uffff\1\130\1\uffff\15\130\1\u0307\14"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0308\25\130\4\uffff\1\130\1\uffff\4\130\1\u0308\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\14"+
            "\130\1\u0309\15\130\4\uffff\1\130\1\uffff\14\130\1\u0309\15"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\17"+
            "\130\1\u030a\12\130\4\uffff\1\130\1\uffff\17\130\1\u030a\12"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\u030b\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\10"+
            "\130\1\u030c\21\130\4\uffff\1\130\1\uffff\10\130\1\u030c\21"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u030f\16\130\4\uffff\1\130\1\uffff\13\130\1\u030f\16"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0311\25\130\4\uffff\1\130\1\uffff\4\130\1\u0311\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u0312\14\130\4\uffff\1\130\1\uffff\15\130\1\u0312\14"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\22"+
            "\130\1\u0313\7\130\4\uffff\1\130\1\uffff\22\130\1\u0313\7\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0314\25\130\4\uffff\1\130\1\uffff\4\130\1\u0314\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u0315\31\130\4\uffff\1\130\1\uffff\1\u0315\31\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u0316\10\130\4\uffff\1\130\1\uffff\21\130\1\u0316\10"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u0318\6\130\4\uffff\1\130\1\uffff\23\130\1\u0318\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\3"+
            "\130\1\u0319\26\130\4\uffff\1\130\1\uffff\3\130\1\u0319\26\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u031b\31\130\4\uffff\1\130\1\uffff\1\u031b\31\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u031c\14\130\4\uffff\1\130\1\uffff\15\130\1\u031c\14"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\u031d\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u031f\14\130\4\uffff\1\130\1\uffff\15\130\1\u031f\14"+
            "\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\2"+
            "\130\1\u0320\27\130\4\uffff\1\130\1\uffff\2\130\1\u0320\27\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\10"+
            "\130\1\u0322\21\130\4\uffff\1\130\1\uffff\10\130\1\u0322\21"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u0323\14\130\4\uffff\1\130\1\uffff\15\130\1\u0323\14"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0325\25\130\4\uffff\1\130\1\uffff\4\130\1\u0325\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\u0327\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\2"+
            "\130\1\u0328\27\130\4\uffff\1\130\1\uffff\2\130\1\u0328\27\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0329\25\130\4\uffff\1\130\1\uffff\4\130\1\u0329\25\130",
            "",
            "",
            "",
            "",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u032b\25\130\4\uffff\1\130\1\uffff\4\130\1\u032b\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u032c\25\130\4\uffff\1\130\1\uffff\4\130\1\u032c\25\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u032f\16\130\4\uffff\1\130\1\uffff\13\130\1\u032f\16"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0330\25\130\4\uffff\1\130\1\uffff\4\130\1\u0330\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\10"+
            "\130\1\u0331\21\130\4\uffff\1\130\1\uffff\10\130\1\u0331\21"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u0332\10\130\4\uffff\1\130\1\uffff\21\130\1\u0332\10"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u0333\6\130\4\uffff\1\130\1\uffff\23\130\1\u0333\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0334\25\130\4\uffff\1\130\1\uffff\4\130\1\u0334\25\130",
            "\2\u02e1\2\uffff\1\u02e1\22\uffff\1\u02e1\1\uffff\1\114\3"+
            "\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32\130\4\uffff"+
            "\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u0335\14\130\4\uffff\1\130\1\uffff\15\130\1\u0335\14"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\24"+
            "\130\1\u0336\5\130\4\uffff\1\130\1\uffff\24\130\1\u0336\5\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\24"+
            "\130\1\u0337\5\130\4\uffff\1\130\1\uffff\24\130\1\u0337\5\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u0338\6\130\4\uffff\1\130\1\uffff\23\130\1\u0338\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u0339\6\130\4\uffff\1\130\1\uffff\23\130\1\u0339\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u033d\6\130\4\uffff\1\130\1\uffff\23\130\1\u033d\6\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\16"+
            "\130\1\u033e\13\130\4\uffff\1\130\1\uffff\16\130\1\u033e\13"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\22"+
            "\130\1\u0340\7\130\4\uffff\1\130\1\uffff\22\130\1\u0340\7\130",
            "",
            "",
            "",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u0342\10\130\4\uffff\1\130\1\uffff\21\130\1\u0342\10"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\6"+
            "\130\1\u0343\23\130\4\uffff\1\130\1\uffff\6\130\1\u0343\23\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u0345\31\130\4\uffff\1\130\1\uffff\1\u0345\31\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u0346\10\130\4\uffff\1\130\1\uffff\21\130\1\u0346\10"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\2"+
            "\130\1\u0347\27\130\4\uffff\1\130\1\uffff\2\130\1\u0347\27\130",
            "",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\10"+
            "\130\1\u0348\21\130\4\uffff\1\130\1\uffff\10\130\1\u0348\21"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u034a\25\130\4\uffff\1\130\1\uffff\4\130\1\u034a\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\42\u00b6\1\u0284\3\u02f5\10\u00b6\1\u0285\1\u00b6\12\u02f5"+
            "\6\u00b6\1\u0285\32\u02f4\4\u00b6\1\u02f5\1\u00b6\32\u02f4\uff85"+
            "\u00b6",
            "\42\u00b6\1\u0284\3\u02f5\10\u00b6\1\u0285\1\u00b6\12\u02f5"+
            "\6\u00b6\1\u0285\32\u02f4\4\u00b6\1\u02f5\1\u00b6\32\u02f4\uff85"+
            "\u00b6",
            "\43\u00b6\3\u034c\12\u00b6\12\u034c\7\u00b6\32\u034c\4\u00b6"+
            "\1\u034c\1\u00b6\32\u034c\uff85\u00b6",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\10"+
            "\130\1\u034d\21\130\4\uffff\1\130\1\uffff\10\130\1\u034d\21"+
            "\130",
            "",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\16"+
            "\130\1\u034e\13\130\4\uffff\1\130\1\uffff\16\130\1\u034e\13"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u034f\10\130\4\uffff\1\130\1\uffff\21\130\1\u034f\10"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u0350\14\130\4\uffff\1\130\1\uffff\15\130\1\u0350\14"+
            "\130",
            "",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u0351\16\130\4\uffff\1\130\1\uffff\13\130\1\u0351\16"+
            "\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0353\25\130\4\uffff\1\130\1\uffff\4\130\1\u0353\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0354\25\130\4\uffff\1\130\1\uffff\4\130\1\u0354\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u0355\10\130\4\uffff\1\130\1\uffff\21\130\1\u0355\10"+
            "\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0356\25\130\4\uffff\1\130\1\uffff\4\130\1\u0356\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0359\25\130\4\uffff\1\130\1\uffff\4\130\1\u0359\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\10"+
            "\130\1\u035a\21\130\4\uffff\1\130\1\uffff\10\130\1\u035a\21"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u035b\14\130\4\uffff\1\130\1\uffff\15\130\1\u035b\14"+
            "\130",
            "",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\30"+
            "\130\1\u035c\1\130\4\uffff\1\130\1\uffff\30\130\1\u035c\1\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u035e\6\130\4\uffff\1\130\1\uffff\23\130\1\u035e\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\2"+
            "\130\1\u0360\27\130\4\uffff\1\130\1\uffff\2\130\1\u0360\27\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u0361\16\130\4\uffff\1\130\1\uffff\13\130\1\u0361\16"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\10"+
            "\130\1\u0362\21\130\4\uffff\1\130\1\uffff\10\130\1\u0362\21"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u0364\6\130\4\uffff\1\130\1\uffff\23\130\1\u0364\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\3"+
            "\130\1\u0366\1\130\1\u0367\2\130\1\u0365\21\130\4\uffff\1\130"+
            "\1\uffff\3\130\1\u0366\1\130\1\u0367\2\130\1\u0365\21\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\12"+
            "\130\1\u0369\17\130\4\uffff\1\130\1\uffff\12\130\1\u0369\17"+
            "\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u036a\14\130\4\uffff\1\130\1\uffff\15\130\1\u036a\14"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\2"+
            "\130\1\u036b\27\130\4\uffff\1\130\1\uffff\2\130\1\u036b\27\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\2"+
            "\130\1\u036d\27\130\4\uffff\1\130\1\uffff\2\130\1\u036d\27\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u036e\6\130\4\uffff\1\130\1\uffff\23\130\1\u036e\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u0370\6\130\4\uffff\1\130\1\uffff\23\130\1\u0370\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u0371\16\130\4\uffff\1\130\1\uffff\13\130\1\u0371\16"+
            "\130",
            "",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u0373\14\130\4\uffff\1\130\1\uffff\15\130\1\u0373\14"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u0377\6\130\4\uffff\1\130\1\uffff\23\130\1\u0377\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\2"+
            "\130\1\u0378\27\130\4\uffff\1\130\1\uffff\2\130\1\u0378\27\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0379\25\130\4\uffff\1\130\1\uffff\4\130\1\u0379\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\u037a\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "",
            "",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\u037c\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u037d\14\130\4\uffff\1\130\1\uffff\15\130\1\u037d\14"+
            "\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\2\130\1\u037f\7\130\6"+
            "\uffff\1\114\32\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\14"+
            "\130\1\u0381\15\130\4\uffff\1\130\1\uffff\14\130\1\u0381\15"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u0383\6\130\4\uffff\1\130\1\uffff\23\130\1\u0383\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\16"+
            "\130\1\u0384\13\130\4\uffff\1\130\1\uffff\16\130\1\u0384\13"+
            "\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "",
            "\43\u00b6\3\u034c\12\u00b6\12\u034c\7\u00b6\32\u034c\4\u00b6"+
            "\1\u034c\1\u00b6\32\u034c\uff85\u00b6",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u0386\14\130\4\uffff\1\130\1\uffff\15\130\1\u0386\14"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\24"+
            "\130\1\u0387\5\130\4\uffff\1\130\1\uffff\24\130\1\u0387\5\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\2\130\1\u0388\7\130\6"+
            "\uffff\1\114\32\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\u0389\1\uffff\32\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u038a\14\130\4\uffff\1\130\1\uffff\15\130\1\u038a\14"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\6"+
            "\130\1\u038b\23\130\4\uffff\1\130\1\uffff\6\130\1\u038b\23\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u038c\25\130\4\uffff\1\130\1\uffff\4\130\1\u038c\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\3"+
            "\130\1\u038d\26\130\4\uffff\1\130\1\uffff\3\130\1\u038d\26\130",
            "",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u038e\14\130\4\uffff\1\130\1\uffff\15\130\1\u038e\14"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u038f\6\130\4\uffff\1\130\1\uffff\23\130\1\u038f\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\u0390\1\uffff\32\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u0391\6\130\4\uffff\1\130\1\uffff\23\130\1\u0391\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u0393\31\130\4\uffff\1\130\1\uffff\1\u0393\31\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0394\25\130\4\uffff\1\130\1\uffff\4\130\1\u0394\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u0395\14\130\4\uffff\1\130\1\uffff\15\130\1\u0395\14"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\16"+
            "\130\1\u0396\13\130\4\uffff\1\130\1\uffff\16\130\1\u0396\13"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u0397\16\130\4\uffff\1\130\1\uffff\13\130\1\u0397\16"+
            "\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\6"+
            "\130\1\u0399\23\130\4\uffff\1\130\1\uffff\6\130\1\u0399\23\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\10"+
            "\130\1\u039a\21\130\4\uffff\1\130\1\uffff\10\130\1\u039a\21"+
            "\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u039b\31\130\4\uffff\1\130\1\uffff\1\u039b\31\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\u039c\1\uffff\32\130",
            "",
            "\2\u0155\2\uffff\1\u0155\22\uffff\1\u0155\1\uffff\1\114\3"+
            "\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32\130\4\uffff"+
            "\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\10"+
            "\130\1\u039d\21\130\4\uffff\1\130\1\uffff\10\130\1\u039d\21"+
            "\130",
            "",
            "",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u039f\6\130\4\uffff\1\130\1\uffff\23\130\1\u039f\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\130\1\u03a1\30\130\4\uffff\1\130\1\uffff\1\130\1\u03a1\30\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\24"+
            "\130\1\u03a2\5\130\4\uffff\1\130\1\uffff\24\130\1\u03a2\5\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\17"+
            "\130\1\u03a4\12\130\4\uffff\1\130\1\uffff\17\130\1\u03a4\12"+
            "\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\10"+
            "\130\1\u03a5\21\130\4\uffff\1\130\1\uffff\10\130\1\u03a5\21"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u03a6\14\130\4\uffff\1\130\1\uffff\15\130\1\u03a6\14"+
            "\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\6"+
            "\130\1\u03a7\23\130\4\uffff\1\130\1\uffff\6\130\1\u03a7\23\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\22"+
            "\130\1\u03a8\7\130\4\uffff\1\130\1\uffff\22\130\1\u03a8\7\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u03a9\25\130\4\uffff\1\130\1\uffff\4\130\1\u03a9\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u03aa\25\130\4\uffff\1\130\1\uffff\4\130\1\u03aa\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u03ad\6\130\4\uffff\1\130\1\uffff\23\130\1\u03ad\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u03af\10\130\4\uffff\1\130\1\uffff\21\130\1\u03af\10"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\130\1\u03b0\30\130\4\uffff\1\130\1\uffff\1\130\1\u03b0\30\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u03b2\6\130\4\uffff\1\130\1\uffff\23\130\1\u03b2\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\24"+
            "\130\1\u03b3\5\130\4\uffff\1\130\1\uffff\24\130\1\u03b3\5\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\16"+
            "\130\1\u03b4\13\130\4\uffff\1\130\1\uffff\16\130\1\u03b4\13"+
            "\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u03b6\14\130\4\uffff\1\130\1\uffff\15\130\1\u03b6\14"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\2"+
            "\130\1\u03b7\27\130\4\uffff\1\130\1\uffff\2\130\1\u03b7\27\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u03b8\10\130\4\uffff\1\130\1\uffff\21\130\1\u03b8\10"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\22"+
            "\130\1\u03b9\7\130\4\uffff\1\130\1\uffff\22\130\1\u03b9\7\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\16"+
            "\130\1\u03ba\13\130\4\uffff\1\130\1\uffff\16\130\1\u03ba\13"+
            "\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\30"+
            "\130\1\u03bb\1\130\4\uffff\1\130\1\uffff\30\130\1\u03bb\1\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\22"+
            "\130\1\u03bc\7\130\4\uffff\1\130\1\uffff\22\130\1\u03bc\7\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\16"+
            "\130\1\u03be\13\130\4\uffff\1\130\1\uffff\16\130\1\u03be\13"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\22"+
            "\130\1\u03c1\7\130\4\uffff\1\u03c0\1\uffff\22\130\1\u03c1\7"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\u03c3\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u03c4\14\130\4\uffff\1\130\1\uffff\15\130\1\u03c4\14"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u03c5\10\130\4\uffff\1\130\1\uffff\21\130\1\u03c5\10"+
            "\130",
            "",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u03c6\25\130\4\uffff\1\130\1\uffff\4\130\1\u03c6\25\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u03c7\25\130\4\uffff\1\130\1\uffff\4\130\1\u03c7\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u03c8\16\130\4\uffff\1\130\1\uffff\13\130\1\u03c8\16"+
            "\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u03c9\25\130\4\uffff\1\130\1\uffff\4\130\1\u03c9\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\130\1\u03ca\30\130\4\uffff\1\130\1\uffff\1\130\1\u03ca\30\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u03cb\31\130\4\uffff\1\130\1\uffff\1\u03cb\31\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\6"+
            "\130\1\u03cc\23\130\4\uffff\1\130\1\uffff\6\130\1\u03cc\23\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\7"+
            "\130\1\u03cd\22\130\4\uffff\1\130\1\uffff\7\130\1\u03cd\22\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u03ce\25\130\4\uffff\1\130\1\uffff\4\130\1\u03ce\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u03cf\6\130\4\uffff\1\130\1\uffff\23\130\1\u03cf\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u03d0\10\130\4\uffff\1\130\1\uffff\21\130\1\u03d0\10"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\u03d1\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u03d2\25\130\4\uffff\1\130\1\uffff\4\130\1\u03d2\25\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u03d3\14\130\4\uffff\1\130\1\uffff\15\130\1\u03d3\14"+
            "\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\10"+
            "\130\1\u03d4\21\130\4\uffff\1\130\1\uffff\10\130\1\u03d4\21"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u03d6\6\130\4\uffff\1\130\1\uffff\23\130\1\u03d6\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u03d7\31\130\4\uffff\1\130\1\uffff\1\u03d7\31\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\6"+
            "\130\1\u03d8\23\130\4\uffff\1\130\1\uffff\6\130\1\u03d8\23\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\24"+
            "\130\1\u03d9\5\130\4\uffff\1\130\1\uffff\24\130\1\u03d9\5\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u03da\25\130\4\uffff\1\130\1\uffff\4\130\1\u03da\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\6"+
            "\130\1\u03db\23\130\4\uffff\1\130\1\uffff\6\130\1\u03db\23\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u03dc\16\130\4\uffff\1\130\1\uffff\13\130\1\u03dc\16"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u03dd\6\130\4\uffff\1\130\1\uffff\23\130\1\u03dd\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u03df\25\130\4\uffff\1\130\1\uffff\4\130\1\u03df\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\5"+
            "\130\1\u03e0\24\130\4\uffff\1\130\1\uffff\5\130\1\u03e0\24\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\10"+
            "\130\1\u03e1\21\130\4\uffff\1\130\1\uffff\10\130\1\u03e1\21"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u03e3\10\130\4\uffff\1\130\1\uffff\21\130\1\u03e3\10"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u03e4\10\130\4\uffff\1\130\1\uffff\21\130\1\u03e4\10"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u03e6\14\130\4\uffff\1\130\1\uffff\15\130\1\u03e6\14"+
            "\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u03e7\10\130\4\uffff\1\130\1\uffff\21\130\1\u03e7\10"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\130\1\u03e8\30\130\4\uffff\1\130\1\uffff\1\130\1\u03e8\30\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u03e9\25\130\4\uffff\1\130\1\uffff\4\130\1\u03e9\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\22"+
            "\130\1\u03ea\7\130\4\uffff\1\130\1\uffff\22\130\1\u03ea\7\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u03ec\25\130\4\uffff\1\130\1\uffff\4\130\1\u03ec\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u03ed\25\130\4\uffff\1\130\1\uffff\4\130\1\u03ed\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u03ef\25\130\4\uffff\1\130\1\uffff\4\130\1\u03ef\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\2"+
            "\130\1\u03f0\27\130\4\uffff\1\130\1\uffff\2\130\1\u03f0\27\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\16"+
            "\130\1\u03f1\13\130\4\uffff\1\130\1\uffff\16\130\1\u03f1\13"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\10"+
            "\130\1\u03f3\21\130\4\uffff\1\130\1\uffff\10\130\1\u03f3\21"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u03f4\31\130\4\uffff\1\130\1\uffff\1\u03f4\31\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u03f5\16\130\4\uffff\1\130\1\uffff\13\130\1\u03f5\16"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u03f6\10\130\4\uffff\1\130\1\uffff\21\130\1\u03f6\10"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u03f7\31\130\4\uffff\1\130\1\uffff\1\u03f7\31\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u03f8\10\130\4\uffff\1\130\1\uffff\21\130\1\u03f8\10"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\21"+
            "\130\1\u03f9\10\130\4\uffff\1\130\1\uffff\21\130\1\u03f9\10"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\16"+
            "\130\1\u03fb\13\130\4\uffff\1\130\1\uffff\16\130\1\u03fb\13"+
            "\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u03fc\6\130\4\uffff\1\130\1\uffff\23\130\1\u03fc\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u03fd\14\130\4\uffff\1\130\1\uffff\15\130\1\u03fd\14"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u03fe\25\130\4\uffff\1\130\1\uffff\4\130\1\u03fe\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\130\1\u03ff\30\130\4\uffff\1\130\1\uffff\1\130\1\u03ff\30\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0400\25\130\4\uffff\1\130\1\uffff\4\130\1\u0400\25\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u0401\6\130\4\uffff\1\130\1\uffff\23\130\1\u0401\6\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\22"+
            "\130\1\u0403\7\130\4\uffff\1\130\1\uffff\22\130\1\u0403\7\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\3"+
            "\130\1\u0404\26\130\4\uffff\1\130\1\uffff\3\130\1\u0404\26\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\13"+
            "\130\1\u0405\16\130\4\uffff\1\130\1\uffff\13\130\1\u0405\16"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u0406\14\130\4\uffff\1\130\1\uffff\15\130\1\u0406\14"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\1"+
            "\u0407\31\130\4\uffff\1\130\1\uffff\1\u0407\31\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u0409\25\130\4\uffff\1\130\1\uffff\4\130\1\u0409\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\2"+
            "\130\1\u040a\27\130\4\uffff\1\130\1\uffff\2\130\1\u040a\27\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\2"+
            "\130\1\u040b\27\130\4\uffff\1\130\1\uffff\2\130\1\u040b\27\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\4"+
            "\130\1\u040d\25\130\4\uffff\1\130\1\uffff\4\130\1\u040d\25\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\23"+
            "\130\1\u040e\6\130\4\uffff\1\130\1\uffff\23\130\1\u040e\6\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\22"+
            "\130\1\u040f\7\130\4\uffff\1\130\1\uffff\22\130\1\u040f\7\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\10"+
            "\130\1\u0410\21\130\4\uffff\1\130\1\uffff\10\130\1\u0410\21"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\16"+
            "\130\1\u0412\13\130\4\uffff\1\130\1\uffff\16\130\1\u0412\13"+
            "\130",
            "",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\15"+
            "\130\1\u0413\14\130\4\uffff\1\130\1\uffff\15\130\1\u0413\14"+
            "\130",
            "\1\114\3\130\10\uffff\1\114\1\uffff\12\130\6\uffff\1\114\32"+
            "\130\4\uffff\1\130\1\uffff\32\130",
            ""
    };

    static final short[] DFA49_eot = DFA.unpackEncodedString(DFA49_eotS);
    static final short[] DFA49_eof = DFA.unpackEncodedString(DFA49_eofS);
    static final char[] DFA49_min = DFA.unpackEncodedStringToUnsignedChars(DFA49_minS);
    static final char[] DFA49_max = DFA.unpackEncodedStringToUnsignedChars(DFA49_maxS);
    static final short[] DFA49_accept = DFA.unpackEncodedString(DFA49_acceptS);
    static final short[] DFA49_special = DFA.unpackEncodedString(DFA49_specialS);
    static final short[][] DFA49_transition;

    static {
        int numStates = DFA49_transitionS.length;
        DFA49_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA49_transition[i] = DFA.unpackEncodedString(DFA49_transitionS[i]);
        }
    }

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = DFA49_eot;
            this.eof = DFA49_eof;
            this.min = DFA49_min;
            this.max = DFA49_max;
            this.accept = DFA49_accept;
            this.special = DFA49_special;
            this.transition = DFA49_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__198 | T__199 | T__200 | T__201 | T__202 | T__203 | T__204 | T__205 | T__206 | T__207 | T__208 | T__209 | T__210 | T__211 | T__212 | T__213 | T__214 | T__215 | T__216 | T__217 | T__218 | T__219 | T__220 | T__221 | BLOCK_COMMENT | LINE_COMMENT | WHITESPACE | OR_OPERATOR | AND_OPERATOR | NOT_OPERATOR | NUMBER_UNSIGNED | STRING | SOME_TYPES | SCALE_TYPES | SIZE_TYPES | CHAR_TYPES | CHAR_TYPE | BYTE_TYPE | RAW_TYPE | TIMESTAMP_TYPE | YEAR_TYPE | DAY_TYPE | SECOND_TYPE | KEYWORD | BEGIN_KEYWORD | END_KEYWORD | DECLARE_KEYWORD | EXCEPTION_KEYWORD | WHEN_KEYWORD | THEN_KEYWORD | NULL_KEYWORD | DEFAULT_KEYWORD | ROWTYPE_KEYWORD | LIKE_TYPE_KEYWORD | TYPE_KEYWORD | TRUE_KEYWORD | FALSE_KEYWORD | CONSTANT_KEYWORD | WITH_KEYWORD | LOCAL_KEYWORD | TIME_KEYWORD | ZONE_KEYWORD | INTERVAL_KEYWORD | TO_KEYWORD | MONTH_KEYWORD | SUBTYPE_KEYWORD | IS_KEYWORD | RECORD_KEYWORD | CREATE_KEYWORD | REPLACE_KEYWORD | FUNCTION_KEYWORD | AS_KEYWORD | RETURN_KEYWORD | IN_KEYWORD | OUT_KEYWORD | NOCOPY_KEYWORD | AUTHID_KEYWORD | CURRENT_USER_KEYWORD | DEFINER_KEYWORD | DETERMINISTIC_KEYWORD | PARALLEL_ENABLED_KEYWORD | PIPELINED_KEYWORD | RESULT_CACHE_KEYWORD | PROCEDURE_KEYWORD | IF_KEYWORD | ELSE_KEYWORD | ELSIF_KEYWORD | GOTO_KEYWORD | LOOP_KEYWORD | WHILE_KEYWORD | FOR_KEYWORD | REVERSE_KEYWORD | SELECT_KEYWORD | COUNT_KEYWORD | EXCEPTION_INIT_KEYWORD | LIKE_KEYWORD | RAISE_KEYWORD | PRAGMA_KEYWORD | AUTONOMOUS_TRANSACTION_KEYWORD | CASE_KEYWORD | CLOSE_KEYWORD | TABLE_KEYWORD | OF_KEYWORD | INDEX_KEYWORD | BY_KEYWORD | VARRAY_KEYWORD | VARYING_KEYWORD | ARRAY_KEYWORD | COMMIT_KEYWORD | REF_KEYWORD | CONTINUE_KEYWORD | CURSOR_KEYWORD | DELETE_KEYWORD | EXECUTE_KEYWORD | IMMEDIATE_KEYWORD | EXIT_KEYWORD | INTO_KEYWORD | USING_KEYWORD | BULK_KEYWORD | COLLECT_KEYWORD | FETCH_KEYWORD | LIMIT_KEYWORD | FORALL_KEYWORD | SAVE_KEYWORD | EXCEPTIONS_KEYWORD | INDICES_KEYWORD | VALUES_KEYWORD | BETWEEN_KEYWORD | INLINE_KEYWORD | INSERT_KEYWORD | LOCK_KEYWORD | MERGE_KEYWORD | OPEN_KEYWORD | PACKAGE_KEYWORD | BODY_KEYWORD | RESTRICT_REFERENCES_KEYWORD | RETURNING_KEYWORD | ROLLBACK_KEYWORD | SAVEPOINT_KEYWORD | SERIALLY_REUSABLE_KEYWORD | SET_KEYWORD | TRANSACTION_KEYWORD | NOTFOUND_KEYWORD | FOUND_KEYWORD | ISOPEN_KEYWORD | ROWCOUNT_KEYWORD | SQLCODE_KEYWORD | SQLERRM_KEYWORD | UPDATE_KEYWORD | EXISTS_KEYWORD | TRIGGER_KEYWORD | BEFORE_KEYWORD | AFTER_KEYWORD | INSTEAD_KEYWORD | ON_KEYWORD | NESTED_KEYWORD | REFERENCING_KEYWORD | OLD_KEYWORD | NEW_KEYWORD | PARENT_KEYWORD | EACH_KEYWORD | ROW_KEYWORD | FOLLOWS_KEYWORD | ENABLE_KEYWORD | DISABLE_KEYWORD | OID_KEYWORD | OBJECT_KEYWORD | UNDER_KEYWORD | FINAL_KEYWORD | INSTANTIABLE_KEYWORD | OVERRIDING_KEYWORD | MEMBER_KEYWORD | STATIC_KEYWORD | CONSTRUCTOR_KEYWORD | SELF_KEYWORD | RESULT_KEYWORD | MAP_KEYWORD | ORDER_KEYWORD | JOIN_KEYWORD | IDENTIFIER | EXT_IDENTIFIER | ALIAS | SEPARATOR | COMMA | PARAM_VALUE | THE_REST );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA49_332 = input.LA(1);

                        s = -1;
                        if ( (LA49_332=='\"') ) {s = 331;}

                        else if ( (LA49_332=='.'||LA49_332=='@') ) {s = 333;}

                        else if ( ((LA49_332>='#' && LA49_332<='%')||(LA49_332>='0' && LA49_332<='9')||(LA49_332>='A' && LA49_332<='Z')||LA49_332=='_'||(LA49_332>='a' && LA49_332<='z')) ) {s = 332;}

                        else if ( ((LA49_332>='\u0000' && LA49_332<='!')||(LA49_332>='&' && LA49_332<='-')||LA49_332=='/'||(LA49_332>=':' && LA49_332<='?')||(LA49_332>='[' && LA49_332<='^')||LA49_332=='`'||(LA49_332>='{' && LA49_332<='\uFFFF')) ) {s = 182;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA49_643 = input.LA(1);

                        s = -1;
                        if ( ((LA49_643>='A' && LA49_643<='Z')||(LA49_643>='a' && LA49_643<='z')) ) {s = 756;}

                        else if ( (LA49_643=='\"') ) {s = 644;}

                        else if ( (LA49_643=='.'||LA49_643=='@') ) {s = 645;}

                        else if ( ((LA49_643>='#' && LA49_643<='%')||(LA49_643>='0' && LA49_643<='9')||LA49_643=='_') ) {s = 757;}

                        else if ( ((LA49_643>='\u0000' && LA49_643<='!')||(LA49_643>='&' && LA49_643<='-')||LA49_643=='/'||(LA49_643>=':' && LA49_643<='?')||(LA49_643>='[' && LA49_643<='^')||LA49_643=='`'||(LA49_643>='{' && LA49_643<='\uFFFF')) ) {s = 182;}

                        else s = 76;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA49_844 = input.LA(1);

                        s = -1;
                        if ( ((LA49_844>='#' && LA49_844<='%')||(LA49_844>='0' && LA49_844<='9')||(LA49_844>='A' && LA49_844<='Z')||LA49_844=='_'||(LA49_844>='a' && LA49_844<='z')) ) {s = 844;}

                        else if ( ((LA49_844>='\u0000' && LA49_844<='\"')||(LA49_844>='&' && LA49_844<='/')||(LA49_844>=':' && LA49_844<='@')||(LA49_844>='[' && LA49_844<='^')||LA49_844=='`'||(LA49_844>='{' && LA49_844<='\uFFFF')) ) {s = 182;}

                        else s = 76;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA49_646 = input.LA(1);

                        s = -1;
                        if ( (LA49_646=='\"') ) {s = 644;}

                        else if ( (LA49_646=='.'||LA49_646=='@') ) {s = 645;}

                        else if ( ((LA49_646>='A' && LA49_646<='Z')||(LA49_646>='a' && LA49_646<='z')) ) {s = 643;}

                        else if ( ((LA49_646>='#' && LA49_646<='%')||(LA49_646>='0' && LA49_646<='9')||LA49_646=='_') ) {s = 646;}

                        else if ( ((LA49_646>='\u0000' && LA49_646<='!')||(LA49_646>='&' && LA49_646<='-')||LA49_646=='/'||(LA49_646>=':' && LA49_646<='?')||(LA49_646>='[' && LA49_646<='^')||LA49_646=='`'||(LA49_646>='{' && LA49_646<='\uFFFF')) ) {s = 182;}

                        else s = 76;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA49_6 = input.LA(1);

                        s = -1;
                        if ( ((LA49_6>='\u0000' && LA49_6<='\uFFFF')) ) {s = 59;}

                        else s = 60;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA49_756 = input.LA(1);

                        s = -1;
                        if ( ((LA49_756>='A' && LA49_756<='Z')||(LA49_756>='a' && LA49_756<='z')) ) {s = 756;}

                        else if ( (LA49_756=='\"') ) {s = 644;}

                        else if ( (LA49_756=='.'||LA49_756=='@') ) {s = 645;}

                        else if ( ((LA49_756>='#' && LA49_756<='%')||(LA49_756>='0' && LA49_756<='9')||LA49_756=='_') ) {s = 757;}

                        else if ( ((LA49_756>='\u0000' && LA49_756<='!')||(LA49_756>='&' && LA49_756<='-')||LA49_756=='/'||(LA49_756>=':' && LA49_756<='?')||(LA49_756>='[' && LA49_756<='^')||LA49_756=='`'||(LA49_756>='{' && LA49_756<='\uFFFF')) ) {s = 182;}

                        else s = 76;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA49_333 = input.LA(1);

                        s = -1;
                        if ( (LA49_333=='\"') ) {s = 497;}

                        else if ( ((LA49_333>='A' && LA49_333<='Z')||(LA49_333>='a' && LA49_333<='z')) ) {s = 498;}

                        else if ( ((LA49_333>='\u0000' && LA49_333<='!')||(LA49_333>='#' && LA49_333<='@')||(LA49_333>='[' && LA49_333<='`')||(LA49_333>='{' && LA49_333<='\uFFFF')) ) {s = 182;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA49_43 = input.LA(1);

                        s = -1;
                        if ( ((LA49_43>='A' && LA49_43<='Z')||(LA49_43>='a' && LA49_43<='z')) ) {s = 181;}

                        else if ( ((LA49_43>='\u0000' && LA49_43<='!')||(LA49_43>='#' && LA49_43<='@')||(LA49_43>='[' && LA49_43<='`')||(LA49_43>='{' && LA49_43<='\uFFFF')) ) {s = 182;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA49_645 = input.LA(1);

                        s = -1;
                        if ( ((LA49_645>='A' && LA49_645<='Z')||(LA49_645>='a' && LA49_645<='z')) ) {s = 758;}

                        else if ( ((LA49_645>='\u0000' && LA49_645<='@')||(LA49_645>='[' && LA49_645<='`')||(LA49_645>='{' && LA49_645<='\uFFFF')) ) {s = 182;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA49_181 = input.LA(1);

                        s = -1;
                        if ( (LA49_181=='\"') ) {s = 331;}

                        else if ( ((LA49_181>='#' && LA49_181<='%')||(LA49_181>='0' && LA49_181<='9')||(LA49_181>='A' && LA49_181<='Z')||LA49_181=='_'||(LA49_181>='a' && LA49_181<='z')) ) {s = 332;}

                        else if ( (LA49_181=='.'||LA49_181=='@') ) {s = 333;}

                        else if ( ((LA49_181>='\u0000' && LA49_181<='!')||(LA49_181>='&' && LA49_181<='-')||LA49_181=='/'||(LA49_181>=':' && LA49_181<='?')||(LA49_181>='[' && LA49_181<='^')||LA49_181=='`'||(LA49_181>='{' && LA49_181<='\uFFFF')) ) {s = 182;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA49_0 = input.LA(1);

                        s = -1;
                        if ( (LA49_0=='<') ) {s = 1;}

                        else if ( (LA49_0=='>') ) {s = 2;}

                        else if ( (LA49_0=='(') ) {s = 3;}

                        else if ( (LA49_0==')') ) {s = 4;}

                        else if ( (LA49_0=='/') ) {s = 5;}

                        else if ( (LA49_0=='\'') ) {s = 6;}

                        else if ( (LA49_0=='+') ) {s = 7;}

                        else if ( (LA49_0=='-') ) {s = 8;}

                        else if ( (LA49_0=='*') ) {s = 9;}

                        else if ( (LA49_0=='|') ) {s = 10;}

                        else if ( (LA49_0=='=') ) {s = 11;}

                        else if ( (LA49_0=='!') ) {s = 12;}

                        else if ( (LA49_0=='~') ) {s = 13;}

                        else if ( (LA49_0=='^') ) {s = 14;}

                        else if ( (LA49_0=='.') ) {s = 15;}

                        else if ( (LA49_0==':') ) {s = 16;}

                        else if ( ((LA49_0>='\t' && LA49_0<='\n')||LA49_0=='\r'||LA49_0==' ') ) {s = 17;}

                        else if ( (LA49_0=='O'||LA49_0=='o') ) {s = 18;}

                        else if ( (LA49_0=='A'||LA49_0=='a') ) {s = 19;}

                        else if ( (LA49_0=='N'||LA49_0=='n') ) {s = 20;}

                        else if ( ((LA49_0>='0' && LA49_0<='9')) ) {s = 21;}

                        else if ( (LA49_0=='P'||LA49_0=='p') ) {s = 22;}

                        else if ( (LA49_0=='S'||LA49_0=='s') ) {s = 23;}

                        else if ( (LA49_0=='I'||LA49_0=='i') ) {s = 24;}

                        else if ( (LA49_0=='B'||LA49_0=='b') ) {s = 25;}

                        else if ( (LA49_0=='R'||LA49_0=='r') ) {s = 26;}

                        else if ( (LA49_0=='L'||LA49_0=='l') ) {s = 27;}

                        else if ( (LA49_0=='U'||LA49_0=='u') ) {s = 28;}

                        else if ( (LA49_0=='M'||LA49_0=='m') ) {s = 29;}

                        else if ( (LA49_0=='D'||LA49_0=='d') ) {s = 30;}

                        else if ( (LA49_0=='C'||LA49_0=='c') ) {s = 31;}

                        else if ( (LA49_0=='F'||LA49_0=='f') ) {s = 32;}

                        else if ( (LA49_0=='V'||LA49_0=='v') ) {s = 33;}

                        else if ( (LA49_0=='T'||LA49_0=='t') ) {s = 34;}

                        else if ( (LA49_0=='Y'||LA49_0=='y') ) {s = 35;}

                        else if ( (LA49_0=='W'||LA49_0=='w') ) {s = 36;}

                        else if ( (LA49_0=='G'||LA49_0=='g') ) {s = 37;}

                        else if ( (LA49_0=='E'||LA49_0=='e') ) {s = 38;}

                        else if ( (LA49_0=='%') ) {s = 39;}

                        else if ( (LA49_0=='Z'||LA49_0=='z') ) {s = 40;}

                        else if ( (LA49_0=='J'||LA49_0=='j') ) {s = 41;}

                        else if ( (LA49_0=='H'||LA49_0=='K'||LA49_0=='Q'||LA49_0=='X'||LA49_0=='h'||LA49_0=='k'||LA49_0=='q'||LA49_0=='x') ) {s = 42;}

                        else if ( (LA49_0=='\"') ) {s = 43;}

                        else if ( (LA49_0==';') ) {s = 44;}

                        else if ( (LA49_0==',') ) {s = 45;}

                        else if ( ((LA49_0>='\u0000' && LA49_0<='\b')||(LA49_0>='\u000B' && LA49_0<='\f')||(LA49_0>='\u000E' && LA49_0<='\u001F')||(LA49_0>='#' && LA49_0<='$')||LA49_0=='&'||(LA49_0>='?' && LA49_0<='@')||(LA49_0>='[' && LA49_0<=']')||(LA49_0>='_' && LA49_0<='`')||LA49_0=='{'||LA49_0=='}'||(LA49_0>='\u007F' && LA49_0<='\uFFFF')) ) {s = 46;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA49_498 = input.LA(1);

                        s = -1;
                        if ( ((LA49_498>='A' && LA49_498<='Z')||(LA49_498>='a' && LA49_498<='z')) ) {s = 643;}

                        else if ( (LA49_498=='\"') ) {s = 644;}

                        else if ( (LA49_498=='.'||LA49_498=='@') ) {s = 645;}

                        else if ( ((LA49_498>='#' && LA49_498<='%')||(LA49_498>='0' && LA49_498<='9')||LA49_498=='_') ) {s = 646;}

                        else if ( ((LA49_498>='\u0000' && LA49_498<='!')||(LA49_498>='&' && LA49_498<='-')||LA49_498=='/'||(LA49_498>=':' && LA49_498<='?')||(LA49_498>='[' && LA49_498<='^')||LA49_498=='`'||(LA49_498>='{' && LA49_498<='\uFFFF')) ) {s = 182;}

                        else s = 76;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA49_758 = input.LA(1);

                        s = -1;
                        if ( ((LA49_758>='#' && LA49_758<='%')||(LA49_758>='0' && LA49_758<='9')||(LA49_758>='A' && LA49_758<='Z')||LA49_758=='_'||(LA49_758>='a' && LA49_758<='z')) ) {s = 844;}

                        else if ( ((LA49_758>='\u0000' && LA49_758<='\"')||(LA49_758>='&' && LA49_758<='/')||(LA49_758>=':' && LA49_758<='@')||(LA49_758>='[' && LA49_758<='^')||LA49_758=='`'||(LA49_758>='{' && LA49_758<='\uFFFF')) ) {s = 182;}

                        else s = 76;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA49_757 = input.LA(1);

                        s = -1;
                        if ( (LA49_757=='\"') ) {s = 644;}

                        else if ( (LA49_757=='.'||LA49_757=='@') ) {s = 645;}

                        else if ( ((LA49_757>='A' && LA49_757<='Z')||(LA49_757>='a' && LA49_757<='z')) ) {s = 756;}

                        else if ( ((LA49_757>='#' && LA49_757<='%')||(LA49_757>='0' && LA49_757<='9')||LA49_757=='_') ) {s = 757;}

                        else if ( ((LA49_757>='\u0000' && LA49_757<='!')||(LA49_757>='&' && LA49_757<='-')||LA49_757=='/'||(LA49_757>=':' && LA49_757<='?')||(LA49_757>='[' && LA49_757<='^')||LA49_757=='`'||(LA49_757>='{' && LA49_757<='\uFFFF')) ) {s = 182;}

                        else s = 76;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 49, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}