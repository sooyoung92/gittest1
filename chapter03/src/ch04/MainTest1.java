package ch04;

public class MainTest1 {

	public static void main(String[] args) {

		Warrior warrior1 = new Warrior("����", 100);
		Archer archer1 = new Archer("�ü�", 100);
		Wizard wizard1 = new Wizard("������", 50);

		String name = warrior1.name; // hero
		int hp = warrior1.hp; // hero
		warrior1.attack(); // hero

		warrior1.comboAttack(); // warrior

	}

}
