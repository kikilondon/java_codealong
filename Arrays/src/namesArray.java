 import java.util.Scanner;

public class namesArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		
		System.out.println("Enter how many persons names you want to store : ");
	    int totalNames =scanner.nextInt();
		
		String [] strArrayStrings = null ;
		
		for(int index=0; index<totalNames; index++) {
			System.out.println("Enter "+(index+1)+" Person name : ");
			strArrayStrings[index]=scanner.next();
		}
		//System.out.println(strArrayStrings);
		
		
		for(int index=0;index < totalNames; index++) {
			System.out.println("Name of "+(index+1)+" person : "+ strArrayStrings[index]);
		}
//		
		

	}

}
