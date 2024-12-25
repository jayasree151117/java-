package practice2;

import java.util.Scanner;

public class Twoarray3 {

	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.println("enter no of rows:");
				int rowsize=p.nextInt();
		System.out.println("enter no of columns:");
		int colsize=p.nextInt();
		int array[][]=new int[rowsize][colsize];
		int array2[][]=new int[rowsize][colsize];
		for(int i=0;i<rowsize;i++) {
			for(int j=0;j<colsize;j++) {
				array[i][j]=p.nextInt();
			}
		}
		System.out.println("matrix is:");
		for(int i=0;i<rowsize;i++) {
			for(int j=0;j<colsize;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<rowsize;i++) {
			for(int j=0;j<colsize;j++) {
			array2[i][j]=array[i][j]*array[i][j];	
			}
			
		}
		System.out.println("squared matrix is:");
		for(int i=0;i<rowsize;i++) {
			for(int j=0;j<colsize;j++) {
System.out.print(array2[i][j]+" ");
	}
System.out.println();
		}
	}
}
