package ch05;

public class Student {

	String name;
	int money;
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	// �л��� ������ ź��. (��üü�� ��ü���� ��ȣ�ۿ��ϰ� �ڵ带 ����)
	public void takeBus(Bus bus) {
		bus.take(1200);
		this.money -= 1200;
	}
	
	// �л��� ����ö�� ź��.
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	// ����â �����ֱ�
	public void showInfo() {
		System.out.println(name + "���� ���� ���� : " + money + "�� �Դϴ�.");
	}
	
	
	
}
