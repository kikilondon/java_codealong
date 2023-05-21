package com.chiara.rock.paper.scissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	//private variables
	private int playerScore = 0;
	private int computerScore = 0;
	private int tieRounds = 0;
	private int numRounds; 
	
	
	private Scanner scanner = new Scanner(System.in);
	
	
	public  void playGame() {
		
		//asking user number of rounds he/she wants to play
    	System.out.println("How many rounds would you like to play?\nPlease select a number between 1 to 10:");
		numRounds = scanner.nextInt();
		
		//condition to check if the number is included between 1 and 10 
       if (numRounds <= 0 || numRounds >10) {
	        System.out.println("Incorrect number!!");
	        System.exit(0);
       }			
		
          //for loop to iterate number of rounds chosen 
	       for(int i =0; i < numRounds ; i++) {
	
		    //display menu
			System.out.println("\nChoose from these options:");
			System.out.println("1.Rock");
			System.out.println("2.Paper");
			System.out.println("3.Scissor");
			
			//generating user move
			int playerMove = scanner.nextInt();
			
	
			
			//generating random number from array of numbers for computerMove
			int[] arr = {1,2,3};	
			int computerMove = arr[new Random().nextInt(arr.length)];
			System.out.println("Computer choice : " +computerMove+ "\n");
	
	
		   //game process
			if (playerMove == computerMove){
				
				System.out.println("This round was tie! \n");
				tieRounds ++;
			}
				
				else if(playerMove == 1){
					if (computerMove ==2){
						
						System.out.println("You lose!\n");
						computerScore ++;
						
					}else if (computerMove == 3){
						
						System.out.println("You win!!\n");
						playerScore ++;
					}
				}
				
			
			
				else if(playerMove == 2){
					if (computerMove == 1){
						
						System.out.println("You win!\n");
						playerScore ++;
						
					}else if(computerMove == 3){
						
						System.out.println("You lose!\n");
						computerScore++;
					}
				}
			
			
			
	            else if (playerMove == 3){
					if (computerMove == 1){
						
						System.out.println("You lose!\n");
						computerScore ++;
						
					}else if (computerMove == 2){
						
						System.out.println("You Win!\n");
						playerScore++;
					}
				
	             }
			    
		}  
		//display scores and winner
		displayScores(computerScore, computerScore, computerScore);
		//play again
		playAgain();
}
       	       

	   
	   
	   
	   
	   public static void displayScores(int tieRounds, int playerScore, int computerScore){// add variables as arguments
			
			
			System.out.println("Tie Rounds : " + tieRounds);
			System.out.println("Player score : " + playerScore);
			System.out.println("Computer score : " + computerScore);
			
			if(playerScore > computerScore){
				System.out.println("You are the winner!! \n");
			}else {
				System.out.println("Computer is the winner!! \n");
				}

	 }
	



		
	//method to play again
	 public static void playAgain(){
			
		
			Scanner scanner=new Scanner(System.in);
			System.out.println("Would you like to play again? (y/n)");
			String playAgainString = scanner.nextLine();
			
			if (playAgainString.equalsIgnoreCase("y")){
				
				RockPaperScissors newGame = new RockPaperScissors();//create a new object to call the method playGame();
				newGame.playGame();
				
			}
			else {
				System.out.println("Thanks for playing!!");
				
			}
		}

		
		
		
	}

