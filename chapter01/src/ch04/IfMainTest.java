package ch04;

public class IfMainTest {
	// 메인함수 (코드의시작)
	public static void main(String[] args) {
		
		// 제어문 if
		// 주어진 조건에 따라서 실행이 이루어 지도록 구현한다.
		// 만약 ... 이라면
		
		boolean flag = false;
		
		// if 문 단독 사용 방법
		
//		if (조건식) {
//			수행문;
//	    }
		
		if (flag) {
			System.out.println("조건식 결과가 true이면 실행 된다.");
		}// end of if
		
		// if else 문
		
//		if (조건식) {
//			수행문;
//		} else {
//			수행문;
//		}
		
		if (flag) {
			System.out.println("true 이면 실행");
		} else {
			System.out.println("false 이면 실행");;
		}
		
		// if else if else 문
		
//		if (조건식1) {
//			수행문1;
//		} else if (조건식2) {
//			수행문2;
//		} else if (조건식3) {
//			수행문3;
//		} else {
//			수행문4;
//		} 
//		수행문5;    <--- if else if else 문이 끝나면 수행됨
		
		int point = 40;
		
		if (point >= 90) { 
			System.out.println("A학점 입니다.");
		} else if (point >= 80) {
			System.out.println("B학점 입니다.");
		} else if (point >= 70) {
			System.out.println("C학점 입니다.");
		} else if (point >= 60) {
			System.out.println("D학점 입니다.");
		} else {
			System.out.println("F학점 입니다.");
		}

	}// end of main

}// end of class
