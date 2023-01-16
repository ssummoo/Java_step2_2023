package Chapter09.Customer;

public class Customer {

	//�������
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	public double bonusPoint;
	protected double bonusRatio;
	
	//�⺻������
	public Customer()	{
		customerGrade="SILVER";
		bonusRatio=0.01;
	}
	
	public Customer(int customerID, String customerName)	{
		this.customerID=customerID;
		this.customerName=customerName;
		customerGrade="SILVER";
		bonusRatio=0.01; //����Ʈ ����
		
	}
	
	//����Ʈ�� ����
	public int calcPrice(int price) {
		bonusPoint=bonusPoint+(bonusRatio*price);
		
		return price;
	}
	
	public String showCustomer() {
		return customerName+"���� ����� "+customerGrade+"�̸� ���ʽ� ����Ʈ�� "+bonusPoint+"�� �Դϴ�.";
	}
	
	
	
	
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	public double getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public double getBonusRatio() {
		return bonusRatio;
	}
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	
	
}
