package Chapter22;

import java.util.Scanner;

public class Account_Main {

	public static void main(String[] args) {
		
		Account acc=new Account();
		
		Runnable r=new AccountThread(acc);
		
		Thread t=new Thread (r);

		t.start();
		
		//Thread�ʹ� ������ ���� �޾� �Ա� ��Ű�� �ڵ�
		
		while(true) {
			System.out.print("�Ա��� ���� �Է��ϼ��� : ");
			Scanner scan=new Scanner(System.in);
			int n = scan.nextInt()	;
			acc.deposit(n);
			if(acc.balance==0)
				break;
		}
	}

}
