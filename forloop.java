// Write a program to print sum of 1-100, leaving 90 and stop when sum reaches 4000
package demo;
public class forloop {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
       
            if (i == 90) {
                continue;
            }
            
            if (sum >= 4000) {
                break;
            }
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 100 (excluding 90) is: " + sum);
    }
}
