package demo;
import java.util.*;

// Class with overloaded methods
public class polymorphism {
    // Area of rectangle
    public double area(int length, int breadth) {
        return length * breadth;
    }

    // Area of square
    public float area(float length) {
        return length * length;
    }

    // Area of circle
    public double area(double radius) {
        return 3.142 * radius * radius;
    }
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	
        polymorphism obj = new polymorphism();
        
        System.out.print("enter the length:");
        int length=sc.nextInt();
        
        System.out.print("enter the width:");
        int width=sc.nextInt();
        
        System.out.print("enter the length of squre:");
        float x=sc.nextFloat();
        
        System.out.print("enter the radius:");
        int y=sc.nextInt();
        
        System.out.println("Area of rectangle : " + obj.area(length,width));
        System.out.println("Area of square : " + obj.area(x));
        System.out.println("Area of circle : " + obj.area(y));
    }
}
