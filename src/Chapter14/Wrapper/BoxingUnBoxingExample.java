package Chapter14.Wrapper;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		
		
		//AutoBoxing
		Integer obj1=new Integer(100);
		Integer obj2=new Integer(200);
		Integer obj3=Integer.valueOf(300);
		
		Integer total1=obj1+obj2;
		Integer total2=obj2+obj3;
		
		System.out.println("Integer total : " + total1);
		System.out.println("Integer total : " + total2);
		
		//UnBoxing
		
		int value1=obj1.intValue();
		int value2=obj2.intValue();
		int value3=obj3;
				
		Integer total3=value1+value2;
		Integer total4=value2+value3;
		
		System.out.println();
		
		System.out.println("Integer total : " + total3);
		System.out.println("Integer total : " + total4);
		
		
		

	}

}
