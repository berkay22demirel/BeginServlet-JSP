package servletCookieExample;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CookieExample extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		HttpSession session = req.getSession();
		PrintWriter printWriter = resp.getWriter();

		Integer accessCount = (Integer) session.getAttribute("accessCount");
		if (accessCount == null) {
			accessCount = 0;
		} else {
			accessCount++;
		}
		session.setAttribute("accessCount", accessCount);

		String id = session.getId();
		Date creationTime = new Date(session.getCreationTime());
		Date lastAccessedTime = new Date(session.getLastAccessedTime());
		Integer maxInactiveInternal = session.getMaxInactiveInterval();
		
		printWriter.print("id : " + id);
		printWriter.print("\naccess count : " + accessCount);
		printWriter.print("\ncreation time : " + creationTime);
		printWriter.print("\nlast accessed time : " + lastAccessedTime);
		printWriter.print("\nmax inactive internal : " + maxInactiveInternal);

	}


}
