package Chapter17.linkedlist;

import Chapter17.Member;

public class MemberLInkedListMain {

	public static void main(String[] args) {
		//순서 O , 중복 O
		MemberLinkedList memberLinkedList=new MemberLinkedList();
		
		//팀원들의 정보
		Member memberPark = new Member(1001, "박창훈");
		Member memberLee = new Member(1002, "이석진");
		Member memberLee2 = new Member(1003, "이세정");
		Member memberPark2 = new Member(1004, "박창우");
		Member memberJang = new Member(1005, "장준근");
		Member memberHan = new Member(1006, "한성무");
		
		memberLinkedList.addMember(memberPark);
		memberLinkedList.addMember(memberLee);
		memberLinkedList.addMember(memberLee2);
		memberLinkedList.addMember(memberPark2);
		memberLinkedList.addMember(memberJang);
		memberLinkedList.addMember(memberHan);
		
		memberLinkedList.showAllMember();
		
		memberLinkedList.removeMember(1003);
		memberLinkedList.showAllMember();
		
		Member memberKim=new Member(1003, "김치맨");
		memberLinkedList.addMember(memberKim);
		memberLinkedList.showAllMember();
		
	}
}
	
