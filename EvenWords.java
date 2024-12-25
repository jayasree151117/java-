package strings;
import java.util.*;
public class EvenWords {

	public static void main(String[] args) {
	Scanner p=new Scanner(System.in);	
	System.out.println("enter the String");
	String str=p.nextLine();
	String str1[]=str.split(" ");
	for(int i=0;i<str1.length;i++) {
		if(i%2==0) {
			
			System.out.println(str1[i]);
		}
	}
	}

}
