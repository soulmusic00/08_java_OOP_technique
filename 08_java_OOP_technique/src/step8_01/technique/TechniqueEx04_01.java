package step8_01.technique;

/*
 *  # 생성자 ( Constructor ) 
 * 
 * 	1. 생성자는 반드시 클래스의 이름과 같아야 한다.
 *  2. 생성자는 리턴타입을 가지지 않고 return도 사용하지 않는다.
 *     ( 생성자도 하나의 메서드이지만 기존 메서드와의 차이점이 있다. )
 *  3. 생성자는 인스턴스를 생성할때 ( new 클래스명(); ) 호출된다.
 *  	3-1) 반드시 실행된다.
 *  	3-2) 가장 먼저 실행된다.
 *  
 *  4. 생성자를 정의하지 않으면 , 컴파일러가 자동으로 기본 생성자를 만든다.
 *  5. 기본 생성자란, 클래스이름과 같으며 매개변수에 아무것도 없는 생성자를 의미한다.
 *  6. 생성자를 새로 정의하면 기본 생성자는 자동으로 만들어지지 않는다.
 * 
 * */
class ConstructorTest {
	
	ConstructorTest() {
		System.out.println("# 생성자 실행");
		System.out.println("- 메서드를 호출하지 않아도 객체 생성시 실행");
		System.out.println("- 가장 먼저 실행");
	}
	
	void method1() {
		System.out.println("# 메서드1");
	}
	
	void method2() {
		System.out.println("# 메서드2");
	}
	
	void method3() {
		System.out.println("# 메서드3");
	}
	
}


public class TechniqueEx04_01 {

	public static void main(String[] args) {

		ConstructorTest test = new ConstructorTest(); // 객체를 생성할때 기본생성자가 실행된다.
		
		test.method3();	// 메서드를 호출해야 동작한다.
		test.method1();
		test.method2();
		
		new ConstructorTest();
		new ConstructorTest();
		new ConstructorTest();
		
	}

}
