//************************************************************
//QuadraticRoots.java   Author: Nazmul Hasan
// Find out the Roots
//************************************************************

package Roots;

public class QuadraticRoots {

	public static void main(String[] args) {
		
		System.out.println("Roots Facts:");
		System.out.println("---------------------------------");
		System.out.println();
		
	      
        double A, B, C, firstRoot, secondRoot;
        
        A = -9.0;
        B = -6.0;
        C = 7.0;
      
        firstRoot = (-B + (Math.sqrt ((B * B) - 4*A*C)))/(2 *A);
        secondRoot = (-B - (Math.sqrt ((B * B) - 4*A*C)))/(2 *A);                           
      
        System.out.println("Coefficient A is " + A + ".");
        System.out.println("Coefficient B is " + B + ".");
        System.out.println("Coefficient C is " + C + ".");
        System.out.println("Root #1 is " + firstRoot + ".");
        System.out.println("Root #2 is " + secondRoot + ".");

	}

}
