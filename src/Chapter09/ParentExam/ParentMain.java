package Chapter09.ParentExam;

public class ParentMain {

	public static void main(String[] args) {

		ChildExam c1=new ChildExam();
		
		System.out.println(c1.getCar());
		System.out.println(c1.getMoney()); //��ӹ��� ���
		System.out.println(c1.getStr());
		System.out.println("================================");
		//========================================
		if(c1 instanceof ParentExam ) {
			System.out.println("c1�� ParentExam�� �ڽ�Ŭ�����Դϴ�.");
			System.out.println(c1.getMoney());
		}

		//========================================
		//����ȯ
		ChildExam ch=new ChildExam();
		ParentExam p1=new ParentExam();
		System.out.println("================================");
		//Parent=Child
		p1=ch; //�ڵ� ����ȯ
		System.out.println(p1.getMoney());
		System.out.println(p1.getStr());
		System.out.println("================================");
		ch=(ChildExam)p1; //����� ����ȯ
		System.out.println(ch.getCar());
		System.out.println(ch.getMoney());
		System.out.println(ch.getStr());
		System.out.println("================================");
		
	
	}

}
