package ch03;

public class MainTest2 {
	//�����Լ� (�ڵ��� ������)
	public static void main(String[] args) {
		
		// ��� ������ ����
		int number1 = 5 + 3;
		int number2 = 5 - 3;
		int number3 = 5 * 3;
		int number4 = 5 / 3;
		int number5 = 5 % 3;
		
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		System.out.println(number4);
		System.out.println(number5);
		
		System.out.println("------------------------------------");
		// ����
		// 1. (12+3)/3 ���� ȭ�鿡 ����� ������.
		// ��, ������ ���� ��� ����� �ּ���.
		int answer = (12 + 3) / 3;
		System.out.println(answer);
		// 2. (25%2) ���� ȭ�鿡 ����� ������.
		// ��, ���� ������ �ٷ� ȭ�鿡 ����� �ּ���.
		System.out.println(25%2);
		
	}

}
