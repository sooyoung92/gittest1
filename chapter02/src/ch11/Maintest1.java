package ch11;

import java.util.Calendar;

public class Maintest1 {

	public static void main(String[] args) {
		// Company ��ü�� ������ ������ 5��
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		Company company3 = Company.getInstance();
		Company company4 = Company.getInstance();
		Company company5 = Company.getInstance();
		// ȭ�鿡 �ּҰ��� ����� ������.
		System.out.println(company1);
		System.out.println(company2);
		System.out.println(company3);
		System.out.println(company4);
		System.out.println(company5);

		Calendar c = Calendar.getInstance();

	}

}
