package ch02;

public class ConstantTest {
	//�����Լ� ( �ڵ��� ������)
	public static void main(String[] args) {
		
		// ���(constant)
		final int MAX_NUM = 12; // ����� ����� �ʱ�ȭ�� ���ÿ� �ߴ�. final�̶�� ���� ���.
		final int MIN_NUM; // ��� ����
		
		MIN_NUM = 1; // �ʱ�ȭ, ������ ������ ���� ����.
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
//		MAX_NUM = 100;
		// ����� �ѹ� �ʱ�ȭ �� �������� ���� ������ �� ����.
		
		final int MY_COUNT = 100;
		
		// 1. ������ ����� ��� ���ϴ� �ɱ��? MY_COUNT
		//		������ ���� �빮�ڷ� �������� ������ ����� �Ϲ������� �빮�ڸ� ���.
		// 2. ������ ��� ��� ���ϴ� �ɱ��? final, int
		// 3. ���ͷ��� ��� �ϱ��? 100
		
	}// end of main

}// end of class
