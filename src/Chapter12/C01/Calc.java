package Chapter12.C01;

public interface Calc {

	double PI=3.14;
	int ERORR=-999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {
		System.out.println("���� ���⸦ �����մϴ�.");
		myMethod(); // private method ȣ��
	}
	
	
	
	
	static int total(int[] arr) {
		int total=0;
		for(int i : arr) {
			total+=i;
		}
		myStaticMethod();//private method ȣ��
		return total;
	}
	private void myMethod() {
		System.out.println("private �޼ҵ� �Դϴ�.");
	}
	private static void myStaticMethod() {
		System.out.println("private static �޼ҵ� �Դϴ�.");
	}
	//�������̽� ���
	/* 
	 * �߻�޼ҵ� : body�� ���� , ������ �����ǰ� �ʿ�-> �ڹ�8���� ����
	 * ����Ʈ�޼ҵ� : �⺻ ���๮�� ������ �ִ� �޼ҵ��̸� ������ �� �� �ִ�
	 * ����(static)�޼ҵ� : ��ü ������ ������� �������̽�Ÿ��(Ŭ������)���� ����� �� �ִ�.
	 * private �޼ҵ� : �������̽��� ������ Ŭ�������� ��밡�� , ������ �Ұ�
	 * 				  ��, �������̽�(������ Ŭ����)������ ����ϱ� ����
	 */

}