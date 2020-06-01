package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
	
	// TO-DO: Implement selectUser() method to select user by ID (using in UPDATE function)
		public User getUser(int id) throws SQLException {
			User user = null;
			String sql = "select * from user where id='"+id+"'";
			PreparedStatement st = connection.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				user = new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
			}
			return user;
		}

		// TO-DO: Implement insertUser() method to add new record to table User  
		public int insertUser(User user) throws SQLException {
			String sql = "insert into user value(?,?,?,?)";
			PreparedStatement st = connection.prepareStatement(sql);
			st.setInt(1, user.getId());
			st.setString(2, user.getName());
			st.setString(3, user.getMobile());
			st.setString(4, user.getAddress());
			return st.executeUpdate();
		}

		// TO-DO: Implement updateUser() method to update record in table User  
		public int updateUser(User user) throws SQLException {
			int rowUpdated = 0;
			String sql = "update user set name=?, mobile=?, address=? where id=?";
			PreparedStatement st = connection.prepareStatement(sql);
			st.setInt(4, user.getId());
			st.setString(1, user.getName());
			st.setString(2, user.getMobile());
			st.setString(3, user.getAddress());
			rowUpdated =st.executeUpdate();
			return rowUpdated;
		}

		// TO-DO: Implement updateUser() method to delete record in table User  
		public int deleteUser(int id) throws SQLException {
			String sql = "delete from user where id="+id;
			PreparedStatement st = connection.prepareStatement(sql);
			return st.executeUpdate();
		}
	
}
