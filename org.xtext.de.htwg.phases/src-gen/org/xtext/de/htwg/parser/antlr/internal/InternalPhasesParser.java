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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PHASE'", "'NUMBERS'", "':'", "'DOUBLE'", "'TRIPLE'", "'QUADRUPLE'", "'COLORS'", "'STREET'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
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
    // InternalPhases.g:71:1: ruleGame returns [EObject current=null] : ( ( (lv_phase1_0_0= rulePhase ) ) ( (lv_phase2_1_0= rulePhase ) ) ( (lv_phase3_2_0= rulePhase ) ) ( (lv_phase4_3_0= rulePhase ) ) ( (lv_phase5_4_0= rulePhase ) ) ) ;
    public final EObject ruleGame() throws RecognitionException {
        EObject current = null;

        EObject lv_phase1_0_0 = null;

        EObject lv_phase2_1_0 = null;

        EObject lv_phase3_2_0 = null;

        EObject lv_phase4_3_0 = null;

        EObject lv_phase5_4_0 = null;



        	enterRule();

        try {
            // InternalPhases.g:77:2: ( ( ( (lv_phase1_0_0= rulePhase ) ) ( (lv_phase2_1_0= rulePhase ) ) ( (lv_phase3_2_0= rulePhase ) ) ( (lv_phase4_3_0= rulePhase ) ) ( (lv_phase5_4_0= rulePhase ) ) ) )
            // InternalPhases.g:78:2: ( ( (lv_phase1_0_0= rulePhase ) ) ( (lv_phase2_1_0= rulePhase ) ) ( (lv_phase3_2_0= rulePhase ) ) ( (lv_phase4_3_0= rulePhase ) ) ( (lv_phase5_4_0= rulePhase ) ) )
            {
            // InternalPhases.g:78:2: ( ( (lv_phase1_0_0= rulePhase ) ) ( (lv_phase2_1_0= rulePhase ) ) ( (lv_phase3_2_0= rulePhase ) ) ( (lv_phase4_3_0= rulePhase ) ) ( (lv_phase5_4_0= rulePhase ) ) )
            // InternalPhases.g:79:3: ( (lv_phase1_0_0= rulePhase ) ) ( (lv_phase2_1_0= rulePhase ) ) ( (lv_phase3_2_0= rulePhase ) ) ( (lv_phase4_3_0= rulePhase ) ) ( (lv_phase5_4_0= rulePhase ) )
            {
            // InternalPhases.g:79:3: ( (lv_phase1_0_0= rulePhase ) )
            // InternalPhases.g:80:4: (lv_phase1_0_0= rulePhase )
            {
            // InternalPhases.g:80:4: (lv_phase1_0_0= rulePhase )
            // InternalPhases.g:81:5: lv_phase1_0_0= rulePhase
            {

            					newCompositeNode(grammarAccess.getGameAccess().getPhase1PhaseParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_phase1_0_0=rulePhase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameRule());
            					}
            					set(
            						current,
            						"phase1",
            						lv_phase1_0_0,
            						"org.xtext.de.htwg.Phases.Phase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPhases.g:98:3: ( (lv_phase2_1_0= rulePhase ) )
            // InternalPhases.g:99:4: (lv_phase2_1_0= rulePhase )
            {
            // InternalPhases.g:99:4: (lv_phase2_1_0= rulePhase )
            // InternalPhases.g:100:5: lv_phase2_1_0= rulePhase
            {

            					newCompositeNode(grammarAccess.getGameAccess().getPhase2PhaseParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_phase2_1_0=rulePhase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameRule());
            					}
            					set(
            						current,
            						"phase2",
            						lv_phase2_1_0,
            						"org.xtext.de.htwg.Phases.Phase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPhases.g:117:3: ( (lv_phase3_2_0= rulePhase ) )
            // InternalPhases.g:118:4: (lv_phase3_2_0= rulePhase )
            {
            // InternalPhases.g:118:4: (lv_phase3_2_0= rulePhase )
            // InternalPhases.g:119:5: lv_phase3_2_0= rulePhase
            {

            					newCompositeNode(grammarAccess.getGameAccess().getPhase3PhaseParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_phase3_2_0=rulePhase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameRule());
            					}
            					set(
            						current,
            						"phase3",
            						lv_phase3_2_0,
            						"org.xtext.de.htwg.Phases.Phase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPhases.g:136:3: ( (lv_phase4_3_0= rulePhase ) )
            // InternalPhases.g:137:4: (lv_phase4_3_0= rulePhase )
            {
            // InternalPhases.g:137:4: (lv_phase4_3_0= rulePhase )
            // InternalPhases.g:138:5: lv_phase4_3_0= rulePhase
            {

            					newCompositeNode(grammarAccess.getGameAccess().getPhase4PhaseParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_3);
            lv_phase4_3_0=rulePhase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameRule());
            					}
            					set(
            						current,
            						"phase4",
            						lv_phase4_3_0,
            						"org.xtext.de.htwg.Phases.Phase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPhases.g:155:3: ( (lv_phase5_4_0= rulePhase ) )
            // InternalPhases.g:156:4: (lv_phase5_4_0= rulePhase )
            {
            // InternalPhases.g:156:4: (lv_phase5_4_0= rulePhase )
            // InternalPhases.g:157:5: lv_phase5_4_0= rulePhase
            {

            					newCompositeNode(grammarAccess.getGameAccess().getPhase5PhaseParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_phase5_4_0=rulePhase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameRule());
            					}
            					set(
            						current,
            						"phase5",
            						lv_phase5_4_0,
            						"org.xtext.de.htwg.Phases.Phase");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleGame"


    // $ANTLR start "entryRulePhase"
    // InternalPhases.g:178:1: entryRulePhase returns [EObject current=null] : iv_rulePhase= rulePhase EOF ;
    public final EObject entryRulePhase() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhase = null;


        try {
            // InternalPhases.g:178:46: (iv_rulePhase= rulePhase EOF )
            // InternalPhases.g:179:2: iv_rulePhase= rulePhase EOF
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
    // InternalPhases.g:185:1: rulePhase returns [EObject current=null] : (otherlv_0= 'PHASE' ( (lv_phaseNumber_1_0= RULE_INT ) ) ( (lv_phaseType_2_0= rulePhaseType ) ) ) ;
    public final EObject rulePhase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_phaseNumber_1_0=null;
        EObject lv_phaseType_2_0 = null;



        	enterRule();

        try {
            // InternalPhases.g:191:2: ( (otherlv_0= 'PHASE' ( (lv_phaseNumber_1_0= RULE_INT ) ) ( (lv_phaseType_2_0= rulePhaseType ) ) ) )
            // InternalPhases.g:192:2: (otherlv_0= 'PHASE' ( (lv_phaseNumber_1_0= RULE_INT ) ) ( (lv_phaseType_2_0= rulePhaseType ) ) )
            {
            // InternalPhases.g:192:2: (otherlv_0= 'PHASE' ( (lv_phaseNumber_1_0= RULE_INT ) ) ( (lv_phaseType_2_0= rulePhaseType ) ) )
            // InternalPhases.g:193:3: otherlv_0= 'PHASE' ( (lv_phaseNumber_1_0= RULE_INT ) ) ( (lv_phaseType_2_0= rulePhaseType ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPhaseAccess().getPHASEKeyword_0());
            		
            // InternalPhases.g:197:3: ( (lv_phaseNumber_1_0= RULE_INT ) )
            // InternalPhases.g:198:4: (lv_phaseNumber_1_0= RULE_INT )
            {
            // InternalPhases.g:198:4: (lv_phaseNumber_1_0= RULE_INT )
            // InternalPhases.g:199:5: lv_phaseNumber_1_0= RULE_INT
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

            // InternalPhases.g:215:3: ( (lv_phaseType_2_0= rulePhaseType ) )
            // InternalPhases.g:216:4: (lv_phaseType_2_0= rulePhaseType )
            {
            // InternalPhases.g:216:4: (lv_phaseType_2_0= rulePhaseType )
            // InternalPhases.g:217:5: lv_phaseType_2_0= rulePhaseType
            {

            					newCompositeNode(grammarAccess.getPhaseAccess().getPhaseTypePhaseTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
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
    // InternalPhases.g:238:1: entryRulePhaseType returns [EObject current=null] : iv_rulePhaseType= rulePhaseType EOF ;
    public final EObject entryRulePhaseType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhaseType = null;


        try {
            // InternalPhases.g:238:50: (iv_rulePhaseType= rulePhaseType EOF )
            // InternalPhases.g:239:2: iv_rulePhaseType= rulePhaseType EOF
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
    // InternalPhases.g:245:1: rulePhaseType returns [EObject current=null] : ( ( (lv_streetType_0_0= ruleSTREET_TYPE ) ) | ( (lv_numbersType_1_0= ruleNUMBERS_TYPE ) ) | ( (lv_colorType_2_0= ruleCOLORS_TYPE ) ) ) ;
    public final EObject rulePhaseType() throws RecognitionException {
        EObject current = null;

        EObject lv_streetType_0_0 = null;

        EObject lv_numbersType_1_0 = null;

        EObject lv_colorType_2_0 = null;



        	enterRule();

        try {
            // InternalPhases.g:251:2: ( ( ( (lv_streetType_0_0= ruleSTREET_TYPE ) ) | ( (lv_numbersType_1_0= ruleNUMBERS_TYPE ) ) | ( (lv_colorType_2_0= ruleCOLORS_TYPE ) ) ) )
            // InternalPhases.g:252:2: ( ( (lv_streetType_0_0= ruleSTREET_TYPE ) ) | ( (lv_numbersType_1_0= ruleNUMBERS_TYPE ) ) | ( (lv_colorType_2_0= ruleCOLORS_TYPE ) ) )
            {
            // InternalPhases.g:252:2: ( ( (lv_streetType_0_0= ruleSTREET_TYPE ) ) | ( (lv_numbersType_1_0= ruleNUMBERS_TYPE ) ) | ( (lv_colorType_2_0= ruleCOLORS_TYPE ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 17:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalPhases.g:253:3: ( (lv_streetType_0_0= ruleSTREET_TYPE ) )
                    {
                    // InternalPhases.g:253:3: ( (lv_streetType_0_0= ruleSTREET_TYPE ) )
                    // InternalPhases.g:254:4: (lv_streetType_0_0= ruleSTREET_TYPE )
                    {
                    // InternalPhases.g:254:4: (lv_streetType_0_0= ruleSTREET_TYPE )
                    // InternalPhases.g:255:5: lv_streetType_0_0= ruleSTREET_TYPE
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
                    // InternalPhases.g:273:3: ( (lv_numbersType_1_0= ruleNUMBERS_TYPE ) )
                    {
                    // InternalPhases.g:273:3: ( (lv_numbersType_1_0= ruleNUMBERS_TYPE ) )
                    // InternalPhases.g:274:4: (lv_numbersType_1_0= ruleNUMBERS_TYPE )
                    {
                    // InternalPhases.g:274:4: (lv_numbersType_1_0= ruleNUMBERS_TYPE )
                    // InternalPhases.g:275:5: lv_numbersType_1_0= ruleNUMBERS_TYPE
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
                    // InternalPhases.g:293:3: ( (lv_colorType_2_0= ruleCOLORS_TYPE ) )
                    {
                    // InternalPhases.g:293:3: ( (lv_colorType_2_0= ruleCOLORS_TYPE ) )
                    // InternalPhases.g:294:4: (lv_colorType_2_0= ruleCOLORS_TYPE )
                    {
                    // InternalPhases.g:294:4: (lv_colorType_2_0= ruleCOLORS_TYPE )
                    // InternalPhases.g:295:5: lv_colorType_2_0= ruleCOLORS_TYPE
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
    // InternalPhases.g:316:1: entryRuleNUMBERS_TYPE returns [EObject current=null] : iv_ruleNUMBERS_TYPE= ruleNUMBERS_TYPE EOF ;
    public final EObject entryRuleNUMBERS_TYPE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNUMBERS_TYPE = null;


        try {
            // InternalPhases.g:316:53: (iv_ruleNUMBERS_TYPE= ruleNUMBERS_TYPE EOF )
            // InternalPhases.g:317:2: iv_ruleNUMBERS_TYPE= ruleNUMBERS_TYPE EOF
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
    // InternalPhases.g:323:1: ruleNUMBERS_TYPE returns [EObject current=null] : ( ( (lv_name_0_0= 'NUMBERS' ) ) otherlv_1= ':' ( (lv_numbersType_2_0= ruleNUMBERS ) )* ) ;
    public final EObject ruleNUMBERS_TYPE() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_numbersType_2_0 = null;



        	enterRule();

        try {
            // InternalPhases.g:329:2: ( ( ( (lv_name_0_0= 'NUMBERS' ) ) otherlv_1= ':' ( (lv_numbersType_2_0= ruleNUMBERS ) )* ) )
            // InternalPhases.g:330:2: ( ( (lv_name_0_0= 'NUMBERS' ) ) otherlv_1= ':' ( (lv_numbersType_2_0= ruleNUMBERS ) )* )
            {
            // InternalPhases.g:330:2: ( ( (lv_name_0_0= 'NUMBERS' ) ) otherlv_1= ':' ( (lv_numbersType_2_0= ruleNUMBERS ) )* )
            // InternalPhases.g:331:3: ( (lv_name_0_0= 'NUMBERS' ) ) otherlv_1= ':' ( (lv_numbersType_2_0= ruleNUMBERS ) )*
            {
            // InternalPhases.g:331:3: ( (lv_name_0_0= 'NUMBERS' ) )
            // InternalPhases.g:332:4: (lv_name_0_0= 'NUMBERS' )
            {
            // InternalPhases.g:332:4: (lv_name_0_0= 'NUMBERS' )
            // InternalPhases.g:333:5: lv_name_0_0= 'NUMBERS'
            {
            lv_name_0_0=(Token)match(input,12,FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getNUMBERS_TYPEAccess().getNameNUMBERSKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNUMBERS_TYPERule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "NUMBERS");
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getNUMBERS_TYPEAccess().getColonKeyword_1());
            		
            // InternalPhases.g:349:3: ( (lv_numbersType_2_0= ruleNUMBERS ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=14 && LA2_0<=16)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPhases.g:350:4: (lv_numbersType_2_0= ruleNUMBERS )
            	    {
            	    // InternalPhases.g:350:4: (lv_numbersType_2_0= ruleNUMBERS )
            	    // InternalPhases.g:351:5: lv_numbersType_2_0= ruleNUMBERS
            	    {

            	    					newCompositeNode(grammarAccess.getNUMBERS_TYPEAccess().getNumbersTypeNUMBERSParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_7);
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
            	    break loop2;
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
    // InternalPhases.g:372:1: entryRuleNUMBERS returns [String current=null] : iv_ruleNUMBERS= ruleNUMBERS EOF ;
    public final String entryRuleNUMBERS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBERS = null;


        try {
            // InternalPhases.g:372:47: (iv_ruleNUMBERS= ruleNUMBERS EOF )
            // InternalPhases.g:373:2: iv_ruleNUMBERS= ruleNUMBERS EOF
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
    // InternalPhases.g:379:1: ruleNUMBERS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'DOUBLE' | kw= 'TRIPLE' | kw= 'QUADRUPLE' ) ;
    public final AntlrDatatypeRuleToken ruleNUMBERS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPhases.g:385:2: ( (kw= 'DOUBLE' | kw= 'TRIPLE' | kw= 'QUADRUPLE' ) )
            // InternalPhases.g:386:2: (kw= 'DOUBLE' | kw= 'TRIPLE' | kw= 'QUADRUPLE' )
            {
            // InternalPhases.g:386:2: (kw= 'DOUBLE' | kw= 'TRIPLE' | kw= 'QUADRUPLE' )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalPhases.g:387:3: kw= 'DOUBLE'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNUMBERSAccess().getDOUBLEKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPhases.g:393:3: kw= 'TRIPLE'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNUMBERSAccess().getTRIPLEKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPhases.g:399:3: kw= 'QUADRUPLE'
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
    // InternalPhases.g:408:1: entryRuleCOLORS_TYPE returns [EObject current=null] : iv_ruleCOLORS_TYPE= ruleCOLORS_TYPE EOF ;
    public final EObject entryRuleCOLORS_TYPE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCOLORS_TYPE = null;


        try {
            // InternalPhases.g:408:52: (iv_ruleCOLORS_TYPE= ruleCOLORS_TYPE EOF )
            // InternalPhases.g:409:2: iv_ruleCOLORS_TYPE= ruleCOLORS_TYPE EOF
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
    // InternalPhases.g:415:1: ruleCOLORS_TYPE returns [EObject current=null] : ( ( (lv_name_0_0= 'COLORS' ) ) otherlv_1= ':' ( (lv_numberColors_2_0= RULE_INT ) ) ) ;
    public final EObject ruleCOLORS_TYPE() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_numberColors_2_0=null;


        	enterRule();

        try {
            // InternalPhases.g:421:2: ( ( ( (lv_name_0_0= 'COLORS' ) ) otherlv_1= ':' ( (lv_numberColors_2_0= RULE_INT ) ) ) )
            // InternalPhases.g:422:2: ( ( (lv_name_0_0= 'COLORS' ) ) otherlv_1= ':' ( (lv_numberColors_2_0= RULE_INT ) ) )
            {
            // InternalPhases.g:422:2: ( ( (lv_name_0_0= 'COLORS' ) ) otherlv_1= ':' ( (lv_numberColors_2_0= RULE_INT ) ) )
            // InternalPhases.g:423:3: ( (lv_name_0_0= 'COLORS' ) ) otherlv_1= ':' ( (lv_numberColors_2_0= RULE_INT ) )
            {
            // InternalPhases.g:423:3: ( (lv_name_0_0= 'COLORS' ) )
            // InternalPhases.g:424:4: (lv_name_0_0= 'COLORS' )
            {
            // InternalPhases.g:424:4: (lv_name_0_0= 'COLORS' )
            // InternalPhases.g:425:5: lv_name_0_0= 'COLORS'
            {
            lv_name_0_0=(Token)match(input,17,FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCOLORS_TYPEAccess().getNameCOLORSKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCOLORS_TYPERule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "COLORS");
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCOLORS_TYPEAccess().getColonKeyword_1());
            		
            // InternalPhases.g:441:3: ( (lv_numberColors_2_0= RULE_INT ) )
            // InternalPhases.g:442:4: (lv_numberColors_2_0= RULE_INT )
            {
            // InternalPhases.g:442:4: (lv_numberColors_2_0= RULE_INT )
            // InternalPhases.g:443:5: lv_numberColors_2_0= RULE_INT
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
    // InternalPhases.g:463:1: entryRuleSTREET_TYPE returns [EObject current=null] : iv_ruleSTREET_TYPE= ruleSTREET_TYPE EOF ;
    public final EObject entryRuleSTREET_TYPE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSTREET_TYPE = null;


        try {
            // InternalPhases.g:463:52: (iv_ruleSTREET_TYPE= ruleSTREET_TYPE EOF )
            // InternalPhases.g:464:2: iv_ruleSTREET_TYPE= ruleSTREET_TYPE EOF
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
    // InternalPhases.g:470:1: ruleSTREET_TYPE returns [EObject current=null] : ( ( (lv_name_0_0= 'STREET' ) ) otherlv_1= ':' ( (lv_streetLenght_2_0= RULE_INT ) ) ) ;
    public final EObject ruleSTREET_TYPE() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_streetLenght_2_0=null;


        	enterRule();

        try {
            // InternalPhases.g:476:2: ( ( ( (lv_name_0_0= 'STREET' ) ) otherlv_1= ':' ( (lv_streetLenght_2_0= RULE_INT ) ) ) )
            // InternalPhases.g:477:2: ( ( (lv_name_0_0= 'STREET' ) ) otherlv_1= ':' ( (lv_streetLenght_2_0= RULE_INT ) ) )
            {
            // InternalPhases.g:477:2: ( ( (lv_name_0_0= 'STREET' ) ) otherlv_1= ':' ( (lv_streetLenght_2_0= RULE_INT ) ) )
            // InternalPhases.g:478:3: ( (lv_name_0_0= 'STREET' ) ) otherlv_1= ':' ( (lv_streetLenght_2_0= RULE_INT ) )
            {
            // InternalPhases.g:478:3: ( (lv_name_0_0= 'STREET' ) )
            // InternalPhases.g:479:4: (lv_name_0_0= 'STREET' )
            {
            // InternalPhases.g:479:4: (lv_name_0_0= 'STREET' )
            // InternalPhases.g:480:5: lv_name_0_0= 'STREET'
            {
            lv_name_0_0=(Token)match(input,18,FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSTREET_TYPEAccess().getNameSTREETKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSTREET_TYPERule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "STREET");
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSTREET_TYPEAccess().getColonKeyword_1());
            		
            // InternalPhases.g:496:3: ( (lv_streetLenght_2_0= RULE_INT ) )
            // InternalPhases.g:497:4: (lv_streetLenght_2_0= RULE_INT )
            {
            // InternalPhases.g:497:4: (lv_streetLenght_2_0= RULE_INT )
            // InternalPhases.g:498:5: lv_streetLenght_2_0= RULE_INT
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000061000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000001C002L});

}