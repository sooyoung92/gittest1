package ch11;

public class StringTest1 {

	public static void main(String[] args) {
		
		// String ���� ���
		// heap �޸𸮿� �ν��Ͻ��� �����Ǵ� ���
		String str1 = new String("abc");
		
		// data, static, constant pool �� ��ġ �Ѵ�.
		String str2 = "abc";
		String str3 = "abc";
		
		System.out.println(str1 == str2);
		System.out.println("---------------------");
		System.out.println(str2 == str3);
		System.out.println("---------------------");
		
		String str4 = new String("abc");
		String str5 = new String("abc");
		
		System.out.println(str4 == str5);
		System.out.println("---------------------");
		
		String str6 = "abc";
		String str7 = "abc";
				
		System.out.println(str6 == str7);
		System.out.println("---------------------");
		
		// ��� : �� �޸𸮴� ������ �� ���� �ٸ� �ּҰ��� ��������,
		// ��� Ǯ�� ������ ���ڿ��� ��� ���� �ּ� ���� ������.(���� ���ڿ��� ���)
		
	}// end of main 

}// end of class
