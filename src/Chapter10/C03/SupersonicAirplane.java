package Chapter10.C03;

public class SupersonicAirplane extends Airplane{

	//�ʵ�(��������, ������ �� ���� ����
	//NORMAL=1 SUPERSONIC=2
	public static final int NORMAL=1;
	public static final int SUPERSONIC=2;
	public int flymode=NORMAL; //1
	//�������̵��� �̿��Ͽ� flymode�� SUPERSONIC�̸� �����Ӻ����Դϴ�. �׷��� ������ Airplane�� fly�� �����Ѵ�.

	@Override
	public void fly() {
		if(flymode==SUPERSONIC) {
			System.out.println("������ �����Դϴ�.");
		}else { 
			super.fly();	
		}
}
}
