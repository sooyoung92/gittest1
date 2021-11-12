package ch05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class bufferedStreamTest {

	public static void main(String[] args) {

		long millisecond = 0;

		try (FileInputStream fis = new FileInputStream("a.zip")) {
			FileOutputStream fos = new FileOutputStream("copy.zip");

			// 보조 스트림 사용해 보기
			// 인풋 스트림 - 보조
			BufferedInputStream bis = new BufferedInputStream(fis); // 보조스트림의 생성자에 기반스트림을 넣어준다.

			// 아웃풋 스트림 - 보조
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			millisecond = System.currentTimeMillis();
			int i;
			// 기반 스크림 사용 코드
//			while((i = fis.read()) != -1) {
//				fos.write(i);
//			}

			while ((i = bis.read()) != -1) {
				bos.write(i);
			}

			millisecond = System.currentTimeMillis() - millisecond;

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("파일을 복사 하는데 " + millisecond + " 소요 되었습니다.");

	}

}
