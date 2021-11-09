package ch03;

public class Car {
	
	String name;
	int price;
	// 포함 관계로 만들어줘야 한다. has a . 차와 엔진은 구조상 상속 관계로 만들면 안된다.
	Engine engine;
	
	
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
		engine = new Engine("GDI", 500);
	}
	
	public void showInfo() {
		System.out.println("name : " + name);
		System.out.println("price : " + price);
	}
	
	
	
}

// 포함 관계로 만들어줘야 한다.