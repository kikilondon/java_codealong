package com.chiara.count;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);

		DigitCount digitCounter = new DigitCount();

		System.out.println("Enter a number please:");
		int userInput = scanner.nextInt();
		
		digitCounter.setNumber(userInput);
		int digitCount = digitCounter.getcalculateDigitCount();

		System.out.println("The length of " + userInput + " is:  " +  digitCount);

	}

	}


