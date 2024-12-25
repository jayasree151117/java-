package strings;
import java.util.*;
public class Occurance {

	public static void main(String[] args) {
	Scanner p=new Scanner(System.in);
	System.out.println("enter the string");
	String str=p.nextLine();
	System.out.println("enter the charecter you want to search");
	char c=p.next().charAt(0);
	int count=0;
	for(int i=0;i<str.length();i++) {
		if(c==str.charAt(i)) {
			count=count+1;
		}
	}
	System.out.printf("the total occurances of %c is %d",c,count);
	
	}

}
