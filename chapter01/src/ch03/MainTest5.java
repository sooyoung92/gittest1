package ch03;

public class MainTest5 {
	//���� �Լ� (�ڵ��� ������)
	public static void main(String[] args) {
		
		// �� ������ ( &&, || ) ���ۼ�Ʈ, ��Ƽ�ù�
		// ���� �����ڿ� ȥ���Ͽ� ���� ��� ��
		// ���꿡 ����� true, false
		
		int num1 = 10;
		int num2 = 20;
		
		// 1. �� �� (&&)
		
		boolean flag1 = (num1 > 0) && (num2 > 0);
		boolean flag2 = (num1 > 0) && (num2 < 0);
		System.out.println(flag1);
		System.out.println(flag2);
		// �� �� true(��)�϶�, true�� ��ȯ.
		
		// 2. �� �� (||)
		
		boolean flag3 = (num1 > 0) || (num2 < 0);
		boolean flag4 = (num1 < 0) || (num2 >0);
		System.out.println(flag3);
		System.out.println(flag4);
		// �� �� �ϳ��� true �̸�, ���꿡 ����� true�� ��ȯ.
		
		System.out.println("----------------------------");
		
		// num1 = 10, num2 = 20
		boolean flag5 = (num1 < 0) && (num2 > 0);
		// ���� num1<0 �� false �̹Ƿ� �ڴ� �������� �ʰ� ������� false�� ��ȯ.
		boolean flag6 = (num1 > 0) || (num2 > 0);
		// ���� num1>0 �� true �̹Ƿ� �ڴ� �������� �ʰ� ������� true�� ��ȯ.
	
		boolean flag7 = !(num1 >0);
		System.out.println(flag7);
		
	}// end of main

}// end of class
