package ch06;

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		
		hAnimal.move();
		System.out.println("----------------");
		tAnimal.move(); 
		
		// 컴파일 시점 -- 문법의 오류가 있는지 확인하는 시점
		// 런타임 시점 -- 동작들을 작동한다.
	}

}
