package ch04;

public class SubWayMainTest {

	public static void main(String[] args) {
		
		// subway ��ü 3�� ����
		Subway subway1 = new Subway(1);
		Subway subway2 = new Subway(2);
		Subway subway3 = new Subway(3);
		
		// ���� take �޼��� ���� ��
		subway1.take(1300);
		subway2.take(1300);
		subway3.take(1300);
		
		// ahowInfo �޼��� ���� ���� �ּ���.
		subway1.showInfo();
		subway2.showInfo();
		subway3.showInfo();
	}// end of main

}
