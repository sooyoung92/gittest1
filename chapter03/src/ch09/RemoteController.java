package ch09;

public interface RemoteController {

	// ������ ���� �ƹ��͵� ���� �� �׸��� �ִ� �⺻ ���赵
	// ��� ����, �Ϲ� �޼��带 ���� �� ����, ���� �߻� �޼���� �������
	// ����� ���� �� �ִ�.
	// �߻� Ŭ�������� �߻�ȭ�� �� ����.
	// �������̽��� ǥ��, ���, ��Ģ �Դϴ�.

	// �����
	// class ��� interface ��� Ű���带 ��� �Ѵ�.
	// class �� ���� public �̳� default�� ��� �� �� �ִ�.

	// ���� ����
	// ��� ��� ������ public static final �̾�� �Ѵ�.
	public static final int SERIAL_NUMBER = 1000; // ���
	// ��� �޼�����߻� Ŭ���� �̾�� �ϰ�, public abstract Ű���带
	// ���� �� ���� �ִ�.

	public abstract void turnOn();

	void turnOff();

}
