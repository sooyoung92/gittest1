package ch12;

// ���� ����ϴ� �⺻ Ŭ�������� ���� ��Ű��
import java.lang.*;

class Student extends Object {

	// toString();

	@Override
	public String toString() {
		return "�л�Ŭ����";
	}

}

// �ڹٿ��� �ֻ��� Ŭ������ ObjectŬ����
public class ObjectTest extends Object {

	String Str1;

	public static void main(String[] args) {

		Student s1 = new Student();
		System.out.println(s1);
		String str1 = new String("�ȳ��ϼ���");
		System.out.println(str1);

	}// end of main

}// end of class
