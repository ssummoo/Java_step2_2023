package Chapter17.vector;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		
		Object obj;
		//ũ��1�� ���� ����
		
		Vector<Object> vec=new Vector<Object>(1);
		obj=20221227;
		vec.addElement(obj); //Element�߰�
		System.out.println("�뷮(#1) : "+vec.capacity());
		//vector�� ����Ǿ��ִ� ������Ʈ�� ��
		System.out.println("ũ��(#1) : "+vec.size());
		System.out.println();
		
		obj="Somebody";
		vec.addElement(obj); //Element�߰�
		System.out.println("�뷮(#2) : "+vec.capacity());
		//vector�� ����Ǿ��ִ� ������Ʈ�� ��
		System.out.println("ũ��(#2) : "+vec.size());
		System.out.println();
		
		obj="I have a Dream";
		vec.addElement(obj); //Element�߰�
		System.out.println("�뷮(#3) : "+vec.capacity());
		//vector�� ����Ǿ��ִ� ������Ʈ�� ��
		System.out.println("ũ��(#3) : "+vec.size());
		System.out.println();
		
		obj="CURRY";
		vec.addElement(obj); //Element�߰�
		System.out.println("�뷮(#4) : "+vec.capacity());
		//vector�� ����Ǿ��ִ� ������Ʈ�� ��
		System.out.println("ũ��(#4) : "+vec.size());
		System.out.println();
		
		
		obj="TOT SUCKS";
		vec.addElement(obj); //Element�߰�
		System.out.println("�뷮(#5) : "+vec.capacity());
		//vector�� ����Ǿ��ִ� ������Ʈ�� ��
		System.out.println("ũ��(#5) : "+vec.size());
		System.out.println();
		
		obj="BREAKING BADS";
		vec.addElement(obj); //Element�߰�
		System.out.println("�뷮(#6) : "+vec.capacity());
		//vector�� ����Ǿ��ִ� ������Ʈ�� ��
		System.out.println("ũ��(#6) : "+vec.size());
		System.out.println();
		
		obj="GREGORY HOUSE";
		vec.addElement(obj); //Element�߰�
		System.out.println("�뷮(#7) : "+vec.capacity());
		//vector�� ����Ǿ��ִ� ������Ʈ�� ��
		System.out.println("ũ��(#7) : "+vec.size());
		System.out.println();
		
		obj="HOMELAND";
		vec.addElement(obj); //Element�߰�
		System.out.println("�뷮(#8) : "+vec.capacity());
		//vector�� ����Ǿ��ִ� ������Ʈ�� ��
		System.out.println("ũ��(#8) : "+vec.size());
		System.out.println();
		
		obj="NETFLIX";
		vec.addElement(obj); //Element�߰�
		System.out.println("�뷮(#9) : "+vec.capacity());
		//vector�� ����Ǿ��ִ� ������Ʈ�� ��
		System.out.println("ũ��(#9) : "+vec.size());
		System.out.println();
		
		System.out.println(vec);

	}

}
