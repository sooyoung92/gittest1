package ex01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamTest01 {

	public static void main(String[] args) {
		// 직접 입력한 값을 적은 파일을 생성하는 프로그램을 만들어보자
		System.out.println("입력할 내용을 작성하세요.");
		Scanner sc = new Scanner(System.in);
		byte bs = sc.nextByte();
		try (FileOutputStream fos = new FileOutputStream("write01.txt")) {

			fos.write(bs);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
