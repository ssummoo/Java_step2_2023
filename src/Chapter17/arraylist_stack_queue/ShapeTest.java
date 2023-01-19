package Chapter17.arraylist_stack_queue;

import java.util.ArrayList;

class Shape{
	
	void draw() {
		System.out.println("draw");		
	}
}

class Circle extends Shape{
	@Override
	void draw() {
			System.out.println("draw Circle");
	}
	void circle() {
		System.out.println("������Դϴ�.");		
	}
	
}

class Rectangle extends Shape{	
	@Override
	void draw() {		
		System.out.println("draw Rectangle");
	}
	void Rectangle() {
		System.out.println("�簢�� ����Դϴ�.");		
	}
	
}

class Triangle extends Shape{
	@Override
	void draw() {		
		System.out.println("draw Triangle");
	}
	void Triangle() {
		System.out.println("�ﰢ�� ����Դϴ�.");
	}
	
}

public class ShapeTest {

	//shape �� shape�� ��ӹ��� ��� Ŭ���� Ÿ���� ����ϴ� ArrayList
	ArrayList<Shape> sList=new ArrayList<>();

	public static void main(String[] args) {
		ShapeTest sTest=new ShapeTest();
		System.out.println("------UpCasting-------");
		sTest.addShape(); //Shape sc=new Circle
		System.out.println("=====DownCasting======");
		sTest.testCasting();
	}

	public void addShape() {
		sList.add(new Circle()); //Circle s=new Circle();
		sList.add(new Triangle());
		sList.add(new Rectangle());
		
		for(Shape s:sList) {
			s.draw();
			
		}
	}
	public void testCasting() {
		for(int i = 0; i<sList.size();i++) {
			Shape s=sList.get(i);  //�θ�(Shape)Ÿ��
			if(s instanceof Circle) {
				Circle c=(Circle)s; //DownCasting
				c.circle();
			}else if(s instanceof Rectangle) {
					Rectangle r=(Rectangle)s; //DownCasting
					r.Rectangle();
			}else if(s instanceof Triangle) {
				Triangle t=(Triangle)s; //DownCasting
						t.Triangle();
			}else {
				System.out.println("�������� �ʴ� Ÿ��");
			}
		}
	}
}
