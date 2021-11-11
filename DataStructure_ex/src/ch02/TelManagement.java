package ch02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TelManagement {

	// 삽입
	public static void insert(HashMap<String, Phone> map) {
		Phone phone;

		String name, address, telephone;

		Scanner s = new Scanner(System.in);
		System.out.println("이름 >> : ");
		name = s.next();
		System.out.println("주소 >> : ");
		address = s.next();
		System.out.println("전화번호 >> : ");
		telephone = s.next();

		phone = new Phone(name, address, telephone);
		map.put(phone.name, phone);
		map.put(phone.address, phone);
		map.put(phone.telephne, phone);

	}

	// 삭제
	public static void delete(HashMap<String, Phone> map) {

		String delName;
		// Key는 이름을 입력 받아서 사용
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제 할 이름 >> : ");
		delName = sc.next();
		if (map.containsKey(delName)) {
			// 삭제
			map.remove(delName);
		} else {
			System.out.println(delName + "은 등록되지 않은 사람입니다.");
		}

	}

	// 찾기
	public static void search(HashMap<String, Phone> map) {

		// key 이름을 입력 받아서 찾고 화면에 보여 주세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("찾을 이름 >> : ");
		String findName = sc.next();
		if (map.containsKey(findName)) {
			System.out.println(findName + " " + map.get(findName).telephne);
		} else {
			System.out.println("없는 이름 입니다.");
		}

	}

	// 전체보기

	public static void showInfo(HashMap<String, Phone> map) {

		// 화면에 전체 정보를 뿌려주는 기능을 만들어 주세요.
		Set<String> names = map.keySet();

		Iterator<String> it = names.iterator();

		while (it.hasNext()) {
			String name = it.next();
			Phone person = map.get(name);
			System.out.println(name + " " + person.telephne);
		}
	}

	public static void main(String[] args) {

		HashMap<String, Phone> map = new HashMap<>();
		// 임시 데이터 만들어서 메서드 기능 확인해보기
//		map.put("홍길동", new Phone("홍길동","부산시","123"));
//		map.put("이순신", new Phone("이순신","서울시","456"));
		// 메서드 이용해보기
//		insert(map);
		System.out.println("==========");
//		System.out.println(map);
//		search(map);
		System.out.println("==========");
//		showInfo(map);

		// 실행에 흐름 만들어 보기
		System.out.println("==========");
		System.out.println("전화번호 관리 프로그램");
		System.out.println("==========");

		// 스캐너 이용해서
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("추가 0, 삭제 1, 찾기 2, 전체보기 3, 종료 4");
			System.out.println("번호 : ");
			int inputNum = sc.nextInt();
			switch (inputNum) {
			case 0:
				insert(map);
				break;
			case 1:
				delete(map);
				break;
			case 2:
				search(map);
				break;
			case 3:
				showInfo(map);
				break;
			case 4:
				System.out.println("종료합니다.");
				break;
			default:
				System.out.println("잘못 입력 하셨습니다.");

			}

		}
	}

}
