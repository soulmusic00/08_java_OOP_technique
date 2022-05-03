package step8_01.technique;

// 생성자를 이용한 멤버변수 초기화
class Goods {
	
	String goodsCode;
	String goodsName;
	int goodsPrice;
	int deliveryPrice;
	
	// 생성자 단축키 > 좌측 상단 Source > Generate Constructor Using Fields..
	Goods(String goodsCode, String goodsName, int goodsPrice, int deliveryPrice) {
		this.goodsCode = goodsCode;
		this.goodsName = goodsName;
		this.goodsPrice = goodsPrice;
		this.deliveryPrice = deliveryPrice;
	}
	
//	void setData(String goodsCode , String goodsName , int goodsPrice , int deliveryPrice) {
//		this.goodsCode = goodsCode;
//		this.goodsName = goodsName;
//		this.goodsPrice = goodsPrice;
//		this.deliveryPrice = deliveryPrice;
//	}

	void printData() {
		System.out.println("goodsCode : "     + goodsCode);
		System.out.println("goodsName : "     + goodsName);
		System.out.println("goodsPrice : "    + goodsPrice);
		System.out.println("deliveryPrice : " + deliveryPrice);
		System.out.println();
	}
	
}


public class TechniqueEx04_02 {

	public static void main(String[] args) {

		Goods goods1 = new Goods("0x00" , "신형에어컨" , 2000000 , 0);
		
//		goods1.goodsCode = "0x00";
//		goods1.goodsName = "신형에어컨";
//		goods1.goodsPrice = 2000000;
//		goods1.deliveryPrice = 0;
//		goods1.setData("0x00" , "신형에어컨" , 2000000 , 0);

		goods1.printData();
		
		
		Goods goods2 = new Goods("0x01" , "신형컴퓨터" , 1700000 , 2500);
		goods2.printData();
		
		
	}

}
