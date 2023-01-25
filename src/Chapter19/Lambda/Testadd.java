package Chapter19.Lambda;

public class Testadd {

	public static void main(String[] args) {
		
		//Lambda : 메소드이름이 없음/ 구현부만 존재
		Add addF=(x, y) ->x+y;		
		System.out.println(addF.add(3, 5));
	}

}
