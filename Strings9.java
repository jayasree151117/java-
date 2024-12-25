package strings;

import java.util.Scanner;

public class Strings9 {

	public static void main(String[] args) {
		 
				Scanner p=new Scanner(System.in);
		System.out.println("enter a string");
		String name=p.nextLine();
		int max=0;
		
		for(int i=1;i<name.length();i++) {
			if(name.charAt(max)!=name.charAt(i)) {
			max=i;	
				
			}
		}
System.out.println("most repeated element is "+name.charAt(max));
	}
	}

