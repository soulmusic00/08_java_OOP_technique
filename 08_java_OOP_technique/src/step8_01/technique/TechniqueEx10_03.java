package step8_01.technique;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 
 *  # 인터페이스 기반 객체 생성
 * 
 *  인터페이스의 타입으로 객체를 저장할 수 있다.
 * 
 *  [ 방법 ]
 * 
 *  인터페이스 변수명 = new 클래스명();
 *  
 *  
 * */

interface Person {}

class Children implements Person {}
class Student implements Person {}
class Adult implements Person {}

public class TechniqueEx10_03 {

	public static void main(String[] args) {

		Children c1 = new Children();
		Student s1 = new Student();
		Adult a1 = new Adult();
		
		Person c2 = new Children(); // 인터페이스의 타입으로 객체 생성
		Person s2 = new Student();
		Person a2 = new Adult();
		
		// 예시 1)
		ArrayList<Integer> testList1 = new ArrayList<Integer>();
		List<Integer> testList2 = new ArrayList<Integer>();
		
		// 예시 2)
		HashMap<String, String> testMap1 = new HashMap<String, String>();
		Map<String, String> testMap2 = new HashMap<String, String>();
		
	}

}
