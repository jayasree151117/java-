package collectionspractice;
import java.util.*;
public class Collection3 {

	public static void main(String[] args) {
		LinkedList <Integer>al=new LinkedList<>();
		LinkedList <Integer>al2=new LinkedList<>();
		LinkedList <Integer>al3=new LinkedList<>();
		al.add(4);
		al.add(9);
		al.add(8);
		al.add(5);
		al.add(0);
		al.add(10);
		System.out.println(al);
		for(int i=0;i<(al.size())/2;i++) {
			al2.add(al.get(i));
		}
		System.out.println("list-1"+al2);
		for(int i=(al.size())/2;i<al.size();i++) {
			al3.add(al.get(i));
		}
		System.out.println("list-2"+al3);
	}

}
