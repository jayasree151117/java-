package strings;
import java.util.*;
public class Extension {

	public static void main(String[] args) {
	Scanner p=new Scanner(System.in);
	System.out.println("enter the string");
	String str=p.nextLine();
	char target='.';
	String str2="";
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)==target){
			for(int j=i+1;j<str.length();j++) {
			str2+=str.charAt(j);
			}
	System.out.println(str2);
		}
	}
	}
}

