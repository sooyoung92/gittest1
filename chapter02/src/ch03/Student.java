package ch03;

// Ŭ������ �����ϴ� ����
public class Student {

	// ��� ����
	public int studentID;
	public String studentName;
	public String address;
	
	// �޼��� (��� ������ �̿��ؼ� ��ü�� ����� ����� ����.)
	public void showStudentInfo() {
		System.out.println(studentName + " , " + address);
	}
	
	public String getStudentName() {
		return studentName; 
	}
	

}
