package ch02;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {

		FileInputStream fis = null;

		try {
			fis = new FileInputStream("assets/input1.txt");
			int i;
			// while 문으로 처리를 합니다.
			// fis.read() ---> 글자가 없으면 -1을 반환함.
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
