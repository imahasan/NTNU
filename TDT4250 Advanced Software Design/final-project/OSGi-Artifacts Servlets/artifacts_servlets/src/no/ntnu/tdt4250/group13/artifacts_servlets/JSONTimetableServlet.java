package no.ntnu.tdt4250.group13.artifacts_servlets;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import javax.servlet.*;
import javax.servlet.http.*;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emfcloud.jackson.resource.JsonResourceFactory;
import org.osgi.service.component.annotations.*;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardServletPattern;
import org.osgi.service.log.Logger;
import org.osgi.service.log.LoggerFactory;

import no.ntnu.tdt4250.group13.artifacts_servlets.impl.TimetablePackageImpl;

@Component
@HttpWhiteboardServletPattern("/data/*")
public class JSONTimetableServlet extends HttpServlet implements Servlet {

	private static final long serialVersionUID = 1L;
	
	@Reference(cardinality = ReferenceCardinality.OPTIONAL)
	private volatile LoggerFactory loggerFactory;
	
	private Logger getLogger() {
		if (loggerFactory != null) {
			return (Logger) loggerFactory.getLogger(JSONTimetableServlet.class);
		}
		return null;
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getPathInfo();
		Logger logger = getLogger();
		logger.info("Received request for " + path);
		
		if (path == null || path.equals("/")) {
	        response.sendError(HttpServletResponse.SC_BAD_REQUEST, "timetable name is missing in the URL");
	        return;
	    }

	    String[] pathSegments = path.split("/");
	    if (pathSegments.length != 3 || !pathSegments[1].equals("model.xmi")) {
	        response.sendError(HttpServletResponse.SC_NOT_ACCEPTABLE, "URL format is incorrect. Expected format: /data/model.xmi/TIMETABLENAME");
	        return;
	    }
	    
	    String timetableName = pathSegments[2];
	    logger.info("Generating JSON file for: " + timetableName);
	    
	    response.setContentType("text");
	    
	    String separator = File.separator;
	    String timetableFilePath = ".." + separator + ".." + separator +
	                                "Timetable" + separator + 
	                                "no.ntnu.tdt4250.group13.timetable.examples" + 
	                                separator + timetableName + ".timetable";
	    Path timetablePath = Paths.get(timetableFilePath).toAbsolutePath(); 
	    System.out.println("Attempting to access timetable file at: " + timetablePath.toString());
	    
	    File timetableFile = new File(timetablePath.toString());
	    
	    if (Files.exists(timetablePath) && !Files.isDirectory(timetablePath)) {
	    	
	    	TimetablePackage myPackage = TimetablePackageImpl.eINSTANCE;
	    	TimetableFactory myFactory = myPackage.getTimetableFactory();
			

			EPackage.Registry.INSTANCE.put(myPackage.getNsURI(), myPackage);
			
		
	        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	        Map<String, Object> m = reg.getExtensionToFactoryMap();
	        m.put("sm", new XMIResourceFactoryImpl());

	    	
	    	ResourceSet resourceSet = new ResourceSetImpl();
	        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("timetable", new XMIResourceFactoryImpl());
	        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("json", new JsonResourceFactory());
	        Resource resource = resourceSet.createResource(URI.createFileURI(timetableFile.getAbsolutePath()));
	        resource.load(null);

	        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	        Resource jsonResource = resourceSet.createResource(URI.createURI("memory:/temp.json"));
	        jsonResource.getContents().addAll(resource.getContents());
	        jsonResource.save(outputStream, null);
	        String jsonString = outputStream.toString("UTF-8");

	        response.setContentType("application/json");
	        PrintWriter writer = response.getWriter();
	        writer.println(jsonString);

	    } else {
	        response.sendError(HttpServletResponse.SC_NOT_FOUND, "timetable file for timetable " + timetableName + " not found");
	    }
	}
	

}