package demo;
import java.util.*;

public class name {
public static void main(String[] args)  {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the marks");
int marks=sc.nextInt();
String grade = null;
if(marks>80) {
	 grade="A";
}else if(marks>50&&marks<80) {
	grade="b";
}
else if(marks>40&&marks<50){
	grade="c";
	
}
else {
	System.out.println("other grade");
}
System.out.println("grade is "+grade);
}

}
