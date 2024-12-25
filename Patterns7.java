package practice3;

import java.util.Scanner;

public class Patterns7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		for(int m=(2*n-1);m>=1;m--) {
			
			
			for(int i=1;i<=n;i++) {
				
				for(int j=n-i;j>=1;j--) {
					System.out.print(" ");
					
				}
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
					
				}
				
				
				
				System.out.println();
			
			
			}
		
		for(int i=n;i>=1;i--) {
			
			
			
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
				
			}
			for(int j=1;j<i;j++) {
				System.out.print("* ");
				
			}
			System.out.println();
		
		
		}

		}	
	}

}
