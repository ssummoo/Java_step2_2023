package Chapter17.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	
	public static void main(String[] args) {

			List<String> list=new ArrayList<String>();
			
			list.add("Java");
			list.add("Oracle");
			list.add("Servlet/JSP");
			list.add(2, "Spring");
			list.add("Python");
			
			int size=list.size();
			System.out.println("�� ��ü �� : "+size);
			System.out.println();
			
			String skill=list.get(2);
			System.out.println("2�� ��ü : "+skill);
			System.out.println();
			
			for(int i = 0; i<list.size(); i++) {
				String str=list.get(i);
				System.out.println(i+" : "+str);
			}
			System.out.println();
			
			list.remove(2);
			list.remove(2);
			list.remove("Python");
			for(int i = 0; i<list.size(); i++) {
				String str=list.get(i);
				System.out.println(i+" : "+str);
			}
			
	}
}
