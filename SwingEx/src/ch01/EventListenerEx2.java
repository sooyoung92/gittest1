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
		setTitle("이벤트 리스너 연습2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
//		button1 = new JButton("이벤트 버튼 1");
//		button2 = new JButton("이벤트 버튼 2");
//		button3 = new JButton("이벤트 버튼 3");
//		button4 = new JButton("이벤트 버튼 4");
//		button5 = new JButton("이벤트 버튼 5");

		for (int i = 0; i < button.length; i++) {
			button[i] = new JButton("이벤트 버튼" + i);
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
//		System.out.println("버튼이 눌러 졌습니다.");
		JButton clickedButton = (JButton) e.getSource();
		System.out.println(clickedButton.getText());

		// 문자열을 비교해서
		// 1번 버튼이 클릭 되었습니다.
		// 2번 버튼이 클릭 되었습니다.
//		if (clickedButton.getText().equals(button1.getText())) {
//			System.out.println("1번 버튼이 클릭 되었습니다.");
//		} else if (clickedButton.getText().equals(button2.getText())) {
//			System.out.println("2번 버튼이 클릭 되었습니다.");
//		} else if (clickedButton.getText().equals(button3.getText())) {
//			System.out.println("3번 버튼이 클릭 되었습니다.");
//		} else if (clickedButton.getText().equals(button4.getText())) {
//			System.out.println("4번 버튼이 클릭 되었습니다.");
//		} else {
//			System.out.println("5번 버튼이 클릭 되었습니다.");
//		}

		for (int j = 0; j < button.length; j++) {
			if (clickedButton.getText().equals(button[j].getText())) {
				System.out.println(j + "번째 버튼 입니다.");
			}
		}

	}

}

public class EventListenerEx2 {

	public static void main(String[] args) {
		new MyFrame2();

	}

}
