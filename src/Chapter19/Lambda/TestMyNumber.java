package Chapter19.Lambda;

public class TestMyNumber {

	public static void main(String[] args) {
		
		//Lambda��
 		//�ν��Ͻ������濡 �����θ� ����
		MyNumber max=(x, y) -> (x>=y)? x:y;
		//�����θ� �����Ͽ� ������
		System.out.println(max.getMax(10, 20));
		/*  

		MyNumber aa=new MyNumber() {
			
			@Override
			public int getMax(int x, int y) {
				int max=(x>=y)? x:y;
				return max;
			}
		};
		System.out.println(aa.getMax(10, 20));
 */
	}

}
