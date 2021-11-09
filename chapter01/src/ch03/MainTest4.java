package ch03;

public class MainTest4 {
	//메인함수 (코드의시작점)
	public static void main(String[] args) {
		
		// 관계 연산자
		// 관찰에 결과가 참, 거짓인지 판별할 때 사용한다.
		// 결과값은 오직 true, false 이다.
		
		int num1 = 7;
		int num2 = 3;
		
		boolean relational = (num1 < num2);
		System.out.println(relational);
		
		boolean relational2 = (num1 > num2);
		System.out.println(relational2);
		
		boolean relational3 = (num1 == num2);
		System.out.println(relational3);
		
		boolean relational4 = (num1 != num2);
		System.out.println(relational4);
		// 관계연산자가 있을 경우 해석은 그것이 참인가 거짓인가로 해석해보자.
		
	}// end of main

}// end of class
