package ch03;

import ch02.Plastic;
import ch02.Powder;

public class GenericPrinterTest {

	public static void main(String[] args) {

		// ���
		Powder powder = new Powder();
		Plastic plastic = new Plastic();

		// ����� �� �ڷ����� �־� �ָ� �ȴ�. !!!
		// ����� : T ��ſ� ����� �� � �ڷ����� ������� ������ �ָ� �ȴ�.
		GenericPrinter<Powder> genericPrinter1 = new GenericPrinter<Powder>();

		// ��� �ֱ�
		genericPrinter1.setMaterial(powder);

		// ��� ������
		Powder tempPowder = genericPrinter1.getmaterial();
		System.out.println(tempPowder);

		System.out.println("-------------------------------");

		// ���� 1. �ö�ƽ���� ���׸� Ŭ������ �����ϰ� ��� ���� �� ��Ḧ ���� ���ϴ�.
		GenericPrinter<Plastic> genericPrinter2 = new GenericPrinter<Plastic>();
		genericPrinter2.setMaterial(plastic);
		Plastic Plastic2 = genericPrinter2.getmaterial();
		System.out.println(Plastic2);

		System.out.println("-------------------------------");

		// Genericprinter toString();
		System.out.println(genericPrinter1);
		System.out.println(genericPrinter2);

	}

}
