package Chapter19.Stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {

		List<TravelCustomer> customerList=new ArrayList<TravelCustomer>();
		
		//��ü ����
		TravelCustomer tc1=new TravelCustomer("Tomas", 19, 200000);
		TravelCustomer tc2=new TravelCustomer("Edward", 25, 500000);
		TravelCustomer tc3=new TravelCustomer("Jack", 30, 1000000);
		
		//�߰�
		customerList.add(tc1);
		customerList.add(tc2);
		customerList.add(tc3);
		
		System.out.println("===�� ��� �߰��� ������� ���===");
		//map: �����͸� Ư�����ǿ� �ش��ϴ� ������ ��ȯ����
		customerList.stream().map(c-> c.getName()).forEach(s-> System.out.print(s+"\t"));
		System.out.println();
		//mapToInt : int �� �ڷ�� ��ȯ
		int total=customerList.stream().mapToInt(p->p.getPrice()).sum();
		System.out.println("�� ���� : "+total);
		//filter : Ư�����ǿ� �´� �����͸� ���
		System.out.println("====20�� �̻��� ���� �̸� �����Ͽ� ���====");
		customerList.stream().filter(c -> c.getAge()>=20).
								map(c->c.getName()).sorted().
								forEach(s->System.out.print(s+" "));
	}

}
