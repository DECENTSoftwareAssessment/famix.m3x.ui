/*
 * generated by Xtext
 */
package famix.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import famix.ui.internal.M3xActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class M3xExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return M3xActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return M3xActivator.getInstance().getInjector(M3xActivator.FAMIX_M3X);
	}
	
}
