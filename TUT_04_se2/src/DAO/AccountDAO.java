package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import config.DBConnect;
import model.Account;

public class AccountDAO {

	private Connection connection;
	
	public AccountDAO() throws ClassNotFoundException {
		connection = DBConnect.getConnection();
	}
	
	public List<Account> getAllAccounts() throws SQLException{
		List<Account> list = new ArrayList<Account>();
		String sql = "select * from account";
		PreparedStatement st = connection.prepareStatement(sql);
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			list.add(new Account(rs.getInt(1),rs.getString(2),rs.getString(3)));
		}
		return list;
	}
	
}
