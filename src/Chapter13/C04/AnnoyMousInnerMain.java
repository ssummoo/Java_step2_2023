package Chapter13.C04;

class Outer2{
	// �͸��� Ŭ������ �ν��Ͻ� �̸��� ����.

	//���1
	Runnable getRunnable(int i) {
		int num=100;
		//new�� ���ÿ� �θ�Ŭ���� Runnable�� run�޼ҵ带 ��ӹ����Ƿ� �߻� �޼ҵ��� run�� �ݵ�� �������̵��ؼ� ����Ѵ�.
		return new Runnable() {
			
			@Override
			public void run() {
				//i=10; run���� ���� �������� final
				System.out.println(i);
				System.out.println(num);
			
				
			}
		}; //return
		
	}//Runnable
	//���2
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Runnable �� ������ �͸��� Ŭ���� ���� ");
			
		}
	};	
	
}

public class AnnoyMousInnerMain {

	public static void main(String[] args) {
		Outer2 out=new Outer2();
		Runnable runnable= out.getRunnable(10);
		runnable.run();//���1
		out.runner.run();  //���2

	}

}
