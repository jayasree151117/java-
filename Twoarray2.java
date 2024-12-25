package practice2;
import java.util.*;

public class Twoarray2 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		System.out.println("enter no of rows:");
		int m=t.nextInt();
		System.out.println("enter no of columns:");
		int n=t.nextInt();
		int array[][]=new int[m][n];
		int array2[][]=new int[m][n];
		int array3[][]=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				array[i][j]=t.nextInt();
			}
			
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				array2[i][j]=t.nextInt();
			}
		}
		System.out.println("first array is");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("second array is");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
System.out.print(array2[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {	
		array3[i][j]=array[i][j]+array2[i][j];
	}
}
		System.out.println("after adding result array is");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
System.out.print(array3[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
