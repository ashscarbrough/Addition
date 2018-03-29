/*
 * 	Author: 	Ash Scarbrough with code adapted from Deitel's Java Textbook Figure 2.7
 *  Date:		7/17/2016
 *  Assignment:	Homework Assignment #2
 *  Class:		CSCI-C490 (Advanced Java)
 *  Function: 	Addition program that inputs two numbers then displays their sum.
 */
import javax.swing.JOptionPane; //Program uses Java Pane for dialog boxes

public class Addition
{
	// main method begins execution of Java application
	public static void main(String[] args)
	{
		String number1String, number2String; // String declarations to store user input
		int number1, number2, sum; // declarations for user provided numbers (1 & 2) and sum

		number1String = JOptionPane.showInputDialog("Enter first integer:"); // prompt user for number1
		number1 = Integer.parseInt(number1String); // User provided string is parsed into int

		number2String = JOptionPane.showInputDialog("Enter second integer:"); // prompt user for number2
		number2 = Integer.parseInt(number2String); // // 2nd user provided string is parsed into int

		sum = number1 + number2; // add numbers, then store total in sum
		JOptionPane.showMessageDialog(null, "Sum is " + sum); // display sum via Java Pane
	} // end method main
} // end class Addition






