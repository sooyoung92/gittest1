package ch03;

public class Plastic extends Material{

	
	
	@Override
	public String toString() {
		return "재료는 plastic 입니다";
	}

	@Override
	public void doPrinting() {
		System.out.println("플라스틱 재료로 출력 합니다.");
	}

}
