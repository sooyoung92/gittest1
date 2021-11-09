package ch05;
	
public class WhileMainTest3 {
	// 메인함수 (코드의 시작점)
	public static void main(String[] args) {
		
		//do ~ while
//		do {
//			수행문1;
//			...
//		} while(조건식);
//			수행문2;
//			...
		
		int input = 10;
		int sum = 0;
		
		do {
			System.out.println("현재 값 : " + input);
			sum += input;
			input--; // 무한 반복을 막기위해.
		} while(input !=0);
		System.out.println("연산에 결과는 : " + sum +"입니다.");

	}// end of main

}// end of class
