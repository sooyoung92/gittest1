package ch09;

public class Employee {

	public static int serialNum = 1000;

	private int employeeId;
	private String emplolyeename;
	private String department;

	public Employee() {
		serialNum++;
		employeeId = serialNum;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	// static �޼��� Ȱ��
	public static int getSerialNum() {
		// ���� : static �޼��� �ȿ����� ��� ������ ����� �� ����.
		// why : ��ü�� ��������� ���� �����ؼ� ����� �� �ִ� static�̱� �����̴�.
		// ��ü�� �����Ǳ� ���� ���� �� �� �ִ� �޼����̴�.
//		department = "������";
		return serialNum;
	}

}
