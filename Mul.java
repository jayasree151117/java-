package practice5;
import java.util.*;
public class Mul {

	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		int n,i;
		System.out.println("enter n value");
		n=p.nextInt();
		for(i=1;i<=10;i++) {
			System.out.printf("%d * %d = %d\n",n,i,n*i);
		}
	}

}
