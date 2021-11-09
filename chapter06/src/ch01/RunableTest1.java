package ch01;

import javax.swing.JFrame;

// ����� �ϳ��� �ϳ��� ��� ������
// Runnable �������̽��� �����Ͽ� �����带 ����ϸ� �ȴ�.
class MyRunnable1 extends JFrame implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.print(i + "\t");
		}
	}

}

public class RunableTest1 {

	// ���� ������
	public static void main(String[] args) {

		MyRunnable1 myRunnable1 = new MyRunnable1();

		// Runnable ������ ��ü�� Thread�� �����ؼ� �Ű� ������ ��� �����带 �����Ѵ�.
		// �۾��� 1
		Thread thread1 = new Thread(myRunnable1);
		thread1.start();

		Thread thread2 = new Thread(myRunnable1);
		thread2.start();
	}

}
