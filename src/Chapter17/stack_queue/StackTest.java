package Chapter17.stack_queue;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
	
		Object obj;
		//empty ���� ����
		Stack<Object> st=new Stack<>();
		//�Է�
		if(st.empty()) { //������ ���������
			for(int i=1; i<=5;i++) {
				st.push(new String("HI"+i));
				System.out.println(" �Է�"+i+"��° : "+st.peek());
			}
		}//if
		//���
		st.pop();//������ ������ ���(5 ���)
		System.out.println("���� Top�� ��ġ(peek) : "+st.peek());
		st.pop();//������ ������ ���(4 ���)
		System.out.println("���� Top�� ��ġ(peek) : "+st.peek());
		st.push(new String("Happy!!"));
		System.out.println(st.peek());
		st.push(new String("Good!!"));
		System.out.println(st.peek());
	}

}
