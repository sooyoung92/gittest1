package ch03;

// Ŭ������ ����ϴ� ���� �� �ڵ�
public class StudentMainTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student();
		studentLee.studentName = "�̼���";
		studentLee.address = "��õ";
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentName = "������";
		studentKim.address = "����";
		studentKim.showStudentInfo();
		
		System.out.println("--------------------------------");
		String name1 = studentKim.getStudentName();
		System.out.println("name1 : "+ name1);
		
		String name2 = studentLee.getStudentName();
		System.out.println("name2 : " + name2);
				
	}// end of main

}// end of class
