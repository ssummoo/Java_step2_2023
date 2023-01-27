package Chapter21.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{

	private static final long serialVersionUID = 1L;
	
	String name;
	String job;
	//transient String number;  //serialization X(byte�� ��ȯ X)

	public Person() {
		
	}
	
	public Person(String name, String job) {
		
		this.name = name;
		this.job = job;
	}
	@Override
	public String toString() {
		
		return name+" "+job;
	}
	
	
}


public class SerializationTest {

	public static void main(String[] args) {
	
		
		Person personHong=new Person("ȫ�浿", "��ǥ�̻�"); 
		Person personKim=new Person("�迬��", "���̻�"); 
		/* 
		ObjectOutputStream : �����̳� ��Ʈ��ũ�� �����͸� �����ϱ� ���� ����ȭ�� ����
		writeObject() : ����ȭ �Լ�
		 */
		
		//=============================����ȭ============================
		try (FileOutputStream fos=new FileOutputStream("serial.out");
				ObjectOutputStream oos=new ObjectOutputStream(fos)){
			//����ȭ ����
			oos.writeObject(personHong);
			oos.writeObject(personKim);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		//============================������ȭ============================
		/* 
		ObjectInputStream : �����̳� ��Ʈ��ũ�� ���� ���޹��� ����ȭ�� �����͸� �ٽ� ������� ������ ����
		readObject() : ������ȭ �Լ�
		����ȭ �ϱ��� ��ü�� ĳ�����������
		*/
		
		try (FileInputStream fis=new FileInputStream("serial.out");
				ObjectInputStream ois=new ObjectInputStream(fis)){
			
			Person p1=(Person)ois.readObject();
			Person p2=(Person)ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
			
		}catch (Exception e	) {
			e.printStackTrace();
		}
		
		
		
		
	}//m

}
