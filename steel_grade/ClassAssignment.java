import java.util.Scanner;

import javax.lang.model.element.Element;

public class ClassAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner scanner=new Scanner(System.in);
		int carbonContent;
		System.out.println("Enter a number for carbon content: ");
		carbonContent=scanner.nextInt();
		
		float hardness;
		System.out.println("Enter a number for hardness: ");
		hardness=scanner.nextFloat();
		
		int tensileStrenght;
		System.out.println("Enter a number for tensile strenght: ");
		tensileStrenght=scanner.nextInt();
		
		
		
		if (carbonContent < 5700) {
			System.out.println("Carbon Content must be greater then 5700");
		}
		else if(hardness > 0.7) {
			System.out.println("Hardness must be less then 0.7");
			
		}else if(tensileStrenght < 97) {
			
			System.out.println("Tensile Strength must be greater than or equal to 97");
			
		}
		
		if (carbonContent> 5700 &&  hardness < 0.7 && tensileStrenght >97 ) {
			System.out.println("The grade of the steel is: 10");
		}
		else if(carbonContent> 5700 &&  hardness <0.7) {
			System.out.println("The grade of the steel is: 9");
			
		}
		else if(hardness <0.7 && tensileStrenght >97) {
			System.out.println("The grade of the steel is: 8");
		}
		else if(carbonContent> 570 && tensileStrenght >97) {
			System.out.println("The grade of the steel is: 7");

        }
		else if(carbonContent > 570 && tensileStrenght >97) {
			System.out.println("The grade of the steel is: 6");
		}
        else if (carbonContent> 5700 ||  hardness <0.7 || tensileStrenght >97) {
        	System.out.println("The grade of the steel is: 5");
        }
        else if(! (carbonContent> 5700) && ! (hardness < 0.7) && !( tensileStrenght >97)) {
        	
        System.out.println("The grade of the steel is: 4");
        }
        	
        }
}
