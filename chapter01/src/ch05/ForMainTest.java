package ch05;

public class ForMainTest {
	// �����Լ� (�ڵ��� ����)
	public static void main(String[] args) {
		
		/**
		 *       for(�ʱ�ȭ��; ���ǽ�; ������) {
		 *       
		 *             ���๮;
		 *       
		 *       }
		 */
		
		// for���� �̿��ؼ� 1���� 10���� ���� ����
		// ���꿡 ���� ����� ���ؼ� ������ �ʿ��ϴ�.
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum += i;
			System.out.println("i�� ���簪 : " + i);
		}
		System.out.println("����� : " + sum);
		
	}// end of main

}// end of class
