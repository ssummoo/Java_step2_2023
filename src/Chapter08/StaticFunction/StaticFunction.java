package Chapter08.StaticFunction;

public class StaticFunction {

	String str1="일반 회원변수";
	static String str2="Static 회원변수";
	
	public static String getStatic() {
		
		//str1="VIP"; -> static 메소드는 static변수만 사용가능
		
		
		
		
		return str2;
		
	}
			
}
