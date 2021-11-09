package ch03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionEx2 {

	public static void main(String[] args) {

		FileInputStream fis;

		try {
			fis = new FileInputStream("a.txt");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
		} catch (Exception e) {
			System.out.println("���� ó��");
			return; // ������ ���Ϲ��� �־ finally�� ���� �ȴ�.
		} finally {
			// try ���� ����Ǹ� �ݵ�� ���� ��
			System.out.println("�ݵ�� ����˴ϴ�.");
		}

		System.out.println("������ ���ᰡ ���� �ʾҽ��ϴ�.");

	}

}
