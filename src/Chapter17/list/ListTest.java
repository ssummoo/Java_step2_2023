package Chapter17.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		//����Ʈ ������ ���� ArrayListŬ������ ��ü����
		//�Ϲ����� �迭�� ǥ�� : String[] ls1= {};  => ������ ��ƴ�
	
		List<String> ls = new ArrayList<String>();
		//����Ʈ�� ������ �߰�
		ls.add("HI");
		ls.add("HAPPY");
		ls.add("NICE");
		
		for (int i=0; i<ls.size(); i++) {
			System.out.println(i + ":"+ls.get(i));
		}
		System.out.println();
		System.out.println("====������ �߰���====");
		
		ls.add(3, "GOOD");
		for (int i=0; i<ls.size(); i++) {
			System.out.println(i + ":"+ls.get(i));
		}
		System.out.println();
		System.out.println("====������ ������====");
		
		ls.remove(0);
		for (int i=0; i<ls.size(); i++) {
			System.out.println(i + ":"+ls.get(i));
		}
	}
}
