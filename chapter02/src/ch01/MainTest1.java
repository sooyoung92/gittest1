package ch01;

public class MainTest1 {

	public static void main(String[] args) {
		
		Order order1 = new Order();
		// ��� ������ Ư��.
		System.out.println(order1.orderId);
		System.out.println(order1.buyerId);
		System.out.println(order1.sellerId);
		System.out.println(order1.productId);
		System.out.println(order1.orderDate);
		// intŸ���� �ʱⰪ�� 0, String�� �ʱⰪ�� null
	
		// 1. order1 ���� �־� �ּ���.
		
		order1.orderId = 0101010010;
		order1.buyerId = "�谡 ������.";
		order1.sellerId = "�丮��";
		order1.productId = 123123;
		order1.orderDate = "10�� 21��";
		
		System.out.println(order1.orderId);
		System.out.println(order1.buyerId);
		System.out.println(order1.sellerId);
		System.out.println(order1.productId);
		System.out.println(order1.orderDate);
	
		System.out.println("-------------------------");
		
		UserInfo userInfo1 = new UserInfo();
		// 2. userInfo1 ���� �ְ� ȭ�鿡 ���
		
		userInfo1.userId =  "MyName";
		userInfo1.userPassWord = "1q2w3e"; 
		userInfo1.userName = "���� �̸���";
		userInfo1.userAddress = "�λ�";
		userInfo1.phoneNumber = "01012341234";
		
		System.out.println(userInfo1.userId);
		System.out.println(userInfo1.userPassWord);
		System.out.println(userInfo1.userName);
		System.out.println(userInfo1.userAddress);
		System.out.println(userInfo1.phoneNumber);

	}

}
