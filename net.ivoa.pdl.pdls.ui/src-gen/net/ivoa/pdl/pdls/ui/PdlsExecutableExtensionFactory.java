/*
 * generated by Xtext
 */
package net.ivoa.pdl.pdls.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import net.ivoa.pdl.pdls.ui.internal.PdlsActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class PdlsExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return PdlsActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return PdlsActivator.getInstance().getInjector(PdlsActivator.NET_IVOA_PDL_PDLS_PDLS);
	}
	
}