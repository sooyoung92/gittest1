package ch01;

public class CharacterTest {
	// 메인함수 ( 코드의 시작점 )
	public static void main(String[] args) {
		
		char ch1 = 'A'; // 정수값 65 저장.
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 66;
		System.out.println(ch2);
		System.out.println((int)ch2);
		
		// 주의!!!   음수는 대입 불가.
		
		//문제 
		// 1. 안, 녕, 하, 세, 요 ----> 각각 정수값 얼마 인가요?
		
		System.out.println((int)'안');
		System.out.println((int)'녕');
		System.out.println((int)'하');
		System.out.println((int)'셋');
		System.out.println((int)'요');
		
		
	}// end of main

}// end of class
