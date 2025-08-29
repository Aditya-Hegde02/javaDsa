package demo;
//arraylist using generics
import java.util.ArrayList;

public class generics {
public static void main(String[] args) {
	ArrayList<Integer> a=new ArrayList<Integer>();
	a.add(10);
	a.add(20);
	a.add(30);
	System.out.println("array list is "+a);
	System.out.println("array list size is "+a.size());
	a.remove(2);
	System.out.println("array list after removing is "+a);
	System.out.println("array list size is "+a.size());
	for(int x:a) {
		System.out.println("value"+x);
	}
}
}
