package no.ntnu.tdt4250.group13.timetable.servletsupport.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.service.component.annotations.Component;

import no.ntnu.tdt4250.group13.timetable.servletsupport.IReferenceResolver;

@Component
public class NameReferenceResolver extends AbstractReferenceResolver implements IReferenceResolver {

	@Override
	protected boolean isReferenced(String reference, EObject eObject) {
		EStructuralFeature nameFeature = eObject.eClass().getEStructuralFeature("name");
		if (nameFeature instanceof EAttribute) {
			Object name = eObject.eGet(nameFeature);
			if (reference.equals(EcoreUtil.convertToString(((EAttribute) nameFeature).getEAttributeType(), name))) {
				return true;
			}
		}
		return false;
	}
}
