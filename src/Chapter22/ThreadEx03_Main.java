package Chapter22;

public class ThreadEx03_Main {

	public static void main(String[] args) {
		//Multi Thread
		ThreadEx03 t1=new ThreadEx03();//1
		ThreadEx03_2 t2=new ThreadEx03_2();//2
		
		t1.start();
		t2.start();
		//�����ư��鼭 �����
		
		
	}

}
