package Chapter17.vector;

import java.util.List;
import java.util.Vector;

public class VectorMain {

	public static void main(String[] args) {
		
		List<Board> list=new Vector<Board>();
		
		list.add(new Board("����1", "����1", "�۾���1"));
		list.add(new Board("����2", "����2", "�۾���2"));
		list.add(new Board("����3", "����3", "�۾���3"));
		list.add(new Board("����4", "����4", "�۾���4"));
		list.add(new Board("����5", "����5", "�۾���5"));
		
		for(int i=0; i<list.size();i++) {
			Board board=list.get(i);
			System.out.println(board.subject+"\t"+board.contents+"\t"+board.writer);
		}
		
		list.remove(2);
		System.out.println("=======================================");
		for(int i=0; i<list.size();i++) {
			Board board=list.get(i);
			System.out.println(board.subject+"\t"+board.contents+"\t"+board.writer);
		}
		list.remove(3);
		System.out.println("=======================================");
		for(int i=0; i<list.size();i++) {
			Board board=list.get(i);
			System.out.println(board.subject+"\t"+board.contents+"\t"+board.writer);
		}
	}
}
