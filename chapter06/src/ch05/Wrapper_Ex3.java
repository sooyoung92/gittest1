package ch05;

public class Wrapper_Ex3 {

	public static void main(String[] args) {

		String str = "10";
		String str2 = "10.5";
		String str3 = "true";

		// 8 + "" --> String
		byte b = Byte.parseByte(str);
		int i = Integer.parseInt(str);
		short s = Short.parseShort(str);
		long l = Long.parseLong(str);
		System.out.println("문자열 byte값 변환 : " + b);
		System.out.println("문자열 int값 변환 : " + i);
		System.out.println("--------------------------");
		//
		float f = Float.parseFloat(str2);
		double d = Double.parseDouble(str2);

		boolean bool = Boolean.parseBoolean(str3);
		System.out.println(bool);
		if (Boolean.parseBoolean(str3)) {
			System.out.println("boolean 형으로 변경 완료!!!");
		}
		System.out.println("--------------------------");

		//
		String str10 = "1001";
		String str11 = "2001";

		// str10 과 str11 합
		// str10 과 str11 곱
		// 결과를
		int a = Integer.parseInt(str10);
		int c = Integer.parseInt(str11);
		int plus = a + c;
		int gop = a * c;
		System.out.println("두 String값의 합 : " + plus);
		System.out.println("두 String값의 곱 : " + gop);

		System.out.println("--------------------------");

	}

}
