package Example;

import java.util.Scanner;

public class CompanyMain {

	public static void main(String[] args) {


		//Scanner ����� ����ϱ� ���� ��ü ����
		Scanner scan=new Scanner(System.in);		
		//CompanyService Ŭ������ ����ϱ� ���� ��ü ����
		CompanyService CS= new CompanyService();		
		// while �� Ż��뵵�� ����� boolean ����
		boolean bo = true;		
		// �������� ���α׷��� ���������� �ݺ� ���� ��Ű�� ���� while�� ���
		
		while(bo)	{
			System.out.println("1. ��� ");	//saveWorker()
			System.out.println("2. �˻� ");	//search()
			System.out.println("3. ���� ");
			System.out.print(">>>>>");
			// switch-case ���� ����ϱ� ���� key�� �Է¹ޱ�
			int key = scan.nextInt();
			// ���ϴ� case���� ����ϱ� ���� �Է¹��� key�� �־��ֱ�
			switch (key) {
			case 1:
				CS.saveWorker();
				break;
			case 2:
				CS.search();
				break;
			case 3:
				System.out.println("���α׷� ����");
				bo=false;
				break;

			default:
				System.err.println("�߸��� ��ȣ�Դϴ�.");
				break;
			}//s
			
		}//w

	}//m

}
