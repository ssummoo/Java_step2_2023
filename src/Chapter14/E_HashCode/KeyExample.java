package Chapter14.E_HashCode;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {

		//Key ��ü�� �ĺ�Ű�� ����ؼ� String���� �����ϴ� HashMap ��ü ����
		HashMap<Key, String> hashMap=new HashMap<Key, String>();
		
		System.err.println(hashMap);
		//�ĺ�Ű�� ��ü�� �̿��Ͽ� �̸��� ��ȯ
		hashMap.put(new Key(1), "ȫ�浿");
		System.err.println(hashMap);
		
		hashMap.put(new Key(1), "������");
		System.err.println(hashMap);
		
		
	}

}
