import java.util.Scanner;
import java.util.Random;

public class GuessMeMore {

	public static void main(String[] args) {
		
		Random num = new Random();
		
//generate random number
	    int randomNum = num.nextInt(201) - 100;
		
		// declare variable for user input
	    int userNum;
		//The program asks the user to pick a number.
		Scanner userInput = new Scanner(System.in);
		
		
		// add in a loop condition so the program keeps asking the user to chose a number;
		while(true) {
		System.out.println("I've chosen a number between 100 and - 100. Betcha can't guess it! Enter a number:");
		userNum = userInput.nextInt();
		//and print it out
		System.out.println("Your guess is " + userNum);
		
		//If their choice is equal to the number print out: "Wow, nice guess! That was it!"
		if (userNum == randomNum) {
			System.out.println("Wow, nice guess! That was it!");
		}
		//If their choice is less to the number print out: "Ha, nice try - too low! I chose #."
		if(userNum < randomNum) {
			System.out.println( "Ha, nice try - too low! I chose " + randomNum + "!");
		}
		//If their choice is greater to the number print out: "Too bad, way too high. I chose #."
	
		if(userNum > randomNum) {
			System.out.println(  "Too bad, way too high. I chose " + randomNum + "!");
			
		}else {
			System.out.println("Try again!");
		}
		

	}

}
}