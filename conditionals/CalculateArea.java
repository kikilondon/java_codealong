import java.lang.StackWalker.Option;
import java.text.BreakIterator;
import java.util.Base64;
import java.util.Scanner;

import javax.swing.tree.AbstractLayoutCache;

public class CalculateArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		
		int length = 23;
		int  width =43;
		float pi = 3.14f;
		int radius = 12;
		int base = 20;
		
		int rectangleArea = length * width;
		int squareArea = width *width;
		int circleArea = (int) (pi * (radius * radius));
		int triangleArea = base * width /2;
		
		
		int userChoice;
		do {
		
		System.out.println("Welcome to area calculator");
		System.out.println("Please chose an option form the menu");
		
		System.out.println("1. Calculate Area of Rectangle");
		System.out.println("2. Calculate Area of Triangle");
		System.out.println("3. Calculate Area of Circle");
		System.out.println("4. Calculate Area of Square");
		System.out.println("5. Exit");
		
		
		userChoice = scanner.nextInt();
		
		switch(userChoice) {
		case 1:
			System.out.println( rectangleArea );
			break;
			
		case 2:
			System.out.println( triangleArea );
			break;
		case 3:
			System.out.println(circleArea );
			break;
		case 4:
			System.out.println(squareArea );
			break;
		case 5:
			System.out.println("Thank you for using our app!" );
			break;
			
			default :
				System.out.println("invalid choice");
		}
		
		
		}while (userChoice != 5);
	}

	}













