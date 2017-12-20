package assignments;

import java.util.Scanner;

/**For this assignment you will create a Java class named Average that computes the average of a list of twenty numbers. The program should prompt the user to enter numbers from the keyboard, one at a time. If the user enters 9999, the program should stop early, compute the average, output it, and exit. Check for division by 0 when computing the average.
*	As an example of how the program should work:
*	(program output) Please enter up to 20 numbers, type 9999 to stop: 
*	(program output) Enter number 1: (user input) 10 <enter> 
*	(program output) Enter number 2: (user input) 20 <enter> 
*	(program output) Enter number 3: (user input) 30 <enter> 
*	(program output) Enter number 4: (user input) 9999 <enter> 
*	(program output) You entered 3 numbers , the average is: 20 <enter>
*/
public class AverageBryan {
	private int runningTotal = 0;
	
	private int numOfNumbers = 0;
	
	public int getRunningTotal() {
		return runningTotal;
	}

	public void addToRunningTotal(int addThis) {
		this.runningTotal += addThis;
	}

	public int getNumOfNumbers() {
		return numOfNumbers;
	}

	public void incrementNumOfNumbers() {
		this.numOfNumbers++;
	}
	
	public double getAverage(){
		return this.getRunningTotal() / this.getNumOfNumbers();
	}
	
	public static void main (String argv[]){
		
		Scanner a = new Scanner(System.in);
		AverageBryan avg1 = new AverageBryan();
		int userInput = 0;
		
		System.out.println("Please enter up to 20 numbers, type 9999 to stop: ");
		
		do
		{
		    
		    System.out.println("Enter number " + (avg1.getNumOfNumbers() + 1) + ": ");
		    userInput = a.nextInt();
		    
		    if (userInput == 9999){
		    	break;
		    }else{
		    	avg1.addToRunningTotal(userInput);
		    	avg1.incrementNumOfNumbers();
		    }
		    
		    
		}while(userInput != 9999 && avg1.getNumOfNumbers() < 20);
		
		
		if (avg1.getNumOfNumbers() == 0){
			System.out.println("Hey, next time add some numbers to the list. ");
		}else{
			System.out.println("You entered " + avg1.getNumOfNumbers() + " numbers, the average is " + avg1.getAverage());
		}
	}
}
