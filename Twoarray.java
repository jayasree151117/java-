package practice2;
import java.util.*;
public class Twoarray {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.println("enter no of rows:");
		int rowsize=p.nextInt();
		System.out.println("enter no of columns:");
		int colsize=p.nextInt();
		int array[][]=new int[rowsize][colsize];
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
	int sum=0;
	for(int i=0;i<rowsize;i++) {
		for(int j=0;j<colsize;j++) {
			sum =sum+array[i][j];
		}
	}
	System.out.println("sum of elements in an array is " +sum);
	}

}

