package swh.user.vo;

//vo : value object 또는 visual object
// DAO가 데이터베이스에 접근해서 가지고 온 데이터의 값을 저장할 용도로 사용한다.
// 어떠한 데이터를 가지고 올지 결정하고 VO를 작성하는 일을 모델링이라 한다.
public class LoginVO {
	private String userId;
	private String UserName;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
}
