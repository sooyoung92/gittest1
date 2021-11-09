package ch03_2;

public class Warrior {

	// 멤버변수
	
		public String w1Name;
		public int w1Power;
		public int w1Life;
		public String w1Item;
		
		// 멤버함수
		
		public void warriorName() {
			System.out.println(" '" + w1Name + "' ");
		}
		
		public void warriorLife() {
			System.out.println("생명력 : " + w1Life );
		}
		
		public void damage() {
			System.out.println("공격력 : " + w1Power );
		}
		
		public void dropItem() {
			System.out.println("드랍 : " + w1Item);
		}
		
	}// end of class

	//클래스 이름은 대문자로 변수, 메서드등의 이름은 소문자로 시작하는 것이 좋다.
