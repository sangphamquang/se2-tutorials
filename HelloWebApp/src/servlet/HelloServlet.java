package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */

public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HelloServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		ServletOutputStream out = response.getOutputStream();

		out.println("<html>");
		out.println("<head><title>Hello Servlet</title></head>");

		out.println("<body>");
		if("admin".equals(name)&&"123456".equals(password)) {
			out.println("<h3>Log in succesfully</h3>");
		}else {
			out.println("<h3><b>wrong username or password</b>.(hint: admin - 123456)</h3>");
		}
		out.println("</body>");
		out.println("<html>");
	}

}
