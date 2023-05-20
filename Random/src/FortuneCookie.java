import java.util.Random;
public class FortuneCookie {

	public static void main(String[] args) {
	// array of strings
		String fortuneMessages[]=  {"Those aren't the droids you're looking for.", "Never go in against a Sicilian when death is on the line!" , "Goonies never say die." , 
				"With great power, there must also come — great responsibility.", "Never argue with the data.",  "Try not. Do, or do not. There is no try.",
				"You are a leaf on the wind, watch how you soar." , "Do absolutely nothing, and it will be everything that you thought it could be.",
				"Kneel before Zod.", "Make it so." };
		
	
	//call the random 	
		Random random = new Random();
		//generate a random index;
		int randomIndex = random.nextInt(fortuneMessages.length);
		
		//retrieves the corresponding element from the array
		String randomChoiceString = fortuneMessages[randomIndex];
		
		System.out.println(" Your Geek of fortune: " + randomChoiceString);
		 
	}

}
