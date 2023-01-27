package Chapter22;


public class DaeMonThread_Main implements Runnable{
	
	static boolean autoSave=false; //자동저장기능 OFF
	

	public static void main(String[] args) {
		// Runnable의 run()은 Thread의 객체로 반드시 변환하여 사용해야 Thread로 활용가능
	DaeMonThread_Main dm=new DaeMonThread_Main();
	Thread t=new Thread(dm);  //Thread 객체로 변환
	//데몬Thread로 설정 : 메인이 종료되면 함께 종료
	t.setDaemon(true);
	t.start();
	for(int i=1; i<=15; i++) {
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(i);
		
		if(i==3) //3초 뒤에 저장 모드로 전환
			autoSave=true;
	}
		
	
	}
	//3초마다 저장을 무한반복
	@Override
	public void run() {
		
		while(true) {			
			try {
				Thread.sleep(3000);//3초마다	
			} catch (Exception e) {
				e.printStackTrace();
			}
			if(autoSave=true) {
				System.out.println("자동저장");
			}
		}
		
	}
}
