package Example;

import java.util.ArrayList;
import java.util.Scanner;

public class CompanyService {

	CompanyBasics cb;
	Scanner scan = new Scanner(System.in);
	ArrayList<CompanyBasics> list = new ArrayList<>();

	public void saveWorker() {

		cb = new CompanyBasics();
		System.out.print("�̸��� �Է��ϼ��� : ");
		cb.setName(scan.next());
		System.out.print("�μ��� �Է��ϼ��� : ");
		cb.setPart(scan.next());
		System.out.print("�ּҸ� �Է��ϼ��� : ");
		cb.setAddr(scan.next());
		System.out.print("������ �Է��ϼ��� : ");
		cb.setBirthday(scan.next());
		list.add(cb);
	}

	public void search() {
		if (list.size() == 0)
			System.out.println("����� ���� ������ �����ϴ�.");
		else {
			System.out.print("�˻��� ������ �̸��� �Է��ϼ��� : ");
			String sname = scan.next();
			for (int i = 0; i < list.size(); i++) {
				if (sname.equals(list.get(i).getName())) {
				System.out.println(list.get(i));
					break;
				} else if(i+1==list.size()) {
					System.err.println("���� �̸��� Ȯ���ϼ���");

				}

			}

		}

	}
}