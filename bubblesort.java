package javaDSA;
import java.util.Arrays;
import java.util.Scanner;

public class bubblesort {
    public static void bubbleSort(int[] data) {
        int n = data.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swap = false; 
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();

        int[] data = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt(); 
        }

        System.out.println("Array before sorting: " + Arrays.toString(data));

        bubbleSort(data);

        System.out.println("Sorted array: " + Arrays.toString(data));
    }
}
