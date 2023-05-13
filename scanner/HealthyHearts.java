import java.util.Scanner;

//Make a calculator app that asks the user for their age and then uses this value to calculate and display the healthy heart rate range they should use for exercising.
//The maximum heart rate should be 220 - their age.
//The target heart rate zone is 50 - 85% of the maximum.

public class HealthyHearts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		
		int age;
		String ageString;
		
		System.out.println("What is your age?");
		ageString = userInput.nextLine();
		age = Integer.parseInt(ageString);
		//System.out.println(age);
		
		int maxHeartRate = 220 - age;
		int hrZonemMin = (int) (maxHeartRate - (maxHeartRate * 0.5));
		int hrZonemMax = (int) (maxHeartRate - (maxHeartRate * 0.85));
		
		System.out.println("Your maximum heart rate should be  "+ maxHeartRate + " beats per minute.");
		System.out.println("Your target Hr zone is "+ hrZonemMin + " - " + hrZonemMax + " beats per minute.");
		
		

	}

}
