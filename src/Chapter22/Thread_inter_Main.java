package Chapter22;

public class Thread_inter_Main implements Runnable{

	public static void main(String[] args) {
		System.out.println("���� Ŭ���� ���� !");
		Thread_inter_Main t1= new Thread_inter_Main();
		//t1.run();
		Thread mThread=new Thread(t1); //�Ϲ� Ŭ������ ��ü�� Thread�� ��ȯ
		mThread.start();
		System.out.println("���� Ŭ���� ���� !");

	}

	@Override
	public void run() {		
		System.out.println("run() Method ���� !");
		first();		
	}
	public void first() {
		System.out.println("first() Method ���� !");
		second();		
	}
	public void second() {
		System.out.println("second() Method ���� !");		
	}
}
	
	
/*
   //�Ϲ� �޼ҵ� ȣ��(run)
		 ���� Ŭ���� ���� !
		run() Method ���� !
		first() Method ���� !
		second() Method ���� !
		���� Ŭ���� ���� !
	//Thread�� ��ȯ�� Ŭ���� ����(start)
		 ���� Ŭ���� ���� !
		���� Ŭ���� ���� !
		run() Method ���� !
		first() Method ���� !
		second() Method ���� !

 */
