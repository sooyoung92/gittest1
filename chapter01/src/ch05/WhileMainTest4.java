package ch05;

import java.util.Scanner;

public class WhileMainTest4 {
	// �����Լ� (�ڵ��� ������)
	public static void main(String[] args) {
		
		//do ~ while
		// ��ĳ�ʸ� ����ؼ� ����ڿ� �Է°��� �޾Ƽ� ���� ������ ���ּ���.
		// ���꿡 ����� ȭ�鿡 ����ϴ� ���α׷��� ������ּ���.
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("���� �Է��ϼ��� : ");
//		int num = scanner.nextInt();
//		int sum = 0;
//		
//		do {
//			sum += num;
//			num--;
//		} while(num != 0);
//		
//		System.out.println("�ᱣ�� : " + sum);
		
		
		// ����ڰ� 0�� �Է��ϸ� ���α׷��� ������Ѷ�
		// ����ڰ� �Է��� ���� �Լ� �����ϴ� ���α׷����� �����Ű��.
		
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int num;
		do {
			System.out.println("������ ���� �Է��ϼ���.");
			num = scanner.nextInt();
			sum += num;
		} while (num != 0);
		
		System.out.println("�ᱣ�� : " + sum);
		
	}// end of main

}// end of class
