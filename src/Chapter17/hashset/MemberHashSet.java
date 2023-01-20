package Chapter17.hashset;

import java.util.HashSet;
import java.util.Iterator;

import Chapter17.Member;
import Chapter17.Member2;

public class MemberHashSet {

	private HashSet<Member2> HashSet;

	// 생성자를 통한 HashSet 객체 생성
	public MemberHashSet() {
		HashSet = new HashSet<Member2>();
	}

	// addMember2
	public void addMember2(Member2 member2) {
		HashSet.add(member2);
	}

	// removeMember2 => Iterator
	public boolean removeMember2(int Member2Id) {
		Iterator<Member2> ir = HashSet.iterator();

		while (ir.hasNext()) {
			Member2 Member2 = ir.next();
			int temp = Member2.getMemberId();
			if (temp == Member2Id) {
				HashSet.remove(Member2);
				return true;
			}
		}
		System.out.println(Member2Id + "가 존재하지 않습니다.");
		return false;
	}

	// 출력 showAllMember2

	public void showAllMember2() {
		for (Member2 Member2 : HashSet) {
			System.out.println(Member2);
		}
		System.out.println();
	}
}