package ch03;

public class MainTest1 {
	//�����Լ� (�ڵ��ǽ�����)
	public static void main(String[] args) {
		
		// ���� ������ (=)
		int number = 11;
		// = (���б�ȣ�� �޸� ������ ���� �����ϴ� �������̴�.)
		//���꿡 ������ �����ʿ��� �������� ����ȴ�
		
		int number2 = number;
		// ������ ������ ������ ���� �ִ�.
		
		System.out.println(number);
		System.out.println(number2);
		
		// ��ȣ ������ (+,-)
		// ��ȣ�� �����ϴ� ������
		// �� ������ ��� �մ� ���� ���� ������ ���´� �ƴϴ�.
		System.out.println(-number); // ȭ�鿡 ����� �� ��ȣ�� �ٲ㼭 ��¸� ���ٻ��̴�.
		System.out.println("number�� ���� �� : " + number);
		
		number = -number; // ���� �������� ��ȣ�� �ٲ� ��.
		System.out.println(number);
		// ������ ���� ���� �����Ϸ��� ���� �����ڸ� �Բ� ����ؾ� �Ѵ�.
		
	}// end of main

}// end of class
