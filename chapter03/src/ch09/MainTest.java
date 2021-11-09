package ch09;

public class MainTest {

	public static void main(String[] args) {

		Televison televison = new Televison();
		Refrigerator refrigerator = new Refrigerator();
		ToyRobot toyRobot = new ToyRobot();
		televison.turnOn();
		televison.turnOff();
		System.out.println("--------------");
		refrigerator.turnOn();
		refrigerator.turnOff();
		System.out.println("--------------");
		// ������ - �� (��ü, ����, ����)

		RemoteController[] remote = new RemoteController[3];
		remote[0] = televison;
		remote[1] = refrigerator;
		remote[2] = toyRobot;
		// Ȯ�� for�� turnOn() ȣ��
		for (RemoteController remoteController : remote) {
			remoteController.turnOn();
		}
		System.out.println("--------------");
		for (RemoteController remoteController : remote) {
			remoteController.turnOff();
		}
		System.out.println("--------------");

		// instanceOf ������ ����غ���
		for (int i = 0; i < remote.length; i++) {
			if (remote[i] instanceof ToyRobot) {
				System.out.println("�峭�� ��ü �Դϴ�.");
				// ���� ����
				// remote[i] <-- �����ؼ� name ���
				// ȭ�鿡 name ��� ������ ����� �ּ���. �ٿ�ĳ����
				String name = ((ToyRobot) remote[i]).name;
				System.out.println(name);
			}

			// if Tv
			if (remote[i] instanceof Televison) {
				System.out.println("�ڷ����� ��ü �Դϴ�.");
			}

			// if Re
			if (remote[i] instanceof Refrigerator) {
				System.out.println("����� ��ü �Դϴ�.");
			}

		}
		
		// �������̽� ����
		// ǥ��ȭ ���� 
		// ���� ������� Ŭ�����鿡�� ���踦 �ξ� �� �� �ִ�.
		// Ŭ���� ���� ���յ��� ���缭 ������ �ڵ带 ������ �� �ִ�.
		
		// ����
		// ��ü���� �з����� �ٽ�
		// ��ü�� ��ü���� ��ȣ �����ؼ�  �ڵ带 ������ ������(����, ����, )
		// ��ü�� ��ü���� ���踦 �����Ͽ� �ڵ带 ������ ������.
		// (���, ���԰���, �߻�Ŭ����, �������̽�) 
		// ������!!(Ŭ������ �پ��� ���·�)
		
		
	}// end of main

}
