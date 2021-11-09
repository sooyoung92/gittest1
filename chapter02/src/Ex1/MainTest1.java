package Ex1;

public class MainTest1 {

	public static void main(String[] args) {
		
		// 프로그램 실행 흐름을 만들어보세요.
		Warrior warrior1 = new Warrior(250, 100,  "강한 전사 ");
		Wizard wizard1 = new Wizard(150, 100, "약한 마법사 ");
		
		
	
		wizard1.takeDamage(100);
		warrior1.takeDamge(100);
		wizard1.takeDamage(100);
		warrior1.takeDamge(100);
		wizard1.wizzardInfo();
		warrior1.warriorInfo();
		

	}

}
