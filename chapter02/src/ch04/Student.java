package ch04;

public class Student {

	// ������ - constructor
	// ��ü�� �����Ҷ� ������ ���� ������� ������� �����ϴ� �� (������ �ο���)
	
	int number;
	String name;
	int grade;
	
	// �⺻ ������ 
	// ����� ���� �����ڰ�  ���� ��쿡�� 
	// �����Ϸ��� �˾Ƽ� �⺻ �����ڸ� ����� �ش�.
	public Student() {
		
	}
	
	// ������ ����� ( �����ڰ� ���� ���� - ����� ���� ������) , Ŭ���� �̸��� �Ȱ���
	// grade �ΰ� �ڵ带 ���� �����ϰ� �������ּ���.
	public Student(int num, String name, int grade) {
		number = num;
		// �Ű����� �̸��� ������� �̸��� ���ٸ� 
		// this. Ű���带 ����ؼ� ������ �־�� �Ѵ�.
		this.name = name; 
		this.grade = grade;
	}
	
	// �޼��� ����
	public void showInfo() {
		System.out.println(
				name + " �л��� �й��� " + number + "�� �Դϴ�."
				+ "\n�г��� " + grade + "�г��Դϴ�."
				);
	}
	
}
