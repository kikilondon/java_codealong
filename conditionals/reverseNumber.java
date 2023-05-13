import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, enter a number : ");
       int userInput= scanner.nextInt();
       int duplicated = userInput;
       
       int reverse = 0;
       
       for (;userInput!=0; userInput = userInput / 10 ) {
    	   
    	   int reminder = userInput % 10;
    	   reverse = reverse *10 + reminder;
    
    	   
    	   
       }
      
       
       System.out.println("The reverse of your number is : " + reverse);
       
       if(duplicated == reverse ) {
    	   System.out.println("Your number is a palindrome!");
       }
       else{
    	   System.out.println("Your number is not a palindrome.");
    }
   	

	}
	
	

}
