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
	// 배열을 사용해서 변경해주세요.
//	private JButton[] buttons = new JButton[6];
	// ArrayList로 변경해 주세요.
	// 문제 해결능력 C R U D ----> 분할앤정복방식
	// 1. 생성방법
	ArrayList<JButton> buttons = new ArrayList<JButton>();

	// 2. 추가하는 방법
	// 3. 값을 출력하는 방법

	public MyFrame2() {
		initDate();
		setInitLayout();
	}

	private void initDate() {
		setTitle("Flow Layout 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLayout(new FlowLayout(FlowLayout.LEFT, 1, 10));
		
	
		// 배열을 사용하는 방법
//		buttons[0] = new JButton("1번째 버튼");
//		buttons[1] = new JButton("2번째 버튼");
//		buttons[2] = new JButton("3번째 버튼");
//		buttons[3] = new JButton("4번째 버튼");
//		buttons[4] = new JButton("5번째 버튼");
//		buttons[5] = new JButton("6번쨰 버튼");
		// for문 변경
//		int i = 0;
//		for (i = 0; i < 7; i++) {
//			buttons[i] = new JButton(i + "번째 버튼");
//		}
	
		
		
		// ArrayList를 사용하는 방법
//		buttons.add(new JButton("1번째 버튼"));
//		buttons.add(new JButton("2번째 버튼"));
//		buttons.add(new JButton("3번째 버튼"));
//		buttons.add(new JButton("4번째 버튼"));
//		buttons.add(new JButton("5번째 버튼"));
//		buttons.add(new JButton("6번째 버튼"));
		// for문 변경
		// ArrayList는 처음 사이즈가 0 입니다.
//		for (int i = 0; i < 6; i++) {
//			System.out.println("i" + i);
//			buttons.add(new JButton((i+1) +"번째 버튼"));
		}

	private void setInitLayout() {
		setVisible(true);
//		add(buttons[0]);
//		add(buttons[1]);
//		add(buttons[2]);
//		add(buttons[3]);
//		add(buttons[4]);
//		add(buttons[5]);
		// for문 변경
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
		// for문 변경
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
