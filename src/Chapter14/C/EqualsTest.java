package Chapter14.C;

public class EqualsTest {

	public static void main(String[] args) {

		//String Ŭ������ �̹� toString���� �����ǰ� �Ǿ�����
		String str1=new String("test");
		String str2=new String("test");  
		
		Student studentLee=new Student(100, "�̻��");
		Student studentLee2=studentLee;  //String str="�ڹ�"
		Student studentSang=new Student(100, "�̻��");
		
		//������ �ּ��� �� �ν��Ͻ� ��(������ ���� ���� ����)
		System.out.println("----������ �ּ��� �� �ν��Ͻ� ��----");
		if(studentLee == studentLee2)
			System.out.println("studentLee�� studentLee2�� �ּҴ� �����ϴ�.");
		else
			System.out.println("studentLee�� studentLee2�� �ּҴ� �ٸ��ϴ�.");
			
		if(studentLee.equals(studentLee2))
			System.out.println("studentLee�� studentLee2�� �ּҴ� �����մϴ�.");
		else
			System.out.println("studentLee�� studentLee2�� �ּҴ� �������� �ʽ��ϴ�.");
		
		//������ �ּҴ� �ٸ����� �������� ����
		System.out.println("----������ �ּҴ� �ٸ����� �������� ����(equals)----");
		if(studentLee == studentSang)
			System.out.println("studentLee�� studentSang�� �ּҴ� �����ϴ�.");
		else
			System.out.println("studentLee�� studentSang�� �ּҴ� �ٸ��ϴ�.");
		
		if(studentLee.equals(studentSang))
			System.out.println("studentLee�� studentSang�� �ּҴ� �����մϴ�.");
		else
			System.out.println("studentLee�� studentSang�� �ּҴ� �������� �ʽ��ϴ�.");
		System.out.println();
		
		System.out.println("==========������ �� ���=============");
		System.out.println("studentLee�� hashcode : "+studentLee.hashCode());
		System.out.println("studentLee2�� hashcode : "+studentLee2.hashCode());
		System.out.println("studentSang�� hashcode : "+studentSang.hashCode());
		
		System.out.println("==========������ ���� ������ hash���� �ٸ��Ƿ� �����ǰ� �ʿ�=============");
		System.out.println("studentLee�� ���� �ּҰ� : "+System.identityHashCode(studentLee));
		System.out.println("studentLee2�� ���� �ּҰ� : "+System.identityHashCode(studentLee2));
		System.out.println("studentSang�� ���� �ּҰ� : "+System.identityHashCode(studentSang));
		System.out.println();
		//HashCode�� �����ǰ� �Ǿ�����
		System.out.println("----StringŬ������ ������ ���-----");
		System.out.println("str1�� hashcode : "+str1.hashCode());
		System.out.println("str2�� hashcode : "+str2.hashCode());
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}

}
