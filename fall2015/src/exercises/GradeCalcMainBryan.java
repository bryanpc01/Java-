package exercises;

/*
 * File: GradeCalcMain.java
 * Author: Java Java Java -
 * Description: This program creates a GradeCalcPanel and
 *  adds it to the Frame's content pane and sets its size.
 */

 // See GradeCalculator.java for instructions

import javax.swing.*;

public class GradeCalcMainBryan extends JFrame
{
    public GradeCalcMainBryan()
    {
        getContentPane().add(new GradeCalcPanelBryan());
        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation( EXIT_ON_CLOSE );
    } // GradeCalcFrame() constructor

    public static void main(String args[]){

		// change GUI so that it looks like Windows GUI, don't worry about this now
        try {
           UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        }
        catch (Exception e) {}

        GradeCalcMainBryan aframe = new GradeCalcMainBryan();
        aframe.setSize(650,75);
        aframe.setVisible(true);
    } // main()

} // GradeCalcMain class