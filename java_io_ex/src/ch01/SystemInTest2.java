package ch01;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest2 {

	public static void main(String[] args) {

		System.out.println("���ĺ� ������ ���� Enter�� ��������");

		int i;
		try {
			// ����Ʈ�� ���ڷ� �������ִ� �༮
			// ����Ʈ ������ ���� �༮�� ���� ������ �о� ���̰� �ϴ� �༮
			// ---> ���� ��Ʈ��

			InputStreamReader irs = new InputStreamReader(System.in);

			while ((i = irs.read()) != '\n') {
				// ȭ�鿡 ���
				System.out.print((char) i);
			}

//			while ( (i = System.in.read() ) != '\n' ) {
//				// ȭ�鿡 ���
//				System.out.print((char)i);
//			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
