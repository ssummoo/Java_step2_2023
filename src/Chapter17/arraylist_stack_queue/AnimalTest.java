package Chapter17.arraylist_stack_queue;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}
class Human extends Animal{
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");		
	}
	public void readBook() {
		System.out.println("����� å�� �Ͻ��ϴ�.");		
	}
}
class Tiger extends Animal{
	public void move() {
		System.out.println("ȣ���̰� �ι߷� �Ƚ��ϴ�.");		
	}
	public void hunting() {
		System.out.println("ȣ���̴� ����� �մϴ�.");		
	}
}
class Eagle extends Animal{
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");		
	}
	public void flying() {
		System.out.println("�������� ���� ��� ���� �ٴմ�.");		
	}
}


public class AnimalTest {

	ArrayList<Animal> aniList=new ArrayList<Animal>();
	//addAnimal - UpCasting
	void addAnimal() {
		aniList.add(new Animal());
		aniList.add(new Human());  //Animal������ �ڵ� ����ȯ
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
