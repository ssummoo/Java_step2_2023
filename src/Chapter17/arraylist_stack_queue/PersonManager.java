package Chapter17.arraylist_stack_queue;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonManager {

	public void personMgr() {
		int select;
		Person p;

		ArrayList<Person> personArr = new ArrayList<Person>();

		while (true) {
			System.out.println("1. ȸ���߰� ");
			System.out.println("2. ȸ��Ż�� ");
			System.out.println("3. ȸ������ ");
			System.out.println("4. ��  ��  ");
			System.out.print("�׸� ���� ");

			Scanner scan = new Scanner(System.in);
			select = scan.nextInt();

			// if
			if (select == 1) {
				p = new Person();
				System.out.print("�̸� : ");
				p.setName(scan.next());
				System.out.print("���� : ");
				p.setAge(scan.nextInt());
				System.out.print("TEL : ");
				p.setTel(scan.next());
				System.out.println("������ ����Ǿ����ϴ�.");
				personArr.add(p);
				System.out.println();
			
			} else if (select == 2) {
				System.out.print("�̸��� �Է��ϼ��� :");
				String oname = scan.next();
				for (int i = 0; i < personArr.size(); i++) { // Ż���� �̸� == personArr�� ����� �̸��̸�
					if (oname.equals(personArr.get(i).getName()) ) {
						System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
						String otel = scan.next();
						if(otel.equals(personArr.get(i).getTel())) {
						personArr.remove(i);
						System.out.println("ȸ������ ����");
						}else
							System.out.println("ȸ�� ������ �ٽ� Ȯ���ϼ���");
					}else 
						System.out.println("ȸ�� ������ �ٽ� Ȯ���ϼ���");
					
				}
			} else if (select == 3) {
				for (int i = 0; i < personArr.size(); i++) {
					System.out.println("�̸� : " + personArr.get(i).getName());
					System.out.println("���� : " + personArr.get(i).getAge());
					System.out.println("��ȭ : " + personArr.get(i).getTel());
					System.out.println("=====================================");
				}
				System.out.println("�� ȸ���� : "+personArr.size());
			} else if (select == 4) {
				System.out.println("�ý��� ����");
				break;
			} else {
				System.out.println("�ùٸ���ȣ�� �Է��ϼ���");
			}
		}

	}

}
