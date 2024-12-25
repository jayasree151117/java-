package practice5;
import java.util.*;
public class replace{

	public static void main(String[] args) {
	Scanner p=new Scanner(System.in);
	System.out.println("enter a string");
	String str=p.nextLine();
	String str1[]=str.split(" ");
	System.out.println("first charecters are");
	for(int i=0;i<str1.length;i++) {
		System.out.println(str1[i].toUpperCase());
	}
	}

}
