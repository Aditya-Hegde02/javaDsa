package javaDSA;
import java.util.*;
/*
 * selection sort (array,size)
 * for i from 0 to size -1 do
 * set i as the index of the current minimum
 * for j from i+1 to size -1 do
 * if array[j]<array[current minimum
 * set j as the new current minimum index
 * if current minimum is not i
 * swap array[i] with array[array minimum]
 * end selection sort
 */

public class selectionsort {

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Assume the first element is the minimum
            int minIndex = i;

            // Find the minimum in the rest of the array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the length of array: ");
    	int n = sc.nextInt();
    	int[] arr = new int[n];
    	System.out.println("Enter " + n + " elements:");
    	for (int i = 0; i < n; i++) {
    	    arr[i] = sc.nextInt(); 
    	}
    	System.out.println("Array before sorting: " + Arrays.toString(arr));
        selectionSort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}


