package Chapter10.C01;

import Chapter09.Customer.Customer;
import Chapter09.Customer.VIPCustomer;

public class OverridingTest2 {

	public static void main(String[] args) {

		//�θ�=�ڽ� (�ڵ�����ȯ)
		Customer vc=new	VIPCustomer(10003, "��ġ", 20000);
		System.out.println(vc.showCustomer());

	}

}
