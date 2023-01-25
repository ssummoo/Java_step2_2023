package Chapter19.Stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,};

		//int => IntStream 타입으로 형변환해서 받음
		IntStream stream= Arrays.stream(arr);
		int sum =stream.sum();
		System.out.println(sum);
		
		//한번 생성된 Stream은 재 사용시 다시 생성해야함
		int sumValue=Arrays.stream(arr).sum();	// 합계 | Integer로 반환 =>int로 자동 언박싱 
		int count= (int)Arrays.stream(arr).count();	 // 개수 | long type으로 반환=> int로 캐스팅

		System.out.println(sumValue);
		System.out.println(count);
		
		//이미 사용했으므로 소멸된 stream
		//count=stream.count();//ERROR
		int count2=(int)Arrays.stream(arr).count();// 재선언 가능
		System.out.println(count2);
		
		//reduce(초기값, 전달되는 요소 -> 각 요소가 수행해야하는 기능) 
		System.out.println(Arrays.stream(arr).reduce(0, (a,b)-> a+b));
		
	}
}
