package ch09;

import java.util.Random;

public class MainTest2 {

	public static void main(String[] args) {

		// JDk ������� ����

		Random r = new Random();
		int value = r.nextInt(20);
		System.out.println("value : " + value);

	}

}
