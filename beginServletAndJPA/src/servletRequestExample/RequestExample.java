package servletRequestExample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestExample extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		PrintWriter printWriter = resp.getWriter();

		String name = req.getParameter("name");
		String surname = req.getParameter("surname");
		String gender = req.getParameter("gender");
		String age = req.getParameter("age");
		String[] languages = req.getParameterValues("languages");
		String brTag = "<br>";

		printWriter.print("<html><body>");
		printWriter.print(name + " " + surname + brTag);
		printWriter.print("Informations : " + gender + " - " + age + brTag);
		printWriter.print("Languages : ");

		if (languages != null) {

			for (String language : languages) {

				printWriter.print(language + " ");
			}
		}

	}



}
