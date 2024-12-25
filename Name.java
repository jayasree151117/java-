package strings;
import java.util.*;
public class Name {

	public static void main(String[] args) {
	Scanner p=new Scanner(System.in);	
	System.out.println("enter first string");
	String str=p.nextLine();
	System.out.println("enter second string");
	String str2=p.nextLine();
	System.out.println("enter index");
	int ind=p.nextInt();
	for(int i=0;i<str.length();i++) {
		if(ind==i)
	       System.out.println(str2+","+str.charAt(ind));
	}
	}
}
