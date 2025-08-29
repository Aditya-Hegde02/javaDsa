package demo;
import java.util.*;
public class EmployeeMain {
	public static void main(String[] args) {
		
	

Employeebean eb=new Employeebean();
Scanner sc=new Scanner(System.in);
System.out.println("enter the Employee Name");
String name=sc.nextLine();
System.out.println("enter the Employee age");
int no=sc.nextInt();
System.out.println("enter the Employee ID");
int age=sc.nextInt();
Employeebean Employeebean=new Employeebean();
Employeebean.seteName(name);
Employeebean.seteAge(age);
Employeebean.seteNo(no);
System.out.println("Name :"+Employeebean.geteName());
System.out.println("Age :"+Employeebean.geteAge());
System.out.println("Employee ID :"+Employeebean.geteNo());

}
}