package Chapter18.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {

	public static void main(String[] args) {

	//Map<String, Integer>���� ��ü�� map 
		Map<String, Integer> map= new HashMap<>();
			
	//���� ������<�̸�, ��ȣ1~5> ����
		map.put("��â��", 111);
		map.put("�̼���", 222);
		map.put("�̼���", 333);
		map.put("������", 444);
		map.put("���ر�", 555);
		map.put("�Ѽ���", 666);
	
	//�� �ο� ���
		System.out.println("������ �� : "+map.size());
		
	//���� ��ȣ �˾Ƴ���
		System.out.println("\t���� ��â�� : "+map.get("��â��"));
		
	//���� ����� �й� ���
		Set<String>	keySet=map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String key=keyIterator.next();
			Integer num=map.get(key);
			System.out.println("\t  "+key+" | "+num);
		}
		System.out.println();
	}

}
