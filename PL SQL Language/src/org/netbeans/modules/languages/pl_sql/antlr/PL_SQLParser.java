// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g 2010-03-26 15:21:55
package org.netbeans.modules.languages.pl_sql.antlr;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class PL_SQLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NUMBER_UNSIGNED", "AND_OPERATOR", "OR_OPERATOR", "BLOCK_COMMENT", "LINE_COMMENT", "WHITESPACE", "OPERATOR", "O", "R", "A", "N", "D", "T", "NOT_OPERATOR", "DIGITS", "EXP_DIGITS", "E", "B", "C", "F", "G", "H", "I", "J", "K", "L", "M", "P", "Q", "S", "U", "V", "W", "X", "Y", "Z"
    };
    public static final int NOT_OPERATOR=17;
    public static final int O=11;
    public static final int EXP_DIGITS=19;
    public static final int W=36;
    public static final int DIGITS=18;
    public static final int H=25;
    public static final int P=31;
    public static final int NUMBER_UNSIGNED=4;
    public static final int V=35;
    public static final int G=24;
    public static final int I=26;
    public static final int BLOCK_COMMENT=7;
    public static final int A=13;
    public static final int F=23;
    public static final int U=34;
    public static final int LINE_COMMENT=8;
    public static final int N=14;
    public static final int WHITESPACE=9;
    public static final int X=37;
    public static final int Z=39;
    public static final int S=33;
    public static final int D=15;
    public static final int K=28;
    public static final int R=12;
    public static final int C=22;
    public static final int B=21;
    public static final int EOF=-1;
    public static final int Q=32;
    public static final int L=29;
    public static final int AND_OPERATOR=5;
    public static final int M=30;
    public static final int OPERATOR=10;
    public static final int Y=38;
    public static final int J=27;
    public static final int T=16;
    public static final int OR_OPERATOR=6;
    public static final int E=20;

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
    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:163:1: grammar_def : statments EOF ;
    public final PL_SQLParser.grammar_def_return grammar_def() throws RecognitionException {
        PL_SQLParser.grammar_def_return retval = new PL_SQLParser.grammar_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF2=null;
        PL_SQLParser.statments_return statments1 = null;


        Object EOF2_tree=null;

        try {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:164:2: ( statments EOF )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:164:4: statments EOF
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_statments_in_grammar_def680);
            statments1=statments();

            state._fsp--;

            adaptor.addChild(root_0, statments1.getTree());
            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_grammar_def682); 

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
    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:165:1: statments : AND_OPERATOR ( NUMBER_UNSIGNED )+ OR_OPERATOR ;
    public final PL_SQLParser.statments_return statments() throws RecognitionException {
        PL_SQLParser.statments_return retval = new PL_SQLParser.statments_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND_OPERATOR3=null;
        Token NUMBER_UNSIGNED4=null;
        Token OR_OPERATOR5=null;

        Object AND_OPERATOR3_tree=null;
        Object NUMBER_UNSIGNED4_tree=null;
        Object OR_OPERATOR5_tree=null;

        try {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:166:2: ( AND_OPERATOR ( NUMBER_UNSIGNED )+ OR_OPERATOR )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:166:4: AND_OPERATOR ( NUMBER_UNSIGNED )+ OR_OPERATOR
            {
            root_0 = (Object)adaptor.nil();

            AND_OPERATOR3=(Token)match(input,AND_OPERATOR,FOLLOW_AND_OPERATOR_in_statments691); 
            AND_OPERATOR3_tree = (Object)adaptor.create(AND_OPERATOR3);
            adaptor.addChild(root_0, AND_OPERATOR3_tree);

            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:166:17: ( NUMBER_UNSIGNED )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==NUMBER_UNSIGNED) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:166:17: NUMBER_UNSIGNED
            	    {
            	    NUMBER_UNSIGNED4=(Token)match(input,NUMBER_UNSIGNED,FOLLOW_NUMBER_UNSIGNED_in_statments693); 
            	    NUMBER_UNSIGNED4_tree = (Object)adaptor.create(NUMBER_UNSIGNED4);
            	    adaptor.addChild(root_0, NUMBER_UNSIGNED4_tree);


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

            OR_OPERATOR5=(Token)match(input,OR_OPERATOR,FOLLOW_OR_OPERATOR_in_statments696); 
            OR_OPERATOR5_tree = (Object)adaptor.create(OR_OPERATOR5);
            adaptor.addChild(root_0, OR_OPERATOR5_tree);


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


 

    public static final BitSet FOLLOW_statments_in_grammar_def680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_grammar_def682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_OPERATOR_in_statments691 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_NUMBER_UNSIGNED_in_statments693 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_OR_OPERATOR_in_statments696 = new BitSet(new long[]{0x0000000000000002L});

}