package no.ntnu.tdt4250.group13.timetable.servletsupport.impl;

import java.io.IOException;

import org.eclipse.emf.ecore.EObject;

import com.fasterxml.jackson.core.JsonGenerator;

public interface JsonEObjectSerializer {
	public boolean accept(EObject eObject);
	public void serialize(EObject eObject, JsonGenerator generator) throws IOException;
}
