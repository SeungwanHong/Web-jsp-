package hsw.dao;

import java.util.List;

import hsw.vo.user.LoginVo;
import hsw.vo.user.UserVo;

public interface UserDao {
	public LoginVo login(String id, String pw);
	//public List<UserVo> userList();
}
