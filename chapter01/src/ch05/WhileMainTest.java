package ch05;

public class WhileMainTest {
	// �����Լ� (�ڵ��� ������)
	public static void main(String[] args) {
		
//		while(���ǽ�) {
//			���๮1;
//			...
//		}   
//			���๮2;
//			...
//		---> ���ǽ��� ���� ���� {} ���� ���๮�� �ݺ� ����.
		
		// 1 ~ 10 ���� ���� ����
		
		int num = 1;
		int sum = 0;
		while(num < 11) {
			System.out.println("���� �� : " + num);
			sum += num;
			num ++;					
		} // end of while
		System.out.println("�ᱣ�� : "+ sum);
		
		
		// Thead �� �߰� �� �ڵ�.
		
//		int num = 1;
//		int sum = 0;
//		while(num < 11) {
//			System.out.println("���� �� : " + num);
//			sum += num;
//			num ++;		
//			
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		} // end of while
//		System.out.println("�ᱣ�� : "+ sum);
		
	}// end of main

}// end of class
