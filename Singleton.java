package oops;

public class Singleton {
	private static Singleton instance;
	private Singleton() {
		
	}
	public static synchronized Singleton getInstance() {
		if(instance==null) {
    		instance=new Singleton();
	}
		return instance;
	}
    public static void main(String[] args) {
    	
    	
    	Singleton y=Singleton.getInstance();
		System.out.println(instance.hashCode());
		System.out.println(y.hashCode());
	}

}
