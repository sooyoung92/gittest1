package ch04;

public class Subway {

	// 호선 번호
	// 승객수
	// 수익금
	int lineNum;
	int passengerNum;
	int money;
	
	// 생성자 - 호선번호를 받는 생성자.
	public Subway(int num) {
		this.lineNum = num;
	}
	
		
	// 메서드 take, showInfo
	public void take(int money) {
		this.money += money;
		passengerNum++;
	}
	
	public void showInfo() {
		System.out.println(
				"이 지하철은 " + lineNum + "호선이고 "
				+ "\n총 승객은 " + passengerNum + "명 입니다."
				+ "\n현재 수익금 : " + money + "원 입니다."
				);
	}
	
}// end of class
