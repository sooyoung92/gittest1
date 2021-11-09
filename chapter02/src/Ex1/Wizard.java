package Ex1;

public class Wizard {

	// ��� ����
	// hp, power, name
	private int wizardHp;
	private int wizardPower;
	private String wizardName;
	private int wizardMp;
	private String wizardSkillName;
	private int wizardSkillDamage;
	
	// get
	public int getWizardHp() {
		return wizardHp;
	}
	public int getWizardPower() {
		return wizardPower;
	}
	public String getWizardName() {
		return wizardName;
	}
	public int getWizardMp() {
		return wizardMp;
	}
	public String getWizardSkillName() {
		return wizardSkillName;
	}
	public int getWizardSkillDamage() {
		return wizardSkillDamage;
	}
	// set
	public void setWizardHp(int hp) {
		if (hp < 0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. 0�̻��� �Է��ϼ���.");
		} else {
			this.wizardHp = hp;
		}
	}	
	public void setWarriorPower(int power) {
		if (power<0) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. 0 �̻��� �Է��ϼ���.");
		} else {
			this.wizardPower = power;
		}
	}	
	public void setWarriorName(String name) {
		if (name == null || name == "" || name.length() < 2) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �α��� �̻� �Է��ϼ���.");
		} else {
			wizardName = name;
		}
	}	

	public void setWarriorMp(int mp) {
		if (mp < 0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. 0 �̻��� �Է��ϼ���.");
		} else {
			wizardMp = mp;
		}
	}
	
	public void setWarriorSkillName(String skillName) {
		if (skillName == "" || skillName == null || skillName.length() < 2) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �α��� �̻� �Է��ϼ���.");
		} else {
			wizardSkillName = skillName;
		}
	}
	
	public void setWarriorSkillDamage(int skillDamage) {
		if (skillDamage < 0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. 0 �̻��� �Է��ϼ���.");
		} else {
			wizardSkillDamage = skillDamage;
		}
	}
		

	
	// �����ڵ�  ����� �ּ���.
	public Wizard(int wizardHp, int wizardPower, String wizardName) {
		this.wizardHp =  wizardHp;
		this.wizardPower = wizardPower;
		this.wizardName = wizardName;
	}
		
	// �޼���
	// ���縦 ���� �Ѵ�.
	public void attackWarrior() {
		
	}
	//
	public void takeDamage(int warriorPower ) {
		wizardHp -= warriorPower;
		System.out.println("�����簡 " +  warriorPower +"��ŭ�� ������ ������ �޾ҽ��ϴ�.");
	}
	
	
	// ����â�� �ٸ缭  �� ���ִ� ����� ����� �ּ���.
	public void wizzardInfo() {
		System.out.println("-------------------------------");
		if (wizardHp <= 0) {
			System.out.println("������� �׾����ϴ�.");
		}	else {
				System.out.println(wizardName + "�� ���� ����" +"\n���ݷ� : " + wizardPower + "\n����� : " + wizardHp);
		}
		System.out.println("-------------------------------");
	}
}