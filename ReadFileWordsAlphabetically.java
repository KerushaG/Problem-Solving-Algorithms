
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
/**
 * Task 20.1
 * A program that reads a file and prints all the words in alphabetical order
 * @author Kerusha Govender, 9 June 2019
 *
 */
public class ReadFileWordsAlphabetically {
	
	private PriorityQueue<String> wordQueue;
/**
 * This method reads the file word by word in a while loop, stores it in a string variable, 
 * casts that string to lowercase and adds it to a list Array, so that it can just pass it to the method that constructs a priority queue and orders it in one go
 */
	private void readLinesInFile() {
		try {
			File readInput = new File("C:\\Users\\Kerusha\\Dropbox\\Kerusha Govender-31046\\Introduction to Software Engineering\\Task 20\\Words.txt"); // placed this file in my eclipse project
			Scanner scan = new Scanner(readInput);
			List<String> wordFileList = new ArrayList<String>();
			while(scan.hasNext()) { 
				String fileContent = scan.next(); //stores each line in variable
				String lowerCaseWord = fileContent.toLowerCase(); //cast to lowercase because it sorts by uppercase words first then lowercase words
				wordFileList.add(lowerCaseWord);
			}
			System.out.println(Arrays.toString(wordFileList.toArray()));
			createWordQueue(wordFileList);
			scan.close(); 
		}
		catch(Exception e) { //general exception so I can close the writer file after the loop
			System.out.println("Error");
		}
	}
/**
 * 	I just give an Array list to this method to construct a priority queue and print the queue out alphabetically word by word
 * @param wordFileList
 */
	private void createWordQueue(List<String> wordFileList) {
		wordQueue = new PriorityQueue<String>(wordFileList);
		//System.out.println(wordQueue); doesn't print in natural order
		while(wordQueue.size()>0) {
			System.out.print(wordQueue.remove() + " "); //only shows natural order in this way
		}
	}
			
	public static void main(String[]args) {
		ReadFileWordsAlphabetically fileOfWords = new ReadFileWordsAlphabetically();
		fileOfWords.readLinesInFile();
	}
}
