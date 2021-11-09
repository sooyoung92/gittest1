package ch01;

// import.java.lang.*; �� ���ԵǾ��־
class MyThreadEx2 extends Thread {

	String name;

	public MyThreadEx2(String name) {
		this.name = name;
	}

	// ���
	@Override
	public void run() {
		int i;
		for (i = 0; i < 50; i++) {

			System.out.println(name + " : " + i + "\t");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}// end of MyThreadEx2

public class ThreadTest2 {

	// ���� ������
	public static void main(String[] args) {

		System.out.println(Thread.currentThread());
		System.out.println("���� ������ ����");

		MyThreadEx2 th1 = new MyThreadEx2("�۾���1");
		th1.start(); // <-- �����忡 �۾��� �����ϴ� ��ɾ��Դϴ�.

//		for (int i = 0; i < 50; i++) {
//			System.out.println("test : " + i);
//
//			try {
//				Thread.sleep(200);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}

		MyThreadEx2 th2 = new MyThreadEx2("�۾���2");
		th2.start();
		
		MyThreadEx2 th3 = new MyThreadEx2("�۾���3");
		th3.start();
		// �������� �켱������ �����ڰ� ������ ��û�� �� �ִ�. (0~10)
		
		
		System.out.println("���� ������ ����");

	}// end of main

}// end of class
