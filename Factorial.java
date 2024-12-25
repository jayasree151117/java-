package practice3;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		int temp=n;
		int sum=1;
		while(n>0) {
			sum=sum*n;
			n=n-1;
		}
		System.out.printf("factorial value of %d is %d",temp,sum);
	}

}
