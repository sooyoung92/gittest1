package ch04;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame1 extends JFrame {

	MyPanel myPanel;

	// ������
	public MyFrame1() {
		initData();
		setInitLayout();

	}

	// �޼��� 2�� ����� �ּ���.
	private void initData() {
		setTitle("java 2D Test");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myPanel = new MyPanel();
	}

	private void setInitLayout() {
		setVisible(true);
		add(myPanel);
	}

	// ���� Ŭ����, static (���� ���� Ŭ����), (�ν��Ͻ�, ���� Ŭ����)
	static class MyPanel extends JPanel {

		@Override
		public void paint(Graphics g) {
			super.paint(g);

//			g.drawString("�ȳ��ϼ���", 10, 20);
//			g.drawLine(20, 30, 100, 100); // ���� �ߴ�, x��, y��
//			g.drawRect(100, 100, 150, 150);

			g.drawLine(150, 0, 50, 100);
			g.drawLine(150, 0, 250, 100);
			g.drawRect(50, 100, 200, 200);
			g.drawRect(70, 120, 50, 50);
			g.drawLine(95, 120, 95, 170);
			g.drawLine(70, 145, 120, 145);
			g.drawRect(175, 200, 50, 100);
			g.drawString("��", 180, 250);
			g.drawLine(0, 375, 50, 350);
			g.drawLine(50, 350, 275, 350);
			g.drawLine(275, 350, 500, 500);
			g.drawLine(500, 500, 500, 600);

		}

	}

	// �����Լ� �ۼ�
	public static void main(String[] args) {
		new MyFrame1();

	}

}
