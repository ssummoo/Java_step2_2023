package Chapter17.arraylist_stack_queue;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		
		ArrayList<UserInfo> arr=new ArrayList<>();
		
		outer : while(true) {
			System.out.print("���̵� ���� : ");
			Scanner sc=new Scanner(System.in);
			
			UserInfo ui=new UserInfo();
			ui.setId(sc.next());
			
			//���̵� �ߺ� üũ
			for(int i = 0; i<arr.size(); i++) {
				if(ui.getId().equals(arr.get(i).getId())) {
					System.out.println("�ߺ��� ���̵��Դϴ�. �ٸ����̵� �Է��ϼ���");
					continue outer;
				}
			}
			
			//�ߺ��� ���̵� �ƴ϶�� pwd �Է¹ޱ�
			System.out.print("�н����带 �Է��ϼ��� : ");
			Scanner sc2=new Scanner(System.in);
			ui.setPwd(sc.nextInt());
			
			arr.add(ui);
			
			for (int i = 0; i<arr.size();i++) {
				System.out.println(arr.get(i).getId());
				System.out.println(arr.get(i).getPwd());
				System.out.println("-----------------------------");
			}
		}
	}
}
