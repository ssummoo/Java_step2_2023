package Chapter19.Lambda;

public class Testadd {

	public static void main(String[] args) {
		
		//Lambda : �޼ҵ��̸��� ����/ �����θ� ����
		Add addF=(x, y) ->x+y;		
		System.out.println(addF.add(3, 5));
	}

}
