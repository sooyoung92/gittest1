package ch04;

public class IfMainTest {
	// �����Լ� (�ڵ��ǽ���)
	public static void main(String[] args) {
		
		// ��� if
		// �־��� ���ǿ� ���� ������ �̷�� ������ �����Ѵ�.
		// ���� ... �̶��
		
		boolean flag = false;
		
		// if �� �ܵ� ��� ���
		
//		if (���ǽ�) {
//			���๮;
//	    }
		
		if (flag) {
			System.out.println("���ǽ� ����� true�̸� ���� �ȴ�.");
		}// end of if
		
		// if else ��
		
//		if (���ǽ�) {
//			���๮;
//		} else {
//			���๮;
//		}
		
		if (flag) {
			System.out.println("true �̸� ����");
		} else {
			System.out.println("false �̸� ����");;
		}
		
		// if else if else ��
		
//		if (���ǽ�1) {
//			���๮1;
//		} else if (���ǽ�2) {
//			���๮2;
//		} else if (���ǽ�3) {
//			���๮3;
//		} else {
//			���๮4;
//		} 
//		���๮5;    <--- if else if else ���� ������ �����
		
		int point = 40;
		
		if (point >= 90) { 
			System.out.println("A���� �Դϴ�.");
		} else if (point >= 80) {
			System.out.println("B���� �Դϴ�.");
		} else if (point >= 70) {
			System.out.println("C���� �Դϴ�.");
		} else if (point >= 60) {
			System.out.println("D���� �Դϴ�.");
		} else {
			System.out.println("F���� �Դϴ�.");
		}

	}// end of main

}// end of class
