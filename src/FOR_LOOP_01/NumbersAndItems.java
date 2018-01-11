//**************************************************
// NumbersAndItems.java   Author: Nazmul Hasan
// Demonstrates how to use For Loop.
//**************************************************

package FOR_LOOP_01;

public class NumbersAndItems {

	public static void main(String args[]) {
		int [] numbers = {105, 165, 233, 277, 350, 469, 561, 687, 723, 846, 966, 1024};


		for(int X : numbers ) {
			System.out.println( X );
		}
		System.out.println();

		String [] items = {"Chair", "Table", "Bed", "Sofa", "Table Lamp", "Fan", "Door", "Night Stand", "Wall Clock", "Picture Frame", "Security Camera", "Bean Bag"};

		for( String item : items ) {
			System.out.println( item );
		}
	}
}

