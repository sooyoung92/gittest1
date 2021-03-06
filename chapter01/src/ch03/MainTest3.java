package ch03;

public class MainTest3 {
	//메인함수 (코드의 시작점)
	public static void main(String[] args) {
		
		// 증감, 감소 연산자
		// ++, --
		int num1 = 1;
		num1++;
		System.out.println(num1);
		
		int num2 = 1;
		num2--;
		System.out.println(num2);
		
		// 1. 증간 연산자가 뒤에 올 경우
		int num3 = 10;
		int num4;
		
		num4 = num3++;
		System.out.println(num4);
		System.out.println(num3);
		// 먼저 변수 num4에 num3을대입하고 그다음 num3의 변수에 가서 +1 해준다.
//		num4 = ++num3;
//		System.out.println(num4);
		// 먼저 변수 num3에 접근 후 +1 해주고 num4에 대입해준다.
		
		int num5 = 100;
		int num6;
		
		// 1. num5를 num6 변수에 담아주세요.
		// 단, 증감 연산자를 사용해서 num6 변수를 101로 만들어서 출력해주세요.
		num6 = ++num5;
		System.out.println(num6);
		// 2. num5를 num6 변수에 담아주세요.
		// 단, 증감 연산자를 사용해서 num6 변수를 101로 만들어서 출력해주세요.
		num6 = num5++;
		System.out.println(num6);
		
		// 결록 : 증감 연산자는 변수(공간)에 있는 값을 1 증가 시킨다.
		//단 앞에 있을 때와 뒤에 있을 때 연산에 순서가 다르다.
		
	}// end of main

}// end of class
