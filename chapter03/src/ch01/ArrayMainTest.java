package ch01;

import java.util.Scanner;

public class ArrayMainTest {

	public static void main(String[] args) {

		// �迭
		// �迭�̶� ������ �����͸� ��Ƽ� ������ �����ϱ� ���� ����ϴ� ������ Ÿ���Դϴ�.
		// ������ �ϳ��� �����͸� �����ϱ� ���� ���̶�� �迭�� �������� �����͸� �ϳ��� ������
		// �����ϱ� ���� ���̶�� �� �� �ִ�.

		int number = 10;

		// �迭 ���� ���
		int[] arr1 = new int[3]; // <--- �����ϴ� ���.
		int arr2[] = new int[10];

		// �ʱ�ȭ �ϴ� ���(���� �ִ� ���)
//		arr1 = 33; <--- �߸��� �ʱ�ȭ ����̴�.
		arr1[0] = 33;
		arr1[1] = 10;
		arr1[2] = 11;
		// ��� ���� �ε����� ������ 0�����̴�.
		// �ε����� �� ������ ��ȣ�� n-1 �̴�.

		// �迭 ����� ���ÿ� �ʱ�ȭ
		int[] numbers1 = new int[] { 11, 20, 30 };
		int[] numbers2 = { 10, 50, 100 };

		// ��� ���
		System.out.println(numbers1[0]);
		System.out.println(numbers1[1]);
		System.out.println(numbers1[2]);
		System.out.println(numbers1);

		// CRUD

		//
		String[] strArr = new String[10];
		strArr[0] = "�߽���";
		strArr[1] = "Ƽ��";
		strArr[2] = "�ֽ�";
		strArr[3] = "�ٸ��콺";

		// 1. ȭ�鿡 0,1,2,3,4 ������ּ���. �� for�� ��� ����.
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		System.out.println(strArr[2]);
		System.out.println(strArr[3]);

		System.out.println(strArr.length);

		// �ڵ� ���� null ���� ������� ������.
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i] != null) {
				System.out.println(strArr[i]);
			} // end of if
		} // end of for

		// ��� ���α׷��� ������ index 0 ���� �����մϴ�.
		// �迭�� ����Ҷ� ���� for���� �����ؼ� ���� ��� �մϴ�.

//		new int[22]; // ���� 22, �ε��� 21
//		new int[74]; // ���� 74, 73
//		new int[283]; // ���� 283, 282

	}// end of main

}// end of class
