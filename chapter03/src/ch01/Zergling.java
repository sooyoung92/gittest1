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

		// 1. 저글링이 질럿을 공격합니다.
//		public void attackZealot(Zealot zealot) {
//			String targetName = zealot.getName(); 
//			System.out.println(this.name + "이(가)" + targetName + "을 공격 합니다.");
//			zealot.beAttacked(this.power);
//		}
	//	
//		// 2. 저글링이 마린을 공격합니다.
//		public void attackMarine(Marine marine) {
//			String targetName = marine.getName(); 
//			System.out.println(this.name + "이(가)" + targetName + "을 공격 합니다.");
//			marine.beAttacked(this.power);
//		}

		// getName
		public String getName() {
			return name;
		}

		// 1. 메서드 오버로딩을 사용해 보자.
		public void attack(Zealot zealot) {
			String targetName = zealot.getName();
			System.out.println(this.name + "이(가)" + targetName + "을 공격 합니다.");
			zealot.beAttacked(this.power);
		}

		public void attack(Marine marine) {
			String targetName = marine.getName();
			System.out.println(this.name + "이(가)" + targetName + "을 공격 합니다.");
			marine.beAttacked(this.power);
		}

}

