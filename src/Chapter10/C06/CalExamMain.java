package Chapter10.C06;

public class CalExamMain {

	public static void main(String[] args) {

		CalPlus p = new CalPlus();
		CalMinus m = new CalMinus();

		System.out.println("CalPlus : " + p.getResult(30, 15));
		System.out.println("CalMinus : " + m.getResult(30, 15));
	}

}
