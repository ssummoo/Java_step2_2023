package Chapter09.Override;

public class ChildMain {

	public static void main(String[] args) {

		Child child=new Child();
		
		child.method1();//parentŬ����
		child.method2();//childŬ����
		child.method3();//childŬ����
		
		System.out.println();

		Parent parent2=child;

		parent2.method1();
		parent2.method2();

		System.out.println();
		
		//���������� ParentŬ������ ���
		Parent parent1 = new Parent();
		
		parent1.method1();
		parent1.method2();
		System.out.println();
		
	
}

}