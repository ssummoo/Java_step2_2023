package Chapter14.B;

public class StringTest {

	public static void main(String[] args) {
		
		String str="";
		String str1="Hi everyone";
		String str2="Bye";
		
		System.out.println(System.identityHashCode(str1));
		
		str=str1+str2;
		System.out.println(System.identityHashCode(str1));  //�ּ� ����
		System.out.println(str);
		//str1�� �ٸ��ּ� ����
		str1=str1.concat(str2);
		System.out.println(System.identityHashCode(str1)); //���ο� �ּҷ� �ٲ�		
		//str1�� �����ּ� ����
		str=str1.concat(str2);
		System.out.println(System.identityHashCode(str1)); //���ο� �ּҷ� �ٲ�		
		
		System.out.println("str1�� ���ڼ� : "+str1.length());
		System.out.println("str2�� ���ڼ� : "+str2.length());

		System.out.println("str1�� B���� ��ġ : "+str1.indexOf('B'));
		System.out.println("str2�� y���� ��ġ : "+str2.indexOf('y'));

		System.out.println("str1�� ��μҹ��� : "+str1.toLowerCase());
		System.out.println("str2�� ��μҹ��� : "+str2.toLowerCase());
		
		System.out.println("str1�� ��δ빮�� : "+str1.toUpperCase());
		System.out.println("str2�� ��δ빮�� : "+str2.toUpperCase());
		
	}
}
