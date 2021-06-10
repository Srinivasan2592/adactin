package dayfour;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Addition {
	public static void main(String[] args) {
		int sum=0;
		double average=0;
		int a[] = new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=2;
		a[3]=4;
		a[4]=5;
		
		for(int i=0; i<a.length; i++) {
			sum=sum+a[i];
			average = sum/a.length;
			
			System.out.println(a[i]);
			
		}
		
		//array list+linked list
		
		List<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    //output of arraylist
	    
	    System.out.println("*******************************");
	    System.out.println("output of arraylist");
	    System.out.println(cars);
	    System.out.println("output of arraylist cars length is:");
	    System.out.println(cars.size());
	    System.out.println("*******************************");
	    
	    
		List<String> Vechile = new LinkedList<String>();
		Vechile.add("Benze");
		Vechile.add("TATA");
		Vechile.add("Hundai");
		Vechile.add("KIA");
		
		System.out.println("*******************************");
		System.out.println("output of linkedlist");
		System.out.println(Vechile);
		System.out.println("*******************************");
		    
		    //print  for linked list+arraylist (copy value from car to vechile)
		
		System.out.println("result for linked list+arraylist");
		    Vechile.addAll(cars);
		    System.out.println(Vechile);
		
		
		
		//print for addition
		
		 System.out.println("*******************************");
		 System.out.println(sum);
		 System.out.println(average);
		 System.out.println("*******************************");
	}

}
