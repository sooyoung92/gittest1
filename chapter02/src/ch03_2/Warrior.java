package ch03_2;

public class Warrior {

	// �������
	
		public String w1Name;
		public int w1Power;
		public int w1Life;
		public String w1Item;
		
		// ����Լ�
		
		public void warriorName() {
			System.out.println(" '" + w1Name + "' ");
		}
		
		public void warriorLife() {
			System.out.println("����� : " + w1Life );
		}
		
		public void damage() {
			System.out.println("���ݷ� : " + w1Power );
		}
		
		public void dropItem() {
			System.out.println("��� : " + w1Item);
		}
		
	}// end of class

	//Ŭ���� �̸��� �빮�ڷ� ����, �޼������ �̸��� �ҹ��ڷ� �����ϴ� ���� ����.
