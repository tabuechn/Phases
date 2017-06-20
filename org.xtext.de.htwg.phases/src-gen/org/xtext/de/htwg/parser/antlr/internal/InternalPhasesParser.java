package org.xtext.de.htwg.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.de.htwg.services.PhasesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPhasesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PHASE'", "'NUMBERS'", "':'", "'DOUBLE'", "'TRIPLE'", "'QUADRUPLE'", "'COLORS'", "'STREET'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=4;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalPhasesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPhasesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPhasesParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPhases.g"; }



     	private PhasesGrammarAccess grammarAccess;

        public InternalPhasesParser(TokenStream input, PhasesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Game";
       	}

       	@Override
       	protected PhasesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGame"
    // InternalPhases.g:64:1: entryRuleGame returns [EObject current=null] : iv_ruleGame= ruleGame EOF ;
    public final EObject entryRuleGame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGame = null;


        try {
            // InternalPhases.g:64:45: (iv_ruleGame= ruleGame EOF )
            // InternalPhases.g:65:2: iv_ruleGame= ruleGame EOF
            {
             newCompositeNode(grammarAccess.getGameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGame=ruleGame();

            state._fsp--;

             current =iv_ruleGame; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGame"


    // $ANTLR start "ruleGame"
    // InternalPhases.g:71:1: ruleGame returns [EObject current=null] : ( (lv_phases_0_0= rulePhase ) )* ;
    public final EObject ruleGame() throws RecognitionException {
        EObject current = null;

        EObject lv_phases_0_0 = null;



        	enterRule();

        try {
            // InternalPhases.g:77:2: ( ( (lv_phases_0_0= rulePhase ) )* )
            // InternalPhases.g:78:2: ( (lv_phases_0_0= rulePhase ) )*
            {
            // InternalPhases.g:78:2: ( (lv_phases_0_0= rulePhase ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPhases.g:79:3: (lv_phases_0_0= rulePhase )
            	    {
            	    // InternalPhases.g:79:3: (lv_phases_0_0= rulePhase )
            	    // InternalPhases.g:80:4: lv_phases_0_0= rulePhase
            	    {

            	    				newCompositeNode(grammarAccess.getGameAccess().getPhasesPhaseParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_phases_0_0=rulePhase();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getGameRule());
            	    				}
            	    				add(
            	    					current,
            	    					"phases",
            	    					lv_phases_0_0,
            	    					"org.xtext.de.htwg.Phases.Phase");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGame"


    // $ANTLR start "entryRulePhase"
    // InternalPhases.g:100:1: entryRulePhase returns [EObject current=null] : iv_rulePhase= rulePhase EOF ;
    public final EObject entryRulePhase() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhase = null;


        try {
            // InternalPhases.g:100:46: (iv_rulePhase= rulePhase EOF )
            // InternalPhases.g:101:2: iv_rulePhase= rulePhase EOF
            {
             newCompositeNode(grammarAccess.getPhaseRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhase=rulePhase();

            state._fsp--;

             current =iv_rulePhase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePhase"


    // $ANTLR start "rulePhase"
    // InternalPhases.g:107:1: rulePhase returns [EObject current=null] : (otherlv_0= 'PHASE' ( (lv_phaseNumber_1_0= RULE_INT ) ) ( (lv_phaseType_2_0= rulePhaseType ) ) ( (lv_phaseDescription_3_0= RULE_STRING ) ) ) ;
    public final EObject rulePhase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_phaseNumber_1_0=null;
        Token lv_phaseDescription_3_0=null;
        EObject lv_phaseType_2_0 = null;



        	enterRule();

        try {
            // InternalPhases.g:113:2: ( (otherlv_0= 'PHASE' ( (lv_phaseNumber_1_0= RULE_INT ) ) ( (lv_phaseType_2_0= rulePhaseType ) ) ( (lv_phaseDescription_3_0= RULE_STRING ) ) ) )
            // InternalPhases.g:114:2: (otherlv_0= 'PHASE' ( (lv_phaseNumber_1_0= RULE_INT ) ) ( (lv_phaseType_2_0= rulePhaseType ) ) ( (lv_phaseDescription_3_0= RULE_STRING ) ) )
            {
            // InternalPhases.g:114:2: (otherlv_0= 'PHASE' ( (lv_phaseNumber_1_0= RULE_INT ) ) ( (lv_phaseType_2_0= rulePhaseType ) ) ( (lv_phaseDescription_3_0= RULE_STRING ) ) )
            // InternalPhases.g:115:3: otherlv_0= 'PHASE' ( (lv_phaseNumber_1_0= RULE_INT ) ) ( (lv_phaseType_2_0= rulePhaseType ) ) ( (lv_phaseDescription_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPhaseAccess().getPHASEKeyword_0());
            		
            // InternalPhases.g:119:3: ( (lv_phaseNumber_1_0= RULE_INT ) )
            // InternalPhases.g:120:4: (lv_phaseNumber_1_0= RULE_INT )
            {
            // InternalPhases.g:120:4: (lv_phaseNumber_1_0= RULE_INT )
            // InternalPhases.g:121:5: lv_phaseNumber_1_0= RULE_INT
            {
            lv_phaseNumber_1_0=(Token)match(input,RULE_INT,FOLLOW_5); 

            					newLeafNode(lv_phaseNumber_1_0, grammarAccess.getPhaseAccess().getPhaseNumberINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhaseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"phaseNumber",
            						lv_phaseNumber_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalPhases.g:137:3: ( (lv_phaseType_2_0= rulePhaseType ) )
            // InternalPhases.g:138:4: (lv_phaseType_2_0= rulePhaseType )
            {
            // InternalPhases.g:138:4: (lv_phaseType_2_0= rulePhaseType )
            // InternalPhases.g:139:5: lv_phaseType_2_0= rulePhaseType
            {

            					newCompositeNode(grammarAccess.getPhaseAccess().getPhaseTypePhaseTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_phaseType_2_0=rulePhaseType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhaseRule());
            					}
            					set(
            						current,
            						"phaseType",
            						lv_phaseType_2_0,
            						"org.xtext.de.htwg.Phases.PhaseType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPhases.g:156:3: ( (lv_phaseDescription_3_0= RULE_STRING ) )
            // InternalPhases.g:157:4: (lv_phaseDescription_3_0= RULE_STRING )
            {
            // InternalPhases.g:157:4: (lv_phaseDescription_3_0= RULE_STRING )
            // InternalPhases.g:158:5: lv_phaseDescription_3_0= RULE_STRING
            {
            lv_phaseDescription_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_phaseDescription_3_0, grammarAccess.getPhaseAccess().getPhaseDescriptionSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhaseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"phaseDescription",
            						lv_phaseDescription_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePhase"


    // $ANTLR start "entryRulePhaseType"
    // InternalPhases.g:178:1: entryRulePhaseType returns [EObject current=null] : iv_rulePhaseType= rulePhaseType EOF ;
    public final EObject entryRulePhaseType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhaseType = null;


        try {
            // InternalPhases.g:178:50: (iv_rulePhaseType= rulePhaseType EOF )
            // InternalPhases.g:179:2: iv_rulePhaseType= rulePhaseType EOF
            {
             newCompositeNode(grammarAccess.getPhaseTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhaseType=rulePhaseType();

            state._fsp--;

             current =iv_rulePhaseType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePhaseType"


    // $ANTLR start "rulePhaseType"
    // InternalPhases.g:185:1: rulePhaseType returns [EObject current=null] : ( ( (lv_streetType_0_0= ruleSTREET_TYPE ) ) | ( (lv_numbersType_1_0= ruleNUMBERS_TYPE ) ) | ( (lv_colorType_2_0= ruleCOLORS_TYPE ) ) ) ;
    public final EObject rulePhaseType() throws RecognitionException {
        EObject current = null;

        EObject lv_streetType_0_0 = null;

        EObject lv_numbersType_1_0 = null;

        EObject lv_colorType_2_0 = null;



        	enterRule();

        try {
            // InternalPhases.g:191:2: ( ( ( (lv_streetType_0_0= ruleSTREET_TYPE ) ) | ( (lv_numbersType_1_0= ruleNUMBERS_TYPE ) ) | ( (lv_colorType_2_0= ruleCOLORS_TYPE ) ) ) )
            // InternalPhases.g:192:2: ( ( (lv_streetType_0_0= ruleSTREET_TYPE ) ) | ( (lv_numbersType_1_0= ruleNUMBERS_TYPE ) ) | ( (lv_colorType_2_0= ruleCOLORS_TYPE ) ) )
            {
            // InternalPhases.g:192:2: ( ( (lv_streetType_0_0= ruleSTREET_TYPE ) ) | ( (lv_numbersType_1_0= ruleNUMBERS_TYPE ) ) | ( (lv_colorType_2_0= ruleCOLORS_TYPE ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalPhases.g:193:3: ( (lv_streetType_0_0= ruleSTREET_TYPE ) )
                    {
                    // InternalPhases.g:193:3: ( (lv_streetType_0_0= ruleSTREET_TYPE ) )
                    // InternalPhases.g:194:4: (lv_streetType_0_0= ruleSTREET_TYPE )
                    {
                    // InternalPhases.g:194:4: (lv_streetType_0_0= ruleSTREET_TYPE )
                    // InternalPhases.g:195:5: lv_streetType_0_0= ruleSTREET_TYPE
                    {

                    					newCompositeNode(grammarAccess.getPhaseTypeAccess().getStreetTypeSTREET_TYPEParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_streetType_0_0=ruleSTREET_TYPE();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPhaseTypeRule());
                    					}
                    					set(
                    						current,
                    						"streetType",
                    						lv_streetType_0_0,
                    						"org.xtext.de.htwg.Phases.STREET_TYPE");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPhases.g:213:3: ( (lv_numbersType_1_0= ruleNUMBERS_TYPE ) )
                    {
                    // InternalPhases.g:213:3: ( (lv_numbersType_1_0= ruleNUMBERS_TYPE ) )
                    // InternalPhases.g:214:4: (lv_numbersType_1_0= ruleNUMBERS_TYPE )
                    {
                    // InternalPhases.g:214:4: (lv_numbersType_1_0= ruleNUMBERS_TYPE )
                    // InternalPhases.g:215:5: lv_numbersType_1_0= ruleNUMBERS_TYPE
                    {

                    					newCompositeNode(grammarAccess.getPhaseTypeAccess().getNumbersTypeNUMBERS_TYPEParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_numbersType_1_0=ruleNUMBERS_TYPE();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPhaseTypeRule());
                    					}
                    					set(
                    						current,
                    						"numbersType",
                    						lv_numbersType_1_0,
                    						"org.xtext.de.htwg.Phases.NUMBERS_TYPE");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPhases.g:233:3: ( (lv_colorType_2_0= ruleCOLORS_TYPE ) )
                    {
                    // InternalPhases.g:233:3: ( (lv_colorType_2_0= ruleCOLORS_TYPE ) )
                    // InternalPhases.g:234:4: (lv_colorType_2_0= ruleCOLORS_TYPE )
                    {
                    // InternalPhases.g:234:4: (lv_colorType_2_0= ruleCOLORS_TYPE )
                    // InternalPhases.g:235:5: lv_colorType_2_0= ruleCOLORS_TYPE
                    {

                    					newCompositeNode(grammarAccess.getPhaseTypeAccess().getColorTypeCOLORS_TYPEParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_colorType_2_0=ruleCOLORS_TYPE();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPhaseTypeRule());
                    					}
                    					set(
                    						current,
                    						"colorType",
                    						lv_colorType_2_0,
                    						"org.xtext.de.htwg.Phases.COLORS_TYPE");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePhaseType"


    // $ANTLR start "entryRuleNUMBERS_TYPE"
    // InternalPhases.g:256:1: entryRuleNUMBERS_TYPE returns [EObject current=null] : iv_ruleNUMBERS_TYPE= ruleNUMBERS_TYPE EOF ;
    public final EObject entryRuleNUMBERS_TYPE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNUMBERS_TYPE = null;


        try {
            // InternalPhases.g:256:53: (iv_ruleNUMBERS_TYPE= ruleNUMBERS_TYPE EOF )
            // InternalPhases.g:257:2: iv_ruleNUMBERS_TYPE= ruleNUMBERS_TYPE EOF
            {
             newCompositeNode(grammarAccess.getNUMBERS_TYPERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNUMBERS_TYPE=ruleNUMBERS_TYPE();

            state._fsp--;

             current =iv_ruleNUMBERS_TYPE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNUMBERS_TYPE"


    // $ANTLR start "ruleNUMBERS_TYPE"
    // InternalPhases.g:263:1: ruleNUMBERS_TYPE returns [EObject current=null] : ( ( (lv_name_0_0= 'NUMBERS' ) ) otherlv_1= ':' ( (lv_numbersType_2_0= ruleNUMBERS ) )* ) ;
    public final EObject ruleNUMBERS_TYPE() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_numbersType_2_0 = null;



        	enterRule();

        try {
            // InternalPhases.g:269:2: ( ( ( (lv_name_0_0= 'NUMBERS' ) ) otherlv_1= ':' ( (lv_numbersType_2_0= ruleNUMBERS ) )* ) )
            // InternalPhases.g:270:2: ( ( (lv_name_0_0= 'NUMBERS' ) ) otherlv_1= ':' ( (lv_numbersType_2_0= ruleNUMBERS ) )* )
            {
            // InternalPhases.g:270:2: ( ( (lv_name_0_0= 'NUMBERS' ) ) otherlv_1= ':' ( (lv_numbersType_2_0= ruleNUMBERS ) )* )
            // InternalPhases.g:271:3: ( (lv_name_0_0= 'NUMBERS' ) ) otherlv_1= ':' ( (lv_numbersType_2_0= ruleNUMBERS ) )*
            {
            // InternalPhases.g:271:3: ( (lv_name_0_0= 'NUMBERS' ) )
            // InternalPhases.g:272:4: (lv_name_0_0= 'NUMBERS' )
            {
            // InternalPhases.g:272:4: (lv_name_0_0= 'NUMBERS' )
            // InternalPhases.g:273:5: lv_name_0_0= 'NUMBERS'
            {
            lv_name_0_0=(Token)match(input,12,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getNUMBERS_TYPEAccess().getNameNUMBERSKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNUMBERS_TYPERule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "NUMBERS");
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getNUMBERS_TYPEAccess().getColonKeyword_1());
            		
            // InternalPhases.g:289:3: ( (lv_numbersType_2_0= ruleNUMBERS ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=14 && LA3_0<=16)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPhases.g:290:4: (lv_numbersType_2_0= ruleNUMBERS )
            	    {
            	    // InternalPhases.g:290:4: (lv_numbersType_2_0= ruleNUMBERS )
            	    // InternalPhases.g:291:5: lv_numbersType_2_0= ruleNUMBERS
            	    {

            	    					newCompositeNode(grammarAccess.getNUMBERS_TYPEAccess().getNumbersTypeNUMBERSParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_numbersType_2_0=ruleNUMBERS();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNUMBERS_TYPERule());
            	    					}
            	    					add(
            	    						current,
            	    						"numbersType",
            	    						lv_numbersType_2_0,
            	    						"org.xtext.de.htwg.Phases.NUMBERS");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNUMBERS_TYPE"


    // $ANTLR start "entryRuleNUMBERS"
    // InternalPhases.g:312:1: entryRuleNUMBERS returns [String current=null] : iv_ruleNUMBERS= ruleNUMBERS EOF ;
    public final String entryRuleNUMBERS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBERS = null;


        try {
            // InternalPhases.g:312:47: (iv_ruleNUMBERS= ruleNUMBERS EOF )
            // InternalPhases.g:313:2: iv_ruleNUMBERS= ruleNUMBERS EOF
            {
             newCompositeNode(grammarAccess.getNUMBERSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNUMBERS=ruleNUMBERS();

            state._fsp--;

             current =iv_ruleNUMBERS.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNUMBERS"


    // $ANTLR start "ruleNUMBERS"
    // InternalPhases.g:319:1: ruleNUMBERS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'DOUBLE' | kw= 'TRIPLE' | kw= 'QUADRUPLE' ) ;
    public final AntlrDatatypeRuleToken ruleNUMBERS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPhases.g:325:2: ( (kw= 'DOUBLE' | kw= 'TRIPLE' | kw= 'QUADRUPLE' ) )
            // InternalPhases.g:326:2: (kw= 'DOUBLE' | kw= 'TRIPLE' | kw= 'QUADRUPLE' )
            {
            // InternalPhases.g:326:2: (kw= 'DOUBLE' | kw= 'TRIPLE' | kw= 'QUADRUPLE' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalPhases.g:327:3: kw= 'DOUBLE'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNUMBERSAccess().getDOUBLEKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPhases.g:333:3: kw= 'TRIPLE'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNUMBERSAccess().getTRIPLEKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPhases.g:339:3: kw= 'QUADRUPLE'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNUMBERSAccess().getQUADRUPLEKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNUMBERS"


    // $ANTLR start "entryRuleCOLORS_TYPE"
    // InternalPhases.g:348:1: entryRuleCOLORS_TYPE returns [EObject current=null] : iv_ruleCOLORS_TYPE= ruleCOLORS_TYPE EOF ;
    public final EObject entryRuleCOLORS_TYPE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCOLORS_TYPE = null;


        try {
            // InternalPhases.g:348:52: (iv_ruleCOLORS_TYPE= ruleCOLORS_TYPE EOF )
            // InternalPhases.g:349:2: iv_ruleCOLORS_TYPE= ruleCOLORS_TYPE EOF
            {
             newCompositeNode(grammarAccess.getCOLORS_TYPERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCOLORS_TYPE=ruleCOLORS_TYPE();

            state._fsp--;

             current =iv_ruleCOLORS_TYPE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCOLORS_TYPE"


    // $ANTLR start "ruleCOLORS_TYPE"
    // InternalPhases.g:355:1: ruleCOLORS_TYPE returns [EObject current=null] : ( ( (lv_name_0_0= 'COLORS' ) ) otherlv_1= ':' ( (lv_numberColors_2_0= RULE_INT ) ) ) ;
    public final EObject ruleCOLORS_TYPE() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_numberColors_2_0=null;


        	enterRule();

        try {
            // InternalPhases.g:361:2: ( ( ( (lv_name_0_0= 'COLORS' ) ) otherlv_1= ':' ( (lv_numberColors_2_0= RULE_INT ) ) ) )
            // InternalPhases.g:362:2: ( ( (lv_name_0_0= 'COLORS' ) ) otherlv_1= ':' ( (lv_numberColors_2_0= RULE_INT ) ) )
            {
            // InternalPhases.g:362:2: ( ( (lv_name_0_0= 'COLORS' ) ) otherlv_1= ':' ( (lv_numberColors_2_0= RULE_INT ) ) )
            // InternalPhases.g:363:3: ( (lv_name_0_0= 'COLORS' ) ) otherlv_1= ':' ( (lv_numberColors_2_0= RULE_INT ) )
            {
            // InternalPhases.g:363:3: ( (lv_name_0_0= 'COLORS' ) )
            // InternalPhases.g:364:4: (lv_name_0_0= 'COLORS' )
            {
            // InternalPhases.g:364:4: (lv_name_0_0= 'COLORS' )
            // InternalPhases.g:365:5: lv_name_0_0= 'COLORS'
            {
            lv_name_0_0=(Token)match(input,17,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCOLORS_TYPEAccess().getNameCOLORSKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCOLORS_TYPERule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "COLORS");
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCOLORS_TYPEAccess().getColonKeyword_1());
            		
            // InternalPhases.g:381:3: ( (lv_numberColors_2_0= RULE_INT ) )
            // InternalPhases.g:382:4: (lv_numberColors_2_0= RULE_INT )
            {
            // InternalPhases.g:382:4: (lv_numberColors_2_0= RULE_INT )
            // InternalPhases.g:383:5: lv_numberColors_2_0= RULE_INT
            {
            lv_numberColors_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_numberColors_2_0, grammarAccess.getCOLORS_TYPEAccess().getNumberColorsINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCOLORS_TYPERule());
            					}
            					setWithLastConsumed(
            						current,
            						"numberColors",
            						lv_numberColors_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCOLORS_TYPE"


    // $ANTLR start "entryRuleSTREET_TYPE"
    // InternalPhases.g:403:1: entryRuleSTREET_TYPE returns [EObject current=null] : iv_ruleSTREET_TYPE= ruleSTREET_TYPE EOF ;
    public final EObject entryRuleSTREET_TYPE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSTREET_TYPE = null;


        try {
            // InternalPhases.g:403:52: (iv_ruleSTREET_TYPE= ruleSTREET_TYPE EOF )
            // InternalPhases.g:404:2: iv_ruleSTREET_TYPE= ruleSTREET_TYPE EOF
            {
             newCompositeNode(grammarAccess.getSTREET_TYPERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSTREET_TYPE=ruleSTREET_TYPE();

            state._fsp--;

             current =iv_ruleSTREET_TYPE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSTREET_TYPE"


    // $ANTLR start "ruleSTREET_TYPE"
    // InternalPhases.g:410:1: ruleSTREET_TYPE returns [EObject current=null] : ( ( (lv_name_0_0= 'STREET' ) ) otherlv_1= ':' ( (lv_streetLenght_2_0= RULE_INT ) ) ) ;
    public final EObject ruleSTREET_TYPE() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_streetLenght_2_0=null;


        	enterRule();

        try {
            // InternalPhases.g:416:2: ( ( ( (lv_name_0_0= 'STREET' ) ) otherlv_1= ':' ( (lv_streetLenght_2_0= RULE_INT ) ) ) )
            // InternalPhases.g:417:2: ( ( (lv_name_0_0= 'STREET' ) ) otherlv_1= ':' ( (lv_streetLenght_2_0= RULE_INT ) ) )
            {
            // InternalPhases.g:417:2: ( ( (lv_name_0_0= 'STREET' ) ) otherlv_1= ':' ( (lv_streetLenght_2_0= RULE_INT ) ) )
            // InternalPhases.g:418:3: ( (lv_name_0_0= 'STREET' ) ) otherlv_1= ':' ( (lv_streetLenght_2_0= RULE_INT ) )
            {
            // InternalPhases.g:418:3: ( (lv_name_0_0= 'STREET' ) )
            // InternalPhases.g:419:4: (lv_name_0_0= 'STREET' )
            {
            // InternalPhases.g:419:4: (lv_name_0_0= 'STREET' )
            // InternalPhases.g:420:5: lv_name_0_0= 'STREET'
            {
            lv_name_0_0=(Token)match(input,18,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSTREET_TYPEAccess().getNameSTREETKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSTREET_TYPERule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "STREET");
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSTREET_TYPEAccess().getColonKeyword_1());
            		
            // InternalPhases.g:436:3: ( (lv_streetLenght_2_0= RULE_INT ) )
            // InternalPhases.g:437:4: (lv_streetLenght_2_0= RULE_INT )
            {
            // InternalPhases.g:437:4: (lv_streetLenght_2_0= RULE_INT )
            // InternalPhases.g:438:5: lv_streetLenght_2_0= RULE_INT
            {
            lv_streetLenght_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_streetLenght_2_0, grammarAccess.getSTREET_TYPEAccess().getStreetLenghtINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSTREET_TYPERule());
            					}
            					setWithLastConsumed(
            						current,
            						"streetLenght",
            						lv_streetLenght_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSTREET_TYPE"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000061000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000001C002L});

}