package Chapter13.C04;

class Outer2{
	// 익명의 클래스는 인스턴스 이름이 없다.

	//방법1
	Runnable getRunnable(int i) {
		int num=100;
		//new와 동시에 부모클래스 Runnable의 run메소드를 상속받으므로 추상 메소드인 run을 반드시 오버라이딩해서 사용한다.
		return new Runnable() {
			
			@Override
			public void run() {
				//i=10; run값에 들어가는 변수값은 final
				System.out.println(i);
				System.out.println(num);
			
				
			}
		}; //return
		
	}//Runnable
	//방법2
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Runnable 이 구현된 익명의 클래스 변수 ");
			
		}
	};	
	
}

public class AnnoyMousInnerMain {

	public static void main(String[] args) {
		Outer2 out=new Outer2();
		Runnable runnable= out.getRunnable(10);
		runnable.run();//방법1
		out.runner.run();  //방법2

	}

}
