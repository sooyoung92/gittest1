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
		setTitle("키 이벤트 연습");
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
					area.append( " 왼쪽 \n");
				}else if(e.getKeyCode() == KeyEvent.VK_UP) {
					area.append(" 위쪽 \n");
				}else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					area.append(" 오른쪽 \n");
				}else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
					area.append(" 아래쪽 \n");
				}
			}
		});
	
	}
	
	// 문자를 눌렀을 때 호출, 문자키에만 반응 한다.
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		e.getID();
//		System.out.println("keyTyped : " +e.getID());
	}
	
	// 키보드를 눌렀을 때 호출, 모든 키보드에 반응합니다.
	@Override
	public void keyPressed(KeyEvent e) {
//		System.out.println("keyPressed : " +e.getID());
//		e.getKeyCode();
//		System.out.println(e.getKeyCode());
//		area.setText(e.getKeyCode() + "");  < -- 덮어써진다.
//		area.append(e.getKeyCode() + ""); 
		// 위쪽 방향키 38
		// 아래쪽 방향키 39
		// 왼쪽 방향키 37
		// 오른쪽 방향키 40
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			area.append( " 왼쪽 \n");
		}else if(e.getKeyCode() == KeyEvent.VK_UP) {
			area.append(" 위쪽 \n");
		}else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			area.append(" 오른쪽 \n");
		}else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			area.append(" 아래쪽 \n");
		}
	}
	
	// 키보드를 뗐을 때 호출, 모든 키보드에 반응합니다.
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("keyReleased : " +e.getID());
	}
	
}
