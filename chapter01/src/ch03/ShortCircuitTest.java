package ch03;

public class ShortCircuitTest {
	// �����Լ� (�ڵ��� ������)
	public static void main(String[] args) {
		
		int num1 = 5;
		int i = 0;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i +2 ) < 10);
		System.out.println(value); 
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1 + 10) > 10) || ((i = i +2 ) > 10); 
		// ������ �̹� booleanŸ������ ���������� boolean�� �Ἥ �ٽ� �����ϸ� �ȵȴ�.
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		// ���, ����(&&)���� ���� ���� �̹� false�̹Ƿ� ���� ���� �������� �ʰ� ������� false�� ��ȯ.
		// ����(||)���� ���� ���� false�� ���� �Ŀ��� true�̹Ƿ� ���� ���� �������� �ʰ� ������� true�� ��ȯ.
		// �̷� ���� Shortcircuit �̶�� �Ѵ�.
		
	}// end of main

}// end of class
