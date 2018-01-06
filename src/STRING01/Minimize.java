//**************************************************
// Minimize.java   Author: Nazmul Hasan
// Demonstrates how to use string.
//**************************************************

package STRING01;

import  java.io.*; 

public class Minimize {


	public static void main(String args[])throws IOException {
		char Ch;
		System.out.print("Enter the character ('M' to minimize) : ");
		do{
			Ch = (char)System.in.read();
			System.out.print(Ch);
		}while(Ch != 'M');
		System.out.print("Program minimized.");
	}
}