package ch05;

import java.util.Scanner;

public class WhileMainTest2 {
	// �����Լ� (�ڵ��� ������)
	public static void main(String[] args) {
		
//		final int LIMIT_VALUE = 1000;
		
		//����� ��� ���� ��ĳ�ʸ� ����ؼ� �ڵ带 �������ּ���.
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� ���� �Է����ּ���.");
		final int LIMIT_VALUE = scanner.nextInt();
		
		int num = 1;
		int sum = 0;
		while(num <= LIMIT_VALUE) {
			sum += num;
			num ++;					
		} // end of while
		System.out.println("�ᱣ�� : "+ sum);
		
	}// end of main

}// end of class
