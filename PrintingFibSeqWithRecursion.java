/**
 * Task 13.2
 * A program that prints the 1st n numbers of the fibonacci sequence; using recursion.
 * @author Kerusha Govender, 8 June 2019
 *
 */
public class FibonacciSequence {
/**
 * This method takes in a count which represents number n of the sequence i.e. 1st value, 2nd value, 3rd value, etc up until n
 * If that count is below 2, it returns one 
 * Which gets printed in the main method
 * If the count is higher it calls the method in a sum combination
 * The return of the method with count -1 as a parameter + the method with count -2 as a parameter will give the rest of the values for each count
 * Up until n
 * @param count
 * @return values of each fib sequence
 */
	private int valueOfFibonacciSequence(int count) {
		if(count < 2) {
			return 1;
		}
		else {
			return valueOfFibonacciSequence(count -1) + valueOfFibonacciSequence(count-2);
		}
	}
//n represents where you want the sequence to stop
//in the for loop I put a count starting from 0 and stopping at (n-1)
//I pass the count in the for loop to the method above
//The method above is called n times so I get the value of each sequence
	public static void main(String[]args) {
		FibonacciSequence printSequence = new FibonacciSequence();
		int n = 100;
		for(int count=0;count<n;count++) {
			System.out.print(printSequence.valueOfFibonacciSequence(count) + " ");
		}	
	}
}

//public static int fibonacci(int n)  {
//    if(n == 0) {
//    	//System.out.println(n);
//        return 0;
//    } else if(n == 1) {
//    	 return 1;
//    } else {
//    	//System.out.println("Do you c ome here");
//    	return fibonacci(n - 1) + fibonacci(n - 2); 
//   }
//      
//}
//
//
//public static void main(String[] args) {
//	for(int i = 1 ; i <= 7; i++){
//		System.out.println(fibonacci(i));
//	}
//	
//}
