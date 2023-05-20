
import java.util.Random;
public class HiddenNuts {

	public static void main(String[] args) {
		

		//declare array with fix length
		String[] hidingSpots = new String[100];
		//create an instance of random 
		Random squirrel = new Random();
		//generate random index in which Nut is stored 
	     int nutIndex =  squirrel.nextInt(hidingSpots.length);
	   
	     // assign "Nut" value to this random index number 
	     hidingSpots[nutIndex]= "Nut";
	   
	    

	    
	     System.out.println("The nut has been hidden ...");

	    //iterate true the hidden spots array
	    for ( int i = 0; i < hidingSpots.length; i++) {
	    	
	    	// the index has something and the index is euqls to Nut
	    	if (hidingSpots[i] != null &&  hidingSpots[i].equals("Nut")){
	    		System.out.println("Found it! It's in spot " + i + "!");// print out the index number
	    		break;//add break to stop the for loop 
	    		
	    		
	    	}
	    }
	}
}
