package ch01;

public class Marine {

	private int power;
	private int hp;
	private String name;

	public Marine(String name) {
		this.name = name;
		this.power = 5; // <-- �ʱⰪ ��������.
		this.hp = 100;
	}

	public void showInfo() {
		System.out.println("===== �� �� â =====");
		System.out.println("�̸� : " + this.name);
		System.out.println("���ݷ� : " + this.power);
		System.out.println("ü�� : " + this.hp);
		System.out.println("===============");
	}

	// ���� ���մϴ�.
	public void beAttacked(int power) {
		this.hp -= power;
		if (this.hp <= 0) {
			System.out.println(this.name + "�� ����Ͽ����ϴ�.");
		}
	}

	// 1. ������ ������ �����մϴ�.
//	public void attackZealot(Zealot zealot) {
//		String targetName = zealot.getName(); 
//		System.out.println(this.name + "��(��)" + targetName + "�� ���� �մϴ�.");
//		zealot.beAttacked(this.power);
//	}
//	
//	// 2. ������ ���۸��� �����մϴ�.
//	public void attackZergling(Zergling zergling) {
//		String targetName = zergling.getName(); 
//		System.out.println(this.name + "��(��)" + targetName + "�� ���� �մϴ�.");
//		zergling.beAttacked(this.power);
//	}
//	
	// getName

	public String getName() {
		return name;
	}

	// 1. �޼��� �����ε��� ����� ����.
	public void attack(Zealot zealot) {
		String targetName = zealot.getName();
		System.out.println(this.name + "��(��)" + targetName + "�� ���� �մϴ�.");
		zealot.beAttacked(this.power);
	}

	public void attack(Zergling zergling) {
		String targetName = zergling.getName();
		System.out.println(this.name + "��(��)" + targetName + "�� ���� �մϴ�.");
		zergling.beAttacked(this.power);
	}
}
