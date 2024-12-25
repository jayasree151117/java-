package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Strings11 {

	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.println("enter a string");
String name=p.nextLine();
String[] words=name.split(" ");
String maxlenword=words[0];

for(int i=1;i<words.length;i++) {
	
	String word=words[i];
	if(maxlenword.length()<words[i].length()) {
		maxlenword=words[i];
	}
}
System.out.println("maximum length word is "+maxlenword);

	}

}
