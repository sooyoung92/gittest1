package ch11;

public class StringBuiderTest {

	public static void main(String[] args) {
		
		// StringBuilder, StringBuffer Ȱ��
		// ���������� �������� char[]�� ��������� ����.
		// ���ڿ��� ������ �����ϰų� ������ �� ����ϸ� �����ϴ�.
		// StringBuffer �� ��Ƽ ������ ���α׷��ֿ��� ����ȭ�� ����
		// ���� ������ ���α׷������� StringBuilder ����ϱ⸦ ����.
		
		
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
		// ���� 1 append �޼��� ����ؼ� 3��
		
		builder.append("�ڹ�");
		builder.append("�ȵ���̵�");
		builder.append("JA");
		System.out.println(builder);
		System.out.println("------------------------");
		
		// ����2
//		String tempStr = builder; <--- ���� ����.
		String tempStr = builder.toString();
		System.out.println(tempStr);
		
		
		

	}

}
