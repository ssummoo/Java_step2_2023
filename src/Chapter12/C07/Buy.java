package Chapter12.C07;

public interface Buy {

	
	void buy();
	
	default void order() {
		System.out.println("���� �ֹ�");
	}
}
