package Chapter09;

public class C extends A{
	
	public C() {
		super(); //�θ�Ŭ������ ������ ������
		this.field="value";
		this.method();
	}

	
	public static void main(String[] args) {

		C c=new C(); // �ڽ�
		c.method(); //�θ�Ŭ����

	}

}
