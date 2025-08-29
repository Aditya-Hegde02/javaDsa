package demo;

import java.util.Scanner;

public class turnery {

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of A");
int a=sc.nextInt();
System.out.println("Enter the value of B");
int b=sc.nextInt();
System.out.println(a>b?a+" is greater":b+" is greater");
}
}