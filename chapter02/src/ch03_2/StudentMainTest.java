package ch03_2;

//Ŭ������ ����ϴ� ���� �� �ڵ�
public class StudentMainTest {

	public static void main(String[] args) {

		Student studentLee = new Student();
		studentLee.studentName = "�̼���";
		studentLee.address = "��õ";
		
		studentLee.showStudentInfo();
		studentLee.takeTest();
		studentLee.cleanUp();
		
		System.out.println("--------------------------------");
		
		Student studentKim = new Student();
		studentKim.studentName = "������";
		studentKim.address = "����";
		studentKim.showStudentInfo();
		
		//�޼��� ���
		// 1. takeTest ����
		studentKim.takeTest();
			
		// 2. cleanUp ����
		studentKim.cleanUp();
		
		System.out.println("--------------------------------");
		
		String name1 = studentKim.getStudentName();
		System.out.println("name1 : "+ name1);
		
		String name2 = studentLee.getStudentName();
		System.out.println("name2 : " + name2);
		
		System.out.println("--------------------------------");
		
		
	}

}
