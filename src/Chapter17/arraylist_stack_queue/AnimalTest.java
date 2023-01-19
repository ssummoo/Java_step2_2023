package Chapter17.arraylist_stack_queue;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}
class Human extends Animal{
	public void move() {
		System.out.println("사람은 두발로 걷습니다.");		
	}
	public void readBook() {
		System.out.println("사람은 책을 일습니다.");		
	}
}
class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 두발로 걷습니다.");		
	}
	public void hunting() {
		System.out.println("호랑이는 사냥을 합니다.");		
	}
}
class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");		
	}
	public void flying() {
		System.out.println("독수리는 날를 펴고 날아 다닙다.");		
	}
}


public class AnimalTest {

	ArrayList<Animal> aniList=new ArrayList<Animal>();
	//addAnimal - UpCasting
	void addAnimal() {
		aniList.add(new Animal());
		aniList.add(new Human());  //Animal형으로 자동 형변환
		aniList.add(new Eagle());
		aniList.add(new Tiger());
		
		for(Animal a:aniList) {
			a.move();
		}
	}
	
	
	//test -> DownCasting
	void test() {
		for(int i=0; i<aniList.size(); i++) {
			Animal ani=aniList.get(i);
			if(ani instanceof Animal) {
				Animal am=(Animal)ani;
				am.move();
			}else if(ani instanceof Human) {
				Human h=(Human)ani;
				h.readBook();
			}else if(ani instanceof Eagle) {
				Eagle e=(Eagle)ani;
				e.flying();
			}else if(ani instanceof Tiger) {
				Tiger t=(Tiger)ani;
				t.hunting();
			}else {
				System.out.println("X");
			}
 
		}
	}
	
	public static void main(String[] args) {

		AnimalTest aTest=new AnimalTest();
		System.out.println("=====UpCasting=====");
		aTest.addAnimal();
		System.out.println("======DownCasting======");
		aTest.test();
	}

}
