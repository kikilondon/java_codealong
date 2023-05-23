package org.animals;

public class Monkey extends Animal {

	public Monkey(String color, double weight, int age, boolean isVegetarian, boolean canClimb) {
		super(color, weight, age);
		
	}
	
	
	
	public void makeNoise() {
		
	System.out.println("Monkey screeches");
	}

}
