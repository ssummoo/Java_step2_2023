package Chapter12.C07;

public interface Sell {

	void sell();
	/*
	default void order() {
		System.out.println("�Ǹ� �ֹ�");
	}
	//���� �̸��� default�޼ҵ�� ������ �� �����Ƿ� �������̵� �ʿ�
	*/
	default void sellorder() {
		System.out.println("�Ǹ� �ֹ�");
	}
}
