package Chapter17.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {

	private TreeSet<Member3> treeSet;

	public MemberTreeSet() {
		treeSet = new TreeSet<Member3>();
	}

	public void addMember(Member3 member) {
		treeSet.add(member);

	}

	public boolean removeMember(int memberId) {

		Iterator<Member3> ir = treeSet.iterator();

		while (ir.hasNext()) {
			Member3 member = ir.next();
			int tempId = member.getMemberId();
			if (tempId == memberId) {
				treeSet.remove(member);
				return true;
			}
		}

		System.out.println(memberId + "�� �������� �ʽ��ϴ�");
		return false;
	}

	public void showAllMember() {
		for (Member3 member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}

}
