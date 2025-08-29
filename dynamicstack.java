package javaDSA;
import java.util.*;

public class dynamicstack {
public static void main(String[] args) {
	ArrayList<Integer> s=new ArrayList<Integer>();
	s.add(10);
	s.add(20);
	s.add(30);
	System.out.println("Stack contents "+s);
	System.out.println(s.get(s.size()-1)+" popped from stack");
	s.remove(s.size()-1);
	System.out.println(s);
	System.out.println("stack size :"+s.size());
}
}
