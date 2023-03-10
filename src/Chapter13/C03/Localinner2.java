package Chapter13.C03;

class Outer{
	
	//외부 클래스 멤버변수
	int outNum=100;
	static int sNum=200;
	
	//Runnable 매개변수와 멤버변수는  final로 정의된다.
	//Runnable Data영역에 들어가며 익명의 클래스
	Runnable getRunnable(int i) {
		
		int num=100; //final
		
		class MyRunnable implements Runnable {
			int localNum=10; //내부 클래스의 멤버변수
			@Override
			public void run() {
				//num=200; //final
				//i=100;
				System.out.println("i="+i);
				System.out.println("num="+num);
				System.out.println("localNum="+localNum);
				System.out.println("outNum="+outNum+"외부");
				
				System.out.println("Outer.sNum="+Outer.sNum+"외부 Data영역");
				
			}//run			

		}//Runnable
		
		
		return new MyRunnable();
		
	}//method
	
	
	
}//outer class

public class Localinner2 {

	public static void main(String[] args) {
		Outer out=new Outer();
		Runnable runner=out.getRunnable(10);
		runner.run();
		
	}

}
