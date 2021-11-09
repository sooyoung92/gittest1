package ch11;

public class StringBuiderTest {

	public static void main(String[] args) {
		
		// StringBuilder, StringBuffer 활용
		// 내부적으로 가변적인 char[]를 멤버변수로 가진.
		// 문자열을 여러번 연결하거나 변결할 때 사용하면 유용하다.
		// StringBuffer 는 멀티 쓰레드 프로그래밍에서 동기화를 보장
		// 단일 쓰레드 프로그램에서는 StringBuilder 사룔하기를 권장.
		
		
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder builder = new StringBuilder(java);
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		System.out.println("------------------------");
		builder.append(android);
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		System.out.println("------------------------");
		// 문제 1 append 메서드 사용해서 3개
		
		builder.append("자바");
		builder.append("안드로이드");
		builder.append("JA");
		System.out.println(builder);
		System.out.println("------------------------");
		
		// 문제2
//		String tempStr = builder; <--- 오류 수정.
		String tempStr = builder.toString();
		System.out.println(tempStr);
		
		
		

	}

}
