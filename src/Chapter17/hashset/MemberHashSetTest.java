package Chapter17.hashset;

import Chapter17.Member2;
import Chapter17.linkedlist.MemberLinkedList;

public class MemberHashSetTest {

	public static void main(String[] args) {
		//���� O , �ߺ� O
		MemberHashSet memberHashSet=new MemberHashSet();
		
		//�������� ����
		Member2 memberPark = new Member2(1001, "��â��");
		Member2 memberLee = new Member2(1002, "�̼���");
		Member2 memberLee2 = new Member2(1003, "�̼���");
		Member2 memberPark2 = new Member2(1004, "��â��");
		Member2 memberJang = new Member2(1005, "���ر�");
		Member2 memberHan = new Member2(1006, "�Ѽ���");
		
		memberHashSet.addMember2(memberPark);
		memberHashSet.addMember2(memberLee);
		memberHashSet.addMember2(memberLee2);
		memberHashSet.addMember2(memberPark2);
		memberHashSet.addMember2(memberJang);
		memberHashSet.addMember2(memberHan);
		
		memberHashSet.showAllMember2();
		
		memberHashSet.removeMember2(1003);
		memberHashSet.showAllMember2();
		//���1
		//Member2 memberKim=new Member2(1003, "��ġ��");
		//���2
		//memberHashSet.addMember2(memberKim);
		memberHashSet.showAllMember2();
		
	}
}
	
