import java.util.Scanner;
import java.util.Random;
public class LuckySeven {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

       //ask to the user the amount of money he wants to bet 
        System.out.print("Enter the amount of money you have to bet: £ ");
        int money = scanner.nextInt();
//declare a couple of variable in which to store 
        int rolls = 0;
        int maxMoney = money;
        int rollsAtMaxMoney = 0;

        Random random = new Random();

        // while loop will play the game until the money finishes
        while (money > 0) {
            // Roll the dice
            int dice1 = random.nextInt(6) + 1;
            int dice2 = random.nextInt(6) + 1;
            int sum = dice1 + dice2;

            // Check if the sum is 7
            if (sum == 7) {
                money += 4; // Win £4
            } else {
                money -= 1; // Lose £1
            }

            rolls++; // Increment the number of rolls

            // Check if the current money is the maximum
            if (money > maxMoney) {
                maxMoney = money;
                rollsAtMaxMoney = rolls;
            }
        }

        // Print the results
        System.out.println("You ran out of money after " + rolls + " rolls.");
        System.out.println("The maximum amount of money you held was £" + maxMoney);
        System.out.println("It happened after " + rollsAtMaxMoney + " rolls.");

        scanner.close();//close scanner

	}

}
