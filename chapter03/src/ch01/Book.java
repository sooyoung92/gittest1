package ch01;

public class Book {

	// ��� ����
	int id;
	String title;
	String author;

	// ������ ��� 3���� �Է� �ѹ��� �޴� �����ڸ� ����� �ּ���.
	public Book(int id, String title, String author) {
		this.id = id;
		this.title = title;
		this.author = author;
	}

	// �޼��� ������ּ��� showInfo();
	public void showInfo() {
		System.out.println("id : " + id);
		System.out.println("title : " + title);
		System.out.println("author : " + author);
	}

}
