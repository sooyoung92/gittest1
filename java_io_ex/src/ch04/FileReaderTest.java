package ch04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {

		// 문자를 읽어 들이는 스트림
		try (FileReader fr = new FileReader("assets/article.txt")) {

			int i;
			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
