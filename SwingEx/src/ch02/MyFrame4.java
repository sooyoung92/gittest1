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
//	// 코드 수정
//	// 1. button2 생성
//	// 2. add
//	// 3. 이벤트 리스너 등록 -- > 익명 구현 객체를 사용해서 처리
//	// 4. 실행 확인
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
//		setTitle("익명구현객체사용해보기");
//		setSize(500, 500);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		button = new JButton("이벤트 등록 후 대기");
//		button2 = new JButton("이벤트 등록 후 대기");
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
//	// 익명 구현 객체
//	// 일회성의 인터페이스를 익명 구현 객체로 만들어 사용할 수 있다.
//		private void addEventListener() {
//		
//			button.addActionListener(new ActionEvent e){
//				System.out.println("버튼이 틀릭 되었습니다.");
//			}
//		}
//		
////		button.addActionListener(new ActionListener() {
////			
////			//추상 메서드를 일반 메서드로 구현 했다.
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
