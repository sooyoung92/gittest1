package ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// �������̽��� �����Ѵ�.
interface CallbackBtnAction {

	public abstract void clickedAddBtn();
	
	public void clickedMinusBtn();
	
	// �Ű������� �� ���� ����
	public void passValue(int value);
	
	
	//�޼��� 3�� �߰� ����
	public void clickedTwoAddBtn();
	public void clickedTwoMinusBtn();
	public void clickedTwoGobBtn();
	
	
}// end of interface

// �ݹ� �޴� ��ü : CallbackBtnAction �������̽��� �����ؼ� �޼��带 ���� �Ѵ�.
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
		// �ݹ�Ǿ����� �޼��� :
		System.out.println(this.getClass().getName() + "�� �ݹ� �޾ҽ��ϴ�.");
		count++;
		label.setText(count + "");
	}

	@Override
	public void clickedMinusBtn() {
		System.out.println("���̳ʽ� �ݹ� �޾ҽ��ϴ�.");
		count--;
		label.setText(count + "");
	}

	@Override
	public void clickedTwoAddBtn() {
		System.out.println("2���ϱ� �ݹ� �޾ҽ��ϴ�.");
		count += 2;
		label.setText(count + "");
	}

	@Override
	public void clickedTwoMinusBtn() {
		System.out.println("2���� �ݹ� �޾ҽ��ϴ�.");
		count -= 2;
		label.setText(count + "");
	}

	@Override
	public void clickedTwoGobBtn() {
		System.out.println("2���ϱ� �ݹ� �޾ҽ��ϴ�.");
		count *= 2 ;
		label.setText(count + "");
	}

	@Override
	public void passValue(int value) {
		value = count;
		System.out.println("value ���� ���� ����: " + value);
		label.setText(value + "");
	}

}// end of mainActivity

// �ݸ� (ȣ����) : �ݹ� �޴� ��ü�� �ּҰ��� �˰� �־�� �޼��尡 ȣ�� �Ǿ��ٰ� �˸� �� �ִ�.
class SubActivity extends JFrame implements ActionListener {

	JButton btnAdd;
	JButton btnMinus;
	// ���� 1. ��ư 3�� ����
	JButton btnTwoAdd;
	JButton btnTwoMinus;
	JButton btnTwoGob;
	//
	JButton btnPassValue;
	
	
	// 1. ��� ������ ������ �� �ش�.
	CallbackBtnAction callbackBtnAction;

	public SubActivity(CallbackBtnAction callbackBtnAction) {
		// �߿� !!!
		this.callbackBtnAction = callbackBtnAction;

		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnAdd = new JButton("���ϱ� ��ư");
		btnMinus = new JButton("���� ��ư");
		btnTwoAdd = new JButton("2���ϱ� ��ư");
		btnTwoMinus = new JButton("2���� ��ư");
		btnTwoGob = new JButton("���ϱ� ��ư");
		btnPassValue = new JButton("������ ��ư");
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

		// 1. ��ư ����
		JButton targetBtn = (JButton)e.getSource();
		
		if(targetBtn == btnAdd) {
			// ���ϱ� ��ư
			callbackBtnAction.clickedAddBtn();
		} else if(targetBtn == btnMinus) {
			// ���� ��ư
			callbackBtnAction.clickedMinusBtn();
		} else if(targetBtn == btnTwoAdd) {
			// 2���ϱ� ��ư
			callbackBtnAction.clickedTwoAddBtn();
		} else if(targetBtn == btnTwoMinus) {
			// 2���� ��ư
			callbackBtnAction.clickedTwoMinusBtn();
		}else  if (targetBtn ==  btnTwoGob)
			// 2���ϱ� ��ư
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
