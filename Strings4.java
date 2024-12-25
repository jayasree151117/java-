package strings;
import java.util.*;
public class Strings4 {
	public static void main(String args[]) {
		Scanner p=new Scanner(System.in);
		System.out.println("enter a string");
		String name=p.nextLine();
		String name2=new String();
  int len=name.length();
  for(int i=len-1;i>=0;i--) {
	name2=name2+name.charAt(i);
  }
  System.out.println("reverse string is "+name2);
}
}