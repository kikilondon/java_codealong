package com.chiara.factorizer;

import java.util.Scanner;

public class Main {
	static Scanner scanner= new Scanner(System.in);

	public static void main(String[] args) {
	
		System.out.print("Enter a positive integer: ");
		int number = scanner.nextInt();

		Factorizer factorizer = new Factorizer(number);// create a new object of the class factorizer
		factorizer.factorize();//call the method stored in factorizer class, the method that calculate the factorial 
		factorizer.printResults();// call the method stored in factorizer class, that print out the results. 
       
	
		
		
	}

}
