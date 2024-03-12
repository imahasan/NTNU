package no.ntnu.tdt4250.group13.artifacts_servlets;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.*;
import javax.servlet.http.*;

import org.osgi.service.component.annotations.*;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardServletPattern;
import org.osgi.service.log.Logger;
import org.osgi.service.log.LoggerFactory;

@Component
@HttpWhiteboardServletPattern("/timetable/*")
public class TimetableServlet extends HttpServlet implements Servlet {

	private static final long serialVersionUID = 1L;
	
	@Reference(cardinality = ReferenceCardinality.OPTIONAL)
	private volatile LoggerFactory loggerFactory;
	
	private Logger getLogger() {
		if (loggerFactory != null) {
			return (Logger) loggerFactory.getLogger(TimetableServlet.class);
		}
		return null;
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getPathInfo();
		Logger logger = getLogger();
		logger.info("Received request for " + path);
		
		if (path == null || path.equals("/")) {
	        response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Course name is missing in the URL");
	        return;
	    }

	    String[] pathSegments = path.split("/");
	    if (pathSegments.length != 3 || !pathSegments[1].equals("model.xmi")) {
	        response.sendError(HttpServletResponse.SC_NOT_ACCEPTABLE, "URL format is incorrect. Expected format: /timetable/model.xmi/COURSENAME");
	        return;
	    }

	    String separator = File.separator;
	    
	    if (path.contains(".css") || path.contains(".js")) {
	        String relResourcePath = ".." + separator + ".." + separator +
			                    "Timetable" + separator + 
			                    "no.ntnu.tdt4250.group13.timetable.genhtml" + separator + 
			                    "src-gen" + separator + pathSegments[2];
	        
	        Path resourcePath = Paths.get(relResourcePath).toAbsolutePath(); 

	        if (Files.exists(resourcePath) && !Files.isDirectory(resourcePath)) {
	        	response.setContentType(path.contains(".css") ? "text/css" : "application/javascript");
	        	Files.copy(resourcePath, response.getOutputStream());
	        	return;
	        }
	    }
	    
	    String courseName = pathSegments[2];
	    logger.info("Generating HTML page for course: " + courseName);
	    
	    response.setContentType("text/html");
	    
	    String courseHtmlFilePath = ".." + separator + ".." + separator +
	                                "Timetable" + separator + 
	                                "no.ntnu.tdt4250.group13.timetable.genhtml" + separator + 
	                                "src-gen" + separator + courseName + ".html";
	    Path htmlPath = Paths.get(courseHtmlFilePath).toAbsolutePath(); 
	    System.out.println("Attempting to access HTML file at: " + htmlPath.toString());

	    PrintWriter writer = response.getWriter();
	    if (Files.exists(htmlPath) && !Files.isDirectory(htmlPath)) {
	    	String content = new String(Files.readAllBytes(htmlPath));
	        writer.print(content);
	    } else {
	        response.sendError(HttpServletResponse.SC_NOT_FOUND, "HTML file for course " + courseName + " not found");
	    }
	}

}