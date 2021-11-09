package ch02;

import java.util.ArrayList;

import ch01.Book;

public class ArrayMainTest1 {

	public static void main(String[] args) {
		Book book1 = new Book(1, "�帣�°���ó��", "�Ŀ���ڿ���");
		Book book2 = new Book(2, "�÷���UI����", "���ȣ");
		Book book3 = new Book(3, "����ȭ�����Ǿ����ϴ�", "������");
		Book book4 = new Book(4, "�������θ����϶�", "������");
		Book book5 = new Book(5, "���ǿ���", "�����϶�");

		// ArrayList ����

		// �����͸� ���� ���� �����
		// ! ArrayList �� �迭�� �޸� ������ ũ�⸦ ���� ������ �ʿ䰡 ����.
		ArrayList<Book> shoppingCart = new ArrayList<Book>();

		// �߰� ��� 1
		// ������ �߰��ϱ�
		// shoppingCart[0] = ""
		shoppingCart.add(book1);
		shoppingCart.add(book2);
		shoppingCart.add(book3);
		shoppingCart.add(book4);

		System.out.println(shoppingCart.size());
		// ȭ�鿡 ���
		for (int i = 0; i < shoppingCart.size(); i++) {
			shoppingCart.get(i).showInfo();
		}
		System.out.println("-------------------------------");
		// �߰� ��� 2
		shoppingCart.add(2, book5);
		// for�� 2��° ���
		for (Book b : shoppingCart) {
			b.showInfo();
		}
		System.out.println("-------------------------------");
		// ���� �ϱ�
		shoppingCart.remove(0);
		//		shoppingCart.clear(); // ���� ����	
		// foreach

		for (Book book : shoppingCart) {
			book.showInfo();
		}
		System.out.println("-------------------------------");

		// �����ϱ�
		shoppingCart.set(2, book1);
		// foreach �� �����ؼ� ȭ�鿡 ���
		for (Book book : shoppingCart) {
			book.showInfo();
		}

		// C R U D

		// create, read, update, delete

	}

}
