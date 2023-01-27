package Chapter22;

public class Account {

	
	int balance = 1000; //�ܾ�
			
	//��� Method
	public synchronized void withdraw(int money) {
		
		if(balance<money) {
			
			try {
				wait();			//Thread�� �Ͻ������� ��������
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		balance-=money;
	}//withdraw
	
	//�Ա� Method
	public synchronized void deposit(int money) {
		balance+=money;
		notify();			// <=>wait(); ������ Thread ����
		
	}
}
/*
 MultiThread ȯ�濡�� ����ؾ��� Thread���� ����ȭ
ex) Thread���� �����ϴ� Data�� ������ ��� �����ϰ� �����ϴ� �������� ����ȭ ���� �ʿ�
�ڹٿ����� synchronized Ű���带 ���� ����ȭ 
 */
