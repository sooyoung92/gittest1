package ch05;

public class ForMainTest2 {
	// 메인함수 (코드의 시작점)
	public static void main(String[] args) {
		
		// 구구단 2단을 먼저 출력해주세요.
		int num = 2;
		System.out.println(num + " * 1 = "+ (num * 1));
		System.out.println(num + " * 2 = "+ (num * 2));
		System.out.println(num + " * 3 = "+ (num * 3));
		System.out.println(num + " * 4 = "+ (num * 4));
		System.out.println(num + " * 5 = "+ (num * 5));
		System.out.println(num + " * 6 = "+ (num * 6));
		System.out.println(num + " * 7 = "+ (num * 7));
		System.out.println(num + " * 8 = "+ (num * 8));
		System.out.println(num + " * 9 = "+ (num * 9));
		
		System.out.println("------------------------------");
		// 구구단 3단을 먼저 출력해주세요.
		num = 3;
		System.out.println(num + " * 1 = "+ (num * 1));
		System.out.println(num + " * 2 = "+ (num * 2));
		System.out.println(num + " * 3 = "+ (num * 3));
		System.out.println(num + " * 4 = "+ (num * 4));
		System.out.println(num + " * 5 = "+ (num * 5));
		System.out.println(num + " * 6 = "+ (num * 6));
		System.out.println(num + " * 7 = "+ (num * 7));
		System.out.println(num + " * 8 = "+ (num * 8));
		System.out.println(num + " * 9 = "+ (num * 9));
		
		System.out.println("------------------------------");
		
		// 반복적인 패턴이 보일때는 for문을 생각해보자.
		num = 4; 
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + "= " + (num * i));
		}
		System.out.println("------------------------------");
		
		// 5단부터 9단까지 출력해보자.
		num = 5; 
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + "= " + (num * i));
		}
		System.out.println("------------------------------");
		num = 6; 
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + "= " + (num * i));
		}
		System.out.println("------------------------------");
		num =7; 
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + "= " + (num * i));
		}
		System.out.println("------------------------------");
		num = 8; 
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + "= " + (num * i));
		}
		System.out.println("------------------------------");
		num = 9; 
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + "= " + (num * i));
		}
		System.out.println("------------------------------");
		
		
	}// end of main

}// end of class
