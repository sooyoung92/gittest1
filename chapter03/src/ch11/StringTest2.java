package ch11;

public class StringTest2 {

	public static void main(String[] args) {
		
		// �ѹ� ������ string�� �Һ�(immutable)
		
		// String�� �����ϸ� ������ String�� ����Ǵ� ���� �ƴ�
		// ���ο� ���ڿ��� �����ȴ�.
		
		String java = new String("java");
		String android = new String("Android");
		
		System.out.println(java);
		System.out.println(System.identityHashCode(java));
		
		System.out.println("----------------------------");
		
		// java = java + android;
		java= java.concat(android);
		System.out.println(java); // javaAndroid
		
		System.out.println(System.identityHashCode(java));
		
		
	}// end of main

}// end of class
