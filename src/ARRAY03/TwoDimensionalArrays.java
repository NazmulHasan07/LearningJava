//********************************************************************
// TwoDimensionalArrays.java    Author: Nazmul Hasan
// Demonstrates the use of a two-dimensional array.
//********************************************************************

package ARRAY03;

public class TwoDimensionalArrays {

	//**********************************************************************
	// Creates a TwoDimensionalArrays of integers, fills it with increasing
	// integer values and then prints them in a table.
	//**********************************************************************
	public static void main (String[] args)
	{

		int[][] table = new int[4][8];
		// Store the table with integer values
		for (int row=0; row < table.length; row++)
			for (int col=0; col < table[row].length; col++)
				table[row][col] = row * 8 + col;
		
		// Print the expected table
		for (int row=0; row < table.length; row++)
		{
			for (int col=0; col < table[row].length; col++)
				System.out.print (table[row][col] + "\t");
			System.out.println();


		}
	}
}
