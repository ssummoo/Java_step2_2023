package Chapter14.Wrapper;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {

		//AutoBoxing
		Integer obj=100;
		System.out.println("value : "+obj.intValue());//-> ��ڽ�
		
		//obj�� ��ڽ����� �ڵ� ��ȯ
		int value = obj;
		System.out.println("value : "+value);
		
		//����� �ڵ� UnBoxing
		
		int result=obj+100;
		System.out.println("result : "+result);
		
	}

}
