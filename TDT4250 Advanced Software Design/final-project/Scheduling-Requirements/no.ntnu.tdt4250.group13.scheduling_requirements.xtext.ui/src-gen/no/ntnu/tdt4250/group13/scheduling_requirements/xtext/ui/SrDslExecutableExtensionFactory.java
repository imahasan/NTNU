/*
 * generated by Xtext 2.31.0
 */
package no.ntnu.tdt4250.group13.scheduling_requirements.xtext.ui;

import com.google.inject.Injector;
import no.ntnu.tdt4250.group13.scheduling_requirements.xtext.ui.internal.XtextActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SrDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(XtextActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		XtextActivator activator = XtextActivator.getInstance();
		return activator != null ? activator.getInjector(XtextActivator.NO_NTNU_TDT4250_GROUP13_SCHEDULING_REQUIREMENTS_XTEXT_SRDSL) : null;
	}

}
