package step8_01.technique;

/*
 * 
 * toString : 객체에 관한 정보를 문자열로 반환한다.
 * 
 * */

// DTO(Data Transfer Object) : 데이터 전송 모델 객체
class OrderDto {
	
	private String orderCode;
	private String memberId;
	private String goodsCode;
	private String goodsTitle;
	private String deliveryMethod;
	private String deliveryAddress;
	private String deliveryMessage;
	
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getGoodsCode() {
		return goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}
	public String getGoodsTitle() {
		return goodsTitle;
	}
	public void setGoodsTitle(String goodsTitle) {
		this.goodsTitle = goodsTitle;
	}
	public String getDeliveryMethod() {
		return deliveryMethod;
	}
	public void setDeliveryMethod(String deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	public String getDeliveryMessage() {
		return deliveryMessage;
	}
	public void setDeliveryMessage(String deliveryMessage) {
		this.deliveryMessage = deliveryMessage;
	}
	
	// toString 생성 단축키
	// 좌측 상단 Source > Generate toString > selectAll > Generate
	@Override
	public String toString() {
		return "OrderDto [orderCode=" + orderCode + ", memberId=" + memberId + ", goodsCode=" + goodsCode
				+ ", goodsTitle=" + goodsTitle + ", deliveryMethod=" + deliveryMethod + ", deliveryAddress="
				+ deliveryAddress + ", deliveryMessage=" + deliveryMessage + "]";
	}

	
}


public class TechniqueEx13 {

	public static void main(String[] args) {

		OrderDto order1 = new OrderDto();
		order1.setOrderCode("order1");
		order1.setMemberId("qwer1234");
		order1.setGoodsCode("g1");
		order1.setGoodsTitle("자바문법");
		order1.setDeliveryMethod("택배수령");
		order1.setDeliveryAddress("테헤란로");
		order1.setDeliveryMessage("경비실에 맡겨주세요.");
		System.out.println(order1);
		
		OrderDto order2 = new OrderDto();
		order2.setOrderCode("order2");
		order2.setMemberId("abcd1234");
		order2.setGoodsCode("g2");
		order2.setGoodsTitle("스프링문법");
		order2.setDeliveryMethod("편의점");
		order2.setDeliveryAddress("삼성동");
		order2.setDeliveryMessage("배송전에 연락주세요.");
		System.out.println(order2);
	
	}

}
