package ch04;

public class Bus {
	
	// ���� ��ȣ
	// �°� ��
	// ���ͱ�
	
	int busNumber;
	int passengerCount;
	int money;
	
	// �����Ϸ��� �⺻ �����ڸ� ����� �ش�.
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
//		this.money = money + money;
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(busNumber + "���� �°��� ");
		System.out.println(passengerCount+ "�� �̰� ");
		System.out.println("���� ���ͱ��� : " + money + "�� �Դϴ�.");
	}
	
	
	
}
