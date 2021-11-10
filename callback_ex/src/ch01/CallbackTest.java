package ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// 인터페이스를 선언한다.
interface CallbackBtnAction {

	public abstract void clickedAddBtn();
	
	public void clickedMinusBtn();
	
	// 매개변수로 값 전달 가능
	public void passValue(int value);
	
	
	//메서드 3개 추가 생성
	public void clickedTwoAddBtn();
	public void clickedTwoMinusBtn();
	public void clickedTwoGobBtn();
	
	
}// end of interface

// 콜백 받는 객체 : CallbackBtnAction 인터페이스를 구현해서 메서드를 정의 한다.
class MainActivity extends JFrame implements CallbackBtnAction {

	int count;
	JLabel label;

	public MainActivity() {
		count = 0;
		label = new JLabel(count + "");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new FlowLayout());
		add(label);

	}

	@Override
	public void clickedAddBtn() {
		// 콜백되어지는 메서드 :
		System.out.println(this.getClass().getName() + "이 콜백 받았습니다.");
		count++;
		label.setText(count + "");
	}

	@Override
	public void clickedMinusBtn() {
		System.out.println("마이너스 콜백 받았습니다.");
		count--;
		label.setText(count + "");
	}

	@Override
	public void clickedTwoAddBtn() {
		System.out.println("2더하기 콜백 받았습니다.");
		count += 2;
		label.setText(count + "");
	}

	@Override
	public void clickedTwoMinusBtn() {
		System.out.println("2빼기 콜백 받았습니다.");
		count -= 2;
		label.setText(count + "");
	}

	@Override
	public void clickedTwoGobBtn() {
		System.out.println("2곱하기 콜백 받았습니다.");
		count *= 2 ;
		label.setText(count + "");
	}

	@Override
	public void passValue(int value) {
		value = count;
		System.out.println("value 값을 전달 받음: " + value);
		label.setText(value + "");
	}

}// end of mainActivity

// 콜리 (호출자) : 콜백 받는 객체의 주소값을 알고 있어야 메서드가 호출 되었다고 알릴 수 있다.
class SubActivity extends JFrame implements ActionListener {

	JButton btnAdd;
	JButton btnMinus;
	// 문제 1. 버튼 3개 생성
	JButton btnTwoAdd;
	JButton btnTwoMinus;
	JButton btnTwoGob;
	//
	JButton btnPassValue;
	
	
	// 1. 멤버 변수로 선을을 해 준다.
	CallbackBtnAction callbackBtnAction;

	public SubActivity(CallbackBtnAction callbackBtnAction) {
		// 중요 !!!
		this.callbackBtnAction = callbackBtnAction;

		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnAdd = new JButton("더하기 버튼");
		btnMinus = new JButton("빼기 버튼");
		btnTwoAdd = new JButton("2더하기 버튼");
		btnTwoMinus = new JButton("2빼기 버튼");
		btnTwoGob = new JButton("곱하기 버튼");
		btnPassValue = new JButton("값전달 버튼");
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
		add(btnAdd);
		add(btnMinus);
		add(btnTwoAdd);
		add(btnTwoMinus);
		add(btnTwoGob);
		add(btnPassValue);
		
		btnAdd.addActionListener(this);
		btnMinus.addActionListener(this);
		btnTwoAdd.addActionListener(this);
		btnTwoMinus.addActionListener(this);
		btnTwoGob.addActionListener(this);
		btnPassValue.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// 1. 버튼 구분
		JButton targetBtn = (JButton)e.getSource();
		
		if(targetBtn == btnAdd) {
			// 더하기 버튼
			callbackBtnAction.clickedAddBtn();
		} else if(targetBtn == btnMinus) {
			// 빼기 버튼
			callbackBtnAction.clickedMinusBtn();
		} else if(targetBtn == btnTwoAdd) {
			// 2더하기 버튼
			callbackBtnAction.clickedTwoAddBtn();
		} else if(targetBtn == btnTwoMinus) {
			// 2빼기 버튼
			callbackBtnAction.clickedTwoMinusBtn();
		}else  if (targetBtn ==  btnTwoGob)
			// 2곱하기 버튼
			callbackBtnAction.clickedTwoGobBtn();
		}
//		}else {
//			callbackBtnAction.passValue(100);
//		}
		
		
	

}

public class CallbackTest {

	public static void main(String[] args) {

		MainActivity mainActivity = new MainActivity();
		new SubActivity(mainActivity);

	}

}
