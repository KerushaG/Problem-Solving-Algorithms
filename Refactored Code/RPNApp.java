import java.util.Scanner;
/**
 * Task 18
 * Refactoring of a program that acts a Rotation Polish Notation Calculator.
 * @author Kerusha Govender, 12 June 2019
 *
 */
/*
 * This class is responsible for constructing the calculator and interacting with the user
 */
public class RPNApp {
/**
 * 	This method asks the user on a loop for an expression (unless they quit) to calculate
 * (enter digits with space in between and then the calculation symbol at the end thats the only way it works)
 * Creates a RotationPolishNotation object and calls its main method to pass the user's input to and process
 */
	public static void takeUserInput() {
		Scanner input = new Scanner(System.in); 
		RotationPolishNotation userCalc = new RotationPolishNotation(); 
		while(true) { 
			System.out.println("Enter a Rotation Polish Notation expression or \"quit\".");
			String usersInputedCalc = input.nextLine();
			String testForQuitOrContinue = usersInputedCalc.toLowerCase(); //In case they type in capital, not sure how to protect it against gibberish input
			if(testForQuitOrContinue.equals("quit")) {
				break;
			} 
			else {
				
				System.out.printf("Answer is %f\n", userCalc.performCalculation(usersInputedCalc)); //uses object to call method from the class of RotationPolishNotation and prints answer
			}
				}
		input.close();
	}
	public static void main(String args[]) {
		takeUserInput();	
	}
}
