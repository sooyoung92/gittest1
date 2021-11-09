package ch10;

public class GatewayMainTest {

	public static void main(String[] args) {

		Gateway gateWay1 = new Gateway(1);
		Gateway gateWay2 = new Gateway(1);
		Gateway gateWay3 = new Gateway(1);
		Zealot zealot1 = gateWay1.createZealot();
		Zealot zealot2 = gateWay1.createZealot();
		Zealot zealot3 = gateWay1.createZealot();
		Zealot zealot4 = gateWay1.createZealot();
		Zealot zealot5 = gateWay1.createZealot();
		Zealot zealot6 = gateWay1.createZealot();
		Zealot zealot7 = gateWay1.createZealot();
		Zealot zealot8 = gateWay1.createZealot();
		Zealot zealot9 = gateWay1.createZealot();

		gateWay2.createZealot();
		gateWay2.createZealot();
		gateWay2.createZealot();

		gateWay3.createZealot();
		gateWay3.createZealot();
		gateWay3.createZealot();

		zealot1.showInfo();
		System.out.println(Gateway.zealotCount);

		// static 변수는 인스턴스들이 공유할 수 있는 변수이다.
		// --> 객체를 생성하지 않고도 클래스 이름을 접근이 가능하다.
		// ex) 태양(객체가 생성되기전에 메모리에 올라가 있다.)

		System.out.println("현재 생성된 질럿 수" + Gateway.zealotCount);

	}// end of main

}
