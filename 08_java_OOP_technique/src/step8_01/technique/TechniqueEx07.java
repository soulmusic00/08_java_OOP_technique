package step8_01.technique;

/*

	# 메서드 오버라이딩 ( Method Overriding )
	
	- 부모클래스로부터 상속 받은 메서드를 재정의(overriding)하여 사용한다.
	- 메서드 오버로딩과 혼용되기 쉽다.

*/

class Warrior2 extends Beginner{

	// 메서드 오버라이딩 (메서드 재정의)
	// 부모클래스의 메서드와 이름이 같지만 구현되는 기능은 다르다. 
	void levelUp() {
		this.level++;
		this.power += 1000;
		this.dex += 100;
		this.life += 1000;
		this.mana += 5;
	}
	
	void dash() { // Warrior2 클래스만의 메서드 추가
		System.out.println("\n Warrior2 dash! \n");
	}
	
}

class Wizard2 extends Beginner{
	
	// 메서드 오버라이딩 (메서드 재정의)
	// 부모클래스의 메서드와 이름이 같지만 구현되는 기능은 다르다. 
	void levelUp() {
		this.level++;
		this.power += 5;
		this.dex += 100;
		this.life += 100;
		this.mana += 3000;
	}
	
	void fireBall() { // Wizard2 클래스만의 메서드 추가
		System.out.println("\n Wizard2 fileBall! \n");
	}
	
}


public class TechniqueEx07 {

	public static void main(String[] args) {

		Warrior2 warrior = new Warrior2();
		warrior.showStatus();
		warrior.levelUp();
		warrior.showStatus();
		warrior.dash();
		//warrior.fireBall();
		
		System.out.println("\n==================\n");
		
		Wizard2 wizard = new Wizard2();
		wizard.showStatus();
		wizard.levelUp();
		wizard.levelUp();
		wizard.levelUp();
		wizard.showStatus();
		//wizard.dash();
		wizard.fireBall();
		
	}

}
