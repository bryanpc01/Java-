package exercises;
/*
 * File: Temperature.java
 *
 * Assignment: 1) Add two new methods:
 *                  incrementTemp()
 *                  decrementTemp()
 *                that increment and decrement the current temperature value 
 *                by one degree respectively
 *             2) Add a method: changeTemp( double t ) that adds t to the 
 *                current temperature
 *             3) Add a main() method to this class
 *             4) In the main method: create two instances of the Temperature 
 *                object each with a different
 *                temperature
 *             5) Call the getTemp() method in each of the temperature objects 
 *                and print the result to the users screen
 *             6) Call the incrementTemp(), decrementTemp() and changeTemp(t) 
 *                methods several times from the main() (use getTemp() to see 
 *                if the temperature did change)
 *             Remember that there should not be any print statements in the 
 *             Temperature class
 *
 * Description: This class stores the current temperature.
 * It contains access methods to set and get the temperature.
 *
 */

public class TemperatureBryan
{
    private double currentTemp;

    public TemperatureBryan(int i) {
    	this.setTemp(i);
	}

	/**
     * setTemp() sets the temperature to the given value
     * @param t -- the given value
     */
    public void setTemp(double t)
    {
        currentTemp = t;
    }

    /**
     * getTemp() returns the current temperature
     */
    public double getTemp()
    {
        return currentTemp;
    }

    /**
     * incrementTemp() returns the (new) current temperature
     */
    public double incrementTemp(){
    	setTemp(this.getTemp() + 1);
    	return currentTemp;
    }

     /**
	    * decrementTemp() returns the (new) current temperature
      */
    public double decrementTemp(){
    	setTemp(this.getTemp() - 1);
    	return currentTemp;
    }

     /**
      * changeTemp( double t ) adds t to current temperature and 
      * then returns the (new) temperature
      */
    public double changeTemp(double t){
    	setTemp(this.getTemp() + t);
    	return currentTemp;
    }
    public static void main(String [] args){
    	
    	//declare two new Temperature variables
    	TemperatureBryan Buffalo = new TemperatureBryan(22);
    	TemperatureBryan Miami = new TemperatureBryan(71);
    	
    	System.out.println("This is Buffalo's current temperature: " + Buffalo.getTemp());
    	System.out.println("This is Miami's current temperature: " + Miami.getTemp());
    	
    	Buffalo.incrementTemp();
    	System.out.println("\nBuffalo's Temperature has been incremented.\n");
    	
    	Miami.decrementTemp();
    	Miami.decrementTemp();
    	Miami.decrementTemp();
    	Miami.decrementTemp();
    	System.out.println("Miami's Temperature has been decremented 4 times.\n");
    	
    	
    	System.out.println("This is Buffalo's current temperature: " + Buffalo.getTemp());
    	System.out.println("This is Miami's current temperature: " + Miami.getTemp());
    	
    	System.out.println("\nI think Buffalo's is really 20 less than Miami's. This is why I used the changeTemp() method: \n");
    	
    	//need to subtract 20 from Miami but the function adds that value to Buffalo's current temp. So buffalo is subtracted too.
    	Buffalo.changeTemp((Miami.getTemp() - 20 - Buffalo.getTemp()));                                                                
    	
    	System.out.println("This is Buffalo's current temperature: " + Buffalo.getTemp());
    	System.out.println("This is Miami's current temperature: " + Miami.getTemp());
    	
    	System.out.println("\nOoops Buffalo and Miami is way to close. Need to decrement Buffalo and increment Miami.\n");
    	Buffalo.decrementTemp();
    	Miami.incrementTemp();
    	
    	System.out.println("This is Buffalo's current temperature: " + Buffalo.getTemp());
    	System.out.println("This is Miami's current temperature: " + Miami.getTemp());

    }
}// Temperature
