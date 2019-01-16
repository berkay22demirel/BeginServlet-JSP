package ServletConfigExample;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfigExample extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		PrintWriter printWriter = resp.getWriter();
		ServletConfig servletConfig = getServletConfig();

		String servletName = servletConfig.getServletName();
		String brTag = "<br>";

		Enumeration<String> initParameters = servletConfig.getInitParameterNames();

		printWriter.print("<html><body>");
		printWriter.print(servletName);
		printWriter.print(brTag);

		while (initParameters.hasMoreElements()) {

			String parameterName = initParameters.nextElement();
			String parameterValue = servletConfig.getInitParameter(parameterName);

			printWriter.print(parameterName + " : " + parameterValue);
			printWriter.print(brTag);

		}

		printWriter.print("</body></html>");

	}
}
