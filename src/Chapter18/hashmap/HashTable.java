package Chapter18.hashmap;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTable {
//Hashtable : 동기화
	public static void main(String[] args) {

		Map<String, String> map = new Hashtable<String, String>();

		map.put("Spring", "123");
		map.put("Summer", "1234");
		map.put("Fall", "12345");
		map.put("Winter", "123456");

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("아이디와 비밀번호를 입력하세요 ");
			System.out.print("아이디 : ");
			String id = scan.next();
			System.out.println();

			if (map.containsKey(id)) {
				System.out.print("비밀번호 : ");
				String pw = scan.next();
				if (map.get(id).equals(pw)) {
					System.out.println("로그인 성공");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
					continue;
				} // inner if
			} else {
				System.out.println("아이디가 존재하지 않습니다.");
			} // outif
		} // while
	}
}
