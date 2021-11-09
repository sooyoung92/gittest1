package ch02;

public class FunctionMainTest2 {

	public static void main(String[] args) {
		
		// �Լ� ����ϴ� ��� (��� ���߱�)
		int num1 = 10;
		int num2 = 20;
		
		double total = addNum(42.123, 10.5);
		System.out.println("total : " + total);
		
		sayHello("�ݰ����ϴ� 12345");
		
		int sum = calcSum();
		System.out.println("sum : " + sum);
		
		System.out.println("=======���� ����========");
		// �Լ� ����غ��� 4, 5, 6
		//4
		int result1 = intAdd(11, 22, 33);
		System.out.println("result1 : " + result1);
		//5
		double result2 = doubleAdd(11.11, 333.333);
		System.out.println("result2 : " + result2);
		//6
		printArticle("��");
		

	}// end of main

	
	
	// 1. ��ȯ ���� ���� �Լ� �����ϱ�
	public static void sayHello(String greeting) {
		System.out.println(greeting);		
	}
	
	// 2. �Ű� ������ ���� �Լ� ����� --> ��ȯ�� ����.
	public static int calcSum() {
		int sum = 0;
		int i;
		for(i = 0; i < 101; i++) {
//			sum = sum + i;
			sum += i;
		}
		return sum;
	}
	
	// 3. ��ȯ���� �ְ� �Ű������� �޴� �Լ� �����.
	
	public static double addNum(double n1, double n2) {
		double result = 0.0; //���������� �ʱⰪ�� ����������Ѵ�.
		result = n1 + n2;
		return result;
	}
	
	// �Լ��� ����� ���ô�.
	
	// 4. ���ϰ� int , �Ű����� n1, n2, n3, �̸� --> intAdd
	
	public static int intAdd(int n1, int n2, int n3) {
		int result;
		result =  n1 + n2 + n3;
		return result;
		//return  n1 + n2 + n3; ���� ���̱� ����.
	}
	
	// 5. ���ϰ� double �Ű����� d1, d2 �̸��� --> doubleAdd
	
	public static double doubleAdd(double d1, double d2) {
		double result = d1 + d2 ;  
		return result;
	}
	
	// 6. ���ϰ� ����, �Ű����� String article �̸��� --> printArticle
	
	public static void printArticle(String article) {
		System.out.println(article);
	}
		
		
}// end of class
