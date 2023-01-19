package Chapter17.arraylist_stack_queue;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		
		ArrayList<UserInfo> arr=new ArrayList<>();
		
		outer : while(true) {
			System.out.print("아이디 생성 : ");
			Scanner sc=new Scanner(System.in);
			
			UserInfo ui=new UserInfo();
			ui.setId(sc.next());
			
			//아이디 중복 체크
			for(int i = 0; i<arr.size(); i++) {
				if(ui.getId().equals(arr.get(i).getId())) {
					System.out.println("중복된 아이디입니다. 다른아이디를 입력하세요");
					continue outer;
				}
			}
			
			//중복된 아이디가 아니라면 pwd 입력받기
			System.out.print("패스워드를 입력하세요 : ");
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
