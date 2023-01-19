package Chapter17.stack_queue;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
	
		Object obj;
		//empty 스택 생성
		Stack<Object> st=new Stack<>();
		//입력
		if(st.empty()) { //스택이 비어있으면
			for(int i=1; i<=5;i++) {
				st.push(new String("HI"+i));
				System.out.println(" 입력"+i+"번째 : "+st.peek());
			}
		}//if
		//출력
		st.pop();//밖으로 나오는 출력(5 출력)
		System.out.println("현재 Top의 위치(peek) : "+st.peek());
		st.pop();//밖으로 나오는 출력(4 출력)
		System.out.println("현재 Top의 위치(peek) : "+st.peek());
		st.push(new String("Happy!!"));
		System.out.println(st.peek());
		st.push(new String("Good!!"));
		System.out.println(st.peek());
	}

}
