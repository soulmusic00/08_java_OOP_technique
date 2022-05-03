package step8_01.technique;

/*
 * 
 *  캡슐화 (capsulation)
 * 
 * 접근제어자 : public , private  + getter/setter
 * 
 * 
 * public  : 프로젝트 전체에서 접근 가능
 * private : 클래스 내부에서만 접근 가능
 * 
 * default(package) : 패키지 내에서만 접근가능
 * protected        : 상속관계에서 접근 가능
 * 
 * 
 * */

class ModifierTest {
	
	private int a;
	public int b;
	
	// private변수를 외부로 꺼내주는 메서드 getter
	int getA() { // 변수명 앞에 get을 추가하여 메서드이름을 지정한다.
		return this.a;
	}
	
	// private변수를 외부에서 수정하는 메서드 setter
	void setA(int a) { // 변수명 앞에 set을 추가하여 메서드이름을 지정한다.
		this.a = a;
	}
	
}

// VO  : Value Object		  > 데이터 객체
// DTO : Data Transfer Object > 데이터 전송 객체
class ProductDto {
	
	private String productCode;
	private String productName;
	private int productPrice;
	private String managerCode;
	private String managerName;
	
	// getter & setter 생성 단축키
	// 좌측 상단 Source > Generate Getters and Getters > selectAll > Generate
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public String getManagerCode() {
		return managerCode;
	}
	public void setManagerCode(String managerCode) {
		this.managerCode = managerCode;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	
	
}


public class TechniqueEx02 {

	public static void main(String[] args) {

		ModifierTest test = new ModifierTest();
		
		// private 변수는 클래스 외부에서 접근 불가(is not visible)
		//test.a = 1000;
		//System.out.println(test.a);
		
		test.b = 2000;
		System.out.println(test.b);
		
		test.setA(777); 				  // setter를 이용하여 private 변수에 값 대입
		System.out.println(test.getA());  // getter를 이용하여 private 변수에 접근
		
		System.out.println();
		
		ProductDto productDto = new ProductDto();
		productDto.setProductCode("0x001");
		productDto.setProductName("기계식키보드");
		productDto.setProductPrice(37000);
		productDto.setManagerCode("mgr1");
		productDto.setManagerName("담당자A");
		
		System.out.println(productDto.getProductCode());
		System.out.println(productDto.getProductName());
		System.out.println(productDto.getProductPrice());
		System.out.println(productDto.getManagerCode());
		System.out.println(productDto.getManagerName());
		
	}

}
