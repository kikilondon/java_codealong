import java.util.Scanner;

public class Factorial {
	static Scanner scanner=new Scanner(System.in);
	
	private int factorial, userInput;//declare private variables
	
	
	



   public int setInput() {//take input from user 
	 System.out.println("Enter a number please?");
	 userInput = scanner.nextInt();
	  
   return userInput;//return user input
   }
   
   
   public int getFactorial() {
	   
	   calFactorial();
	   return factorial;
   }
   
   
   private void calFactorial(){//calcolate factorial 
	   
	    factorial = 1;// initialize the factorial variable in which to store the final factorial. 
	    //I initialized because we are calculating the factorial of a specific number the initial value is always 1.
	    for (int i = 1; i <= userInput; i ++) {// the counter variable starts from 1 and goes on loop until when it doesn't reach the userinput value
		
		factorial = factorial * i;// for each iteration we multiply the current value of factorial with the current value of i (that is incremented every loop);
		//e.i.or example, let's say the userInput is 5. The loop will iterate from 1 to 5. During each iteration, the value of factorial is multiplied by the current value of i. Here's the breakdown:

//Iteration 1: factorial = 1 * 1 = 1
//Iteration 2: factorial = 1 * 2 = 2
//Iteration 3: factorial = 2 * 3 = 6
//Iteration 4: factorial = 6 * 4 = 24
//Iteration 5: factorial = 24 * 5 = 120
//After the loop completes, the factorial variable will hold the final factorial value.
	   
	    }
	   
   }
}
