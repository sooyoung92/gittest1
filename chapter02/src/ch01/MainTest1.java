package ch01;

public class MainTest1 {

	public static void main(String[] args) {
		
		Order order1 = new Order();
		// 멤버 변수의 특성.
		System.out.println(order1.orderId);
		System.out.println(order1.buyerId);
		System.out.println(order1.sellerId);
		System.out.println(order1.productId);
		System.out.println(order1.orderDate);
		// int타입의 초기값은 0, String의 초기값은 null
	
		// 1. order1 값을 넣어 주세요.
		
		order1.orderId = 0101010010;
		order1.buyerId = "배가 고픈자.";
		order1.sellerId = "요리사";
		order1.productId = 123123;
		order1.orderDate = "10월 21일";
		
		System.out.println(order1.orderId);
		System.out.println(order1.buyerId);
		System.out.println(order1.sellerId);
		System.out.println(order1.productId);
		System.out.println(order1.orderDate);
	
		System.out.println("-------------------------");
		
		UserInfo userInfo1 = new UserInfo();
		// 2. userInfo1 값을 넣고 화면에 출력
		
		userInfo1.userId =  "MyName";
		userInfo1.userPassWord = "1q2w3e"; 
		userInfo1.userName = "나의 이름은";
		userInfo1.userAddress = "부산";
		userInfo1.phoneNumber = "01012341234";
		
		System.out.println(userInfo1.userId);
		System.out.println(userInfo1.userPassWord);
		System.out.println(userInfo1.userName);
		System.out.println(userInfo1.userAddress);
		System.out.println(userInfo1.phoneNumber);

	}

}
