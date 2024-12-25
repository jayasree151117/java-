package oops;
class Inherit {
	 public void add() {
		 System.out.println("addition");
	 }
		
	}
public	class Example2 extends Inherit{
	public void sub() {
		System.out.println("sub");
	}
	public static void main(String[] args) {
		Inherit i=new Example2();
		i.add();
		}
	}

