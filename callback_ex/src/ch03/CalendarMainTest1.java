package ch03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarMainTest1 {

	public static void main(String[] args) {

		// Calendar �� ��¥ �ν��Ͻ� �Դϴ�.
		// �޷��̳� �ð������� ��� �� �� ���� ����ϴ� ��ü

		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTimeInMillis());

		// ���� �����ϱ� ������ ������ ���� ��� �� �� �ִ�.
		// ��¥�� ��ȯ ��� ����

		DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");

		// ���� �ð��� ���� ���� format �������� ��ȯ
		String date = dateFormat.format(calendar.getTimeInMillis());
		System.out.println(date);

	}

}
