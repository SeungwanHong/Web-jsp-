package hsw.service;


import hsw.vo.user.LoginVo;

public interface UserService {
	public LoginVo loginCheck(String id, String pw);
//	public List<UserVo> userList();
//	public boolean join(String id, String pw, String name, String email);
}
