package jspExpressionLanguageExample;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExpressionLExample extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		PersonModel person1 = new PersonModel();

		person1.setName(req.getParameter("name"));
		person1.setSurname(req.getParameter("surname"));
		person1.setGender(req.getParameter("gender"));
		person1.setAge(req.getParameter("age"));
		person1.setLanguages(req.getParameterValues("languages"));

		req.setAttribute("person1", person1);
		
		RequestDispatcher view = req.getRequestDispatcher("JSP-INF/expressionLanguage.jsp");
		view.forward(req, resp);

	}

}
