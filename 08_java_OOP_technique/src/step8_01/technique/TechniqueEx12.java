package step8_01.technique;

import java.util.ArrayList;
import java.util.HashMap;

/*

	# 다형성
	
	- 다형성이란 하나의 메소드가 서로 다른 클래스에서 다양하게 실행되는 것을 말한다.
	- 다형성을 구현하기 위해서는 다형성을 구현할 메소드가 포함된 모든 클래스가 같은 부모 클래스를 가져야 한다.
	- 부모 클래스와 자식 클래스에 같은 메소드가 있어야 하며 자식 클래스는 이 메소드를 반드시 override 시켜서 사용해야 한다.
	- 부모 클래스 타입에 자식 클래스 타입을 대입시켜 다형성이 구현된 메소드를 실행한다.

*/

// 부모 클래스
class Shape {
	
	void draw() {} // 자녀클래스가 상속받아서 사용할 메서드를 정의
	
}

class Line extends Shape {
	
	void draw() {	// 부모 클래스의 메서드를 재정의해서 사용
		System.out.println("선을 그린다.");
	}
	
}

class Circle extends Shape {
	
	void draw() {	// 부모 클래스의 메서드를 재정의해서 사용
		System.out.println("원을 그린다.");
	}
	
}

class Rect extends Shape {
	
	void draw() {	// 부모 클래스의 메서드를 재정의해서 사용
		System.out.println("사각형을 그린다.");
	}
	
}

public class TechniqueEx12 {

	public static void main(String[] args) {

		// 부모클래스의 타입으로 배열을 생성하고 자식클래스로 배열의 요소를 추가
		Shape[] shapes = new Shape[3];
		
		shapes[0] = new Line();		
		shapes[1] = new Circle();	
		shapes[2] = new Rect();		
		
		// 메서드의 이름은 같지만 각각 다른 기능으로 작용
		shapes[0].draw();
		shapes[1].draw();
		shapes[2].draw();
		
		
		// 참고 자료
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("data1", 123); 			  // 정수 데이터
		map.put("data2", "문자열데이터"); // 문자열 데이터
		map.put("data3", true); 		  // 불리언 데이터
		map.put("data4", new Student());  // Student 객체
		
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(123);
		list.add("문자열데이터");
		list.add(true);
		list.add(new Student());
		
	}

}
