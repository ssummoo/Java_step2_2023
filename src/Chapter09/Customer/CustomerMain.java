package Chapter09.Customer;

public class CustomerMain {

	public static void main(String[] args) {
		
		
		//VIP ��
		System.out.println("============VIP=============");
		int price=10000;
		VIPCustomer vipcs=new VIPCustomer(1004, "ȫ�浿", 900);
		
		int vipprice=vipcs.calcPrice(price);
		System.out.println(vipcs.getCustomerName()+"���� "+vipprice+"���� ���� �Ϸ��Ͽ����ϴ�.");
		System.out.println(vipcs.showCustomer());

		//�Ϲ� ��
		System.out.println("============�Ϲݰ�============");
		price=10000;
		Customer svcs=new Customer(109, "�Ӳ���");
		
		int svprice=svcs.calcPrice(price);
		System.out.println(svcs.getCustomerName()+"���� "+svprice+"���� ���� �Ϸ��Ͽ����ϴ�.");
		System.out.println(svcs.showCustomer());
				
		
	}

}
