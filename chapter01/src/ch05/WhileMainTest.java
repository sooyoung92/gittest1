package ch05;

public class WhileMainTest {
	// 메인함수 (코드의 시작점)
	public static void main(String[] args) {
		
//		while(조건식) {
//			수행문1;
//			...
//		}   
//			수행문2;
//			...
//		---> 조건식이 참인 동안 {} 안의 수행문을 반복 수행.
		
		// 1 ~ 10 까지 덧셈 연산
		
		int num = 1;
		int sum = 0;
		while(num < 11) {
			System.out.println("현재 값 : " + num);
			sum += num;
			num ++;					
		} // end of while
		System.out.println("결괏값 : "+ sum);
		
		
		// Thead 를 추가 한 코드.
		
//		int num = 1;
//		int sum = 0;
//		while(num < 11) {
//			System.out.println("현재 값 : " + num);
//			sum += num;
//			num ++;		
//			
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		} // end of while
//		System.out.println("결괏값 : "+ sum);
		
	}// end of main

}// end of class
