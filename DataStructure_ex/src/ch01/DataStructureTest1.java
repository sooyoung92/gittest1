package ch01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Student {
	String name;
	int grade;
}

public class DataStructureTest1 {

	public static void main(String[] args) {

		List list0;

		// 순서가 있고(인덱스) 중복이 가능하다.
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Student> members = new ArrayList<Student>();
		ArrayList<Integer> num = new ArrayList<>();

		// 선언과 동시에 초기화
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));

		// 값 추가 방법
		list.add(3); // index 0
		list.add(null); // index 1
		list.add(1, 10); // index 1번째에 10을 삽입 (null은 인덱스 2번으로 밀려 난다.)

		System.out.println("값 확인 : " + list); // toString 메서드가 재정의 되어서 주소값대신 값이 바로 출력.

		// 값 삭제 방법
		list.remove(2);
		System.out.println("값 삭제 확인 : " + list);

//		list.clear();
//		System.out.println("값 삭제 확인 : " + list);

		// 값 출력 방법
		System.out.println("값 출력 방법 : " + list.get(1));

		for (Integer i : list) {
			System.out.println("for 사용방법 : " + i);
		}

		// while 사용방법
		// 요소 순회(반복자) : 컬렉션 플레임원크에 저장된 요소들을 하나씩 차례로 참조하는 것.
		Iterator<Integer> iter = list.iterator(); // list안의 요소를 Integer로 형 변환 시켜준다.

		// true, false
		while (iter.hasNext()) {
			System.out.println("while 사용방법: " + iter.next());
		}

		// 값 검색 방법
		System.out.println(list.contains(1));
		System.out.println(list.contains(10));

		// 값이 잇으면 인덱스의 번호를 반환, 없으면 -1을 반환하는 녀석.
		System.out.println(list.indexOf(10)); // 1번째 인덱스에 있다.
		System.out.println(list.indexOf(300)); // 없으면 -1을 반환 한다.
		System.out.println(list.indexOf(3)); // 0번째 인덱스에 있다.

		System.out.println("--------------------------");

		ArrayList<String> names = new ArrayList<String>();

		// 스캐너 사용
		// 이름을 입력하면 names 리스트에 저장 while

		// 화면에 입력한 이름을 뿌려주세요.
		System.out.println("저장할 이름을 입력해주세요 : ");
		Scanner sc1 = new Scanner(System.in);
		String userName = sc1.next();
		while (true) {
			names.add(userName);
			if (names.size() > 3) {
				System.out.println(names);
				break;
			}

		}

	}

}
