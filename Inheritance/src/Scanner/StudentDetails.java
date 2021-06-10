package Scanner;
import java.util.Scanner;

import CustomerDetails.SbiBank;
public  class StudentDetails  {
	public void StudentId() {
		System.out.println("Your EmPloyee id is : 102");
	}
	public void StudentName() {
		System.out.println("Your EmPloyee Name is : Ragu");
	}
	public static void main(String[] args)	{
		StudentDetails SBI =new   StudentDetails();
		SBI. StudentId();
		SBI. StudentName();
		
		Scanner EM =new Scanner(System.in);
		
		//System.out.println("Enter The  empId :");
		//int empid = EM.nextInt();
		//EM.nextLine();
		//System.out.println("Enter The Name :");
		//EM.nextLine();
		//String empName = EM.nextLine();
		
		System.out.println("Enter Your EmpEmail :");
		String empEmail =EM.next();
		
		System.out.println("Enter The  EmpPhoneno :");
		long  empPhoneno = EM.nextLong();
		
		System.out.println("Enter Your EmpSalary is :");
		float EmpSalary = EM.nextFloat();
		
		System.out.println("Enter Your EmpGender is :");
		String EmpGender =EM.next();

		System.out.println("Enter Your CityName Is :");
		String Empsalary =EM.next();
		
		//System.out.println("Your EmPloyee id is :"+empid);
		//System.out.println("Your Employeename is :"+empName);
		System.out.println("Your empEmail is :"+empEmail);
		System.out.println("Your  EmpPhoneno is :"+empPhoneno);
		System.out.println("Your EmpSalary is :"+EmpSalary);
		System.out.println("Your EmpGender is :"+EmpGender);
		System.out.println("Your CityName  is :"+Empsalary);	
}
}