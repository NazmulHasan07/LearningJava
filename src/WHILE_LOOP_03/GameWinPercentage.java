//**************************************************
// GameWinPercentage.java   Author: Nazmul Hasan
// Demonstrates how to use while Loop.
//**************************************************


package WHILE_LOOP_03;
import java.text.NumberFormat;
import java.util.Scanner;

public class GameWinPercentage {


	private static Scanner scan;

	public static void main (String[] args)
	{
		final int NUM_GAMES = 15;
		int won;
		double ratio;
		scan = new Scanner (System.in);
		System.out.print ("Enter the number of games won (0 to "
				+ NUM_GAMES + "): ");
		won = scan.nextInt();
		while (won < 0 || won > NUM_GAMES)
		{
			System.out.print ("Invalid input. Please reenter: ");
			won = scan.nextInt();
		}
		ratio = (double)won / NUM_GAMES;
		NumberFormat fmt = NumberFormat.getPercentInstance();
		System.out.println ();
		System.out.println ("Winning percentage: " + fmt.format(ratio));
	}
}