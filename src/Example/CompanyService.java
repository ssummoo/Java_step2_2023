package Example;

import java.util.ArrayList;
import java.util.Scanner;

public class CompanyService {

	CompanyBasics cb;
	Scanner scan = new Scanner(System.in);
	ArrayList<CompanyBasics> list = new ArrayList<>();

	public void saveWorker() {

		cb = new CompanyBasics();
		System.out.print("이름을 입력하세요 : ");
		cb.setName(scan.next());
		System.out.print("부서를 입력하세요 : ");
		cb.setPart(scan.next());
		System.out.print("주소를 입력하세요 : ");
		cb.setAddr(scan.next());
		System.out.print("생일을 입력하세요 : ");
		cb.setBirthday(scan.next());
		list.add(cb);
	}

	public void search() {
		if (list.size() == 0)
			System.out.println("저장된 직원 정보가 없습니다.");
		else {
			System.out.print("검색할 직원의 이름을 입력하세요 : ");
			String sname = scan.next();
			for (int i = 0; i < list.size(); i++) {
				if (sname.equals(list.get(i).getName())) {
				System.out.println(list.get(i));
					break;
				} else if(i+1==list.size()) {
					System.err.println("직원 이름을 확인하세요");

				}

			}

		}

	}
}