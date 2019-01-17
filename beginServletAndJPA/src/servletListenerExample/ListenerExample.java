package servletListenerExample;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class ListenerExample extends HttpServlet implements
		ServletContextListener, ServletContextAttributeListener,
		ServletRequestListener, ServletRequestAttributeListener,
		HttpSessionListener, HttpSessionAttributeListener {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		ServletContext context = getServletContext();
		HttpSession session = req.getSession();

		context.setAttribute("contextAttribute", "value");
		context.setAttribute("contextAttribute", "contextValue");
		context.removeAttribute("contextAttribute");

		req.setAttribute("requestAttribute", "value");
		req.setAttribute("requestAttribute", "requestValue");
		req.removeAttribute("requestAttribute");

		session.setAttribute("sessionAttribute", "value");
		session.setAttribute("sessionAttribute", "sessionValue");
		session.removeAttribute("sessionAttribute");

	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("contextDestroyed");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("contextInitialized");

		ServletContext context = arg0.getServletContext();
		System.out.println("Context Path : " + context.getContextPath());

	}

	@Override
	public void attributeAdded(ServletContextAttributeEvent arg0) {
		System.out.println("contextAttributeAdded : " + arg0.getName() + " " + arg0.getValue());
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent arg0) {
		System.out.println("contextAttributeRemoved : " + arg0.getName() + " " + arg0.getValue());
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent arg0) {
		System.out.println("contextAttributeReplaced : " + arg0.getName() + " " + arg0.getValue());
	}

	@Override
	public void attributeAdded(ServletRequestAttributeEvent arg0) {
		System.out.println("requestAttributeAdded : " + arg0.getName() + " " + arg0.getValue());

	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent arg0) {
		System.out.println("requestAttributeRemoved : " + arg0.getName() + " " + arg0.getValue());

	}

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent arg0) {
		System.out.println("requestAttributeReplaced : " + arg0.getName() + " " + arg0.getValue());

	}

	@Override
	public void requestDestroyed(ServletRequestEvent arg0) {
		System.out.println("requestDestroyed");

	}

	@Override
	public void requestInitialized(ServletRequestEvent arg0) {
		System.out.println("requestInitialized");

		HttpServletRequest req = (HttpServletRequest) arg0.getServletRequest();

		System.out.println("Servlet Path : " + req.getServletPath());

	}

	@Override
	public void attributeAdded(HttpSessionBindingEvent arg0) {
		System.out.println("sessionAttributeAdded : " + arg0.getName() + " " + arg0.getValue());
		
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		System.out.println("sessionAttributeRemoved : " + arg0.getName() + " " + arg0.getValue());
		
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent arg0) {
		System.out.println("sessionAttributeReplaced : " + arg0.getName() + " " + arg0.getValue());
		
	}

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println("sessionCreated");
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println("sessionDestroyed");
		
	}

}
