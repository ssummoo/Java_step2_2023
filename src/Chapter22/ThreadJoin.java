package Chapter22;

public class ThreadJoin implements Runnable {

	public static void main(String[] args) {
		System.out.println("����Ŭ���� ����");
		
		ThreadJoin t1=new ThreadJoin();
		Thread JThread=new Thread(t1);		
		JThread.start();
		
		try {
			JThread.join(); 			//Thread�� run()�޼ҵ�� Main()�޼ҵ尡 Join	
		} catch (Exception e) {			// run()�޼ҵ尡 ������ ����ɶ����� ��ٸ�
			e.printStackTrace();
		}
		
		System.out.println("����Ŭ���� ����");

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
