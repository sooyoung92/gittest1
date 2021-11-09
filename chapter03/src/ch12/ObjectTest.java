package ch12;

// 많이 사용하는 기본 클래스들이 속한 패키지
import java.lang.*;

class Student extends Object {

	// toString();

	@Override
	public String toString() {
		return "학생클래스";
	}

}

// 자바에서 최상위 클래스는 Object클래스
public class ObjectTest extends Object {

	String Str1;

	public static void main(String[] args) {

		Student s1 = new Student();
		System.out.println(s1);
		String str1 = new String("안녕하세요");
		System.out.println(str1);

	}// end of main

}// end of class
