package ch04;

import java.util.Scanner;

public class IfMainTest2 {
	// �����Լ� (�ڵ��� ������)
	public static void main(String[] args) {
		
		// ���� 1. if ���� ����ؼ� ������ ������ּ���.
		// 100 ~ 90 --> A
		// 90 ~ 80 --> B
		// 80 ~ 70 --> C
		// 70 ~ 60 --> D
		// 60 ~ 0 --> F
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��� �ּ���.");
		int point = scanner.nextInt();
		char result = 'k';
		
		if (point <= 100 && point >= 90) {
			result = 'A';
		} else if (point < 90 && point >= 80) {
			result = 'B';
		} else if (point < 80 && point >= 70) {
			result = 'C';
		} else if (point < 70 && point >= 60) {
			result = 'D';
		} else if (point < 60 && point >= 0) {
			result = 'F';
		}
		if (result != 'k') {
			System.out.println(result + " ���� �Դϴ�.");
		}else {
			System.out.println("������ �߸� �Է� �ϼ˽��ϴ�. �ٽ� �Է��Ͻʽÿ�.");
		}
		
	}// end of main

}// end of class
