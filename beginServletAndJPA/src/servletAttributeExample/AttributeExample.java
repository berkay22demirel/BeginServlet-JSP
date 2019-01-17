package servletAttributeExample;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AttributeExample extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		ServletContext context = getServletContext();
		HttpSession session = req.getSession();

		context.setAttribute("Context Attribute", "Context Value");
		session.setAttribute("Session Attribute", "Session Value");
		req.setAttribute("Request Attribute", "Request Value");
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("JSP-INF/attribute.jsp");

		dispatcher.forward(req, resp);

	}

}
