package Chapter18.treemap;

import Chapter17.treeset.Member3;

public class MemberTreeMapMain {

	public static void main(String[] args) {

		MemberTreehMap memberTreeMap=new MemberTreehMap();
		
		//���濡 ���� Member ������
		Member3 memberLee=new Member3(1003, "������");
		Member3 memberSon=new Member3(1005, "�չα�");
		Member3 memberPark=new Member3(1004, "�ڼ���");
		Member3 memberHong=new Member3(1002, "ȫ�浿");
		//����ֱ�
		memberTreeMap.addMember(memberLee);
		memberTreeMap.addMember(memberSon);
		memberTreeMap.addMember(memberPark);
		memberTreeMap.addMember(memberHong);
		memberTreeMap.addMember(new Member3(1001, "�̹���"));
		
		memberTreeMap.showAllMember();

		memberTreeMap.removeMember(1003);
		memberTreeMap.showAllMember();
		
	}

}
