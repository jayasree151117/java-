package collectionspractice;
import java.util.*;
public class Collection5 {

	public static void main(String[] args) {
		ArrayList <String>al=new ArrayList<>();	
        al.add("baby");
        al.add("ball");
        al.add("soap");
        al.add("baby");
        al.add("shampoo");
        al.add("chalk");
        al.add("soap");
        al.add("makeup");
        al.add("baby");
        al.add("lotion");
        System.out.println(al);
        int count=0;
        String s1=al.get(0);
        for(int j=1;j<al.size();j++) {
        for(int i=0;i<al.size();i++) {
        	
        	if((al.get(i)).equals(s1)) {
        	count+=1;
        	}
        }
        
        if(count>1) {
        System.out.println(s1+"-"+count);
        }
        s1=al.get(j);
        count=0;
        
        }
       
	}
}