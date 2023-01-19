package Chapter14.B;

public class StringTest {

	public static void main(String[] args) {
		
		String str="";
		String str1="Hi everyone";
		String str2="Bye";
		
		System.out.println(System.identityHashCode(str1));
		
		str=str1+str2;
		System.out.println(System.identityHashCode(str1));  //주소 같음
		System.out.println(str);
		//str1의 다른주소 생성
		str1=str1.concat(str2);
		System.out.println(System.identityHashCode(str1)); //새로운 주소로 바뀜		
		//str1의 같은주소 생성
		str=str1.concat(str2);
		System.out.println(System.identityHashCode(str1)); //새로운 주소로 바뀜		
		
		System.out.println("str1의 글자수 : "+str1.length());
		System.out.println("str2의 글자수 : "+str2.length());

		System.out.println("str1의 B글자 위치 : "+str1.indexOf('B'));
		System.out.println("str2의 y글자 위치 : "+str2.indexOf('y'));

		System.out.println("str1의 모두소문자 : "+str1.toLowerCase());
		System.out.println("str2의 모두소문자 : "+str2.toLowerCase());
		
		System.out.println("str1의 모두대문자 : "+str1.toUpperCase());
		System.out.println("str2의 모두대문자 : "+str2.toUpperCase());
		
	}
}
