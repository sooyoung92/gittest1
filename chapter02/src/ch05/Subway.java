package ch05;

public class Subway {

	int lineNum;
	int passengerNum;
	int money;

	public Subway(int num) {
		this.lineNum = num;
	}

	public void take(int money) {
		this.money += money;
		passengerNum++;
	}

	public void showInfo() {
		System.out.println("�� ����ö�� " + lineNum + "ȣ���̰� " + "\n�� �°��� " + passengerNum + "�� �Դϴ�." + "\n���� ���ͱ� : " + money
				+ "�� �Դϴ�.");
	}

}// end of class
