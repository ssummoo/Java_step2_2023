package Chapter17.hashset;

import java.util.HashSet;
import java.util.Set;

import Chapter17.Member;

public class MemberHashSetMain {

	public static void main(String[] args) {

		Set<Member> set= new HashSet<Member>();
		
		set.add(new Member(30,"È«±æµ¿"));
		set.add(new Member(30,"È«±æµ¿")); //Áßº¹ÀÌ¹Ç·Î ÀúÀåµÇ¸é ¾ÈµÊ

		System.out.println("ÃÑ °´Ã¼¼ö : "+set.size());
	}

}
