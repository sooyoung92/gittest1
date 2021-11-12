package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {

	public static void main(String[] args) {

		try (FileOutputStream fos = new FileOutputStream("output3.txt")) {

			byte[] bs = new byte[26];
			byte data = 65; // 'A'
			for (int i = 0; i < bs.length; i++) {
				bs[i] = data;
				data++;
			}
			fos.write(bs, 2, 10); // 배열 2번째부터 10개 바이트 출력

		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("출력이 완료 되었습니다.");

	}

}
