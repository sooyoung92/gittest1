package Ex1;

public class Warrior {
	
	// 멤버 변수
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
			System.out.println("잘못 입력하셨습니다. 0 이상을 입력하세요.");
		} else {
			this.warriorHp = hp;
		}
	}	
	public void setWarriorPower(int power) {
		if (power<0) {
			System.out.println("잘못 입력하셨습니다. 0 이상을 입력하세요.");
		} else {
			this.warriorPower = power;
		}
	}	
	public void setWarriorName(String name) {
		if (name == null || name == "" || name.length() < 2) {
			System.out.println("잘못 입력하셨습니다. 두글자 이상 입력하세요.");
		} else {
			warriorName = name;
		}
	}	

	public void setWarriorMp(int mp) {
		if (mp < 0) {
			System.out.println("잘못 입력하셨습니다. 0 이상을 입력하세요.");
		} else {
			warriorMp = mp;
		}
	}
	
	public void setWarriorSkillName(String skillName) {
		if (skillName == "" || skillName == null || skillName.length() < 2) {
			System.out.println("잘못 입력하셨습니다. 두글자 이상 입력하세요.");
		} else {
			warriorSkillName = skillName;
		}
	}
	
	public void setWarriorSkillDamage(int skillDamage) {
		if (skillDamage < 0) {
			System.out.println("잘못 입력하셨습니다. 0 이상을 입력하세요.");
		} else {
			warriorSkillDamage = skillDamage;
		}
	}
		
		
	// 생성자도  만들어 주세요.
	public Warrior(int warriorHp, int warriorPower, String warriorName) {
		this.warriorHp = warriorHp;
		this.warriorPower = warriorPower;
		this.warriorName = warriorName;
	}
	
	// 메서드
	// 마법사를 공격 한다.
	public void attackWizard() {
		
	}
	
	//
	public void takeDamge(int wizardPower) {
		warriorHp -= wizardPower;
		System.out.println("전사가 " + wizardPower +"만큼의 마법사의 공격을 받았습니다.");
	}
	
	
	
	// 상태창을 꾸며서  볼 수있는 기능을 만들어 주세요.
	public void warriorInfo() {
		System.out.println("-------------------------------");
		if (warriorHp <= 0) {
			System.out.println("전사는 죽었습니다.");
		}	else {
				System.out.println(warriorName + "의 현재 상태" +"\n공격력 : " + warriorPower + "\n생명력 : " + warriorHp);
			}
		System.out.println("-------------------------------");
		}
	
	}
	
// private, get, set 만들기
//





