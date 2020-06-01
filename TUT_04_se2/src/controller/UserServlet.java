package controller;

import java.io.IOException;
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

@WebServlet("/users")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDAO userDAO;
       
    public UserServlet() throws ClassNotFoundException {
        super();
        userDAO = new UserDAO();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			listUser(request, response);
		} catch (SQLException | ServletException | IOException e) {
			e.printStackTrace();
		}
	}

	private void listUser(HttpServletRequest req, HttpServletResponse res) throws SQLException, ServletException, IOException {
		List<User> listUser = userDAO.getUsers();
		req.setAttribute("listUser", listUser);
		RequestDispatcher rd = req.getRequestDispatcher("views/users.jsp");
		rd.forward(req, res);
	}
	
}
