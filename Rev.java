package strings;
import java.util.*;
public class Rev {

	public static void main(String[] args) {
	Scanner p=new Scanner(System.in);
	String n1;
	System.out.println("enter n1 value");
	n1=p.nextLine();
	String n2=new String();
	int len=n1.length();
	for(int i=len-1;i>=0;i--) {
		n2=n2+n1.charAt(i);
	}
	System.out.println("reverse string is " +n2);
	}

}
