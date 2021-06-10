package dayfour;

import java.util.Scanner;

public class sting {
	public static void main(String[] args) {
		// getting inpit from user and and comparing
		Scanner EM =new Scanner(System.in);
		  System.out.println("Enter the First value for Compare :");
		  String  DR = EM.nextLine();
		  
		  System.out.println("Enter the Second value for Compare :");
		  String  ER = EM.nextLine();
		  
		  boolean A=DR.equals(ER);
			System.out.println("The result for compare is "+A);
			
	// Display the H letter from below string
			
		String S ="GreensTechnology";
		char le =S.charAt(9);
		System.out.println( le);
		
	// displaying total word length string contains from 0 to n-1 
		
		String E="SeleniumAutomationtool";
		int Se =E.length();
		System.out.println(Se);
		
	// displaying the n th word index value 
		
				String b="velnmurugan";
				int b1 =b.lastIndexOf("n");
				System.out.println(b1);
				
	// checking the string  particular words 
				
				String c="j a v a p r o g r a m ";
				boolean d=c.contains("p r o g r a m");
				System.out.println(d);
					
	}
	
	}


