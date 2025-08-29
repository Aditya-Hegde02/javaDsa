package demo;
import java.util.ArrayList;

public class dynamicarray {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add("adi");
	a.add("nayan");
	a.add("raju");
	

	System.out.println("array list is "+a);
	System.out.println("array list size is "+a.size());
	a.remove(2);
	System.out.println("array list after removing is "+a);
	System.out.println("array list size is "+a.size());
}
}
