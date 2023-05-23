package org.animals;

public class Elephant extends Animal {

	public Elephant(String color, double weight, int age,boolean isVegetarian, boolean canClimb) {
		super(color, weight, age);
		
	}
	

	
	public void makeNoise() {
		
	System.out.println("Elephant trumpets");
	}

}
