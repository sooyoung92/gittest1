package ch02;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame8 extends JFrame {

	BufferedImage backgroundImage;
	BufferedImage imageIcon1;
	MyImagePanel imagePanel;
	int xPoint = 200;
	int yPoint = 200;

	public MyFrame8() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("�̹��� ��׶��� ����2");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			backgroundImage = ImageIO.read(new File("background1.jpg"));
			imageIcon1 = ImageIO.read(new File("among1.png"));
		} catch (Exception e) {

			System.err.println("������ �����ϴ�.");
			System.exit(0);
		}

		imagePanel = new MyImagePanel();

	}

	private void setInitLayout() {
		this.setVisible(true);
		this.setResizable(false); // ũ�⸦ �� ���̰� ���´�.
		this.add(imagePanel);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {

//				// ���� ���
//				xPoint -= 10;
//				if (xPoint < -20 ) {
//					xPoint = -20;
//				System.out.println("xPoint : " + xPoint);
				// ���׿����� ����ؼ� �ڵ带 �ۼ����ּ���
				int keyCode = e.getKeyCode();
				if (keyCode == KeyEvent.VK_UP) {
//					yPoint -= 10;
					yPoint = (yPoint <= -10) ? -10 : (yPoint - 10);
					System.out.println(yPoint);
				} else if (keyCode == KeyEvent.VK_DOWN) {
					yPoint = (yPoint >= 392) ? 392 : (yPoint + 10);
				} else if (keyCode == KeyEvent.VK_LEFT) {
					xPoint = (xPoint <= -20) ? -20 : (xPoint - 10);
				} else if (keyCode == KeyEvent.VK_RIGHT) {
					xPoint = (xPoint >= 423) ? 423 : (xPoint + 10);
				}
				// ���� if���� switch��
				
				repaint();

			}// end of KeyPressed
		});
	}

	// ���� Ŭ����
	private class MyImagePanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundImage, 0, 0, 500, 500, null);
			g.drawImage(imageIcon1, xPoint, yPoint, 80, 80, null);

		}

	}

}// end of class
