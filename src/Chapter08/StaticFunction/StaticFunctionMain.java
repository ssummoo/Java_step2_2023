package Chapter08.StaticFunction;

public class StaticFunctionMain {

	public static void main(String[] args) {

		StaticFunction st=new StaticFunction();
		System.out.println(st.str2);
		String s=st.getStatic();
		System.out.println(s);
		

		//static 메소드는 클래스명으로 접근이 가능 -> 객체 생성 없이 사용 가능
		String str;
		str=StaticFunction.getStatic();
		System.out.println(str);
		
	}

}
