package Chapter08.Company;

public class Company {

	//��ü�� �� �ϳ��� �����ϴ� Ŭ����
	private static Company instance = new Company();
	
	//�Ϲ����� ��ü����
	public Company() {
		
	}
	//singleton ��ü ���� Method
	public static Company getInstance() {
		//����ó��
		if(instance==null) {
			instance=new Company();			
		}
		return instance;
	}
	
}
