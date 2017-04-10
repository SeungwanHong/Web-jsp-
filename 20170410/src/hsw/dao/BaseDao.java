package hsw.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class BaseDao {
	private static final String DB_URL = "jdbc:oracle:thin:@192.168.1.2:1521:orcl";
	private static final String DB_USER = "smh";
	private static final String DB_PASSWORD = "smh";
	
	protected Connection conn = null;
	protected PreparedStatement pstmt = null;
	protected ResultSet rs = null;
	protected String sql = "";
	
	protected Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		return conn;
	}
}