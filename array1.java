package demo;
import java.util.*;
public class array1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size :");
		int size = sc.nextInt();
		
	int[] row1=new int[size];
	
	
	for (int k=0;k<size;k++) {
		row1[k]=sc.nextInt();
	}
	
	
	for(int i=0;i<row1.length;i++) {
		System.out.println("name is : "+row1[i]);
	}
	
	
	
	}

}
