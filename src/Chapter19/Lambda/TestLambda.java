package Chapter19.Lambda;

interface PrintString{
	void showStirng(String str);
}

public class TestLambda {

	public static void main(String[] args) {
		
//람다식
		PrintString LambdaStr=s->System.out.println(s); //함수명을 변수명으로 대체
		showMyString(LambdaStr);
		
		PrintString reStr=returnString();  //returnString()메소드안에 있는 Lambda식 구현부 호출
		reStr.showStirng("hell ");
		
	}

	
	public static void showMyString(PrintString p) { // 매개변수 구현 | p가 body
		p.showStirng("Hell lamda");
	}
	
	public static PrintString returnString() {  //반환값으로 body 구현
		return s ->System.out.println(s+"World");
		
	}
}
