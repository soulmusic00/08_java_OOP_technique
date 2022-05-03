package step8_01.technique;
/*
 * 
 *  # 상속 (Inheritance) 
 *  
 *  - [ 호칭 ]  
 *  
 *  	> 부모 , 상위 , 슈퍼 , 기반 클래스  
 *  	> 자식 , 하위 , 서브 , 파생 클래스
 *
 *  - [ 형식 ]
 * 
 *   	class 자식클래스 이름 extends 부모클래스이름 {
 *   
 *   	}
 *   
 *  - 클래스간의 부모자식관계를 설정해서 클래스를 광범위하게 사용이 가능하다.
 *  
 *  - 단일 상속만 가능하다. ( 다중상속 불가 )
 *    Ex) Class A extends B,C,D,E  (불가능)
 *
 *  - 모든 클래스는 Object클래스를 상속받은 상태에서 시작한다.
 *    
 *  - Class A {}
 *    Class B extends A {}
 *    Class C extends B {}
 *    
 *    위와 같은 형태로 상속을 받을 수 있으나 클래스간의 의존성을 높이며
 *    유지보수의 효율의 저하를 가져오므로 사용을 권장하지 않는다.
 *    
 * */

class Beginner {
	
	int level = 1;
	int power = 10;
	int dex = 10;
	int life = 10;
	int mana = 10;
	
	void levelUp() {
		this.level++;
		this.power += 10;
		this.dex += 10;
		this.life += 10;
		this.mana += 10;
	}
	
	void showStatus() {
		
		System.out.println("# level : " + this.level);
		System.out.println("# power : " + this.power);
		System.out.println("# dex : " + this.dex);
		System.out.println("# life : " + this.life);
		System.out.println("# mana : " + this.mana);
		System.out.println();
		
	}
	
}

class Warrior extends Beginner {}
class Wizard extends Beginner {}

public class TechniqueEx06 {

	public static void main(String[] args) {

		Warrior warrior = new Warrior();
		warrior.showStatus();
		warrior.levelUp();
		warrior.showStatus();
		
		System.out.println("\n==================\n");
		
		Wizard wizard = new Wizard();
		wizard.showStatus();
		wizard.levelUp();
		wizard.levelUp();
		wizard.levelUp();
		wizard.showStatus();
		
	}

}
