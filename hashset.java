package javaDSA;
import java.util.*;
public class hashset {
	public static void main(String[] args) {
		HashSet<String> hashSet=new HashSet<>(); 
		hashSet.add("Puja");
		hashSet.add("Lokesh");
		hashSet.add("Venkatesh");
		hashSet.add("Raj");
		hashSet.add("Ramesh");
		hashSet.add("Suhas");
		
		for(String st:hashSet) {
			System.out.println("Student name : "+st);
			
		}
		System.out.println("Student name : "+hashSet);
	}

}
