package Chapter14.G;

public class SystemTimeMain {

	public static void main(String[] args) {

		long time1=System.nanoTime();
		
		int sum=0;
		for(int i = 0; i<100000; i++) {
			sum+=i;
		}
		long time2=System.nanoTime();
		
		System.out.println("1 ~ 100000 ������ �� : " + sum);
		System.out.println("�Ի꿡 �ҿ�Ǵ� �ð� : "+(time2-time1)+" �����ʰ� �ҿ�Ǿ����ϴ�.");
	}

}
