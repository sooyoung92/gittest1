package ch09;

public class EmployeeMainTest {

	public static void main(String[] args) {

		// static �޼���
		int temp = Employee.getSerialNum();
		System.out.println(temp);
//		Employee test1 = new Employee();
//		test1.getEmployeeId(); // <-- �Ϲ� �޼���

		Employee employee1 = new Employee();
		System.out.println(employee1.serialNum);
		System.out.println(employee1.getEmployeeId());

		Employee employee2 = new Employee();
		Employee employee3 = new Employee();
		Employee employee4 = new Employee();
		Employee employee5 = new Employee();
		System.out.println("------------------------------------");
		System.out.println(employee1.getEmployeeId());
		System.out.println(employee5.serialNum);
		System.out.println(employee2.serialNum);
		System.out.println(employee3.serialNum);
		System.out.println(employee4.serialNum);
		System.out.println("------------------------------------");

		// static ����, ��� ����, ���� ���� --- �Ÿ� ��ġ Ȯ��

		// emplyee1 ~ emplyee5 : �ν��Ͻ� ������ �����ؼ� getEmplyeeId()
		// ����

		// Ŭ���� �̸����� �����ؼ� getSerialNum() �޼��带 ���

	}// end of main

}// end of class
