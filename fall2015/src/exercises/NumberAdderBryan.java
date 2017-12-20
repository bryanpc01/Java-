package exercises;
/*
 * File: NumberAdder.java
 *
 * Description: This class adds its two instance variables
 * when the getSum() method is called.
 *
 * Assignment: 1) Add a getDifference method (to subtract num1-num2)
 *             2) Add a getMult method to multiply the numbers
 *             3) Add a getDiv method to divide the numbers num1/num2 
 *                - check if num2 is not equal to 0.0 before division
 *                - if num2 is 0.0 return the value: Double.NaN
 *             4) Test the new methods in the main()
 */

public class NumberAdderBryan
{
    private double num1;
    private double num2;

    /**
     * setNums() sets the two instance variables from the given parameters
     * @param n1 -- one of the given numbers
     * @param n2 -- the second given number
     */
    public void setNums(double n1, double n2)
    {
        num1 = n1;
        num2 = n2;
    } // setNums()

    /**
     * getSum() returns the sum of the two instance variables
     */
    public double getSum()
    {
        return num1 + num2 ;
    } // getSum()

    /**
     * getDifference() returns the difference of the two instance variables
     */
    public double getDifference()
    {
        return num1 - num2 ;
    } // getDifference()
    
    /**
     * getMult() returns the product of the two instance variables
     */
    public double getMult()
    {
        return num1 * num2 ;
    } // getMult()
    
    /**
     * getDiv() returns the quotient of the two instance variables
     */
    public double getDiv()
    {
        if (num2 == 0){
        	return Double.NaN;
        }else {
        	return num1 / num2 ;
        }
    } // getDiv()
    
    /**
     * main() creates two instances of this class and tests its
     *  setNums() and getSum() methods
     */
    public static void main(String args[])
    {
        NumberAdderBryan adder1 = new NumberAdderBryan(); // Create two instances
        NumberAdderBryan adder2 = new NumberAdderBryan();
        adder1.setNums(10,15);                  // Set the instances' values
        adder2.setNums(100,200);
        System.out.println("Sum of adder1 " + adder1.getSum());  // Print the values
        System.out.println("Sum of adder2 " + adder2.getSum());
        
        // start of test 
        System.out.println("\nNow to check the new methods.");
        
        // create tester instances
        NumberAdderBryan tester2 = new NumberAdderBryan();
        NumberAdderBryan tester1 = new NumberAdderBryan();
        
        //set tester1 and tester2 values
        tester1.setNums(10, 5);
        System.out.println("\ntester1's num1 is " + tester1.num1 + " and num2 is " + tester1.num2 + ".");
        
        tester2.setNums(3, 0);
        System.out.println("tester2's num1 is " + tester2.num1 + " and num2 is " + tester2.num2 + ".\n");
        
        //test getDifference
        System.out.println("Difference of tester1 " + tester1.getDifference());
        System.out.println("Difference of tester2 " + tester2.getDifference());
        
        //test getMult
        System.out.println("\nMult of tester1 " + tester1.getMult());
        System.out.println("Mult of tester2 " + tester2.getMult());
        
        //test getDiv denominator non zero
        System.out.println("\nDiv of tester1 " + tester1.getDiv());
        //test getDiv denominator is zero
        System.out.println("Div of tester2 " + tester2.getDiv());
        
    } // main()
} // NumberAdder