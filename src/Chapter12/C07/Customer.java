package Chapter12.C07;

public class Customer implements Buy, Sell{

	@Override
	public void buy() {
		System.out.println("�����ϱ�");
		
	}

	@Override
	public void sell() {
		System.out.println("�Ǹ��ϱ�");
		
	}
/*
	@Override  //���� �޼ҵ���� �����ϸ� �������̵� �ʼ�
	//���� �������̵� �޼ҵ尡 ��µ�
	public void order() {
		
		System.out.println("�� �Ǹ� �ֹ�");
	}
*/
	
}
