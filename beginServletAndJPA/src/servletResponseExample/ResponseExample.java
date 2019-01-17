package servletResponseExample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResponseExample extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		// Fix Turkish character problem
		resp.setContentType("text/html; charset=UTF-8");

		PrintWriter printWriter = resp.getWriter();
		printWriter.print("üiçşşğI");

		resp.setHeader("ResponseHeader", "HeaderValue");
		resp.addHeader("Name", "Berkay");
		resp.addHeader("Soyad", "Demirel");
		resp.addIntHeader("Age", 24);
		resp.addDateHeader("Today", System.currentTimeMillis());

	}

}
