package Chapter13.C02;

public class StaticInner {
	int a=10;
	private int b=100;
	static int c=200;  //Data ���� �޸�
	
	//������
	
	//�޼ҵ�
	
	//����Ŭ����
	
	static class Inner{
		//�ʵ��
		
		static int d=1000;
		//������
		
		//�޼ҵ�
		public void printData() {
			//a�� b�� static�� �ƴϱ� ������ ������ �������� ����� �� ����
			//System.out.println("int a : "+a);
			//System.out.println("private int b : "+b);
			System.out.println("static int c : "+c);
			System.out.println("static int d : "+d);
		}
	}
	
	
	public static void main(String[] args) {
		
		Inner inner=new Inner();
		inner.printData();
		
	}

}

