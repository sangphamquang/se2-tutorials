package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import config.DBConnect;
import model.Track;

public class TrackDAO {

private Connection connection;
	
	public TrackDAO() throws ClassNotFoundException {
		connection = DBConnect.getConnection();
	}
	
	public List<Track> getAllTracks() throws SQLException{
		List<Track> list = new ArrayList<Track>();
		String sql = "select * from track";
		Statement st = connection.prepareStatement(sql);
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			list.add(new Track(rs.getInt(1), rs.getString(3), rs.getInt(4), rs.getInt(5)));
		}
		return list;
	}
	
	
}
