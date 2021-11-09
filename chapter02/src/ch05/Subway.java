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
		System.out.println("이 지하철은 " + lineNum + "호선이고 " + "\n총 승객은 " + passengerNum + "명 입니다." + "\n현재 수익금 : " + money
				+ "원 입니다.");
	}

}// end of class
