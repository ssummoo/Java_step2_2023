package Chapter12.C06;

import java.util.Scanner;

public class SchedulerMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println();
			System.out.println("R or r : 한명씩 차례로 할당");
			System.out.println("L or l : 비어있거나 대기가 적은 상담원에게 할당");
			System.out.println("P or p : 업무 Skill값이 높은 상담원부터 할당");
			System.out.println("S or s : 종료");
			System.out.print("전화 상담 방식을 선택하세요 : ");
			// 문자를 ASCI코드로 형변환
			int select = sc.next().charAt(0);
			// charAt(0) 문자(char) or 문자열(String) => ASCII (int로)
			Scheduler scheduler = null;

			// 객체 생성
			if ('R' == select || 'r' == select) {
				scheduler = new RoundRobin();
			} else if ('L' == select || 'l' == select) {
				scheduler = new LeastJob();
			} else if ('P' == select || 'p' == select) {
				scheduler = new PriorityAllocation();
			} else if ('S' == select || 's' == select) {
				System.out.println("시스템 종료");
				break;
			} else {
				System.err.println("잘못된 문자를 입력하였습니다.");
				continue;
			} // if
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
		} // while

	}// main

}// class
