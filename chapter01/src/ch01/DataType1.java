package ch01;

public class DataType1 {
	//메인 함수 ( 코드의 시작점)
	public static void main(String[] args) {
		
		// 데이터 타입 종류
		// 1. 기본 자료형 (primitive data type)
		// 2. 참조 타입 (Reference Type)
		// 기본 자료형 
		// 정수형 실수형 문자형 논리형(4가지 존재)
		// 정수형 ( 1, 20, 100 등과 같은 숫자)
		byte  b; // 1바이트 (8비트)
		short  s; // 2바이트 (16비트)
		int i; // 4바이트 (32비트)
		long l; //8바이트 (64비트)
		// byte의 숫의 표현 범위
		b = 127;
		b = -128;
		//int의 수의 표현 범위
		i = 2100000000;
		i = -2100000000;
		// 접미사 (대문자 L 또는 소문자 l 을 활용하여 표현할 수 있다.)
		l = 2200000000L;
		
	}// end of main

}// end of class
