package ch03;

import java.util.Scanner;

// �ݸ� (ȣ����)
public class MyArticle {

	String article;
	WriteArticle hacker;
	WriteArticle sbs;

	// �ּҰ� ����
	public MyArticle(WriteArticle hacker, WriteArticle sbs) {
		this.sbs = sbs;
		this.hacker = hacker;
	}

	public void complete() {
		// ��ĳ�ʸ� ����ؼ� ����� �Է°��� �ް� �ݹ� �޼��带 ���� ���� �ּ���.
		// nextLine
		Scanner sc1 = new Scanner(System.in);
		article = sc1.nextLine();
		sbs.printArticle(article);
		hacker.printArticle(article);
	}

}
