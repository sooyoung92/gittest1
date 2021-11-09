package ch03;

public class ShortCircuitTest {
	// 메인함수 (코드의 시작점)
	public static void main(String[] args) {
		
		int num1 = 5;
		int i = 0;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i +2 ) < 10);
		System.out.println(value); 
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1 + 10) > 10) || ((i = i +2 ) > 10); 
		// 위에서 이미 boolean타입으로 선언했으니 boolean을 써서 다시 선언하면 안된다.
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		// 결론, 논리곱(&&)에서 앞의 식이 이미 false이므로 뒤의 식은 연산하지 않고 결과값을 false로 반환.
		// 논리합(||)에서 뒤의 식이 false라도 앞의 식에서 true이므로 뒤의 식은 연산하지 않고 결과값을 true로 반환.
		// 이런 것을 Shortcircuit 이라고 한다.
		
	}// end of main

}// end of class
