package ch01;

// ����� �л� Ŭ������ ����غ��� ����.
public class StudentMainTest1 {
	// �����Լ� (�ڵ��� ������)
	public static void main(String[] args) {
		
		Student s1; //--> �ּҰ��� ����.
		Student s2;
		
		s1 = new Student(); // heap �޸𸮿� ��ü�� ����. �ν��Ͻ���� �Ѵ�.
		s2 = new Student();
		
		System.out.println(s1); // �޸��ּ�
 		System.out.println(s2);

	}// end of main

}// end of class
