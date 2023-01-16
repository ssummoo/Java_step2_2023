package Chapter09.Phone;

public class DmbCellPhoneMain {

	public static void main(String[] args) {
		
		DmbCellPhone dmbCellPhone=new DmbCellPhone("JAVA폰", "검정", 10);
		
		//CellPhone으로부터 상속받을 필드
		System.out.println(dmbCellPhone.model);
		System.out.println(dmbCellPhone.color);
		System.out.println("============");
		dmbCellPhone.model="사과폰";
		dmbCellPhone.color="로즈골드";
		System.out.println(dmbCellPhone.model);
		System.out.println(dmbCellPhone.color);
		System.out.println("============");
		
		//DmbCellPhone의 필드
		System.out.println(dmbCellPhone.channel);
		System.out.println("============");
		dmbCellPhone.channel=11;
		System.out.println(dmbCellPhone.channel);
		System.out.println("============");
		
		//CellPhone의 메소드를 사용하여 통화
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("담탐?");
		dmbCellPhone.receiveVoice("GOGO");
		dmbCellPhone.hangUp();
		dmbCellPhone.powerOff();
		System.out.println("============");
		//DmbCellPhone 메소드를 사용하여 채널 변경
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannel(07);
		dmbCellPhone.turnOffDmb();
	}

}
