
public class SpringForwardFallBack {

	public static void main(String[] args) {
		

		
		System.out.println("It's Spring...!");
        for (int i = 1; i < 11; i++) {
            System.out.print(i + ", ");
        }

        System.out.println("\nOh no, it's fall...");
        for (int i = 10; i > 0; i--) {
            System.out.print(i + ", ");
        }
	}

}
//What are the start/stop ranges of output for both loops?
// 1 to 9 and 10 to 1 

//How can you update the first loop so that it prints out the same range as the second loop, changing only the start point or the stopping point?
//i = 1 / i < 11