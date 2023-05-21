import java.util.Scanner;


public class FactorialMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Factorial Factorial= new Factorial();
		
		int userInput = Factorial.setInput();
		int factorialNum = Factorial.getFactorial();
		
		System.out.println("The factorial of " + userInput + " is: " + factorialNum);

	}

}
