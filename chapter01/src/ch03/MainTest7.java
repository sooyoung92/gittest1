package ch03;

public class MainTest7 {
	// �����Լ� (�ڵ��� ������)
	public static void main(String[] args) {
		
		// ���� ���� ������
		// ���� �����ڿ� �ٸ� �����ڸ� �Բ� ���.
		
		int num1 = 1;
		
		num1 += 10;
//		num1 = num1 + 10;  �� ����.
		System.out.println(num1);
		
		int num2 = 1;
		num2 -= 10;
//		num2 = num2 - 10
		System.out.println(num2);
		
		
		// num2 ������ ���ϱ� 2�� �ؼ� num2 ���� ������� ��� �ּ���.
		// ��, ���� ���� �����ڸ� ���.
		num2 *= 2;
		
		// num2 ������ ������ 2�� �ؼ� num2 ���� ������� ��� �ּ���.
				// ��, ���� ���� �����ڸ� ���.
		num2 /= 2;
		
		// num2 ������ ������������ 2�� �ؼ� num2 ���� ������� ��� �ּ���.
				// ��, ���� ���� �����ڸ� ���.
		num2 %= 2;
		
	}// end of main

}// end of class
