package Chapter19.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		
		List<String> sList=new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		//List => Stream
		Stream<String> stream=sList.stream();
		//Element가 들어오면 출력하라는 Lambda식 구현	
		stream.forEach(s -> System.out.print(s+" "));
		System.out.println();
		
		//forEach대신 
		for(String s : sList) {
			System.out.print(s+" ");
		}
		System.out.println();
	
		System.out.println("====정렬 후====");
		sList.stream().sorted().forEach(s->System.out.print(s+" "));
		System.out.println();
		
		sList.stream().map(s -> s.length()).forEach(n->System.out.print(n+" "));
		System.out.println();
		sList.stream().filter(s->s.length() >=5).forEach(s->System.out.print(s+" "));
		
	}

}
