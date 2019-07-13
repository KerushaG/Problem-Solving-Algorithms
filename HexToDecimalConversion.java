import java.util.Scanner;
/**
 * Task 15.2
 * @author Kerusha Govender, 8 June 2019
 *
 */
public class HexToDecimalConversion {
/**Takes a string variable
 * Starts a for loop to loop as many times as the string variable
 * Uses in for loop as index to access specific elements at a time in the string and stores it in a char variable
 * @param hex
 * @return
 */
	public static int hexToDecimal (String hex) {
	int decimalValue = 0;
	for(int i=0;i<hex.length();i++) {
		char hexChar = hex.charAt(i); //I am going to assess each char variable to see if its within the hex range
		if(hexChar>'F') { //I added a condition here to throw an exception if the char variable has a letter that's over F
			throw new NumberFormatException("The string is not a hex"); //if any letter that's not in the A-F range, I assume the whole string will not be a hex
		}
		else {
			checkCharForDigit(hexChar); //I call a method to check if the char is within the 0-9 range, if so the below code will be executed
		}
		//if the char variables make it past the throw exceptions the code below will execute with no hassle
		decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar); //each value in the string variable stored in the char variable is sent to this method
		//and is added to an int variable multiplied by 16, and the result becomes the new int variable ready to be used for the next iteration 
		}
	return decimalValue; // and returns final value	
	}
/**
 * This method takes in a char variable from the above method, checks if the value is a digit
 * If true, the char is cast to an int
 * Then in an if statement I check if that value is above 9 or below 0 (if it were I assume the string would not be a hex)
 * If it is true then an exception is thrown
 * @param hexChar
 */
	public static void checkCharForDigit(char hexChar) { 
		if(Character.isDigit(hexChar)) {
			int numChar = Character.getNumericValue(hexChar);  
			if(numChar<0||numChar>9) {
				throw new NumberFormatException("The string is not a hex");
			}
		}
	}
/**
 * Each char variable is checked if its a letter between the range of hex letters; 
 * if it is then 10 is added to the remainder of the letter - A, which is the number difference between those letters 	
 * If it's a number that -0 is returned as an int
 * @param ch
 * @return int value returned
 */
	public static int hexCharToDecimal(char ch) {
		if(ch>='A' && ch<='F') {
			return 10 + ch - 'A';
		}
		//else // ch is '0', '1', ..., or '9'
		return ch - '0';
	}
/** Main method */
//The user's input is stored in hex variable
//The print statement, converts hex contents to Uppercase letters, and passes hex to a method
	public static void main(String[]args) {
		Scanner input = new Scanner (System.in);
	// Prompt the user to enter a string
		System.out.print("Enter a hex number: ");
		String hex = input.nextLine();
		System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
		input.close();
	}
}	
