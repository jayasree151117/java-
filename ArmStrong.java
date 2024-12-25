package practice3;

import java.util.Scanner;
import java.lang.Math;
public class ArmStrong {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		int temp=n,sum=0,count=0,rem;
		while(temp>0) {
			temp=temp/10;
			count=count+1;
			
		}
	temp=n;
		while(temp>0) {
			rem=temp%10;
			
			sum+=(Math.pow(rem, count));
			temp=temp/10;
		}
			
		
		
		if(n==sum) {
			System.out.printf(" number %d is armstrong",n);
		}
		else {
			System.out.printf(" number %d is not armstrong",n);
		}
	}

}
