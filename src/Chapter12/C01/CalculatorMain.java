package Chapter12.C01;

public class CalculatorMain {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=5;
		
		Calc calc=new CompleteCalc2();
		System.out.println("=====default Method======");
		calc.description();//����Ʈ�޼ҵ� ȣ��
		System.out.println();
		
		System.out.println("======static Method======");
		int[] arr= {1,2,3,4,5};
		System.out.println("1~5������ �� : "+Calc.total(arr));//static �޼ҵ� ȣ��
		System.out.println();

		System.out.println("======�������̽� Method======");
		System.out.println("num1 + num2 = "+calc.add(num1, num2));
		System.out.println("num1 - num2 = "+calc.substract(num1, num2));
		System.out.println("num1 x num2 = "+calc.times(num1, num2));
		System.out.println("num1 / num2 = "+calc.divide(num1, num2));
		System.out.println();
		
		System.err.println("=====child method========");
		CompleteCalc2 calc2=new CompleteCalc2();
		calc2.showInfo();
	}

}
