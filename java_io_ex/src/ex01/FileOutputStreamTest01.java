package ex01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamTest01 {

	public static void main(String[] args) {
		// ���� �Է��� ���� ���� ������ �����ϴ� ���α׷��� ������
		System.out.println("�Է��� ������ �ۼ��ϼ���.");
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
