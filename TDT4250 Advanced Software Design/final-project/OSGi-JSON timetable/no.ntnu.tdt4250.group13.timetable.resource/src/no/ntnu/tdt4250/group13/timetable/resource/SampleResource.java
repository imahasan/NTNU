package no.ntnu.tdt4250.group13.timetable.resource;

import java.net.URL;

import org.eclipse.acceleo.query.ast.AstPackage;
import org.eclipse.acceleo.query.delegates.AQLValidationDelegate;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EValidator.ValidationDelegate;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

import no.ntnu.tdt4250.group13.timetable.servletsupport.IResourceProvider;
import no.ntnu.tdt4250.group13.timetable.servletsupport.impl.ResourceProvider;
//import tdt4250.ra.RaPackage;
import no.ntnu.tdt4250.group13.timetable.*;

@Component
public class SampleResource extends ResourceProvider implements IResourceProvider {

	@Activate
	public void activate(BundleContext bc) {
		// register AQL (an OCL implementation) constraint support
		ValidationDelegate.Registry.INSTANCE.put(AstPackage.eNS_URI, new AQLValidationDelegate());

		URL resource = bc.getBundle().getResource("/no.ntnu.tdt4250.group13.timetable.resource/src/no/ntnu/tdt4250/group13/timetable/resource/test.xmi");
		setUri(URI.createURI(resource.toString()));
	}

//	@Override
//	protected void configureResourceSet(ResourceSet resourceSet) {
//		super.configureResourceSet(resourceSet);
//		resourceSet.getPackageRegistry().put(RaPackage.eNS_URI, RaPackage.eINSTANCE);
//		
//		
////		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ra", new RaResourceFactoryImpl());
//	}
}
