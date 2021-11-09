package ch03_2;

public class WarriorMainTest {

	public static void main(String[] args) {

		Warrior warrior1 = new Warrior();
		
		warrior1.w1Name = "µð¾Æºí·Î";
		warrior1.w1Power = 666;
		warrior1.w1Life = 666;
		warrior1.w1Item = "Å»°©";
		
		warrior1.warriorName();
		warrior1.warriorLife();
		warrior1.damage();
		warrior1.dropItem();
	}

}
