package ch02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TelManagement {

	// ����
	public static void insert(HashMap<String, Phone> map) {
		Phone phone;

		String name, address, telephone;

		Scanner s = new Scanner(System.in);
		System.out.println("�̸� >> : ");
		name = s.next();
		System.out.println("�ּ� >> : ");
		address = s.next();
		System.out.println("��ȭ��ȣ >> : ");
		telephone = s.next();

		phone = new Phone(name, address, telephone);
		map.put(phone.name, phone);
		map.put(phone.address, phone);
		map.put(phone.telephne, phone);

	}

	// ����
	public static void delete(HashMap<String, Phone> map) {

		String delName;
		// Key�� �̸��� �Է� �޾Ƽ� ���
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �� �̸� >> : ");
		delName = sc.next();
		if (map.containsKey(delName)) {
			// ����
			map.remove(delName);
		} else {
			System.out.println(delName + "�� ��ϵ��� ���� ����Դϴ�.");
		}

	}

	// ã��
	public static void search(HashMap<String, Phone> map) {

		// key �̸��� �Է� �޾Ƽ� ã�� ȭ�鿡 ���� �ּ���.
		Scanner sc = new Scanner(System.in);
		System.out.println("ã�� �̸� >> : ");
		String findName = sc.next();
		if (map.containsKey(findName)) {
			System.out.println(findName + " " + map.get(findName).telephne);
		} else {
			System.out.println("���� �̸� �Դϴ�.");
		}

	}

	// ��ü����

	public static void showInfo(HashMap<String, Phone> map) {

		// ȭ�鿡 ��ü ������ �ѷ��ִ� ����� ����� �ּ���.
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
		// �ӽ� ������ ���� �޼��� ��� Ȯ���غ���
//		map.put("ȫ�浿", new Phone("ȫ�浿","�λ��","123"));
//		map.put("�̼���", new Phone("�̼���","�����","456"));
		// �޼��� �̿��غ���
//		insert(map);
		System.out.println("==========");
//		System.out.println(map);
//		search(map);
		System.out.println("==========");
//		showInfo(map);

		// ���࿡ �帧 ����� ����
		System.out.println("==========");
		System.out.println("��ȭ��ȣ ���� ���α׷�");
		System.out.println("==========");

		// ��ĳ�� �̿��ؼ�
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("�߰� 0, ���� 1, ã�� 2, ��ü���� 3, ���� 4");
			System.out.println("��ȣ : ");
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
				System.out.println("�����մϴ�.");
				break;
			default:
				System.out.println("�߸� �Է� �ϼ̽��ϴ�.");

			}

		}
	}

}
