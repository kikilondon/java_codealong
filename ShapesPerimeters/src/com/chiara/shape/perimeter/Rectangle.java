package com.chiara.shape.perimeter;

public class Rectangle extends Shape {
	
	private double length, width;
	
	
	

	public Rectangle(String color, double length, double width) {// constructor to get color from super class and other two property
		super(color);
		this.length = length;
		this.width = width;
	}

	@Override
	public void getArea() {
		
		System.out.println("Area of Rectangle :" + length * width);
		
		

	}

	@Override
	public void getPerimeter() {
		System.out.println("Perimeter of Rectangle :" + ((length * 2) + (width * 2)));

	}
	
	public void printColor() {// method to get the color 
        System.out.println("Color: " + getColor());
    }

}
