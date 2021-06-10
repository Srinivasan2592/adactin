package Scanner;

import java.util.Scanner;

public class StudentMark extends StudentDetails {
	public static void main(String[] args)	{
		//DECLARATION
		int total;
		float average,percentage;
		
		StudentDetails SBI =new   StudentDetails();
		SBI. StudentId();
		SBI. StudentName();
		
		Scanner EM =new Scanner(System.in);
		
		//GETTING INPUT VALUE
		//System.out.println("Enter The  StudentId :");
		//int StudentId = EM.nextInt();
		
		//System.out.println("Enter The StudentName :");
		//EM.nextLine();
		//String StudentName = EM.nextLine();
		
		System.out.println("Enter Your Tamil Mark :");
		int Tamil = EM.nextInt();
		
		System.out.println("Enter The  English Mark :");
		int  English = EM.nextInt();
		
		System.out.println("Enter Your Maths Mark is :");
		int Maths  = EM.nextInt();
		
		System.out.println("Enter Your Science Mark is :");
		int  Science = EM.nextInt();

		System.out.println("Enter Your Social Mark Is :");
		int Social = EM.nextInt();				
		
		//print function
		System.out.println("=====================================");
		System.out.println("Your EmPloyee id is :"+SBI);
		System.out.println("Your Employeename is :"+SBI);
		System.out.println("=====================================");
		System.out.println("Your Tamil is :"+ Tamil);
		System.out.println("Your English is :"+English);
		System.out.println("Your Maths is :"+Maths);
		System.out.println("Your Science is :"+Science);
		System.out.println("Your Social  is :"+Social);
		System.out.println("=====================================");
		
		//CALCULATION FORMULA
		total=Tamil+English+Maths+Science+Social;
		average=(total/2);
		percentage=((total/2)*500);
		
		//PRINT CALCULATION FORMULA
		System.out.println("=====================================");
		System.out.println("Your Total  is :"+total);
		System.out.println("Your average  is :"+average);
		System.out.println("Your percentage  is :"+percentage);
			
	}
}
