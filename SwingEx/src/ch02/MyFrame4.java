//package ch02;
//
//import java.awt.*;
//
//import javax.swing.Action;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//
//
//public class MyFrame4 extends JFrame {
//
//	JButton button;
//	JButton button2;
//	// �ڵ� ����
//	// 1. button2 ����
//	// 2. add
//	// 3. �̺�Ʈ ������ ��� -- > �͸� ���� ��ü�� ����ؼ� ó��
//	// 4. ���� Ȯ��
//	
//	
//	
//	public MyFrame4() {
//		initDate();
//		setInitLayout();
//		addEventListener();
//
//	}
//
//	private void initDate() {
//		setTitle("�͸�����ü����غ���");
//		setSize(500, 500);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		button = new JButton("�̺�Ʈ ��� �� ���");
//		button2 = new JButton("�̺�Ʈ ��� �� ���");
//
//	}
//
//	private void setInitLayout() {
//		setVisible(true);
//		add(button);
//		add(button2);
//		
//	}
//	
//	// �͸� ���� ��ü
//	// ��ȸ���� �������̽��� �͸� ���� ��ü�� ����� ����� �� �ִ�.
//		private void addEventListener() {
//		
//			button.addActionListener(new ActionEvent e){
//				System.out.println("��ư�� Ʋ�� �Ǿ����ϴ�.");
//			}
//		}
//		
////		button.addActionListener(new ActionListener() {
////			
////			//�߻� �޼��带 �Ϲ� �޼���� ���� �ߴ�.
////			public void actionPerformed(ActionEvent e) {
////				
////			}
////		});
//		public static void main(String[] args) {
//			
//			new MyFrame4();
//			
//		}
//		
//	
//
//}
