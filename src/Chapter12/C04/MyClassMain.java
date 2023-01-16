package Chapter12.C04;

public class MyClassMain {

	public static void main(String[] args) {

		//X,Y, MyInterface 인터페이스 타입의 인스턴스 변수를 선언하여 출력
		MyClass mc=new MyClass();
		
		
		X x=mc;  //X 클래스 타입의 인스턴스 변수
		x.x();

		Y y=mc;  //Y 클래스 타입의 인스턴스 변수
		y.y();
		
		MyInterface MI=mc;  //MyInterface 클래스 타입의 인스턴스 변수
		MI.x();
		MI.y();
		MI.myMethod();
		
		System.out.println("-----------");
		
		mc.x();
		mc.y();
		mc.myMethod();
		// *mc 객체 하나로 다 사용가능하지만 유지보수를 위해 각 클래스 타입의 인스턴스 변수를 사용
	}

}
