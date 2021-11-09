package ex01;

import java.util.Scanner;

public class MainTest1 {
	
	// 메인함수
	public static void main(String[] args) {
		
		Zealot zealot1 = new Zealot("질럿");
		Marine marine1 = new Marine("마린");
		Zergling zergling1 = new Zergling("저글링");
		
		zealot1.showInfo();
		marine1.showInfo();
		zergling1.showInfo();
		
		zealot1.attack(zergling1);
		zealot1.attack(marine1);
		
		marine1.showInfo();
		zergling1.showInfo();
		
		// 스캐너를 사용해서 실행에 흐름을 만들어 보세요.
		// 1. 질럿이 마린을 공격한다.
		// 2. 마린이 저글링을 공격한다.
		// 3. 저글링이 질럿을 공격한다.
		System.out.println(" 1 ~ 3 중에서 숫자 하나를 적으시오.");
		int unitAttack;
		Scanner sc1 = new Scanner(System.in);
		unitAttack = sc1.nextInt();
		
		if( unitAttack == 1) {
			zealot1.attack(marine1);
		} else if( unitAttack == 2){
			marine1.attack(zergling1);
		} else {
			zergling1.attack(zealot1);
		}
		
//		// 다른 사람이 작성한 코드
//		Scanner sc = new Scanner(System.in);
//		boolean gameOver = false;
//		int userInput=0;
//		final int ZEALOT_ACTION = 1;
//		// (! false) --> true
//		while(!(gameOver)) {
//			System.out.println("1. 질럿이 마린을 공격");
//			System.out.println("2. 마린이 저글링을 공격");
//			System.out.println("3. 저글링이 질럿을 공격");
//			System.out.println("4. 유닛 상태 보기");
//			System.out.println("5. 종료");
//			System.out.print("입력 : ");
//			userInput = sc.nextInt();
//			
//			if(userInput == ZEALOT_ACTION) {
//				zealot1.attack(marine1);
//			}
//			else if(userInput ==2) {
//				marine1.attack(zergling1);
//			}
//			else if(userInput ==3) {
//				zergling1.attack(zealot1);
//			}
//			else if(userInput==4){
//				zealot1.showInfo();
//				marine1.showInfo();
//				zergling1.showInfo();
//			}
//			else if(userInput ==5) {
//				System.out.println("게임을 종료합니다.");
//				gameOver = true;
//			}
//			else {
//				System.out.println("잘못입력하셨습니다. 다시입력하세요.");
//			}
//		}

		
		
		
		
	} // end of main

}// end of class
