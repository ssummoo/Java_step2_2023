package Chapter15.A_StringB;

public class StBufferMain {

	public static void main(String[] args) {

		StringBuffer buf=new StringBuffer("NICE DAY")	;
		
		System.out.println(buf.toString());
		System.out.println(buf.length());
		//StringBuffer�� �⺻ �뷮 16 + �߰���(8) = 24
		System.out.println(buf.capacity());
		//24�� �Ѿ�� ������(25~50)������ 50 / 51~ : ���� �ִ� �뷮
		buf.ensureCapacity(51);
		System.out.println(buf.capacity());
		
		buf.insert(0, "HI! ");
		System.out.println(buf);
		
		buf.insert(12, " Everbody! ");
		System.out.println(buf);
		
		buf.delete(0, 4);
		System.out.println(buf);
		

	}

}
