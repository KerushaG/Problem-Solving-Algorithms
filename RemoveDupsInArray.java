/**
 * Task 4
 * @author Kerusha Govender, 3 June 2019
 * A program that takes in an array containing duplicates and returns an array without duplicates.
 */
public class RemoveDupsInArray {
	
	private int newArrayLength = 0;
//method to print the arrays in its varying stages of manipulation	
	private void printArrays(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println(); //to ensure it doesn't all end up on one line
	}
//method checks whether each value in the makeNoDuplicatesArray method already exists in the noDuplicatesArray (the new array), the assessment is either true or false
	private boolean checkForDuplicate(int[]noDuplicatesArray, int arrayValue) {
		
		int length = noDuplicatesArray.length;
		for(int i=0;i<length;i++) {
			if(noDuplicatesArray[i] == arrayValue) {
				return true;
			}
		}
		return false;
	}
//stores each value of original array in a variable, declares a new array and adds values from the original array without the duplicates, to the new array
//uses method above to ensure no duplicates get added
	private void makeNoDuplicatesArray(int[]arrayWithDuplicates) {
	
		int length = arrayWithDuplicates.length;
		int[] noDuplicatesArray = new int[length];
		for(int a =0;a<length;a++) {
			int arrayValue = arrayWithDuplicates[a];
			if(!checkForDuplicate(noDuplicatesArray, arrayValue)) { //if the value is not in the new array add the value to the new array
				noDuplicatesArray[newArrayLength] = arrayValue;
				newArrayLength++; //this variable keeps track of how many original values are being added to the new array 
				//so I can keep track of what the array size should be versus the original array size with empty spaces
			}
		}
		printArrays(noDuplicatesArray);
		removeZerosFromArray(noDuplicatesArray); //but because the new array is still the same size as the original array and thus the empty spaces are represented by zeros
		//I call another method to ensure that only the final array has only numbers and no empty spaces
	}
//Here I can create the final array with the size of newArrayLength, which kept track of how many non-duplicate integers were being added
	private void removeZerosFromArray(int[]noDuplicatesArray) {
		
		int[] finalArray = new int[newArrayLength];
		for(int i=0;i<newArrayLength;i++) {
			finalArray[i] = noDuplicatesArray[i];
		}
		printArrays(finalArray); //in the final array no zeros appear even though in the example there are two zeros, I think this is because they might just be empty spaces
	}
//I create a class object to access methods, store an array with duplicates, call print method to print and then pass one value to get the final array without duplicates	
	public static void main(String[]args) {
		
		RemoveDupsInArray arrayWithDups = new RemoveDupsInArray();
		int [] arrayWithDuplicates = {20,100,10,80,70,1,0,-1,2,10,15,300,7,6,2,18,19,21,9,0};
		arrayWithDups.printArrays(arrayWithDuplicates);
		arrayWithDups.makeNoDuplicatesArray(arrayWithDuplicates);	
	}
}
