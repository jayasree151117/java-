package strings;
import java.util.*;
public class Extension2 {

	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.println("enter string");
		String str=p.nextLine();
		String str2[]=str.split("\\.");
		System.out.println(str2[1]);
	}

}
