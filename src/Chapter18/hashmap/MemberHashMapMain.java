package Chapter18.hashmap;

import Chapter17.Member2;

public class MemberHashMapMain {

	public static void main(String[] args) {

		MemberHashMap memberHashMap=new MemberHashMap();
		
		//���濡 ���� Member ������
		Member2 memberLee=new Member2(1003, "������");
		Member2 memberSon=new Member2(1005, "�չα�");
		Member2 memberPark=new Member2(1004, "�ڼ���");
		Member2 memberHong=new Member2(1002, "ȫ�浿");
		//����ֱ�
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberHong);
		memberHashMap.addMember(new Member2(1001, "�̹���"));
		memberHashMap.addMember(new Member2(1001, "�ӹ���"));
		
		memberHashMap.showAllMember();

		memberHashMap.removeMember(1003);
		memberHashMap.showAllMember();
		
	}

}
