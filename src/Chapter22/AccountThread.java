package Chapter22;

import java.util.Random;

public class AccountThread implements Runnable{

	Account acc;
	
	public AccountThread(Account acc) {
		this.acc=acc;
	}
	
	
	
	
	
	
	
	
	@Override
	public void run() {
	
		while(true) {
			
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			//출금액을 100~300사이의 난수로 지정해서 
			int money=(new Random().nextInt(3)+1)*100;
			acc.withdraw(money);
			
			System.out.println("잔고 : " + acc.balance);
			
		}
		
	}

	
}
