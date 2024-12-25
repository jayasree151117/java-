package practice;

public class Sarray4 {

	public static void main(String[] args) {
		int a[]=new int[]{2,8,5,1,9};
		int j;
		int max=0;
			for( j=1;j<a.length;j++) {
				if(a[max]<a[j]) {
max=j;					
				}
			}
			System.out.println(a[max]+" "+max);
		}
	}
