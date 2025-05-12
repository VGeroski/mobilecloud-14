package org.magnum.mobilecloud.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * An example of a very simple servlet that looks for a single request
 * parameter and echos the parameter value back to the client using
 * the "text/plain" content type.
 * 
 * @author jules
 *
 */
public class EchoServlet extends HttpServlet // Servlets should inherit from HttpServlet
{

	/**
	 * All HTTP GET requests that are routed to the servlet are handled by
	 * this method. All the routing information about which requests
	 * should be sent to this servlet are handled in the web.xml file
	 * (see: src/main/webapp/WEB-INF/web.xml)
	 * 
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		// Set the content type header that is going to be returned in the
		// HTTP response so that the client will know how to display the
		// result.
		resp.setContentType("text/plain");
		
		// Look inside the HTTP request for either a query parameter or
		// a url encoded form parameter in the body that is named "msg"
		String msg = req.getParameter("msg");
		
		// http://foo.bar?msg=asdf
		
		// Echo a response back to the client with the msg that was sent
		resp.getWriter().write("Echo: "+ msg);
	}

	/*
	 * The servlet doesn't override the doPost(), doPut(), etc. methods
	 * in the parent class, so this servlet can't handle the corresponding
	 * HTTP methods. If you need to support POST requests, you would override
	 * doPost().
	 * 
	 */
	
}
