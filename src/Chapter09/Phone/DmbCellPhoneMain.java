package Chapter09.Phone;

public class DmbCellPhoneMain {

	public static void main(String[] args) {
		
		DmbCellPhone dmbCellPhone=new DmbCellPhone("JAVA��", "����", 10);
		
		//CellPhone���κ��� ��ӹ��� �ʵ�
		System.out.println(dmbCellPhone.model);
		System.out.println(dmbCellPhone.color);
		System.out.println("============");
		dmbCellPhone.model="�����";
		dmbCellPhone.color="������";
		System.out.println(dmbCellPhone.model);
		System.out.println(dmbCellPhone.color);
		System.out.println("============");
		
		//DmbCellPhone�� �ʵ�
		System.out.println(dmbCellPhone.channel);
		System.out.println("============");
		dmbCellPhone.channel=11;
		System.out.println(dmbCellPhone.channel);
		System.out.println("============");
		
		//CellPhone�� �޼ҵ带 ����Ͽ� ��ȭ
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��Ž?");
		dmbCellPhone.receiveVoice("GOGO");
		dmbCellPhone.hangUp();
		dmbCellPhone.powerOff();
		System.out.println("============");
		//DmbCellPhone �޼ҵ带 ����Ͽ� ä�� ����
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannel(07);
		dmbCellPhone.turnOffDmb();
	}

}
