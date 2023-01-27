package Chapter22;

public class Thread_inter_Main implements Runnable{

	public static void main(String[] args) {
		System.out.println("메인 클래스 시작 !");
		Thread_inter_Main t1= new Thread_inter_Main();
		//t1.run();
		Thread mThread=new Thread(t1); //일반 클래스의 객체를 Thread로 변환
		mThread.start();
		System.out.println("메인 클래스 종료 !");

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
	
	
/*
   //일반 메소드 호출(run)
		 메인 클래스 시작 !
		run() Method 수행 !
		first() Method 수행 !
		second() Method 수행 !
		메인 클래스 종료 !
	//Thread로 변환된 클래스 실행(start)
		 메인 클래스 시작 !
		메인 클래스 종료 !
		run() Method 수행 !
		first() Method 수행 !
		second() Method 수행 !

 */
