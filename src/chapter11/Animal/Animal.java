package chapter11.Animal;

public abstract class Animal {//�߻�Ŭ����

	public String kind;
	
	public void breathe() {
		System.out.println("���� ���ϴ�.");		
	}
	//�߻�޼ҵ�
	public abstract void sound();
}
