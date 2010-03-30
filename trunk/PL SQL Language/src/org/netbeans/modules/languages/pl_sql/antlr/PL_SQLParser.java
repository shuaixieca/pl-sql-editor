// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g 2010-03-30 17:59:37
package org.netbeans.modules.languages.pl_sql.antlr;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class PL_SQLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NUMBER_UNSIGNED", "AND_OPERATOR", "OR_OPERATOR", "NOT_OPEARTOR", "STRING", "SOME_TYPES", "SCALE_TYPES", "SIZE_TYPES", "CHAR_TYPES", "CHAR_TYPE", "BYTE_TYPE", "RAW_TYPE", "TIMESTAMP_TYPE", "YEAR_TYPE", "DAY_TYPE", "SECOND_TYPE", "KEYWORD", "BLOCK_COMMENT", "LINE_COMMENT", "WHITESPACE", "OPERATOR", "O", "R", "A", "N", "D", "T", "NOT_OPERATOR", "DIGITS", "EXP_DIGITS", "U", "L", "P", "S", "I", "E", "G", "V", "Y", "M", "B", "F", "W", "C", "H", "DIGIT", "X", "BEGIN_KEYWORD", "END_KEYWORD", "DECLARE_KEYWORD", "EXCEPTION_KEYWORD", "WHEN_KEYWORD", "THEN_KEYWORD", "NOT_NULL_KEYWORD", "NULL_KEYWORD", "DEFAULT_KEYWORD", "ROWTYPE_KEYWORD", "LIKE_TYPE_KEYWORD", "TYPE_KEYWORD", "TRUE_KEYWORD", "FALSE_KEYWORD", "CONSTANT_KEYWORD", "WITH_KEYWORD", "LOCAL_KEYWORD", "TIME_KEYWORD", "Z", "ZONE_KEYWORD", "INTERVAL_KEYWORD", "TO_KEYWORD", "MONTH_KEYWORD", "SUBTYPE_KEYWORD", "IS_KEYWORD", "RECORD_KEYWORD", "CREATE_KEYWORD", "REPLACE_KEYWORD", "FUNCTION_KEYWORD", "AS_KEYWORD", "RETURN_KEYWORD", "IN_KEYWORD", "OUT_KEYWORD", "NOCOPY_KEYWORD", "AUTHID_KEYWORD", "CURRENT_USER_KEYWORD", "DEFINER_KEYWORD", "DETERMINISTIC_KEYWORD", "PARALLEL_ENABLED_KEYWORD", "PIPELINED_KEYWORD", "RESULT_CACHE_KEYWORD", "PROCEDURE_KEYWORD", "IF_KEYWORD", "ELSE_KEYWORD", "ELSIF_KEYWORD", "ENDIF_KEYWORD", "IS_NULL_KEYWORD", "IS_NOT_NULL_KEYWORD", "NOT_IN_KEYWORD", "GOTO_KEYWORD", "LOOP_KEYWORD", "END_LOOP_KEYWORD", "WHILE_KEYWORD", "FOR_KEYWORD", "REVERSE_KEYWORD", "SELECT_KEYWORD", "COUNT_KEYWORD", "EXCEPTION_INIT_KEYWORD", "K", "LIKE_KEYWORD", "RAISE_KEYWORD", "PRAGMA_KEYWORD", "AUTONOMOUS_TRANSACTION_KEYWORD", "CASE_KEYWORD", "END_CASE_KEYWORD", "CLOSE_KEYWORD", "TABLE_KEYWORD", "OF_KEYWORD", "INDEX_KEYWORD", "BY_KEYWORD", "VARRAY_KEYWORD", "VARYING_KEYWORD", "ARRAY_KEYWORD", "COMMIT_KEYWORD", "REF_KEYWORD", "CONTINUE_KEYWORD", "CURSOR_KEYWORD", "DELETE_KEYWORD", "EXECUTE_KEYWORD", "IMMEDIATE_KEYWORD", "EXIT_KEYWORD", "INTO_KEYWORD", "USING_KEYWORD", "BULK_KEYWORD", "COLLECT_KEYWORD", "FETCH_KEYWORD", "LIMIT_KEYWORD", "FORALL_KEYWORD", "SAVE_KEYWORD", "EXCEPTIONS_KEYWORD", "INDICES_KEYWORD", "VALUES_KEYWORD", "BETWEEN_KEYWORD", "INLINE_KEYWORD", "INSERT_KEYWORD", "LOCK_KEYWORD", "MERGE_KEYWORD", "OPEN_KEYWORD", "PACKAGE_KEYWORD", "BODY_KEYWORD", "RESTRICT_REFERENCES_KEYWORD", "RETURNING_KEYWORD", "ROLLBACK_KEYWORD", "SAVEPOINT_KEYWORD", "SERIALLY_REUSABLE_KEYWORD", "SET_KEYWORD", "TRANSACTION_KEYWORD", "NOTFOUND_KEYWORD", "FOUND_KEYWORD", "ISOPEN_KEYWORD", "ROWCOUNT_KEYWORD", "Q", "SQLCODE_KEYWORD", "SQLERRM_KEYWORD", "UPDATE_KEYWORD", "EXISTS_KEYWORD", "TRIGGER_KEYWORD", "BEFORE_KEYWORD", "AFTER_KEYWORD", "INSTEAD_KEYWORD", "ON_KEYWORD", "NESTED_KEYWORD", "REFERENCING_KEYWORD", "OLD_KEYWORD", "NEW_KEYWORD", "PARENT_KEYWORD", "EACH_KEYWORD", "ROW_KEYWORD", "FOLLOWS_KEYWORD", "ENABLE_KEYWORD", "DISABLE_KEYWORD", "OID_KEYWORD", "J", "OBJECT_KEYWORD", "UNDER_KEYWORD", "FINAL_KEYWORD", "INSTANTIABLE_KEYWORD", "OVERRIDING_KEYWORD", "MEMBER_KEYWORD", "STATIC_KEYWORD", "CONSTRUCTOR_KEYWORD", "SELF_KEYWORD", "RESULT_KEYWORD", "MAP_KEYWORD", "ORDER_KEYWORD", "JOIN_KEYWORD", "THE_REST"
    };
    public static final int VARRAY_KEYWORD=121;
    public static final int TRIGGER_KEYWORD=167;
    public static final int RESULT_KEYWORD=193;
    public static final int EXIT_KEYWORD=131;
    public static final int V=41;
    public static final int DISABLE_KEYWORD=181;
    public static final int RESTRICT_REFERENCES_KEYWORD=151;
    public static final int WHILE_KEYWORD=103;
    public static final int AUTONOMOUS_TRANSACTION_KEYWORD=113;
    public static final int U=34;
    public static final int BEGIN_KEYWORD=51;
    public static final int ELSE_KEYWORD=94;
    public static final int SOME_TYPES=9;
    public static final int COLLECT_KEYWORD=135;
    public static final int INTERVAL_KEYWORD=71;
    public static final int CONSTANT_KEYWORD=65;
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
    public static final int OVERRIDING_KEYWORD=188;
    public static final int DECLARE_KEYWORD=53;
    public static final int VARYING_KEYWORD=122;
    public static final int THE_REST=197;
    public static final int BETWEEN_KEYWORD=143;
    public static final int M=43;
    public static final int EXCEPTION_INIT_KEYWORD=108;
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
    public static final int MONTH_KEYWORD=73;
    public static final int FORALL_KEYWORD=138;
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
    public static final int THEN_KEYWORD=56;
    public static final int REVERSE_KEYWORD=105;
    public static final int BY_KEYWORD=120;
    public static final int EOF=-1;
    public static final int SELECT_KEYWORD=106;
    public static final int REPLACE_KEYWORD=78;
    public static final int GOTO_KEYWORD=100;
    public static final int INDICES_KEYWORD=141;
    public static final int NOCOPY_KEYWORD=84;
    public static final int Y=42;
    public static final int E=39;

    // delegates
    // delegators


        public PL_SQLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PL_SQLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return PL_SQLParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g"; }



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


    public static class grammar_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "grammar_def"
    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:399:1: grammar_def : statments EOF ;
    public final PL_SQLParser.grammar_def_return grammar_def() throws RecognitionException {
        PL_SQLParser.grammar_def_return retval = new PL_SQLParser.grammar_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF2=null;
        PL_SQLParser.statments_return statments1 = null;


        Object EOF2_tree=null;

        try {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:400:2: ( statments EOF )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:400:4: statments EOF
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_statments_in_grammar_def4490);
            statments1=statments();

            state._fsp--;

            adaptor.addChild(root_0, statments1.getTree());
            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_grammar_def4493); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "grammar_def"

    public static class statments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statments"
    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:402:1: statments : BEGIN_KEYWORD ( NUMBER_UNSIGNED | STRING | SOME_TYPES | SCALE_TYPES | SIZE_TYPES | CHAR_TYPES | CHAR_TYPE | BYTE_TYPE | RAW_TYPE | TIMESTAMP_TYPE | YEAR_TYPE | DAY_TYPE | SECOND_TYPE | KEYWORD | NOT_NULL_KEYWORD | IS_NULL_KEYWORD | IS_NOT_NULL_KEYWORD )+ END_KEYWORD ;
    public final PL_SQLParser.statments_return statments() throws RecognitionException {
        PL_SQLParser.statments_return retval = new PL_SQLParser.statments_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BEGIN_KEYWORD3=null;
        Token set4=null;
        Token END_KEYWORD5=null;

        Object BEGIN_KEYWORD3_tree=null;
        Object set4_tree=null;
        Object END_KEYWORD5_tree=null;

        try {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:403:2: ( BEGIN_KEYWORD ( NUMBER_UNSIGNED | STRING | SOME_TYPES | SCALE_TYPES | SIZE_TYPES | CHAR_TYPES | CHAR_TYPE | BYTE_TYPE | RAW_TYPE | TIMESTAMP_TYPE | YEAR_TYPE | DAY_TYPE | SECOND_TYPE | KEYWORD | NOT_NULL_KEYWORD | IS_NULL_KEYWORD | IS_NOT_NULL_KEYWORD )+ END_KEYWORD )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:403:4: BEGIN_KEYWORD ( NUMBER_UNSIGNED | STRING | SOME_TYPES | SCALE_TYPES | SIZE_TYPES | CHAR_TYPES | CHAR_TYPE | BYTE_TYPE | RAW_TYPE | TIMESTAMP_TYPE | YEAR_TYPE | DAY_TYPE | SECOND_TYPE | KEYWORD | NOT_NULL_KEYWORD | IS_NULL_KEYWORD | IS_NOT_NULL_KEYWORD )+ END_KEYWORD
            {
            root_0 = (Object)adaptor.nil();

            BEGIN_KEYWORD3=(Token)match(input,BEGIN_KEYWORD,FOLLOW_BEGIN_KEYWORD_in_statments4503); 
            BEGIN_KEYWORD3_tree = (Object)adaptor.create(BEGIN_KEYWORD3);
            adaptor.addChild(root_0, BEGIN_KEYWORD3_tree);

            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:403:18: ( NUMBER_UNSIGNED | STRING | SOME_TYPES | SCALE_TYPES | SIZE_TYPES | CHAR_TYPES | CHAR_TYPE | BYTE_TYPE | RAW_TYPE | TIMESTAMP_TYPE | YEAR_TYPE | DAY_TYPE | SECOND_TYPE | KEYWORD | NOT_NULL_KEYWORD | IS_NULL_KEYWORD | IS_NOT_NULL_KEYWORD )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==NUMBER_UNSIGNED||(LA1_0>=STRING && LA1_0<=KEYWORD)||LA1_0==NOT_NULL_KEYWORD||(LA1_0>=IS_NULL_KEYWORD && LA1_0<=IS_NOT_NULL_KEYWORD)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:
            	    {
            	    set4=(Token)input.LT(1);
            	    if ( input.LA(1)==NUMBER_UNSIGNED||(input.LA(1)>=STRING && input.LA(1)<=KEYWORD)||input.LA(1)==NOT_NULL_KEYWORD||(input.LA(1)>=IS_NULL_KEYWORD && input.LA(1)<=IS_NOT_NULL_KEYWORD) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set4));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            END_KEYWORD5=(Token)match(input,END_KEYWORD,FOLLOW_END_KEYWORD_in_statments4577); 
            END_KEYWORD5_tree = (Object)adaptor.create(END_KEYWORD5);
            adaptor.addChild(root_0, END_KEYWORD5_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statments"

    // Delegated rules


 

    public static final BitSet FOLLOW_statments_in_grammar_def4490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_grammar_def4493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_KEYWORD_in_statments4503 = new BitSet(new long[]{0x02000000001FFF10L,0x0000000600000000L});
    public static final BitSet FOLLOW_set_in_statments4505 = new BitSet(new long[]{0x02100000001FFF10L,0x0000000600000000L});
    public static final BitSet FOLLOW_END_KEYWORD_in_statments4577 = new BitSet(new long[]{0x0000000000000002L});

}