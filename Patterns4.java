package practice3;

import java.util.Scanner;

public class Patterns4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			/*for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
				
			}*/
			
			
			for(int j=i;j<n;j++) {
				System.out.print(" ");
				
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				
			}
			System.out.println();
		
		
		}
	}

}
