package Chapter17.arraylist_stack_queue;

import Chapter17.Member;

public class MemberArrayListMain {

	public static void main(String[] args) {

		MemberArrayList memberArrayList = new MemberArrayList();

		Member memberPark = new Member(1001, "박창훈");
		Member memberLee = new Member(1002, "이석진");
		Member memberLee2 = new Member(1003, "이세정");
		Member memberPark2 = new Member(1004, "박창우");
		Member memberJang = new Member(1005, "장준근");
		Member memberHan = new Member(1006, "한성무");

		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberLee2);
		memberArrayList.addMember(memberPark2);
		memberArrayList.addMember(memberJang);
		memberArrayList.addMember(memberHan);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberHan.getMemberId());

		memberArrayList.showAllMember();
	}

}
