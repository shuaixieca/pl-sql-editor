// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g 2010-03-30 17:59:37
package org.netbeans.modules.languages.pl_sql.antlr;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class PL_SQLLexer extends Lexer {
    public static final int VARRAY_KEYWORD=121;
    public static final int TRIGGER_KEYWORD=167;
    public static final int RESULT_KEYWORD=193;
    public static final int EXIT_KEYWORD=131;
    public static final int V=41;
    public static final int DISABLE_KEYWORD=181;
    public static final int RESTRICT_REFERENCES_KEYWORD=151;
    public static final int AUTONOMOUS_TRANSACTION_KEYWORD=113;
    public static final int WHILE_KEYWORD=103;
    public static final int U=34;
    public static final int BEGIN_KEYWORD=51;
    public static final int ELSE_KEYWORD=94;
    public static final int SOME_TYPES=9;
    public static final int COLLECT_KEYWORD=135;
    public static final int CONSTANT_KEYWORD=65;
    public static final int INTERVAL_KEYWORD=71;
    public static final int VALUES_KEYWORD=142;
    public static final int PRAGMA_KEYWORD=112;
    public static final int R=26;
    public static final int MEMBER_KEYWORD=189;
    public static final int ZONE_KEYWORD=70;
    public static final int CREATE_KEYWORD=77;
    public static final int ROLLBACK_KEYWORD=153;
    public static final int Q=162;
    public static final int CLOSE_KEYWORD=116;
    public static final int END_CASE_KEYWORD=115;
    public static final int TRUE_KEYWORD=63;
    public static final int DEFINER_KEYWORD=87;
    public static final int CONTINUE_KEYWORD=126;
    public static final int CURRENT_USER_KEYWORD=86;
    public static final int LOOP_KEYWORD=101;
    public static final int EXECUTE_KEYWORD=129;
    public static final int W=46;
    public static final int DELETE_KEYWORD=128;
    public static final int INDEX_KEYWORD=119;
    public static final int STRING=8;
    public static final int RESULT_CACHE_KEYWORD=91;
    public static final int BEFORE_KEYWORD=168;
    public static final int EACH_KEYWORD=177;
    public static final int FOLLOWS_KEYWORD=179;
    public static final int X=50;
    public static final int UNDER_KEYWORD=185;
    public static final int UPDATE_KEYWORD=165;
    public static final int AND_OPERATOR=5;
    public static final int NOT_IN_KEYWORD=99;
    public static final int CHAR_TYPE=13;
    public static final int OPEN_KEYWORD=148;
    public static final int J=183;
    public static final int OR_OPERATOR=6;
    public static final int OID_KEYWORD=182;
    public static final int USING_KEYWORD=133;
    public static final int O=25;
    public static final int CURSOR_KEYWORD=127;
    public static final int ARRAY_KEYWORD=123;
    public static final int P=36;
    public static final int REFERENCING_KEYWORD=173;
    public static final int ISOPEN_KEYWORD=160;
    public static final int OF_KEYWORD=118;
    public static final int S=37;
    public static final int SELF_KEYWORD=192;
    public static final int DECLARE_KEYWORD=53;
    public static final int OVERRIDING_KEYWORD=188;
    public static final int VARYING_KEYWORD=122;
    public static final int THE_REST=197;
    public static final int BETWEEN_KEYWORD=143;
    public static final int EXCEPTION_INIT_KEYWORD=108;
    public static final int M=43;
    public static final int T=30;
    public static final int FALSE_KEYWORD=64;
    public static final int NOT_OPERATOR=31;
    public static final int REF_KEYWORD=125;
    public static final int EXP_DIGITS=33;
    public static final int SIZE_TYPES=11;
    public static final int SQLCODE_KEYWORD=163;
    public static final int DETERMINISTIC_KEYWORD=88;
    public static final int KEYWORD=20;
    public static final int EXCEPTION_KEYWORD=54;
    public static final int SCALE_TYPES=10;
    public static final int INSERT_KEYWORD=145;
    public static final int FORALL_KEYWORD=138;
    public static final int MONTH_KEYWORD=73;
    public static final int N=28;
    public static final int SQLERRM_KEYWORD=164;
    public static final int CASE_KEYWORD=114;
    public static final int PACKAGE_KEYWORD=149;
    public static final int INLINE_KEYWORD=144;
    public static final int AS_KEYWORD=80;
    public static final int DAY_TYPE=18;
    public static final int ROWCOUNT_KEYWORD=161;
    public static final int JOIN_KEYWORD=196;
    public static final int ELSIF_KEYWORD=95;
    public static final int ENDIF_KEYWORD=96;
    public static final int COUNT_KEYWORD=107;
    public static final int PARENT_KEYWORD=176;
    public static final int FINAL_KEYWORD=186;
    public static final int SUBTYPE_KEYWORD=74;
    public static final int FETCH_KEYWORD=136;
    public static final int FUNCTION_KEYWORD=79;
    public static final int STATIC_KEYWORD=190;
    public static final int EXISTS_KEYWORD=166;
    public static final int TABLE_KEYWORD=117;
    public static final int COMMIT_KEYWORD=124;
    public static final int NESTED_KEYWORD=172;
    public static final int IS_NOT_NULL_KEYWORD=98;
    public static final int IS_KEYWORD=75;
    public static final int BULK_KEYWORD=134;
    public static final int D=29;
    public static final int PROCEDURE_KEYWORD=92;
    public static final int IF_KEYWORD=93;
    public static final int YEAR_TYPE=17;
    public static final int LIKE_TYPE_KEYWORD=61;
    public static final int RAISE_KEYWORD=111;
    public static final int TIME_KEYWORD=68;
    public static final int CHAR_TYPES=12;
    public static final int ORDER_KEYWORD=195;
    public static final int CONSTRUCTOR_KEYWORD=191;
    public static final int SAVEPOINT_KEYWORD=154;
    public static final int ROWTYPE_KEYWORD=60;
    public static final int NOT_NULL_KEYWORD=57;
    public static final int RETURN_KEYWORD=81;
    public static final int PIPELINED_KEYWORD=90;
    public static final int MAP_KEYWORD=194;
    public static final int TIMESTAMP_TYPE=16;
    public static final int NOT_OPEARTOR=7;
    public static final int NOTFOUND_KEYWORD=158;
    public static final int AUTHID_KEYWORD=85;
    public static final int IN_KEYWORD=82;
    public static final int A=27;
    public static final int WITH_KEYWORD=66;
    public static final int LINE_COMMENT=22;
    public static final int INSTEAD_KEYWORD=170;
    public static final int PARALLEL_ENABLED_KEYWORD=89;
    public static final int ENABLE_KEYWORD=180;
    public static final int BYTE_TYPE=14;
    public static final int WHEN_KEYWORD=55;
    public static final int C=47;
    public static final int L=35;
    public static final int LOCAL_KEYWORD=67;
    public static final int SECOND_TYPE=19;
    public static final int ROW_KEYWORD=178;
    public static final int END_KEYWORD=52;
    public static final int LIMIT_KEYWORD=137;
    public static final int SET_KEYWORD=156;
    public static final int AFTER_KEYWORD=169;
    public static final int SERIALLY_REUSABLE_KEYWORD=155;
    public static final int TYPE_KEYWORD=62;
    public static final int LOCK_KEYWORD=146;
    public static final int BODY_KEYWORD=150;
    public static final int ON_KEYWORD=171;
    public static final int IS_NULL_KEYWORD=97;
    public static final int FOUND_KEYWORD=159;
    public static final int MERGE_KEYWORD=147;
    public static final int I=38;
    public static final int OBJECT_KEYWORD=184;
    public static final int F=45;
    public static final int TRANSACTION_KEYWORD=157;
    public static final int INSTANTIABLE_KEYWORD=187;
    public static final int SAVE_KEYWORD=139;
    public static final int RAW_TYPE=15;
    public static final int END_LOOP_KEYWORD=102;
    public static final int EXCEPTIONS_KEYWORD=140;
    public static final int LIKE_KEYWORD=110;
    public static final int RETURNING_KEYWORD=152;
    public static final int K=109;
    public static final int NEW_KEYWORD=175;
    public static final int RECORD_KEYWORD=76;
    public static final int OUT_KEYWORD=83;
    public static final int B=44;
    public static final int NULL_KEYWORD=58;
    public static final int INTO_KEYWORD=132;
    public static final int DIGIT=49;
    public static final int OPERATOR=24;
    public static final int DEFAULT_KEYWORD=59;
    public static final int OLD_KEYWORD=174;
    public static final int DIGITS=32;
    public static final int H=48;
    public static final int IMMEDIATE_KEYWORD=130;
    public static final int NUMBER_UNSIGNED=4;
    public static final int G=40;
    public static final int BLOCK_COMMENT=21;
    public static final int FOR_KEYWORD=104;
    public static final int TO_KEYWORD=72;
    public static final int WHITESPACE=23;
    public static final int Z=69;
    public static final int BY_KEYWORD=120;
    public static final int REVERSE_KEYWORD=105;
    public static final int THEN_KEYWORD=56;
    public static final int EOF=-1;
    public static final int SELECT_KEYWORD=106;
    public static final int INDICES_KEYWORD=141;
    public static final int GOTO_KEYWORD=100;
    public static final int REPLACE_KEYWORD=78;
    public static final int NOCOPY_KEYWORD=84;
    public static final int Y=42;
    public static final int E=39;


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

    // $ANTLR start "BLOCK_COMMENT"
    public final void mBLOCK_COMMENT() throws RecognitionException {
        try {
            int _type = BLOCK_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:120:2: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:120:4: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:120:9: ( options {greedy=false; } : . )*
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
            	    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:120:37: .
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:124:2: ( '--' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:124:4: '--' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("--"); 

            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:124:9: (~ ( '\\n' | '\\r' ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:124:9: ~ ( '\\n' | '\\r' )
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

            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:124:23: ( '\\r' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:124:23: '\\r'
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:128:2: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:128:4: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:128:4: ( ' ' | '\\t' | '\\n' | '\\r' )+
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

    // $ANTLR start "OPERATOR"
    public final void mOPERATOR() throws RecognitionException {
        try {
            int _type = OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:131:9: ( ':=' | '+' | '-' | '*' | '/' | '**' | '||' | '=' | '<>' | '!=' | '~=' | '^=' | '>' | '<' | '<=' | '>=' | '..' | '(+)' | '(' | ')' | '<<' | '>>' )
            int alt5=22;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:131:11: ':='
                    {
                    match(":="); 


                    }
                    break;
                case 2 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:131:18: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 3 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:131:24: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 4 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:131:30: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 5 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:131:36: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 6 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:131:42: '**'
                    {
                    match("**"); 


                    }
                    break;
                case 7 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:131:49: '||'
                    {
                    match("||"); 


                    }
                    break;
                case 8 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:131:56: '='
                    {
                    match('='); 

                    }
                    break;
                case 9 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:131:62: '<>'
                    {
                    match("<>"); 


                    }
                    break;
                case 10 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:131:69: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 11 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:131:76: '~='
                    {
                    match("~="); 


                    }
                    break;
                case 12 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:132:7: '^='
                    {
                    match("^="); 


                    }
                    break;
                case 13 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:132:14: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 14 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:132:20: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 15 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:132:26: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 16 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:132:33: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 17 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:132:40: '..'
                    {
                    match(".."); 


                    }
                    break;
                case 18 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:132:47: '(+)'
                    {
                    match("(+)"); 


                    }
                    break;
                case 19 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:132:55: '('
                    {
                    match('('); 

                    }
                    break;
                case 20 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:132:61: ')'
                    {
                    match(')'); 

                    }
                    break;
                case 21 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:132:67: '<<'
                    {
                    match("<<"); 


                    }
                    break;
                case 22 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:132:74: '>>'
                    {
                    match(">>"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPERATOR"

    // $ANTLR start "OR_OPERATOR"
    public final void mOR_OPERATOR() throws RecognitionException {
        try {
            int _type = OR_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:136:2: ( O R )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:136:4: O R
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:139:2: ( A N D )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:139:4: A N D
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:142:2: ( N O T )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:142:4: N O T
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:145:2: ( ( DIGITS ( '.' )? ( DIGITS )? | '.' DIGITS ) ( EXP_DIGITS )? )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:145:4: ( DIGITS ( '.' )? ( DIGITS )? | '.' DIGITS ) ( EXP_DIGITS )?
            {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:145:4: ( DIGITS ( '.' )? ( DIGITS )? | '.' DIGITS )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                alt8=1;
            }
            else if ( (LA8_0=='.') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:145:5: DIGITS ( '.' )? ( DIGITS )?
                    {
                    mDIGITS(); 
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:145:12: ( '.' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='.') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:145:12: '.'
                            {
                            match('.'); 

                            }
                            break;

                    }

                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:145:17: ( DIGITS )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:145:17: DIGITS
                            {
                            mDIGITS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:146:5: '.' DIGITS
                    {
                    match('.'); 
                    mDIGITS(); 

                    }
                    break;

            }

            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:148:3: ( EXP_DIGITS )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='E'||LA9_0=='e') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:148:4: EXP_DIGITS
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:151:8: ( '\\'' ( '\\'\\'' | ~ ( '\\'' ) )* '\\'' )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:152:3: '\\'' ( '\\'\\'' | ~ ( '\\'' ) )* '\\''
            {
            match('\''); 
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:152:8: ( '\\'\\'' | ~ ( '\\'' ) )*
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\'') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='\'') ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='\uFFFF')) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:152:10: '\\'\\''
            	    {
            	    match("''"); 


            	    }
            	    break;
            	case 2 :
            	    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:152:19: ~ ( '\\'' )
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
            	    break loop10;
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:156:2: ( N A T U R A L | P L S '_' I N T E G E R | N A T U R A L N | P O S I T I V E | P O S I T I V E N | S I G N T Y P E | S I M P L E '_' I N T E G E R | I N T | I N T E G E R | S M A L L I N T | B I N A R Y '_' I N T E G E R | R E A L | B I N A R Y '_' D O U B L E | B I N A R Y '_' F L O A T | L O N G | L O N G ( ' ' | '\\t' | '\\n' | '\\r' )+ R A W | R O W I D | U R O W I D | B O O L E A N | M L S L A B E L | D A T E | B F I L E | B L O B | C L O B | N C L O B )
            int alt12=25;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:156:4: N A T U R A L
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
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:156:20: P L S '_' I N T E G E R
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
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:156:46: N A T U R A L N
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
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:156:64: P O S I T I V E
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
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:156:82: P O S I T I V E N
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
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:157:3: S I G N T Y P E
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
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:157:21: S I M P L E '_' I N T E G E R
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
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:157:53: I N T
                    {
                    mI(); 
                    mN(); 
                    mT(); 

                    }
                    break;
                case 9 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:157:61: I N T E G E R
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
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:157:77: S M A L L I N T
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
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:158:3: B I N A R Y '_' I N T E G E R
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
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:158:35: R E A L
                    {
                    mR(); 
                    mE(); 
                    mA(); 
                    mL(); 

                    }
                    break;
                case 13 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:158:45: B I N A R Y '_' D O U B L E
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
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:158:75: B I N A R Y '_' F L O A T
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
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:159:3: L O N G
                    {
                    mL(); 
                    mO(); 
                    mN(); 
                    mG(); 

                    }
                    break;
                case 16 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:159:13: L O N G ( ' ' | '\\t' | '\\n' | '\\r' )+ R A W
                    {
                    mL(); 
                    mO(); 
                    mN(); 
                    mG(); 
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:159:21: ( ' ' | '\\t' | '\\n' | '\\r' )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                            alt11=1;
                        }


                        switch (alt11) {
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
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);

                    mR(); 
                    mA(); 
                    mW(); 

                    }
                    break;
                case 17 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:159:51: R O W I D
                    {
                    mR(); 
                    mO(); 
                    mW(); 
                    mI(); 
                    mD(); 

                    }
                    break;
                case 18 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:159:63: U R O W I D
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
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:159:77: B O O L E A N
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
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:159:93: M L S L A B E L
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
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:160:3: D A T E
                    {
                    mD(); 
                    mA(); 
                    mT(); 
                    mE(); 

                    }
                    break;
                case 22 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:160:13: B F I L E
                    {
                    mB(); 
                    mF(); 
                    mI(); 
                    mL(); 
                    mE(); 

                    }
                    break;
                case 23 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:160:25: B L O B
                    {
                    mB(); 
                    mL(); 
                    mO(); 
                    mB(); 

                    }
                    break;
                case 24 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:160:35: C L O B
                    {
                    mC(); 
                    mL(); 
                    mO(); 
                    mB(); 

                    }
                    break;
                case 25 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:160:45: N C L O B
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:164:2: ( ( N U M B E R | D E C | D E C I M A L | N U M E R I C ) ( ( '(' ( '+' )? DIGITS ')' ) | ( '(' ( '+' )? DIGITS ',' ( '+' | '-' )? DIGITS ')' ) )? )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:164:4: ( N U M B E R | D E C | D E C I M A L | N U M E R I C ) ( ( '(' ( '+' )? DIGITS ')' ) | ( '(' ( '+' )? DIGITS ',' ( '+' | '-' )? DIGITS ')' ) )?
            {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:164:4: ( N U M B E R | D E C | D E C I M A L | N U M E R I C )
            int alt13=4;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:164:6: N U M B E R
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
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:164:20: D E C
                    {
                    mD(); 
                    mE(); 
                    mC(); 

                    }
                    break;
                case 3 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:164:28: D E C I M A L
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
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:164:44: N U M E R I C
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

            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:165:3: ( ( '(' ( '+' )? DIGITS ')' ) | ( '(' ( '+' )? DIGITS ',' ( '+' | '-' )? DIGITS ')' ) )?
            int alt17=3;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:165:5: ( '(' ( '+' )? DIGITS ')' )
                    {
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:165:5: ( '(' ( '+' )? DIGITS ')' )
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:165:6: '(' ( '+' )? DIGITS ')'
                    {
                    match('('); 
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:165:10: ( '+' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='+') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:165:10: '+'
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
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:166:3: ( '(' ( '+' )? DIGITS ',' ( '+' | '-' )? DIGITS ')' )
                    {
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:166:3: ( '(' ( '+' )? DIGITS ',' ( '+' | '-' )? DIGITS ')' )
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:166:4: '(' ( '+' )? DIGITS ',' ( '+' | '-' )? DIGITS ')'
                    {
                    match('('); 
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:166:8: ( '+' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='+') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:166:8: '+'
                            {
                            match('+'); 

                            }
                            break;

                    }

                    mDIGITS(); 
                    match(','); 
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:166:24: ( '+' | '-' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='+'||LA16_0=='-') ) {
                        alt16=1;
                    }
                    switch (alt16) {
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:170:2: ( ( D O U B L E ( ' ' | '\\t' | '\\n' | '\\r' )+ P R E C I S I O N | F L O A T ) ( '(' ( '+' )? DIGITS ')' )? )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:170:4: ( D O U B L E ( ' ' | '\\t' | '\\n' | '\\r' )+ P R E C I S I O N | F L O A T ) ( '(' ( '+' )? DIGITS ')' )?
            {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:170:4: ( D O U B L E ( ' ' | '\\t' | '\\n' | '\\r' )+ P R E C I S I O N | F L O A T )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='D'||LA19_0=='d') ) {
                alt19=1;
            }
            else if ( (LA19_0=='F'||LA19_0=='f') ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:170:6: D O U B L E ( ' ' | '\\t' | '\\n' | '\\r' )+ P R E C I S I O N
                    {
                    mD(); 
                    mO(); 
                    mU(); 
                    mB(); 
                    mL(); 
                    mE(); 
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:170:18: ( ' ' | '\\t' | '\\n' | '\\r' )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {
                            alt18=1;
                        }


                        switch (alt18) {
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
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
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
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:170:60: F L O A T
                    {
                    mF(); 
                    mL(); 
                    mO(); 
                    mA(); 
                    mT(); 

                    }
                    break;

            }

            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:171:3: ( '(' ( '+' )? DIGITS ')' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='(') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:171:5: '(' ( '+' )? DIGITS ')'
                    {
                    match('('); 
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:171:9: ( '+' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='+') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:171:9: '+'
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:175:2: ( V A R C H A R | V A R C H A R '2' | N C H A R | N V A R C H A R '2' )
            int alt22=4;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:175:4: V A R C H A R
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
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:175:20: V A R C H A R '2'
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
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:175:40: N C H A R
                    {
                    mN(); 
                    mC(); 
                    mH(); 
                    mA(); 
                    mR(); 

                    }
                    break;
                case 4 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:175:52: N V A R C H A R '2'
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:179:2: ( C H A R )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:179:4: C H A R
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:183:2: ( B Y T E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:183:4: B Y T E
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:186:9: ( R A W '(' ( '+' )? DIGITS ')' )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:186:11: R A W '(' ( '+' )? DIGITS ')'
            {
            mR(); 
            mA(); 
            mW(); 
            match('('); 
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:186:21: ( '+' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='+') ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:186:21: '+'
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:190:2: ( T I M E S T A M P ( '(' ( '+' )? DIGIT ')' )? )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:190:4: T I M E S T A M P ( '(' ( '+' )? DIGIT ')' )?
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:190:22: ( '(' ( '+' )? DIGIT ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='(') ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:190:24: '(' ( '+' )? DIGIT ')'
                    {
                    match('('); 
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:190:28: ( '+' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0=='+') ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:190:28: '+'
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:194:2: ( Y E A R ( '(' ( '+' )? '0' .. '4' ')' )? )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:194:4: Y E A R ( '(' ( '+' )? '0' .. '4' ')' )?
            {
            mY(); 
            mE(); 
            mA(); 
            mR(); 
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:194:12: ( '(' ( '+' )? '0' .. '4' ')' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='(') ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:194:14: '(' ( '+' )? '0' .. '4' ')'
                    {
                    match('('); 
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:194:18: ( '+' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0=='+') ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:194:18: '+'
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:197:9: ( D A Y ( '(' ( '+' )? DIGIT ')' )? )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:197:11: D A Y ( '(' ( '+' )? DIGIT ')' )?
            {
            mD(); 
            mA(); 
            mY(); 
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:197:17: ( '(' ( '+' )? DIGIT ')' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0=='(') ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:197:19: '(' ( '+' )? DIGIT ')'
                    {
                    match('('); 
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:197:23: ( '+' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0=='+') ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:197:23: '+'
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:201:2: ( S E C O N D ( '(' ( '+' )? DIGIT ')' )? )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:201:4: S E C O N D ( '(' ( '+' )? DIGIT ')' )?
            {
            mS(); 
            mE(); 
            mC(); 
            mO(); 
            mN(); 
            mD(); 
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:201:16: ( '(' ( '+' )? DIGIT ')' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0=='(') ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:201:18: '(' ( '+' )? DIGIT ')'
                    {
                    match('('); 
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:201:22: ( '+' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0=='+') ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:201:22: '+'
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:205:9: ( '.' | F R O M | W H E R E | G R O U P ( ' ' | '\\t' | '\\n' | '\\r' )+ B Y | O R D E R ( ' ' | '\\t' | '\\n' | '\\r' )+ B Y | P R I O R | C O N N E C T '_' B Y '_' R O O T | C O N N E C T | S T A R T | U N I O N | U N I O N ( ' ' | '\\t' | '\\n' | '\\r' )+ A L L | I N T E R S E C T | M I N U S | M U L T I S E T ( ' ' | '\\t' | '\\n' | '\\r' )+ E X C E P T | M U L T I S E T ( ' ' | '\\t' | '\\n' | '\\r' )+ I N T E R S E C T | M U L T I S E T ( ' ' | '\\t' | '\\n' | '\\r' )+ U N I O N | A N Y | S O M E | A L L | E S C A P E )
            int alt38=20;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:205:11: '.'
                    {
                    match('.'); 

                    }
                    break;
                case 2 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:205:17: F R O M
                    {
                    mF(); 
                    mR(); 
                    mO(); 
                    mM(); 

                    }
                    break;
                case 3 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:205:27: W H E R E
                    {
                    mW(); 
                    mH(); 
                    mE(); 
                    mR(); 
                    mE(); 

                    }
                    break;
                case 4 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:205:39: G R O U P ( ' ' | '\\t' | '\\n' | '\\r' )+ B Y
                    {
                    mG(); 
                    mR(); 
                    mO(); 
                    mU(); 
                    mP(); 
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:205:49: ( ' ' | '\\t' | '\\n' | '\\r' )+
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
                case 5 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:205:77: O R D E R ( ' ' | '\\t' | '\\n' | '\\r' )+ B Y
                    {
                    mO(); 
                    mR(); 
                    mD(); 
                    mE(); 
                    mR(); 
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:205:87: ( ' ' | '\\t' | '\\n' | '\\r' )+
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

                    mB(); 
                    mY(); 

                    }
                    break;
                case 6 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:206:7: P R I O R
                    {
                    mP(); 
                    mR(); 
                    mI(); 
                    mO(); 
                    mR(); 

                    }
                    break;
                case 7 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:206:19: C O N N E C T '_' B Y '_' R O O T
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
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:206:55: C O N N E C T
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
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:206:71: S T A R T
                    {
                    mS(); 
                    mT(); 
                    mA(); 
                    mR(); 
                    mT(); 

                    }
                    break;
                case 10 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:207:7: U N I O N
                    {
                    mU(); 
                    mN(); 
                    mI(); 
                    mO(); 
                    mN(); 

                    }
                    break;
                case 11 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:207:19: U N I O N ( ' ' | '\\t' | '\\n' | '\\r' )+ A L L
                    {
                    mU(); 
                    mN(); 
                    mI(); 
                    mO(); 
                    mN(); 
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:207:29: ( ' ' | '\\t' | '\\n' | '\\r' )+
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

                    mA(); 
                    mL(); 
                    mL(); 

                    }
                    break;
                case 12 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:207:59: I N T E R S E C T
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
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:207:79: M I N U S
                    {
                    mM(); 
                    mI(); 
                    mN(); 
                    mU(); 
                    mS(); 

                    }
                    break;
                case 14 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:207:91: M U L T I S E T ( ' ' | '\\t' | '\\n' | '\\r' )+ E X C E P T
                    {
                    mM(); 
                    mU(); 
                    mL(); 
                    mT(); 
                    mI(); 
                    mS(); 
                    mE(); 
                    mT(); 
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:207:107: ( ' ' | '\\t' | '\\n' | '\\r' )+
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

                    mE(); 
                    mX(); 
                    mC(); 
                    mE(); 
                    mP(); 
                    mT(); 

                    }
                    break;
                case 15 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:208:7: M U L T I S E T ( ' ' | '\\t' | '\\n' | '\\r' )+ I N T E R S E C T
                    {
                    mM(); 
                    mU(); 
                    mL(); 
                    mT(); 
                    mI(); 
                    mS(); 
                    mE(); 
                    mT(); 
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:208:23: ( ' ' | '\\t' | '\\n' | '\\r' )+
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
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:208:65: M U L T I S E T ( ' ' | '\\t' | '\\n' | '\\r' )+ U N I O N
                    {
                    mM(); 
                    mU(); 
                    mL(); 
                    mT(); 
                    mI(); 
                    mS(); 
                    mE(); 
                    mT(); 
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:208:81: ( ' ' | '\\t' | '\\n' | '\\r' )+
                    int cnt37=0;
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( ((LA37_0>='\t' && LA37_0<='\n')||LA37_0=='\r'||LA37_0==' ') ) {
                            alt37=1;
                        }


                        switch (alt37) {
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
                    	    if ( cnt37 >= 1 ) break loop37;
                                EarlyExitException eee =
                                    new EarlyExitException(37, input);
                                throw eee;
                        }
                        cnt37++;
                    } while (true);

                    mU(); 
                    mN(); 
                    mI(); 
                    mO(); 
                    mN(); 

                    }
                    break;
                case 17 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:209:7: A N Y
                    {
                    mA(); 
                    mN(); 
                    mY(); 

                    }
                    break;
                case 18 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:209:15: S O M E
                    {
                    mS(); 
                    mO(); 
                    mM(); 
                    mE(); 

                    }
                    break;
                case 19 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:209:25: A L L
                    {
                    mA(); 
                    mL(); 
                    mL(); 

                    }
                    break;
                case 20 :
                    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:209:33: E S C A P E
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:213:14: ( B E G I N )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:213:16: B E G I N
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:214:12: ( E N D )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:214:14: E N D
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:215:16: ( D E C L A R E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:215:18: D E C L A R E
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:216:18: ( E X C E P T I O N )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:216:20: E X C E P T I O N
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:217:13: ( W H E N )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:217:15: W H E N
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:218:13: ( T H E N )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:218:15: T H E N
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

    // $ANTLR start "NOT_NULL_KEYWORD"
    public final void mNOT_NULL_KEYWORD() throws RecognitionException {
        try {
            int _type = NOT_NULL_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:219:17: ( N O T ( ' ' | '\\t' | '\\n' | '\\r' )+ N U L L )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:219:19: N O T ( ' ' | '\\t' | '\\n' | '\\r' )+ N U L L
            {
            mN(); 
            mO(); 
            mT(); 
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:219:25: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>='\t' && LA39_0<='\n')||LA39_0=='\r'||LA39_0==' ') ) {
                    alt39=1;
                }


                switch (alt39) {
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
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);

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
    // $ANTLR end "NOT_NULL_KEYWORD"

    // $ANTLR start "NULL_KEYWORD"
    public final void mNULL_KEYWORD() throws RecognitionException {
        try {
            int _type = NULL_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:220:13: ( N U L L )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:220:15: N U L L
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:221:16: ( D E F A U L T )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:221:18: D E F A U L T
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:222:16: ( '%' R O W T Y P E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:222:18: '%' R O W T Y P E
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:223:18: ( '%' T Y P E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:223:20: '%' T Y P E
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:224:13: ( T Y P E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:224:15: T Y P E
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:225:13: ( T R U E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:225:15: T R U E
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:226:14: ( F A L S E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:226:16: F A L S E
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:227:17: ( C O N S T A N T )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:227:19: C O N S T A N T
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:228:13: ( W I T H )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:228:15: W I T H
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:229:14: ( L O C A L )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:229:16: L O C A L
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:230:13: ( T I M E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:230:15: T I M E
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:231:13: ( Z O N E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:231:15: Z O N E
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:232:17: ( I N T E R V A L )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:232:19: I N T E R V A L
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:233:11: ( T O )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:233:13: T O
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:234:14: ( M O N T H )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:234:16: M O N T H
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:235:16: ( S U B T Y P E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:235:18: S U B T Y P E
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:236:11: ( I S )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:236:13: I S
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:237:15: ( R E C O R D )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:237:17: R E C O R D
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:238:15: ( C R E A T E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:238:17: C R E A T E
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:239:16: ( R E P L A C E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:239:18: R E P L A C E
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:240:17: ( F U N C T I O N )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:240:19: F U N C T I O N
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:241:11: ( A S )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:241:13: A S
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:242:15: ( R E T U R N )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:242:17: R E T U R N
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:243:11: ( I N )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:243:13: I N
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:244:12: ( O U T )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:244:14: O U T
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:245:15: ( N O C O P Y )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:245:17: N O C O P Y
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:246:15: ( A U T H I D )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:246:17: A U T H I D
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:247:21: ( C U R R E N T '_' U S E R )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:247:23: C U R R E N T '_' U S E R
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:248:16: ( D E F I N E R )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:248:18: D E F I N E R
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:249:22: ( D E T E R M I N I S T I C )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:249:24: D E T E R M I N I S T I C
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:250:25: ( P A R A L L E L '_' E N A B L E D )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:250:27: P A R A L L E L '_' E N A B L E D
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:251:18: ( P I P E L I N E D )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:251:20: P I P E L I N E D
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:252:21: ( R E S U L T '_' C A C H E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:252:23: R E S U L T '_' C A C H E
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:253:18: ( P R O C E D U R E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:253:20: P R O C E D U R E
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:254:11: ( I F )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:254:13: I F
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:255:13: ( E L S E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:255:15: E L S E
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:256:14: ( E L S I F )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:256:16: E L S I F
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

    // $ANTLR start "ENDIF_KEYWORD"
    public final void mENDIF_KEYWORD() throws RecognitionException {
        try {
            int _type = ENDIF_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:257:14: ( END_KEYWORD ( ' ' )+ IF_KEYWORD )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:257:17: END_KEYWORD ( ' ' )+ IF_KEYWORD
            {
            mEND_KEYWORD(); 
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:257:29: ( ' ' )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==' ') ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:257:29: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;

            	default :
            	    if ( cnt40 >= 1 ) break loop40;
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
            } while (true);

            mIF_KEYWORD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENDIF_KEYWORD"

    // $ANTLR start "IS_NULL_KEYWORD"
    public final void mIS_NULL_KEYWORD() throws RecognitionException {
        try {
            int _type = IS_NULL_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:258:16: ( I S ( ' ' | '\\t' | '\\n' | '\\r' )+ N U L L )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:258:18: I S ( ' ' | '\\t' | '\\n' | '\\r' )+ N U L L
            {
            mI(); 
            mS(); 
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:258:22: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>='\t' && LA41_0<='\n')||LA41_0=='\r'||LA41_0==' ') ) {
                    alt41=1;
                }


                switch (alt41) {
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
            	    if ( cnt41 >= 1 ) break loop41;
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
            } while (true);

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
    // $ANTLR end "IS_NULL_KEYWORD"

    // $ANTLR start "IS_NOT_NULL_KEYWORD"
    public final void mIS_NOT_NULL_KEYWORD() throws RecognitionException {
        try {
            int _type = IS_NOT_NULL_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:259:20: ( I S ( ' ' | '\\t' | '\\n' | '\\r' )+ N O T ( ' ' | '\\t' | '\\n' | '\\r' )+ N U L L )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:259:22: I S ( ' ' | '\\t' | '\\n' | '\\r' )+ N O T ( ' ' | '\\t' | '\\n' | '\\r' )+ N U L L
            {
            mI(); 
            mS(); 
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:259:26: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt42=0;
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>='\t' && LA42_0<='\n')||LA42_0=='\r'||LA42_0==' ') ) {
                    alt42=1;
                }


                switch (alt42) {
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
            	    if ( cnt42 >= 1 ) break loop42;
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
            } while (true);

            mN(); 
            mO(); 
            mT(); 
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:259:54: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt43=0;
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>='\t' && LA43_0<='\n')||LA43_0=='\r'||LA43_0==' ') ) {
                    alt43=1;
                }


                switch (alt43) {
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
            	    if ( cnt43 >= 1 ) break loop43;
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
            } while (true);

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
    // $ANTLR end "IS_NOT_NULL_KEYWORD"

    // $ANTLR start "NOT_IN_KEYWORD"
    public final void mNOT_IN_KEYWORD() throws RecognitionException {
        try {
            int _type = NOT_IN_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:260:15: ( N O T ( ' ' | '\\t' | '\\n' | '\\r' )+ I N )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:260:17: N O T ( ' ' | '\\t' | '\\n' | '\\r' )+ I N
            {
            mN(); 
            mO(); 
            mT(); 
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:260:23: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt44=0;
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>='\t' && LA44_0<='\n')||LA44_0=='\r'||LA44_0==' ') ) {
                    alt44=1;
                }


                switch (alt44) {
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
            	    if ( cnt44 >= 1 ) break loop44;
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
            } while (true);

            mI(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT_IN_KEYWORD"

    // $ANTLR start "GOTO_KEYWORD"
    public final void mGOTO_KEYWORD() throws RecognitionException {
        try {
            int _type = GOTO_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:261:13: ( G O T O )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:261:15: G O T O
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:262:13: ( L O O P )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:262:15: L O O P
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

    // $ANTLR start "END_LOOP_KEYWORD"
    public final void mEND_LOOP_KEYWORD() throws RecognitionException {
        try {
            int _type = END_LOOP_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:263:17: ( END_KEYWORD ( ' ' )+ LOOP_KEYWORD )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:263:19: END_KEYWORD ( ' ' )+ LOOP_KEYWORD
            {
            mEND_KEYWORD(); 
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:263:31: ( ' ' )+
            int cnt45=0;
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==' ') ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:263:31: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;

            	default :
            	    if ( cnt45 >= 1 ) break loop45;
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        throw eee;
                }
                cnt45++;
            } while (true);

            mLOOP_KEYWORD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "END_LOOP_KEYWORD"

    // $ANTLR start "WHILE_KEYWORD"
    public final void mWHILE_KEYWORD() throws RecognitionException {
        try {
            int _type = WHILE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:264:14: ( W H I L E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:264:16: W H I L E
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:265:12: ( F O R )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:265:14: F O R
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:266:16: ( R E V E R S E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:266:18: R E V E R S E
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:267:15: ( S E L E C T )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:267:17: S E L E C T
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:268:14: ( C O U N T )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:268:16: C O U N T
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:269:23: ( E X C E P T I O N '_' I N I T )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:269:25: E X C E P T I O N '_' I N I T
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:270:13: ( L I K E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:270:15: L I K E
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:271:14: ( R A I S E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:271:16: R A I S E
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:272:15: ( P R A G M A )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:272:17: P R A G M A
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:273:31: ( A U T O N O M O U S '_' T R A N S A C T I O N )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:273:33: A U T O N O M O U S '_' T R A N S A C T I O N
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:274:13: ( C A S E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:274:15: C A S E
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

    // $ANTLR start "END_CASE_KEYWORD"
    public final void mEND_CASE_KEYWORD() throws RecognitionException {
        try {
            int _type = END_CASE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:275:17: ( E N D ( ' ' )+ C A S E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:275:19: E N D ( ' ' )+ C A S E
            {
            mE(); 
            mN(); 
            mD(); 
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:275:25: ( ' ' )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==' ') ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:275:25: ' '
            	    {
            	    match(' '); 

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
    // $ANTLR end "END_CASE_KEYWORD"

    // $ANTLR start "CLOSE_KEYWORD"
    public final void mCLOSE_KEYWORD() throws RecognitionException {
        try {
            int _type = CLOSE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:276:14: ( C L O S E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:276:16: C L O S E
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:277:14: ( T A B L E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:277:16: T A B L E
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:278:11: ( O F )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:278:13: O F
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:279:14: ( I N D E X )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:279:16: I N D E X
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:280:11: ( B Y )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:280:13: B Y
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:281:15: ( V A R R A Y )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:281:17: V A R R A Y
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:282:16: ( V A R Y I N G )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:282:18: V A R Y I N G
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:283:14: ( A R R A Y )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:283:16: A R R A Y
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:284:15: ( C O M M I T )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:284:17: C O M M I T
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:285:12: ( R E F )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:285:14: R E F
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:286:17: ( C O N T I N U E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:286:19: C O N T I N U E
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:287:15: ( C U R S O R )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:287:17: C U R S O R
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:288:15: ( D E L E T E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:288:17: D E L E T E
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:289:16: ( E X E C U T E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:289:18: E X E C U T E
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:290:18: ( I M M E D I A T E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:290:20: I M M E D I A T E
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:291:13: ( E X I T )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:291:15: E X I T
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:292:13: ( I N T O )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:292:15: I N T O
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:293:14: ( U S I N G )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:293:16: U S I N G
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:294:13: ( B U L K )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:294:15: B U L K
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:295:16: ( C O L L E C T )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:295:18: C O L L E C T
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:296:14: ( F E T C H )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:296:16: F E T C H
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:297:14: ( L I M I T )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:297:16: L I M I T
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:298:15: ( F O R A L L )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:298:17: F O R A L L
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:299:13: ( S A V E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:299:15: S A V E
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:300:19: ( E X C E P T I O N S )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:300:21: E X C E P T I O N S
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:301:16: ( I N D I C E S )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:301:18: I N D I C E S
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:302:15: ( V A L U E S )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:302:17: V A L U E S
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:303:16: ( B E T W E E N )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:303:18: B E T W E E N
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:304:15: ( I N L I N E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:304:17: I N L I N E
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:305:15: ( I N S E R T )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:305:17: I N S E R T
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:306:13: ( L O C K )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:306:15: L O C K
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:307:14: ( M E R G E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:307:16: M E R G E
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:308:13: ( O P E N )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:308:15: O P E N
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:309:16: ( P A C K A G E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:309:18: P A C K A G E
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:310:13: ( B O D Y )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:310:15: B O D Y
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:311:28: ( R E S T R I C T '_' R E F E R E N C E S )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:311:30: R E S T R I C T '_' R E F E R E N C E S
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:312:18: ( R E T U R N I N G )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:312:20: R E T U R N I N G
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:313:17: ( R O L L B A C K )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:313:19: R O L L B A C K
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:314:18: ( S A V E P O I N T )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:314:20: S A V E P O I N T
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:315:26: ( S E R I A L L Y '_' R E U S A B L E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:315:28: S E R I A L L Y '_' R E U S A B L E
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:316:12: ( S E T )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:316:14: S E T
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:317:20: ( T R A N S A C T I O N )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:317:22: T R A N S A C T I O N
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:318:17: ( '%' N O T F O U N D )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:318:19: '%' N O T F O U N D
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:319:14: ( '%' F O U N D )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:319:16: '%' F O U N D
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:320:15: ( '%' I S O P E N )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:320:17: '%' I S O P E N
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:321:17: ( '%' R O W C O U N T )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:321:19: '%' R O W C O U N T
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:322:16: ( S Q L C O D E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:322:18: S Q L C O D E
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:323:16: ( S Q L E R R M )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:323:18: S Q L E R R M
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:324:15: ( U P D A T E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:324:17: U P D A T E
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:325:15: ( E X I S T S )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:325:17: E X I S T S
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:326:16: ( T R I G G E R )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:326:18: T R I G G E R
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:327:15: ( B E F O R E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:327:17: B E F O R E
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:328:14: ( A F T E R )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:328:16: A F T E R
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:329:16: ( I N S T E A D )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:329:18: I N S T E A D
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:330:11: ( O N )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:330:13: O N
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:331:15: ( N E S T E D )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:331:17: N E S T E D
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:332:20: ( R E F E R E N C I N G )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:332:22: R E F E R E N C I N G
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:333:12: ( O L D )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:333:14: O L D
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:334:12: ( N E W )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:334:14: N E W
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:335:15: ( P A R E N T )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:335:17: P A R E N T
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:336:13: ( E A C H )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:336:15: E A C H
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:337:12: ( R O W )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:337:14: R O W
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:338:16: ( F O L L O W S )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:338:18: F O L L O W S
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:339:15: ( E N A B L E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:339:17: E N A B L E
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:340:16: ( D I S A B L E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:340:18: D I S A B L E
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:341:12: ( O I D )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:341:14: O I D
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:342:15: ( O B J E C T )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:342:17: O B J E C T
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:343:14: ( U N D E R )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:343:16: U N D E R
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:344:14: ( F I N A L )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:344:16: F I N A L
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:345:21: ( I N S T A N T I A B L E )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:345:23: I N S T A N T I A B L E
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:346:19: ( O V E R R I D I N G )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:346:21: O V E R R I D I N G
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:347:15: ( M E M B E R )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:347:17: M E M B E R
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:348:15: ( S T A T I C )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:348:17: S T A T I C
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:349:20: ( C O N S T R U C T O R )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:349:22: C O N S T R U C T O R
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:350:13: ( S E L F )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:350:15: S E L F
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:351:15: ( R E S U L T )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:351:17: R E S U L T
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:352:12: ( M A P )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:352:14: M A P
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:353:14: ( O R D E R )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:353:16: O R D E R
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:354:13: ( J O I N )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:354:15: J O I N
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

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:357:2: ( '0' .. '9' )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:357:4: '0' .. '9'
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:361:2: ( DIGIT ( DIGIT )* )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:361:4: DIGIT ( DIGIT )*
            {
            mDIGIT(); 
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:361:10: ( DIGIT )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>='0' && LA47_0<='9')) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:361:12: DIGIT
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:365:2: ( E ( '+' | '-' )? DIGITS )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:365:4: E ( '+' | '-' )? DIGITS
            {
            mE(); 
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:365:6: ( '+' | '-' )?
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:368:11: ( ( 'a' | 'A' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:368:12: ( 'a' | 'A' )
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:369:11: ( ( 'b' | 'B' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:369:12: ( 'b' | 'B' )
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:370:11: ( ( 'c' | 'C' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:370:12: ( 'c' | 'C' )
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:371:11: ( ( 'd' | 'D' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:371:12: ( 'd' | 'D' )
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:372:11: ( ( 'e' | 'E' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:372:12: ( 'e' | 'E' )
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:373:11: ( ( 'f' | 'F' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:373:12: ( 'f' | 'F' )
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:374:11: ( ( 'g' | 'G' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:374:12: ( 'g' | 'G' )
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:375:11: ( ( 'h' | 'H' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:375:12: ( 'h' | 'H' )
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:376:11: ( ( 'i' | 'I' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:376:12: ( 'i' | 'I' )
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:377:11: ( ( 'j' | 'J' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:377:12: ( 'j' | 'J' )
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:378:11: ( ( 'k' | 'K' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:378:12: ( 'k' | 'K' )
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:379:11: ( ( 'l' | 'L' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:379:12: ( 'l' | 'L' )
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:380:11: ( ( 'm' | 'M' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:380:12: ( 'm' | 'M' )
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:381:11: ( ( 'n' | 'N' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:381:12: ( 'n' | 'N' )
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:382:11: ( ( 'o' | 'O' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:382:12: ( 'o' | 'O' )
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:383:11: ( ( 'p' | 'P' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:383:12: ( 'p' | 'P' )
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:384:11: ( ( 'q' | 'Q' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:384:12: ( 'q' | 'Q' )
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:385:11: ( ( 'r' | 'R' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:385:12: ( 'r' | 'R' )
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:386:11: ( ( 's' | 'S' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:386:12: ( 's' | 'S' )
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:387:11: ( ( 't' | 'T' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:387:12: ( 't' | 'T' )
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:388:11: ( ( 'u' | 'U' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:388:12: ( 'u' | 'U' )
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:389:11: ( ( 'v' | 'V' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:389:12: ( 'v' | 'V' )
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:390:11: ( ( 'w' | 'W' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:390:12: ( 'w' | 'W' )
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:391:11: ( ( 'x' | 'X' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:391:12: ( 'x' | 'X' )
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:392:11: ( ( 'y' | 'Y' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:392:12: ( 'y' | 'Y' )
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:393:11: ( ( 'z' | 'Z' ) )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:393:12: ( 'z' | 'Z' )
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
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:396:9: ( . )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:396:11: .
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
        // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:8: ( BLOCK_COMMENT | LINE_COMMENT | WHITESPACE | OPERATOR | OR_OPERATOR | AND_OPERATOR | NOT_OPERATOR | NUMBER_UNSIGNED | STRING | SOME_TYPES | SCALE_TYPES | SIZE_TYPES | CHAR_TYPES | CHAR_TYPE | BYTE_TYPE | RAW_TYPE | TIMESTAMP_TYPE | YEAR_TYPE | DAY_TYPE | SECOND_TYPE | KEYWORD | BEGIN_KEYWORD | END_KEYWORD | DECLARE_KEYWORD | EXCEPTION_KEYWORD | WHEN_KEYWORD | THEN_KEYWORD | NOT_NULL_KEYWORD | NULL_KEYWORD | DEFAULT_KEYWORD | ROWTYPE_KEYWORD | LIKE_TYPE_KEYWORD | TYPE_KEYWORD | TRUE_KEYWORD | FALSE_KEYWORD | CONSTANT_KEYWORD | WITH_KEYWORD | LOCAL_KEYWORD | TIME_KEYWORD | ZONE_KEYWORD | INTERVAL_KEYWORD | TO_KEYWORD | MONTH_KEYWORD | SUBTYPE_KEYWORD | IS_KEYWORD | RECORD_KEYWORD | CREATE_KEYWORD | REPLACE_KEYWORD | FUNCTION_KEYWORD | AS_KEYWORD | RETURN_KEYWORD | IN_KEYWORD | OUT_KEYWORD | NOCOPY_KEYWORD | AUTHID_KEYWORD | CURRENT_USER_KEYWORD | DEFINER_KEYWORD | DETERMINISTIC_KEYWORD | PARALLEL_ENABLED_KEYWORD | PIPELINED_KEYWORD | RESULT_CACHE_KEYWORD | PROCEDURE_KEYWORD | IF_KEYWORD | ELSE_KEYWORD | ELSIF_KEYWORD | ENDIF_KEYWORD | IS_NULL_KEYWORD | IS_NOT_NULL_KEYWORD | NOT_IN_KEYWORD | GOTO_KEYWORD | LOOP_KEYWORD | END_LOOP_KEYWORD | WHILE_KEYWORD | FOR_KEYWORD | REVERSE_KEYWORD | SELECT_KEYWORD | COUNT_KEYWORD | EXCEPTION_INIT_KEYWORD | LIKE_KEYWORD | RAISE_KEYWORD | PRAGMA_KEYWORD | AUTONOMOUS_TRANSACTION_KEYWORD | CASE_KEYWORD | END_CASE_KEYWORD | CLOSE_KEYWORD | TABLE_KEYWORD | OF_KEYWORD | INDEX_KEYWORD | BY_KEYWORD | VARRAY_KEYWORD | VARYING_KEYWORD | ARRAY_KEYWORD | COMMIT_KEYWORD | REF_KEYWORD | CONTINUE_KEYWORD | CURSOR_KEYWORD | DELETE_KEYWORD | EXECUTE_KEYWORD | IMMEDIATE_KEYWORD | EXIT_KEYWORD | INTO_KEYWORD | USING_KEYWORD | BULK_KEYWORD | COLLECT_KEYWORD | FETCH_KEYWORD | LIMIT_KEYWORD | FORALL_KEYWORD | SAVE_KEYWORD | EXCEPTIONS_KEYWORD | INDICES_KEYWORD | VALUES_KEYWORD | BETWEEN_KEYWORD | INLINE_KEYWORD | INSERT_KEYWORD | LOCK_KEYWORD | MERGE_KEYWORD | OPEN_KEYWORD | PACKAGE_KEYWORD | BODY_KEYWORD | RESTRICT_REFERENCES_KEYWORD | RETURNING_KEYWORD | ROLLBACK_KEYWORD | SAVEPOINT_KEYWORD | SERIALLY_REUSABLE_KEYWORD | SET_KEYWORD | TRANSACTION_KEYWORD | NOTFOUND_KEYWORD | FOUND_KEYWORD | ISOPEN_KEYWORD | ROWCOUNT_KEYWORD | SQLCODE_KEYWORD | SQLERRM_KEYWORD | UPDATE_KEYWORD | EXISTS_KEYWORD | TRIGGER_KEYWORD | BEFORE_KEYWORD | AFTER_KEYWORD | INSTEAD_KEYWORD | ON_KEYWORD | NESTED_KEYWORD | REFERENCING_KEYWORD | OLD_KEYWORD | NEW_KEYWORD | PARENT_KEYWORD | EACH_KEYWORD | ROW_KEYWORD | FOLLOWS_KEYWORD | ENABLE_KEYWORD | DISABLE_KEYWORD | OID_KEYWORD | OBJECT_KEYWORD | UNDER_KEYWORD | FINAL_KEYWORD | INSTANTIABLE_KEYWORD | OVERRIDING_KEYWORD | MEMBER_KEYWORD | STATIC_KEYWORD | CONSTRUCTOR_KEYWORD | SELF_KEYWORD | RESULT_KEYWORD | MAP_KEYWORD | ORDER_KEYWORD | JOIN_KEYWORD | THE_REST )
        int alt49=164;
        alt49 = dfa49.predict(input);
        switch (alt49) {
            case 1 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:10: BLOCK_COMMENT
                {
                mBLOCK_COMMENT(); 

                }
                break;
            case 2 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:24: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;
            case 3 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:37: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 4 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:48: OPERATOR
                {
                mOPERATOR(); 

                }
                break;
            case 5 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:57: OR_OPERATOR
                {
                mOR_OPERATOR(); 

                }
                break;
            case 6 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:69: AND_OPERATOR
                {
                mAND_OPERATOR(); 

                }
                break;
            case 7 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:82: NOT_OPERATOR
                {
                mNOT_OPERATOR(); 

                }
                break;
            case 8 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:95: NUMBER_UNSIGNED
                {
                mNUMBER_UNSIGNED(); 

                }
                break;
            case 9 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:111: STRING
                {
                mSTRING(); 

                }
                break;
            case 10 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:118: SOME_TYPES
                {
                mSOME_TYPES(); 

                }
                break;
            case 11 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:129: SCALE_TYPES
                {
                mSCALE_TYPES(); 

                }
                break;
            case 12 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:141: SIZE_TYPES
                {
                mSIZE_TYPES(); 

                }
                break;
            case 13 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:152: CHAR_TYPES
                {
                mCHAR_TYPES(); 

                }
                break;
            case 14 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:163: CHAR_TYPE
                {
                mCHAR_TYPE(); 

                }
                break;
            case 15 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:173: BYTE_TYPE
                {
                mBYTE_TYPE(); 

                }
                break;
            case 16 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:183: RAW_TYPE
                {
                mRAW_TYPE(); 

                }
                break;
            case 17 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:192: TIMESTAMP_TYPE
                {
                mTIMESTAMP_TYPE(); 

                }
                break;
            case 18 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:207: YEAR_TYPE
                {
                mYEAR_TYPE(); 

                }
                break;
            case 19 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:217: DAY_TYPE
                {
                mDAY_TYPE(); 

                }
                break;
            case 20 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:226: SECOND_TYPE
                {
                mSECOND_TYPE(); 

                }
                break;
            case 21 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:238: KEYWORD
                {
                mKEYWORD(); 

                }
                break;
            case 22 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:246: BEGIN_KEYWORD
                {
                mBEGIN_KEYWORD(); 

                }
                break;
            case 23 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:260: END_KEYWORD
                {
                mEND_KEYWORD(); 

                }
                break;
            case 24 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:272: DECLARE_KEYWORD
                {
                mDECLARE_KEYWORD(); 

                }
                break;
            case 25 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:288: EXCEPTION_KEYWORD
                {
                mEXCEPTION_KEYWORD(); 

                }
                break;
            case 26 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:306: WHEN_KEYWORD
                {
                mWHEN_KEYWORD(); 

                }
                break;
            case 27 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:319: THEN_KEYWORD
                {
                mTHEN_KEYWORD(); 

                }
                break;
            case 28 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:332: NOT_NULL_KEYWORD
                {
                mNOT_NULL_KEYWORD(); 

                }
                break;
            case 29 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:349: NULL_KEYWORD
                {
                mNULL_KEYWORD(); 

                }
                break;
            case 30 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:362: DEFAULT_KEYWORD
                {
                mDEFAULT_KEYWORD(); 

                }
                break;
            case 31 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:378: ROWTYPE_KEYWORD
                {
                mROWTYPE_KEYWORD(); 

                }
                break;
            case 32 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:394: LIKE_TYPE_KEYWORD
                {
                mLIKE_TYPE_KEYWORD(); 

                }
                break;
            case 33 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:412: TYPE_KEYWORD
                {
                mTYPE_KEYWORD(); 

                }
                break;
            case 34 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:425: TRUE_KEYWORD
                {
                mTRUE_KEYWORD(); 

                }
                break;
            case 35 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:438: FALSE_KEYWORD
                {
                mFALSE_KEYWORD(); 

                }
                break;
            case 36 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:452: CONSTANT_KEYWORD
                {
                mCONSTANT_KEYWORD(); 

                }
                break;
            case 37 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:469: WITH_KEYWORD
                {
                mWITH_KEYWORD(); 

                }
                break;
            case 38 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:482: LOCAL_KEYWORD
                {
                mLOCAL_KEYWORD(); 

                }
                break;
            case 39 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:496: TIME_KEYWORD
                {
                mTIME_KEYWORD(); 

                }
                break;
            case 40 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:509: ZONE_KEYWORD
                {
                mZONE_KEYWORD(); 

                }
                break;
            case 41 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:522: INTERVAL_KEYWORD
                {
                mINTERVAL_KEYWORD(); 

                }
                break;
            case 42 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:539: TO_KEYWORD
                {
                mTO_KEYWORD(); 

                }
                break;
            case 43 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:550: MONTH_KEYWORD
                {
                mMONTH_KEYWORD(); 

                }
                break;
            case 44 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:564: SUBTYPE_KEYWORD
                {
                mSUBTYPE_KEYWORD(); 

                }
                break;
            case 45 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:580: IS_KEYWORD
                {
                mIS_KEYWORD(); 

                }
                break;
            case 46 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:591: RECORD_KEYWORD
                {
                mRECORD_KEYWORD(); 

                }
                break;
            case 47 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:606: CREATE_KEYWORD
                {
                mCREATE_KEYWORD(); 

                }
                break;
            case 48 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:621: REPLACE_KEYWORD
                {
                mREPLACE_KEYWORD(); 

                }
                break;
            case 49 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:637: FUNCTION_KEYWORD
                {
                mFUNCTION_KEYWORD(); 

                }
                break;
            case 50 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:654: AS_KEYWORD
                {
                mAS_KEYWORD(); 

                }
                break;
            case 51 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:665: RETURN_KEYWORD
                {
                mRETURN_KEYWORD(); 

                }
                break;
            case 52 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:680: IN_KEYWORD
                {
                mIN_KEYWORD(); 

                }
                break;
            case 53 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:691: OUT_KEYWORD
                {
                mOUT_KEYWORD(); 

                }
                break;
            case 54 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:703: NOCOPY_KEYWORD
                {
                mNOCOPY_KEYWORD(); 

                }
                break;
            case 55 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:718: AUTHID_KEYWORD
                {
                mAUTHID_KEYWORD(); 

                }
                break;
            case 56 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:733: CURRENT_USER_KEYWORD
                {
                mCURRENT_USER_KEYWORD(); 

                }
                break;
            case 57 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:754: DEFINER_KEYWORD
                {
                mDEFINER_KEYWORD(); 

                }
                break;
            case 58 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:770: DETERMINISTIC_KEYWORD
                {
                mDETERMINISTIC_KEYWORD(); 

                }
                break;
            case 59 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:792: PARALLEL_ENABLED_KEYWORD
                {
                mPARALLEL_ENABLED_KEYWORD(); 

                }
                break;
            case 60 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:817: PIPELINED_KEYWORD
                {
                mPIPELINED_KEYWORD(); 

                }
                break;
            case 61 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:835: RESULT_CACHE_KEYWORD
                {
                mRESULT_CACHE_KEYWORD(); 

                }
                break;
            case 62 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:856: PROCEDURE_KEYWORD
                {
                mPROCEDURE_KEYWORD(); 

                }
                break;
            case 63 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:874: IF_KEYWORD
                {
                mIF_KEYWORD(); 

                }
                break;
            case 64 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:885: ELSE_KEYWORD
                {
                mELSE_KEYWORD(); 

                }
                break;
            case 65 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:898: ELSIF_KEYWORD
                {
                mELSIF_KEYWORD(); 

                }
                break;
            case 66 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:912: ENDIF_KEYWORD
                {
                mENDIF_KEYWORD(); 

                }
                break;
            case 67 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:926: IS_NULL_KEYWORD
                {
                mIS_NULL_KEYWORD(); 

                }
                break;
            case 68 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:942: IS_NOT_NULL_KEYWORD
                {
                mIS_NOT_NULL_KEYWORD(); 

                }
                break;
            case 69 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:962: NOT_IN_KEYWORD
                {
                mNOT_IN_KEYWORD(); 

                }
                break;
            case 70 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:977: GOTO_KEYWORD
                {
                mGOTO_KEYWORD(); 

                }
                break;
            case 71 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:990: LOOP_KEYWORD
                {
                mLOOP_KEYWORD(); 

                }
                break;
            case 72 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1003: END_LOOP_KEYWORD
                {
                mEND_LOOP_KEYWORD(); 

                }
                break;
            case 73 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1020: WHILE_KEYWORD
                {
                mWHILE_KEYWORD(); 

                }
                break;
            case 74 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1034: FOR_KEYWORD
                {
                mFOR_KEYWORD(); 

                }
                break;
            case 75 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1046: REVERSE_KEYWORD
                {
                mREVERSE_KEYWORD(); 

                }
                break;
            case 76 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1062: SELECT_KEYWORD
                {
                mSELECT_KEYWORD(); 

                }
                break;
            case 77 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1077: COUNT_KEYWORD
                {
                mCOUNT_KEYWORD(); 

                }
                break;
            case 78 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1091: EXCEPTION_INIT_KEYWORD
                {
                mEXCEPTION_INIT_KEYWORD(); 

                }
                break;
            case 79 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1114: LIKE_KEYWORD
                {
                mLIKE_KEYWORD(); 

                }
                break;
            case 80 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1127: RAISE_KEYWORD
                {
                mRAISE_KEYWORD(); 

                }
                break;
            case 81 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1141: PRAGMA_KEYWORD
                {
                mPRAGMA_KEYWORD(); 

                }
                break;
            case 82 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1156: AUTONOMOUS_TRANSACTION_KEYWORD
                {
                mAUTONOMOUS_TRANSACTION_KEYWORD(); 

                }
                break;
            case 83 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1187: CASE_KEYWORD
                {
                mCASE_KEYWORD(); 

                }
                break;
            case 84 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1200: END_CASE_KEYWORD
                {
                mEND_CASE_KEYWORD(); 

                }
                break;
            case 85 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1217: CLOSE_KEYWORD
                {
                mCLOSE_KEYWORD(); 

                }
                break;
            case 86 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1231: TABLE_KEYWORD
                {
                mTABLE_KEYWORD(); 

                }
                break;
            case 87 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1245: OF_KEYWORD
                {
                mOF_KEYWORD(); 

                }
                break;
            case 88 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1256: INDEX_KEYWORD
                {
                mINDEX_KEYWORD(); 

                }
                break;
            case 89 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1270: BY_KEYWORD
                {
                mBY_KEYWORD(); 

                }
                break;
            case 90 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1281: VARRAY_KEYWORD
                {
                mVARRAY_KEYWORD(); 

                }
                break;
            case 91 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1296: VARYING_KEYWORD
                {
                mVARYING_KEYWORD(); 

                }
                break;
            case 92 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1312: ARRAY_KEYWORD
                {
                mARRAY_KEYWORD(); 

                }
                break;
            case 93 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1326: COMMIT_KEYWORD
                {
                mCOMMIT_KEYWORD(); 

                }
                break;
            case 94 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1341: REF_KEYWORD
                {
                mREF_KEYWORD(); 

                }
                break;
            case 95 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1353: CONTINUE_KEYWORD
                {
                mCONTINUE_KEYWORD(); 

                }
                break;
            case 96 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1370: CURSOR_KEYWORD
                {
                mCURSOR_KEYWORD(); 

                }
                break;
            case 97 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1385: DELETE_KEYWORD
                {
                mDELETE_KEYWORD(); 

                }
                break;
            case 98 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1400: EXECUTE_KEYWORD
                {
                mEXECUTE_KEYWORD(); 

                }
                break;
            case 99 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1416: IMMEDIATE_KEYWORD
                {
                mIMMEDIATE_KEYWORD(); 

                }
                break;
            case 100 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1434: EXIT_KEYWORD
                {
                mEXIT_KEYWORD(); 

                }
                break;
            case 101 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1447: INTO_KEYWORD
                {
                mINTO_KEYWORD(); 

                }
                break;
            case 102 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1460: USING_KEYWORD
                {
                mUSING_KEYWORD(); 

                }
                break;
            case 103 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1474: BULK_KEYWORD
                {
                mBULK_KEYWORD(); 

                }
                break;
            case 104 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1487: COLLECT_KEYWORD
                {
                mCOLLECT_KEYWORD(); 

                }
                break;
            case 105 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1503: FETCH_KEYWORD
                {
                mFETCH_KEYWORD(); 

                }
                break;
            case 106 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1517: LIMIT_KEYWORD
                {
                mLIMIT_KEYWORD(); 

                }
                break;
            case 107 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1531: FORALL_KEYWORD
                {
                mFORALL_KEYWORD(); 

                }
                break;
            case 108 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1546: SAVE_KEYWORD
                {
                mSAVE_KEYWORD(); 

                }
                break;
            case 109 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1559: EXCEPTIONS_KEYWORD
                {
                mEXCEPTIONS_KEYWORD(); 

                }
                break;
            case 110 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1578: INDICES_KEYWORD
                {
                mINDICES_KEYWORD(); 

                }
                break;
            case 111 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1594: VALUES_KEYWORD
                {
                mVALUES_KEYWORD(); 

                }
                break;
            case 112 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1609: BETWEEN_KEYWORD
                {
                mBETWEEN_KEYWORD(); 

                }
                break;
            case 113 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1625: INLINE_KEYWORD
                {
                mINLINE_KEYWORD(); 

                }
                break;
            case 114 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1640: INSERT_KEYWORD
                {
                mINSERT_KEYWORD(); 

                }
                break;
            case 115 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1655: LOCK_KEYWORD
                {
                mLOCK_KEYWORD(); 

                }
                break;
            case 116 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1668: MERGE_KEYWORD
                {
                mMERGE_KEYWORD(); 

                }
                break;
            case 117 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1682: OPEN_KEYWORD
                {
                mOPEN_KEYWORD(); 

                }
                break;
            case 118 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1695: PACKAGE_KEYWORD
                {
                mPACKAGE_KEYWORD(); 

                }
                break;
            case 119 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1711: BODY_KEYWORD
                {
                mBODY_KEYWORD(); 

                }
                break;
            case 120 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1724: RESTRICT_REFERENCES_KEYWORD
                {
                mRESTRICT_REFERENCES_KEYWORD(); 

                }
                break;
            case 121 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1752: RETURNING_KEYWORD
                {
                mRETURNING_KEYWORD(); 

                }
                break;
            case 122 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1770: ROLLBACK_KEYWORD
                {
                mROLLBACK_KEYWORD(); 

                }
                break;
            case 123 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1787: SAVEPOINT_KEYWORD
                {
                mSAVEPOINT_KEYWORD(); 

                }
                break;
            case 124 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1805: SERIALLY_REUSABLE_KEYWORD
                {
                mSERIALLY_REUSABLE_KEYWORD(); 

                }
                break;
            case 125 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1831: SET_KEYWORD
                {
                mSET_KEYWORD(); 

                }
                break;
            case 126 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1843: TRANSACTION_KEYWORD
                {
                mTRANSACTION_KEYWORD(); 

                }
                break;
            case 127 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1863: NOTFOUND_KEYWORD
                {
                mNOTFOUND_KEYWORD(); 

                }
                break;
            case 128 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1880: FOUND_KEYWORD
                {
                mFOUND_KEYWORD(); 

                }
                break;
            case 129 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1894: ISOPEN_KEYWORD
                {
                mISOPEN_KEYWORD(); 

                }
                break;
            case 130 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1909: ROWCOUNT_KEYWORD
                {
                mROWCOUNT_KEYWORD(); 

                }
                break;
            case 131 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1926: SQLCODE_KEYWORD
                {
                mSQLCODE_KEYWORD(); 

                }
                break;
            case 132 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1942: SQLERRM_KEYWORD
                {
                mSQLERRM_KEYWORD(); 

                }
                break;
            case 133 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1958: UPDATE_KEYWORD
                {
                mUPDATE_KEYWORD(); 

                }
                break;
            case 134 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1973: EXISTS_KEYWORD
                {
                mEXISTS_KEYWORD(); 

                }
                break;
            case 135 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:1988: TRIGGER_KEYWORD
                {
                mTRIGGER_KEYWORD(); 

                }
                break;
            case 136 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2004: BEFORE_KEYWORD
                {
                mBEFORE_KEYWORD(); 

                }
                break;
            case 137 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2019: AFTER_KEYWORD
                {
                mAFTER_KEYWORD(); 

                }
                break;
            case 138 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2033: INSTEAD_KEYWORD
                {
                mINSTEAD_KEYWORD(); 

                }
                break;
            case 139 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2049: ON_KEYWORD
                {
                mON_KEYWORD(); 

                }
                break;
            case 140 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2060: NESTED_KEYWORD
                {
                mNESTED_KEYWORD(); 

                }
                break;
            case 141 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2075: REFERENCING_KEYWORD
                {
                mREFERENCING_KEYWORD(); 

                }
                break;
            case 142 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2095: OLD_KEYWORD
                {
                mOLD_KEYWORD(); 

                }
                break;
            case 143 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2107: NEW_KEYWORD
                {
                mNEW_KEYWORD(); 

                }
                break;
            case 144 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2119: PARENT_KEYWORD
                {
                mPARENT_KEYWORD(); 

                }
                break;
            case 145 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2134: EACH_KEYWORD
                {
                mEACH_KEYWORD(); 

                }
                break;
            case 146 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2147: ROW_KEYWORD
                {
                mROW_KEYWORD(); 

                }
                break;
            case 147 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2159: FOLLOWS_KEYWORD
                {
                mFOLLOWS_KEYWORD(); 

                }
                break;
            case 148 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2175: ENABLE_KEYWORD
                {
                mENABLE_KEYWORD(); 

                }
                break;
            case 149 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2190: DISABLE_KEYWORD
                {
                mDISABLE_KEYWORD(); 

                }
                break;
            case 150 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2206: OID_KEYWORD
                {
                mOID_KEYWORD(); 

                }
                break;
            case 151 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2218: OBJECT_KEYWORD
                {
                mOBJECT_KEYWORD(); 

                }
                break;
            case 152 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2233: UNDER_KEYWORD
                {
                mUNDER_KEYWORD(); 

                }
                break;
            case 153 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2247: FINAL_KEYWORD
                {
                mFINAL_KEYWORD(); 

                }
                break;
            case 154 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2261: INSTANTIABLE_KEYWORD
                {
                mINSTANTIABLE_KEYWORD(); 

                }
                break;
            case 155 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2282: OVERRIDING_KEYWORD
                {
                mOVERRIDING_KEYWORD(); 

                }
                break;
            case 156 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2301: MEMBER_KEYWORD
                {
                mMEMBER_KEYWORD(); 

                }
                break;
            case 157 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2316: STATIC_KEYWORD
                {
                mSTATIC_KEYWORD(); 

                }
                break;
            case 158 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2331: CONSTRUCTOR_KEYWORD
                {
                mCONSTRUCTOR_KEYWORD(); 

                }
                break;
            case 159 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2351: SELF_KEYWORD
                {
                mSELF_KEYWORD(); 

                }
                break;
            case 160 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2364: RESULT_KEYWORD
                {
                mRESULT_KEYWORD(); 

                }
                break;
            case 161 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2379: MAP_KEYWORD
                {
                mMAP_KEYWORD(); 

                }
                break;
            case 162 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2391: ORDER_KEYWORD
                {
                mORDER_KEYWORD(); 

                }
                break;
            case 163 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2405: JOIN_KEYWORD
                {
                mJOIN_KEYWORD(); 

                }
                break;
            case 164 :
                // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:2418: THE_REST
                {
                mTHE_REST(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA49 dfa49 = new DFA49(this);
    static final String DFA5_eotS =
        "\4\uffff\1\21\3\uffff\1\25\3\uffff\1\30\1\uffff\1\32\14\uffff";
    static final String DFA5_eofS =
        "\33\uffff";
    static final String DFA5_minS =
        "\1\41\3\uffff\1\52\3\uffff\1\74\3\uffff\1\75\1\uffff\1\53\14\uffff";
    static final String DFA5_maxS =
        "\1\176\3\uffff\1\52\3\uffff\1\76\3\uffff\1\76\1\uffff\1\53\14\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\7\1\10\1\uffff\1\12\1\13\1\14"+
        "\1\uffff\1\21\1\uffff\1\24\1\6\1\4\1\11\1\17\1\25\1\16\1\20\1\26"+
        "\1\15\1\22\1\23";
    static final String DFA5_specialS =
        "\33\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\11\6\uffff\1\16\1\17\1\4\1\2\1\uffff\1\3\1\15\1\5\12\uffff"+
            "\1\1\1\uffff\1\10\1\7\1\14\37\uffff\1\13\35\uffff\1\6\1\uffff"+
            "\1\12",
            "",
            "",
            "",
            "\1\20",
            "",
            "",
            "",
            "\1\24\1\23\1\22",
            "",
            "",
            "",
            "\1\26\1\27",
            "",
            "\1\31",
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
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "131:1: OPERATOR : ( ':=' | '+' | '-' | '*' | '/' | '**' | '||' | '=' | '<>' | '!=' | '~=' | '^=' | '>' | '<' | '<=' | '>=' | '..' | '(+)' | '(' | ')' | '<<' | '>>' );";
        }
    }
    static final String DFA12_eotS =
        "\36\uffff\1\43\7\uffff\1\52\10\uffff\1\62\4\uffff\1\70\5\uffff";
    static final String DFA12_eofS =
        "\72\uffff";
    static final String DFA12_minS =
        "\1\102\1\101\1\114\1\111\1\116\1\106\1\105\1\117\4\uffff\1\124"+
        "\2\uffff\1\123\1\107\1\uffff\1\124\1\116\5\uffff\1\116\1\125\1\111"+
        "\2\uffff\1\105\1\101\1\107\1\122\1\124\2\uffff\1\122\1\11\1\101"+
        "\1\111\1\131\2\uffff\1\114\1\126\1\137\1\116\1\105\1\104\2\uffff"+
        "\1\116\5\uffff";
    static final String DFA12_maxS =
        "\1\165\1\143\1\157\1\155\1\156\3\157\4\uffff\1\164\2\uffff\1\163"+
        "\1\155\1\uffff\1\164\1\156\5\uffff\1\156\1\165\1\151\2\uffff\1\145"+
        "\1\141\1\147\1\162\1\164\2\uffff\1\162\1\40\1\141\1\151\1\171\2"+
        "\uffff\1\154\1\166\1\137\1\156\1\145\1\151\2\uffff\1\156\5\uffff";
    static final String DFA12_acceptS =
        "\10\uffff\1\22\1\24\1\25\1\30\1\uffff\1\31\1\2\2\uffff\1\12\2\uffff"+
        "\1\26\1\23\1\27\1\21\1\14\3\uffff\1\6\1\7\5\uffff\1\10\1\11\5\uffff"+
        "\1\17\1\20\6\uffff\1\1\1\3\1\uffff\1\15\1\13\1\16\1\4\1\5";
    static final String DFA12_specialS =
        "\72\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\5\1\13\1\12\4\uffff\1\4\2\uffff\1\7\1\11\1\1\1\uffff\1\2"+
            "\1\uffff\1\6\1\3\1\uffff\1\10\14\uffff\1\5\1\13\1\12\4\uffff"+
            "\1\4\2\uffff\1\7\1\11\1\1\1\uffff\1\2\1\uffff\1\6\1\3\1\uffff"+
            "\1\10",
            "\1\14\1\uffff\1\15\35\uffff\1\14\1\uffff\1\15",
            "\1\16\2\uffff\1\17\34\uffff\1\16\2\uffff\1\17",
            "\1\20\3\uffff\1\21\33\uffff\1\20\3\uffff\1\21",
            "\1\22\37\uffff\1\22",
            "\1\24\2\uffff\1\23\2\uffff\1\26\2\uffff\1\25\26\uffff\1\24"+
            "\2\uffff\1\23\2\uffff\1\26\2\uffff\1\25",
            "\1\30\11\uffff\1\27\25\uffff\1\30\11\uffff\1\27",
            "\1\31\37\uffff\1\31",
            "",
            "",
            "",
            "",
            "\1\32\37\uffff\1\32",
            "",
            "",
            "\1\33\37\uffff\1\33",
            "\1\34\5\uffff\1\35\31\uffff\1\34\5\uffff\1\35",
            "",
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
            return "155:1: SOME_TYPES : ( N A T U R A L | P L S '_' I N T E G E R | N A T U R A L N | P O S I T I V E | P O S I T I V E N | S I G N T Y P E | S I M P L E '_' I N T E G E R | I N T | I N T E G E R | S M A L L I N T | B I N A R Y '_' I N T E G E R | R E A L | B I N A R Y '_' D O U B L E | B I N A R Y '_' F L O A T | L O N G | L O N G ( ' ' | '\\t' | '\\n' | '\\r' )+ R A W | R O W I D | U R O W I D | B O O L E A N | M L S L A B E L | D A T E | B F I L E | B L O B | C L O B | N C L O B );";
        }
    }
    static final String DFA13_eotS =
        "\6\uffff\1\11\4\uffff";
    static final String DFA13_eofS =
        "\13\uffff";
    static final String DFA13_minS =
        "\1\104\1\125\1\105\1\115\1\103\1\102\1\111\4\uffff";
    static final String DFA13_maxS =
        "\1\156\1\165\1\145\1\155\1\143\1\145\1\151\4\uffff";
    static final String DFA13_acceptS =
        "\7\uffff\1\1\1\4\1\2\1\3";
    static final String DFA13_specialS =
        "\13\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\2\11\uffff\1\1\25\uffff\1\2\11\uffff\1\1",
            "\1\3\37\uffff\1\3",
            "\1\4\37\uffff\1\4",
            "\1\5\37\uffff\1\5",
            "\1\6\37\uffff\1\6",
            "\1\7\2\uffff\1\10\34\uffff\1\7\2\uffff\1\10",
            "\1\12\37\uffff\1\12",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "164:4: ( N U M B E R | D E C | D E C I M A L | N U M E R I C )";
        }
    }
    static final String DFA17_eotS =
        "\1\2\7\uffff";
    static final String DFA17_eofS =
        "\10\uffff";
    static final String DFA17_minS =
        "\1\50\1\53\1\uffff\1\60\2\51\2\uffff";
    static final String DFA17_maxS =
        "\1\50\1\71\1\uffff\3\71\2\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\3\3\uffff\1\1\1\2";
    static final String DFA17_specialS =
        "\10\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1",
            "\1\3\4\uffff\12\4",
            "",
            "\12\4",
            "\1\6\2\uffff\1\7\3\uffff\12\5",
            "\1\6\2\uffff\1\7\3\uffff\12\5",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "165:3: ( ( '(' ( '+' )? DIGITS ')' ) | ( '(' ( '+' )? DIGITS ',' ( '+' | '-' )? DIGITS ')' ) )?";
        }
    }
    static final String DFA22_eotS =
        "\12\uffff\1\13\2\uffff";
    static final String DFA22_eofS =
        "\15\uffff";
    static final String DFA22_minS =
        "\1\116\1\101\1\103\1\122\2\uffff\1\103\1\110\1\101\1\122\1\62\2"+
        "\uffff";
    static final String DFA22_maxS =
        "\1\166\1\141\1\166\1\162\2\uffff\1\143\1\150\1\141\1\162\1\62\2"+
        "\uffff";
    static final String DFA22_acceptS =
        "\4\uffff\1\4\1\3\5\uffff\1\1\1\2";
    static final String DFA22_specialS =
        "\15\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\2\7\uffff\1\1\27\uffff\1\2\7\uffff\1\1",
            "\1\3\37\uffff\1\3",
            "\1\5\22\uffff\1\4\14\uffff\1\5\22\uffff\1\4",
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

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "174:1: CHAR_TYPES : ( V A R C H A R | V A R C H A R '2' | N C H A R | N V A R C H A R '2' );";
        }
    }
    static final String DFA38_eotS =
        "\35\uffff\1\40\5\uffff\1\45\10\uffff";
    static final String DFA38_eofS =
        "\54\uffff";
    static final String DFA38_minS =
        "\1\56\6\uffff\2\117\1\116\1\uffff\1\111\1\114\1\uffff\1\116\2\uffff"+
        "\1\111\1\uffff\1\114\2\uffff\1\116\1\117\1\124\1\105\1\116\1\111"+
        "\1\103\1\11\1\123\1\124\2\uffff\1\105\1\137\1\124\2\uffff\2\11\3"+
        "\uffff";
    static final String DFA38_maxS =
        "\1\167\6\uffff\1\157\1\164\1\156\1\uffff\1\165\1\156\1\uffff\1"+
        "\156\2\uffff\1\151\1\uffff\1\154\2\uffff\1\156\1\157\1\164\1\145"+
        "\1\156\1\151\1\143\1\40\1\163\1\164\2\uffff\1\145\1\137\1\164\2"+
        "\uffff\1\40\1\165\3\uffff";
    static final String DFA38_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\3\uffff\1\14\2\uffff\1\24\1\uffff"+
        "\1\22\1\11\1\uffff\1\15\1\uffff\1\23\1\21\12\uffff\1\12\1\13\3\uffff"+
        "\1\10\1\7\2\uffff\1\20\1\16\1\17";
    static final String DFA38_specialS =
        "\54\uffff}>";
    static final String[] DFA38_transitionS = {
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
            "\1\22\13\uffff\1\23\23\uffff\1\22\13\uffff\1\23",
            "\1\24\1\uffff\1\25\35\uffff\1\24\1\uffff\1\25",
            "",
            "\1\26\37\uffff\1\26",
            "",
            "",
            "\1\27\37\uffff\1\27",
            "",
            "\1\30\37\uffff\1\30",
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
            "\2\50\2\uffff\1\50\22\uffff\1\50\44\uffff\1\52\3\uffff\1\53"+
            "\13\uffff\1\51\17\uffff\1\52\3\uffff\1\53\13\uffff\1\51",
            "",
            "",
            ""
    };

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "205:1: KEYWORD : ( '.' | F R O M | W H E R E | G R O U P ( ' ' | '\\t' | '\\n' | '\\r' )+ B Y | O R D E R ( ' ' | '\\t' | '\\n' | '\\r' )+ B Y | P R I O R | C O N N E C T '_' B Y '_' R O O T | C O N N E C T | S T A R T | U N I O N | U N I O N ( ' ' | '\\t' | '\\n' | '\\r' )+ A L L | I N T E R S E C T | M I N U S | M U L T I S E T ( ' ' | '\\t' | '\\n' | '\\r' )+ E X C E P T | M U L T I S E T ( ' ' | '\\t' | '\\n' | '\\r' )+ I N T E R S E C T | M U L T I S E T ( ' ' | '\\t' | '\\n' | '\\r' )+ U N I O N | A N Y | S O M E | A L L | E S C A P E );";
        }
    }
    static final String DFA49_eotS =
        "\1\uffff\2\54\1\uffff\1\52\2\uffff\1\52\2\uffff\3\52\1\uffff\1"+
        "\60\2\uffff\3\52\1\uffff\25\52\7\uffff\1\u0086\34\uffff\1\u009b"+
        "\1\u00a0\4\uffff\1\u00a6\67\uffff\1\u00d8\17\uffff\1\101\17\uffff"+
        "\1\u00ec\2\uffff\1\u00ee\12\uffff\1\u008b\12\uffff\1\u00f9\13\uffff"+
        "\1\u0102\14\uffff\1\u010a\36\uffff\1\u0114\11\uffff\1\u011c\26\uffff"+
        "\1\u0123\1\u0125\11\uffff\1\u012a\3\uffff";
    static final String DFA49_eofS =
        "\u012d\uffff";
    static final String DFA49_minS =
        "\1\0\1\52\1\55\1\uffff\1\75\2\uffff\1\174\2\uffff\3\75\1\uffff"+
        "\1\56\2\uffff\1\102\1\106\1\101\1\uffff\1\0\2\101\1\106\1\105\1"+
        "\101\1\111\1\116\6\101\1\105\1\110\1\117\1\101\1\106\2\117\7\uffff"+
        "\1\104\10\uffff\1\104\1\uffff\1\124\2\uffff\1\114\1\103\1\uffff"+
        "\1\110\1\123\2\uffff\1\103\1\uffff\1\101\1\103\1\126\1\114\1\101"+
        "\1\uffff\1\104\1\11\2\uffff\1\104\1\106\1\124\1\uffff\1\101\1\114"+
        "\1\111\1\103\1\113\1\104\2\uffff\1\115\2\uffff\1\103\2\uffff\1\124"+
        "\1\114\1\122\1\117\3\uffff\1\114\4\uffff\1\114\1\uffff\1\101\2\uffff"+
        "\1\115\2\uffff\1\105\2\uffff\1\103\1\101\1\123\5\uffff\1\117\3\uffff"+
        "\1\105\1\uffff\1\110\2\uffff\1\11\3\uffff\1\101\5\uffff\1\105\1"+
        "\uffff\1\105\1\103\1\122\1\uffff\3\105\2\uffff\1\11\6\uffff\1\124"+
        "\1\uffff\1\125\1\uffff\1\105\2\uffff\1\111\2\uffff\1\101\7\uffff"+
        "\1\114\1\uffff\1\101\4\uffff\1\116\1\122\1\102\1\uffff\1\101\1\103"+
        "\4\uffff\1\105\1\116\1\uffff\1\105\1\uffff\1\123\1\40\1\uffff\1"+
        "\105\1\127\1\122\3\uffff\1\11\4\uffff\1\120\4\uffff\1\107\2\uffff"+
        "\1\101\1\uffff\1\117\1\uffff\1\114\1\122\10\uffff\1\124\10\uffff"+
        "\1\123\1\uffff\1\120\3\uffff\1\40\2\uffff\1\103\1\11\4\uffff\1\123"+
        "\4\uffff\1\124\1\116\1\101\2\uffff\1\124\7\uffff\1\137\1\111\2\uffff"+
        "\1\111\4\uffff\1\117\1\116\1\123\3\uffff";
    static final String DFA49_maxS =
        "\1\uffff\1\52\1\55\1\uffff\1\75\2\uffff\1\174\2\uffff\3\75\1\uffff"+
        "\1\71\2\uffff\1\166\1\165\1\166\1\uffff\1\uffff\1\162\1\165\1\163"+
        "\1\171\2\157\1\163\1\165\1\157\2\165\1\141\1\171\1\145\1\151\1\162"+
        "\1\170\1\164\2\157\7\uffff\1\144\10\uffff\1\171\1\uffff\1\164\2"+
        "\uffff\1\155\1\164\1\uffff\1\154\1\167\2\uffff\1\162\1\uffff\1\157"+
        "\1\164\1\166\1\154\1\141\1\uffff\1\164\1\40\2\uffff\1\157\2\164"+
        "\1\uffff\1\166\2\167\1\157\1\155\1\151\2\uffff\1\162\2\uffff\1\164"+
        "\2\uffff\1\171\1\165\1\162\1\157\3\uffff\1\162\4\uffff\1\162\1\uffff"+
        "\1\165\2\uffff\1\155\2\uffff\1\151\2\uffff\1\151\1\144\1\163\5\uffff"+
        "\1\157\3\uffff\1\145\1\uffff\1\157\2\uffff\1\40\3\uffff\1\145\5"+
        "\uffff\1\146\1\uffff\2\145\1\164\1\uffff\1\157\1\151\1\164\2\uffff"+
        "\1\156\6\uffff\1\165\1\uffff\1\165\1\uffff\1\145\2\uffff\1\151\2"+
        "\uffff\1\153\7\uffff\1\154\1\uffff\1\151\4\uffff\1\164\2\163\1\uffff"+
        "\1\141\1\171\4\uffff\1\145\1\162\1\uffff\1\145\1\uffff\1\164\1\40"+
        "\1\uffff\1\151\1\167\1\162\3\uffff\1\156\4\uffff\1\160\4\uffff\1"+
        "\162\2\uffff\1\145\1\uffff\1\165\1\uffff\1\154\1\162\10\uffff\1"+
        "\164\10\uffff\1\163\1\uffff\1\160\3\uffff\1\154\2\uffff\1\164\1"+
        "\40\4\uffff\1\166\4\uffff\1\164\1\156\1\162\2\uffff\1\164\7\uffff"+
        "\1\137\1\151\2\uffff\1\151\4\uffff\1\157\1\156\1\163\3\uffff";
    static final String DFA49_acceptS =
        "\3\uffff\1\3\1\uffff\2\4\1\uffff\2\4\3\uffff\1\4\1\uffff\2\4\3"+
        "\uffff\1\10\25\uffff\1\u00a4\1\1\1\4\1\2\1\3\1\10\1\25\1\uffff\1"+
        "\127\1\165\1\u008e\1\u0097\1\u008b\1\u009b\1\u0096\1\65\1\uffff"+
        "\1\u0089\1\uffff\1\62\1\134\2\uffff\1\12\2\uffff\1\15\1\11\1\uffff"+
        "\1\74\5\uffff\1\54\2\uffff\1\77\1\143\3\uffff\1\147\6\uffff\1\146"+
        "\1\u0085\1\uffff\1\u00a1\1\53\1\uffff\1\u0095\1\14\4\uffff\1\57"+
        "\1\123\1\16\1\uffff\1\151\1\u0099\1\43\1\61\1\uffff\1\41\1\uffff"+
        "\1\33\1\52\1\uffff\1\126\1\22\1\uffff\1\45\1\106\3\uffff\1\u0091"+
        "\1\u0081\1\177\1\40\1\u0080\1\uffff\1\50\1\u00a3\1\5\1\uffff\1\6"+
        "\1\uffff\1\35\1\13\1\uffff\1\66\1\u008f\1\u008c\1\uffff\1\166\1"+
        "\76\1\121\1\175\1\24\1\uffff\1\174\3\uffff\1\64\3\uffff\1\161\1"+
        "\55\1\uffff\1\167\1\u0088\1\160\1\26\1\131\1\17\1\uffff\1\60\1\uffff"+
        "\1\56\1\uffff\1\113\1\172\1\uffff\1\120\1\20\1\uffff\1\107\1\152"+
        "\1\117\1\u0098\1\u009c\1\164\1\141\1\uffff\1\72\1\uffff\1\23\1\135"+
        "\1\150\1\115\3\uffff\1\u0093\2\uffff\1\157\1\176\1\u0087\1\42\2"+
        "\uffff\1\111\1\uffff\1\142\2\uffff\1\u0094\3\uffff\1\122\1\67\1"+
        "\7\1\uffff\1\u0090\1\73\1\u009f\1\114\1\uffff\1\u0084\1\u0083\1"+
        "\u009d\1\145\1\uffff\1\130\1\156\1\uffff\1\162\1\uffff\1\170\2\uffff"+
        "\1\136\1\u008d\1\u0092\1\163\1\46\1\30\1\36\1\71\1\uffff\1\137\1"+
        "\140\1\70\1\125\1\112\1\153\1\133\1\132\1\uffff\1\32\1\uffff\1\u0086"+
        "\1\144\1\27\1\uffff\1\101\1\100\2\uffff\1\34\1\105\1\154\1\173\1"+
        "\uffff\1\u009a\1\u008a\1\104\1\103\3\uffff\1\47\1\21\1\uffff\1\102"+
        "\1\110\1\124\1\u0082\1\37\1\u00a2\1\51\2\uffff\1\44\1\u009e\1\uffff"+
        "\1\u00a0\1\75\1\63\1\171\3\uffff\1\31\1\155\1\116";
    static final String DFA49_specialS =
        "\1\1\24\uffff\1\0\u0117\uffff}>";
    static final String[] DFA49_transitionS = {
            "\11\52\2\3\2\52\1\3\22\52\1\3\1\12\3\52\1\47\1\52\1\25\1\17"+
            "\1\20\1\6\1\5\1\52\1\2\1\16\1\1\12\24\1\4\1\52\1\11\1\10\1\15"+
            "\2\52\1\22\1\31\1\37\1\36\1\46\1\40\1\45\1\52\1\30\1\51\1\52"+
            "\1\33\1\35\1\23\1\21\1\26\1\52\1\32\1\27\1\42\1\34\1\41\1\44"+
            "\1\52\1\43\1\50\3\52\1\14\2\52\1\22\1\31\1\37\1\36\1\46\1\40"+
            "\1\45\1\52\1\30\1\51\1\52\1\33\1\35\1\23\1\21\1\26\1\52\1\32"+
            "\1\27\1\42\1\34\1\41\1\44\1\52\1\43\1\50\1\52\1\7\1\52\1\13"+
            "\uff81\52",
            "\1\53",
            "\1\55",
            "",
            "\1\54",
            "",
            "",
            "\1\54",
            "",
            "",
            "\1\54",
            "\1\54",
            "\1\54",
            "",
            "\1\54\1\uffff\12\57",
            "",
            "",
            "\1\65\3\uffff\1\62\2\uffff\1\70\2\uffff\1\64\1\uffff\1\66"+
            "\1\uffff\1\63\1\uffff\1\61\2\uffff\1\71\1\67\13\uffff\1\65\3"+
            "\uffff\1\62\2\uffff\1\70\2\uffff\1\64\1\uffff\1\66\1\uffff\1"+
            "\63\1\uffff\1\61\2\uffff\1\71\1\67",
            "\1\73\5\uffff\1\60\1\uffff\1\72\3\uffff\1\76\1\75\1\uffff"+
            "\1\74\20\uffff\1\73\5\uffff\1\60\1\uffff\1\72\3\uffff\1\76\1"+
            "\75\1\uffff\1\74",
            "\1\101\1\uffff\1\102\1\uffff\1\103\11\uffff\1\100\5\uffff"+
            "\1\77\1\104\12\uffff\1\101\1\uffff\1\102\1\uffff\1\103\11\uffff"+
            "\1\100\5\uffff\1\77\1\104",
            "",
            "\0\105",
            "\1\106\7\uffff\1\107\2\uffff\1\101\2\uffff\1\101\2\uffff\1"+
            "\110\16\uffff\1\106\7\uffff\1\107\2\uffff\1\101\2\uffff\1\101"+
            "\2\uffff\1\110",
            "\1\112\3\uffff\1\111\3\uffff\1\101\3\uffff\1\101\1\uffff\1"+
            "\60\1\uffff\1\113\2\uffff\1\114\1\115\13\uffff\1\112\3\uffff"+
            "\1\111\3\uffff\1\101\3\uffff\1\101\1\uffff\1\60\1\uffff\1\113"+
            "\2\uffff\1\114\1\115",
            "\1\120\6\uffff\1\121\1\116\4\uffff\1\117\22\uffff\1\120\6"+
            "\uffff\1\121\1\116\4\uffff\1\117",
            "\1\123\1\101\2\uffff\1\101\2\uffff\1\101\2\uffff\1\122\5\uffff"+
            "\1\125\3\uffff\1\124\13\uffff\1\123\1\101\2\uffff\1\101\2\uffff"+
            "\1\101\2\uffff\1\122\5\uffff\1\125\3\uffff\1\124",
            "\1\130\3\uffff\1\126\11\uffff\1\127\21\uffff\1\130\3\uffff"+
            "\1\126\11\uffff\1\127",
            "\1\132\5\uffff\1\131\31\uffff\1\132\5\uffff\1\131",
            "\1\133\1\uffff\1\135\1\uffff\1\101\1\134\32\uffff\1\133\1"+
            "\uffff\1\135\1\uffff\1\101\1\134",
            "\1\137\3\uffff\1\136\3\uffff\1\60\2\uffff\1\101\2\uffff\1"+
            "\140\5\uffff\1\60\13\uffff\1\137\3\uffff\1\136\3\uffff\1\60"+
            "\2\uffff\1\101\2\uffff\1\140\5\uffff\1\60",
            "\1\144\3\uffff\1\141\3\uffff\1\142\5\uffff\1\143\21\uffff"+
            "\1\144\3\uffff\1\141\3\uffff\1\142\5\uffff\1\143",
            "\1\151\6\uffff\1\152\3\uffff\1\147\2\uffff\1\145\2\uffff\1"+
            "\150\2\uffff\1\146\13\uffff\1\151\6\uffff\1\152\3\uffff\1\147"+
            "\2\uffff\1\145\2\uffff\1\150\2\uffff\1\146",
            "\1\156\3\uffff\1\154\3\uffff\1\155\2\uffff\1\143\2\uffff\1"+
            "\153\2\uffff\1\60\2\uffff\1\157\13\uffff\1\156\3\uffff\1\154"+
            "\3\uffff\1\155\2\uffff\1\143\2\uffff\1\153\2\uffff\1\60\2\uffff"+
            "\1\157",
            "\1\160\37\uffff\1\160",
            "\1\166\6\uffff\1\163\1\165\5\uffff\1\164\2\uffff\1\162\6\uffff"+
            "\1\161\7\uffff\1\166\6\uffff\1\163\1\165\5\uffff\1\164\2\uffff"+
            "\1\162\6\uffff\1\161",
            "\1\167\37\uffff\1\167",
            "\1\170\1\171\36\uffff\1\170\1\171",
            "\1\172\2\uffff\1\60\34\uffff\1\172\2\uffff\1\60",
            "\1\176\12\uffff\1\175\1\uffff\1\174\4\uffff\1\60\4\uffff\1"+
            "\173\10\uffff\1\176\12\uffff\1\175\1\uffff\1\174\4\uffff\1\60"+
            "\4\uffff\1\173",
            "\1\u0082\2\uffff\1\177\4\uffff\1\u0080\3\uffff\1\u0083\1\uffff"+
            "\1\u0081\21\uffff\1\u0082\2\uffff\1\177\4\uffff\1\u0080\3\uffff"+
            "\1\u0083\1\uffff\1\u0081",
            "\1\u0084\37\uffff\1\u0084",
            "\1\u0085\37\uffff\1\u0085",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0087\37\uffff\1\u0087",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0088\24\uffff\1\60\12\uffff\1\u0088\24\uffff\1\60",
            "",
            "\1\u0089\37\uffff\1\u0089",
            "",
            "",
            "\1\u008a\1\u008b\36\uffff\1\u008a\1\u008b",
            "\1\u008d\20\uffff\1\u008c\16\uffff\1\u008d\20\uffff\1\u008c",
            "",
            "\1\104\3\uffff\1\101\33\uffff\1\104\3\uffff\1\101",
            "\1\u008f\3\uffff\1\u008e\33\uffff\1\u008f\3\uffff\1\u008e",
            "",
            "",
            "\1\u0091\16\uffff\1\u0090\20\uffff\1\u0091\16\uffff\1\u0090",
            "",
            "\1\u0093\7\uffff\1\60\5\uffff\1\u0092\21\uffff\1\u0093\7\uffff"+
            "\1\60\5\uffff\1\u0092",
            "\1\u0095\10\uffff\1\u0096\5\uffff\1\u0097\1\uffff\1\u0094"+
            "\16\uffff\1\u0095\10\uffff\1\u0096\5\uffff\1\u0097\1\uffff\1"+
            "\u0094",
            "\1\u0098\37\uffff\1\u0098",
            "\1\u0099\37\uffff\1\u0099",
            "\1\u009a\37\uffff\1\u009a",
            "",
            "\1\u009d\7\uffff\1\u009f\6\uffff\1\u009e\1\u009c\17\uffff"+
            "\1\u009d\7\uffff\1\u009f\6\uffff\1\u009e\1\u009c",
            "\2\u00a1\2\uffff\1\u00a1\22\uffff\1\u00a1",
            "",
            "",
            "\1\u00a2\12\uffff\1\101\24\uffff\1\u00a2\12\uffff\1\101",
            "\1\u00a3\1\u00a5\14\uffff\1\u00a4\21\uffff\1\u00a3\1\u00a5"+
            "\14\uffff\1\u00a4",
            "\1\u00a7\37\uffff\1\u00a7",
            "",
            "\1\101\1\uffff\1\u00ab\2\uffff\1\u00ac\11\uffff\1\u00a9\2"+
            "\uffff\1\u00a8\1\u00aa\1\uffff\1\u00ad\12\uffff\1\101\1\uffff"+
            "\1\u00ab\2\uffff\1\u00ac\11\uffff\1\u00a9\2\uffff\1\u00a8\1"+
            "\u00aa\1\uffff\1\u00ad",
            "\1\u00ae\12\uffff\1\u00af\24\uffff\1\u00ae\12\uffff\1\u00af",
            "\1\u00b0\15\uffff\1\u00b1\21\uffff\1\u00b0\15\uffff\1\u00b1",
            "\1\u00b2\12\uffff\1\101\1\u00b3\23\uffff\1\u00b2\12\uffff"+
            "\1\101\1\u00b3",
            "\1\u00b5\1\uffff\1\u00b4\35\uffff\1\u00b5\1\uffff\1\u00b4",
            "\1\u00b6\4\uffff\1\60\32\uffff\1\u00b6\4\uffff\1\60",
            "",
            "",
            "\1\u00b7\4\uffff\1\u00b8\32\uffff\1\u00b7\4\uffff\1\u00b8",
            "",
            "",
            "\1\u00ba\2\uffff\1\u00bc\5\uffff\1\u00b9\7\uffff\1\u00bb\16"+
            "\uffff\1\u00ba\2\uffff\1\u00bc\5\uffff\1\u00b9\7\uffff\1\u00bb",
            "",
            "",
            "\1\101\4\uffff\1\u00bd\32\uffff\1\101\4\uffff\1\u00bd",
            "\1\u00bf\1\u00be\1\u00c1\6\uffff\1\u00c0\26\uffff\1\u00bf"+
            "\1\u00be\1\u00c1\6\uffff\1\u00c0",
            "\1\u00c2\37\uffff\1\u00c2",
            "\1\u00c3\37\uffff\1\u00c3",
            "",
            "",
            "",
            "\1\u00c4\5\uffff\1\u00c5\31\uffff\1\u00c4\5\uffff\1\u00c5",
            "",
            "",
            "",
            "",
            "\1\u00c7\5\uffff\1\u00c6\31\uffff\1\u00c7\5\uffff\1\u00c6",
            "",
            "\1\u00c8\7\uffff\1\u00c9\13\uffff\1\u00ca\13\uffff\1\u00c8"+
            "\7\uffff\1\u00c9\13\uffff\1\u00ca",
            "",
            "",
            "\1\u00cb\37\uffff\1\u00cb",
            "",
            "",
            "\1\u00cc\3\uffff\1\u00cd\33\uffff\1\u00cc\3\uffff\1\u00cd",
            "",
            "",
            "\1\u00ce\1\uffff\1\u00cf\3\uffff\1\u00d0\31\uffff\1\u00ce"+
            "\1\uffff\1\u00cf\3\uffff\1\u00d0",
            "\1\u00d2\2\uffff\1\u00d1\34\uffff\1\u00d2\2\uffff\1\u00d1",
            "\1\u00d3\37\uffff\1\u00d3",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d4\37\uffff\1\u00d4",
            "",
            "",
            "",
            "\1\u00d5\37\uffff\1\u00d5",
            "",
            "\1\u00d7\6\uffff\1\u00d6\30\uffff\1\u00d7\6\uffff\1\u00d6",
            "",
            "",
            "\2\u00d9\2\uffff\1\u00d9\22\uffff\1\u00d9",
            "",
            "",
            "",
            "\1\u00db\3\uffff\1\u00da\33\uffff\1\u00db\3\uffff\1\u00da",
            "",
            "",
            "",
            "",
            "",
            "\1\u00dd\1\u00dc\36\uffff\1\u00dd\1\u00dc",
            "",
            "\1\u00de\37\uffff\1\u00de",
            "\1\u00e0\1\uffff\1\u00df\35\uffff\1\u00e0\1\uffff\1\u00df",
            "\1\60\1\uffff\1\u00e1\35\uffff\1\60\1\uffff\1\u00e1",
            "",
            "\1\u00e3\11\uffff\1\u00e2\25\uffff\1\u00e3\11\uffff\1\u00e2",
            "\1\u00e4\3\uffff\1\u00e5\33\uffff\1\u00e4\3\uffff\1\u00e5",
            "\1\u00e7\16\uffff\1\u00e6\20\uffff\1\u00e7\16\uffff\1\u00e6",
            "",
            "",
            "\2\u00a1\2\uffff\1\u00a1\22\uffff\1\u00a1\55\uffff\1\u00e8"+
            "\37\uffff\1\u00e8",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00e9\1\u00ea\36\uffff\1\u00e9\1\u00ea",
            "",
            "\1\u00eb\37\uffff\1\u00eb",
            "",
            "\1\u00ed\37\uffff\1\u00ed",
            "",
            "",
            "\1\101\37\uffff\1\101",
            "",
            "",
            "\1\u00f0\11\uffff\1\u00ef\25\uffff\1\u00f0\11\uffff\1\u00ef",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00f1\37\uffff\1\u00f1",
            "",
            "\1\u00f2\7\uffff\1\u00f3\27\uffff\1\u00f2\7\uffff\1\u00f3",
            "",
            "",
            "",
            "",
            "\1\60\4\uffff\1\u00f4\1\u00f5\31\uffff\1\60\4\uffff\1\u00f4"+
            "\1\u00f5",
            "\1\u00f7\1\u00f6\36\uffff\1\u00f7\1\u00f6",
            "\1\101\20\uffff\1\u00f8\16\uffff\1\101\20\uffff\1\u00f8",
            "",
            "\1\u00fa\37\uffff\1\u00fa",
            "\1\104\16\uffff\1\u00fc\6\uffff\1\u00fb\11\uffff\1\104\16"+
            "\uffff\1\u00fc\6\uffff\1\u00fb",
            "",
            "",
            "",
            "",
            "\1\u00fd\37\uffff\1\u00fd",
            "\1\u00fe\3\uffff\1\60\33\uffff\1\u00fe\3\uffff\1\60",
            "",
            "\1\u00ff\37\uffff\1\u00ff",
            "",
            "\1\u0100\1\u0101\36\uffff\1\u0100\1\u0101",
            "\1\u0103",
            "",
            "\1\u0105\3\uffff\1\u0104\33\uffff\1\u0105\3\uffff\1\u0104",
            "\1\u0106\37\uffff\1\u0106",
            "\1\u0107\37\uffff\1\u0107",
            "",
            "",
            "",
            "\2\u00d9\2\uffff\1\u00d9\22\uffff\1\u00d9\50\uffff\1\u0109"+
            "\4\uffff\1\u0108\32\uffff\1\u0109\4\uffff\1\u0108",
            "",
            "",
            "",
            "",
            "\1\u010b\37\uffff\1\u010b",
            "",
            "",
            "",
            "",
            "\1\101\12\uffff\1\u010c\24\uffff\1\101\12\uffff\1\u010c",
            "",
            "",
            "\1\u010d\3\uffff\1\u010e\33\uffff\1\u010d\3\uffff\1\u010e",
            "",
            "\1\u010f\5\uffff\1\u0110\31\uffff\1\u010f\5\uffff\1\u0110",
            "",
            "\1\u0111\37\uffff\1\u0111",
            "\1\u0112\37\uffff\1\u0112",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0113\37\uffff\1\u0113",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0115\37\uffff\1\u0115",
            "",
            "\1\u0116\37\uffff\1\u0116",
            "",
            "",
            "",
            "\1\u0103\42\uffff\1\u0119\5\uffff\1\u0117\2\uffff\1\u0118"+
            "\26\uffff\1\u0119\5\uffff\1\u0117\2\uffff\1\u0118",
            "",
            "",
            "\1\u011a\20\uffff\1\u011b\16\uffff\1\u011a\20\uffff\1\u011b",
            "\2\60\2\uffff\1\60\22\uffff\1\60",
            "",
            "",
            "",
            "",
            "\1\60\2\uffff\1\u011d\34\uffff\1\60\2\uffff\1\u011d",
            "",
            "",
            "",
            "",
            "\1\u011e\37\uffff\1\u011e",
            "\1\u011f\37\uffff\1\u011f",
            "\1\u0120\20\uffff\1\u0121\16\uffff\1\u0120\20\uffff\1\u0121",
            "",
            "",
            "\1\u0122\37\uffff\1\u0122",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0124",
            "\1\u0126\37\uffff\1\u0126",
            "",
            "",
            "\1\u0127\37\uffff\1\u0127",
            "",
            "",
            "",
            "",
            "\1\u0128\37\uffff\1\u0128",
            "\1\u0129\37\uffff\1\u0129",
            "\1\u012b\13\uffff\1\u012c\23\uffff\1\u012b",
            "",
            "",
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
            return "1:1: Tokens : ( BLOCK_COMMENT | LINE_COMMENT | WHITESPACE | OPERATOR | OR_OPERATOR | AND_OPERATOR | NOT_OPERATOR | NUMBER_UNSIGNED | STRING | SOME_TYPES | SCALE_TYPES | SIZE_TYPES | CHAR_TYPES | CHAR_TYPE | BYTE_TYPE | RAW_TYPE | TIMESTAMP_TYPE | YEAR_TYPE | DAY_TYPE | SECOND_TYPE | KEYWORD | BEGIN_KEYWORD | END_KEYWORD | DECLARE_KEYWORD | EXCEPTION_KEYWORD | WHEN_KEYWORD | THEN_KEYWORD | NOT_NULL_KEYWORD | NULL_KEYWORD | DEFAULT_KEYWORD | ROWTYPE_KEYWORD | LIKE_TYPE_KEYWORD | TYPE_KEYWORD | TRUE_KEYWORD | FALSE_KEYWORD | CONSTANT_KEYWORD | WITH_KEYWORD | LOCAL_KEYWORD | TIME_KEYWORD | ZONE_KEYWORD | INTERVAL_KEYWORD | TO_KEYWORD | MONTH_KEYWORD | SUBTYPE_KEYWORD | IS_KEYWORD | RECORD_KEYWORD | CREATE_KEYWORD | REPLACE_KEYWORD | FUNCTION_KEYWORD | AS_KEYWORD | RETURN_KEYWORD | IN_KEYWORD | OUT_KEYWORD | NOCOPY_KEYWORD | AUTHID_KEYWORD | CURRENT_USER_KEYWORD | DEFINER_KEYWORD | DETERMINISTIC_KEYWORD | PARALLEL_ENABLED_KEYWORD | PIPELINED_KEYWORD | RESULT_CACHE_KEYWORD | PROCEDURE_KEYWORD | IF_KEYWORD | ELSE_KEYWORD | ELSIF_KEYWORD | ENDIF_KEYWORD | IS_NULL_KEYWORD | IS_NOT_NULL_KEYWORD | NOT_IN_KEYWORD | GOTO_KEYWORD | LOOP_KEYWORD | END_LOOP_KEYWORD | WHILE_KEYWORD | FOR_KEYWORD | REVERSE_KEYWORD | SELECT_KEYWORD | COUNT_KEYWORD | EXCEPTION_INIT_KEYWORD | LIKE_KEYWORD | RAISE_KEYWORD | PRAGMA_KEYWORD | AUTONOMOUS_TRANSACTION_KEYWORD | CASE_KEYWORD | END_CASE_KEYWORD | CLOSE_KEYWORD | TABLE_KEYWORD | OF_KEYWORD | INDEX_KEYWORD | BY_KEYWORD | VARRAY_KEYWORD | VARYING_KEYWORD | ARRAY_KEYWORD | COMMIT_KEYWORD | REF_KEYWORD | CONTINUE_KEYWORD | CURSOR_KEYWORD | DELETE_KEYWORD | EXECUTE_KEYWORD | IMMEDIATE_KEYWORD | EXIT_KEYWORD | INTO_KEYWORD | USING_KEYWORD | BULK_KEYWORD | COLLECT_KEYWORD | FETCH_KEYWORD | LIMIT_KEYWORD | FORALL_KEYWORD | SAVE_KEYWORD | EXCEPTIONS_KEYWORD | INDICES_KEYWORD | VALUES_KEYWORD | BETWEEN_KEYWORD | INLINE_KEYWORD | INSERT_KEYWORD | LOCK_KEYWORD | MERGE_KEYWORD | OPEN_KEYWORD | PACKAGE_KEYWORD | BODY_KEYWORD | RESTRICT_REFERENCES_KEYWORD | RETURNING_KEYWORD | ROLLBACK_KEYWORD | SAVEPOINT_KEYWORD | SERIALLY_REUSABLE_KEYWORD | SET_KEYWORD | TRANSACTION_KEYWORD | NOTFOUND_KEYWORD | FOUND_KEYWORD | ISOPEN_KEYWORD | ROWCOUNT_KEYWORD | SQLCODE_KEYWORD | SQLERRM_KEYWORD | UPDATE_KEYWORD | EXISTS_KEYWORD | TRIGGER_KEYWORD | BEFORE_KEYWORD | AFTER_KEYWORD | INSTEAD_KEYWORD | ON_KEYWORD | NESTED_KEYWORD | REFERENCING_KEYWORD | OLD_KEYWORD | NEW_KEYWORD | PARENT_KEYWORD | EACH_KEYWORD | ROW_KEYWORD | FOLLOWS_KEYWORD | ENABLE_KEYWORD | DISABLE_KEYWORD | OID_KEYWORD | OBJECT_KEYWORD | UNDER_KEYWORD | FINAL_KEYWORD | INSTANTIABLE_KEYWORD | OVERRIDING_KEYWORD | MEMBER_KEYWORD | STATIC_KEYWORD | CONSTRUCTOR_KEYWORD | SELF_KEYWORD | RESULT_KEYWORD | MAP_KEYWORD | ORDER_KEYWORD | JOIN_KEYWORD | THE_REST );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA49_21 = input.LA(1);

                        s = -1;
                        if ( ((LA49_21>='\u0000' && LA49_21<='\uFFFF')) ) {s = 69;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA49_0 = input.LA(1);

                        s = -1;
                        if ( (LA49_0=='/') ) {s = 1;}

                        else if ( (LA49_0=='-') ) {s = 2;}

                        else if ( ((LA49_0>='\t' && LA49_0<='\n')||LA49_0=='\r'||LA49_0==' ') ) {s = 3;}

                        else if ( (LA49_0==':') ) {s = 4;}

                        else if ( (LA49_0=='+') ) {s = 5;}

                        else if ( (LA49_0=='*') ) {s = 6;}

                        else if ( (LA49_0=='|') ) {s = 7;}

                        else if ( (LA49_0=='=') ) {s = 8;}

                        else if ( (LA49_0=='<') ) {s = 9;}

                        else if ( (LA49_0=='!') ) {s = 10;}

                        else if ( (LA49_0=='~') ) {s = 11;}

                        else if ( (LA49_0=='^') ) {s = 12;}

                        else if ( (LA49_0=='>') ) {s = 13;}

                        else if ( (LA49_0=='.') ) {s = 14;}

                        else if ( (LA49_0=='(') ) {s = 15;}

                        else if ( (LA49_0==')') ) {s = 16;}

                        else if ( (LA49_0=='O'||LA49_0=='o') ) {s = 17;}

                        else if ( (LA49_0=='A'||LA49_0=='a') ) {s = 18;}

                        else if ( (LA49_0=='N'||LA49_0=='n') ) {s = 19;}

                        else if ( ((LA49_0>='0' && LA49_0<='9')) ) {s = 20;}

                        else if ( (LA49_0=='\'') ) {s = 21;}

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

                        else if ( ((LA49_0>='\u0000' && LA49_0<='\b')||(LA49_0>='\u000B' && LA49_0<='\f')||(LA49_0>='\u000E' && LA49_0<='\u001F')||(LA49_0>='\"' && LA49_0<='$')||LA49_0=='&'||LA49_0==','||LA49_0==';'||(LA49_0>='?' && LA49_0<='@')||LA49_0=='H'||LA49_0=='K'||LA49_0=='Q'||LA49_0=='X'||(LA49_0>='[' && LA49_0<=']')||(LA49_0>='_' && LA49_0<='`')||LA49_0=='h'||LA49_0=='k'||LA49_0=='q'||LA49_0=='x'||LA49_0=='{'||LA49_0=='}'||(LA49_0>='\u007F' && LA49_0<='\uFFFF')) ) {s = 42;}

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