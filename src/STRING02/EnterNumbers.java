//**************************************************
// EnterNumbers.java   Author: Nazmul Hasan
// Demonstrates how to use string.
//**************************************************

package STRING02;

import  java.io.*; 

public class EnterNumbers {

	@SuppressWarnings("deprecation")
	public static void main(String args[]) throws IOException {
		DataInputStream inData = new DataInputStream(System.in);
		System.out.print("Please enter your favorite number : ");
		String   Number;
		Number= inData.readLine();
		System.out.print("Your number is : ");
		System.out.print(Number);
		 }
		}

