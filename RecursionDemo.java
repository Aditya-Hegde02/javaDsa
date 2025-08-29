package javaDSA;
import java.util.*;
public class RecursionDemo {
	static int factorial(int n) {
		if(n<=1) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the number:");
	int n=sc.nextInt();
	System.out.println("factorial of "+n+" is: "+factorial(n));
	sc.close();
}
}
