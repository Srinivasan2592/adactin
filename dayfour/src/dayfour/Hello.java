package dayfour;

import java.util.Scanner;

public class Hello {
	  public static void main(String[] args) {
		  Scanner EM =new Scanner(System.in);
		  System.out.println("Enter THE VOTER AGE :");
			int Tamil = EM.nextInt();
		 // for (int i = 18; i<=Tamil;i++)
		// {
		//	System.out.println("he can vote ");
	 // }
			  int j = 18;
			if (j <= Tamil) {
			        //continue;
			      
			      System.out.println("he can vote ");
			  }
			  else {
				  System.out.println("he cannot vote");
			  }
			// to print even number 
			int n = 100;
			//System.out.print("Even Numbers from 1 to "+n+" are: ");
			for (int i = 2; i <= n; i++) {
			   //if number%2 == 0 it means its an even number
			   if (i % 2== 0) {
				System.out.print(i + " ");
			   }
			}
			// print odd number
			//int g = 500;
			//System.out.print("Even Numbers from 1 to "+g+" are: ");
			//for (int k = 1; k <= g; k++) {
			   //if number%2 == 0 it means its an even number
			  // if (k % 2 != 0) {
				//System.out.print(k + " ");
			   //}
			//}
			
	}
}
//}
