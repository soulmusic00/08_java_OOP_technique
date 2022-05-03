package step8_01.technique;

/*
 * 
 * # 생성자 오버로딩
 * 
 *  - 생성자도 메서드이기 때문에 메서드 오버로딩 기법이 적용 가능하다.
 *  - 생성자 오버로딩을 구현하기 위해서는 메서드와 마찬가지로
 *    파라메타의 개수나 타입을 다르게 정의 하면 된다.
 * 
 * */

class Goods2 {
	
	String goodsCode;
	String goodsName;
	int goodsPrice;
	int deliveryPrice;
	
	Goods2(String goodsCode, String goodsName, int goodsPrice, int deliveryPrice) {
		this.goodsCode = goodsCode;
		this.goodsName = goodsName;
		this.goodsPrice = goodsPrice;
		this.deliveryPrice = deliveryPrice;
	}
	
	Goods2(String goodsCode, String goodsName, int goodsPrice) {
		this.goodsCode = goodsCode;
		this.goodsName = goodsName;
		this.goodsPrice = goodsPrice;
		this.deliveryPrice = 0;
	}
	
	Goods2(String goodsName) {
		this.goodsCode = "없음";
		this.goodsName = goodsName;
		this.goodsPrice = 0;
		this.deliveryPrice = 0;
	}
	
	void printData() {
		System.out.println("goodsCode : "     + goodsCode);
		System.out.println("goodsName : "     + goodsName);
		System.out.println("goodsPrice : "    + goodsPrice);
		System.out.println("deliveryPrice : " + deliveryPrice);
		System.out.println();
	}
	
}

public class TechniqueEx04_03 {

	public static void main(String[] args) {

		new Goods2("0x02" , "신형노트북" , 1200000, 3000).printData();
		new Goods2("0x03" , "신형스마트 TV" , 3000000).printData();
		new Goods2("신형 김치냉장고").printData();
		
	}

}
