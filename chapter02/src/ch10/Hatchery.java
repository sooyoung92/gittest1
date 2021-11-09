package ch10;

public class Hatchery {
	// static ���� ���
	// ������� ����
	public static int zerglingCount = 1;
	private int hatcheryId;
	private String name;

	// ������ ����
	public Hatchery(String name) {
		this.name = name;
	}

	// ���۸��� �����ϴ� �޼��� ����� �ּ���.
	public Zergling createZergling() {
		System.out.println("���۸��� �����մϴ�.");
		zerglingCount++;
		return new Zergling("���۸�" + zerglingCount);
	}
}
