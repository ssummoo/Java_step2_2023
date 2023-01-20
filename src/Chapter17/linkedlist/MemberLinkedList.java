package Chapter17.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

import Chapter17.Member;

public class MemberLinkedList {

	private LinkedList<Member> linkedList;

	// �����ڸ� ���� LinkedList ��ü ����
	public MemberLinkedList() {
		linkedList = new LinkedList<Member>();
	}

	// addMember
	public void addMember(Member member) {
		linkedList.add(member);
	}

	// removeMember => Iterator
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = linkedList.iterator();

		while (ir.hasNext()) {
			Member member = ir.next();
			int temp = member.getMemberId();
			if (temp == memberId) {
				linkedList.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}

	// ��� showAllMember

	public void showAllMember() {
		for (Member member : linkedList) {
			System.out.println(member);
		}
		System.out.println();
	}
}