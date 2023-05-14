import java.util.Scanner;

public class GuessMeFinally {

	public static void main(String[] args) {
		
		//The program asks the user to pick a number.
		Scanner userInput = new Scanner(System.in);
		int num = 23;
		int userNum;
		
		
		
		do {
		System.out.println("I've chosen a number. Betcha can't guess it! Enter a number:");
		userNum = userInput.nextInt();
		//and print it out
		System.out.println("Your guess is " + userNum);
		//If their choice is less to the number print out a message.
		 if(userNum < num) {
				System.out.println( "Ha, nice try - too low! Try again!");
			}
			//If their choice is greater to the number print out a message.
		
			if(userNum > num) {
				System.out.println(  "Too bad, way too high. Try again!");
			}
		}
		
		while(userNum != num);
		
		
//		//If their choice is equal to the number print out: "Wow, nice guess! That was it!"
		if (userNum == num) {
			System.out.println("Wow, nice guess! That was it!");
		
	}

}
}
