/**
 * Task 18
 * Refactoring of a program that acts a Rotation Polish Notation Calculator.
 * @author Kerusha Govender, 12 June 2019
 *
 */
class StackNode {
	//stacking objects into a linked pile
	public StackNode underneathValueOfStack; //by instantiating an object of this class, and passing it in the constructor you are saying that the underneathValueOfStack object (with data) lies underneath the new object, like a stack of clothes, one item is set to be underneathValueOfStack
	public double dataToBeStoredInStack;
//when you make an object of StackNode, you're going to get an object with a double variable and a link to an object below you	
	public StackNode(double dataToBeStoredInStack, StackNode underneathValueOfStack) { 
		this.dataToBeStoredInStack = dataToBeStoredInStack; //it passes the dataToBeStoredInStack it receives into the double variable
		this.underneathValueOfStack = underneathValueOfStack; //new object is passed and stored in underneathValueOfStack
	}
}