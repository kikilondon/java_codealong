package com.chiara.shape.perimeter;

public class Triangle extends Shape {
	
	 private double base;
	    private double height;
	    private double side1;
	    private double side2;
	    private double side3;

	    
	    
	    

	public Triangle(String color, double base, double height, double side1, double side2, double side3) {// get constructor
			super(color);
			this.base = base;
			this.height = height;
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		}

	@Override
	public void getArea() {
		System.out.println("Area of Triangle :" + 0.5 * base * height);

	}

	@Override
	public void getPerimeter() {
		System.out.println("Perimeter of Triangle :" + (side1 + side2 + side3));

	}

	
	public void printColor() {// method to get the color 
        System.out.println("Color: " + getColor());
    }
}
