package Chapter19.Stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,};

		//int => IntStream Ÿ������ ����ȯ�ؼ� ����
		IntStream stream= Arrays.stream(arr);
		int sum =stream.sum();
		System.out.println(sum);
		
		//�ѹ� ������ Stream�� �� ���� �ٽ� �����ؾ���
		int sumValue=Arrays.stream(arr).sum();	// �հ� | Integer�� ��ȯ =>int�� �ڵ� ��ڽ� 
		int count= (int)Arrays.stream(arr).count();	 // ���� | long type���� ��ȯ=> int�� ĳ����

		System.out.println(sumValue);
		System.out.println(count);
		
		//�̹� ��������Ƿ� �Ҹ�� stream
		//count=stream.count();//ERROR
		int count2=(int)Arrays.stream(arr).count();// �缱�� ����
		System.out.println(count2);
		
		//reduce(�ʱⰪ, ���޵Ǵ� ��� -> �� ��Ұ� �����ؾ��ϴ� ���) 
		System.out.println(Arrays.stream(arr).reduce(0, (a,b)-> a+b));
		
	}
}
