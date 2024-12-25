package strings;

import java.util.Scanner;

public class Strings8 {

	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.println("enter a string");
String name=p.nextLine();
int count=0;
int count1=0;
int count2=0;
int count3=0;
for(int i=0;i<name.length();i++) {
	if((name.charAt(i)>='A')&&(name.charAt(i)<='Z')) {
		count=count+1;
	}
	else if((name.charAt(i)>='a')&&(name.charAt(i)<='z')) {
		count1=count1+1;
	}
	else if((name.charAt(i)>='0')&&(name.charAt(i)<='9')) {
		count2=count2+1;
	}
	else {
		count3=count3+1;
	}
		
}
System.out.println("no of uppercase letters in given string are "+count);
System.out.println("no of lowercase letters in given string are "+count1);
System.out.println("no of digits in given string are "+count2);
System.out.println("no of specialcharecters in given string are "+count3);
	}

}
