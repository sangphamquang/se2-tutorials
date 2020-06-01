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

import DAO.AccountDAO;
import model.Account;
import model.User;

/**
 * Servlet implementation class AccountServlet
 */
@WebServlet("/accounts")
public class AccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private AccountDAO accountDAO;
    
    public AccountServlet() throws ClassNotFoundException {
        super();
        accountDAO = new AccountDAO();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			listAccount(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void listAccount(HttpServletRequest req, HttpServletResponse res) throws SQLException, ServletException, IOException {
		List<Account> accounts = accountDAO.getAllAccounts();
		req.setAttribute("accounts", accounts);
		RequestDispatcher rd = req.getRequestDispatcher("views/accounts.jsp");
		rd.forward(req, res);
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
