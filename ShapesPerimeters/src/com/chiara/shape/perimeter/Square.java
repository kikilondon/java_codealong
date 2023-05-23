package com.chiara.shape.perimeter;

public class Square extends Shape {// sub class of Shape
	

	private int side;
	
	
	

	public Square(int side, String color) {//constructor for side and for color coming from super-class
		super(color);
		this.side = side;
	}

	
	


	@Override
	public void getArea() {
		
		System.out.println("Area of Square :" + side * side);
		
		
	  

	}

	@Override
	public void getPerimeter() {
		
		System.out.println("Perimeter of Square :" + 4 * side);
		

	}
	
	public void printColor() {// method to get the color 
        System.out.println("Color: " + getColor());
    }
	
}