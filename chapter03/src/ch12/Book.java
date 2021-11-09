package ch12;

public class Book {

	private int bookId;
	private String title;
	private String author;

	// Alt + Shift + s
	public Book(int bookId, String title, String author) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
	}

	// toString�޼��� ������ �غ���
	@Override
	public String toString() {
		return "[" + bookId + "," + title + "," + author + "]";
	}

	// å�̸�, �۰� ���� ���ƾ� true
	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Book) {
			Book tempBook = (Book) obj;
			// ���� ����
			if (this.title == tempBook.title && this.author == tempBook.author) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Book book1 = new Book(1, "���̾�", "ȫ�浿");
		System.out.println(book1);

	}// end of main

}
