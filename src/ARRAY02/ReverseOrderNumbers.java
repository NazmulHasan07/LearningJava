//**************************************************
// ReverseOrderNumbers.java   Author: Nazmul Hasan
// Demonstrates array index processing.
//**************************************************

package ARRAY02;

import java.util.Scanner;

public class ReverseOrderNumbers {

	public static void main(String[] args) {

		//***********************************************************
		// Reads a list of numbers from the user, storing them in an
		// array, then prints them in the opposite order.
		//***********************************************************
		
		Scanner scan = new Scanner (System.in);
		double[] numbers = new double[8];
		System.out.println ("The memory size of the array: " + numbers.length);
		for (int index = 0; index < numbers.length; index++)
		{
			System.out.print ("Enter the number here " + (index+1) + ": ");
			numbers[index] = scan.nextDouble();
		}
		System.out.println ("Here is the numbers printed reverse order:");
		for (int index = numbers.length-1; index >= 0; index--)
			System.out.print (numbers[index] + " ");
	}

}
