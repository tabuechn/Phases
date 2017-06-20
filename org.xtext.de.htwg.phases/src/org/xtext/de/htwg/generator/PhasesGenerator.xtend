/*
 * generated by Xtext 2.11.0
 */
package org.xtext.de.htwg.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.de.htwg.phases.Game
import org.xtext.de.htwg.phases.Phase
import java.lang.reflect.Array
import java.util.LinkedList

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class PhasesGenerator extends AbstractGenerator {

	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		val game = resource.contents.head as Game;
		val phases = new LinkedList();
		phases.add(game.phase1);
		phases.add(game.phase2);
		phases.add(game.phase3);
		phases.add(game.phase4);
		phases.add(game.phase5);
		for(Phase phase : phases){
			
			if(phase.phaseType.numbersType!=null){
				System.out.println(phase.phaseType.numbersType.name);
				for(nuberTyps: phase.phaseType.numbersType.numbersType){
					System.out.println(nuberTyps);
					
				}
				fsa.generateFile('Phase'+phase.phaseNumber+'.java', 
				"PhasenTyp: " + phase.phaseType.numbersType.name
				+"\nPhasenIhalt: "+phase.phaseType.numbersType.numbersType
				)
			}
			if(phase.phaseType.colorType!=null){
				System.out.println(phase.phaseType.colorType.name);
				System.out.println(phase.phaseType.colorType.numberColors);
				fsa.generateFile('Phase'+phase.phaseNumber+'.java', 
				"PhasenTyp: " + phase.phaseType.colorType.name
				+"\nPhasenIhalt: "+phase.phaseType.colorType.numberColors
				)
			}
			if(phase.phaseType.streetType!=null){
				System.out.println(phase.phaseType.streetType.name);
				System.out.println(phase.phaseType.streetType.streetLenght);
				fsa.generateFile('Phase'+phase.phaseNumber+'.java', 
				"PhasenTyp: " + phase.phaseType.streetType.name
				+"\nPhasenIhalt: "+phase.phaseType.streetType.streetLenght
				)
			}
		}
	}
}
