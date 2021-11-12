package ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest01 {

	public static void main(String[] args) {

//		FileInputStream fis = null;
//		try {
//			 fis = new FileInputStream("assets/hello.txt");
//			int i;
//			while((i = fis.read()) != -1){
//				System.out.print((char)i);
//			}
//			
//		} catch (IOException e) {
//			System.out.print("파일이 없습니다.");
//			e.printStackTrace();
//		} finally {
//			try {
//				fis.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
		// 자동으로 스트림을 닫아 준다.
		try (FileInputStream fis = new FileInputStream("assets/hello.txt")) {
			int i;
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}

		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
