package swh.user.vo;

//vo : value object �Ǵ� visual object
// DAO�� �����ͺ��̽��� �����ؼ� ������ �� �������� ���� ������ �뵵�� ����Ѵ�.
// ��� �����͸� ������ ���� �����ϰ� VO�� �ۼ��ϴ� ���� �𵨸��̶� �Ѵ�.
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
