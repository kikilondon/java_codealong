
public class simpleCombination {

	public static void main(String[] args) {
		//Combine the following 2 arrays into one large array. Then print out the whole new array.
		
		int[] firstHalf = {3, 7, 9, 10, 16, 19, 20, 34, 35, 45, 47, 49}; // 12 numbers
        int[] secondHalf = {51, 54, 68, 71, 75, 78, 82, 84, 85, 89, 91, 100}; // also 12!

        int[] wholeNumbers = new int[firstHalf.length + secondHalf.length]; // new array with final length
        int count = 0;//
        System.out.println("All together now!:\n");
        
        for(int i = 0; i < firstHalf.length; i++) { 
            wholeNumbers[i] = firstHalf[i];
            count++;
         } 
        
        for(int j = 0; j < secondHalf.length;j++) { 
            wholeNumbers[count++] = secondHalf[j];
         } 
        
        for(int i = 0;i < wholeNumbers.length;i++) System.out.print(wholeNumbers[i]+" ");

    }



	}


