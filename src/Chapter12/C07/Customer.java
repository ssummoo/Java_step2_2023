package Chapter12.C07;

public class Customer implements Buy, Sell{

	@Override
	public void buy() {
		System.out.println("구매하기");
		
	}

	@Override
	public void sell() {
		System.out.println("판매하기");
		
	}
/*
	@Override  //같은 메소드명이 존재하면 오버라이딩 필수
	//최종 오버라이딩 메소드가 출력됨
	public void order() {
		
		System.out.println("고객 판매 주문");
	}
*/
	
}
