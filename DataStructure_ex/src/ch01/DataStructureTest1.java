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

		// ������ �ְ�(�ε���) �ߺ��� �����ϴ�.
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Student> members = new ArrayList<Student>();
		ArrayList<Integer> num = new ArrayList<>();

		// ����� ���ÿ� �ʱ�ȭ
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));

		// �� �߰� ���
		list.add(3); // index 0
		list.add(null); // index 1
		list.add(1, 10); // index 1��°�� 10�� ���� (null�� �ε��� 2������ �з� ����.)

		System.out.println("�� Ȯ�� : " + list); // toString �޼��尡 ������ �Ǿ �ּҰ���� ���� �ٷ� ���.

		// �� ���� ���
		list.remove(2);
		System.out.println("�� ���� Ȯ�� : " + list);

//		list.clear();
//		System.out.println("�� ���� Ȯ�� : " + list);

		// �� ��� ���
		System.out.println("�� ��� ��� : " + list.get(1));

		for (Integer i : list) {
			System.out.println("for ����� : " + i);
		}

		// while �����
		// ��� ��ȸ(�ݺ���) : �÷��� �÷��ӿ�ũ�� ����� ��ҵ��� �ϳ��� ���ʷ� �����ϴ� ��.
		Iterator<Integer> iter = list.iterator(); // list���� ��Ҹ� Integer�� �� ��ȯ �����ش�.

		// true, false
		while (iter.hasNext()) {
			System.out.println("while �����: " + iter.next());
		}

		// �� �˻� ���
		System.out.println(list.contains(1));
		System.out.println(list.contains(10));

		// ���� ������ �ε����� ��ȣ�� ��ȯ, ������ -1�� ��ȯ�ϴ� �༮.
		System.out.println(list.indexOf(10)); // 1��° �ε����� �ִ�.
		System.out.println(list.indexOf(300)); // ������ -1�� ��ȯ �Ѵ�.
		System.out.println(list.indexOf(3)); // 0��° �ε����� �ִ�.

		System.out.println("--------------------------");

		ArrayList<String> names = new ArrayList<String>();

		// ��ĳ�� ���
		// �̸��� �Է��ϸ� names ����Ʈ�� ���� while

		// ȭ�鿡 �Է��� �̸��� �ѷ��ּ���.
		System.out.println("������ �̸��� �Է����ּ��� : ");
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
