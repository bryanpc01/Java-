package exercises;

import java.text.DecimalFormat;

/*
 * File: TaxWhiz.java
 *
 * Description: This class stores a tax rate and
 *  computes the tax for a given purchase price.
 *
 * Assignment: 1) Add a method changeTax() that changes the current tax 
 *                rate by the amount in the parameter
 *             2) Add a main method
 *             3) In the main, create two instances of TaxWhiz with a tax 
 *                rates of 8.75 and 4.75 percent
 *             4) Compute the tax on two different purchases (one at the 
 *                8.75 and one at the 4.75 rates
 *             5) Print the total of two purchases, the total tax and the 
 *                total amount (purchases+tax)
 *                (try to make it look like a store receipt as best as you 
 *                can, this actually could take trial/error)
 *             6) Repeat steps 4) and 5) but first increment the tax rate 
 *                by 1.0 percentage point
 */

public class TaxWhizBryan {
	private double taxRate;

	/**
	 * TaxWhiz() constructor creates an object with
	 *  a given tax rate
	 * @param t -- the given tax rate
	 */
	public TaxWhizBryan (double t)
	{
		taxRate = t / 100;
	}

	/**
	 * calcTax() returns the tax for a given purchase
	 * @param purchase -- the given purchase price
	 */
	public double calcTax(double purchase)
	{
		return taxRate * purchase;
	}

	/**
	 * changeTax() changes the current tax
	 * @param t -- the change added to the current tax rate
	 */
	public void changeTax(double t)
	{
		taxRate += (t / 100);
	}

	public static void main(String[] args) {
		//create two instances 
		TaxWhizBryan Tax1 = new TaxWhizBryan(8.75);
		TaxWhizBryan Tax2 = new TaxWhizBryan(4.75);
		
		//compute tax on two different purchases
		
		double subTotal = 50.0; // The purchase price before tax.
		
		// Tax Calculations
		double tax8_75 = Tax1.calcTax(subTotal); 
		double tax4_75 = Tax2.calcTax(subTotal);
		
		//Total Price Calculations
		double total8_75 = subTotal + tax8_75;
		double total4_75 = subTotal + tax4_75;
		
		//To Format the doubles into ones with two decimal spaces. 
		DecimalFormat decimalFormat = new DecimalFormat ("#.00");
		
		//Converted SubTotal
		String subTotal_convert = decimalFormat.format(subTotal);
		
		//Converted Taxes
		String tax8_75_convert = decimalFormat.format(tax8_75);
		String tax4_75_convert = decimalFormat.format(tax4_75);
		
		//Converted Total
		String total8_75_convert = decimalFormat.format(total8_75);
		String total4_75_convert = decimalFormat.format(total4_75);
		
		//Print the store receipt for 8.75 tax
		System.out.println("First Purchase:----------------------------------------------- ");
		System.out.println("SUB-TOTAL: " + subTotal_convert + "\t\tTax1: \t" + tax8_75_convert + "\t(Tax is 8.75%)");
		System.out.println("\t\t\t\tTOTAL: \t" + (total8_75_convert));
		
		//Print the store receipt for 4.75 tax
		System.out.println("\nSecond Purchase:----------------------------------------------");
		System.out.println("SUB-TOTAL: " + subTotal_convert + "\t\tTax2: \t" + tax4_75_convert + "\t(Tax is 4.75%)");
		System.out.println("\t\t\t\tTOTAL: \t" + (total4_75_convert));
		
		//Now Increment the two tax rates by 1%
		Tax1.changeTax(1);
		Tax2.changeTax(1);
		
		// Tax Calculations
		tax8_75 = Tax1.calcTax(subTotal); 
		tax4_75 = Tax2.calcTax(subTotal);
				
		//Total Price Calculations
		total8_75 = subTotal + tax8_75;
		total4_75 = subTotal + tax4_75;
		
		//Converted Taxes
		String tax8_75_incremented_convert = decimalFormat.format(tax8_75);
		String tax4_75_incremented_convert = decimalFormat.format(tax4_75);

		//Converted Total
		String total8_75_incremented_convert = decimalFormat.format(total8_75);
		String total4_75_incremented_convert = decimalFormat.format(total4_75);

		//Print the store receipt for 8.75 tax
		System.out.println("\nThird Purchase:---------------------------------------------------------------");
		System.out.println("SUB-TOTAL: " + subTotal_convert + "\t\tTax3: \t" + tax8_75_incremented_convert + "\t(Tax is 8.75% incrmented by 1)");
		System.out.println("\t\t\t\tTOTAL: \t" + (total8_75_incremented_convert));
		// NOTE:::: Tax8_75 incremented is not rounding up when it should. I do not know why. 

		//Print the store receipt for 4.75 tax
		System.out.println("\nFourth Purchase:---------------------------------------------------------------");
		System.out.println("SUB-TOTAL: " + subTotal_convert + "\t\tTax4: \t" + tax4_75_incremented_convert + "\t(Tax is 4.75% incremented by 1)");
		System.out.println("\t\t\t\tTOTAL: \t" + (total4_75_incremented_convert));
	}
}
