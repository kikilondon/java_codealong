package com.chiara.shape.perimeter;

public class Circle extends Shape {
	
	  private double radius;
	  
	  
	  

	public Circle(String color, double radius) {// constructor to get color from super class and other two property
		super(color);
		this.radius = radius;
	}

	@Override
	public void getArea() {
		System.out.println("Area of Circle :" + Math.PI * radius * radius);

	}

	@Override
	public void getPerimeter() {
		// TODO Auto-generated method stub
		System.out.println("Perimeter of Circle :" + 2 * Math.PI * radius);

	}
	
	public void printColor() {// method to get the color 
        System.out.println("Color: " + getColor());
    }

}
