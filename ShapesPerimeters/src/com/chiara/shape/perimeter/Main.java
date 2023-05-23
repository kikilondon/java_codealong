package com.chiara.shape.perimeter;

public class Main {

	public static void main(String[] args) {
		
		Square square = new Square(6, "Pink");
        square.getArea();
        square.getPerimeter();
        square.printColor();
        
        Rectangle rectangle = new Rectangle("Red", 23, 67);
        rectangle.getArea();
        rectangle.getPerimeter();
        rectangle.printColor();
        
        Triangle triangle = new Triangle("Blue", 23, 4, 44, 3, 23);
        triangle.getArea();
        triangle.getPerimeter();
        triangle.printColor();
        
        Circle circle = new Circle("Brown", 45);
        circle.getArea();
        circle.getPerimeter();
        circle.printColor();
        

        
	}

}
