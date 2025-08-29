/**
 * Hashing
 * Hashing is a technique of mapping a large set of arbtiary data to tabular indexes using a hash function.
 *  it is a method for representing dictionaries for large datasets.
 *  it allows  lookups 
 *  why hashing is needed??
 *  after storing a large amount of data ,we need to perform various operation on these data.lookups are inevitable for the datasets.
 *  linear search and binary search perform lookups/search with time complexity of O(n) and o(log n) respectively
 */
package javaDSA;

import java.util.*;

public class hashMap {
	public static void main(String[] args) {
		//HashMap<Integer,String> myMap=new HashMap<Integer,String>();
		TreeMap<Integer,String> myMap=new TreeMap<Integer,String>();
		myMap.put(100, "Vaibhav");
		myMap.put(200, "Aditya");
		myMap.put(300, "Ramesh");
		myMap.put(400, "Mayur");
		myMap.put(500, "Mithila");
		myMap.put(600, "Pranita");
		myMap.put(700, "Aditya");
		myMap.put(800, "Samarth");
		System.out.println("Hashmap with key and value is :"+myMap);
		for(Integer key:myMap.keySet()) {
			System.out.println("Roll no :"+key);
		}
		System.out.println();
		for(String name:myMap.values()) {
			System.out.println("names :"+name);
		}
	}

}
