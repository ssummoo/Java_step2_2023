package Chapter08.Test;

import java.util.Scanner;

public class Tour {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Guest gt = new Guest();

		System.out.print("������ ���� �Է��ϼ��� : ");
		int a = scan.nextInt();
		Guide gd = new Guide(a);

		// ������ ���

		while (true) {
			for (int i = 0; i < a; i++) {
				System.out.print((i + 1) + ". �̸� : ");
				gd.guest[i].setName(scan.next());
				System.out.print((i + 1) + ". ���� : ");
				gd.guest[i].setGender(scan.next());
				System.out.println("==================");
			}
			break;
		}
		boolean run = true;
		while (run) {

			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���");
			System.out.println("1. ������ ����\t2. ������ ����\t3.����");
			System.out.print("���� >>> ");
			int n = scan.nextInt();

		switch (n) {
			case 1:
				System.out.println("������ ����");
				for (int j = 0; j < a; j++) {
					System.out.println(j+1+"�̸� : "+gd.guest[j].getName());
					System.out.println(j+1+"���� : "+gd.guest[j].getGender());
					System.out.println(j+1+"������ : "+gd.guest[j].getPoint());
					System.out.println("============");
				} // for
				break;
			case 2:
					System.out.println("������ ����");
					System.out.print("���� �����Ͻðڽ��ϱ� :  ");
					Guide.point = scan.next();
					System.out.println(Guide.point + "�� ������ ����");
					System.out.println("================");
					break;
			case 3:
					System.out.println("�̿����ּż� �����մϴ�.");
					run = false;
					break;
			}// switch

		} // while

	}// main

}// class
