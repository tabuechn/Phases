/*
 * generated by Xtext 2.11.0
 */
package org.xtext.de.htwg.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.de.htwg.PhasesRuntimeModule
import org.xtext.de.htwg.PhasesStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class PhasesIdeSetup extends PhasesStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new PhasesRuntimeModule, new PhasesIdeModule))
	}
	
}
