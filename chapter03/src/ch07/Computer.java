package ch07;

public abstract class Computer {

	// 추상 메서드
	public abstract void display();

	public abstract void typing();

	public void turnOn() {
		System.out.println("전원을 겹니다.");
	}

	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
	// 구현부("{}")가 없는 것이 추상 메서드
	// 단 하나의 추상메서드를 가진다고 해도 그 클래스는 추상 클래스이다.
	// 
}
