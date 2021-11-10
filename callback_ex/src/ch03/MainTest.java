package ch03;

public class MainTest {

	public static void main(String[] args) {

		// 해커 뉴스 객체 생성
		HackerNews hackerNews = new HackerNews();
		Sbs sbs = new Sbs();

		// 기사 작성
		MyArticle article = new MyArticle(hackerNews, sbs);
		article.complete();

	}

}
