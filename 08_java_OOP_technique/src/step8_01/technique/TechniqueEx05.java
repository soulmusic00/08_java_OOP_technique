package step8_01.technique;

/*
 * # 싱글턴 패턴
 * 
 *  - 객체를 1번만 생성하고 싶을 때 사용하는 기법
 *  
 *  - 싱글턴 패턴을 만드는 방법
 *  
 *    1) private 기본 생성자를 만든다.
 *    2) 내부에서 static으로 자기자신의 인스턴스를 생성한다. (핵심)
 *	  3) instance를 반환할 getter를 만들어준다.	  
 *  
 * */

class MySingleTon {
	
	// 1) private 기본 생성자를 만든다.
	private MySingleTon(){}
	
	// 2) 내부에서 static으로 자기자신의 객체를 생성한다.
	private static MySingleTon instance = new MySingleTon();
	
	// 3) instance를 반환할 getter를 반환해준다.
	public static MySingleTon getInstance() {
		return instance;
	}
	
	// 테스트 용도
	void testMethod1() {System.out.println("# 테스트 메서드 1");}
	void testMethod2() {System.out.println("# 테스트 메서드 2");}
	void testMethod3() {System.out.println("# 테스트 메서드 3");}
	
}

class TestClass {}


public class TechniqueEx05 {

	public static void main(String[] args) {

		TestClass t1 = new TestClass();
		TestClass t2 = new TestClass();
		TestClass t3 = new TestClass();
		
		System.out.println(t1); // 다른 객체
		System.out.println(t2); // 다른 객체
		System.out.println(t3); // 다른 객체
		System.out.println();
		
		// error , 싱글톤 패턴의 객체생성방식은 보통방식과 다르다.
		// new MySingleTon();
		
		System.out.println(MySingleTon.getInstance()); // 같은 객체
		System.out.println(MySingleTon.getInstance()); // 같은 객체
		System.out.println(MySingleTon.getInstance()); // 같은 객체
		System.out.println();
		
		// 싱글턴 클래스.instance.메서드명()
		MySingleTon.getInstance().testMethod1();	// 테스트 메서드 사용예시
		MySingleTon.getInstance().testMethod2();
		MySingleTon.getInstance().testMethod3();
		
	}

}
