package Chapter18.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {

	public static void main(String[] args) {

	//Map<String, Integer>생성 객체명 map 
		Map<String, Integer> map= new HashMap<>();
			
	//팀원 데이터<이름, 번호1~5> 저장
		map.put("박창훈", 111);
		map.put("이석진", 222);
		map.put("이세정", 333);
		map.put("박찬우", 444);
		map.put("장준근", 555);
		map.put("한성무", 666);
	
	//팀 인원 출력
		System.out.println("팀원의 수 : "+map.size());
		
	//팀장 번호 알아내기
		System.out.println("\t팀장 박창훈 : "+map.get("박창훈"));
		
	//팀원 모두의 학번 출력
		Set<String>	keySet=map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String key=keyIterator.next();
			Integer num=map.get(key);
			System.out.println("\t  "+key+" | "+num);
		}
		System.out.println();
	}

}
