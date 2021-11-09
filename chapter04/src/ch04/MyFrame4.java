package ch04;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame4 extends JFrame {

	BufferedImage backgroundImage;
	BufferedImage imageIcon;
	BufferedImage imageIcon2;
	BufferedImage imageIcon3;

	MyImagePanel myImagePanel;

	// 생성자
	public MyFrame4() {
		initDate();
		setInitLayout();
	}

	// initData
	private void initDate() {
		setTitle("이미지 백그라운드 연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			backgroundImage = ImageIO.read(new File("background1.jpg"));
			imageIcon = ImageIO.read(new File("among1.png"));
			imageIcon2 = ImageIO.read(new File("among2.jpg"));
			imageIcon3 = ImageIO.read(new File("orange.jpg"));

		} catch (IOException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		}

		// myImagePanel 생성
		myImagePanel = new MyImagePanel();

	}

	// setInitLayout
	private void setInitLayout() {
		setVisible(true);
		add(myImagePanel);

	}

	private class MyImagePanel extends JPanel {

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			g.drawImage(backgroundImage, 0, 0, 500, 500, null);
			g.drawImage(imageIcon, 200, 200, 80, 80, null);
			g.drawImage(imageIcon2, 100, 100, 80, 80, null);
			g.drawImage(imageIcon3, 300, 300, 80, 80, null);

		}
	}

	// 메인함수
	public static void main(String[] args) {

		new MyFrame4();

	}

}
