package hsw.service.impl;


import hsw.dao.UserDao;
import hsw.dao.imple.UserDaoImple;
import hsw.service.UserService;
import hsw.vo.user.LoginVo;

public class UserServiceImpl implements UserService{

	@Override
	public LoginVo loginCheck(String id, String pw) {
		LoginVo loginVo = new LoginVo();
		UserDao userDao = new UserDaoImple();
		loginVo = userDao.login(id, pw);
		return loginVo;
	}
	
	
}
//private UserDaoImple userDao = new UserDaoImple();
//
//
//public LoginVo login(String id, String pw){
//	LoginVo userVo = userDao.login(id, pw);
//	return userVo;
//}
//public List<UserVo> userList(){
//	List<UserVo> userList = null;
//	userList = userDao.userList();
//	return userList;
//}
//public boolean join(String id, String pw, String name, String email) {
//	int result = userDao.joinUser(id, pw, name, email);
//	return 1==result;
//}