package Chapter17.hashset;

import java.util.HashSet;
import java.util.Iterator;

import Chapter17.Member;
import Chapter17.Member2;

public class MemberHashSet {

	private HashSet<Member2> HashSet;

	// �����ڸ� ���� HashSet ��ü ����
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
		System.out.println(Member2Id + "�� �������� �ʽ��ϴ�.");
		return false;
	}

	// ��� showAllMember2

	public void showAllMember2() {
		for (Member2 Member2 : HashSet) {
			System.out.println(Member2);
		}
		System.out.println();
	}
}