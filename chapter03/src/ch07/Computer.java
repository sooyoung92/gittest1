package ch07;

public abstract class Computer {

	// �߻� �޼���
	public abstract void display();

	public abstract void typing();

	public void turnOn() {
		System.out.println("������ ��ϴ�.");
	}

	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
	
	// ������("{}")�� ���� ���� �߻� �޼���
	// �� �ϳ��� �߻�޼��带 �����ٰ� �ص� �� Ŭ������ �߻� Ŭ�����̴�.
	// 
}
