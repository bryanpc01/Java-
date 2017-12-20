package exercises;

/*
 * File: KeyBoardReader.java
 *
 */
 import java.io.*;

// See Box.java for instructions

public class KeyboardReaderBryan implements UserInterfaceBryan
{    private BufferedReader reader;

     public KeyboardReaderBryan() {
		 reader = new BufferedReader(new InputStreamReader(System.in));
     }

     public String getKeyboardInput() {
        return readKeyboard();
     }

     public int getKeyboardInteger() {
        return Integer.parseInt(readKeyboard());
     }

// HINT: add new method that limits input in range from Min to Max
//	 public int getKeyboardInteger(int min, int max) {}
//	    fill in rest, method should not return until the user entered number is within range
//		Prompt user with message if number is not within range before looping for another try.
//      Catch exceptions
     
     public int getKeyboardIntegerRange(int min, int max) {
    	 
    	 int num = this.getKeyboardInteger();
    	 while (num > max || num < min){
    		 System.out.println("You need to enter values between " + min + " and " + max + ".");
    		 System.out.println("Enter another number: ");
        	 num = this.getKeyboardInteger();
    	 }
    	 return num;
     }

    public double getKeyboardDouble() {
        return Double.parseDouble(readKeyboard());
    }

    public String getUserInput() {
        return getKeyboardInput();
    }

    public void prompt(String s) {
       System.out.print(s);
    }

    public void report(String s) {
       System.out.print(s);
    }

    public void display(String s) {
       System.out.print(s);
    }

    private String readKeyboard() {
       String line = "";
       try {
            line = reader.readLine();
       }
       catch (IOException e) {
            e.printStackTrace();
       }
       return line;
     }

}