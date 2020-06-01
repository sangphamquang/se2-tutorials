package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.UserDAO;
import model.User;

/**
 * This servlet acts as a page controller for the application, handling all
 * requests from the user.
 */

@WebServlet("/")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DAO.UserDAO userDAO;

	public void init() {
		try {
			userDAO = new UserDAO();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String[] path = request.getServletPath().split("/");
		switch (path[1]) {
		case "add":
			try {
				this.insertUser(request, response);
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			break;
		case "update":
			try {
				this.updateUser(request, response);
			} catch (SQLException | IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String[] path = request.getServletPath().split("/");
		if (path.length == 0 || "user".equals(path[1])) {
			try {
				listUser(request, response);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			switch (path[1]) {
			case "add":
				this.showNewForm(request, response);
				break;
			case "update":
				try {
					this.showEditForm(request, response);
				} catch (SQLException | ServletException | IOException e1) {
					e1.printStackTrace();
				}
				break;
			case "delete":
				try {
					this.deleteUser(request, response);
				} catch (SQLException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
		}
	}

	private void listUser(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<User> listUser = userDAO.getUsers();
		request.setAttribute("listUser", listUser);
		RequestDispatcher dispatcher = request.getRequestDispatcher("views/user-list.jsp");
		dispatcher.forward(request, response);
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("views/add-user.jsp");
		rd.forward(request, response);
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		String[] path = request.getServletPath().split("/");
		User u = userDAO.getUser(Integer.parseInt(path[2]));
		request.setAttribute("user", u);
		RequestDispatcher rd = request.getRequestDispatcher("/views/edit-user.jsp");
		rd.forward(request, response);
	}

	private void insertUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		User u = new User(Integer.parseInt(request.getParameter("id")), request.getParameter("name"),
				request.getParameter("mobile"), request.getParameter("address"));
		if(userDAO.getUser(u.getId())!=null) {
			PrintWriter out = response.getWriter();
			out.println("<script type=\"text/javascript\">");
			   out.println("alert('User or password incorrect');");
			   out.println("location='/se2/user';");
			   out.println("</script>");
		}else {
			userDAO.insertUser(u);
			response.sendRedirect("/se2/user");
		}
	}

	private void updateUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		User u = new User(Integer.parseInt(request.getParameter("id")), request.getParameter("name"),
				request.getParameter("mobile"), request.getParameter("address"));
		userDAO.updateUser(u);
		response.sendRedirect("/se2/user");
	}

	private void deleteUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		String[] path = request.getServletPath().split("/");
		userDAO.deleteUser(Integer.parseInt(path[2]));
		response.sendRedirect("/se2/user");
	}
}
