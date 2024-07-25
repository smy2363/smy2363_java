package study;

public class Member {
	private String userId;  // ���̺��÷��� ��Ģ - user_id
	private String userPassword;
	private String userEmail;
	private String userName;
	
	public Member() {}
	
	public Member(String userId, String userPassword, String userEmail, String userName) {
		this.userId = userId;
		this.userPassword=userPassword;
		this.userEmail=userEmail;
		this.userName=userName;
	}
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
