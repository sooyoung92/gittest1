package ch05;
	
public class WhileMainTest3 {
	// �����Լ� (�ڵ��� ������)
	public static void main(String[] args) {
		
		//do ~ while
//		do {
//			���๮1;
//			...
//		} while(���ǽ�);
//			���๮2;
//			...
		
		int input = 10;
		int sum = 0;
		
		do {
			System.out.println("���� �� : " + input);
			sum += input;
			input--; // ���� �ݺ��� ��������.
		} while(input !=0);
		System.out.println("���꿡 ����� : " + sum +"�Դϴ�.");

	}// end of main

}// end of class
