//**************************************************
// ReverseNumber.java   Author: Nazmul Hasan
// Demonstrates how to use Do While Loop.
//**************************************************

package DO_WHILE_LOOP_03;
import java.util.Scanner;

public class ReverseNumber {

	private static Scanner scan;

	public static void main(String[] args) {
		int number, lastDigit, reverse = 0;
		scan = new Scanner (System.in);
		System.out.print ("Enter a positive integer: ");
		number = scan.nextInt();
		do
		{
			lastDigit = number % 10;
			reverse = (reverse * 10) + lastDigit;
			number = number / 10;
		}
		while (number > 0);
		System.out.println ("That number reversed is " + reverse);
	}
}
