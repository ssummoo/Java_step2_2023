package Chapter12.C01;

public class CompleteCalc2 extends CompleteCalc1 {

	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		/*
		 * 
		try {
			return num1/num2;
		} catch (ArithmeticException e) {
			return Calc.ERORR;
		}
		 */
		if(num2 !=0) {
			return num1/num2;
			
		}else {
			return Calc.ERORR;
		}
	}
	
	public void showInfo() {
		System.out.println("Calc �������̽��� �����Ͽ����ϴ�.");	
	}
	//����Ʈ �޼ҵ��� ������
	@Override
	public void description() {
		//super.description();
		System.out.println("�Ϻ��� ���� �Դϴ�.");
	}
	

}
