package org.zoo;

import org.animals.*;

public class ABCZoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	Lion lion = new Lion("Green", 150, 6, false, false);
	Tiger tiger = new Tiger("Striped", 145, 3, false, false);
	Deer deer = new Deer("Blue", 74, 7, true, false);
	Monkey monkey = new Monkey("Beige", 50, 2, true, true);
    Elephant elephant = new Elephant("Pink", 300, 15, true, false);
    Giraffe giraffe = new Giraffe("Blue and Green", 300, 6, true, false);


    
    System.out.println("List of animals hosted in ABCZoo: ");
    System.out.println("================================");
    System.out.println("Lion\nColor: " + lion.color + "\nWeight :" + lion.weight + "kg \nAge: " + lion.age + " years");
    System.out.println("Is Lion Vegetarian ? " + lion.isVegetarian());
    System.out.println("Can it climb? " + lion.canClim());
    lion.makeNoise();
    
   
    System.out.println("================================");
    System.out.println("Tiger\nColor: " + tiger.color + "\nWeight :" + tiger.weight + "kg \nAge: " + tiger.age + " years");
    System.out.println("Is it vegetarian ? " + tiger.isVegetarian());
    System.out.println("Can it climb? " + tiger.canClim());
    tiger.makeNoise();
    
    
    System.out.println("================================");
    System.out.println("Deer\nColor: " + deer.color + "\nWeight :" + deer.weight + "kg \nAge: " + deer.age + " years");
    System.out.println("Is it vegetarian ? " + deer.isVegetarian());
    System.out.println("Can it climb? " + deer.canClim());
    deer.makeNoise();
    
    System.out.println("================================");
    System.out.println("Monkey\nColor: " + monkey.color + "\nWeight :" + monkey.weight + "kg \nAge: " + monkey.age + " years");
    System.out.println("Is it vegetarian ? " + monkey.isVegetarian());
    System.out.println("Can it climb? " + monkey.canClim());
    monkey.makeNoise();
    
    System.out.println("================================");
    System.out.println("Elephant\nColor: " + elephant.color + "\nWeight :" + elephant.weight + "kg \nAge: " + elephant.age + " years");
    System.out.println("Is it vegetarian ? " + elephant.isVegetarian());
    System.out.println("Can it climb? " + elephant.canClim());
    elephant.makeNoise();
    
    System.out.println("================================");
    System.out.println("Giraffe\nColor: " + giraffe.color + "\nWeight :" + giraffe.weight + "kg \nAge: " + giraffe.age + " years");
    System.out.println("Is it vegetarian ? " + giraffe.isVegetarian());
    System.out.println("Can it climb? " + giraffe.canClim());
    giraffe.makeNoise();

}
}