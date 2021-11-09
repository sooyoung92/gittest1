package ch01;

import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame2 extends JFrame {

//	private JButton button1;
//	private JButton button2;
//	private JButton button3;
//	private JButton button4;
//	private JButton button5;
//	private JButton button6;
	// �迭�� ����ؼ� �������ּ���.
//	private JButton[] buttons = new JButton[6];
	// ArrayList�� ������ �ּ���.
	// ���� �ذ�ɷ� C R U D ----> ���Ҿ��������
	// 1. �������
	ArrayList<JButton> buttons = new ArrayList<JButton>();

	// 2. �߰��ϴ� ���
	// 3. ���� ����ϴ� ���

	public MyFrame2() {
		initDate();
		setInitLayout();
	}

	private void initDate() {
		setTitle("Flow Layout ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLayout(new FlowLayout(FlowLayout.LEFT, 1, 10));
		
	
		// �迭�� ����ϴ� ���
//		buttons[0] = new JButton("1��° ��ư");
//		buttons[1] = new JButton("2��° ��ư");
//		buttons[2] = new JButton("3��° ��ư");
//		buttons[3] = new JButton("4��° ��ư");
//		buttons[4] = new JButton("5��° ��ư");
//		buttons[5] = new JButton("6���� ��ư");
		// for�� ����
//		int i = 0;
//		for (i = 0; i < 7; i++) {
//			buttons[i] = new JButton(i + "��° ��ư");
//		}
	
		
		
		// ArrayList�� ����ϴ� ���
//		buttons.add(new JButton("1��° ��ư"));
//		buttons.add(new JButton("2��° ��ư"));
//		buttons.add(new JButton("3��° ��ư"));
//		buttons.add(new JButton("4��° ��ư"));
//		buttons.add(new JButton("5��° ��ư"));
//		buttons.add(new JButton("6��° ��ư"));
		// for�� ����
		// ArrayList�� ó�� ����� 0 �Դϴ�.
//		for (int i = 0; i < 6; i++) {
//			System.out.println("i" + i);
//			buttons.add(new JButton((i+1) +"��° ��ư"));
		}

	private void setInitLayout() {
		setVisible(true);
//		add(buttons[0]);
//		add(buttons[1]);
//		add(buttons[2]);
//		add(buttons[3]);
//		add(buttons[4]);
//		add(buttons[5]);
		// for�� ����
//		int i = 0;
//		for (i = 0; i < 7; i++) {
//			add(buttons[i]);
//		}

		add(buttons.get(1));
		add(buttons.get(2));
		add(buttons.get(3));
		add(buttons.get(4));
		add(buttons.get(5));
		add(buttons.get(6));
		// for�� ����
		for (int i = 0; i < buttons.size(); i++) {
			add(buttons.get(i));
		}

	}// end of setInitLayout

}// end of MyFrame2

public class FlowLayoutEx {

	public static void main(String[] args) {
		new MyFrame2();
	}

}
