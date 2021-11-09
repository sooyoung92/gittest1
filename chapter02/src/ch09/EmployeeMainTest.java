package ch09;

public class EmployeeMainTest {

	public static void main(String[] args) {

		// static 메서드
		int temp = Employee.getSerialNum();
		System.out.println(temp);
//		Employee test1 = new Employee();
//		test1.getEmployeeId(); // <-- 일반 메서드

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

		// static 변수, 멤버 변수, 지역 변수 --- 매모리 위치 확인

		// emplyee1 ~ emplyee5 : 인스턴스 변수로 접근해서 getEmplyeeId()
		// 실행

		// 클래스 이름으로 접근해서 getSerialNum() 메서드를 사용

	}// end of main

}// end of class
