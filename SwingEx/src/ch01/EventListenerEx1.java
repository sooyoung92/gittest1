package ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame1 extends JFrame implements ActionListener {
	JButton button;
	JButton button2;

	public MyFrame1() {
		initDate();
		setInitLayout();
		addEventListener();
	}

	private void initDate() {
		setTitle("이벤트 리스너 연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("button 1");
		button2 = new JButton("button 2");

	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(new FlowLayout());
		add(button);
		add(button2);

	}

	// 등록하기
	private void addEventListener() {
		button.addActionListener(this);
		button2.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("시스템 콜백 실행");
		System.out.println("버튼이 클릭 되었습니다.");
		System.out.println(e.toString());
		
	}

}

public class EventListenerEx1 {

	public static void main(String[] args) {
		new MyFrame1();

	}

}
