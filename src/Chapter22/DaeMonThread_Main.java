package Chapter22;


public class DaeMonThread_Main implements Runnable{
	
	static boolean autoSave=false; //�ڵ������� OFF
	

	public static void main(String[] args) {
		// Runnable�� run()�� Thread�� ��ü�� �ݵ�� ��ȯ�Ͽ� ����ؾ� Thread�� Ȱ�밡��
	DaeMonThread_Main dm=new DaeMonThread_Main();
	Thread t=new Thread(dm);  //Thread ��ü�� ��ȯ
	//����Thread�� ���� : ������ ����Ǹ� �Բ� ����
	t.setDaemon(true);
	t.start();
	for(int i=1; i<=15; i++) {
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(i);
		
		if(i==3) //3�� �ڿ� ���� ���� ��ȯ
			autoSave=true;
	}
		
	
	}
	//3�ʸ��� ������ ���ѹݺ�
	@Override
	public void run() {
		
		while(true) {			
			try {
				Thread.sleep(3000);//3�ʸ���	
			} catch (Exception e) {
				e.printStackTrace();
			}
			if(autoSave=true) {
				System.out.println("�ڵ�����");
			}
		}
		
	}
}
