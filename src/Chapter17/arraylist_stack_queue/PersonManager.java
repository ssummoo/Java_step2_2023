package Chapter17.arraylist_stack_queue;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonManager {

	public void personMgr() {
		int select;
		Person p;

		ArrayList<Person> personArr = new ArrayList<Person>();

		while (true) {
			System.out.println("1. 회원추가 ");
			System.out.println("2. 회원탈퇴 ");
			System.out.println("3. 회원정보 ");
			System.out.println("4. 종  료  ");
			System.out.print("항목 선택 ");

			Scanner scan = new Scanner(System.in);
			select = scan.nextInt();

			// if
			if (select == 1) {
				p = new Person();
				System.out.print("이름 : ");
				p.setName(scan.next());
				System.out.print("나이 : ");
				p.setAge(scan.nextInt());
				System.out.print("TEL : ");
				p.setTel(scan.next());
				System.out.println("정보가 저장되었습니다.");
				personArr.add(p);
				System.out.println();
			
			} else if (select == 2) {
				System.out.print("이름을 입력하세요 :");
				String oname = scan.next();
				for (int i = 0; i < personArr.size(); i++) { // 탈퇴할 이름 == personArr에 저장된 이름이면
					if (oname.equals(personArr.get(i).getName()) ) {
						System.out.print("전화번호를 입력하세요 : ");
						String otel = scan.next();
						if(otel.equals(personArr.get(i).getTel())) {
						personArr.remove(i);
						System.out.println("회원정보 삭제");
						}else
							System.out.println("회원 정보를 다시 확인하세요");
					}else 
						System.out.println("회원 정보를 다시 확인하세요");
					
				}
			} else if (select == 3) {
				for (int i = 0; i < personArr.size(); i++) {
					System.out.println("이름 : " + personArr.get(i).getName());
					System.out.println("나이 : " + personArr.get(i).getAge());
					System.out.println("전화 : " + personArr.get(i).getTel());
					System.out.println("=====================================");
				}
				System.out.println("총 회원수 : "+personArr.size());
			} else if (select == 4) {
				System.out.println("시스템 종료");
				break;
			} else {
				System.out.println("올바른번호를 입력하세요");
			}
		}

	}

}
