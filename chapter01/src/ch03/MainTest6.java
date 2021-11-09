package ch03;

import java.util.Scanner;

public class MainTest6 {
	// 메인함수 (코드의 시작점)
	public static void main(String[] args) {
		
		//삼항 연산자
		// 조건식 ? 결과1 : 결과2;
		
		int num1 = (5 > 3) ? 10 : 20;
		System.out.println(num1);
		int num2 = (5 < 3) ? 10 : 20;
		System.out.println(num2);
		
		// JDK 가 만들어준 도구를 이용해 보자.
		int max;
		System.out.println("입력 받은 두 수 중에서 큰 수를 출력하세요.");
		Scanner scanner = new Scanner(System.in);  // Ctrl + Shift + o
		
		System.out.println("첫번째 수 : ");
		int x = scanner.nextInt();
		System.out.println("두번째 수 : ");
		int y = scanner.nextInt();
		
		max = (x > y) ? x : y;
		System.out.println("두 수 중에서 큰 수는 " + max + "입니다.");
		
	}// end of main

}// end of class
