package ch01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ColorChangeFrame extends SupperMyFrame implements ActionListener {

	BorderLayout borderLayout;
	JPanel panel1;
	JPanel panel2;
	JPanel panel3;
	JButton button1;
	JButton button2;
	JButton button3;

	public ColorChangeFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	@Override
	protected void initData() {
		super.initData();
		setTitle("�̺�Ʈ ������ ���� 3");
		setSize(500, 500);
		borderLayout = new BorderLayout();

		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();

		button1 = new JButton("������");
		button2 = new JButton("�����");
		button3 = new JButton("�Ķ���");

//		Color[] colors = new Color[5];

	}

	@Override
	protected void setInitLayout() {
		super.setInitLayout();
		setLayout(borderLayout);
		panel1.setBackground(Color.gray);
		panel1.setPreferredSize(new Dimension(500, 400));
		add(panel1, BorderLayout.NORTH);

		panel2.setBackground(Color.white);
		panel2.setLayout(new FlowLayout());
		panel2.setPreferredSize(new Dimension(500, 100));
		add(panel2);

		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
	}

	@Override
	protected void addEventListener() {
		super.addEventListener();
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// 1 ��ư�� ���� ������ panel1 ������ ���������� ����
		// 2 ��ư�� ���� ������ panel2 ������ ��������� ����
		JButton clickedButton = (JButton) e.getSource();
		System.out.println(clickedButton.getText());
		if (clickedButton.getText().equals(button1.getText())) {
			panel1.setBackground(Color.red);
		} else if (clickedButton.getText().equals(button2.getText())) {
			panel1.setBackground(Color.yellow);
		} else {
			panel1.setBackground(Color.blue);
		}
	}

	// �����Լ�
	public static void main(String[] args) {
		new ColorChangeFrame();
	}

}// end of class
