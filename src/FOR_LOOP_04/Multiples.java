//**************************************************
// Multiples.java   Author: Nazmul Hasan
// Demonstrates how to use For Loop.
//**************************************************

package FOR_LOOP_04;
import java.util.Scanner;


public class Multiples {

	private static Scanner scan;

	public static void main(String[] args) {
		final int PER_LINE = 10;
		int value, limit, mult, count = 0;
		scan = new Scanner (System.in);
		System.out.print ("Enter a positive value: ");
		value = scan.nextInt();
		System.out.print ("Enter a value limit: ");
		limit = scan.nextInt();
		System.out.println ();
		System.out.println ("The multiples of " + value + " between " +
				value + " and " + limit + " (inclusive) are:");
		for (mult = value; mult <= limit; mult += value)
		{
			System.out.print (mult + "\t");
			// Print a specific number of values per line of output
			count++;
			if (count % PER_LINE == 0)
				System.out.println();
		}
	}
}
