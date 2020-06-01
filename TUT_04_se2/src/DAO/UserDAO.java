package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import config.DBConnect;
import model.User;

public class UserDAO {
	
	private Connection connection;
	
	public UserDAO() throws ClassNotFoundException {
		connection = DBConnect.getConnection();
	}
	
	public List<User> getUsers() throws SQLException{
		List<User> list = new ArrayList<User>();
		String sql = "select * from user";
		Statement st = connection.prepareStatement(sql);
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String address = rs.getString("address");
			String mobile = rs.getString("mobile");
			list.add(new User(id, name, address, mobile));
		}
		return list;
	}
	
}
