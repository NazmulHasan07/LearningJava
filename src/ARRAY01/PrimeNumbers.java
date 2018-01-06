//**************************************************
// PrimeNumbers.java   Author: Nazmul Hasan
// Demonstrates how to use list for an array.
//**************************************************

package ARRAY01;

public class PrimeNumbers {

	public static void main(String[] args) {
		//**************************************************
		// I like to print some prime numbers in an array.
		//**************************************************
		int[] primeNums = {2, 3, 5, 7, 11, 13, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51};

		System.out.println ("Array length: " + primeNums.length);
		System.out.println ("Here are some prime numbers orderly:");
		for (int prime : primeNums)
			System.out.print (prime + " ");

		System.out.println();
		int[] primeNums1 = {53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91, 93, 95, 97, 99, 101};
		System.out.println ("\nAdditonal Array length: " + primeNums1.length);
		System.out.println ("Here are some additional prime numbers orderly:");
		for (int prime : primeNums1)
			System.out.print (prime + " ");

	}

}