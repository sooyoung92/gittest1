package ch10;

public class HatcheryMainTest {

	public static void main(String[] args) {

		System.out.println(Hatchery.zerglingCount);
		Hatchery hatchery = new Hatchery("��ó��");
		hatchery.createZergling();
		hatchery.createZergling();
		hatchery.createZergling();
		hatchery.createZergling();
		System.out.println(Hatchery.zerglingCount);

	}

}
