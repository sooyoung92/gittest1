package ch02;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainActivityEx1 extends JFrame implements CallBackBtn2{

	int count;
	JLabel label;
	
	public MainActivityEx1(){
		count = 0;
		label = new JLabel(count + "");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new FlowLayout());
		add(label);
		
	}

	@Override
	public void clickedPlus() {
		count++;
		label.setText(count + "");
	}

	@Override
	public void clickedMinus() {
		count--;
		label.setText(count + "");
		
	}

	@Override
	public void clickedgob() {
		this.count *= count;
		label.setText(count + "");
		
	}
	
	
	
	
}
