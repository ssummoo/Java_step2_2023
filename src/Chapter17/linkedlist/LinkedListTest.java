package Chapter17.linkedlist;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {

		//특정 인덱스에서 객체를 제거하거나 추가하게 되면 바로 앞 뒤 링크로 연결
		//빈번한 객체 삭제 삽입이 일어나는 곳에서 Arraylist보다 성이 좋다
		
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
