package step8_01.technique;

/*

	# 클래스의 형변환 (업다운 캐스팅)
	
	- 부모클래스는 객체를 생성 할때 부모클래스에 있는 자원만 생성된다. 
  	  반면 자녀클래스는 객체를 생성 할때 부모와 자녀의 자원이 둘다 생성된다. 결국 
  	  자녀클래스는 부모클래스의 타입으로 객체를 생성 할 수 있고, 		
  	  부모클래스는 자녀클래스의 타입으로 객체를 생성 할 수 없다.	

*/

class Base {
	void baseMethod() {}
}

class Sub extends Base {
	void subMethod() {}
}

public class TechniqueEx11 {

	public static void main(String[] args) {

		Base base1 = new Base(); // 부모 클래스의 객체 생성
		base1.baseMethod();      // 자신의 메서드 사용
		
		Sub sub1 = new Sub();	// 자녀 클래스의 객체 생성
		sub1.baseMethod();      // 상속받은 메서드 사용
		sub1.subMethod();       // 자신의 메서드 사용
		
		System.out.println("======================");
		
		//Sub base2 = new Base();
		
		// 객체의 타입이 부모형태이기 때문에 부모클래스가 가지고 있는 메서드만 사용가능
		Base sub2 = new Sub();
		sub2.baseMethod();
		
		// 부모타입으로 만들어진 자녀클래스의 타입을 다시 자녀클래스로 형변환시킬 경우 다시 자녀클래스로 사용 가능
		Sub sub3 = (Sub)sub2;
		sub3.baseMethod();
		sub3.subMethod();
		
		System.out.println("======================");
		
		// [참고] instanceof : 형변환이 가능한지 확인하는 메서드
		if (sub1 instanceof Base) System.out.println("형변환 가능1");
		else					  System.out.println("형변환 불가1");
		
		System.out.println();
		
		if (base1 instanceof Sub) System.out.println("형변환 가능2");
		else					  System.out.println("형변환 불가2");

		
	}

}
