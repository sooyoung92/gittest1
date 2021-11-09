package ch08;

public class Unit {
	
	int power;
	int hp;
	String name;
	
	
	
	public void showInfo() {
		System.out.println("===== 정 보 창 =====");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("체력 : " + this.hp);
		System.out.println("===============");
	}
	
	public void beAttacked(int power) {
		this.hp -= power;
		if (this.hp <= 0) {
			System.out.println(this.name + "은 사망하였습니다.");
		}
	}
}
