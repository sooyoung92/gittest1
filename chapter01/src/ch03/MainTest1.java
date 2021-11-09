package ch03;

public class MainTest1 {
	//메인함수 (코드의시작점)
	public static void main(String[] args) {
		
		// 대입 연산자 (=)
		int number = 11;
		// = (수학기호와 달리 변수나 값을 대입하는 연산자이다.)
		//연산에 방향은 오른쪽에서 왼쪽으로 연산된다
		
		int number2 = number;
		// 변수에 변수를 대입할 수도 있다.
		
		System.out.println(number);
		System.out.println(number2);
		
		// 부호 연산자 (+,-)
		// 부호를 변경하는 연산자
		// 단 변수에 들어 잇는 실제 값을 변경한 상태는 아니다.
		System.out.println(-number); // 화면에 출력할 때 부호를 바꿔서 출력만 해줄뿐이다.
		System.out.println("number에 현재 값 : " + number);
		
		number = -number; // 변수 실제값의 부호를 바꿀 때.
		System.out.println(number);
		// 변수에 실제 값을 변경하려면 대입 연산자를 함께 사용해야 한다.
		
	}// end of main

}// end of class
