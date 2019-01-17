package servletResponseExample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieExample extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		PrintWriter printWriter = resp.getWriter();

		// Create Cookie
		Cookie userNameCookie = new Cookie("userName", "Berkay");
		Cookie passwordCookie = new Cookie("password", "123456");
		
		// Create Cookie
		resp.addHeader("Set-Cookie", "CookieName=CookieValue");

		resp.addCookie(userNameCookie);
		resp.addCookie(passwordCookie);
		
		Cookie[] cookies = req.getCookies();
		if(cookies != null) {
			for(Cookie cookie : cookies) {
				
				printWriter.print("\n");
				printWriter.print(cookie.getName() + " : " + cookie.getValue());
			}
			
		}

	}

}
