package Chapter18.hashmap;

import java.util.Iterator;
import java.util.TreeMap;

import Chapter17.Member;
import Chapter17.Member2;
import Chapter17.treeset.Member3;

public class MemberHashMap {

	
	private TreeMap<Integer, String> treeMap;
	
	public MemberHashMap() {
		treeMap=new TreeMap<Integer, String>();
		
	}
	public void addMember(Member2 memberLee) {
		
		treeMap.put(memberLee.getMemberId(), memberLee.getMemberName());
	}

	public boolean removeMember(int memberId) {

		while (treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
				return true;
			}
		
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}

	// ��� showAllMember2

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


