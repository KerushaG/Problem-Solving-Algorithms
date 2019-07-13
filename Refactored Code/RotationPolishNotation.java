import java.util.Scanner;
/**
 * Task 18
 * Refactoring of a program that acts a Rotation Polish Notation Calculator.
 * @author Kerusha Govender, 12 June 2019
 *
 */
class RotationPolishNotation {
	//with the object of this class comes an object of StackNode and its value and stack attribute
	private StackNode latestValueOnStack; 
	private double value1ForCalc, value2forCalc; // to be used in methods of the class
	
	public RotationPolishNotation() { 
		latestValueOnStack = null; //initialized latestValueOnStack as empty, to ensure accuracy in return calculations
	}
/**
 * This method is sort of stacking new objects of values from the bottom up, with the latest value on top 	
 * @param newValueToBeStoredInStack
 */
	public void putValueInStack(double newValueToBeStoredInStack) {  
		StackNode newNodeStack = new StackNode(newValueToBeStoredInStack, latestValueOnStack); //creates a StackNode object
		latestValueOnStack = newNodeStack; //latestValueOnStack object then becomes the new object on top
	}
/*
 * Not 100% sure but I think this method takes one object out and makes the object underneath it the new top object on the pile, 
 * With its corresponding values
 * The double variable returned is basically the top most value on the stack thats returned
 */
	public double takeValueOutOfStack() { 
		double valueOnTopOfStack = latestValueOnStack.dataToBeStoredInStack; //swaps the dataToBeStoredInStack from the latestValueOnStack object into the double variable
		latestValueOnStack = latestValueOnStack.underneathValueOfStack; //latestValueOnStack then becomes the new underneathValueOfStack object and
		return valueOnTopOfStack; //double variable is returned
	}

/**
 * Separated all calculations into methods of their own
 */
	public void sumCalc() {
		value2forCalc = takeValueOutOfStack(); //this method takes the latest value out of the stack and stores it into b
		value1ForCalc = takeValueOutOfStack();//likewise for a
		putValueInStack(value1ForCalc + value2forCalc); //adds the 2 values and puts them in the stack again - same for all other calculation methods
		
	}
	
	public void subCalc() {
		value2forCalc = takeValueOutOfStack();
		value1ForCalc = takeValueOutOfStack();
		putValueInStack(value1ForCalc - value2forCalc);
	}
	
	public void multiCalc() {
		value2forCalc = takeValueOutOfStack();
		value1ForCalc = takeValueOutOfStack();
		putValueInStack(value1ForCalc * value2forCalc);
	}
	
	public void diviCalc() {
		value2forCalc = takeValueOutOfStack();
		value1ForCalc = takeValueOutOfStack();
		putValueInStack(value1ForCalc / value2forCalc);
	}
	
	public void powCalc() {
		value2forCalc = takeValueOutOfStack();
		value1ForCalc = takeValueOutOfStack();
		putValueInStack(Math.pow(value1ForCalc, value2forCalc));
	}
/**
 * This method takes in the string input of the user, iterates through every char in the string, assessing what its part of, a digit or a symbol
 * And calling the relevant methods to pass the pieces to for further calculation	
 * @param calcExpression
 * @return
 */
	public double performCalculation(String calcExpression) { 
		for(int i = 0; i<calcExpression.length(); i++) {
			if(Character.isDigit(calcExpression.charAt(i))) { //if the char is a digit it gets cast into a double and put on the stack
				double numToGoInStack;
				String tempString = "";
				for(int j = 0; (j < 100 ) && (Character.isDigit(calcExpression.charAt(i))|| (calcExpression.charAt(i) == '.')); j++, i++) { // couldn't really figure out what this loop is for
					tempString = tempString + String.valueOf(calcExpression.charAt(i));
					}
				numToGoInStack = Double.parseDouble(tempString); 
				putValueInStack(numToGoInStack); //number gets put on latestValueOnStack of the stack
			} 
			else if(calcExpression.charAt(i) == '+') { 
				sumCalc();
			} 
			else if(calcExpression.charAt(i) == '-') {
				subCalc();
			} 
			else if(calcExpression.charAt(i) == '*') {
				multiCalc();
			} 
			else if(calcExpression.charAt(i) == '/') {
				diviCalc();
			}
			else if(calcExpression.charAt(i) == '^') {
				powCalc();
			} 
			else {  //is the ' ' necessary cant it just be else
				throw new IllegalArgumentException( );
			}
		} // for loop ends here
		double answerForUser = takeValueOutOfStack(); //gets the remaining value out of the stack - basically the answer to the user's input
		if(latestValueOnStack != null) {
			throw new IllegalArgumentException( ); //if there's still more stuff in the stack, then you don't have a valid calculation or you won't get access to the answer
		}
		return answerForUser; //the answer is returned to wherever this method was called
	}
}