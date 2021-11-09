package ch01;

import java.util.Scanner;

public class ArrayMainTest {

	public static void main(String[] args) {

		// 배열
		// 배열이란 연관된 데이터를 모아서 통으로 관리하기 위해 사용하는 데이터 타입입니다.
		// 변수가 하나의 데이터를 저장하기 위한 것이라면 배열은 여러개의 데이터를 하나의 변수에
		// 저장하기 위한 것이라고 할 수 있다.

		int number = 10;

		// 배열 선언 방법
		int[] arr1 = new int[3]; // <--- 권장하는 방법.
		int arr2[] = new int[10];

		// 초기화 하는 방법(값을 넣는 방법)
//		arr1 = 33; <--- 잘못된 초기화 방법이다.
		arr1[0] = 33;
		arr1[1] = 10;
		arr1[2] = 11;
		// 모든 언어에서 인덱스의 시작은 0부터이다.
		// 인덱스의 맨 마지막 번호는 n-1 이다.

		// 배열 선언과 동시에 초기화
		int[] numbers1 = new int[] { 11, 20, 30 };
		int[] numbers2 = { 10, 50, 100 };

		// 출력 방법
		System.out.println(numbers1[0]);
		System.out.println(numbers1[1]);
		System.out.println(numbers1[2]);
		System.out.println(numbers1);

		// CRUD

		//
		String[] strArr = new String[10];
		strArr[0] = "야스오";
		strArr[1] = "티모";
		strArr[2] = "애쉬";
		strArr[3] = "다리우스";

		// 1. 화면에 0,1,2,3,4 출력해주세요. 단 for문 사용 금지.
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		System.out.println(strArr[2]);
		System.out.println(strArr[3]);

		System.out.println(strArr.length);

		// 코드 수정 null 값을 출력하지 마세요.
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i] != null) {
				System.out.println(strArr[i]);
			} // end of if
		} // end of for

		// 모든 프로그램밍 언어에서는 index 0 부터 시작합니다.
		// 배열을 사용할때 보통 for문과 관계해서 많이 사용 합니다.

//		new int[22]; // 길이 22, 인덱스 21
//		new int[74]; // 길이 74, 73
//		new int[283]; // 길이 283, 282

	}// end of main

}// end of class
