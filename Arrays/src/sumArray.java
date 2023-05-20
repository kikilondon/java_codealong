import java.util.Scanner;

public class sumArray {

	public static void main(String[] args) {
		double doubleValues[] = new double[8];
		
		Scanner scanner = new Scanner(System.in);
		
		for (int index = 0; index < 8; index++) {
			System.out.println("Enter " + (index + 1) + " value : ");
			doubleValues[index] = scanner.nextDouble();
			
			
		
	}
	double sum = 0;
		
	for (int i  =0 ; i < doubleValues.length ; i++) {
		 sum += doubleValues [i]; 
		 //System.out.println("i = " + i + " current sum = " + sum);
		
	}
	  System.out.println("Final sum: " + sum);
		

}
}
