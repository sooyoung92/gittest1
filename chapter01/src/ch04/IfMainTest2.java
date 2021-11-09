package ch04;

import java.util.Scanner;

public class IfMainTest2 {
	// 메인함수 (코드의 시작점)
	public static void main(String[] args) {
		
		// 문제 1. if 문을 사용해서 학점을 출력해주세요.
		// 100 ~ 90 --> A
		// 90 ~ 80 --> B
		// 80 ~ 70 --> C
		// 70 ~ 60 --> D
		// 60 ~ 0 --> F
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("성적을 입력해 주세요.");
		int point = scanner.nextInt();
		char result = 'k';
		
		if (point <= 100 && point >= 90) {
			result = 'A';
		} else if (point < 90 && point >= 80) {
			result = 'B';
		} else if (point < 80 && point >= 70) {
			result = 'C';
		} else if (point < 70 && point >= 60) {
			result = 'D';
		} else if (point < 60 && point >= 0) {
			result = 'F';
		}
		if (result != 'k') {
			System.out.println(result + " 학점 입니다.");
		}else {
			System.out.println("성적을 잘못 입력 하셧습니다. 다시 입력하십시오.");
		}
		
	}// end of main

}// end of class
