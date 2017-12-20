package exercises;

/*
 * File: GradeCalcPanel.java
 * Author: Java Java Java  -
 * This class provides a user interface to
 * the GradeCalc class, which calculates a student's average
 * and letter grade for grades input into a JTextField.
 * The interface consists of input and output JTextFields and
 * and button to calculate the course average and letter grades.
 */

  // See GradeCalculator.java for instructions

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class GradeCalcPanelBryan extends JPanel implements ActionListener
{
    private JLabel prompt;           // GUI components
    private JTextField inputField;
    private JLabel resultLabel;
    private JTextField resultField;
    private JButton button;
    private JTextField resultsField2;
    private JLabel prompt2;
    private GradeCalculatorBryan calculator;  // The Calculator object

    public GradeCalcPanelBryan()
    {
       calculator = new GradeCalculatorBryan(); // Create a calculator instance
 // setLayout( new GridLayout(1,5,10,10));
    prompt = new JLabel("Grade:");
    prompt2 = new JLabel("NumOfGrades");
    resultLabel = new JLabel("Average:");
    inputField = new JTextField(10);
    resultsField2 = new JTextField(5);
    resultsField2.setEditable(false);
    resultField = new JTextField(20);
    resultField.setEditable(false);
    button = new JButton("Enter");
    button.addActionListener(this);

    add(prompt);
    add(inputField);
    add(button);
    add(resultLabel);
    add(resultField);
    add(prompt2);
    add(resultsField2);

    inputField.setText("");

    } // GradeCalcPanel()


    /**
     * actionPerformed() handles clicks on the button.
     *  It takes the data from the input JTextFields, and sends them to
     *  the GradeCalculater class to calculate a running average and
     *   computes the letter grade, which are displayed in TextFields.
     * @param e -- the ActionEvent the generated this system call
     */
    public void actionPerformed(ActionEvent e)
    {

      double grade = 0, ave;
        DecimalFormat df = new DecimalFormat("0.00");

        String inputString = inputField.getText();

        // HINT: use try/catch blocks to catch bad input to parseDouble()
        boolean gradeEntered = false;
        
        while (gradeEntered == false){
        	
        	inputString = inputField.getText();
        	
        	try {
        		grade = Double.parseDouble(inputString);
        		gradeEntered = true;
        	}catch(NumberFormatException e1){
        		continue;
        	}
        }
        

        inputField.setText("");

  // HINT: reject a bad grade in some way (the modified addGrade will return false
  // there is a problem with the grade

        calculator.addGrade(grade);

  // HINT: output grade count along with average and letter grade

        ave = calculator.calcAvg();
        String average = "" + df.format(ave);
        String letterGrade = calculator.calcLetterGrade();
        resultField.setText(average + " " + letterGrade);
        
        String count = "" + df.format(calculator.getCount());
        resultsField2.setText(count);
    } // actionPeformed()

} // GradeCalcPanel class