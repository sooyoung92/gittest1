package ch01;

public class ArrayMainTest3 {

	public static void main(String[] args) {

		Book book1 = new Book(1, "흐르는강물처럼", "파울로코엘로");
		Book book2 = new Book(2, "플로텨UI실전", "김근호");
		Book book3 = new Book(3, "무궁화꽃이피었습니다", "김진명");
		Book book4 = new Book(4, "리딩으로리드하라", "이지성");
		Book book5 = new Book(5, "사피엔스", "유발하라리");

		// 문제
		// 1. 배열을 이용해서 shoppingCart 변수(배열)에 객체를 담아 봅시다.
		Book[] shoppingCart = new Book[5];

		// 2. 사고 싶은 책을 장바구니에 담아 봅시다 3개만
		shoppingCart[0] = book2;
		shoppingCart[1] = book3;
		shoppingCart[2] = book4;

		// 3. 장바구니에 담은 정보를 화면에 출력하세요.
		// Exception in thread "main" java.lang.NullPointerException: Cannot invoke
		// "ch01.Book.showInfo()" because "shoppingCart[i]" is null
		// at ch01.ArrayMainTest3.main(ArrayMainTest3.java:25) --> 발생 할 수 있는 오류.
		// 오류 수정해 주세요!!
		for (int i = 0; i < shoppingCart.length; i++) {
//			if(shoppingCart[i] == null) {
//				break;
//			}
//			shoppingCart[i].showInfo();
			if (shoppingCart[i] != null) {
				shoppingCart[i].showInfo();
			} // end of if
		} // end of for
			// 4.
		shoppingCart[0] = book5;

		// 5. 인덱스 1번째에 book3 추가해주세요.
		// 0,1 = book3, 1 --> 2, 2 --> 3, 3 -->3
		shoppingCart[0] = book2;

		shoppingCart[1] = book3;
		shoppingCart[2] = book4;
		shoppingCart[3] = book5;

		// 삭제 -> 배열에 담겨 있는 값을 제거 하려면
		// 3번쨰 인덱스를 지워 보세요.
		shoppingCart[3] = null;

		// 베열에 추가를 하려면 직접 인덱스 연산을 해서 처리 해야한다.
		for (int i = 0; i < shoppingCart.length; i++) {
			if (shoppingCart[i] != null) {
				shoppingCart[i].showInfo();
			}
		}

	}// end of main

}// end of class