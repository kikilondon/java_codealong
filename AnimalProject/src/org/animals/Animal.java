package org.animals;



//Create Java project in which create a package named org.animals. In that create a super class called 
//Animal and various sub classes like Lion, Tiger, Deer, Monkey, Elephant and Giraffe. 
//In each class create data members like color, weight,age etc. Create methods like isVegetarian, canClimb, sound etc.
//create a package called org.zoo and create a class called ABCZoo and create objects for the animals that are existing in zoo and print the characteristic of each animal.


public class Animal {

	
	public String color; 
	
	public double weight;
	public int age;
	
	
	public Animal(String color, double weight, int age) {
		super();
		this.color = color;
		this.weight = weight;
		this.age = age;
	}
	
	
	
	public String getColor() {
		return color;
	}
     
	public void setColor(String color) {
		this.color = color;
	}

    
	public double getWeight() {
		return weight;
	}

    
	public void setWeight(double weight) {
		this.weight = weight;
	}

    
	public int getAge() {
		return age;
	}

    public void setAge(int age) {
		this.age = age;
	}









	public boolean isVegetarian() {
		
		return false; 
	}
	
	public boolean canClim() {
		return false;
	}
	
	public void makeNoise() {
		
	System.out.println("This animal makes noise");
	}
	
}
