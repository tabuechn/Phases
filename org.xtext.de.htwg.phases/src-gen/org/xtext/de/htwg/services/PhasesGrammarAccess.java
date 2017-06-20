/*
 * generated by Xtext 2.10.0
 */
package org.xtext.de.htwg.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class PhasesGrammarAccess extends AbstractGrammarElementFinder {
	
	public class GameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.de.htwg.Phases.Game");
		private final Assignment cPhasesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cPhasesPhaseParserRuleCall_0 = (RuleCall)cPhasesAssignment.eContents().get(0);
		
		//Game:
		//	phases+=Phase*;
		@Override public ParserRule getRule() { return rule; }
		
		//phases+=Phase*
		public Assignment getPhasesAssignment() { return cPhasesAssignment; }
		
		//Phase
		public RuleCall getPhasesPhaseParserRuleCall_0() { return cPhasesPhaseParserRuleCall_0; }
	}
	public class PhaseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.de.htwg.Phases.Phase");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPHASEKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPhaseNumberAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPhaseNumberINTTerminalRuleCall_1_0 = (RuleCall)cPhaseNumberAssignment_1.eContents().get(0);
		private final Assignment cPhaseTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cPhaseTypePhaseTypeParserRuleCall_2_0 = (RuleCall)cPhaseTypeAssignment_2.eContents().get(0);
		private final Assignment cPhaseDescriptionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cPhaseDescriptionSTRINGTerminalRuleCall_3_0 = (RuleCall)cPhaseDescriptionAssignment_3.eContents().get(0);
		
		//Phase:
		//	'PHASE'
		//	phaseNumber=INT
		//	phaseType=PhaseType
		//	phaseDescription=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'PHASE' phaseNumber=INT phaseType=PhaseType phaseDescription=STRING
		public Group getGroup() { return cGroup; }
		
		//'PHASE'
		public Keyword getPHASEKeyword_0() { return cPHASEKeyword_0; }
		
		//phaseNumber=INT
		public Assignment getPhaseNumberAssignment_1() { return cPhaseNumberAssignment_1; }
		
		//INT
		public RuleCall getPhaseNumberINTTerminalRuleCall_1_0() { return cPhaseNumberINTTerminalRuleCall_1_0; }
		
		//phaseType=PhaseType
		public Assignment getPhaseTypeAssignment_2() { return cPhaseTypeAssignment_2; }
		
		//PhaseType
		public RuleCall getPhaseTypePhaseTypeParserRuleCall_2_0() { return cPhaseTypePhaseTypeParserRuleCall_2_0; }
		
		//phaseDescription=STRING
		public Assignment getPhaseDescriptionAssignment_3() { return cPhaseDescriptionAssignment_3; }
		
		//STRING
		public RuleCall getPhaseDescriptionSTRINGTerminalRuleCall_3_0() { return cPhaseDescriptionSTRINGTerminalRuleCall_3_0; }
	}
	public class PhaseTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.de.htwg.Phases.PhaseType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cStreetTypeAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cStreetTypeSTREET_TYPEParserRuleCall_0_0 = (RuleCall)cStreetTypeAssignment_0.eContents().get(0);
		private final Assignment cNumbersTypeAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cNumbersTypeNUMBERS_TYPEParserRuleCall_1_0 = (RuleCall)cNumbersTypeAssignment_1.eContents().get(0);
		private final Assignment cColorTypeAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final RuleCall cColorTypeCOLORS_TYPEParserRuleCall_2_0 = (RuleCall)cColorTypeAssignment_2.eContents().get(0);
		
		//PhaseType:
		//	streetType=STREET_TYPE | numbersType=NUMBERS_TYPE | colorType=COLORS_TYPE;
		@Override public ParserRule getRule() { return rule; }
		
		//streetType=STREET_TYPE | numbersType=NUMBERS_TYPE | colorType=COLORS_TYPE
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//streetType=STREET_TYPE
		public Assignment getStreetTypeAssignment_0() { return cStreetTypeAssignment_0; }
		
		//STREET_TYPE
		public RuleCall getStreetTypeSTREET_TYPEParserRuleCall_0_0() { return cStreetTypeSTREET_TYPEParserRuleCall_0_0; }
		
		//numbersType=NUMBERS_TYPE
		public Assignment getNumbersTypeAssignment_1() { return cNumbersTypeAssignment_1; }
		
		//NUMBERS_TYPE
		public RuleCall getNumbersTypeNUMBERS_TYPEParserRuleCall_1_0() { return cNumbersTypeNUMBERS_TYPEParserRuleCall_1_0; }
		
		//colorType=COLORS_TYPE
		public Assignment getColorTypeAssignment_2() { return cColorTypeAssignment_2; }
		
		//COLORS_TYPE
		public RuleCall getColorTypeCOLORS_TYPEParserRuleCall_2_0() { return cColorTypeCOLORS_TYPEParserRuleCall_2_0; }
	}
	public class NUMBERS_TYPEElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.de.htwg.Phases.NUMBERS_TYPE");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cNameNUMBERSKeyword_0_0 = (Keyword)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNumbersTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNumbersTypeNUMBERSParserRuleCall_2_0 = (RuleCall)cNumbersTypeAssignment_2.eContents().get(0);
		
		//NUMBERS_TYPE:
		//	name='NUMBERS' ":" numbersType+=NUMBERS*;
		@Override public ParserRule getRule() { return rule; }
		
		//name='NUMBERS' ":" numbersType+=NUMBERS*
		public Group getGroup() { return cGroup; }
		
		//name='NUMBERS'
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//'NUMBERS'
		public Keyword getNameNUMBERSKeyword_0_0() { return cNameNUMBERSKeyword_0_0; }
		
		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//numbersType+=NUMBERS*
		public Assignment getNumbersTypeAssignment_2() { return cNumbersTypeAssignment_2; }
		
		//NUMBERS
		public RuleCall getNumbersTypeNUMBERSParserRuleCall_2_0() { return cNumbersTypeNUMBERSParserRuleCall_2_0; }
	}
	public class NUMBERSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.de.htwg.Phases.NUMBERS");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cDOUBLEKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cTRIPLEKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cQUADRUPLEKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		
		//NUMBERS:
		//	'DOUBLE' | 'TRIPLE' | 'QUADRUPLE';
		@Override public ParserRule getRule() { return rule; }
		
		//'DOUBLE' | 'TRIPLE' | 'QUADRUPLE'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'DOUBLE'
		public Keyword getDOUBLEKeyword_0() { return cDOUBLEKeyword_0; }
		
		//'TRIPLE'
		public Keyword getTRIPLEKeyword_1() { return cTRIPLEKeyword_1; }
		
		//'QUADRUPLE'
		public Keyword getQUADRUPLEKeyword_2() { return cQUADRUPLEKeyword_2; }
	}
	public class COLORS_TYPEElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.de.htwg.Phases.COLORS_TYPE");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cNameCOLORSKeyword_0_0 = (Keyword)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNumberColorsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNumberColorsINTTerminalRuleCall_2_0 = (RuleCall)cNumberColorsAssignment_2.eContents().get(0);
		
		//COLORS_TYPE:
		//	name='COLORS' ":" numberColors=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//name='COLORS' ":" numberColors=INT
		public Group getGroup() { return cGroup; }
		
		//name='COLORS'
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//'COLORS'
		public Keyword getNameCOLORSKeyword_0_0() { return cNameCOLORSKeyword_0_0; }
		
		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//numberColors=INT
		public Assignment getNumberColorsAssignment_2() { return cNumberColorsAssignment_2; }
		
		//INT
		public RuleCall getNumberColorsINTTerminalRuleCall_2_0() { return cNumberColorsINTTerminalRuleCall_2_0; }
	}
	public class STREET_TYPEElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.de.htwg.Phases.STREET_TYPE");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cNameSTREETKeyword_0_0 = (Keyword)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cStreetLenghtAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cStreetLenghtINTTerminalRuleCall_2_0 = (RuleCall)cStreetLenghtAssignment_2.eContents().get(0);
		
		//STREET_TYPE:
		//	name='STREET' ":" streetLenght=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//name='STREET' ":" streetLenght=INT
		public Group getGroup() { return cGroup; }
		
		//name='STREET'
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//'STREET'
		public Keyword getNameSTREETKeyword_0_0() { return cNameSTREETKeyword_0_0; }
		
		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//streetLenght=INT
		public Assignment getStreetLenghtAssignment_2() { return cStreetLenghtAssignment_2; }
		
		//INT
		public RuleCall getStreetLenghtINTTerminalRuleCall_2_0() { return cStreetLenghtINTTerminalRuleCall_2_0; }
	}
	
	
	private final GameElements pGame;
	private final PhaseElements pPhase;
	private final PhaseTypeElements pPhaseType;
	private final NUMBERS_TYPEElements pNUMBERS_TYPE;
	private final NUMBERSElements pNUMBERS;
	private final COLORS_TYPEElements pCOLORS_TYPE;
	private final STREET_TYPEElements pSTREET_TYPE;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public PhasesGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pGame = new GameElements();
		this.pPhase = new PhaseElements();
		this.pPhaseType = new PhaseTypeElements();
		this.pNUMBERS_TYPE = new NUMBERS_TYPEElements();
		this.pNUMBERS = new NUMBERSElements();
		this.pCOLORS_TYPE = new COLORS_TYPEElements();
		this.pSTREET_TYPE = new STREET_TYPEElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.de.htwg.Phases".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Game:
	//	phases+=Phase*;
	public GameElements getGameAccess() {
		return pGame;
	}
	
	public ParserRule getGameRule() {
		return getGameAccess().getRule();
	}
	
	//Phase:
	//	'PHASE'
	//	phaseNumber=INT
	//	phaseType=PhaseType
	//	phaseDescription=STRING;
	public PhaseElements getPhaseAccess() {
		return pPhase;
	}
	
	public ParserRule getPhaseRule() {
		return getPhaseAccess().getRule();
	}
	
	//PhaseType:
	//	streetType=STREET_TYPE | numbersType=NUMBERS_TYPE | colorType=COLORS_TYPE;
	public PhaseTypeElements getPhaseTypeAccess() {
		return pPhaseType;
	}
	
	public ParserRule getPhaseTypeRule() {
		return getPhaseTypeAccess().getRule();
	}
	
	//NUMBERS_TYPE:
	//	name='NUMBERS' ":" numbersType+=NUMBERS*;
	public NUMBERS_TYPEElements getNUMBERS_TYPEAccess() {
		return pNUMBERS_TYPE;
	}
	
	public ParserRule getNUMBERS_TYPERule() {
		return getNUMBERS_TYPEAccess().getRule();
	}
	
	//NUMBERS:
	//	'DOUBLE' | 'TRIPLE' | 'QUADRUPLE';
	public NUMBERSElements getNUMBERSAccess() {
		return pNUMBERS;
	}
	
	public ParserRule getNUMBERSRule() {
		return getNUMBERSAccess().getRule();
	}
	
	//COLORS_TYPE:
	//	name='COLORS' ":" numberColors=INT;
	public COLORS_TYPEElements getCOLORS_TYPEAccess() {
		return pCOLORS_TYPE;
	}
	
	public ParserRule getCOLORS_TYPERule() {
		return getCOLORS_TYPEAccess().getRule();
	}
	
	//STREET_TYPE:
	//	name='STREET' ":" streetLenght=INT;
	public STREET_TYPEElements getSTREET_TYPEAccess() {
		return pSTREET_TYPE;
	}
	
	public ParserRule getSTREET_TYPERule() {
		return getSTREET_TYPEAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
