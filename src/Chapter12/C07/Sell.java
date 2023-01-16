package Chapter12.C07;

public interface Sell {

	void sell();
	/*
	default void order() {
		System.out.println("판매 주문");
	}
	//같은 이름의 default메소드는 존재할 수 없으므로 오버라이딩 필요
	*/
	default void sellorder() {
		System.out.println("판매 주문");
	}
}
