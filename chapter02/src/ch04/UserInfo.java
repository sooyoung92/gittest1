package ch04;

public class UserInfo {

	String userId;
	String userPassWord;
	String userName;
	String userAddress;
	String userNumber;
	

	// 생성자 오버로딩 - 같은 이름으로 여러개 만드는 일
	// 중요! 생성자는 객체가 생성될 때 처음 실행되는 코드 입니다.
	
		// Alt + Shift + s, o
		// 1. 기본 생성자를 만들어 주세요. 
	public UserInfo() {
	}
	// 2. userId 만 받는 생성자를 만들어 주세요.
	public UserInfo(String userId) {
		this.userId = userId;
	}
	// 3. userId, userPassWord 만 받는 생성자를 만들어 주세요.
	public UserInfo(String userId, String userPassWord) {
		this.userId = userId;
		this.userPassWord = userPassWord;
	}
	// 4. userId, userPassWord, userName 만 받는 생성자를 만들어 주세요.
	public UserInfo(String userId, String userPassWord, String userName) {
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
	}
	// 5. userId, userPassWord, userName, userAddress 만 받는 생성자를 만들어 주세요.
	public UserInfo(String userId, String userPassWord, String userName, String userAddress) {
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
		this.userAddress = userAddress;
		}
	// 6. userId, userPassWord, userName, userAddress, userNumber 만 받는 생성자를 만들어 주세요.
	public UserInfo(String userId, String userPassWord, String userName, String userAddress, String userNumber) {
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
		this.userAddress = userAddress;
		this.userNumber = userNumber;
	}
	
		}
