package Chapter17.linkedlist;

import Chapter17.Member;

public class MemberLInkedListMain {

	public static void main(String[] args) {
		//���� O , �ߺ� O
		MemberLinkedList memberLinkedList=new MemberLinkedList();
		
		//�������� ����
		Member memberPark = new Member(1001, "��â��");
		Member memberLee = new Member(1002, "�̼���");
		Member memberLee2 = new Member(1003, "�̼���");
		Member memberPark2 = new Member(1004, "��â��");
		Member memberJang = new Member(1005, "���ر�");
		Member memberHan = new Member(1006, "�Ѽ���");
		
		memberLinkedList.addMember(memberPark);
		memberLinkedList.addMember(memberLee);
		memberLinkedList.addMember(memberLee2);
		memberLinkedList.addMember(memberPark2);
		memberLinkedList.addMember(memberJang);
		memberLinkedList.addMember(memberHan);
		
		memberLinkedList.showAllMember();
		
		memberLinkedList.removeMember(1003);
		memberLinkedList.showAllMember();
		
		Member memberKim=new Member(1003, "��ġ��");
		memberLinkedList.addMember(memberKim);
		memberLinkedList.showAllMember();
		
	}
}
	
