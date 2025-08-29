package demo;
import java.util.*;

	// Java Program to implement
	// Factorial using recursion
	class GFG {

	    // recursive method
	    int fact(int n)
	    {
	        int result;

	        if (n == 1)
	            return 1;
	        result = fact(n - 1) * n;
	        return result;
	    }
	}

	// Driver Class
	class recursion {

	    // Main function
	    public static void main(String[] args)
	    {
	    	Scanner sc=new Scanner(System.in);
	    	int a=sc.nextInt();
	        GFG f = new GFG();

	        System.out.printf("Factorial of %d is "
	                           + f.fact(a),a);
	     
	    }
	}
