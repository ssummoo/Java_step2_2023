package Chapter09.Phone;

public class DmbCellPhone extends CellPhone{

	int channel;
	
	public DmbCellPhone(String model, String color, int channel) {
		this.model=model;
		this.color=color;
		this.channel=channel;
		
	}
	void turnOnDmb () {System.out.println("ä�� "+channel+"�� DMB ��ۼ����� �����մϴ�.");}
	void changeChannel (int channel) {
		this.channel=channel;
		System.out.println("ä�� "+channel+"������ �ٲߴϴ�.");
	}
	void turnOffDmb () {System.out.println("DMB ��ۼ����� �����մϴ�.");}
	}