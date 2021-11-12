package ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {

//		try {
//			
//		} catch (Exception e) {
//			
//		}

		// �ڹ� jdk9 ���� ���� ���� ��� ���� , �ڵ����� �ݾ���.
		try (FileInputStream fis = new FileInputStream("assets/input1.txt")) {

			int i;
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}

		} catch (FileNotFoundException e) {
			System.out.println("������ �����ϴ�.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
