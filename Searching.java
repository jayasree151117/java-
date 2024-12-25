import java.util.*;
public class Searching {

	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		int linear[]=new int[10];
		System.out.println("enter the elements into array");
		for(int i=0;i<linear.length;i++) {
			linear[i]=p.nextInt();
		}
		System.out.println("enter the element to be found");
		int search = p.nextInt();
		for(int j=0;j<linear.length;j++) {
			if(linear[j]==search) {
				System.out.println("the element found at index"+j);
			}
			else {
				System.out.println("the element is not found");	
			}
		}
	}

}
