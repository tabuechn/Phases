/*
 * generated by Xtext 2.10.0
 */
package org.xtext.de.htwg.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.de.htwg.phases.ui.internal.PhasesActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class PhasesExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return PhasesActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return PhasesActivator.getInstance().getInjector(PhasesActivator.ORG_XTEXT_DE_HTWG_PHASES);
	}
	
}
