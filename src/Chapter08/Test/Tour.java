package Chapter08.Test;

import java.util.Scanner;

public class Tour {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Guest gt = new Guest();

		System.out.print("관광객 수를 입력하세요 : ");
		int a = scan.nextInt();
		Guide gd = new Guide(a);

		// 관광객 등록

		while (true) {
			for (int i = 0; i < a; i++) {
				System.out.print((i + 1) + ". 이름 : ");
				gd.guest[i].setName(scan.next());
				System.out.print((i + 1) + ". 성별 : ");
				gd.guest[i].setGender(scan.next());
				System.out.println("==================");
			}
			break;
		}
		boolean run = true;
		while (run) {

			System.out.println("원하는 번호를 입력하세요");
			System.out.println("1. 관광객 정보\t2. 목적지 변경\t3.종료");
			System.out.print("선택 >>> ");
			int n = scan.nextInt();

		switch (n) {
			case 1:
				System.out.println("관광객 정보");
				for (int j = 0; j < a; j++) {
					System.out.println(j+1+"이름 : "+gd.guest[j].getName());
					System.out.println(j+1+"성별 : "+gd.guest[j].getGender());
					System.out.println(j+1+"목적지 : "+gd.guest[j].getPoint());
					System.out.println("============");
				} // for
				break;
			case 2:
					System.out.println("목적지 변경");
					System.out.print("어디로 변경하시겠습니까 :  ");
					Guide.point = scan.next();
					System.out.println(Guide.point + "로 목적지 변경");
					System.out.println("================");
					break;
			case 3:
					System.out.println("이용해주셔서 감사합니다.");
					run = false;
					break;
			}// switch

		} // while

	}// main

}// class
