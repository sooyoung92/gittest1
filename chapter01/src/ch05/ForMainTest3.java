package ch05;

public class ForMainTest3 {
	// �����Լ� (�ڵ��� ������)
	public static void main(String[] args) {
		
		// 1 ���� 9 ���� �ݺ�
		
//		for (int i = 1; i <10; i++) {
//			
//			for(int j = 1; j <10; j++) {
//				
//			}
//		}
		// ���� for ������ ������ 2 ~ 9 ���� ����� �ּ���.
		int num = 0;
		for (num = 2; num < 10; num++) {
			// 2 ~ 9 ���� �ݺ��Ѵ�.
			for (int i = 1; i < 10; i++) {
				System.out.println(num + " * " + i + " = "+ (num * i));
			}
			System.out.println();
		}

	}// end of main

}// end of class
