package ch12;

public class MainTest1 {

	public static void main(String[] args) {

		Book book1 = new Book(1, "데미안", "헤르만 헤세");
		Book book2 = new Book(1, "데미안", "헤르만 헤세");

		System.out.println(book1 == book2);

		boolean result = "a".equals("a"); // 문자열이 같은지 비교할 때 사용하는 메서드 .equals();
		System.out.println(result);
		System.out.println("a" == "a");
		System.out.println("----------------------");

		// equal 메서드를 재정의 했다. (book 클래스 안에서)
		if (book1.equals(book2)) {
			System.out.println("같은 책입니다.");
		} else {
			System.out.println("다른 책입니다.");
		}

	}

}
