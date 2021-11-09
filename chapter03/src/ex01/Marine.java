package ex01;

public class Marine extends Unit {

	public Marine(String name) {
		this.name = name;
		this.power = 5; // <-- 초기값 설정가능.
		this.hp = 100;
	}
}
