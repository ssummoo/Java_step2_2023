package Chapter20;

public class AutoCloseTest2 {
	
	public static void main(String[] args) {
		
		AutoCloseObj obj=new AutoCloseObj();
		//�ڹ� 9���� �ۿ��� ���� ����
		try(obj) {
			throw new Exception()	;
		} catch (Exception e) {
			System.out.println("���� �κ� �Դϴ�.");
		}

	}

}
