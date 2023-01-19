package Chapter17.arraylist_stack_queue;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayEx1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();

		System.out.println("list.size() : "+list.size());
		
		list.add(100);
		list.add(20);
		System.out.println("list.size() : "+list.size());
		
		for(int i = 0; i<list.size(); i++)	
			System.out.println(list.get(i));
		System.out.println("---------------------------");
		//Index�� �����ϴ� ������ ���̰� ��������� �ӵ��� ������
		//�� �������� �ذ��ϱ� ���� Iterator ���
		
		//1) List������ �ڿ��� �ݺ��ڷ� ��ȯ
		Iterator<Integer> it=list.iterator();
		//2) �ݺ��ڸ� �ݺ������� ����
		while(it.hasNext()) {  //�ݺ��� �ȿ��� Ŀ���� �̵�
			int v = it.next();  //UnBoxing�Ͽ� ��ü�� �⺻�ڷ������� 
			System.out.println(v);
			
		}
		
		
	}

}
