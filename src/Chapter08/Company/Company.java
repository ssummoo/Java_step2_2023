package Chapter08.Company;

public class Company {

	//객체를 단 하나만 생성하는 클래스
	private static Company instance = new Company();
	
	//일반적인 객체생성
	public Company() {
		
	}
	//singleton 객체 생성 Method
	public static Company getInstance() {
		//예외처리
		if(instance==null) {
			instance=new Company();			
		}
		return instance;
	}
	
}
