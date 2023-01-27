package Chapter22;

public class Account {

	
	int balance = 1000; //잔액
			
	//출금 Method
	public synchronized void withdraw(int money) {
		
		if(balance<money) {
			
			try {
				wait();			//Thread가 일시적으로 정지상태
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		balance-=money;
	}//withdraw
	
	//입금 Method
	public synchronized void deposit(int money) {
		balance+=money;
		notify();			// <=>wait(); 정지된 Thread 해제
		
	}
}
/*
 MultiThread 환경에서 고려해야할 Thread간의 동기화
ex) Thread간에 공유하는 Data가 존재할 경우 수정하고 삭제하는 과정에서 동기화 유지 필요
자바에서는 synchronized 키워드를 통해 동기화 
 */
