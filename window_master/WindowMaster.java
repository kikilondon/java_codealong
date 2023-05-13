import java.util.Scanner;

public class WindowMaster {

	public static void main(String[] args) {
		
		
		// declare empty variables 
     int height ;
	 int  width  ;
	 String stringHeight;
	 String  stringWidth;
	 
	 
	 //ask userInput
	
	 Scanner myScanner = new Scanner(System.in);
	 System.out.println("Please enter the window heigth:");
	 stringHeight = myScanner.nextLine();
	
	 
	 System.out.println("Please enter the window width:");
	 stringWidth = myScanner.nextLine();
	 
	 
 //covert strings into floats
	 
	 height = (int) Float.parseFloat(stringHeight);
	 width  = (int) Float.parseFloat(stringWidth);	
	 
	 float areaWindow;
	 float perimeterWindow;
	 float totalCost;
	 
	 System.out.println("Window heigth: " + height);
	 System.out.println("Window width: " + width);
	 
	 areaWindow = height * width;
	 System.out.println("The area of your window is: " + areaWindow + " feet");
	 
	 perimeterWindow = (height + width) *2;
	 System.out.println("The perimeter of your window is: " + perimeterWindow + " feet");
	
	 
	 
	 
	 totalCost = (3.50f * areaWindow) + (perimeterWindow * 2.25f);
	 System.out.println("The total cost of your window is: " + totalCost + " pounds");
	 
	

	}

}
