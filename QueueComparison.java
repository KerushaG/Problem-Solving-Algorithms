
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
/**
 * Task 20.2
 * A program that computes the union, difference and intersection of two queues.
 * @author Kerusha Govender, 9 June 2019
 *
 */
public class QueueComparison {
	
	private static  PriorityQueue<String> queue1 = new PriorityQueue<String>(Arrays.asList("George","Jim","John","Blake","Kevin","Michael"));
	private static PriorityQueue<String> queue2 = new PriorityQueue<String>(Arrays.asList("George","Katie","Kevin","Michelle","Ryan"));
/**
 * This method adds all elements of the two queues initialized above in a newly initialized queue and prints them	
 */
	private static void union() {
		PriorityQueue<String> unionQueue = new PriorityQueue<String>();
		unionQueue.addAll(queue1);
		unionQueue.addAll(queue2);
		System.out.println("The union of the two queues is as follows: " + unionQueue);	
	}
/**
 * This method uses a for loop to go through each element in queue one, and checks if that string variable is also in queue 2
 * If so it is stored in a list 
 */
	private static void difference() {
		List<String> difList = new ArrayList<String>();
		for(String name: queue1) {
			if(!queue2.contains(name)) {
				difList.add(name);
			}
		}
		System.out.println("The difference between queue1 and queue2 is " + difList);
	}
/**
 * This method uses the same logic as the above method, except it stores the elements that both queues have in common in a list	
 */
	private static void intersection() {
		List<String> interList = new ArrayList<String>();
		for(String name: queue1) {
			if(queue2.contains(name)) {
				interList.add(name);
			}
		}
		System.out.println("Queue1 and queue2 both have the following elements in common: " + interList);
	}
/**
 * Each method is called with a resulting print statement	
 * @param args
 */
	public static void main(String[]args) {
		union();
		difference();
		intersection();
	}	
}


