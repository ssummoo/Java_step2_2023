package Chapter14.C;

class Book{
	String title;
	String author;
	
	public  Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	//String�� ���ڿ��� ������ִ� toString������
	@Override
	public String toString() {
		return title+" | "+author;
	}	
}

public class ToStringEx01 {

	public static void main(String[] args) {
		Book book=new Book("�ڹ�", "ȫ�浿");
		//��ü�� heap�޸𸮸� ��� -> heap�޸𸮴� 16���� �ּҰ��� ��������
		System.out.println(book);
		System.out.println(book.title);
		System.out.println(book.author);
		//System.out.println(book.toString());  //toString �޼ҵ带 ���� ȣ��
		
		String str=new String("test");
		System.out.println(str);
		
		
		
		
		
		
}
}