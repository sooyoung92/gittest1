package ch04;

public class UserInfo {

	String userId;
	String userPassWord;
	String userName;
	String userAddress;
	String userNumber;
	

	// ������ �����ε� - ���� �̸����� ������ ����� ��
	// �߿�! �����ڴ� ��ü�� ������ �� ó�� ����Ǵ� �ڵ� �Դϴ�.
	
		// Alt + Shift + s, o
		// 1. �⺻ �����ڸ� ����� �ּ���. 
	public UserInfo() {
	}
	// 2. userId �� �޴� �����ڸ� ����� �ּ���.
	public UserInfo(String userId) {
		this.userId = userId;
	}
	// 3. userId, userPassWord �� �޴� �����ڸ� ����� �ּ���.
	public UserInfo(String userId, String userPassWord) {
		this.userId = userId;
		this.userPassWord = userPassWord;
	}
	// 4. userId, userPassWord, userName �� �޴� �����ڸ� ����� �ּ���.
	public UserInfo(String userId, String userPassWord, String userName) {
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
	}
	// 5. userId, userPassWord, userName, userAddress �� �޴� �����ڸ� ����� �ּ���.
	public UserInfo(String userId, String userPassWord, String userName, String userAddress) {
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
		this.userAddress = userAddress;
		}
	// 6. userId, userPassWord, userName, userAddress, userNumber �� �޴� �����ڸ� ����� �ּ���.
	public UserInfo(String userId, String userPassWord, String userName, String userAddress, String userNumber) {
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
		this.userAddress = userAddress;
		this.userNumber = userNumber;
	}
	
		}
