//**************************************************
// Stars.java   Author: Nazmul Hasan
// Demonstrates how to use For Loop.
//**************************************************

package FOR_LOOP_03;

public class Stars {

	public static void main(String[] args) {
		final int MAX_ROWS = 20;
		for (int row = 1; row <= MAX_ROWS; row++)
		{
			for (int star = 1; star <= row; star++)
				System.out.print ("*");
			System.out.println();
		}
	}
}
