package demo;

public class s implements r{
public void add(int x,int y) {
	System.out.println("value:"+(x+y));
}
public static void main(String[] args) {
	s S=new s();
	S.add(10,20);
}
}
