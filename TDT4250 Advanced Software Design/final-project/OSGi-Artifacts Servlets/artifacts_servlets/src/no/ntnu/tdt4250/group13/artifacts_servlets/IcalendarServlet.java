package no.ntnu.tdt4250.group13.artifacts_servlets;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
@HttpWhiteboardServletPattern("/icalendar/*")
public class IcalendarServlet extends HttpServlet implements Servlet {

	private static final long serialVersionUID = 1L;
	
	@Reference(cardinality = ReferenceCardinality.OPTIONAL)
	private volatile LoggerFactory loggerFactory;
	
	private Logger getLogger() {
		if (loggerFactory != null) {
			return (Logger) loggerFactory.getLogger(IcalendarServlet.class);
		}
		return null;
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getPathInfo();
		Logger logger = getLogger();
		logger.info("Received request for " + path);
		
		if (path == null || path.equals("/")) {
	        response.sendError(HttpServletResponse.SC_BAD_REQUEST, "iCalendar name is missing in the URL");
	        return;
	    }

	    String[] pathSegments = path.split("/");
	    if (pathSegments.length != 3 || !pathSegments[1].equals("model.xmi")) {
	        response.sendError(HttpServletResponse.SC_NOT_ACCEPTABLE, "URL format is incorrect. Expected format: /iCalendar/model.xmi/iCalendarNAME");
	        return;
	    }
	    
	    String iCalendarName = pathSegments[2];
	    logger.info("Generating iCalendar file for: " + iCalendarName);
	    
	    response.setContentType("text/html");
	    PrintWriter writer = response.getWriter();
	    
	    String separator = File.separator;
	    String iCalendarIcsFilePath = ".." + separator + ".." + separator +
	                                "Timetable" + separator + 
	                                "no.ntnu.tdt4250.group13.timetable.genics" + separator + 
	                                "src-gen" + separator + iCalendarName + ".ics";
	    Path icsPath = Paths.get(iCalendarIcsFilePath).toAbsolutePath(); 
	    System.out.println("Attempting to access ics file at: " + icsPath.toString());
	    
	    File icsFile = new File(icsPath.toString());
	    
	    if (Files.exists(icsPath) && !Files.isDirectory(icsPath)) {

	    	BufferedReader reader = new BufferedReader(new FileReader(icsFile));
	        String line;
	        while ((line = reader.readLine()) != null) {
	            writer.println(line);
	            writer.println("<br>");
	        }
	        reader.close();

	    } else {
	        response.sendError(HttpServletResponse.SC_NOT_FOUND, "ics file for iCalendar " + iCalendarName + " not found");
	    }
	}

}