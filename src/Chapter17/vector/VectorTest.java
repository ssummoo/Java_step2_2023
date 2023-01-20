package Chapter17.vector;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		
		Object obj;
		//크기1의 베열 선언
		
		Vector<Object> vec=new Vector<Object>(1);
		obj=20221227;
		vec.addElement(obj); //Element추가
		System.out.println("용량(#1) : "+vec.capacity());
		//vector에 저장되어있는 엘리먼트의 수
		System.out.println("크기(#1) : "+vec.size());
		System.out.println();
		
		obj="Somebody";
		vec.addElement(obj); //Element추가
		System.out.println("용량(#2) : "+vec.capacity());
		//vector에 저장되어있는 엘리먼트의 수
		System.out.println("크기(#2) : "+vec.size());
		System.out.println();
		
		obj="I have a Dream";
		vec.addElement(obj); //Element추가
		System.out.println("용량(#3) : "+vec.capacity());
		//vector에 저장되어있는 엘리먼트의 수
		System.out.println("크기(#3) : "+vec.size());
		System.out.println();
		
		obj="CURRY";
		vec.addElement(obj); //Element추가
		System.out.println("용량(#4) : "+vec.capacity());
		//vector에 저장되어있는 엘리먼트의 수
		System.out.println("크기(#4) : "+vec.size());
		System.out.println();
		
		
		obj="TOT SUCKS";
		vec.addElement(obj); //Element추가
		System.out.println("용량(#5) : "+vec.capacity());
		//vector에 저장되어있는 엘리먼트의 수
		System.out.println("크기(#5) : "+vec.size());
		System.out.println();
		
		obj="BREAKING BADS";
		vec.addElement(obj); //Element추가
		System.out.println("용량(#6) : "+vec.capacity());
		//vector에 저장되어있는 엘리먼트의 수
		System.out.println("크기(#6) : "+vec.size());
		System.out.println();
		
		obj="GREGORY HOUSE";
		vec.addElement(obj); //Element추가
		System.out.println("용량(#7) : "+vec.capacity());
		//vector에 저장되어있는 엘리먼트의 수
		System.out.println("크기(#7) : "+vec.size());
		System.out.println();
		
		obj="HOMELAND";
		vec.addElement(obj); //Element추가
		System.out.println("용량(#8) : "+vec.capacity());
		//vector에 저장되어있는 엘리먼트의 수
		System.out.println("크기(#8) : "+vec.size());
		System.out.println();
		
		obj="NETFLIX";
		vec.addElement(obj); //Element추가
		System.out.println("용량(#9) : "+vec.capacity());
		//vector에 저장되어있는 엘리먼트의 수
		System.out.println("크기(#9) : "+vec.size());
		System.out.println();
		
		System.out.println(vec);

	}

}
