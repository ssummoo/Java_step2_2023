package chapter11.Phone;

public class PhoneMain {

	public static void main(String[] args) {

		//Phone phone=new Phone();  //(X)
		SmartPhone smartPhone=new SmartPhone("������");
		
		System.out.println(smartPhone.owner+"��");
		smartPhone.turnOn();
		smartPhone.intersearch();
		smartPhone.turnOff();
		
	}

}
