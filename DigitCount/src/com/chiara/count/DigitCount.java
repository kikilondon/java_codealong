package com.chiara.count;

public class DigitCount {
	private int userInput;
	private int length = 0;

	public void setNumber(int userInput) {
		this.userInput = userInput;

	}

	public int getcalculateDigitCount() {

		calculateDigitCount(userInput);

		return length;

	}

	private int calculateDigitCount(int userInput) {

		 if (userInput == 0) {
	            return 1; // Special case for number 
	        }
	        
	       
	        while (userInput != 0) {
	           userInput /= 10;
	            length++;
	        }
	        
	        return length;
	    }
		

	}



