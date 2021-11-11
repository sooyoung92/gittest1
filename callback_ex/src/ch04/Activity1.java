package ch04;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Activity1 extends JFrame {
	
	String name;
	JPanel panel;
	
	// �������̽��� --> �͸� ���� ��ü �������� ����� �� �ִ�.
	CallbackCheckPosition callbackCheckPosition = new CallbackCheckPosition() {
		@Override
		public void checkPosition(int x, int y) {
			System.out.println(name + " �ݹ� ���� �� x : " + x);
			System.out.println(name + " �ݹ� ���� �� y : " + y);
			
		}
	};
	
public Activity1(String name) {
	this.name = name;
	setTitle(name);
	setSize(500,500);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	panel = new JPanel();
	setVisible(true);
	add(panel);
	panel.setBackground(Color.blue);
	
	
}	
	
	
	
	
}
