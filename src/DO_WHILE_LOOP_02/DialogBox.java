//**************************************************
// DialogBox.java   Author: Nazmul Hasan
// Demonstrates how to use Do While Loop.
//**************************************************

package DO_WHILE_LOOP_02;

import javax.swing.JOptionPane;

public class DialogBox {

	//***********************************************************
	// Determines if the value input by the user is even or odd.
	// Uses multiple dialog boxes for user interaction.
	//***********************************************************

	public static void main (String[] args)
	{
		String numStr, result;
		int num, again;
		do
		{
			numStr = JOptionPane.showInputDialog ("Enter an integer: ");
			num = Integer.parseInt(numStr);
			result = "You enter the number which is " + ((num%2 == 0) ? "even" : "odd");
			JOptionPane.showMessageDialog (null, result);
			again = JOptionPane.showConfirmDialog (null, "Do you like to try again?");
		}
		while (again == JOptionPane.YES_OPTION);
	}
}
