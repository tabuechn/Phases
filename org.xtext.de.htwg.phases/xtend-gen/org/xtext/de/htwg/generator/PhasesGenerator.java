/**
 * generated by Xtext 2.11.0
 */
package org.xtext.de.htwg.generator;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.de.htwg.phases.COLORS_TYPE;
import org.xtext.de.htwg.phases.Game;
import org.xtext.de.htwg.phases.NUMBERS_TYPE;
import org.xtext.de.htwg.phases.Phase;
import org.xtext.de.htwg.phases.PhaseType;
import org.xtext.de.htwg.phases.STREET_TYPE;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class PhasesGenerator extends AbstractGenerator {
  private String phaseType = "null";
  
  private String numbersTypes = "null";
  
  private String numberColors = "null";
  
  private String streetLenght = "null";
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    final Game game = ((Game) _head);
    EList<Phase> _phases = game.getPhases();
    for (final Phase phase : _phases) {
      {
        this.phaseType = "null";
        this.numbersTypes = "null";
        this.numberColors = "null";
        this.streetLenght = "null";
        PhaseType _phaseType = phase.getPhaseType();
        NUMBERS_TYPE _numbersType = _phaseType.getNumbersType();
        boolean _notEquals = (!Objects.equal(_numbersType, null));
        if (_notEquals) {
          PhaseType _phaseType_1 = phase.getPhaseType();
          NUMBERS_TYPE _numbersType_1 = _phaseType_1.getNumbersType();
          String _name = _numbersType_1.getName();
          String _string = _name.toString();
          this.phaseType = _string;
          PhaseType _phaseType_2 = phase.getPhaseType();
          NUMBERS_TYPE _numbersType_2 = _phaseType_2.getNumbersType();
          EList<String> _numbersType_3 = _numbersType_2.getNumbersType();
          String _string_1 = _numbersType_3.toString();
          this.numbersTypes = _string_1;
        }
        PhaseType _phaseType_3 = phase.getPhaseType();
        COLORS_TYPE _colorType = _phaseType_3.getColorType();
        boolean _notEquals_1 = (!Objects.equal(_colorType, null));
        if (_notEquals_1) {
          PhaseType _phaseType_4 = phase.getPhaseType();
          COLORS_TYPE _colorType_1 = _phaseType_4.getColorType();
          String _name_1 = _colorType_1.getName();
          String _string_2 = _name_1.toString();
          this.phaseType = _string_2;
          PhaseType _phaseType_5 = phase.getPhaseType();
          COLORS_TYPE _colorType_2 = _phaseType_5.getColorType();
          int _numberColors = _colorType_2.getNumberColors();
          String _string_3 = Integer.valueOf(_numberColors).toString();
          this.numberColors = _string_3;
        }
        PhaseType _phaseType_6 = phase.getPhaseType();
        STREET_TYPE _streetType = _phaseType_6.getStreetType();
        boolean _notEquals_2 = (!Objects.equal(_streetType, null));
        if (_notEquals_2) {
          PhaseType _phaseType_7 = phase.getPhaseType();
          STREET_TYPE _streetType_1 = _phaseType_7.getStreetType();
          String _name_2 = _streetType_1.getName();
          String _string_4 = _name_2.toString();
          this.phaseType = _string_4;
          PhaseType _phaseType_8 = phase.getPhaseType();
          STREET_TYPE _streetType_2 = _phaseType_8.getStreetType();
          int _streetLenght = _streetType_2.getStreetLenght();
          String _string_5 = Integer.valueOf(_streetLenght).toString();
          this.streetLenght = _string_5;
        }
        int _phaseNumber = phase.getPhaseNumber();
        String _plus = ("Phase" + Integer.valueOf(_phaseNumber));
        String _plus_1 = (_plus + ".java");
        int _phaseNumber_1 = phase.getPhaseNumber();
        String _string_6 = Integer.valueOf(_phaseNumber_1).toString();
        String _plus_2 = ("\r\n\t\t\t\tpackage model.phase.impl;\r\n\t\t\t\timport model.deck.IDeckOfCards;\r\n\t\t\t\timport model.phase.DeckNotFitException;\r\n\t\t\t\timport model.phase.IPhase;\r\n\t\t\t\timport model.stack.ICardStack;\r\n\t\t\t\timport java.util.List;\r\n\t\t\t\t\r\n\t\t\t\t/**\r\n\t\t\t\t * Created by Tarek on 24.09.2015. Be grateful for this superior Code!\r\n\t\t\t\t *\r\n\t\t\t\t * edited: Konraifen88\r\n\t\t\t\t * date: 30.09.2015\r\n\t\t\t\t * merged phase checker and getter\r\n\t\t\t\t * edited: daschwin\r\n\t\t\t\t * date: 200.07.2017\r\n\t\t\t\t * to be generated\r\n\t\t\t\t */\r\n\t\t\t\tpublic class Phases implements IPhase {\r\n\t\t\t\t\r\n\t\t\t\t    public static final int PHASE_NUMBER = " + _string_6);
        String _plus_3 = (_plus_2 + "\r\n\t\t\t\t\tprivate static final String DESCRIPTION_PHASE = \"");
        String _phaseDescription = phase.getPhaseDescription();
        String _string_7 = _phaseDescription.toString();
        String _plus_4 = (_plus_3 + _string_7);
        String _plus_5 = (_plus_4 + "\";\r\n\t\t\t\t    private Boolean isNumberPhase = false;\r\n\t\t\t\t    private String phaseType = \"");
        String _plus_6 = (_plus_5 + this.phaseType);
        String _plus_7 = (_plus_6 + "\";\r\n\t\t\t\t    private String[] numbersType = ");
        String _plus_8 = (_plus_7 + this.numbersTypes);
        String _plus_9 = (_plus_8 + ";\r\n\t\t\t\t    private Integer numberColors = ");
        String _plus_10 = (_plus_9 + this.numberColors);
        String _plus_11 = (_plus_10 + ";\r\n\t\t\t\t    private Integer streetLenght = ");
        String _plus_12 = (_plus_11 + this.streetLenght);
        String _plus_13 = (_plus_12 + ";\r\n\t\t\t\t    public Phases() {\r\n\t\t\t\t        //empty\r\n\t\t\t\t    }\r\n\t\t\t\t\r\n\t\t\t\t    @Override\r\n\t\t\t\t    public String getDescription() {\r\n\t\t\t\t        return DESCRIPTION_PHASE;\r\n\t\t\t\t    }\r\n\t\t\t\t\r\n\t\t\t\t    @Override\r\n\t\t\t\t    public List<ICardStack> splitAndCheckPhase(IDeckOfCards phase) throws DeckNotFitException {\r\n\t\t\t\t\r\n\t\t\t\t        if(phaseType.equals(\"NUMBERS\")) {\r\n\t\t\t\t            isNumberPhase = true;\r\n\t\t\t\t            PhaseNumber phaseNumber = new PhaseNumber();\r\n\t\t\t\t            return phaseNumber.splitAndCheckPhase(phase, numbersType);\r\n\t\t\t\t        }\r\n\t\t\t\t        if(phaseType.equals(\"COLORS\")) {\r\n\t\t\t\t            PhaseColor phaseNumber = new PhaseColor();\r\n\t\t\t\t            return phaseNumber.splitAndCheckPhase(phase, numberColors);\r\n\t\t\t\t        }\r\n\t\t\t\t        if(phaseType.equals(\"STREET\")) {\r\n\t\t\t\t            PhaseStreet phaseNumber = new PhaseStreet();\r\n\t\t\t\t            return phaseNumber.splitAndCheckPhase(phase, streetLenght);\r\n\t\t\t\t        }\r\n\t\t\t\t        throw new DeckNotFitException();\r\n\t\t\t\t    }\r\n\t\t\t\t\r\n\t\t\t\t    @Override\r\n\t\t\t\t    public IPhase getNextPhase() {\r\n\t\t\t\t        return new Phase5();\r\n\t\t\t\t    }\r\n\t\t\t\t\r\n\t\t\t\t    @Override\r\n\t\t\t\t    public int getPhaseNumber() {\r\n\t\t\t\t        return PHASE_NUMBER;\r\n\t\t\t\t    }\r\n\t\t\t\t\r\n\t\t\t\t    @Override\r\n\t\t\t\t    public boolean isNumberPhase() {\r\n\t\t\t\t        return isNumberPhase;\r\n\t\t\t\t    }\r\n\t\t\t\t\r\n\t\t\t\t    @Override\r\n\t\t\t\t    public String toString() {\r\n\t\t\t\t        return \"Phase\"+PHASE_NUMBER;\r\n\t\t\t\t    }\r\n\t\t\t\t}");
        String _plus_14 = (_plus_13 + "");
        fsa.generateFile(_plus_1, _plus_14);
      }
    }
  }
}
