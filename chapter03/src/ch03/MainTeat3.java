package ch03;

public class MainTeat3 {

	public static void main(String[] args) {
		// �ڵ����� �����ؼ� showInfo ȣ���� �ּ���.
		
		Car car1 = new Car("�ڵ���",1000);
		car1.showInfo();
		
		
		// ������ ������ ����� �ּ���.
		
		car1.engine.showInfo();

	}

}
