package Chapter15.A_StringB;

public class StBufferMain2 {

	public static void main(String[] args) {

		String javaStr = new String("Java");
		//ó�� ������ �޸��� �ּ�
		System.out.println("javaStr�� ó�� ������ �޸� �ּ� : " + System.identityHashCode(javaStr));
		
		StringBuffer buffer= new StringBuffer(javaStr);
		
		System.out.println("���� �� buffer�� �޸� �ּ� : " + System.identityHashCode(buffer));
		buffer.append(" and ");
		buffer.append("JSP  ");
		buffer.append("programming is not fun!!  ");
		System.out.println("���� �� buffer�� �޸� �ּ� : " + System.identityHashCode(buffer));
		
		//Type Error => toString() ó���ؼ� Type ��ġȭ 
		System.out.println(buffer);
		javaStr=buffer.toString();
		System.out.println("���� ������� javaStr �޸� �ּ� : "+System.identityHashCode(javaStr));
		
		
	}
}