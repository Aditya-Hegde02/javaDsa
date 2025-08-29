package demo;

import java.util.Scanner;

public class studentmain {
public static void main(String[] args) {
	
	encapsulation  sb=new encapsulation();
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter student name");
	 String  studentName=sc.next();
	 
	 System.out.println("enter student age");
	 int 	studentAge=sc.nextInt();
	 
	 System.out.println("enter student mobile no");
	 long	studentMobileNo=sc.nextLong();
	 
	 System.out.println("enter student email-ID");
	 String 	emailId=sc.next();
	 
	 encapsulation encapsulation = new encapsulation();
	 
	 encapsulation.setStudentName(studentName);
	 encapsulation.setStudentAge(studentAge);
	 encapsulation.setStudentMobileNo(studentMobileNo);
	 encapsulation.setEmailId(emailId);
	 
	 System.out.println("Name :"+encapsulation.getStudentName());
	 System.out.println("Age :"+encapsulation.getStudentAge());
	 System.out.println("Mobile no :"+encapsulation.getStudentMobileNo());
	 System.out.println("Email :"+encapsulation.getEmailId());
}
}
