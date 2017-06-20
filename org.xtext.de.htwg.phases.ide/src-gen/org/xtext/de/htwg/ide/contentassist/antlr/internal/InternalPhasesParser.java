package org.xtext.de.htwg.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.de.htwg.services.PhasesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPhasesParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DOUBLE'", "'TRIPLE'", "'QUADRUPLE'", "'PHASE'", "':'", "'NUMBERS'", "'COLORS'", "'STREET'"
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

    	public void setGrammarAccess(PhasesGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleGame"
    // InternalPhases.g:53:1: entryRuleGame : ruleGame EOF ;
    public final void entryRuleGame() throws RecognitionException {
        try {
            // InternalPhases.g:54:1: ( ruleGame EOF )
            // InternalPhases.g:55:1: ruleGame EOF
            {
             before(grammarAccess.getGameRule()); 
            pushFollow(FOLLOW_1);
            ruleGame();

            state._fsp--;

             after(grammarAccess.getGameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGame"


    // $ANTLR start "ruleGame"
    // InternalPhases.g:62:1: ruleGame : ( ( rule__Game__Group__0 ) ) ;
    public final void ruleGame() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:66:2: ( ( ( rule__Game__Group__0 ) ) )
            // InternalPhases.g:67:2: ( ( rule__Game__Group__0 ) )
            {
            // InternalPhases.g:67:2: ( ( rule__Game__Group__0 ) )
            // InternalPhases.g:68:3: ( rule__Game__Group__0 )
            {
             before(grammarAccess.getGameAccess().getGroup()); 
            // InternalPhases.g:69:3: ( rule__Game__Group__0 )
            // InternalPhases.g:69:4: rule__Game__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGame"


    // $ANTLR start "entryRulePhase"
    // InternalPhases.g:78:1: entryRulePhase : rulePhase EOF ;
    public final void entryRulePhase() throws RecognitionException {
        try {
            // InternalPhases.g:79:1: ( rulePhase EOF )
            // InternalPhases.g:80:1: rulePhase EOF
            {
             before(grammarAccess.getPhaseRule()); 
            pushFollow(FOLLOW_1);
            rulePhase();

            state._fsp--;

             after(grammarAccess.getPhaseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePhase"


    // $ANTLR start "rulePhase"
    // InternalPhases.g:87:1: rulePhase : ( ( rule__Phase__Group__0 ) ) ;
    public final void rulePhase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:91:2: ( ( ( rule__Phase__Group__0 ) ) )
            // InternalPhases.g:92:2: ( ( rule__Phase__Group__0 ) )
            {
            // InternalPhases.g:92:2: ( ( rule__Phase__Group__0 ) )
            // InternalPhases.g:93:3: ( rule__Phase__Group__0 )
            {
             before(grammarAccess.getPhaseAccess().getGroup()); 
            // InternalPhases.g:94:3: ( rule__Phase__Group__0 )
            // InternalPhases.g:94:4: rule__Phase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Phase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPhaseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePhase"


    // $ANTLR start "entryRulePhaseType"
    // InternalPhases.g:103:1: entryRulePhaseType : rulePhaseType EOF ;
    public final void entryRulePhaseType() throws RecognitionException {
        try {
            // InternalPhases.g:104:1: ( rulePhaseType EOF )
            // InternalPhases.g:105:1: rulePhaseType EOF
            {
             before(grammarAccess.getPhaseTypeRule()); 
            pushFollow(FOLLOW_1);
            rulePhaseType();

            state._fsp--;

             after(grammarAccess.getPhaseTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePhaseType"


    // $ANTLR start "rulePhaseType"
    // InternalPhases.g:112:1: rulePhaseType : ( ( rule__PhaseType__Alternatives ) ) ;
    public final void rulePhaseType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:116:2: ( ( ( rule__PhaseType__Alternatives ) ) )
            // InternalPhases.g:117:2: ( ( rule__PhaseType__Alternatives ) )
            {
            // InternalPhases.g:117:2: ( ( rule__PhaseType__Alternatives ) )
            // InternalPhases.g:118:3: ( rule__PhaseType__Alternatives )
            {
             before(grammarAccess.getPhaseTypeAccess().getAlternatives()); 
            // InternalPhases.g:119:3: ( rule__PhaseType__Alternatives )
            // InternalPhases.g:119:4: rule__PhaseType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PhaseType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPhaseTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePhaseType"


    // $ANTLR start "entryRuleNUMBERS_TYPE"
    // InternalPhases.g:128:1: entryRuleNUMBERS_TYPE : ruleNUMBERS_TYPE EOF ;
    public final void entryRuleNUMBERS_TYPE() throws RecognitionException {
        try {
            // InternalPhases.g:129:1: ( ruleNUMBERS_TYPE EOF )
            // InternalPhases.g:130:1: ruleNUMBERS_TYPE EOF
            {
             before(grammarAccess.getNUMBERS_TYPERule()); 
            pushFollow(FOLLOW_1);
            ruleNUMBERS_TYPE();

            state._fsp--;

             after(grammarAccess.getNUMBERS_TYPERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNUMBERS_TYPE"


    // $ANTLR start "ruleNUMBERS_TYPE"
    // InternalPhases.g:137:1: ruleNUMBERS_TYPE : ( ( rule__NUMBERS_TYPE__Group__0 ) ) ;
    public final void ruleNUMBERS_TYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:141:2: ( ( ( rule__NUMBERS_TYPE__Group__0 ) ) )
            // InternalPhases.g:142:2: ( ( rule__NUMBERS_TYPE__Group__0 ) )
            {
            // InternalPhases.g:142:2: ( ( rule__NUMBERS_TYPE__Group__0 ) )
            // InternalPhases.g:143:3: ( rule__NUMBERS_TYPE__Group__0 )
            {
             before(grammarAccess.getNUMBERS_TYPEAccess().getGroup()); 
            // InternalPhases.g:144:3: ( rule__NUMBERS_TYPE__Group__0 )
            // InternalPhases.g:144:4: rule__NUMBERS_TYPE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NUMBERS_TYPE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNUMBERS_TYPEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNUMBERS_TYPE"


    // $ANTLR start "entryRuleNUMBERS"
    // InternalPhases.g:153:1: entryRuleNUMBERS : ruleNUMBERS EOF ;
    public final void entryRuleNUMBERS() throws RecognitionException {
        try {
            // InternalPhases.g:154:1: ( ruleNUMBERS EOF )
            // InternalPhases.g:155:1: ruleNUMBERS EOF
            {
             before(grammarAccess.getNUMBERSRule()); 
            pushFollow(FOLLOW_1);
            ruleNUMBERS();

            state._fsp--;

             after(grammarAccess.getNUMBERSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNUMBERS"


    // $ANTLR start "ruleNUMBERS"
    // InternalPhases.g:162:1: ruleNUMBERS : ( ( rule__NUMBERS__Alternatives ) ) ;
    public final void ruleNUMBERS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:166:2: ( ( ( rule__NUMBERS__Alternatives ) ) )
            // InternalPhases.g:167:2: ( ( rule__NUMBERS__Alternatives ) )
            {
            // InternalPhases.g:167:2: ( ( rule__NUMBERS__Alternatives ) )
            // InternalPhases.g:168:3: ( rule__NUMBERS__Alternatives )
            {
             before(grammarAccess.getNUMBERSAccess().getAlternatives()); 
            // InternalPhases.g:169:3: ( rule__NUMBERS__Alternatives )
            // InternalPhases.g:169:4: rule__NUMBERS__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NUMBERS__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNUMBERSAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNUMBERS"


    // $ANTLR start "entryRuleCOLORS_TYPE"
    // InternalPhases.g:178:1: entryRuleCOLORS_TYPE : ruleCOLORS_TYPE EOF ;
    public final void entryRuleCOLORS_TYPE() throws RecognitionException {
        try {
            // InternalPhases.g:179:1: ( ruleCOLORS_TYPE EOF )
            // InternalPhases.g:180:1: ruleCOLORS_TYPE EOF
            {
             before(grammarAccess.getCOLORS_TYPERule()); 
            pushFollow(FOLLOW_1);
            ruleCOLORS_TYPE();

            state._fsp--;

             after(grammarAccess.getCOLORS_TYPERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCOLORS_TYPE"


    // $ANTLR start "ruleCOLORS_TYPE"
    // InternalPhases.g:187:1: ruleCOLORS_TYPE : ( ( rule__COLORS_TYPE__Group__0 ) ) ;
    public final void ruleCOLORS_TYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:191:2: ( ( ( rule__COLORS_TYPE__Group__0 ) ) )
            // InternalPhases.g:192:2: ( ( rule__COLORS_TYPE__Group__0 ) )
            {
            // InternalPhases.g:192:2: ( ( rule__COLORS_TYPE__Group__0 ) )
            // InternalPhases.g:193:3: ( rule__COLORS_TYPE__Group__0 )
            {
             before(grammarAccess.getCOLORS_TYPEAccess().getGroup()); 
            // InternalPhases.g:194:3: ( rule__COLORS_TYPE__Group__0 )
            // InternalPhases.g:194:4: rule__COLORS_TYPE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__COLORS_TYPE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCOLORS_TYPEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCOLORS_TYPE"


    // $ANTLR start "entryRuleSTREET_TYPE"
    // InternalPhases.g:203:1: entryRuleSTREET_TYPE : ruleSTREET_TYPE EOF ;
    public final void entryRuleSTREET_TYPE() throws RecognitionException {
        try {
            // InternalPhases.g:204:1: ( ruleSTREET_TYPE EOF )
            // InternalPhases.g:205:1: ruleSTREET_TYPE EOF
            {
             before(grammarAccess.getSTREET_TYPERule()); 
            pushFollow(FOLLOW_1);
            ruleSTREET_TYPE();

            state._fsp--;

             after(grammarAccess.getSTREET_TYPERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSTREET_TYPE"


    // $ANTLR start "ruleSTREET_TYPE"
    // InternalPhases.g:212:1: ruleSTREET_TYPE : ( ( rule__STREET_TYPE__Group__0 ) ) ;
    public final void ruleSTREET_TYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:216:2: ( ( ( rule__STREET_TYPE__Group__0 ) ) )
            // InternalPhases.g:217:2: ( ( rule__STREET_TYPE__Group__0 ) )
            {
            // InternalPhases.g:217:2: ( ( rule__STREET_TYPE__Group__0 ) )
            // InternalPhases.g:218:3: ( rule__STREET_TYPE__Group__0 )
            {
             before(grammarAccess.getSTREET_TYPEAccess().getGroup()); 
            // InternalPhases.g:219:3: ( rule__STREET_TYPE__Group__0 )
            // InternalPhases.g:219:4: rule__STREET_TYPE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__STREET_TYPE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSTREET_TYPEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSTREET_TYPE"


    // $ANTLR start "rule__PhaseType__Alternatives"
    // InternalPhases.g:227:1: rule__PhaseType__Alternatives : ( ( ( rule__PhaseType__StreetTypeAssignment_0 ) ) | ( ( rule__PhaseType__NumbersTypeAssignment_1 ) ) | ( ( rule__PhaseType__ColorTypeAssignment_2 ) ) );
    public final void rule__PhaseType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:231:1: ( ( ( rule__PhaseType__StreetTypeAssignment_0 ) ) | ( ( rule__PhaseType__NumbersTypeAssignment_1 ) ) | ( ( rule__PhaseType__ColorTypeAssignment_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt1=1;
                }
                break;
            case 16:
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
                    // InternalPhases.g:232:2: ( ( rule__PhaseType__StreetTypeAssignment_0 ) )
                    {
                    // InternalPhases.g:232:2: ( ( rule__PhaseType__StreetTypeAssignment_0 ) )
                    // InternalPhases.g:233:3: ( rule__PhaseType__StreetTypeAssignment_0 )
                    {
                     before(grammarAccess.getPhaseTypeAccess().getStreetTypeAssignment_0()); 
                    // InternalPhases.g:234:3: ( rule__PhaseType__StreetTypeAssignment_0 )
                    // InternalPhases.g:234:4: rule__PhaseType__StreetTypeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PhaseType__StreetTypeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPhaseTypeAccess().getStreetTypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPhases.g:238:2: ( ( rule__PhaseType__NumbersTypeAssignment_1 ) )
                    {
                    // InternalPhases.g:238:2: ( ( rule__PhaseType__NumbersTypeAssignment_1 ) )
                    // InternalPhases.g:239:3: ( rule__PhaseType__NumbersTypeAssignment_1 )
                    {
                     before(grammarAccess.getPhaseTypeAccess().getNumbersTypeAssignment_1()); 
                    // InternalPhases.g:240:3: ( rule__PhaseType__NumbersTypeAssignment_1 )
                    // InternalPhases.g:240:4: rule__PhaseType__NumbersTypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PhaseType__NumbersTypeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPhaseTypeAccess().getNumbersTypeAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPhases.g:244:2: ( ( rule__PhaseType__ColorTypeAssignment_2 ) )
                    {
                    // InternalPhases.g:244:2: ( ( rule__PhaseType__ColorTypeAssignment_2 ) )
                    // InternalPhases.g:245:3: ( rule__PhaseType__ColorTypeAssignment_2 )
                    {
                     before(grammarAccess.getPhaseTypeAccess().getColorTypeAssignment_2()); 
                    // InternalPhases.g:246:3: ( rule__PhaseType__ColorTypeAssignment_2 )
                    // InternalPhases.g:246:4: rule__PhaseType__ColorTypeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__PhaseType__ColorTypeAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getPhaseTypeAccess().getColorTypeAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhaseType__Alternatives"


    // $ANTLR start "rule__NUMBERS__Alternatives"
    // InternalPhases.g:254:1: rule__NUMBERS__Alternatives : ( ( 'DOUBLE' ) | ( 'TRIPLE' ) | ( 'QUADRUPLE' ) );
    public final void rule__NUMBERS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:258:1: ( ( 'DOUBLE' ) | ( 'TRIPLE' ) | ( 'QUADRUPLE' ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
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
                    // InternalPhases.g:259:2: ( 'DOUBLE' )
                    {
                    // InternalPhases.g:259:2: ( 'DOUBLE' )
                    // InternalPhases.g:260:3: 'DOUBLE'
                    {
                     before(grammarAccess.getNUMBERSAccess().getDOUBLEKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getNUMBERSAccess().getDOUBLEKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPhases.g:265:2: ( 'TRIPLE' )
                    {
                    // InternalPhases.g:265:2: ( 'TRIPLE' )
                    // InternalPhases.g:266:3: 'TRIPLE'
                    {
                     before(grammarAccess.getNUMBERSAccess().getTRIPLEKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getNUMBERSAccess().getTRIPLEKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPhases.g:271:2: ( 'QUADRUPLE' )
                    {
                    // InternalPhases.g:271:2: ( 'QUADRUPLE' )
                    // InternalPhases.g:272:3: 'QUADRUPLE'
                    {
                     before(grammarAccess.getNUMBERSAccess().getQUADRUPLEKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getNUMBERSAccess().getQUADRUPLEKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBERS__Alternatives"


    // $ANTLR start "rule__Game__Group__0"
    // InternalPhases.g:281:1: rule__Game__Group__0 : rule__Game__Group__0__Impl rule__Game__Group__1 ;
    public final void rule__Game__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:285:1: ( rule__Game__Group__0__Impl rule__Game__Group__1 )
            // InternalPhases.g:286:2: rule__Game__Group__0__Impl rule__Game__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Game__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__0"


    // $ANTLR start "rule__Game__Group__0__Impl"
    // InternalPhases.g:293:1: rule__Game__Group__0__Impl : ( ( rule__Game__Phase1Assignment_0 ) ) ;
    public final void rule__Game__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:297:1: ( ( ( rule__Game__Phase1Assignment_0 ) ) )
            // InternalPhases.g:298:1: ( ( rule__Game__Phase1Assignment_0 ) )
            {
            // InternalPhases.g:298:1: ( ( rule__Game__Phase1Assignment_0 ) )
            // InternalPhases.g:299:2: ( rule__Game__Phase1Assignment_0 )
            {
             before(grammarAccess.getGameAccess().getPhase1Assignment_0()); 
            // InternalPhases.g:300:2: ( rule__Game__Phase1Assignment_0 )
            // InternalPhases.g:300:3: rule__Game__Phase1Assignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Game__Phase1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getPhase1Assignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__0__Impl"


    // $ANTLR start "rule__Game__Group__1"
    // InternalPhases.g:308:1: rule__Game__Group__1 : rule__Game__Group__1__Impl rule__Game__Group__2 ;
    public final void rule__Game__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:312:1: ( rule__Game__Group__1__Impl rule__Game__Group__2 )
            // InternalPhases.g:313:2: rule__Game__Group__1__Impl rule__Game__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Game__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__1"


    // $ANTLR start "rule__Game__Group__1__Impl"
    // InternalPhases.g:320:1: rule__Game__Group__1__Impl : ( ( rule__Game__Phase2Assignment_1 ) ) ;
    public final void rule__Game__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:324:1: ( ( ( rule__Game__Phase2Assignment_1 ) ) )
            // InternalPhases.g:325:1: ( ( rule__Game__Phase2Assignment_1 ) )
            {
            // InternalPhases.g:325:1: ( ( rule__Game__Phase2Assignment_1 ) )
            // InternalPhases.g:326:2: ( rule__Game__Phase2Assignment_1 )
            {
             before(grammarAccess.getGameAccess().getPhase2Assignment_1()); 
            // InternalPhases.g:327:2: ( rule__Game__Phase2Assignment_1 )
            // InternalPhases.g:327:3: rule__Game__Phase2Assignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Game__Phase2Assignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getPhase2Assignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__1__Impl"


    // $ANTLR start "rule__Game__Group__2"
    // InternalPhases.g:335:1: rule__Game__Group__2 : rule__Game__Group__2__Impl rule__Game__Group__3 ;
    public final void rule__Game__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:339:1: ( rule__Game__Group__2__Impl rule__Game__Group__3 )
            // InternalPhases.g:340:2: rule__Game__Group__2__Impl rule__Game__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Game__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__2"


    // $ANTLR start "rule__Game__Group__2__Impl"
    // InternalPhases.g:347:1: rule__Game__Group__2__Impl : ( ( rule__Game__Phase3Assignment_2 ) ) ;
    public final void rule__Game__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:351:1: ( ( ( rule__Game__Phase3Assignment_2 ) ) )
            // InternalPhases.g:352:1: ( ( rule__Game__Phase3Assignment_2 ) )
            {
            // InternalPhases.g:352:1: ( ( rule__Game__Phase3Assignment_2 ) )
            // InternalPhases.g:353:2: ( rule__Game__Phase3Assignment_2 )
            {
             before(grammarAccess.getGameAccess().getPhase3Assignment_2()); 
            // InternalPhases.g:354:2: ( rule__Game__Phase3Assignment_2 )
            // InternalPhases.g:354:3: rule__Game__Phase3Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Game__Phase3Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getPhase3Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__2__Impl"


    // $ANTLR start "rule__Game__Group__3"
    // InternalPhases.g:362:1: rule__Game__Group__3 : rule__Game__Group__3__Impl rule__Game__Group__4 ;
    public final void rule__Game__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:366:1: ( rule__Game__Group__3__Impl rule__Game__Group__4 )
            // InternalPhases.g:367:2: rule__Game__Group__3__Impl rule__Game__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Game__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__3"


    // $ANTLR start "rule__Game__Group__3__Impl"
    // InternalPhases.g:374:1: rule__Game__Group__3__Impl : ( ( rule__Game__Phase4Assignment_3 ) ) ;
    public final void rule__Game__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:378:1: ( ( ( rule__Game__Phase4Assignment_3 ) ) )
            // InternalPhases.g:379:1: ( ( rule__Game__Phase4Assignment_3 ) )
            {
            // InternalPhases.g:379:1: ( ( rule__Game__Phase4Assignment_3 ) )
            // InternalPhases.g:380:2: ( rule__Game__Phase4Assignment_3 )
            {
             before(grammarAccess.getGameAccess().getPhase4Assignment_3()); 
            // InternalPhases.g:381:2: ( rule__Game__Phase4Assignment_3 )
            // InternalPhases.g:381:3: rule__Game__Phase4Assignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Game__Phase4Assignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getPhase4Assignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__3__Impl"


    // $ANTLR start "rule__Game__Group__4"
    // InternalPhases.g:389:1: rule__Game__Group__4 : rule__Game__Group__4__Impl ;
    public final void rule__Game__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:393:1: ( rule__Game__Group__4__Impl )
            // InternalPhases.g:394:2: rule__Game__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__4"


    // $ANTLR start "rule__Game__Group__4__Impl"
    // InternalPhases.g:400:1: rule__Game__Group__4__Impl : ( ( rule__Game__Phase5Assignment_4 ) ) ;
    public final void rule__Game__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:404:1: ( ( ( rule__Game__Phase5Assignment_4 ) ) )
            // InternalPhases.g:405:1: ( ( rule__Game__Phase5Assignment_4 ) )
            {
            // InternalPhases.g:405:1: ( ( rule__Game__Phase5Assignment_4 ) )
            // InternalPhases.g:406:2: ( rule__Game__Phase5Assignment_4 )
            {
             before(grammarAccess.getGameAccess().getPhase5Assignment_4()); 
            // InternalPhases.g:407:2: ( rule__Game__Phase5Assignment_4 )
            // InternalPhases.g:407:3: rule__Game__Phase5Assignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Game__Phase5Assignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getPhase5Assignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__4__Impl"


    // $ANTLR start "rule__Phase__Group__0"
    // InternalPhases.g:416:1: rule__Phase__Group__0 : rule__Phase__Group__0__Impl rule__Phase__Group__1 ;
    public final void rule__Phase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:420:1: ( rule__Phase__Group__0__Impl rule__Phase__Group__1 )
            // InternalPhases.g:421:2: rule__Phase__Group__0__Impl rule__Phase__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Phase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phase__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phase__Group__0"


    // $ANTLR start "rule__Phase__Group__0__Impl"
    // InternalPhases.g:428:1: rule__Phase__Group__0__Impl : ( 'PHASE' ) ;
    public final void rule__Phase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:432:1: ( ( 'PHASE' ) )
            // InternalPhases.g:433:1: ( 'PHASE' )
            {
            // InternalPhases.g:433:1: ( 'PHASE' )
            // InternalPhases.g:434:2: 'PHASE'
            {
             before(grammarAccess.getPhaseAccess().getPHASEKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPhaseAccess().getPHASEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phase__Group__0__Impl"


    // $ANTLR start "rule__Phase__Group__1"
    // InternalPhases.g:443:1: rule__Phase__Group__1 : rule__Phase__Group__1__Impl rule__Phase__Group__2 ;
    public final void rule__Phase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:447:1: ( rule__Phase__Group__1__Impl rule__Phase__Group__2 )
            // InternalPhases.g:448:2: rule__Phase__Group__1__Impl rule__Phase__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Phase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phase__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phase__Group__1"


    // $ANTLR start "rule__Phase__Group__1__Impl"
    // InternalPhases.g:455:1: rule__Phase__Group__1__Impl : ( ( rule__Phase__PhaseNumberAssignment_1 ) ) ;
    public final void rule__Phase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:459:1: ( ( ( rule__Phase__PhaseNumberAssignment_1 ) ) )
            // InternalPhases.g:460:1: ( ( rule__Phase__PhaseNumberAssignment_1 ) )
            {
            // InternalPhases.g:460:1: ( ( rule__Phase__PhaseNumberAssignment_1 ) )
            // InternalPhases.g:461:2: ( rule__Phase__PhaseNumberAssignment_1 )
            {
             before(grammarAccess.getPhaseAccess().getPhaseNumberAssignment_1()); 
            // InternalPhases.g:462:2: ( rule__Phase__PhaseNumberAssignment_1 )
            // InternalPhases.g:462:3: rule__Phase__PhaseNumberAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Phase__PhaseNumberAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPhaseAccess().getPhaseNumberAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phase__Group__1__Impl"


    // $ANTLR start "rule__Phase__Group__2"
    // InternalPhases.g:470:1: rule__Phase__Group__2 : rule__Phase__Group__2__Impl ;
    public final void rule__Phase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:474:1: ( rule__Phase__Group__2__Impl )
            // InternalPhases.g:475:2: rule__Phase__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Phase__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phase__Group__2"


    // $ANTLR start "rule__Phase__Group__2__Impl"
    // InternalPhases.g:481:1: rule__Phase__Group__2__Impl : ( ( rule__Phase__PhaseTypeAssignment_2 ) ) ;
    public final void rule__Phase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:485:1: ( ( ( rule__Phase__PhaseTypeAssignment_2 ) ) )
            // InternalPhases.g:486:1: ( ( rule__Phase__PhaseTypeAssignment_2 ) )
            {
            // InternalPhases.g:486:1: ( ( rule__Phase__PhaseTypeAssignment_2 ) )
            // InternalPhases.g:487:2: ( rule__Phase__PhaseTypeAssignment_2 )
            {
             before(grammarAccess.getPhaseAccess().getPhaseTypeAssignment_2()); 
            // InternalPhases.g:488:2: ( rule__Phase__PhaseTypeAssignment_2 )
            // InternalPhases.g:488:3: rule__Phase__PhaseTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Phase__PhaseTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPhaseAccess().getPhaseTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phase__Group__2__Impl"


    // $ANTLR start "rule__NUMBERS_TYPE__Group__0"
    // InternalPhases.g:497:1: rule__NUMBERS_TYPE__Group__0 : rule__NUMBERS_TYPE__Group__0__Impl rule__NUMBERS_TYPE__Group__1 ;
    public final void rule__NUMBERS_TYPE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:501:1: ( rule__NUMBERS_TYPE__Group__0__Impl rule__NUMBERS_TYPE__Group__1 )
            // InternalPhases.g:502:2: rule__NUMBERS_TYPE__Group__0__Impl rule__NUMBERS_TYPE__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__NUMBERS_TYPE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NUMBERS_TYPE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBERS_TYPE__Group__0"


    // $ANTLR start "rule__NUMBERS_TYPE__Group__0__Impl"
    // InternalPhases.g:509:1: rule__NUMBERS_TYPE__Group__0__Impl : ( ( rule__NUMBERS_TYPE__NameAssignment_0 ) ) ;
    public final void rule__NUMBERS_TYPE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:513:1: ( ( ( rule__NUMBERS_TYPE__NameAssignment_0 ) ) )
            // InternalPhases.g:514:1: ( ( rule__NUMBERS_TYPE__NameAssignment_0 ) )
            {
            // InternalPhases.g:514:1: ( ( rule__NUMBERS_TYPE__NameAssignment_0 ) )
            // InternalPhases.g:515:2: ( rule__NUMBERS_TYPE__NameAssignment_0 )
            {
             before(grammarAccess.getNUMBERS_TYPEAccess().getNameAssignment_0()); 
            // InternalPhases.g:516:2: ( rule__NUMBERS_TYPE__NameAssignment_0 )
            // InternalPhases.g:516:3: rule__NUMBERS_TYPE__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NUMBERS_TYPE__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNUMBERS_TYPEAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBERS_TYPE__Group__0__Impl"


    // $ANTLR start "rule__NUMBERS_TYPE__Group__1"
    // InternalPhases.g:524:1: rule__NUMBERS_TYPE__Group__1 : rule__NUMBERS_TYPE__Group__1__Impl rule__NUMBERS_TYPE__Group__2 ;
    public final void rule__NUMBERS_TYPE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:528:1: ( rule__NUMBERS_TYPE__Group__1__Impl rule__NUMBERS_TYPE__Group__2 )
            // InternalPhases.g:529:2: rule__NUMBERS_TYPE__Group__1__Impl rule__NUMBERS_TYPE__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__NUMBERS_TYPE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NUMBERS_TYPE__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBERS_TYPE__Group__1"


    // $ANTLR start "rule__NUMBERS_TYPE__Group__1__Impl"
    // InternalPhases.g:536:1: rule__NUMBERS_TYPE__Group__1__Impl : ( ':' ) ;
    public final void rule__NUMBERS_TYPE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:540:1: ( ( ':' ) )
            // InternalPhases.g:541:1: ( ':' )
            {
            // InternalPhases.g:541:1: ( ':' )
            // InternalPhases.g:542:2: ':'
            {
             before(grammarAccess.getNUMBERS_TYPEAccess().getColonKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getNUMBERS_TYPEAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBERS_TYPE__Group__1__Impl"


    // $ANTLR start "rule__NUMBERS_TYPE__Group__2"
    // InternalPhases.g:551:1: rule__NUMBERS_TYPE__Group__2 : rule__NUMBERS_TYPE__Group__2__Impl ;
    public final void rule__NUMBERS_TYPE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:555:1: ( rule__NUMBERS_TYPE__Group__2__Impl )
            // InternalPhases.g:556:2: rule__NUMBERS_TYPE__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NUMBERS_TYPE__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBERS_TYPE__Group__2"


    // $ANTLR start "rule__NUMBERS_TYPE__Group__2__Impl"
    // InternalPhases.g:562:1: rule__NUMBERS_TYPE__Group__2__Impl : ( ( rule__NUMBERS_TYPE__NumbersTypeAssignment_2 )* ) ;
    public final void rule__NUMBERS_TYPE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:566:1: ( ( ( rule__NUMBERS_TYPE__NumbersTypeAssignment_2 )* ) )
            // InternalPhases.g:567:1: ( ( rule__NUMBERS_TYPE__NumbersTypeAssignment_2 )* )
            {
            // InternalPhases.g:567:1: ( ( rule__NUMBERS_TYPE__NumbersTypeAssignment_2 )* )
            // InternalPhases.g:568:2: ( rule__NUMBERS_TYPE__NumbersTypeAssignment_2 )*
            {
             before(grammarAccess.getNUMBERS_TYPEAccess().getNumbersTypeAssignment_2()); 
            // InternalPhases.g:569:2: ( rule__NUMBERS_TYPE__NumbersTypeAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=11 && LA3_0<=13)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPhases.g:569:3: rule__NUMBERS_TYPE__NumbersTypeAssignment_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__NUMBERS_TYPE__NumbersTypeAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getNUMBERS_TYPEAccess().getNumbersTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBERS_TYPE__Group__2__Impl"


    // $ANTLR start "rule__COLORS_TYPE__Group__0"
    // InternalPhases.g:578:1: rule__COLORS_TYPE__Group__0 : rule__COLORS_TYPE__Group__0__Impl rule__COLORS_TYPE__Group__1 ;
    public final void rule__COLORS_TYPE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:582:1: ( rule__COLORS_TYPE__Group__0__Impl rule__COLORS_TYPE__Group__1 )
            // InternalPhases.g:583:2: rule__COLORS_TYPE__Group__0__Impl rule__COLORS_TYPE__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__COLORS_TYPE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__COLORS_TYPE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COLORS_TYPE__Group__0"


    // $ANTLR start "rule__COLORS_TYPE__Group__0__Impl"
    // InternalPhases.g:590:1: rule__COLORS_TYPE__Group__0__Impl : ( ( rule__COLORS_TYPE__NameAssignment_0 ) ) ;
    public final void rule__COLORS_TYPE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:594:1: ( ( ( rule__COLORS_TYPE__NameAssignment_0 ) ) )
            // InternalPhases.g:595:1: ( ( rule__COLORS_TYPE__NameAssignment_0 ) )
            {
            // InternalPhases.g:595:1: ( ( rule__COLORS_TYPE__NameAssignment_0 ) )
            // InternalPhases.g:596:2: ( rule__COLORS_TYPE__NameAssignment_0 )
            {
             before(grammarAccess.getCOLORS_TYPEAccess().getNameAssignment_0()); 
            // InternalPhases.g:597:2: ( rule__COLORS_TYPE__NameAssignment_0 )
            // InternalPhases.g:597:3: rule__COLORS_TYPE__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__COLORS_TYPE__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCOLORS_TYPEAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COLORS_TYPE__Group__0__Impl"


    // $ANTLR start "rule__COLORS_TYPE__Group__1"
    // InternalPhases.g:605:1: rule__COLORS_TYPE__Group__1 : rule__COLORS_TYPE__Group__1__Impl rule__COLORS_TYPE__Group__2 ;
    public final void rule__COLORS_TYPE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:609:1: ( rule__COLORS_TYPE__Group__1__Impl rule__COLORS_TYPE__Group__2 )
            // InternalPhases.g:610:2: rule__COLORS_TYPE__Group__1__Impl rule__COLORS_TYPE__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__COLORS_TYPE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__COLORS_TYPE__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COLORS_TYPE__Group__1"


    // $ANTLR start "rule__COLORS_TYPE__Group__1__Impl"
    // InternalPhases.g:617:1: rule__COLORS_TYPE__Group__1__Impl : ( ':' ) ;
    public final void rule__COLORS_TYPE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:621:1: ( ( ':' ) )
            // InternalPhases.g:622:1: ( ':' )
            {
            // InternalPhases.g:622:1: ( ':' )
            // InternalPhases.g:623:2: ':'
            {
             before(grammarAccess.getCOLORS_TYPEAccess().getColonKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCOLORS_TYPEAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COLORS_TYPE__Group__1__Impl"


    // $ANTLR start "rule__COLORS_TYPE__Group__2"
    // InternalPhases.g:632:1: rule__COLORS_TYPE__Group__2 : rule__COLORS_TYPE__Group__2__Impl ;
    public final void rule__COLORS_TYPE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:636:1: ( rule__COLORS_TYPE__Group__2__Impl )
            // InternalPhases.g:637:2: rule__COLORS_TYPE__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__COLORS_TYPE__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COLORS_TYPE__Group__2"


    // $ANTLR start "rule__COLORS_TYPE__Group__2__Impl"
    // InternalPhases.g:643:1: rule__COLORS_TYPE__Group__2__Impl : ( ( rule__COLORS_TYPE__NumberColorsAssignment_2 ) ) ;
    public final void rule__COLORS_TYPE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:647:1: ( ( ( rule__COLORS_TYPE__NumberColorsAssignment_2 ) ) )
            // InternalPhases.g:648:1: ( ( rule__COLORS_TYPE__NumberColorsAssignment_2 ) )
            {
            // InternalPhases.g:648:1: ( ( rule__COLORS_TYPE__NumberColorsAssignment_2 ) )
            // InternalPhases.g:649:2: ( rule__COLORS_TYPE__NumberColorsAssignment_2 )
            {
             before(grammarAccess.getCOLORS_TYPEAccess().getNumberColorsAssignment_2()); 
            // InternalPhases.g:650:2: ( rule__COLORS_TYPE__NumberColorsAssignment_2 )
            // InternalPhases.g:650:3: rule__COLORS_TYPE__NumberColorsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__COLORS_TYPE__NumberColorsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCOLORS_TYPEAccess().getNumberColorsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COLORS_TYPE__Group__2__Impl"


    // $ANTLR start "rule__STREET_TYPE__Group__0"
    // InternalPhases.g:659:1: rule__STREET_TYPE__Group__0 : rule__STREET_TYPE__Group__0__Impl rule__STREET_TYPE__Group__1 ;
    public final void rule__STREET_TYPE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:663:1: ( rule__STREET_TYPE__Group__0__Impl rule__STREET_TYPE__Group__1 )
            // InternalPhases.g:664:2: rule__STREET_TYPE__Group__0__Impl rule__STREET_TYPE__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__STREET_TYPE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__STREET_TYPE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STREET_TYPE__Group__0"


    // $ANTLR start "rule__STREET_TYPE__Group__0__Impl"
    // InternalPhases.g:671:1: rule__STREET_TYPE__Group__0__Impl : ( ( rule__STREET_TYPE__NameAssignment_0 ) ) ;
    public final void rule__STREET_TYPE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:675:1: ( ( ( rule__STREET_TYPE__NameAssignment_0 ) ) )
            // InternalPhases.g:676:1: ( ( rule__STREET_TYPE__NameAssignment_0 ) )
            {
            // InternalPhases.g:676:1: ( ( rule__STREET_TYPE__NameAssignment_0 ) )
            // InternalPhases.g:677:2: ( rule__STREET_TYPE__NameAssignment_0 )
            {
             before(grammarAccess.getSTREET_TYPEAccess().getNameAssignment_0()); 
            // InternalPhases.g:678:2: ( rule__STREET_TYPE__NameAssignment_0 )
            // InternalPhases.g:678:3: rule__STREET_TYPE__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__STREET_TYPE__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSTREET_TYPEAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STREET_TYPE__Group__0__Impl"


    // $ANTLR start "rule__STREET_TYPE__Group__1"
    // InternalPhases.g:686:1: rule__STREET_TYPE__Group__1 : rule__STREET_TYPE__Group__1__Impl rule__STREET_TYPE__Group__2 ;
    public final void rule__STREET_TYPE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:690:1: ( rule__STREET_TYPE__Group__1__Impl rule__STREET_TYPE__Group__2 )
            // InternalPhases.g:691:2: rule__STREET_TYPE__Group__1__Impl rule__STREET_TYPE__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__STREET_TYPE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__STREET_TYPE__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STREET_TYPE__Group__1"


    // $ANTLR start "rule__STREET_TYPE__Group__1__Impl"
    // InternalPhases.g:698:1: rule__STREET_TYPE__Group__1__Impl : ( ':' ) ;
    public final void rule__STREET_TYPE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:702:1: ( ( ':' ) )
            // InternalPhases.g:703:1: ( ':' )
            {
            // InternalPhases.g:703:1: ( ':' )
            // InternalPhases.g:704:2: ':'
            {
             before(grammarAccess.getSTREET_TYPEAccess().getColonKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSTREET_TYPEAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STREET_TYPE__Group__1__Impl"


    // $ANTLR start "rule__STREET_TYPE__Group__2"
    // InternalPhases.g:713:1: rule__STREET_TYPE__Group__2 : rule__STREET_TYPE__Group__2__Impl ;
    public final void rule__STREET_TYPE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:717:1: ( rule__STREET_TYPE__Group__2__Impl )
            // InternalPhases.g:718:2: rule__STREET_TYPE__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__STREET_TYPE__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STREET_TYPE__Group__2"


    // $ANTLR start "rule__STREET_TYPE__Group__2__Impl"
    // InternalPhases.g:724:1: rule__STREET_TYPE__Group__2__Impl : ( ( rule__STREET_TYPE__StreetLenghtAssignment_2 ) ) ;
    public final void rule__STREET_TYPE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:728:1: ( ( ( rule__STREET_TYPE__StreetLenghtAssignment_2 ) ) )
            // InternalPhases.g:729:1: ( ( rule__STREET_TYPE__StreetLenghtAssignment_2 ) )
            {
            // InternalPhases.g:729:1: ( ( rule__STREET_TYPE__StreetLenghtAssignment_2 ) )
            // InternalPhases.g:730:2: ( rule__STREET_TYPE__StreetLenghtAssignment_2 )
            {
             before(grammarAccess.getSTREET_TYPEAccess().getStreetLenghtAssignment_2()); 
            // InternalPhases.g:731:2: ( rule__STREET_TYPE__StreetLenghtAssignment_2 )
            // InternalPhases.g:731:3: rule__STREET_TYPE__StreetLenghtAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__STREET_TYPE__StreetLenghtAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSTREET_TYPEAccess().getStreetLenghtAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STREET_TYPE__Group__2__Impl"


    // $ANTLR start "rule__Game__Phase1Assignment_0"
    // InternalPhases.g:740:1: rule__Game__Phase1Assignment_0 : ( rulePhase ) ;
    public final void rule__Game__Phase1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:744:1: ( ( rulePhase ) )
            // InternalPhases.g:745:2: ( rulePhase )
            {
            // InternalPhases.g:745:2: ( rulePhase )
            // InternalPhases.g:746:3: rulePhase
            {
             before(grammarAccess.getGameAccess().getPhase1PhaseParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePhase();

            state._fsp--;

             after(grammarAccess.getGameAccess().getPhase1PhaseParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Phase1Assignment_0"


    // $ANTLR start "rule__Game__Phase2Assignment_1"
    // InternalPhases.g:755:1: rule__Game__Phase2Assignment_1 : ( rulePhase ) ;
    public final void rule__Game__Phase2Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:759:1: ( ( rulePhase ) )
            // InternalPhases.g:760:2: ( rulePhase )
            {
            // InternalPhases.g:760:2: ( rulePhase )
            // InternalPhases.g:761:3: rulePhase
            {
             before(grammarAccess.getGameAccess().getPhase2PhaseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePhase();

            state._fsp--;

             after(grammarAccess.getGameAccess().getPhase2PhaseParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Phase2Assignment_1"


    // $ANTLR start "rule__Game__Phase3Assignment_2"
    // InternalPhases.g:770:1: rule__Game__Phase3Assignment_2 : ( rulePhase ) ;
    public final void rule__Game__Phase3Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:774:1: ( ( rulePhase ) )
            // InternalPhases.g:775:2: ( rulePhase )
            {
            // InternalPhases.g:775:2: ( rulePhase )
            // InternalPhases.g:776:3: rulePhase
            {
             before(grammarAccess.getGameAccess().getPhase3PhaseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePhase();

            state._fsp--;

             after(grammarAccess.getGameAccess().getPhase3PhaseParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Phase3Assignment_2"


    // $ANTLR start "rule__Game__Phase4Assignment_3"
    // InternalPhases.g:785:1: rule__Game__Phase4Assignment_3 : ( rulePhase ) ;
    public final void rule__Game__Phase4Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:789:1: ( ( rulePhase ) )
            // InternalPhases.g:790:2: ( rulePhase )
            {
            // InternalPhases.g:790:2: ( rulePhase )
            // InternalPhases.g:791:3: rulePhase
            {
             before(grammarAccess.getGameAccess().getPhase4PhaseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePhase();

            state._fsp--;

             after(grammarAccess.getGameAccess().getPhase4PhaseParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Phase4Assignment_3"


    // $ANTLR start "rule__Game__Phase5Assignment_4"
    // InternalPhases.g:800:1: rule__Game__Phase5Assignment_4 : ( rulePhase ) ;
    public final void rule__Game__Phase5Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:804:1: ( ( rulePhase ) )
            // InternalPhases.g:805:2: ( rulePhase )
            {
            // InternalPhases.g:805:2: ( rulePhase )
            // InternalPhases.g:806:3: rulePhase
            {
             before(grammarAccess.getGameAccess().getPhase5PhaseParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePhase();

            state._fsp--;

             after(grammarAccess.getGameAccess().getPhase5PhaseParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Phase5Assignment_4"


    // $ANTLR start "rule__Phase__PhaseNumberAssignment_1"
    // InternalPhases.g:815:1: rule__Phase__PhaseNumberAssignment_1 : ( RULE_INT ) ;
    public final void rule__Phase__PhaseNumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:819:1: ( ( RULE_INT ) )
            // InternalPhases.g:820:2: ( RULE_INT )
            {
            // InternalPhases.g:820:2: ( RULE_INT )
            // InternalPhases.g:821:3: RULE_INT
            {
             before(grammarAccess.getPhaseAccess().getPhaseNumberINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPhaseAccess().getPhaseNumberINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phase__PhaseNumberAssignment_1"


    // $ANTLR start "rule__Phase__PhaseTypeAssignment_2"
    // InternalPhases.g:830:1: rule__Phase__PhaseTypeAssignment_2 : ( rulePhaseType ) ;
    public final void rule__Phase__PhaseTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:834:1: ( ( rulePhaseType ) )
            // InternalPhases.g:835:2: ( rulePhaseType )
            {
            // InternalPhases.g:835:2: ( rulePhaseType )
            // InternalPhases.g:836:3: rulePhaseType
            {
             before(grammarAccess.getPhaseAccess().getPhaseTypePhaseTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePhaseType();

            state._fsp--;

             after(grammarAccess.getPhaseAccess().getPhaseTypePhaseTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phase__PhaseTypeAssignment_2"


    // $ANTLR start "rule__PhaseType__StreetTypeAssignment_0"
    // InternalPhases.g:845:1: rule__PhaseType__StreetTypeAssignment_0 : ( ruleSTREET_TYPE ) ;
    public final void rule__PhaseType__StreetTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:849:1: ( ( ruleSTREET_TYPE ) )
            // InternalPhases.g:850:2: ( ruleSTREET_TYPE )
            {
            // InternalPhases.g:850:2: ( ruleSTREET_TYPE )
            // InternalPhases.g:851:3: ruleSTREET_TYPE
            {
             before(grammarAccess.getPhaseTypeAccess().getStreetTypeSTREET_TYPEParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSTREET_TYPE();

            state._fsp--;

             after(grammarAccess.getPhaseTypeAccess().getStreetTypeSTREET_TYPEParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhaseType__StreetTypeAssignment_0"


    // $ANTLR start "rule__PhaseType__NumbersTypeAssignment_1"
    // InternalPhases.g:860:1: rule__PhaseType__NumbersTypeAssignment_1 : ( ruleNUMBERS_TYPE ) ;
    public final void rule__PhaseType__NumbersTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:864:1: ( ( ruleNUMBERS_TYPE ) )
            // InternalPhases.g:865:2: ( ruleNUMBERS_TYPE )
            {
            // InternalPhases.g:865:2: ( ruleNUMBERS_TYPE )
            // InternalPhases.g:866:3: ruleNUMBERS_TYPE
            {
             before(grammarAccess.getPhaseTypeAccess().getNumbersTypeNUMBERS_TYPEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNUMBERS_TYPE();

            state._fsp--;

             after(grammarAccess.getPhaseTypeAccess().getNumbersTypeNUMBERS_TYPEParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhaseType__NumbersTypeAssignment_1"


    // $ANTLR start "rule__PhaseType__ColorTypeAssignment_2"
    // InternalPhases.g:875:1: rule__PhaseType__ColorTypeAssignment_2 : ( ruleCOLORS_TYPE ) ;
    public final void rule__PhaseType__ColorTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:879:1: ( ( ruleCOLORS_TYPE ) )
            // InternalPhases.g:880:2: ( ruleCOLORS_TYPE )
            {
            // InternalPhases.g:880:2: ( ruleCOLORS_TYPE )
            // InternalPhases.g:881:3: ruleCOLORS_TYPE
            {
             before(grammarAccess.getPhaseTypeAccess().getColorTypeCOLORS_TYPEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCOLORS_TYPE();

            state._fsp--;

             after(grammarAccess.getPhaseTypeAccess().getColorTypeCOLORS_TYPEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhaseType__ColorTypeAssignment_2"


    // $ANTLR start "rule__NUMBERS_TYPE__NameAssignment_0"
    // InternalPhases.g:890:1: rule__NUMBERS_TYPE__NameAssignment_0 : ( ( 'NUMBERS' ) ) ;
    public final void rule__NUMBERS_TYPE__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:894:1: ( ( ( 'NUMBERS' ) ) )
            // InternalPhases.g:895:2: ( ( 'NUMBERS' ) )
            {
            // InternalPhases.g:895:2: ( ( 'NUMBERS' ) )
            // InternalPhases.g:896:3: ( 'NUMBERS' )
            {
             before(grammarAccess.getNUMBERS_TYPEAccess().getNameNUMBERSKeyword_0_0()); 
            // InternalPhases.g:897:3: ( 'NUMBERS' )
            // InternalPhases.g:898:4: 'NUMBERS'
            {
             before(grammarAccess.getNUMBERS_TYPEAccess().getNameNUMBERSKeyword_0_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getNUMBERS_TYPEAccess().getNameNUMBERSKeyword_0_0()); 

            }

             after(grammarAccess.getNUMBERS_TYPEAccess().getNameNUMBERSKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBERS_TYPE__NameAssignment_0"


    // $ANTLR start "rule__NUMBERS_TYPE__NumbersTypeAssignment_2"
    // InternalPhases.g:909:1: rule__NUMBERS_TYPE__NumbersTypeAssignment_2 : ( ruleNUMBERS ) ;
    public final void rule__NUMBERS_TYPE__NumbersTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:913:1: ( ( ruleNUMBERS ) )
            // InternalPhases.g:914:2: ( ruleNUMBERS )
            {
            // InternalPhases.g:914:2: ( ruleNUMBERS )
            // InternalPhases.g:915:3: ruleNUMBERS
            {
             before(grammarAccess.getNUMBERS_TYPEAccess().getNumbersTypeNUMBERSParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNUMBERS();

            state._fsp--;

             after(grammarAccess.getNUMBERS_TYPEAccess().getNumbersTypeNUMBERSParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBERS_TYPE__NumbersTypeAssignment_2"


    // $ANTLR start "rule__COLORS_TYPE__NameAssignment_0"
    // InternalPhases.g:924:1: rule__COLORS_TYPE__NameAssignment_0 : ( ( 'COLORS' ) ) ;
    public final void rule__COLORS_TYPE__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:928:1: ( ( ( 'COLORS' ) ) )
            // InternalPhases.g:929:2: ( ( 'COLORS' ) )
            {
            // InternalPhases.g:929:2: ( ( 'COLORS' ) )
            // InternalPhases.g:930:3: ( 'COLORS' )
            {
             before(grammarAccess.getCOLORS_TYPEAccess().getNameCOLORSKeyword_0_0()); 
            // InternalPhases.g:931:3: ( 'COLORS' )
            // InternalPhases.g:932:4: 'COLORS'
            {
             before(grammarAccess.getCOLORS_TYPEAccess().getNameCOLORSKeyword_0_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCOLORS_TYPEAccess().getNameCOLORSKeyword_0_0()); 

            }

             after(grammarAccess.getCOLORS_TYPEAccess().getNameCOLORSKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COLORS_TYPE__NameAssignment_0"


    // $ANTLR start "rule__COLORS_TYPE__NumberColorsAssignment_2"
    // InternalPhases.g:943:1: rule__COLORS_TYPE__NumberColorsAssignment_2 : ( RULE_INT ) ;
    public final void rule__COLORS_TYPE__NumberColorsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:947:1: ( ( RULE_INT ) )
            // InternalPhases.g:948:2: ( RULE_INT )
            {
            // InternalPhases.g:948:2: ( RULE_INT )
            // InternalPhases.g:949:3: RULE_INT
            {
             before(grammarAccess.getCOLORS_TYPEAccess().getNumberColorsINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCOLORS_TYPEAccess().getNumberColorsINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COLORS_TYPE__NumberColorsAssignment_2"


    // $ANTLR start "rule__STREET_TYPE__NameAssignment_0"
    // InternalPhases.g:958:1: rule__STREET_TYPE__NameAssignment_0 : ( ( 'STREET' ) ) ;
    public final void rule__STREET_TYPE__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:962:1: ( ( ( 'STREET' ) ) )
            // InternalPhases.g:963:2: ( ( 'STREET' ) )
            {
            // InternalPhases.g:963:2: ( ( 'STREET' ) )
            // InternalPhases.g:964:3: ( 'STREET' )
            {
             before(grammarAccess.getSTREET_TYPEAccess().getNameSTREETKeyword_0_0()); 
            // InternalPhases.g:965:3: ( 'STREET' )
            // InternalPhases.g:966:4: 'STREET'
            {
             before(grammarAccess.getSTREET_TYPEAccess().getNameSTREETKeyword_0_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSTREET_TYPEAccess().getNameSTREETKeyword_0_0()); 

            }

             after(grammarAccess.getSTREET_TYPEAccess().getNameSTREETKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STREET_TYPE__NameAssignment_0"


    // $ANTLR start "rule__STREET_TYPE__StreetLenghtAssignment_2"
    // InternalPhases.g:977:1: rule__STREET_TYPE__StreetLenghtAssignment_2 : ( RULE_INT ) ;
    public final void rule__STREET_TYPE__StreetLenghtAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPhases.g:981:1: ( ( RULE_INT ) )
            // InternalPhases.g:982:2: ( RULE_INT )
            {
            // InternalPhases.g:982:2: ( RULE_INT )
            // InternalPhases.g:983:3: RULE_INT
            {
             before(grammarAccess.getSTREET_TYPEAccess().getStreetLenghtINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSTREET_TYPEAccess().getStreetLenghtINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STREET_TYPE__StreetLenghtAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000003802L});

}