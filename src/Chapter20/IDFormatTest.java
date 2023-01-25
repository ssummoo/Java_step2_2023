package Chapter20;

public class IDFormatTest {

	private String userID;
	
	
	public String getUserID() {
		return userID;
	}


	public void setUserID(String userID) throws IDFormatException {
		if(userID==null) {
			throw new IDFormatException("�� ���̵�� null�ϼ� �����ϴ�.");
		}
		else if(userID.length()<8 || userID.length()>20) {
			throw new IDFormatException("���̵�� 8���� �̻� 20�� ���Ϸ� ������ " );
		}
		this.userID=userID	;
	}


	public static void main(String[] args) {
		IDFormatTest test=new IDFormatTest();
		String userID="1234567";
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {  //�����ڰ� ���� Exception	
			System.out.println(e);//�ڵ�� �޼���
			System.out.println(e.getMessage());  //�޼����� ���
		}
			
		 

	}
}

