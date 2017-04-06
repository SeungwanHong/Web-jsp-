package swh.dao;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import swh.user.vo.LoginVO;

//MVC ����

// Model View Controller
// ������ ���̽��� �����Ͽ� �����͸� ��ȸ,����,����,������ �ϴ� ����

//���󼼻��߿���
//DAO : Data Access Object

public class UserDao {

	private static final String DB_URL = "jdbc:oracle:thin:@192.168.1.2:1521:orcl";
	private static final String DB_USER = "smh";
	private static final String DB_PASSWORD = "smh";

	public LoginVO login(String id, String pw) throws SQLException {

		Connection conn = getConnection();
		String sql = "SELECT userid, username FROM TB_USER " + "WHERE USERID=? AND USERPW=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, pw);

		ResultSet login_rs = pstmt.executeQuery();
		
		LoginVO loginVO = null;
		//���� ��ȸ ������� �ִٸ�
		if (login_rs.next()) {
			//loginVO ��ü�� ������ ���� ����� �־��ش�.
			loginVO = new LoginVO();
			
			//��ȸ�� ������� VO�� �־��ش�.
			loginVO.setUserId(login_rs.getString("userid"));
			loginVO.setUserName(login_rs.getString("username"));	
		}

		login_rs.close();
		pstmt.close();
		conn.close();
		
		return loginVO;
	}

	public int joinUser(String id, String pw, String name, String email) throws SQLException {
		Connection conn = getConnection();
		String sql = "insert into tb_user(userid,userpw,username,email,joindate)" + " values(?,?, ?, ?, sysdate)";

		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, pw);
		pstmt.setString(3, name);
		pstmt.setString(4, email);

		int result = pstmt.executeUpdate();
		pstmt.close();
		conn.close();

		return result;
	}

	private Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		return conn;
	}

}