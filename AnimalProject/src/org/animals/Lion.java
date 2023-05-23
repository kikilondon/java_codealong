package org.animals;

public class Lion extends Animal {

	public Lion(String color, double weight, int age,boolean isVegetarian, boolean canClimb) {// take all arguments
		super(color, weight, age);
		
	}

	
	public void makeNoise() {
		
	System.out.println("Lion roars");
	}
	
	
}
