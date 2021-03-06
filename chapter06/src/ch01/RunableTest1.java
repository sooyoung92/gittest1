package ch01;

import javax.swing.JFrame;

// 상속은 하나에 하나만 상속 하지만
// Runnable 인터페이스를 구현하여 쓰레드를 사용하면 된다.
class MyRunnable1 extends JFrame implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.print(i + "\t");
		}
	}

}

public class RunableTest1 {

	// 메인 쓰레드
	public static void main(String[] args) {

		MyRunnable1 myRunnable1 = new MyRunnable1();

		// Runnable 구현한 객체는 Thread를 생성해서 매개 변수에 담고 쓰레드를 시작한다.
		// 작업자 1
		Thread thread1 = new Thread(myRunnable1);
		thread1.start();

		Thread thread2 = new Thread(myRunnable1);
		thread2.start();
	}

}
