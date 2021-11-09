package ch05;

import java.util.Scanner;

public class WhileMainTest2 {
	// 메인함수 (코드의 시작점)
	public static void main(String[] args) {
		
//		final int LIMIT_VALUE = 1000;
		
		//상수에 담는 값을 스캐너를 사용해서 코드를 수정해주세요.
		Scanner scanner = new Scanner(System.in);
		System.out.println("덧셈 값을 입력해주세요.");
		final int LIMIT_VALUE = scanner.nextInt();
		
		int num = 1;
		int sum = 0;
		while(num <= LIMIT_VALUE) {
			sum += num;
			num ++;					
		} // end of while
		System.out.println("결괏값 : "+ sum);
		
	}// end of main

}// end of class
