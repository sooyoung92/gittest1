package ch03;

public class MainTest5 {
	//메인 함수 (코드의 시작점)
	public static void main(String[] args) {
		
		// 논리 연산자 ( &&, || ) 엠퍼센트, 버티컬바
		// 관계 연산자와 혼합하여 많이 사용 됨
		// 연산에 결과는 true, false
		
		int num1 = 10;
		int num2 = 20;
		
		// 1. 논리 곱 (&&)
		
		boolean flag1 = (num1 > 0) && (num2 > 0);
		boolean flag2 = (num1 > 0) && (num2 < 0);
		System.out.println(flag1);
		System.out.println(flag2);
		// 둘 다 true(참)일때, true를 반환.
		
		// 2. 논리 합 (||)
		
		boolean flag3 = (num1 > 0) || (num2 < 0);
		boolean flag4 = (num1 < 0) || (num2 >0);
		System.out.println(flag3);
		System.out.println(flag4);
		// 둘 중 하나라도 true 이면, 연산에 결과는 true로 반환.
		
		System.out.println("----------------------------");
		
		// num1 = 10, num2 = 20
		boolean flag5 = (num1 < 0) && (num2 > 0);
		// 앞의 num1<0 이 false 이므로 뒤는 연산하지 않고 결과값을 false로 반환.
		boolean flag6 = (num1 > 0) || (num2 > 0);
		// 앞의 num1>0 가 true 이므로 뒤는 연산하지 않고 결과값을 true로 반환.
	
		boolean flag7 = !(num1 >0);
		System.out.println(flag7);
		
	}// end of main

}// end of class
