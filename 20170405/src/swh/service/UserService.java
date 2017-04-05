package swh.service;

import java.sql.SQLException;

import swh.dao.UserDao;
import swh.user.vo.LoginVO;

//���񽺴� Controller�� ȣ�� �Ѵ�.
//Dao�� �ʼ������� ȣ���ؼ� �����ͺ��̽��� ���� �� �� �ְ� �� �ְ�(��, DB �۾��� �ʿ� ���� ��쿡�� ȣ�� ���� �ʾƵ� ��)
//����Ͻ� ������ �ƴ� �ΰ����� ���񽺵�(ex: �˸�������, EMAIL, ���� ������ ���.....)�� �����Ѵ�.

public class UserService {
	private UserDao userDao = new UserDao();
	
	public LoginVO login(String id, String pw) throws SQLException{
		//����ڰ� �Է��� id, pw�� �̿��Ͽ� �α��� ������ ���´�.
		LoginVO loginVo = userDao.login(id, pw);
		
		//LoginVO�� �̿��� �ΰ����� �۾����� �����Ѵ�.
		//ex : �α��� ���� �˸� ������, ���� ������ ���....
		return loginVo;
	}
}
