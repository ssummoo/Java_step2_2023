package Chapter10.C01;

import Chapter09.Customer.Customer;
import Chapter09.Customer.VIPCustomer;

public class OverridingTest1 {

	public static void main(String[] args) {
		
		Customer customerLee=new Customer(10001, "�̼���");
		customerLee.bonusPoint=1000;
		System.out.println(customerLee.showCustomer());

		VIPCustomer customerKim=new VIPCustomer(10002, "������", 1004);
		customerKim.bonusPoint=1000;
		System.out.println(customerKim.showCustomer());
		System.out.println();
		int price=10000;
		System.out.println(customerLee.getCustomerName() + "���� " + customerLee.calcPrice(price) + "���� ���� �Ϸ��Ͽ����ϴ�.");
		System.out.println(customerKim.getCustomerName() + "���� " + customerKim.calcPrice(price) + "���� ���� �Ϸ��Ͽ����ϴ�.");
	}
	
}
