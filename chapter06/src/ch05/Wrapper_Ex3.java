package ch05;

public class Wrapper_Ex3 {

	public static void main(String[] args) {
		
		String str = "10";
		String str2 = "10.5";
		String str3 = "true";
		
		//  8 + "" --> String
		byte b = Byte.parseByte(str);
		int i = Integer.parseInt(str);
		short s = Short.parseShort(str);
		long l = Long.parseLong(str);
		
		//
		float f = Float.parseFloat(str2);
		double d = Double.parseDouble(str2);
		
		boolean bool = Boolean.parseBoolean(str3);
		System.out.println(bool);
		if(Boolean.parseBoolean(str3)) {
			System.out.println("boolean ������ ���� �Ϸ�!!!");
		}
		
		// ���� 1 
		String str10 = "1001";
		String str11 = "2001";
		
		// str10 �� str11 �� ���� ����
		// ��������� ���
		// str10 �� str11 �� ���� ����
		// ��������� ���
		int a = Integer.parseInt(str10);
		int c = Integer.parseInt(str11);
		int plus = a + c;
		int gop = a * c;
		System.out.println("�� String�� �� : " + plus);
		System.out.println("�� String�� �� : " + gop);
		
		
		
		
		
		System.out.println("���ڿ� byte�� ��ȭ : " + b);
		System.out.println("���ڿ� int�� ��ȭ : " + i);
		
		System.out.println(b);
	}

}
