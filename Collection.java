package collectionspractice;
import java.util.*;

public class Collection {

	public static void main(String[] args) {
		Vector<Integer>v1 = new Vector<>();
		v1.add(4);
		v1.add(5);
		v1.add(0);
		v1.add(9);
		v1.add(8);
		v1.add(10);
		System.out.println(v1);
		int sum=0;
		for(int i=0;i<v1.size();i++) {
			sum+=v1.get(i);
		}
		System.out.println(sum);
	}

}
