import java.util.Scanner;

public class ConditionalCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(10>5);
//		System.out.println(10<5);
		Scanner scanner=new Scanner(System.in);
		int number1;
		System.out.println("Enter the first number: ");
		number1=scanner.nextInt();

//		System.out.println("Enter the second Number: ");
//		number2=scanner.nextInt();
		
		if (number1>0) {
			System.out.println(number1 + " is positive");
		}
		else {
			if(number1 ==0) {
				System.out.println(number1 + " is equal to 0");
			}
			else {
				System.out.println(number1 + " is negative" );
			}
		}

	}

}
