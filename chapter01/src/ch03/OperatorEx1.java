package ch03;

public class OperatorEx1 {
	// 메인함수 (코드의 시작점)
	public static void main(String[] args) {
		
		int i = 10;
		double d = 20.5;
		
		// 1. 두 수를 덧셈 연산하여 result1 변수에 담고 결과값 30.5를 출력하시오.
		double result1 = i + d;
		System.out.println(result1);
		
		// 2. result1 변수를 정수형으로 강제 형 변환해서 출력하세요.
		System.out.println((int)result1);
		
		// 3. i 변수의 값을 -1 을 뺀 후 출력하세요. 단, 단항 연산자 사용
		i--;
		System.out.println(i);
//		System.out.println(--i);
		
		// 4. d 변수에 값을 -20.5로 출력하세요.
		System.out.println(-d); // d의 값은 변하지 않는다. 그러나 d = -d; 일경우 d의 값은 변한다.
		
		// 5. 변수 i 와 d, 관게 연산자를 사용해서 result2 변수를 선언하고 
		// 변수에 true 값이 담기도록 식을 만들고 출력하세요.
		boolean result2 = (i < d); 
		System.out.println(result2);
		
		int num1 = 10;
		int num2 = 20;
		// 6. 변수 result3 을 선언하고, num1 과 num2 변수가 숫자 50보다 큰지 
		// 논리 연산자를 사용해서 결과를 담고 출력하세요.
		boolean result3 = (num1 >50) && (num2 >50);
		System.out.println(result3);
		
		// 7. num1 과 num2 값 중 큰 수를 삼항 연산자를 사용해서
		// max 변수에 값을 담고 출력해주세요. 단, 선언과 초기화를 동시에 해주세요.
		int  max = (num1 > num2) ? num1 : num2;
		System.out.println(max);
		
	}// end of main

}// end of class
