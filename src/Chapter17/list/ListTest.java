package Chapter17.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		//리스트 구조를 갖는 ArrayList클래스의 객체생성
		//일반적인 배열로 표기 : String[] ls1= {};  => 수정이 어렵다
	
		List<String> ls = new ArrayList<String>();
		//리스트에 데이터 추가
		ls.add("HI");
		ls.add("HAPPY");
		ls.add("NICE");
		
		for (int i=0; i<ls.size(); i++) {
			System.out.println(i + ":"+ls.get(i));
		}
		System.out.println();
		System.out.println("====데이터 추가후====");
		
		ls.add(3, "GOOD");
		for (int i=0; i<ls.size(); i++) {
			System.out.println(i + ":"+ls.get(i));
		}
		System.out.println();
		System.out.println("====데이터 삭제후====");
		
		ls.remove(0);
		for (int i=0; i<ls.size(); i++) {
			System.out.println(i + ":"+ls.get(i));
		}
	}
}
