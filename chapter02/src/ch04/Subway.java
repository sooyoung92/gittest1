package ch04;

public class Subway {

	// ȣ�� ��ȣ
	// �°���
	// ���ͱ�
	int lineNum;
	int passengerNum;
	int money;
	
	// ������ - ȣ����ȣ�� �޴� ������.
	public Subway(int num) {
		this.lineNum = num;
	}
	
		
	// �޼��� take, showInfo
	public void take(int money) {
		this.money += money;
		passengerNum++;
	}
	
	public void showInfo() {
		System.out.println(
				"�� ����ö�� " + lineNum + "ȣ���̰� "
				+ "\n�� �°��� " + passengerNum + "�� �Դϴ�."
				+ "\n���� ���ͱ� : " + money + "�� �Դϴ�."
				);
	}
	
}// end of class
