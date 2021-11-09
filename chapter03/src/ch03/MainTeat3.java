package ch03;

public class MainTeat3 {

	public static void main(String[] args) {
		// 자동차를 생성해서 showInfo 호출해 주세요.
		
		Car car1 = new Car("자동차",1000);
		car1.showInfo();
		
		
		// 엔진에 정보를 출력해 주세요.
		
		car1.engine.showInfo();

	}

}
