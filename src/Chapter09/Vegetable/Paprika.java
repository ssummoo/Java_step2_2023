package Chapter09.Vegetable;



public class Paprika extends Vegetable{
	
	private String color;
	private int price;
	private String name;
	
	//�⺻ ������
	
	//setter
	public void Set2(String a, int b, String c) {
		color=a;
		price=b;
		name=c;
		
	}
	
	public void Set2() {
		System.out.println("�з� : "+sort);
		System.out.println("���� : "+season);
		
	}
	public void Disp1() {
		System.out.println("=======paprika=========");
		System.out.println("�з� : "+sort);
		System.out.println("���� : "+season); 
		//��������� ��ӹ��� �Ͱ� ��ġ�ϴ� ���� �������
		//��ӹ��� Ŭ������ �⺻ ������(super)�� �̿��ؿ� ����
		System.out.println("�̸� : "+super.name);

		System.out.println();
}
	public void Disp2() {
		System.out.println("=======paprika=========");
		System.out.println("���� : "+color);
		System.out.println("���� : "+price); 
		System.out.println("�̸� : "+name);
		
		System.out.println();
	}
}