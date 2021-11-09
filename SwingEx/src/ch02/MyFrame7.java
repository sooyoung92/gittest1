package ch02;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyFrame7 extends JFrame implements KeyListener{
	
	JTextArea area;
	
	public MyFrame7() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("Ű �̺�Ʈ ����");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		area = new JTextArea();
	}
	
	private void setInitLayout() {
		setVisible(true);
		this.add(area);
	}
	
	private void addEventListener() {
//		area.addKeyListener(this);
		area.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					area.append( " ���� \n");
				}else if(e.getKeyCode() == KeyEvent.VK_UP) {
					area.append(" ���� \n");
				}else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					area.append(" ������ \n");
				}else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
					area.append(" �Ʒ��� \n");
				}
			}
		});
	
	}
	
	// ���ڸ� ������ �� ȣ��, ����Ű���� ���� �Ѵ�.
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		e.getID();
//		System.out.println("keyTyped : " +e.getID());
	}
	
	// Ű���带 ������ �� ȣ��, ��� Ű���忡 �����մϴ�.
	@Override
	public void keyPressed(KeyEvent e) {
//		System.out.println("keyPressed : " +e.getID());
//		e.getKeyCode();
//		System.out.println(e.getKeyCode());
//		area.setText(e.getKeyCode() + "");  < -- ���������.
//		area.append(e.getKeyCode() + ""); 
		// ���� ����Ű 38
		// �Ʒ��� ����Ű 39
		// ���� ����Ű 37
		// ������ ����Ű 40
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			area.append( " ���� \n");
		}else if(e.getKeyCode() == KeyEvent.VK_UP) {
			area.append(" ���� \n");
		}else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			area.append(" ������ \n");
		}else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			area.append(" �Ʒ��� \n");
		}
	}
	
	// Ű���带 ���� �� ȣ��, ��� Ű���忡 �����մϴ�.
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("keyReleased : " +e.getID());
	}
	
}
