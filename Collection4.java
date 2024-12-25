package collectionspractice;
import java.util.*;
public class Collection4 {

	public static void main(String[] args) {
		ArrayList <Integer>al=new ArrayList<>();
		ArrayList <Integer>al3=new ArrayList<>();
		al.add(4);
		al.add(9);
		al.add(8);
		ArrayList <Integer>al2=new ArrayList<>();
		al2.add(5);
		al2.add(0);
		al2.add(10);
		System.out.println(al);
        System.out.println(al2);
        al3.addAll(al);
        al3.addAll(al2);
        System.out.println(al3);
        
	}

}
