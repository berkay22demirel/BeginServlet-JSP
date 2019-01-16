package servletHelloExample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		PrintWriter pw = resp.getWriter();

		String message = "Hello Servlet";
		String message2 = "Berkay Demirel";

		pw.print("<html><body>");
		pw.print(message);
		pw.print("<br>");
		pw.print(message2);
		pw.print("</body></html>");

	}

}
