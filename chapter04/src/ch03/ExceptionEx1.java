package ch03;

public class ExceptionEx1 {

	public static void main(String[] args) {

		// ���ܸ� �߻����� ����.

		int[] arr = { 1, 2, 3, 4, 5 };

//		for (int i = 0; i < 10; i++) {
//			System.out.println(arr[i]);
//		}

		try {
			// ���ܰ� �߻��� �ڵ带 try���� �ۼ��� �Ѵ�.
			for (int i = 0; i < 10; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("���ܰ� �߻� ��!!!");
		}

		System.out.println("������ ������� �ʾҽ��ϴ�.");

		// ���α׷����� ������� �ʰ� ��� ����Ǿ� ����. !!!

	}

}
