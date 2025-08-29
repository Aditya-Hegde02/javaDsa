
package javaDSA;
import java.util.*;
public class HashTableDemo {
public static void main(String[] args) {
	Hashtable<Integer,String>studentMap=new Hashtable();
	studentMap.put(100, "Vaibhav");
	studentMap.put(200, "Aditya");
	studentMap.put(300, "Ramesh");
	studentMap.put(400, "Mayur");
	studentMap.put(500, "Mithila");
	studentMap.put(600, "Pranita");
	studentMap.put(700, "Aditya");
	studentMap.put(800, "Samarth");
	
	System.out.println("Hashmap with key and value is :"+studentMap);
	for(Integer key:studentMap.keySet()) {
		System.out.println("Roll no :"+key);
	}
	System.out.println();
	for(String name:studentMap.values()) {
		System.out.println("names :"+name);
	}
}
}
