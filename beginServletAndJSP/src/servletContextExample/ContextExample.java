package servletContextExample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContextExample extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		PrintWriter printWriter = resp.getWriter();
		ServletContext servletContext = getServletContext();
		ServletConfig servletConfig = getServletConfig();

		String contextParam = servletContext.getInitParameter("contextParam");
		String configParam = servletConfig.getInitParameter("configParam");

		printWriter.print("<html><body>");
		printWriter.print(contextParam);
		printWriter.print("<br>");
		printWriter.print(configParam);

	}

}
