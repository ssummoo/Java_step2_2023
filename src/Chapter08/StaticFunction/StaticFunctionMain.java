package Chapter08.StaticFunction;

public class StaticFunctionMain {

	public static void main(String[] args) {

		StaticFunction st=new StaticFunction();
		System.out.println(st.str2);
		String s=st.getStatic();
		System.out.println(s);
		

		//static �޼ҵ�� Ŭ���������� ������ ���� -> ��ü ���� ���� ��� ����
		String str;
		str=StaticFunction.getStatic();
		System.out.println(str);
		
	}

}
