package Chapter09;

public class B {

	//���� ��Ű�������� public
	public void moethod() {
		A a=new A();
		a.field="value";
		a.method();
	}
	
	
	public static void main(String[] args) {
		
		B b=new B();
		b.moethod();

	}

}
