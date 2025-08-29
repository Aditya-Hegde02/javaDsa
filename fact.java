package javaDSA;

import java.util.Scanner;

/**
 *step 1:start
 *Step 2:declare variable n,factorial and i,
 *step 3:initialize variable
 *		factorial<-1
 *		i<-1
 *step 4:read value of n
 *step 5:repeat the steps until i=n
 *		5.1:factorial <-factorial*i
 *		5.2:i<-i+1
 *step 6:display factorial
 */


public class fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + n + " = " + fact);
    }
}





