package ch07;

public class MainTest2 {

	public static void main(String[] args) {
		
		Car aiCar = new AICar();
		aiCar.run();
		System.out.println("--------------------------");
		
		Car manualCar = new ManualCar();
		manualCar.run();
		
	}
	
	
	// 실행의 흐름이 정해져고 그 안의 비어있는 곳에 코드를 만들어 
	
}
