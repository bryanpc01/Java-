package exercises;

import java.io.IOException;

/*
 * File: CubeUser.java
 *
 * Description: This class creates an instance of the Cube
 *  class and prints its area and volume.
 *
 * Assignment: 1) Create 3 cube objects. The size of each of the cubes 
 *                should be input from the keyboard
 *                (hint: study the code below)
 *             2) Print the Side length, Surface area and Volume to the 
 *                users screen for each of the cubes
 *             3) The program should catch input error exceptions and 
 *                deal with them in a reasonable manner
 *
 */

import java.util.Scanner;

public class CubeBryan
{
	private int side;

	public CubeBryan(int length) {
		side = length;
	}

	public int getLength(){
		return this.side;
	}
	
	public int calculateSurfaceArea(){
		
		return (6 * this.getLength() * this.getLength());
	}
	
	public int calculateVolume(){
		return (this.getLength() * this.getLength() * this.getLength());
	}

	/**
     * main() -- creates an instance of Cube and tests it
     */
    public static void main(String args[]) throws IOException
    {
        int length;

// HINT: input the side from the keyboard and check for errors and exceptions
        Scanner a = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
    		System.out.println("What is the length of the cube: ");
            length = a.nextInt();
	        
        	if (length == 0){
	        	throw new IOException("\nI cannot accept the value zero.");
	        }else if (length < 0){
	        	throw new IOException("\nI cannot accept negative values.");
	        }else{
	        	CubeBryan cube = new CubeBryan(length);
		        System.out.println("Side length of cube" + (i+1) +" is " + cube.getLength());
		        System.out.println("Surface Area of cube" + (i+1) +" is " + cube.calculateSurfaceArea ());
		        System.out.println("Volume of cube" + (i+1) +" is " + 	cube.calculateVolume()+"\n");
	        } 
        }
        a.close();
       
    } // main()
} // CubeUser