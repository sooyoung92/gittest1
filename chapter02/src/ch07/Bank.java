package ch07;

public class Bank {
	
	//���� ����
	private int balance;
	
	// �޼���
	// �Ա� ���
	public void deposit(int money) {
		//this.balance = this.balance + money;
		this.balance += money;
		
	}
	// ���
	public int withdraw(int money) {
		this.balance -= money;
		return money;
	}
	
	public void showInfo() {
		System.out.println("���� �ܾ��� " + this.balance + " �Դϴ�.");
	}
	
	// getter �޼��� �����
	// ��������� �޼��带 �̿��ؼ� ������ ������ �ְ� �ϴ°�.
	// �Ϲ������� get() �޼��带 ���� �ܺο��� Ȯ���� �� �ֵ��� �����Ѵ�.
	public int getBalance() {
		return this.balance;
	}
	
	// setter �޼��� �����
	// �Ϲ��� set() �޼��带 �����ؼ� �ܺο��� ��������� ������ ���ֵ��� �����Ѵ�.
	public void setBlance(int balance) {
		if (balance < 0) {
			System.out.println("�߸��� �Է��Դϴ�.");
		} else {
			this.balance = balance;
		}
	// ������� �ڵ� �Է��� ����.
	}	
	
// public class �� .java ���Ͼȿ� �� �ϳ��� ��� ����.
class Student{
	
}

}
