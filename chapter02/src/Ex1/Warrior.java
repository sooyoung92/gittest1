package Ex1;

public class Warrior {
	
	// ��� ����
	// hp, power, name
	private int warriorHp;
	private int warriorPower;
	private String warriorName;
	private int warriorMp;
	private String warriorSkillName;
	private int warriorSkillDamage;
	
		
	// get
	public int getWarriorHp() {
		return warriorHp;
	}
	public int getWarriorPower() {
		return warriorPower;
	}
	public String getWarriorName() {
		return warriorName;
	}
	public int getWarriorMp() {
		return warriorMp;
	}
	public String getWarriorSkillName() {
		return warriorSkillName;
	}
	public int getWarriorSkillDamage() {
		return warriorSkillDamage;
	}
	//set
	public void setWarriorHp(int hp) {
		if(hp < 0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. 0 �̻��� �Է��ϼ���.");
		} else {
			this.warriorHp = hp;
		}
	}	
	public void setWarriorPower(int power) {
		if (power<0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. 0 �̻��� �Է��ϼ���.");
		} else {
			this.warriorPower = power;
		}
	}	
	public void setWarriorName(String name) {
		if (name == null || name == "" || name.length() < 2) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �α��� �̻� �Է��ϼ���.");
		} else {
			warriorName = name;
		}
	}	

	public void setWarriorMp(int mp) {
		if (mp < 0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. 0 �̻��� �Է��ϼ���.");
		} else {
			warriorMp = mp;
		}
	}
	
	public void setWarriorSkillName(String skillName) {
		if (skillName == "" || skillName == null || skillName.length() < 2) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �α��� �̻� �Է��ϼ���.");
		} else {
			warriorSkillName = skillName;
		}
	}
	
	public void setWarriorSkillDamage(int skillDamage) {
		if (skillDamage < 0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. 0 �̻��� �Է��ϼ���.");
		} else {
			warriorSkillDamage = skillDamage;
		}
	}
		
		
	// �����ڵ�  ����� �ּ���.
	public Warrior(int warriorHp, int warriorPower, String warriorName) {
		this.warriorHp = warriorHp;
		this.warriorPower = warriorPower;
		this.warriorName = warriorName;
	}
	
	// �޼���
	// �����縦 ���� �Ѵ�.
	public void attackWizard() {
		
	}
	
	//
	public void takeDamge(int wizardPower) {
		warriorHp -= wizardPower;
		System.out.println("���簡 " + wizardPower +"��ŭ�� �������� ������ �޾ҽ��ϴ�.");
	}
	
	
	
	// ����â�� �ٸ缭  �� ���ִ� ����� ����� �ּ���.
	public void warriorInfo() {
		System.out.println("-------------------------------");
		if (warriorHp <= 0) {
			System.out.println("����� �׾����ϴ�.");
		}	else {
				System.out.println(warriorName + "�� ���� ����" +"\n���ݷ� : " + warriorPower + "\n����� : " + warriorHp);
			}
		System.out.println("-------------------------------");
		}
	
	}
	
// private, get, set �����
//





