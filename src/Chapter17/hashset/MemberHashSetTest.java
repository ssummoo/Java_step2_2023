package Chapter17.hashset;

import Chapter17.Member2;
import Chapter17.linkedlist.MemberLinkedList;

public class MemberHashSetTest {

	public static void main(String[] args) {
		//순서 O , 중복 O
		MemberHashSet memberHashSet=new MemberHashSet();
		
		//팀원들의 정보
		Member2 memberPark = new Member2(1001, "박창훈");
		Member2 memberLee = new Member2(1002, "이석진");
		Member2 memberLee2 = new Member2(1003, "이세정");
		Member2 memberPark2 = new Member2(1004, "박창우");
		Member2 memberJang = new Member2(1005, "장준근");
		Member2 memberHan = new Member2(1006, "한성무");
		
		memberHashSet.addMember2(memberPark);
		memberHashSet.addMember2(memberLee);
		memberHashSet.addMember2(memberLee2);
		memberHashSet.addMember2(memberPark2);
		memberHashSet.addMember2(memberJang);
		memberHashSet.addMember2(memberHan);
		
		memberHashSet.showAllMember2();
		
		memberHashSet.removeMember2(1003);
		memberHashSet.showAllMember2();
		//방법1
		//Member2 memberKim=new Member2(1003, "김치맨");
		//방법2
		//memberHashSet.addMember2(memberKim);
		memberHashSet.showAllMember2();
		
	}
}
	
