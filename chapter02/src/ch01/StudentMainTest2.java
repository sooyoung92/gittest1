package ch01;

public class StudentMainTest2 {
	// �����Լ� (�ڵ��� ������)
	public static void main(String[] args) {
		
		Student student1 = new Student();
		// 1. �����ؼ� name. height, weight, grade
		// ���� �༭ ȭ�鿡 ������ּ���.
		student1.name = "�л�1";
		student1.height = 178;
		student1.weight = 75;
		student1.grade = 3;
		
		System.out.println(student1.name);
		System.out.println(student1.height);
		System.out.println(student1.weight);
		System.out.println(student1.grade);
		
		System.out.println("------------------------");
		
		
		Student student2 = new Student();
		// 2. �����ؼ� name. height, weight, grade
		// ���� �༭ ȭ�鿡 ������ּ���.
		
		student2.name = "�л�2";
		student2.height = 168;
		student2.weight = 65;
		student2.grade = 8;
		
		System.out.println(student2.name);
		System.out.println(student2.height);
		System.out.println(student2.weight);
		System.out.println(student2.grade);

	}// end of main

}// end of class
