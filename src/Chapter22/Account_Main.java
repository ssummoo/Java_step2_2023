package Chapter22;

import java.util.Scanner;

public class Account_Main {

	public static void main(String[] args) {
		
		Account acc=new Account();
		
		Runnable r=new AccountThread(acc);
		
		Thread t=new Thread (r);

		t.start();
		
		//Thread와는 별개로 값을 받아 입금 시키는 코드
		
		while(true) {
			System.out.print("입금할 돈을 입력하세요 : ");
			Scanner scan=new Scanner(System.in);
			int n = scan.nextInt()	;
			acc.deposit(n);
			if(acc.balance==0)
				break;
		}
	}

}
