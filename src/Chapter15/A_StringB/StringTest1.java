package Chapter15.A_StringB;

public class StringTest1 {

	public static void main(String[] args) {
		
		String javastr=new String("JAVA "); //heap
		String androidstr=new String(" ADROID"); //heap
		
		System.out.println(javastr);
		System.out.println(javastr.hashCode());//10진수
		System.out.println(System.identityHashCode(javastr));//16진수
		
		javastr=javastr.concat(androidstr);
		
		System.out.println();
		System.out.println(javastr);
		System.out.println(System.identityHashCode(javastr));//16진수
	}
}
