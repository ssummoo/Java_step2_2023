package Chapter22;

public class ThreadJoin implements Runnable {

	public static void main(String[] args) {
		System.out.println("메인클래스 시작");
		
		ThreadJoin t1=new ThreadJoin();
		Thread JThread=new Thread(t1);		
		JThread.start();
		
		try {
			JThread.join(); 			//Thread의 run()메소드와 Main()메소드가 Join	
		} catch (Exception e) {			// run()메소드가 완전히 종료될때까지 기다림
			e.printStackTrace();
		}
		
		System.out.println("메인클래스 종료");

	}
	@Override
	public void run() {		
		System.out.println("run() Method 수행 !");
		first();		
	}
	public void first() {
		System.out.println("first() Method 수행 !");
		second();		
	}
	public void second() {
		System.out.println("second() Method 수행 !");		
	}
}
