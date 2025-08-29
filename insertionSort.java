package javaDSA;
import java.util.*;
//method for insertion sort
public class insertionSort {
	void insertionSortt(int array[]) {
		int size=array.length;
		for(int step=1;step<size;step++) {
			int key=array[step];
			int j=step-1;
			while(j>=0 && key<array[j]) {
				array[j+1]=array[j];
				--j;
			}
			array[j+1]=key;
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int size = sc.nextInt();
	
    int[] data = new int[size]; 
    // For an integer array
    // Or for a String array: String[] array = new String[size];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < size; i++) {
        System.out.print("Element " + (i + 1) + ": ");
        data[i] = sc.nextInt(); 
        // For integers
        // Or for strings: array[i] = scanner.nextLine();
    }
	insertionSort is=new insertionSort();
	is.insertionSortt(data);
	System.out.println("sorted array in ascending order :");
	System.out.println(Arrays.toString(data));
}
}
