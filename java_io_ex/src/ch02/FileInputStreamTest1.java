package ch02;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("assets/input.txt");
//			int first = fis.read();
//			System.out.println("first : " + first);
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("������ �����ϴ�.");
		} finally {
			try {
				fis.close(); // ����� ��Ʈ���� �ݾƼ� �޸� ���� ��������.
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("���α׷��� ���� ���� �ʾҽ��ϴ�.");
	}

}
