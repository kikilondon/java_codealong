import java.util.Scanner;

import javax.swing.event.TreeWillExpandListener;

public class IterativeStructure {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
				System.out.println("Please, enter a number : ");
		int userInput= scanner.nextInt();
		
		
		for(int counter = 1 ; counter <= 10; counter ++) {
	
			System.out.println(userInput + "*" + counter + "=" + userInput * counter);
			
		}

	}

}
 
