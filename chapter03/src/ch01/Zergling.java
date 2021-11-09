package ch01;

public class Zergling {

	

		private int hp;
		private int power;
		private String name;

		public Zergling(String name) {
			this.name = name;
			this.hp = 100;
			this.power = 5;
		}

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

		// 1. ���۸��� ������ �����մϴ�.
//		public void attackZealot(Zealot zealot) {
//			String targetName = zealot.getName(); 
//			System.out.println(this.name + "��(��)" + targetName + "�� ���� �մϴ�.");
//			zealot.beAttacked(this.power);
//		}
	//	
//		// 2. ���۸��� ������ �����մϴ�.
//		public void attackMarine(Marine marine) {
//			String targetName = marine.getName(); 
//			System.out.println(this.name + "��(��)" + targetName + "�� ���� �մϴ�.");
//			marine.beAttacked(this.power);
//		}

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

		public void attack(Marine marine) {
			String targetName = marine.getName();
			System.out.println(this.name + "��(��)" + targetName + "�� ���� �մϴ�.");
			marine.beAttacked(this.power);
		}

}

