package Chapter19.Stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {

		List<TravelCustomer> customerList=new ArrayList<TravelCustomer>();
		
		//객체 생성
		TravelCustomer tc1=new TravelCustomer("Tomas", 19, 200000);
		TravelCustomer tc2=new TravelCustomer("Edward", 25, 500000);
		TravelCustomer tc3=new TravelCustomer("Jack", 30, 1000000);
		
		//추가
		customerList.add(tc1);
		customerList.add(tc2);
		customerList.add(tc3);
		
		System.out.println("===고객 명단 추가된 순서대로 출력===");
		//map: 데이터를 특정조건에 해당하는 값으로 변환해줌
		customerList.stream().map(c-> c.getName()).forEach(s-> System.out.print(s+"\t"));
		System.out.println();
		//mapToInt : int 형 자료로 변환
		int total=customerList.stream().mapToInt(p->p.getPrice()).sum();
		System.out.println("총 수입 : "+total);
		//filter : 특정조건에 맞는 데이터만 출력
		System.out.println("====20세 이상의 고객만 이름 정렬하여 출력====");
		customerList.stream().filter(c -> c.getAge()>=20).
								map(c->c.getName()).sorted().
								forEach(s->System.out.print(s+" "));
	}

}
