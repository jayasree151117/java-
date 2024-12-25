package strings;
import java.util.*;
public class Strings3 {

	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
			System.out.println("enter a string");
			String name=p.nextLine();
			System.out.println("enter the charecter that you want to search for");
			char name2=p.next().charAt(0);
			int count=0;
			for(int i=0;i<name.length();i++) {
				if(name.charAt(i)==name2) {
					count=count+1;
				}
			}
			System.out.println("no of times the charecter " +name2+ " repeated is "+count);
	}
}
