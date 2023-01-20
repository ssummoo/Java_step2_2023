package Chapter17.treeset;

public class Member3 implements Comparable<Member3> { //compareTo

	private int memberId;
	private String memberName;

	public Member3(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMeberName(String memberName) {
		this.memberName = memberName;
	}

	// ������ ��
	@Override
	public int hashCode() {
		// memberName.hashCode() : String �̹Ƿ� 10����
		// return super.hashCode(); 10������ �޸� �ּ�
		//���1
		//return memberName.hashCode() + memberId;
		//���2
		return memberId;
	}

	// ������ ��
	// ��� 1 �̸��� ���̵� ��ġ
	/*
	 * 
	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Member2) {
			Member2 member = (Member2) obj; // DownCasting
			return member.memberName.equals(memberName) && 
					(member.memberId == memberId);
		} else {
			return false;
		}
	}
	 */
	//���2
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member3) {
			Member3 member=(Member3)obj;
			if(this.memberId==member.memberId) {
				return true;
			}
		}
		return false;
	}
	

	@Override
	public String toString() {

		return memberName + "ȸ������ ���̵�� " + memberId + "�Դϴ�.";
	}

	@Override
	public int compareTo(Member3 member) {
		
		return (this.memberId-member.memberId);
	}


}
