package Chapter13.C03;

public class Localinner1 {

	int a=100;
	
	//innerTest �Լ� ����
	public void innerTest(int n) {
		int b=200; //��������
		final int c=n;//���
		
		//InnerTest() �Լ� ���ο� ����Ŭ���� �ۼ�
		class Inner{
			//Local ���� Ŭ������ �ܺ� Ŭ������ ��������� ����鸸 ������ �� �ִ�
			public void getData() {
				System.out.println("int a : "+a);
				System.out.println("int b : "+b);//error
				System.out.println("final int c : "+c);
			}
		}//Local ���� Ŭ����
		//===========================================
		//�Լ����ο� �ִ� Ŭ������� �ص� ȣ���ϸ� ����� �ڵ����� �����°��� �ƴ϶� 
		//��ü�� ���� ����ؾ� �Ѵ�.
		Inner i=new Inner();
		i.getData();
	}

	public static void main(String[] args) {
		Localinner1 outer=new Localinner1();  //���� Ŭ���� ��ü
		outer.innerTest(500);
		
		
	}
}
