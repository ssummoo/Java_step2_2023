package Chapter17.linkedlist;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {

		//Ư�� �ε������� ��ü�� �����ϰų� �߰��ϰ� �Ǹ� �ٷ� �� �� ��ũ�� ����
		//����� ��ü ���� ������ �Ͼ�� ������ Arraylist���� ���� ����
		
		LinkedList<String> mylist=new LinkedList<String>();
		
		mylist.add("A");
		mylist.add("B");
		mylist.add("C");
		
		System.out.println(mylist);
		
		mylist.add(1, "D");
		System.out.println(mylist);
		
		mylist.addFirst("0");
		System.out.println(mylist);
		mylist.removeLast();
		System.out.println(mylist);
		
		
		
		mylist.addLast("Z");
		System.out.println(mylist);
		
	}

}
