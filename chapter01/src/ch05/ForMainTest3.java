package ch05;

public class ForMainTest3 {
	// 메인함수 (코드의 시작점)
	public static void main(String[] args) {
		
		// 1 부터 9 까지 반복
		
//		for (int i = 1; i <10; i++) {
//			
//			for(int j = 1; j <10; j++) {
//				
//			}
//		}
		// 이중 for 문으로 구구단 2 ~ 9 까지 출력해 주세요.
		int num = 0;
		for (num = 2; num < 10; num++) {
			// 2 ~ 9 까지 반복한다.
			for (int i = 1; i < 10; i++) {
				System.out.println(num + " * " + i + " = "+ (num * i));
			}
			System.out.println();
		}

	}// end of main

}// end of class
