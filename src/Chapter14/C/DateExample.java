package Chapter14.C;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		
		Date now =new Date();
		System.out.println(now);
		
		String strNow1=now.toString(); //toString : ��ü(heap) =>  String Ÿ������ ��ȯ 
		System.out.println("=======DATA=======");
		System.out.println(strNow1);  // String Ÿ������ ������
		
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		String strNow2=sdf.format(now);
		//String strNow2=sdf.toString().;// ��ü ��ȯ(heap)
		System.out.println("=======DATA=======");
		System.out.println(strNow2); 
		System.out.println();
		
		
		
	}
}
