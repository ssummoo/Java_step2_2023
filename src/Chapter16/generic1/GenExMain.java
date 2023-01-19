package Chapter16.generic1;

public class GenExMain {

	public static void main(String[] args) {
		//����ڰ� ���ϴ� ���·� ��ü ����
		
		GenEx<String> v1=new GenEx<String>();
		v1.setValue("100");
		System.out.println(v1.getValue());
		
		//����, �Ǽ�, ����  //��ü���� Ÿ�Լ��� ����
		//���׸� Ÿ���� ��ü�� �⺻�ڷ���(int, double, char..)�ν� X
		//�׷��Ƿ� ���ڽ��Ͽ� ��� (int-> Integer..)
		GenEx<Integer> v2=new GenEx<Integer>();
		v2.setValue(100);
		System.out.println(v2.getValue());
		
		GenEx<Float> v3=new GenEx<Float>();
		v3.setValue(3.14f);
		System.out.println(v3.getValue());
		
		GenEx<Character> v4=new GenEx<Character>();
		v4.setValue('Z');
		System.out.println(v4.getValue());

	}

}
