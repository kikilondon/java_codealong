import java.util.Scanner;

public class TriviaNight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInputScanner = new Scanner(System.in);
		System.out.println("It's TRIVIA NIGHT! Are you ready?!");
		
		int userGuess;
		int numOfGuess = 0;
		int score = 0;
		
		int totQuestions = 3;
		
		
		
		//ask 3 questions 
		
		System.out.println("FIRST QUESTION: ");
		System.out.println("What is the Lowest Level Programming Language?");
		System.out.println("1.Source Code");
		System.out.println("2.Assembly Language");
		System.out.println("3.C#");
		System.out.println("4.Machine Code");
		userGuess = userInputScanner.nextInt();
		
		System.out.println("Your answer is: " + userGuess);
		totQuestions--;
		if(userGuess == 4){
			score++;
			System.out.println("Your answer is correct!! Your current score is: " + score + " and you have " + totQuestions + " questions remaining!");
		}
		else {
		System.out.println("Incorrect answer!");
		}
		
		System.out.println("SECOND QUESTION: ");
		System.out.println("Website Security CAPTCHA Forms Are Descended From the Work of?");
		System.out.println("1.Grace Hopper");
		System.out.println("2.Alan Turing");
		System.out.println("3.Charles Babbage");
		System.out.println("4.Larry Page");
		userGuess = userInputScanner.nextInt();
		
		System.out.println("Your answer is: " + userGuess);
		totQuestions--;
		if(userGuess == 2){
			score++;
			System.out.println("Your answer is correct!! Your current score is: " + score + " and you have " + totQuestions + " question remaining!");
		}
		else {
		System.out.println("Incorrect answer!");
		}
		
		System.out.println("THIRD QUESTION: ");
		System.out.println("Which of These Sci-Fi Ships Was Once Slated for a Full-Size Replica in Las Vegas?");
		System.out.println("1.Serenity");
		System.out.println("2.The Battlestar Galactica");
		System.out.println("3.The USS Enterprise");
		System.out.println("4.The Millennium Falcon");
		userGuess = userInputScanner.nextInt();
		
		System.out.println("Your answer is: " + userGuess);
		totQuestions--;
		if(userGuess == 3){
			score++;
			
			System.out.println("Your answer is correct!! Your current score is: " + score + " and you have " + totQuestions + " questions remaining!");
		}
		else {
		System.out.println("Incorrect answer!");
		}

		System.out.println("Your final score is: " + score);
		
		
		if(score == 0) {
			System.out.println("Great effort, review and try again!");
		}
		else if (score >1 && score < 3) {
			System.out.println("Well done, you can improve!");
		}
		else if (score == 3) {
			System.out.println("Awesome!You got 3 correct");
		}
		
		

	}

}
