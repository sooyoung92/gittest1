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

		// static ������ �ν��Ͻ����� ������ �� �ִ� �����̴�.
		// --> ��ü�� �������� �ʰ� Ŭ���� �̸��� ������ �����ϴ�.
		// ex) �¾�(��ü�� �����Ǳ����� �޸𸮿� �ö� �ִ�.)

		System.out.println("���� ������ ���� ��" + Gateway.zealotCount);

	}// end of main

}
