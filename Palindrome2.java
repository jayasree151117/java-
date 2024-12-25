package practice3;
import java.lang.*;
public class Palindrome2{

	public static void main(String[] args) {
	int i,r;
	for(i=10;i<=100;i++) {
     int temp=i,sum=0;
     while(i>0) {
    	 r=i%10;
    	 sum=sum*10+r;
    	 i=i/10;
     }
     if(temp==sum) {
    	 System.out.println(sum);
     
	}
	}
	}
}