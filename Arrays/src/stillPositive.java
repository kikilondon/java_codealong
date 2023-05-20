

public class stillPositive {
	static int [] numbers = { 389, -447, 26, -485, 712, -884, 94, -64, 868, -776, 227, -744, 422, -109, 259, -500, 278, -219, 799, -311};
	static int [] positiveNum = new int [numbers.length];
	
	//Write a program that prints out all positive numbers of the following array:
	public static void main(String[] args) {
		
		//int[] array = getPositive(positiveNum);
		
		//System.out.println("Gotta stay positive ....!"+ "\n" + array.toString());
		
	
	
	
	//public static int[] getPositive(int[] numbers) {
		
		System.out.print("Gotta stay positive ...!");	
		for (int i =0; i< numbers.length; i ++) {
		 if (numbers[i]>0) {
			 
			
		positiveNum[i] = numbers[i];
		
		System.out.print(positiveNum[i]+ " ");
			 
		 }

		 
		
		}
		
		
		
		}
	}


