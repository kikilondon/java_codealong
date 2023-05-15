package methodCodealong;

import java.time.chrono.MinguoChronology;
import java.util.Random;

public class BarelyControlledChaos {

	public static void main(String[] args) {
		
		
		String color = randomColor(); // call color method here
        String animal = randomAnimal(); // call animal method again here
        String colorAgain = randomColor(); // call color method again here
        int weight = randomNumber(5,200); // call number method,
            // with a range between 5 - 200
        int distance = randomNumber(10,20); // call number method,
            // with a range between 10 - 20
        int number = randomNumber(10000,20000); // call number method,
            // with a range between 10000 - 20000
        int  time = randomNumber(2,6); // call number method,
            // with a range between 2 - 6            

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + colorAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");
    }

	
	public static String randomColor() {
		Random rng = new Random();

		String[] colors = new String[] { "Blue", "Red", "Yellow", "Pink", "Acquamarine" };
		int randomIndex = rng.nextInt( colors.length );
		String randomName = colors[randomIndex];
		return randomName;
		
	}
	
	public static String randomAnimal() {
		Random rng = new Random();

		String[] animal = new String[] { "kingfisher", "cat", "robin", "sloth", "marmot" };
		int randomIndex = rng.nextInt( animal.length );
		String randomAnimal = animal[randomIndex];
		return randomAnimal;
		
		
	}
   
  
	public static int randomNumber(int min,int max) {
		Random rng = new Random();
		
       int randomInteger = (int)Math.floor(Math.random() * (max - min + 1) + min);
       return randomInteger;
		
}
		
		
		
	}


