import java.util.Iterator;
import java.util.Scanner;

public class assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
		int userInput;
		
		System.out.println("Please,enter a number:");
		userInput=scanner.nextInt();
		
		int factorial = 1;
	    for (int counter = 1; counter <= userInput; counter ++) {
		
		
		factorial = factorial * counter;
		
		
		
		
	}
	System.out.println("The factorial number is " + factorial);
	}

}
