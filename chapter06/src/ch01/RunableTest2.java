package ch01;

import javax.swing.JFrame;

class MyRunnable2 extends JFrame {

	int grade = 10;

	public MyRunnable2() {
//		runable.run();  <-- 1��
	}

	// �ڹ� ����
	// ���� ��ü
	Runnable runable = new Runnable() {

		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {

				System.out.print("--");

				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			} // end of for

		}// end of run
	};

}

public class RunableTest2 {

	public static void main(String[] args) {

		MyRunnable2 myRunnable2 = new MyRunnable2();
		// ���� 1. ��ü ������ ���ÿ� run �޼��带 ���� ���� �ּ���.

		// ���� 2. �ܺο��� run �޼��� ���� ���� �ּ���.
		myRunnable2.runable.run();

	}

}// end of class
