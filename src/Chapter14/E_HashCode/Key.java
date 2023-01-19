package Chapter14.E_HashCode;

public class Key {

	public int number;
	public int name;
	public int addr;
	
	public Key(int number) {
		this.number=number;
	}

	//���� ��(������)
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Key) {
			Key compareKey=(Key)obj;
			if(this.number==compareKey.number){
				return true; //�� ��ġ
			}			
		}
		return false;
	}
	
	//������ �ּ�
	@Override
	public int hashCode() {
		
		//return super.hashCode();// ���� heap�޸� 16���� �ּ�
		return number;// ���� heap�޸� 16���� �ּ�
	}
	
}
