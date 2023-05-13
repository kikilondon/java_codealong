import java.util.Scanner;

public class DoItBetter {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		int miles;
		int language;
		int hotDog;
		String hotDogString;
		String mileString;
		String languageString;
	
		 
		
		
		System.out.println("How many miles can you run?");
		mileString = userInput.next();
		miles = (int) Float.parseFloat(mileString);
		int myMiles = miles * 2 +1 ;
		System.out.println("I can run more. My total is "+ myMiles +  " miles per day.");
		
		
		System.out.println("How many hot dogs can you eat per day?");
		hotDogString = userInput.next();
		hotDog = (int) Float.parseFloat(hotDogString);
		int myHotDog = hotDog * 2 +1 ;
		System.out.println("I can eat more. My total is "+ myHotDog +  " hot dog per day.");
		
		
		
		System.out.println("How many language do you speak?");
		languageString = userInput.next();
		language = (int) Float.parseFloat(languageString);
		int myLanguages = language * 2 +1 ;
		System.out.println("I can speak more language. I speak "+ myLanguages +  " languages.");
		
		

	}
}

