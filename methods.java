package demo;
import java.util.*;


public class methods {
	 static int add(int a,int b) {
		int sum=a+b;
		 return sum;
	}
	 
	 static int sub(int a,int b) {
		 int sum=a-b;
		 return sum;
	}
	 
	 static int mul(int a,int b) {
		 int sum=a*b;
		 return sum;
	}
	 
	 static int divide(int a,int b) {
		 int sum=a/b;
		 return sum;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value for A");
	int a=sc.nextInt();
	System.out.println("enter the value for B");
	int b=sc.nextInt();
	int operator=0;
	switch (operator) {
	case 1: {
		int result1=add(a,b);
		System.out.println("addityon is"+result1);
		break;
	}
	case 2: {
		int result2=sub(a,b);
		System.out.println("addition of a and b is "+result2);
		break;
	}
	case 3: {
		int result3=mul(a,b);
		System.out.println("addition of a and b is "+result3);
		break;
	}
	case 4: {
		int result4=divide(a,b);
		System.out.println("addition of a and b is "+result4);
		break;
	}
	
	default:
		throw new IllegalArgumentException("enter the correct value");
	}
	add(a,b);
	sub(a,b);
	mul(a,b);
	divide(a,b);
	
			
}
}
