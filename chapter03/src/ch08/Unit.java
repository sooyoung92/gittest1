package ch08;

public class Unit {
	
	int power;
	int hp;
	String name;
	
	
	
	public void showInfo() {
		System.out.println("===== �� �� â =====");
		System.out.println("�̸� : " + this.name);
		System.out.println("���ݷ� : " + this.power);
		System.out.println("ü�� : " + this.hp);
		System.out.println("===============");
	}
	
	public void beAttacked(int power) {
		this.hp -= power;
		if (this.hp <= 0) {
			System.out.println(this.name + "�� ����Ͽ����ϴ�.");
		}
	}
}
