
//Make sure to create methods
//Create input function for 2D array
//Create display method: display 2D array
//Create another method which accepts 2D array as arg, return type: 2D array that is sum of the two matrices
//Assume both matrices are of equal size
//Call input function twice
//Call display function 3 times
//Display 1st and 2nd Array
//Display 3rd Array which is the sum of the 1st and 2nd Array


import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int rows, cols;
		// ask user to numbers of column and rows 
		System.out.println("Enter No of Rows in a Matrix : ");
		rows = scanner.nextInt();
		System.out.println("Enter No of Columns in a Matrix : ");
		cols = scanner.nextInt();
		
		//create 2 new arrays in which to store the new matrices
		int matrix1 [][] =inputMatrix(rows, cols);
		int matrix2 [][] =inputMatrix(rows, cols);
		
		//create an int third array which will store the sum of the two arrays
		//NB because this array will a parameter of the method sumMatrix, when the method will 
		//modify the array (sum) the changes will be updated in this instance too.
		
		int[][] sum = new int[rows][cols];
		sumMatrix(matrix1, matrix2, sum, rows, cols);
		
		//display the matrices and its sum
		
		System.out.println("Matrix 1: \n");
		displayMatrix(matrix1, rows, cols);
	
		System.out.println("Matrix 2: \n");
		displayMatrix(matrix2, rows, cols);
		
		System.out.println("Sum of Matrix1 and Matrix 2: \n");
		displayMatrix(sum, rows, cols);

		
		}
	
	
	//method to crete the first array 
    public static int[] [] inputMatrix(int rows, int cols) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int matrix [][] = new int[rows][cols];//declare new instance to store the matrix

			for (int row = 0; row < rows; row++) {//iterate through rows 

				for (int col = 0; col < cols; col++) {//iterate through rows 
					System.out.print("Enter Element at location :[" + row + "][" + col + "] : ");
					
					matrix[row][col] = scanner.nextInt();// the matrix will populate through from user input 
				}
			}

			
			return matrix;//return the matrix

		
		}
	       
 //method to sum the 2 matrices 
 
    public static int[][] sumMatrix(int[][] matrix1,int[][] matrix2,int sum [][], int rows,int cols) {
    	
		//the instance is already created in the main class 
		
		for(int row=0; row < rows; row++) {////iterate through rows 
			
			for(int col = 0; col < cols; col++) {//iterate through rows 
			
				sum[row][col] = matrix1[row][col] + matrix2 [row][col];//sum each number stored in rows and colon of matrix1 + each numbers stored in row and cols of matrix2 
			}
			
			
		}
		
		//logic for adding two matrix
		
		return sum;
	}
	
	public static void displayMatrix(int[][] matrix,int rows,int cols) {//display matrix;
		for (int row = 0; row < rows; row++) {
			
			for (int col = 0; col < cols; col++) {
				
				System.out.print(matrix[row][col]+"\t");//\t is an horizontal char. It creates a tabular spacing by inserting a horizontal tab.
			}
			System.out.println("");
		}
 }
}
