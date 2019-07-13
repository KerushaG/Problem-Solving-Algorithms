import java.util.Scanner;
import java.util.Arrays;

public class CompareUserArrays {
/**Task 3.1
* This program asks the user for a set of 5 numbers twice, stores them in an array and then compares the array to see if the user's numbers in each array are the same
* @author Kerusha Govender, 4 June 2019
*
*/

/**
* This method creates the object scanner to take in a users set of numbers, which is 5 and stores them in a variable initialised as an array of size 5
* To ensure every number is stored in the array I used a for loop calling nextInt method and storing it in the array using i as an index for the array	
* @return userInput which is the final array
*/
	private static int[] getUserArray() {
		Scanner inputArray = new Scanner(System.in);
		System.out.println("Enter one set of 5 numbers: ");
		int[] userArray = new int[5];
		for (int i=0;i<5;i++) {
			userArray[i] = inputArray.nextInt();
		}
		return userArray;
		}
	
/**
* This method takes in two arrays as a parameter. It calls the method Arrays.equals to compare the size, contents and order of the two arrays passed into the method, storing 
* it in a boolean variable which will hold the value of true or false, but instead of printing true or false 
* I use if/else statements to indicate whether the arrays are identical or not	
* @param array1
* @param array2
*/
	private static void compareUserArrays(int[] array1, int[] array2) {
		Boolean answer = Arrays.equals(array1, array2); 
		if(answer) {
			System.out.println("The two arrays are identical");	
		}
		else {
			System.out.println("The two arrays are NOT identical");
		}
	}
/**
 * I could have done it in an alternative way (as suggested by Daniel) which I commented out; initialize the 2 arrays and call the getUserArray method directly
 * then just have the compareUserArrays method
 * I did it this way so that if you wanted to change the program to ask the user and compare more than two arrays you could easily adjust the program
 * Because the for loop controls how many times you ask the user for an array
 * @param args
 */
	public static void main(String[]args) {
		int[] array1 = null;
		int[] array2 = null;
		for(int i=1;i<=2;i++) {
			int[] temporaryArray = getUserArray();
			if(array1 == null) {
				array1 = temporaryArray;
			}
			else {
				array2 = temporaryArray;
			}
		}
		compareUserArrays(array1, array2);
	}
//	public static void main(String[]args) {
//		
////	int[] array1 = getUserArray();
////	int[] array2 = getUserArray();
//		compareUserArrays(array1, array2);
//	}
}
