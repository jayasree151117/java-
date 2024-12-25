package practice;

public class Sarray2 {

	public static void main(String[] args) {
     int a[]=new int[]{1,2,3,4,5,6};
     int sum=0;
     float avg;
     for(int j=0;j<6;j++) {
    	 System.out.println(a[j]);
    	 sum=sum+a[j];
     }
     System.out.println(sum);
     avg=sum/6f;
     System.out.println(avg);
	}

}
