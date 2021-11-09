package ch01;

public class StudentMainTest2 {
	// 메인함수 (코드의 시작점)
	public static void main(String[] args) {
		
		Student student1 = new Student();
		// 1. 접근해서 name. height, weight, grade
		// 값을 줘서 화면에 출력해주세요.
		student1.name = "학생1";
		student1.height = 178;
		student1.weight = 75;
		student1.grade = 3;
		
		System.out.println(student1.name);
		System.out.println(student1.height);
		System.out.println(student1.weight);
		System.out.println(student1.grade);
		
		System.out.println("------------------------");
		
		
		Student student2 = new Student();
		// 2. 접근해서 name. height, weight, grade
		// 값을 줘서 화면에 출력해주세요.
		
		student2.name = "학생2";
		student2.height = 168;
		student2.weight = 65;
		student2.grade = 8;
		
		System.out.println(student2.name);
		System.out.println(student2.height);
		System.out.println(student2.weight);
		System.out.println(student2.grade);

	}// end of main

}// end of class
