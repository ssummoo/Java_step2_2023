package Chapter20;

public class AutoCloseObj implements AutoCloseable{
//AutoCloseable : try(...)������ ����� ��ü�鿡 ���ؼ� try�� ����Ǵ� �������� �ڿ��� �ڵ����� �������ִ� ���	
	
	@Override
	public void close() throws Exception {
		System.out.println("���ҽ� close() �Ǿ����ϴ�.");		
	}
	
	
}
