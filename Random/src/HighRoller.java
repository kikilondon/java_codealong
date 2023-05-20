import java.util.Random;

import java.util.Scanner;
public class HighRoller {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of sides a single die has: ");
        int numSides = scanner.nextInt();
        
        

		 Random diceRoller = new Random();

	        int rollResult = diceRoller.nextInt(6) + 1;

	        System.out.println("TIME TO ROOOOOOLL THE DICE!");
	        System.out.println("I rolled a " + rollResult);

	        if (rollResult == 1) {
	            System.out.println("You rolled a critical failure! Ouch.");
	        } else if (rollResult == numSides) {
	            System.out.println("You rolled a critical! Nice job!");
	        }
	}

}
