package strings;

import java.util.Scanner;

public class String7 {

	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.println("enter a string");
		String name=p.nextLine();
		String name2="";
		String words[]=name.split(" ");
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			if(i%2==0) {
				name2+=word.toUpperCase()+" ";
			}
			else {
				String reverse="";
				for(int j=word.length()-1;j>=0;j--) {
					reverse+=word.charAt(j);
				}
				/*	if(i!=words.length-1) {
					name2+=reverse+" ";
					}
					else {
						name2+=reverse;
					}*/
					if(i!=words.length-1) {
						name2+=reverse+" ";
						}
						else {
							name2+=reverse;
						}
				
				}
			
		}
		System.out.print(name2);
		
	}
}

		