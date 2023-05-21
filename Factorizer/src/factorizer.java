import java.util.Scanner;

public class factorizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		        // Ask the user for the number to factor
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a positive integer: ");
		        int number = scanner.nextInt();
		      

		        // Print out the original number
		        System.out.println("Number to factor: " + number);

		        // Find factors and check if prime/perfect
		        int sumOfFactors = 0;//declare a variable in which to store the sum of factors
		        int factorCount = 0;// counter that stores the tot number of factors

		        
		        for (int i = 1; i < number; i++) {// we start from 1 because we want to exclude the number itself 
		            if (number % i == 0) {// if the reminder of number divided by the current index is == 0, it means that that number(i) is a factorial
		               
		                System.out.println("Factor: " + i);// print the factorial 
		                sumOfFactors += i; //update the sum of the factorial incrementing by the current index 
		                factorCount++;// increment by 1 the counter which store the number of factorials
		            }
		        }

		        // Check if the number is perfect
		        boolean isPerfect = (sumOfFactors == number);

		        // Check if the number is prime
		        boolean isPrime = (factorCount == 1);

		        // Print the total number of factors
		        System.out.println("Total number of factors: " + factorCount);

		        // Print whether the number is perfect
		        System.out.println("Perfect number: " + isPerfect);

		        // Print whether the number is prime
		        System.out.println("Prime number: " + isPrime);
		    }
		

	}


