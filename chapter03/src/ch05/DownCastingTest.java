package ch05;

public class DownCastingTest {
	
	public static void main(String[] args) {
			
		// 1.  �ٳ��� origin ��� ������ �߰�.
		
		Fruit fruit = new Banana();
//		fruit.origin; <-- origin �� ã���� ����.
		// �����Ϸ��� �θ�Ÿ�� �ν��Ͻ� ���� Ÿ���� 
		// �ٶ󺸰� �ִ� ����
		
		// �ٿ� ĳ������ ����Ѵٸ� ����
		// (�����Ϸ����� �ڽ� ��ü Ÿ������ �ٶ� ����� ���)
		String origin = ((Banana)fruit).origin;
		System.out.println("������ : " + origin);
		
		// ������ Ÿ��
		
		// ��Ÿ��
		
		
		
		
	} // end of main
}// end of class
