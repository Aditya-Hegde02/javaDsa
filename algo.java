/**
 * algorithm for largest among 3
 * step1:start
 * Step2:declare variable a,b,c
 * step3:read variable a,b and c
 * step4:if a>b
 * 			if a>c
 * 			Display a is largest number.
 * 		else
 * 			display c is the largest number
 * 		else
 * 			if b>c
 * 				display b is largest number
 */
package javaDSA;
import java.util.Scanner;
public class algo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value for a:");
	int a=sc.nextInt();
	System.out.println("enter the value for b:");
	int b=sc.nextInt();
	System.out.println("enter the value for c:");
	int c=sc.nextInt();
	if (a>b&&a>c) {
		
		System.out.println("a is the largest number");
		
	}
	else if (b>a&&b>c) {
		
		System.out.println("b is the largest number");
		
	}
	else if (c>b&&c>a) {
		
		System.out.println(" is the largest number");
		
	}
}
}
