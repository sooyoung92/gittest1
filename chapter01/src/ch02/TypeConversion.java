package ch02;

public class TypeConversion {
	// �����Լ� ( �ڵ��� ������ )
	public static void main(String[] args) {
		
		// ������ �� ��ȯ 
		//int �ڷ����� double�� �����ϰų� double�ڷ����� int�� �����ϴ� ���� ����.
		int iNum1 = 100;
		System.out.println(iNum1);
		
		// �ڵ� �� ��ȯ
		double dNum1 = iNum1;
		System.out.println(dNum1);
		
		//���� �� ��ȯ
		double dNumber = 1.12345;
//		int iNumber = dNumber;    <--����,  int�� 4����Ʈ, double�� 8����Ʈ �̹Ƿ�
		
		// �����ڰ� �����Ϸ��� �������ϱ� �׳� ������ �־�!
		int iNumber = (int)dNumber;
		System.out.println(iNumber);
		
		// ����
		double aValue; 
		int bValue;
		
		aValue = 0.5;
		bValue = (int) 10.1;
		System.out.println(bValue);
	}

}
