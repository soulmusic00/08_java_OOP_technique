package step8_01.technique;

/*
 * 
 *  # 인터페이스 (interface)
 *  
 *  - 인터페이스는 추상클래스보다 더 추상화된 클래스
 *  - 실제 구현된 것이 전혀 없는 기본 설계도
 *  - 미리 정해진 규칙에 맞게 구현하도록 '표준'을 제시하는데 사용한다.
 *  - 클래스는 인터페이스를 상속받을 수 없다.
 *  - 인터페이스는 클래스를 상속받을 수 없다.
 *  - 클래스는 클래스끼리 , 인터페이스는 인터페이스끼리 상속시킬 수 있다.
 *  - 클래스는 다중 상속을 허용하지않지만 인터페이스는 다중구현을 허용한다.
 *  
 * */


// 추상 클래스
abstract class AA {
	
	abstract void test1(); // 추상 메서드
	void test2() {};	   // 일반 메서드
	
}

// 인터페이스
interface BB {
	
	abstract void test3();	// 추상 메서드
	abstract void test4();  
	
	//void test5() {}			// 일반 메서드는 사용 불가
	
}

interface CC {
	
	void test5();	// 인터페이스에서는 abstract 키워드를 생략할 수 있다.
	void test6();
	
}

// implements 키워드를 사용하여 인터페이스를 '구현'한다. (상속x)
class DD implements BB , CC { // 인터페이스는 ,를 이용하여 다중구현이 가능하다.

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test6() {
		// TODO Auto-generated method stub
		
	}
	
}

// 상속과 동시에 인터페이스 구현이 가능하다. (상속은 반드시 1번만 가능)
class EE extends Parent1 implements BB ,CC {

	@Override
	public void test5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test6() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test4() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}




public class TechniqueEx10_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
