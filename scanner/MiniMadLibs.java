import java.util.Scanner;

public class MiniMadLibs {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Let's play MAD LIBS!");
		
		
		String string1;
		String string2;
		String string3;
		String string4;
		String string5;
		String string6;
		String string7;
		String string8;
		String string9;
		String string10;
		
		
		
		System.out.println("Please, enter a noun:");
		string1 = userInput.nextLine();
		
		System.out.println("Please, enter an adjective:");
		string2 = userInput.nextLine();
		
		System.out.println("Please, enter another noun:");
		string3 = userInput.nextLine();
		
		System.out.println("Please, enter a number:");
		string4 = userInput.nextLine();
		
		System.out.println("Please, enter another adjective:");
		string5 = userInput.nextLine();
		
		System.out.println("Please, enter a plural noun:");
		string6 = userInput.nextLine();
		System.out.println("Please, enter another plural noun:");
		string7 = userInput.nextLine();
		
		System.out.println("Please, one more:");
		string8 = userInput.nextLine();
		
		System.out.println("Please, enter a verb (infinitive form):");
		string9 = userInput.nextLine();
		
		System.out.println("Please, enter the same verb (past participle):");
		string10 = userInput.nextLine();
		
		
		System.out.println("*** NOW LETS GET MAD (libs) ***");
		
		System.out.println(string1 +  " : the  " + string2 + " frontier. These are the voyages of the starship " +  string3 + ". "  + "Its " + string4 +  
				" -year mission: to explore strange " +  string5 + " " +  string6 + " ,to seek out "  + string5 + " " + string7 + " and " +  string5 +
				" " + string8 + ", to boldly  " + string9 + "  where no one has " +  string10 + " before.");
		
		
		
		
		
		
		
		

	}

}
