package ch04;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ImagePanel extends JPanel {

	private Image image;
	// 멤버변수 선언 이미지명을 받는 녀석

	public ImagePanel(String imageName) {
		image = new ImageIcon(imageName).getImage();
	}

	public ImagePanel() {
		image = new ImageIcon("img.png").getImage();

	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);

		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);

	}

}

//////////////////////////////////////////////////////////////////////////////////////////////////////

public class MyFrame3 extends JFrame {

	private ImagePanel imagePanel;
	private ImagePanel imagePanel2;

	public MyFrame3() {
		initDate();
		setInitLayout();

	}

	private void initDate() {
		setTitle("Jpanel에 이미지 넣기");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imagePanel = new ImagePanel();

		imagePanel2 = new ImagePanel("img.png");
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(new GridLayout(2, 1));
		add(imagePanel);

		add(imagePanel2);
	}

	public static void main(String[] args) {
		new MyFrame3();
	}

}// end of class
