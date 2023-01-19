package Chapter14.F_Clone;

public class ObjectCloneMain {

	public static void main(String[] args) throws CloneNotSupportedException {

		Circle circle = new Circle(10, 20, 30);
		Circle circleCopy=(Circle) circle.clone(); //DownCasting

		
		System.out.println(circle);
		System.out.println(circleCopy);
		
		//hash°ª
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(circleCopy));
	}

}
