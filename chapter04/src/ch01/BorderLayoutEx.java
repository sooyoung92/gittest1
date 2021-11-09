package ch01;

import java.awt.BorderLayout;


import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame{

	BorderLayout  borderLayout;	
	JButton[] buttons = new JButton[5];
	String[] titles = {"��", "����", "��", "��", "��" };
	// directions ��� �迭�� ����� ���ÿ� �ʱ�ȭ
	
	String[] directions = {BorderLayout.NORTH,
			BorderLayout.CENTER,
			BorderLayout.SOUTH,
			BorderLayout.EAST,
			BorderLayout.WEST
			};
	
	
	public BorderLayoutEx(){
		initData();
		setInitLayout();
	}
	
	private void initData() {
		super.setTitle("BorderLayout ����");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(400,400);
		
		borderLayout = new BorderLayout();
		for (int i = 0; i <buttons.length; i ++) {
			buttons[i] = new JButton(titles[i]);
			// 0 <--(��), 1 <--(����)
		}
	}

	private void setInitLayout() {
		setVisible(true);
//		super.add(buttons[0], BorderLayout.NORTH);
//		super.add(buttons[1], BorderLayout.CENTER);
//		super.add(buttons[2], BorderLayout.SOUTH);
//		super.add(buttons[3], BorderLayout.EAST);
//		super.add(buttons[4], BorderLayout.WEST);
		//for������ ������ �ּ���
		for (int i = 0; i < buttons.length; i++) {
			// add JFrame
			super.add(buttons[i], directions[i]);
		}
		
	}
	
	
	public static void main(String[] args) {
		new BorderLayoutEx();
	}
	
}
