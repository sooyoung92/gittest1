package Ex1;

public class MainTest1 {

	public static void main(String[] args) {
		
		// ���α׷� ���� �帧�� ��������.
		Warrior warrior1 = new Warrior(250, 100,  "���� ���� ");
		Wizard wizard1 = new Wizard(150, 100, "���� ������ ");
		
		
	
		wizard1.takeDamage(100);
		warrior1.takeDamge(100);
		wizard1.takeDamage(100);
		warrior1.takeDamge(100);
		wizard1.wizzardInfo();
		warrior1.warriorInfo();
		

	}

}
