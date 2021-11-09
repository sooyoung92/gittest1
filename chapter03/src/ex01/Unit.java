package ex01;

// new Ű���带 ����ؼ� �޸𸮿� �ø� �� ����. Ÿ������ �� ����Ѵ�.
public abstract class Unit {

	protected int power;
	protected int hp;
	protected String name;

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

	public String getName() {
		return this.name;
	}

	// 1. �޼��� �����ε��� ����� ����.
	public void attack(Unit unit) {
		String targetName = unit.getName();
		System.out.println(this.name + "��(��) " + targetName + "�� ���� �մϴ�.");
		unit.beAttacked(this.power);
	}

}
