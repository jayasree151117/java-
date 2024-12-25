package strings;

import java.util.Scanner;

public class Strings2 {

	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.println("enter a string");
		String name=p.nextLine();
		String[] words=name.split(" ");
		System.out.println("no of words in a given string are "+ words.length);
	}

}
