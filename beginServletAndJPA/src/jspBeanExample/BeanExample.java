package jspBeanExample;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BeanExample extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		List<String> languages = new ArrayList<String>();
		languages.add("Java");
		languages.add("C#");
		languages.add("C");
		req.setAttribute("languages", languages);

		RequestDispatcher view = req.getRequestDispatcher("JSP-INF/bean.jsp");
		view.forward(req, resp);

	}



}
