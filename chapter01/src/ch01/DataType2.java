package ch01;

public class DataType2 {
	//메인 함수 ( 코드의 시작점 )
	public static void main(String[] args) {
		
		//기본 자료형 - 문자 자료형
		
		char name; // 변수의 선언. 
		char initial;
		char letter;
		
		//초기화 한다 --> 값을 넣는다.
		name = 'A'; // 홑 따옴표를 사용하고 단 하나의 글자만 변수에 저장할 수 있다.
		//name = 'AB';  <--오류
		letter = 'C';
		initial = 'B';
		//문제 1 2 3 . 화면에 변수 name, initial, letter 를 출력 해주세요.
		System.out.println(name);
		System.out.println(initial);
		System.out.println(letter);
		
		System.out.println("=========================================");
		// 원하는 글자를 출력 할수 있으나 한번 사용하면 끝인 명령
		System.out.println('a');
		System.out.println('b');
		System.out.println('c');
		
		
	}// end of main

}// end of class
