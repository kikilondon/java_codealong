import java.util.Scanner;



public class ForTimes {

	public static void main(String[] args) {
		
		int num;
		int score;
		
		Scanner userNumScanner = new Scanner(System.in);
		System.out.println("Type a number please: ");
		num = userNumScanner.nextInt();
		
		for ( int i = 1; i < 16; i++) {
			System.out.println(i + " * " + num + " is: " + i*num);
		}
		
		

	}

}
