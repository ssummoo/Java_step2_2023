package Chapter18.treemap;

import java.util.Iterator;
import java.util.TreeMap;

import Chapter17.Member;
import Chapter17.Member2;
import Chapter17.treeset.Member3;

public class MemberTreehMap {

	
	private TreeMap<Integer, String> treeMap;
	
	public MemberTreehMap() {
		treeMap=new TreeMap<Integer, String>();
		
	}
	public void addMember(Member3 memberLee) {
		
		treeMap.put(memberLee.getMemberId(), memberLee.getMemberName());
	}

	public boolean removeMember(int memberId) {

		while (treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
				return true;
			}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}

	// 출력 showAllMember2

	public void showAllMember() {
		
		Iterator<Integer> ir=treeMap.keySet().iterator();
			while(ir.hasNext()) {
				int key =ir.next();
				String member=treeMap.get(key);
				System.out.println(member);
			}			
		System.out.println();
	}
}


