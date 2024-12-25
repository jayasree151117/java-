package practice4;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		int sum=0,r; 
		int temp=n;
		while(n>0) {
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		System.out.println("reverse number is "+sum);
	}

}
