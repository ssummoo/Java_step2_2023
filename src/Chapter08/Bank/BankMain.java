package Chapter08.Bank;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class BankMain {

	public static void main(String[] args) {
		/*
		//���1
		Bank bk1=new Bank("������", "010-1111-2222");
		//bk1.interest=0.2f;
		Bank.interest=0.2f;
		
		bk1.getBank();
		System.out.println("==================");
		
		Bank bk2=new Bank("�ϻ���","010-2222-44444");
		bk2.getBank();
		 */
		
		//���2
		String point=null;
		String tel=null;
		Scanner s=new Scanner(System.in);
		
		point=JOptionPane.showInputDialog("������");
		tel=JOptionPane.showInputDialog("��ȭ��ȣ");
		Bank bank=new Bank(point, tel);
		
		System.out.print(point+"���� ���ڸ� �Է��ϼ��� : ");
		Bank.interest=s.nextFloat();
		
		bank.getBank();
				
	}

}
