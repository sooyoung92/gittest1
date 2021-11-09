package ch01;

public class Variable {
	// 메인 함수 (코드의 시작점)
	public static void main(String[] args) {
		// 변수를 사용하는 방법
		int age; // 변수의 선언
		int count;
		
		//초기화(값을 넣는다)
		age = 20;
		count = 100;
		
		// 변수의 선언, 초기화를 동시에
		int age2 = 70;
		int count2 = 77;
		
		//변수의 이름을 만들때 규칙.
		//1. 대소문자가 구별 되며 길이제한이 없다.
		int num = 100;
		int Num = 100; // 단, 변수명을 처음부터 대문자로 표기하지 않는다.
		// 2. 자바에서 사용하는 예약어는 사용할 수 없다.
		//int, while, for, if
//		int while;
//		int if;
		//3. 변수는 숫자로 시작할 수 없습니다.
//		int 9name;
		int name7;
		// 4. 특수 문자는 _,$만 사용 가능.
		int _age;
		int $money;
		int mo$ney;
		System.out.println("---------------------------");
		int id = 101;
		//1. int <--- 데이터 자료형
		//2. id <--- 변수
		//3. 101 <---값(리터럴)
		
		
		
		
	}// end of main

}//end of class
