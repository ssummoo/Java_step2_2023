package Chapter09.Phone;

public class CellPhone {

	
		String model;
		String color;
		
	public void powerOn() { System.out.println("������ �մϴ�.");	}
	public void powerOff() { System.out.println("������ ���ϴ�.");	}
	public void bell() { System.out.println("���� �︳�ϴ�.");	}
	public void sendVoice(String message) { System.out.println("�ڱ��ڽ� : "+message);}
	public void receiveVoice(String message) { System.out.println("���� : "+message);	}
	public void hangUp() { System.out.println("��ȭ����");	}
	
}
