package methodCodealong;

import java.util.Scanner;

public class MatchWork {

	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String a = "uuu";
		String b = "The word Cart should come before Horse alphabetically"; 
		String word = "L";
		
		double y = 42;
		int x = 1337;

		
		System.out.println(" The word Cart should come before Horse alphabetically : " + comesBefore(a,b));
        System.out.println(" Half of 42 = " + halfOf(y));
        System.out.println(" (short) Pi = " + pi());
        System.out.println(" The first letter of the word Llama is: " + firstLetter(word));
        System.out.println(" 1337 x 1337 = " + times1337(x));

	}

    public static double pi(){
        return 3.14;
    }

    public static int times1337(int x){
        return x * 1337;
    }

    public static double halfOf(double y){
        return y / 2;
    }

    public static String firstLetter(String word){
        return word.substring(0, 1);
    }

    public static boolean comesBefore(String a, String b){
        return a.compareToIgnoreCase(b) < 0;
    }


		
		

}




