package ch09;
	
// �������̽��� �����ϴ� ���
public class Refrigerator extends HomeAppliances implements RemoteController, SoundEffect {
	// �ϳ��� Ŭ������ ��� ������ �ִ�.
	
	@Override
	public void turnOn() {
		System.out.println("����� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("����� ���ϴ�.");
	}

	@Override
	public void notification() {
		System.out.println("�츮���� ~~");
		
	}
	
}
