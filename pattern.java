package strings;
import java.util.Scanner;
public class pattern {
		public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.println("enter the string");
		String str=p.nextLine();
		String str2[]=str.split(" ");
		String str3="";
		for(int i=0;i<str2.length;i++) {
			String word=str2[i];
			String rev="";
		
			if(i%2==0) {
			
			for(int j=word.length()-1;j>=0;j--) {
				rev=rev+word.charAt(j);
				if(j==0) {
					str3+=rev+" ";
				}
			}
			}
			else {
					str3+=word.toUpperCase()+" ";
				}
			}
		
		System.out.println(str3);
		}
}
