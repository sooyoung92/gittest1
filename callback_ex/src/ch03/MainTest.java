package ch03;

public class MainTest {

	public static void main(String[] args) {

		// ��Ŀ ���� ��ü ����
		HackerNews hackerNews = new HackerNews();
		Sbs sbs = new Sbs();

		// ��� �ۼ�
		MyArticle article = new MyArticle(hackerNews, sbs);
		article.complete();

	}

}
