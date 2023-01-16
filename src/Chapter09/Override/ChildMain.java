package Chapter09.Override;

public class ChildMain {

	public static void main(String[] args) {

		Child child=new Child();
		
		child.method1();//parent클래스
		child.method2();//child클래스
		child.method3();//child클래스
		
		System.out.println();

		Parent parent2=child;

		parent2.method1();
		parent2.method2();

		System.out.println();
		
		//독립적으로 Parent클래스만 사용
		Parent parent1 = new Parent();
		
		parent1.method1();
		parent1.method2();
		System.out.println();
		
	
}

}