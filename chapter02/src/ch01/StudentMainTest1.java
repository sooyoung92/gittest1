package ch01;

// 설계된 학생 클래스를 사용해보는 입장.
public class StudentMainTest1 {
	// 메인함수 (코드의 시작점)
	public static void main(String[] args) {
		
		Student s1; //--> 주소값이 담긴다.
		Student s2;
		
		s1 = new Student(); // heap 메모리에 객체를 생성. 인스턴스라고도 한다.
		s2 = new Student();
		
		System.out.println(s1); // 메모리주소
 		System.out.println(s2);

	}// end of main

}// end of class
