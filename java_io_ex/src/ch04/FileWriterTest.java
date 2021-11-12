package ch04;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {

		try (FileWriter fw = new FileWriter("writer.txt", false)) {

//			fw.write('A');
			char buf[] = { 'B', 'C', 'D', 'F', 'G', 'H', 'I' };
//			fw.write(buf);
			fw.write(buf, 1, 5);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
