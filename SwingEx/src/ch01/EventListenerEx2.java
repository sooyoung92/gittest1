package ch01;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame2 extends SupperMyFrame implements ActionListener {

//	JButton button1;
//	JButton button2;
//	JButton button3;
//	JButton button4;
//	JButton button5;

	JButton[] button = new JButton[5];

	public MyFrame2() {
		initData();
		setInitLayout();
		addEventListener();

	}

	@Override
	protected void initData() {
		setTitle("�̺�Ʈ ������ ����2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
//		button1 = new JButton("�̺�Ʈ ��ư 1");
//		button2 = new JButton("�̺�Ʈ ��ư 2");
//		button3 = new JButton("�̺�Ʈ ��ư 3");
//		button4 = new JButton("�̺�Ʈ ��ư 4");
//		button5 = new JButton("�̺�Ʈ ��ư 5");

		for (int i = 0; i < button.length; i++) {
			button[i] = new JButton("�̺�Ʈ ��ư" + i);
		}
	}

	@Override
	protected void setInitLayout() {
		setVisible(true);
		setLayout(new FlowLayout());
//		add(button1);
//		add(button2);
//		add(button3);
//		add(button4);
//		add(button5);

		for (int i = 0; i < button.length; i++) {
			add(button[i]);
		}
	}

	@Override
	protected void addEventListener() {
//		button1.addActionListener(this);
//		button2.addActionListener(this);
//		button3.addActionListener(this);
//		button4.addActionListener(this);
//		button5.addActionListener(this);

		for (int i = 0; i < button.length; i++) {
			button[i].addActionListener(this);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("��ư�� ���� �����ϴ�.");
		JButton clickedButton = (JButton) e.getSource();
		System.out.println(clickedButton.getText());

		// ���ڿ��� ���ؼ�
		// 1�� ��ư�� Ŭ�� �Ǿ����ϴ�.
		// 2�� ��ư�� Ŭ�� �Ǿ����ϴ�.
//		if (clickedButton.getText().equals(button1.getText())) {
//			System.out.println("1�� ��ư�� Ŭ�� �Ǿ����ϴ�.");
//		} else if (clickedButton.getText().equals(button2.getText())) {
//			System.out.println("2�� ��ư�� Ŭ�� �Ǿ����ϴ�.");
//		} else if (clickedButton.getText().equals(button3.getText())) {
//			System.out.println("3�� ��ư�� Ŭ�� �Ǿ����ϴ�.");
//		} else if (clickedButton.getText().equals(button4.getText())) {
//			System.out.println("4�� ��ư�� Ŭ�� �Ǿ����ϴ�.");
//		} else {
//			System.out.println("5�� ��ư�� Ŭ�� �Ǿ����ϴ�.");
//		}

		for (int j = 0; j < button.length; j++) {
			if (clickedButton.getText().equals(button[j].getText())) {
				System.out.println(j + "��° ��ư �Դϴ�.");
			}
		}

	}

}

public class EventListenerEx2 {

	public static void main(String[] args) {
		new MyFrame2();

	}

}
