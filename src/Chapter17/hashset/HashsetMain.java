package Chapter17.hashset;

import java.util.HashSet;

public class HashsetMain {

	public static void main(String[] args) {

		//equals�� hashcode�� override�� String Type
		
		HashSet<String> hashSet=new HashSet<String>();
		hashSet.add(new String("������"));
		hashSet.add(new String("������"));
		hashSet.add(new String("ȫ����"));
		hashSet.add(new String("������"));
		
		System.out.println(hashSet);
		hashSet.add(new String("������"));
		System.out.println(hashSet);

	}

}
