package swh.service;

import java.sql.SQLException;

import swh.dao.UserDao;
import swh.user.vo.LoginVO;

//서비스는 Controller가 호출 한다.
//Dao를 필수적으로 호출해서 데이터베이스에 접근 할 수 있게 해 주고(단, DB 작업이 필요 없는 경우에는 호출 하지 않아도 됨)
//비즈니스 로직이 아닌 부가적인 서비스들(ex: 알림보내기, EMAIL, 문자 보내기 등등.....)을 수행한다.

public class UserService {
	private UserDao userDao = new UserDao();
	
	public LoginVO login(String id, String pw) throws SQLException{
		//사용자가 입력한 id, pw를 이용하여 로그인 정보를 얻어온다.
		LoginVO loginVo = userDao.login(id, pw);
		
		//LoginVO를 이용한 부가적인 작업들을 진행한다.
		//ex : 로그인 성공 알림 보내기, 문자 보내기 등등....
		return loginVo;
	}
}
