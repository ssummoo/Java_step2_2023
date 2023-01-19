package Chapter12.C06;

import java.util.Scanner;

public class SchedulerMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println();
			System.out.println("R or r : �Ѹ� ���ʷ� �Ҵ�");
			System.out.println("L or l : ����ְų� ��Ⱑ ���� �������� �Ҵ�");
			System.out.println("P or p : ���� Skill���� ���� �������� �Ҵ�");
			System.out.println("S or s : ����");
			System.out.print("��ȭ ��� ����� �����ϼ��� : ");
			// ���ڸ� ASCI�ڵ�� ����ȯ
			int select = sc.next().charAt(0);
			// charAt(0) ����(char) or ���ڿ�(String) => ASCII (int��)
			Scheduler scheduler = null;

			// ��ü ����
			if ('R' == select || 'r' == select) {
				scheduler = new RoundRobin();
			} else if ('L' == select || 'l' == select) {
				scheduler = new LeastJob();
			} else if ('P' == select || 'p' == select) {
				scheduler = new PriorityAllocation();
			} else if ('S' == select || 's' == select) {
				System.out.println("�ý��� ����");
				break;
			} else {
				System.err.println("�߸��� ���ڸ� �Է��Ͽ����ϴ�.");
				continue;
			} // if
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
		} // while

	}// main

}// class
