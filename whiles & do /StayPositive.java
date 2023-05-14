
import java.util.Scanner;



public class StayPositive {

	public static void main(String[] args) {
		
		Scanner userNumberScanner = new Scanner(System.in);
		
		int num;
		boolean isValid = false;
		
			
			System.out.println("What number should I count down from?");
		    num = userNumberScanner.nextInt();
		    
		    if(num < 0){
				 System.out.println("That is not a positive number! ");
				    	
		    }
		    
		    while (num > 0) {
			num--;
			System.out.print(num);
			if (num %10 == 0 ) {
			System.out.println("\n");
			}
		    }
	}
}
	
		
		  
		 


	
	
			

