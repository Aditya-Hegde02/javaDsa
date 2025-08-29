package demo;
import java.util.*;
public class array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	String[] row1=new String[6];
	for (int k=0;k<6;k++) {
		row1[k]=sc.nextLine();
	}
	
	for(int i=0;i<row1.length;i++) {
		System.out.println("name is : "+row1[i]);
	}
	
	
	}

}
