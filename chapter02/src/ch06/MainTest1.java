package ch06;

public class MainTest1 {
	// �����Լ� (�ڵ��� ������)
	public static void main(String[] args) {
	
		Student studentLee = new Student(1, "Lee");
		studentLee.setKoreaSubject("����", 100);
		studentLee.setMathSubject("����", 90);
		studentLee.showStudentScore();
		
		// �л� 2 ���� ����
		Student studentKim = new Student(2, "Kim");
		studentKim.setKoreaSubject("����", 50);
		studentKim.setMathSubject("����", 70);
		studentKim.showStudentScore();
		
		// �л� 3 ���� ����
		Student studentCho = new Student(3, "Cho");
		studentCho.setKoreaSubject("����", 88);
		studentCho.setMathSubject("����", 59);
		studentCho.showStudentScore();

	}// end of main

}// end of class
