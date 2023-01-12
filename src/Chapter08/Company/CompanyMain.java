package Chapter08.Company;

public class CompanyMain {

	public static void main(String[] args) {
		//heap皋葛府 / 老馆利牢 按眉 积己
		Company company1=new Company();
		Company company2=new Company();
	
		System.out.println(company1);
		System.out.println(company2);
 
		System.out.println("======singleton======");
		//Data康开
		
		Company myCompany1=Company.getInstance();
		Company myCompany2=Company.getInstance();

		System.out.println(myCompany1);
		System.out.println(myCompany2);
		System.out.println(myCompany1==myCompany2);
	}

}
