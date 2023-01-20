package Chapter18.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapTest3 {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();

		map.put("Spring", "123");
		map.put("Summer", "1234");
		map.put("Fall", "12345");
		map.put("Winter", "123456");

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("���̵�� ��й�ȣ�� �Է��ϼ��� ");
			System.out.print("���̵� : ");
			String id = scan.next();
			System.out.println();

			if (map.containsKey(id)) {
				System.out.print("��й�ȣ : ");
				String pw = scan.next();
				if (map.get(id).equals(pw)) {
					System.out.println("�α��� ����");
					break;
				} else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
					continue;
				} // inner if
			} else {
				System.out.println("���̵� �������� �ʽ��ϴ�.");
			} // outif
		} // while
	}
}
