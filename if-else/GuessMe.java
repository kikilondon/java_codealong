import java.util.Scanner;

public class GuessMe {
//Write a program that that has an integer of your choice stored in a variable.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 23;
		int userNum;
		
		//The program asks the user to pick a number.
		Scanner userInput = new Scanner(System.in);
		System.out.println("I've chosen a number. Betcha can't guess it! Enter a number:");
		userNum = userInput.nextInt();
		//and print it out
		System.out.println("Your guess is " + userNum);
		
		//If their choice is equal to the number print out: "Wow, nice guess! That was it!"
		if (userNum == num) {
			System.out.println("Wow, nice guess! That was it!");
		}
		//If their choice is less to the number print out: "Ha, nice try - too low! I chose #."
		if(userNum < num) {
			System.out.println( "Ha, nice try - too low! I chose " + num + "!");
		}
		//If their choice is greater to the number print out: "Too bad, way too high. I chose #."
	
		if(userNum > num) {
			System.out.println(  "Too bad, way too high. I chose " + num + "!");
		}
		
		
		
		

	}

}
