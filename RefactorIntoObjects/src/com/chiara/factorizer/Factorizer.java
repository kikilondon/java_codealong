package com.chiara.factorizer;

public class Factorizer {
	
	
	//declaration of private variables
		private int number;
		private int sumOfFactors;
		private int factorCount;
		private boolean isPerfect;
		private boolean isPrime;

		public Factorizer(int number) {//accessing variables
			this.number = number;
			this.sumOfFactors = 0;
			this.factorCount = 0;
			this.isPerfect = false;
			this.isPrime = false;
		}

		public void factorize() {
			for (int i = 1; i < number; i++) {// we start from 1 because we want to exclude the number itself 
				if (number % i == 0) {// if the reminder of number divided by the current index is == 0, it means that that number(i) is a factorial
					System.out.println("Factor: " + i);
					sumOfFactors += i;// increment by 1 the counter which store the number of factorials
					factorCount++;
				}
			}
			
		
			isPerfect = (sumOfFactors == number);//check conditions
			isPrime = (factorCount == 1);
		}

		public void printResults() {//display result
			System.out.println("Number to factor: " + number);
			System.out.println("Total number of factors: " + factorCount);
			System.out.println("Perfect number: " + isPerfect);
			System.out.println("Prime number: " + isPrime);
		}
	}

   
   

	
	

