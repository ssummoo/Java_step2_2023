package Chapter12.C04;

public class MyClassMain {

	public static void main(String[] args) {

		//X,Y, MyInterface �������̽� Ÿ���� �ν��Ͻ� ������ �����Ͽ� ���
		MyClass mc=new MyClass();
		
		
		X x=mc;  //X Ŭ���� Ÿ���� �ν��Ͻ� ����
		x.x();

		Y y=mc;  //Y Ŭ���� Ÿ���� �ν��Ͻ� ����
		y.y();
		
		MyInterface MI=mc;  //MyInterface Ŭ���� Ÿ���� �ν��Ͻ� ����
		MI.x();
		MI.y();
		MI.myMethod();
		
		System.out.println("-----------");
		
		mc.x();
		mc.y();
		mc.myMethod();
		// *mc ��ü �ϳ��� �� ��밡�������� ���������� ���� �� Ŭ���� Ÿ���� �ν��Ͻ� ������ ���
	}

}
