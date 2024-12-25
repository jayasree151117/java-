package practice;

public class Sarray6 {

	public static void main(String[] args) {
     String name[]=new String[]{"coffee","water","chai"};
 
int max=0;
for(int i=1;i<name.length;i++) {
	if(name[max].length()<name[i].length()) {
		max=i;;
	}
}
System.out.println(name[max].length()+" "+max);
}
	}

