package ch02;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {

		FileInputStream fis = null;

		try {
			fis = new FileInputStream("assets/input1.txt");
			int i;
			// while ������ ó���� �մϴ�.
			// fis.read() ---> ���ڰ� ������ -1�� ��ȯ��.
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
