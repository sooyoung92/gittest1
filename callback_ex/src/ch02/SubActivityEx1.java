package ch02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SubActivityEx1 extends JFrame implements ActionListener{
	
	JButton btnPlus;
	JButton btnMinus;
	JButton btnGob;
	
	CallBackBtn2 callBackBtn2;
	
	public SubActivityEx1(CallBackBtn2 callBackBtn2) {
		this.callBackBtn2 = callBackBtn2;
		
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.CENTER, 30, 30));
		btnPlus = new JButton("´õÇÏ±â");
		btnMinus = new JButton("»©±â");
		btnGob = new JButton("Á¦°öÇÏ±â");
		add(btnPlus);
		add(btnMinus);
		add(btnGob);
		
		btnPlus.addActionListener(this);
		btnMinus.addActionListener(this);
		btnGob.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton targetBtn = (JButton)e.getSource();
		
		if(targetBtn == btnPlus) {
			callBackBtn2.clickedPlus();
		}else if(targetBtn == btnMinus) {
			callBackBtn2.clickedMinus();
		}else {
			callBackBtn2.clickedgob();
			
		}
		
	}
	
	
	
	
	
}
