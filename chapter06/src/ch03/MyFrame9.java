package ch03;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame9 extends JFrame{
	
	BufferedImage backgroundImage;
	BufferedImage imageIcon1;
	BufferedImage imageIcon2;
	MyImagePanel imagePanel;
	int xPoint = 100;
	int yPoint = 250;
	BorderLayout borderLayout1;
	JButton button1;
	JButton button2;
	
	public MyFrame9() {
		initData();
		setInitLayout();
		addEventlestener();
	}
	
	private void initData() {
		setTitle("연습");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try {
			backgroundImage = ImageIO.read(new File("포트리스.jpg"));
			imageIcon1 = ImageIO.read(new File("캐논.png"));
			imageIcon2 = ImageIO.read(new File("among1-.png"));
		} catch (Exception e) {
			System.err.println("파일이 없습니다.");
			System.exit(0);
		}
		
		imagePanel = new MyImagePanel();
		borderLayout1 = new BorderLayout();
		button1 = new JButton("캐논");
		button2 = new JButton("어몽");
		
	}
	
	private void setInitLayout() {
		setVisible(true);
		this.setResizable(false);
		this.add(imagePanel);
		
		
		
	}
	
	private void addEventlestener() {
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				if (keyCode == KeyEvent.VK_UP) {
					yPoint = (yPoint <= -10) ? -10 : (yPoint - 10);
				} else if (keyCode == KeyEvent.VK_DOWN) {
					yPoint = (yPoint >= 392) ? 392 : (yPoint + 10);
				} else if (keyCode == KeyEvent.VK_LEFT) {
					xPoint = (xPoint <= -20) ? -20 : (xPoint - 10);
				} else if (keyCode == KeyEvent.VK_RIGHT) {
					xPoint = (xPoint >= 423) ? 423 : (xPoint + 10);
				}
				
				repaint();
			}
						
		});
		
	}
	
	
private class MyImagePanel extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(backgroundImage, 0, 0, 500, 500, null);
		g.drawImage(imageIcon1, xPoint, yPoint, 80, 80, null);
		g.drawImage(imageIcon2, 300, 250, 100, 100, null);

		}
	}


public static void main(String[] args) {
	new MyFrame9();
}

}