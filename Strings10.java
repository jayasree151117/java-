package strings;

import java.util.Scanner;

public class Strings10 {

	public static void main(String[] args) {
		
		Scanner p=new Scanner(System.in);
		System.out.println("enter a string");
		String name=p.nextLine();
		int temp=0,count=1;
		char repeat=' ';
		for(int i=0;i<name.length();i++) {
			count=1;
			for(int j=0;j<name.length();j++) {
				if(name.charAt(i)==name.charAt(j))
				{
					
					count=count+1;
				}
			}
			
			
			if(count>temp) {
				temp=count;
				repeat=name.charAt(i);
			}
			
		}
				
		System.out.println("repeated charecter is "+ repeat);
	
	}
		}		

