package ch02;

public class MainTest1 {

	public static void main(String[] args) {

		// ���
		Powder powder = new Powder();
		Plastic plastic = new Plastic();

		// 1 ThreeDPrinter1 -> ��ü ����
		// setter �޼��� ��� �Ҷ� Powder
		ThreeDPrinter1 printer1 = new ThreeDPrinter1();
		printer1.setMaterial(powder);
		System.out.println(printer1.getMaterial());

		System.out.println("-----------------------");

		ThreeDPrinter2 printer2 = new ThreeDPrinter2();
		printer2.setMatrial(plastic);
		System.out.println(printer2.getMaterial());

		System.out.println("-----------------------");

		ThreeDPrinter3 printer3 = new ThreeDPrinter3();
		// 1. ������
		printer3.setMaterial(powder);

		// �ڷḦ ���� ������.
		System.out.println(printer3.getMaterial());

		// ��û : Powder Ÿ�� ������ ThreeDPrinter3�� ��Ḧ ������ �ּ���.
		// ������ : temp1
		Powder temp1 = (Powder) printer3.getMaterial();

		// ����
		System.out.println(printer3);

	}// end of main

}// end
