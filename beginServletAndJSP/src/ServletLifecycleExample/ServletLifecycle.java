package ServletLifecycleExample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletLifecycle extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		PrintWriter printWriter = resp.getWriter();
		
		printWriter.print("<html><body>");
		printWriter.print("Servlet Lifecyle Example");
		printWriter.print("<br>");
		printWriter.print("Berkay Demirel");
		printWriter.print("</body></html>");
		
	}

	@Override
	public void destroy() {
		
		System.out.println("Start destroy method");
		super.destroy();
	}

	@Override
	public void init() throws ServletException {
		
		System.out.println("Start init method");
	}
	
	

}
