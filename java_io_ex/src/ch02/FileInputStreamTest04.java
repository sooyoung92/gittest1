package ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest04 {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("assets/input1.txt")) {

			byte[] bs = new byte[15]; // 한번에 여러 바이트를 읽을 때 사용
			int i;
			while ((i = fis.read(bs)) != -1) {

				for (int j = 0; j < i; j++) {
					System.out.print((char) bs[j]);
				}
				System.out.println(" : " + i + "바이트 읽을");
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
