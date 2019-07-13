/*
 * Task 13.1
 * A program that reverses a string using recursion
 * Kerusha Govender, 8 June 2019
 */
public class StringReverse {
//This method takes in a string variable, checks if its empty
//If not it calls the method again and returns the minus the 1st letter. This process continues until the string is empty
//The 2nd part of the return statement, captures the 1st letter of the string, that was popped out by the 1st statement
//When the string is empty the 2nd part of the return statement fills up the empty string with all the letters it collected starting with the last letter
//Hence the string returned is a reverse of the original
	
	private static String reverseString (String stringInput) {
		if(stringInput.isEmpty()) {
			return "";
		}
		else {
			return reverseString(stringInput.substring(1)) + stringInput.charAt(0); 
		}
	}
//In the main method I declare/initialize a string variable and pass it to the method above, and the return outcome is printed
	public static void main(String[]args) {
		String stringInput = "god";
		System.out.println(reverseString(stringInput));
	}
}
