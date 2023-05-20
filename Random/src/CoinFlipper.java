import java.util.Random; 
public class CoinFlipper {

	public static void main(String[] args) {
        Random random = new Random();
        
        // Generate a random boolean value representing the coin toss
        boolean isHeads = random.nextBoolean();

        // Print the result of the coin toss
        if (isHeads) {
        	System.out.println("Ready, Set, Flip ...!!");
            System.out.println("Heads");
        } else {
        	System.out.println("Ready, Set, Flip ...!!");
            System.out.println("Tails");
        }
		
	}

}
