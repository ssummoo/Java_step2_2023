package Chapter13.C02;

public class MemberInner {

	int a=10;
	private int b=100;
	static int c=200;
	
	//������
	
	//�޼ҵ�
	
	//����Ŭ����
	
	class Inner{
		//�ʵ��
		
		//������
		
		//�޼ҵ�
		public void printData() {
			System.out.println("int a : "+a);
			System.out.println("private int b : "+b);
			System.out.println("static int c : "+c);
		}
	}
	
	
	public static void main(String[] args) {
		//�ܺ�
		//MemberInner outer=new MemberInner();
		//����
		//MemberInner.Inner Inner=outer.new Inner();
		//MemberInner.Inner Inner=outer.new Inner();
		//���ٷ�
		MemberInner.Inner inner= new MemberInner().new Inner();
		
		inner.printData();
	}

}
