package exercises;
/*
 * File: NumberCruncher.java
 *
 * Description: This class stores a number and contains
 *  methods to calculate the number's double, triple, and so on.
 *
 * Assignment: 1) add a new method cubeNumber() that returns the number^3 
 *                power (num*num*num)
 *             2) add a new method sixthNumber() that returns the number^6 
 *                power, but it can use only one multiplication in the 
 *                method (can't use num*num*num*num*num*num). Hint use the 
 *                other methods that are available - and do not use the 
 *                Math.pow() function
 *             3) Test cubeNumber() and sixthNumber() in the main method
 */

public class NumberCruncherBryan
{
    private double num;    // The instance variable

    /**
     * NumberCruncher() constructor creates an instance that
     *  stores the number given as its parameter
     * @param number -- the number that will be stored
     */
    public NumberCruncherBryan(double number)
    {
        num = number;
    }

    /**
     * getNum() returns the object's number
     */
    public double getNum()
    {
        return num;
    }

    /**
     * doubleNum() returns the object's number times 2
     */
    public double doubleNum()
    {
        return num * 2;
    }

    /**
     * tripleNum() returns the object's number times 3
     */
    public double tripleNum()
    {
        return num * 3;
    }

    /**
     * squareNum() returns the square of the object's number
     */
    public double squareNum()
    {
        return num * num;
    }

    /**
    *	add a new method cubeNumber() that returns the number^3 
    *   power (num*num*num)
    */
    public double cubeNumber()
    {
    	
    	return num * num * num;
    }
    
    /**add a new method sixthNumber() that returns the number^6 
     * power, but it can use only one multiplication in the 
     * method (can't use num*num*num*num*num*num).
     */
    public double sixthNumber()
    {
    	return (this.cubeNumber())*(this.cubeNumber());
    }
    
    /**
     * main() creates an instance of this class and tests its
        various methods
     */
    public static void main( String args[] )
    {
        NumberCruncherBryan cruncher1 = new NumberCruncherBryan(10);
        System.out.println("Value of num is " + cruncher1.getNum());
        System.out.println("num doubled is " + 	cruncher1.doubleNum());
        System.out.println("num tripled is " + cruncher1.tripleNum());
        System.out.println("num squared is " + cruncher1.squareNum());
        System.out.println("num cubed is " + cruncher1.cubeNumber());
        System.out.println("num sixthed is " + cruncher1.sixthNumber());

    } // main()
} // NumberCruncher