package Ex1;

public class Wizard {

	// 멤버 변수
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
			System.out.println("잘못 입력하셨습니다. 0이상을 입력하세요.");
		} else {
			this.wizardHp = hp;
		}
	}	
	public void setWarriorPower(int power) {
		if (power<0) {
				System.out.println("잘못 입력하셨습니다. 0 이상을 입력하세요.");
		} else {
			this.wizardPower = power;
		}
	}	
	public void setWarriorName(String name) {
		if (name == null || name == "" || name.length() < 2) {
			System.out.println("잘못 입력하셨습니다. 두글자 이상 입력하세요.");
		} else {
			wizardName = name;
		}
	}	

	public void setWarriorMp(int mp) {
		if (mp < 0) {
			System.out.println("잘못 입력하셨습니다. 0 이상을 입력하세요.");
		} else {
			wizardMp = mp;
		}
	}
	
	public void setWarriorSkillName(String skillName) {
		if (skillName == "" || skillName == null || skillName.length() < 2) {
			System.out.println("잘못 입력하셨습니다. 두글자 이상 입력하세요.");
		} else {
			wizardSkillName = skillName;
		}
	}
	
	public void setWarriorSkillDamage(int skillDamage) {
		if (skillDamage < 0) {
			System.out.println("잘못 입력하셨습니다. 0 이상을 입력하세요.");
		} else {
			wizardSkillDamage = skillDamage;
		}
	}
		

	
	// 생성자도  만들어 주세요.
	public Wizard(int wizardHp, int wizardPower, String wizardName) {
		this.wizardHp =  wizardHp;
		this.wizardPower = wizardPower;
		this.wizardName = wizardName;
	}
		
	// 메서드
	// 전사를 공격 한다.
	public void attackWarrior() {
		
	}
	//
	public void takeDamage(int warriorPower ) {
		wizardHp -= warriorPower;
		System.out.println("마법사가 " +  warriorPower +"만큼의 전사의 공격을 받았습니다.");
	}
	
	
	// 상태창을 꾸며서  볼 수있는 기능을 만들어 주세요.
	public void wizzardInfo() {
		System.out.println("-------------------------------");
		if (wizardHp <= 0) {
			System.out.println("마법사는 죽었습니다.");
		}	else {
				System.out.println(wizardName + "의 현재 상태" +"\n공격력 : " + wizardPower + "\n생명력 : " + wizardHp);
		}
		System.out.println("-------------------------------");
	}
}