import java.util.Scanner;
/**Task 3.2.
 * This program takes in 3 rows of 4 decimal or integer numbers from the user, stores it in a two dimensional array and calculates/prints the total of each column
 * @author Kerusha Govender, 4 June 2019
 */
public class TwoDimensionalArray {
//I put the row and column values in variables, for easier reading and to be accessible to other methods
	private static int rowLength = 3;
	private static int columnLength = 4;
/**
* Using scanner this method asks the user to enter 3 rows of 4 numbers and uses two for loops to store them in a two dimensional array, that I initialized 
* In the inner for loop nextDouble method is used to store each value the user entered in the twoDimensionalArray index address as determined by the loops	
*/	
	private void getUserTwoDimensionalArray() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter 3 rows of 4 numbers: ");
		double userTwoDimensionalArray[][] = new double [rowLength][columnLength];
		for(int i=0;i<rowLength;i++) { 
			for(int j=0;j<columnLength;j++) { 
				userTwoDimensionalArray[i][j] = userInput.nextDouble();
				}
			System.out.println();
		}
		userInput.close();
		calculateTotalOfEachColumn(userTwoDimensionalArray);
	}
/**
 * This method iterates through each column and accesses row values of each column of the two dimensional array
 * It uses a counter variable to add the total of each column and prints it
 * @param takes in a twoDimensionalArray from the method above
 */
	private void calculateTotalOfEachColumn(double userTwoDimensionalArray[][]) {
		for(int i=0; i<columnLength;i++) {
			double columnTotal = 0; //I initialise the variable here, so that every time a new column is iterated through the variable is valued at 0 again
			for(int j=0; j<rowLength;j++) {
				columnTotal += userTwoDimensionalArray[j][i];
			}
			System.out.println("The total of each column is: " + columnTotal);	//print statement after inner loop so that I get 4 print statements for 4 columns	
		}	
	}
/**
 * In the main  method I create an object of the class to access only one method which sets the whole process in motion
 * @param args
 */
	public static void main(String[] args) {
		TwoDimensionalArray calculateColumns = new TwoDimensionalArray();
		calculateColumns.getUserTwoDimensionalArray();
	}
}
