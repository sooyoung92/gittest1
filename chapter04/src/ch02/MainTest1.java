package ch02;

import java.util.Scanner;

public class MainTest1 {

	public static void main(String[] args) {
		MyComponents mc = new MyComponents();

		System.out.println("���ڸ� �Է��ϼ���");

		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine();

//		System.out.println(userInput);

		mc.textField.setText(userInput);

	}

}
