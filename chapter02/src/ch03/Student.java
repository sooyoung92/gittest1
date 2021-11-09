package ch03;

// 클래스를 설계하는 입장
public class Student {

	// 멤버 변수
	public int studentID;
	public String studentName;
	public String address;
	
	// 메서드 (멤버 변수를 이용해서 객체에 기능을 만들어 낸다.)
	public void showStudentInfo() {
		System.out.println(studentName + " , " + address);
	}
	
	public String getStudentName() {
		return studentName; 
	}
	

}
