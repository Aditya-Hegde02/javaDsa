package demo;

public class constructorex {
constructorex(){
	System.out.println("default constructor");	
}
constructorex(int x,int y){
	System.out.println("value:"+(x+y));
	
}
constructorex(int x,int y,int z){
	System.out.println("value:"+(x+y+z));
	
}
public static void main (String[]args ) {
	constructorex cx=new constructorex();
	
	new constructorex(10,20);
	new constructorex(10,20,30);
}
}
