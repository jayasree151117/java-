package strings;
import java.util.*;
public class Extension3 {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.println("enter string one");
		String str=p.nextLine();
		System.out.println("enter string two");
		String str2=p.nextLine();
		String str3="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==str2.charAt(i)) {
				str3+=str.charAt(i);
			}
				else{
				str=str.replace(str.charAt(i),'+');
				str3=str3+str.charAt(i);
			}
				
		}
		System.out.println(str3);
		
	}
		
}
