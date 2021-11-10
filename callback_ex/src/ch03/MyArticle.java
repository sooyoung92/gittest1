package ch03;

import java.util.Scanner;

// 콜리 (호출자)
public class MyArticle {

	String article;
	WriteArticle hacker;
	WriteArticle sbs;

	// 주소값 연결
	public MyArticle(WriteArticle hacker, WriteArticle sbs) {
		this.sbs = sbs;
		this.hacker = hacker;
	}

	public void complete() {
		// 스캐너를 사용해서 사용자 입력값을 받고 콜백 메서드를 실행 시켜 주세요.
		// nextLine
		Scanner sc1 = new Scanner(System.in);
		article = sc1.nextLine();
		sbs.printArticle(article);
		hacker.printArticle(article);
	}

}
