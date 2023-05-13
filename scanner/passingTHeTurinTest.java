import java.util.Scanner;
import java.util.function.BiConsumer;

public class passingTHeTurinTest {

	public static void main(String[] args) {
		
		 Scanner userInput = new Scanner(System.in);
		 String yourName;
		 String favColour;
		 String favFruit;
		 int userNumber;
		 int myFavNumber = 9;
		 String stringNumber;
		 
		 
		 
		 System.out.println("What is you name?");
		 yourName = userInput.nextLine();
		 
		 System.out.println("Hello " + yourName + "! I'm Chiara.");
		 System.out.println("What is your favorite colour?");
		 favColour = userInput.nextLine();
		 
		 System.out.println("Huh, " + favColour + " is nice! Mine is acquamarine green/blue.");
		 
		 System.out.println("I like " + favColour+ ", it reminds me of my childhood.");
		 System.out.println("What's your favorite fruit?");
		 favFruit = userInput.next();
		 
		 System.out.println("Really? " + favFruit + " I don't like them, I prefer something more sugary.");
		 
		System.out.println("Speaking of favorites, what's your favorite number?");
		
		stringNumber = userInput.nextLine();
		userNumber = Integer.parseInt(userInput.next());
		//System.out.println(number);
		int mult = myFavNumber * userNumber ;
		
		System.out.println( userNumber +" is a cool number. Mine's " + myFavNumber + ".");
		System.out.println("Did you know "+ userNumber + " * " + myFavNumber + " is " + mult + " ? That's a cool number too!");
		
		 
		 
		 
		 
	}

}
