package com.chiara.shape.perimeter;

public abstract class Shape {
	
  public String color;//declare var
  
  
  public Shape(String color) {//constructor to pass the property color the sub-classes
	super();
	this.color = color;
}
  
  public String getColor() {//get color 
	return color;
}


// declaring empty methods
  public abstract void getArea();
  public abstract void getPerimeter();
  
}
