package Chapter09.Customer;

public class CustomerMain {

	public static void main(String[] args) {
		
		
		//VIP 고객
		System.out.println("============VIP=============");
		int price=10000;
		VIPCustomer vipcs=new VIPCustomer(1004, "홍길동", 900);
		
		int vipprice=vipcs.calcPrice(price);
		System.out.println(vipcs.getCustomerName()+"님이 "+vipprice+"원을 지불 완료하였습니다.");
		System.out.println(vipcs.showCustomer());

		//일반 고객
		System.out.println("============일반고객============");
		price=10000;
		Customer svcs=new Customer(109, "임꺽정");
		
		int svprice=svcs.calcPrice(price);
		System.out.println(svcs.getCustomerName()+"님이 "+svprice+"원을 지불 완료하였습니다.");
		System.out.println(svcs.showCustomer());
				
		
	}

}
